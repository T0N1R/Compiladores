
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
Main
inherits: IO
enter correcto 1
nuevas clases agregadas: ['Main']
out
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
**********************
metodo6
metodo3
("2 is trivially prime.\n");
hay_not: None
posible_inicializar: None
posible_expr: [228 72 292 72 94 44 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: "2 is trivially prime.\n"
**********************
exit metodo3
correcto 1
**********************
enter correcto 1
nuevas clases agregadas: ['Main']
testee
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
**********************
correcto 1
**********************
enter correcto 1
nuevas clases agregadas: ['Main']
divisor
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        0               Main            None            global
**********************
correcto 1
**********************
enter correcto 1
nuevas clases agregadas: ['Main']
stop
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        0               Main            None            global
Int             stop            None            None            variable        0               Main            None            global
**********************
correcto 1
**********************
**********************
metodo1
los ids: 1
los tipoVariables: 1
exp_context
[72 187 45 41 28]
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        0               Main            None            global
Int             stop            None            None            variable        0               Main            None            global
Object          main            None            None            metodo          None            Main            None            global
**********************
metodo13
expresiones en el while: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000249036E6F80>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249035BB530>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249038A7AE0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249038A6650>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DF290>]
true
testee<-testee+1;
divisor<-2;
whileifteste<divisor*divisorthenfalseelseiftestee-divisor*(testee/divisor)=0thenfalseelsetruefifiloopdivisor<-divisor+1pool;
iftestee<divisor*divisorthen{out<-testee;out_int(out);out_string(" is prime.\n");}else0fi;
enter correcto 4
contenido correcto 4: testee<-testee+1;
id_a_asignar: testee
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'testee', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: testee
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        0               Main            None            global
Int             stop            None            None            variable        0               Main            None            global
Object          main            None            None            metodo          None            Main            None            global
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: testee+1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249038A6FF0>]
numero de operaciones: 1
posible id en operacion: testee
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: testee
valor2: 1;
valor1_en_tabla: True
valor2_en_tabla: False
UN VALOR ESTA EN TABLA Y EL SEGUNDO ES UN NUMERO
Main
global
None
current_method: main
clase actual: Main
CORRECTO, se encuentran en la misma clase
[{'tipo': 'Int', 'id': 'testee', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
exit correcto 4
**********************
correcto 6
divisor 2;
check_int(expr) False
entramos
el id_object es: {'tipo': 'Int', 'id': 'divisor', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}
el valor es Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        2;              Main            None            global
Int             stop            None            None            variable        0               Main            None            global
Object          main            None            None            metodo          None            Main            None            global
**********************
metodo5
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DC190>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DC900>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DDA80>]
**********************
metodo11
expre en metodo11: teste<divisor*divisor
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DC580>, <Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DC5F0>]
numero de operaciones: 2
posible id en operacion: teste
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DDBD0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DCEB0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DCBA0>]
**********************
metodo11
expre en metodo11: testee-divisor*(testee/divisor)=0
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DDAF0>, <Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DD690>, <Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DCF20>]
numero de operaciones: 3
posible id en operacion: testee
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
metodo3
(testee/divisor)
hay_not: None
posible_inicializar: None
posible_expr: [228 72 379 72 244 72 258 72 274 72 408 72 187 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: testee/divisor
**********************
metodo11
expre en metodo11: testee/divisor
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DD770>]
numero de operaciones: 1
posible id en operacion: testee
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: testee
valor2: divisor
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
exit metodo3
TERMINA METODO4
**********************
TERMINA METODO4
**********************
enter correcto 4
contenido correcto 4: divisor<-divisor+1
id_a_asignar: divisor
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'divisor', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': '2;', 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: divisor
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        2;              Main            None            global
Int             stop            None            None            variable        0               Main            None            global
Object          main            None            None            metodo          None            Main            None            global
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: divisor+1
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DE3B0>]
numero de operaciones: 1
posible id en operacion: divisor
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: divisor
valor2: 1
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 1 es un Int
exit correcto 4
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DF370>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000249039DF610>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024903A5C4A0>]
**********************
metodo11
expre en metodo11: testee<divisor*divisor
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DF450>, <Proy1Parser.Proy1Parser.OperacionContext object at 0x00000249039DEF80>]
numero de operaciones: 2
posible id en operacion: testee
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
correcto 1
metodo3
(out);
hay_not: None
posible_inicializar: None
posible_expr: [228 72 300 72 251 72 408 72 187 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: out
**********************
exit metodo3
metodo3
(" is prime.\n");
hay_not: None
posible_inicializar: None
posible_expr: [228 72 300 72 251 72 408 72 187 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: " is prime.\n"
**********************
exit metodo3
TERMINA METODO4
**********************
exit metodo13
*************************
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             out             None            None            variable        0               Main            None            global
Int             testee          None            None            variable        0               Main            None            global
Int             divisor         None            None            variable        2;              Main            None            global
Int             stop            None            None            variable        0               Main            None            global
Object          main            None            None            metodo          None            Main            None            global
self._tabla_simbolos._error_in_code: False
TEST
funciones de clase A: []
**********************

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>