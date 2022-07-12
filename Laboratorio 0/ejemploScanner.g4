grammar ejemploScanner;

fragment PALABRA: ('A'..'Z' | 'a' .. 'z') ; 

fragment ENTERO: '0' .. '9';

ID                  : PALABRA (PALABRA|ENTERO)*;
NUM                 : ENTERO (ENTERO)*;

clase   :   'class' ID declaracionClase
        |   'class' ID 'inherits' ID declaracionClase
        |   'class Main' ('inherits')? (librerias)* '{' (declaracionClase) '};'
        ;

librerias   :   'IO'
            |   'Object'
            ;



declaracionClase    :   '{' (declaracionVariable)* (declaracionOperacion)* '}'
                    ;

declaracionVariable     :       tipoVariable ID ';'                                   
                        ;

declaracionOperacion    :       objeto '<-'  ID
                        |       objeto '<-' NUM
                        ;

objeto  :       ID
        |       NUM
        ;

tipoVariable    :   'Int'
                |   'String'
                ;