grammar ejemploScanner2;

fragment LETTER: ('A'..'Z' | 'a' .. 'z' | '_') ; 

fragment DIGIT: '0' .. '9';


ID                  : LETTER (LETTER|DIGIT)*;
NUM                 : DIGIT (DIGIT)*;

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
SELF    :       'self'
        ;

start   :       (clase)*
        ;

// clase puede ser un class ID como "class Comic", "class Comic inherits <otra clase>"
// "class Main que puede o no puede tener un inherit a una o varias librerias
// estas opciones de clase tambien tienes una declaracionClase que se explica a continuacion
clase   :       'class' ID  '{'  (contenidoClase)   '};'
        |       'class' ID 'inherits' (ID) '{'  (contenidoClase)   '};'
        ;

declaracionMetodo       :       ID '():' tipoVariable '{' (declaracionOperacion)* '};'
                        |       ID '(' ID ':' tipoVariable (',' ID ':' tipoVariable)* ')' ':' tipoVariable '{' (declaracionOperacion)* '};'
                        |       ID '():' tipoVariable '{' ID '};'
                        ;

clases  :       'class' ID  '{'  (contenidoClase)   '};'
        ;

contenidoClase  :       (definirVariables)* (declaracionMetodo)*
                ;

definirVariables        :       ID ':' tipoVariable ';'
                        |       ID ':' tipoVariable '<-' '"";'
                        |       ID ':' 'String' '<-'  '"' (ID) '"' ';'
                        ;

// declaracion de variable ejemplo "hoxpox : Comic;" o "hoxpox : Int;"
// tambien pueden definirse otras clases
declaraciones   :       ID ':' tipoVariable ';'
                |       (clases)*
                |       (definirVariables)*
                ;

// se realizan operaciones hacia un objeto
declaracionOperacion    :       '{' ID '<-'  '"' (ID) '"' ';' '}'
                        |       '{' ID '<-'  ID ';' '}'
                        |       '{' ID '<-' NUM ';' '}'
                        |       '{' ID '<-' '"";' '}'
                        ;

tipoVariable    :       'Int'
                |       'String'
                |       'SELF_TYPE'
                |       'Object'
                ;