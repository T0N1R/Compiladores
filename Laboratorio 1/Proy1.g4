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

BOOL    :   'true'
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
        |   BOOL 
        |   NUM
        |   self
        ;

Not     :       'not'
        ;

inicializar     :       'new' tipoVariable
                |       'isvoid' self
                ;

declararAtributo    :   ID ':' tipoVariable ('<-' expr)? (semicolon)?       #tipo_correcto_1
                    |   ID '<-' inicializar (punto metodo)* (semicolon)?    #tipo_correcto_3
                    |   ID '<-' metodo (operacion metodo)* (semicolon)?     #tipo_correcto_4
                    |   ID '<-' ID (operacion metodo)* (semicolon)?   #tipo_correcto_5
                    |   ID '<-' expr (semicolon)?                     #tipo_correcto_6
                    |   ID '<-' '{' expr '};'                         #tipo_correcto_7
                    |   self                                          #tipo_correcto_8
                    ;

metodo  :   ID '(' (ID ':' tipoVariable  (coma ID ':' tipoVariable)*  )? ')' ':' tipoVariable '{' ('{')?  (expr)*  ('}')? ('}' | '};')  #metodo1
        |   ID '(' (expr (coma expr)*)? ')' (punto metodo)? (';')*                                                                      #metodo2
        |   '(' (Not)? (inicializar | expr) ')' (punto metodo)? (';')*                                                                #metodo3
        |   'if' (expr)* 'then' (expr)* 'else' (expr)* ('fi')* (';')?                                                                   #metodo4
        |   'while' (expr)* 'loop' (expr)* 'pool' (';')?                                                                                #metodo5
        |   '{' (expr)* '};'                                                                                                            #metodo6
        |   '{' (expr)* '}'                                                                                                             #metodo7
        |   '(' (expr)* ')' (';')*                                                                                                      #metodo8
        |   (ID | STRING) punto metodo (punto metodo)* (';')?                                                                           #metodo9
        |   'let' ID ':' (tipoVariable | ID '<-' expr) 'in' ( (expr)* | '{' (expr)* '}' | '(' (expr)* ')' ) (';')*                              #metodo10
        |   (ID | NUM) operacion (expr) (operacion expr)* (';')?                                                                        #metodo11
        |   '~' (ID | expr) (';')?                                                                                                      #metodo12
        |   'while' (expr)* 'loop' ('{')? (expr)* ('}')?                                                                                #metodo13
        |   'while' (expr)* 'loop' ('{')? (expr)* ('}')? 'pool' (';')?                                                                  #metodo14
        |   '(' (Not)? (inicializar | expr) ')' '@' ID punto metodo (punto metodo)* (';')?                                            #metodo15
        |   '(' 'let' ID ':' (tipoVariable | expr) 'in' metodo ')'                                                                      #metodo16
        ;

