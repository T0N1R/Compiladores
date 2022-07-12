grammar ejemploScanner;

// cualquier palabra con letra mayuscula o minuscula
fragment PALABRA: ('A'..'Z' | 'a' .. 'z') ; 

// cualquier NUMEROero entero de 0 a 9
fragment ENTERO: '0' .. '9';

// para IDENTIFICADOR se aplica una "operacion" como se hizo en el proyecto del semestre pasado
// un IDENTIFICADOR es una palabra seguida de palabra o numero entero Kleene
IDENTIFICADOR      : PALABRA (PALABRA|ENTERO)*;

// NUMERO puede ser un numero seguido de numero cerradura de kleene (mas numeros o ninguno)
NUMERO     : ENTERO (ENTERO)*;

// clase puede ser un class IDENTIFICADOR como "class Comic", "class Comic inherits <otra clase>"
// "class Main que puede o no puede tener un inherit a una o varias librerias
// estas opciones de clase tambien tienes una declaracionClase que se explica a continuacion
clase   :   'class' IDENTIFICADOR '{' (declaracionClase) '};'
        |   'class' IDENTIFICADOR 'inherits' IDENTIFICADOR '{' (declaracionClase) '};'
        |   'class Main' ('inherits')? (librerias)* '{' (declaracionClase) '};'
        ;

// Tipos de librerias que puede heredar la clase de arriba
// IO se utiliza para poder imprimir
// Object la use para poder obtener el objeto comic en bestComi.cl
librerias   :   'IO'
            |   'Object'
            ;

// declaracionClase es el contenido dentro de la clase
// en esta se pueden declarar varias variables y operaciones o ninguna debido a la cerradura de kleene
declaracionClase    :   '{' (declaracionVariable)* (declaracionOperacion)* '}'
                    ;

// declaracion de variable ejemplo "hoxpox : Comic;" o "hoxpox : Int;"
declaracionVariable     :       IDENTIFICADOR ':' tipoVariable ';'
                        ;

// se realizan operaciones hacia un objeto
declaracionOperacion    :       objeto '<-'  IDENTIFICADOR
                        |       objeto '<-' NUMERO
                        ;

objeto  :       IDENTIFICADOR
        |       NUMERO
        ;

tipoVariable    :   'Int'
                |   'String'
                ;