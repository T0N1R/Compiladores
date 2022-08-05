grammar Proy1;

// cualquier letra mayuscula o minuscula
fragment LETRA: ('A'..'Z' | 'a'..'z' | '_');

fragment DIGIT: '0' .. '9';

ID  :   LETRA (LETRA|DIGIT)*;
NUM :   DIGIT (DIGIT)*;

tipoVariable    :   ID
                |   'SELF_TYPE'
                ;

STRING  :       '"' (ID | ' ' | NUM | '.' | ',' | '\\' | '\n' | '!' | APOSTROPHE)* '"' 
        ;

// \t = tab
// \r = carriage  return
// \n = newline
DELIMITER       :       [ \t\r\n]+ -> skip;
QUOTES          :       '"';
APOSTROPHE      :       '\'';
CHAR_LITERAL    :       ('"' ( ID ) '"') | (APOSTROPHE ( ID ) APOSTROPHE);
PARENTESIS      :       '('
                |       ')'
                ;

COMENTARIO      :       '(*' (ID | NUM | '?' | '=' | '/' | '<' | '>' | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' | ';' | '\t' | '\r' | '\n')* '*)' -> skip
                ;

LCOMENTARIO     :       '--' (ID | NUM | '?' | '=' | '/' | '<' | '>' | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' | ';' )* -> skip
                ;

start   :       (clase)*
        ;

clase   :       'class' ID ('inherits' tipoVariable)? '{' feature_clases '};' # test_main
        ;

feature_clases  :   (declararAtributo | metodo)*
                ;

bool    :   'true'
        |   'false'
        ;

coma    :   ','
        ;

punto   :   '.'
        ;

semicolon       :       ';'
                ;

self    :       'self' (';')?
        ;

operacion       :       '+'
                |       '-'
                |       '*'
                |       '/'
                |       '='
                |       '<'
                |       '>'
                |       '<='
                |       '>='
                |       '<='
                ;

expr    :   ID 
        |   STRING 
        |   declararAtributo
        |   metodo
        |   bool 
        |   NUM
        |   self
        ;

inicializar     :       'new' tipoVariable
                |       'isvoid' self
                ;

declararAtributo    :   ID ':' tipoVariable ('<-' expr)? (';')?       #tipo_correcto_1
                    |   ID '<-' inicializar (punto metodo)* (';')?    #tipo_correcto_3
                    |   ID '<-' metodo (operacion metodo)* (';')?     #tipo_correcto_4
                    |   ID '<-' ID (operacion metodo)* (semicolon)?   #tipo_correcto_5
                    |   ID '<-' expr (semicolon)?                     #tipo_correcto_6
                    |   ID '<-' '{' expr '};'                         #tipo_correcto_7
                    |   self                                          #tipo_correcto_8
                    ;

metodo  :   ID '(' (ID ':' tipoVariable  (coma ID ':' tipoVariable)*  )? ')' ':' tipoVariable '{' ('{')?  (expr)*  ('}')? ('}' | '};')
        |   ID '(' (expr (coma expr)*)? ')' (punto metodo)? (';')*
        |   '(' ('not')? (inicializar | expr) ')' (punto metodo)? (';')*
        |   'if' (expr)* 'then' (expr)* 'else' (expr)* ('fi')* (';')?
        |   'while' (expr)* 'loop' (expr)* 'pool' (';')?
        |   '{' (expr)* '};'
        |   '{' (expr)* '}'
        |   '(' (expr)* ')' (';')*
        |   (ID | STRING) punto metodo (punto metodo)* (';')?
        |   'let' ID ':' (tipoVariable | expr) 'in' ( (expr)* | '{' (expr)* '}' | '(' (expr)* ')' ) (';')*
        |   (ID | NUM) operacion (expr) (operacion expr)* (';')?
        |   '~' (ID | expr) (';')?
        |   'while' (expr)* 'loop' ('{')? (expr)* ('}')?
        |   'while' (expr)* 'loop' ('{')? (expr)* ('}')? 'pool' (';')?
        |   '(' ('not')? (inicializar | expr) ')' '@' ID punto metodo (punto metodo)* (';')?
        |   '(' 'let' ID ':' (tipoVariable | expr) 'in' metodo ')'
        ;

