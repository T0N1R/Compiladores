
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
Factorial
enter correcto 1
**********************
correcto 1
var:Int<-0;
nuevas clases agregadas: ['Factorial']
var
asigned_type: Int
**********************
enter correcto 1
**********************
correcto 1
n:String<-0;
nuevas clases agregadas: ['Factorial']
n
asigned_type: String
**********************
**********************
metodo1
factorial(m:Int):Int{{(letf:Intinif0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi);}};
los ids: 2
los tipoVariables: 2
el pinche id: (letf:Intinif0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi);
nombre del metodo: factorial
tipo del metodo: Int
id_metodo???????? : m
**********************
metodo3
(letf:Intinif0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi);
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letf:Intinif0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001B86A7993C0>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
if0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi
++++++++++++++++++++++++++++++++++
let_id: f
let_tipo: Int
let_expr: if0=nthenf<-0elseifn=1thenf<-1elsef<-n*factorial(n-1)fifi
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A8291C0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A82A420>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A8297E0>]
**********************
metodo11
expre en metodo11: 0=n
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001B86A829000>]
numero de operaciones: 1
posible id en operacion: None
posible_num en operacion: 0
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
VALOR 1 EN IF ES NUMERO
POSIBLE NUM DE VALOR1: None
POSIBLE ID DE VALOR2: n
correcto
TENEMOSSSSSSS
valor1: 0
valor2: n
[{'tipo': 'String', 'id': 'n', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 'empty string', 'padre': 'Factorial', 'en_metodo': None, 'ambito': 'global'}]
se le puede asignar a la variable por ser una variable global
ble
Int
True
ERROR: tipo de los valores no concuerda
ERROR, ESTA VARIABLE NO HA SIGO ASIGNADA
correcto 6
f 0
check_int(expr) True
entramos
el id_object es: {'tipo': 'Int', 'id': 'f', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Factorial', 'en_metodo': 'factorial', 'ambito': 'private'}
el valor es Int
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A829930>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A828350>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A8286D0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001B86A82A500>]
**********************
metodo11
expre en metodo11: n=1
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001B86A828040>]
numero de operaciones: 1
posible id en operacion: n
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: n
valor2: 1
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 1 es un Int
la mierda: {'tipo': 'String', 'id': 'n', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 'empty string', 'padre': 'Factorial', 'en_metodo': None, 'ambito': 'global'}
Los tipos de valor no coinciden en n=1
correcto
correcto 6
f 1
check_int(expr) True
entramos
el id_object es: {'tipo': 'Int', 'id': 'f', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': '0', 'padre': 'Factorial', 'en_metodo': 'factorial', 'ambito': 'private'}
el valor es Int
**********************
enter correcto 4
contenido correcto 4: f<-n*factorial
id_a_asignar: f
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'f', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': '1', 'padre': 'Factorial', 'en_metodo': 'factorial', 'ambito': 'private'}]
id_del_posible: f
tipo_del_posible: Int
en_metodo_del_posible: factorial
ambito_del_posible: private
metodo_actual: factorial
clase_padre_actual: Factorial
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: f
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: n*factorial
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001B86A828430>]
numero de operaciones: 1
posible id en operacion: n
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: n
valor2: factorial
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
WUUUUUUUUUUUU
tenemos minicondicion: False
exit correcto 4
**********************
metodo3
(n-1)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 259 72 259 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: n-1
**********************
metodo11
expre en metodo11: n-1
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001B86A82A1F0>]
numero de operaciones: 1
posible id en operacion: n
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: n
valor2: 1
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 1 es un Int
la mierda: {'tipo': 'String', 'id': 'n', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 'empty string', 'padre': 'Factorial', 'en_metodo': None, 'ambito': 'global'}
Los tipos de valor no coinciden en n-1
exit metodo3
TERMINA METODO4
**********************
TERMINA METODO4
**********************
exit metodo3
exitMetodo1
ERROR METODO NO VALIDO
**********************
exitTest_main
self._tabla_simbolos._error_in_code: True
**********************
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
LA TABLA EN SEGUNDA CORRIDA
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Factorial       None            None            clase           None            None            None            global
Int             var             None            None            variable        0               Factorial       None            global
String          n               None            None            variable        empty string    Factorial       None            global
Int             factorial       None            None            metodo          None            Factorial       None            global
Int             m               None            None            variable        None            Factorial       factorial       private
Int             f               None            None            variable        1               Factorial       factorial       private
metodo3
**********************
metodo3
**********************
exit metodo3
exit metodo3
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
########################################################
self._tabla_simbolos._error_in_code: True
LISTA ERRORES
ERROR: tipo de los valores en 0=n no concuerda
Los tipos de valor no coinciden en n=1
Los tipos de valor no coinciden en n-1

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>