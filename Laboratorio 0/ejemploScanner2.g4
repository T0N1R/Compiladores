grammar ejemploScanner2;

fragment LETTER: ('A'..'Z' | 'a' .. 'z' | '_' | '@' | '!' | '~') ; 

fragment DIGIT: '0' .. '9';


ID                  : LETTER (LETTER|DIGIT)*;
NUM                 : DIGIT (DIGIT)*;
STRING  :       '"' ('A'..'Z' | 'a' .. 'z' | ' ' | '0'..'9' | '.' | ',' | '\\' | '\n')* '"' 
        ;

COMENTARIO      :       '(*' (ID | NUM | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' | '\t' | '\r' | '\n')* '*)' -> skip
                ;

LCOMENTARIO     :       '--' (ID | NUM | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' )* -> skip
                ;

// \t = tab
// \r = carriage  return
// \n = newline
DELIMITER       :       [ \t\r\n]+ -> skip;
QUOTES          :       '"';
APOSTROPHE      :       '\'';
CHAR_LITERAL    :       ('"' ( LETTER ) '"') | (APOSTROPHE ( LETTER ) APOSTROPHE);
PARENTESIS      :       '('
                |       ')'
                ;


start   :       (COMENTARIO | clase)*
        ;

// clase puede ser un class ID como "class Comic", "class Comic inherits <otra clase>"
// "class Main que puede o no puede tener un inherit a una o varias librerias
// estas opciones de clase tambien tienes una declaracionClase que se explica a continuacion
clase   :       'class' ID  '{'  (contenidoClase)   '};'
        |       'class' ID 'inherits' (ID) '{'  (contenidoClase)   '};'
        ;

declaracionMetodo       :       ID '(' ')' ':' (tipoVariable | ID) '{' ID '};'
                        |       '(' ID ID ':' tipoVariable ID '{' declaracionOperacion  '}' ')'
                        |       ID '(' ')' ':' (tipoVariable | ID) '{'  (declaracionOperacion)*  '};'
                        |       ID '(' ')' ':' (tipoVariable | ID) '{' '{' (declaracionOperacion)* '}' '};'
                        |       ID '(' ID ':' (tipoVariable | ID) (',' ID ':' (tipoVariable | ID))* ')' ':' (tipoVariable | ID) '{' '{' (declaracionOperacion)* '}' '};'
                        |       ID '(' ID ':' (tipoVariable | ID) (',' ID ':' (tipoVariable | ID))* ')' ':' (tipoVariable | ID) '{' (declaracionOperacion)* '};'
                        |       'main() :' (tipoVariable | ID) '{'  (declaracionOperacion)*  '};'
                        |       'main():' (tipoVariable | ID) '{'  (declaracionOperacion)*  '};'
                        |       'main() :' (tipoVariable | ID) '{' '{' (declaracionOperacion)* '}' '};'
                        |       'main():' (tipoVariable | ID) '{' '{' (declaracionOperacion)* '}' '};'
                        |       ID '(' ')' ':' (tipoVariable | ID) ';'
                        |       ID '(' ')' ':' (tipoVariable | ID) '{' '{' (declaracionOperacion ';')* '}' '};'
                        ;

// cuando se aplica un metodo
parametrosParaMetodo    :       '();'
                        |       '() ;'
                        |       '(' (ID|NUM) (',' ID | ',' NUM)* ')'
                        |       ID '(' STRING ')'
                        ;

clases  :       'class' ID  '{'  (contenidoClase)   '};'
        ;

contenidoClase  :       (definirVariables)* (declaracionMetodo)*
                ;

definirVariables        :       ID ':' tipoVariable ';'
                        |       ID ':' ID ';'
                        |       ID ':' tipoVariable '<-' '"";'
                        |       ID ':' 'String' '<-'  '"' (ID) '"' ';'
                        |       ID ':' tipoVariable '<-'  (STRING | NUM) ';'
                        ;

// declaracion de variable ejemplo "hoxpox : Comic;" o "hoxpox : Int;"
// tambien pueden definirse otras clases
declaraciones   :       ID ':' tipoVariable ';'
                |       (clases)*
                |       (definirVariables)*
                ;

// se realizan operaciones hacia un objeto
declaracionOperacion    :       ID '();'
                        |       ID '(' ID ')' ';'
                        |       ID '(' ID ')'
                        |       ID '(' (STRING | NUM) ')' ';'
                        |       ID '(' (STRING | NUM) ')'
                        |       ID '(' (STRING | NUM) operador (STRING | NUM) (')' | ');')
                        |       ID '<-'  STRING ';'
                        |       ID '<-'  ID ';'
                        |       ID '<-' NUM ';'
                        |       ID '<-' '"";'
                        |       ID '(' NUM ');'
                        |       ID '<-' (STRING | NUM | ID) operador (STRING | NUM | ID) (operador (STRING | NUM | ID))* ';'
                        |       'abort();'
                        |       (NUM | ID) ';'
                        |       'self;'
                        |       'self'
                        |       ID '<-' '(' declaracionEspecial (tipoVariable | ID) ');'
                        |       ID '.' ID '(' '"' (ID)? '"' ');'
                        |       ID '.' ID '(' (NUM)* ');'
                        |       ID '.' ID '(' (NUM)* ')'
                        |       ID '(' (ID '.' ID '(' (NUM)* ')')* ');'
                        |       'out_string("\\n");'
                        |       'out_string(" ");'
                        |       ID '(' (ID | NUM | tipoVariable) (',' ID | ',' NUM | ',' tipoVariable)* (')' | ');')
                        |       ID '(' ('(' declaracionEspecial (tipoVariable | ID) ')' ('.' ID '(' ((STRING | NUM) (',' (STRING | NUM) )* )* ')')* ) ');'
                        |       ID '(' ('(' declaracionEspecial (tipoVariable | ID) ')' ('.' ID '(' ((STRING | NUM) (',' (STRING | NUM) )* )* ')')* ) ')'
                        |       '(' (declaracionEspecial)? (tipoVariable | ID) ')'
                        |       declaracionOperacion ('.' declaracionOperacion)+
                        |       ID '<-' (declaracionEspecial)? ID ('.' ID '(' (STRING | NUM) ')')*
                        |       'if' declaracionOperacion 'then' declaracionOperacion 'else' '{' (declaracionOperacion)* '}' 'fi'
                        |       'while' '(' ID declaracionOperacion ')' 'loop' '{' (declaracionOperacion)* '}'
                        |       'if' (ID | NUM) operador (ID | NUM) 'then' (declaracionOperacion | ID) 'else' declaracionOperacion ('fi')*
                        ;

operador        :       '+'
                |       '-'
                |       '*'
                |       '/'
                |       '<='
                |       '<'
                |       '>'
                ;

tipoVariable    :       'Int'
                |       'String'
                |       'SELF_TYPE'
                |       'Object'
                |       'self'
                |       'Bool'
                ;

declaracionEspecial     :       'new'
                        |       'isvoid'
                        ;