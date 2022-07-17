grammar yapl;

// cualquier letra mayuscula o minuscula
fragment LETRA: ('A'..'Z' | 'a'..'z');

// Letra mayuscula
fragment MAYUSCULA: 'A'..'Z';

fragment MINUSCULA: 'a'..'z';

fragment DIGIT: '0' .. '9';


ID                  : LETRA (LETRA|DIGIT)*;
MINID               : MINUSCULA (LETRA|DIGIT)*;
MAYID               : MAYUSCULA (LETRA|DIGIT)*;
NUM                 : DIGIT (DIGIT)*;

// tipo con mayuscula
tipoVariable    :   ID
                |   'SELF_TYPE'
        ;

STRING  :       '"' (ID | ' ' | NUM | '.' | ',' | '\\' | '\n')* '"' 
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

//
// objeto con minuscula
//

COMENTARIO      :       '(*' (ID | NUM | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' | '\t' | '\r' | '\n')* '*)' -> skip
                ;

LCOMENTARIO     :       '--' (ID | NUM | '*' | '-' | '.' | ',' | ':' | '(' | ')' | APOSTROPHE | STRING | ' ' | '\\n' | ' * ' )* -> skip
                ;

start   :       (clase)*
        ;

// clase puede ser un class ID como "class Comic", "class Comic inherits <otra clase>"
// "class Main que puede o no puede tener un inherit a una o varias librerias
// estas opciones de clase tambien tienes una declaracionClase que se explica a continuacion
clase   :       'class' ID ('inherits' ID)? '{' feature_clases '};'
        ;

feature_clases  :   (declararAtributo | metodo)*
                ;

// atributo debe ser minuscula
nombreAtributo  :   ID
                ;

nombreMetodo    :   ID
                ;

asignacion  :   '<-'
            |   '='
            ;

operacion       :       '+'
                |       '-'
                |       '*'
                |       '/'
                ;

self    :       'self' (';')?
        ;

declararAtributo    :   nombreAtributo ':' tipoVariable ';'
                    |   nombreAtributo '<=' tipoVariable ';'
                    |   self (';')?
                    |   nombreAtributo ':' tipoVariable asignacion (nombreAtributo | STRING | NUM) ';'
                    |   nombreAtributo ':' tipoVariable '{' (nombreAtributo) '}' ';'
                    |   nombreAtributo '(' (nombreAtributo ':' tipoVariable)* (',' nombreAtributo ':' tipoVariable)* ')' ':' tipoVariable '{' (declararAtributo | metodo)* '}' (';')?
                    |   nombreAtributo '(' (nombreAtributo ':' tipoVariable)* (',' nombreAtributo ':' tipoVariable)* ')' ':' tipoVariable '{' (declararAtributo | metodo)* '};'
                    ;

inicializar     :       'new' tipoVariable
                ;



metodo  :       nombreAtributo asignacion metodo
        |       nombreAtributo operacion metodo (';')?
        |       metodo operacion metodo
        |       metodo operacion (nombreAtributo | STRING | NUM) (';')?
        |       nombreAtributo operacion nombreAtributo (';')?
        |       nombreAtributo ';'
        |       nombreAtributo '.' nombreMetodo '(' (STRING | NUM | ID | inicializar)* (',' (STRING | NUM | ID | inicializar))* ')' (';')?
        |       '(' inicializar ')' '.' nombreMetodo '(' (STRING | NUM | ID | inicializar)* (',' (STRING | NUM | ID | inicializar))* ')' (';')?
        ;

