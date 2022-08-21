grammar Proy1;

// cualquier letra mayuscula o minuscula
fragment LETRA: ('A'..'Z' | 'a'..'z' | '_');

// Letra mayuscula
fragment MAYUSCULA: 'A'..'Z';

fragment MINUSCULA: 'a'..'z';

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

clase   :       'class' ID ('inherits' ID)? '{' feature_clases '};'
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

expr    :   ID (';')?
        |   STRING (';')?
        |   ID (';')?
        |   declararAtributo
        |   metodo
        |   bool (';')?
        |   NUM (';')?
        |   self
        ;

inicializar     :       'new' tipoVariable
                |       'isvoid' self
                ;

declararAtributo    :   ID ':' tipoVariable ('<-' expr)? (';')?
                    |   ID '<-' ID (';')?
                    |   ID '<-' inicializar (punto metodo)* (';')?
                    |   ID '<-' metodo (operacion metodo)* (';')?
                    |   ID '<-' ID (operacion metodo)* (';')?
                    |   ID '<-' expr (';')?
                    |   ID '<-' '{' expr '};'
                    |   self
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