
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
A
enter correcto 1
**********************
correcto 1
car:Int;
nuevas clases agregadas: ['A']
car
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
self._tabla_simbolos._error_in_code: False
TEST
funciones de clase A: []
**********************
entre test main
B
enter correcto 1
**********************
correcto 1
var:Int;
nuevas clases agregadas: ['A', 'B']
var
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
**********************
**********************
metodo1
set_var(num:Int):SELF_TYPE{{var<-num;self;}};
los ids: 2
los tipoVariables: 2
nombre del metodo: set_var
tipo del metodo: SELF_TYPE
id_metodo???????? : num
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
**********************
correcto 2 MULAAA
var<-num;
los ids: var, num
*********************
verificamos si esta en el mismo ambito
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: var
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: set_var
clase_padre_actual: B
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
contenido en verificado: [1, 1]
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'set_var', 'ambito': 'private'}]
id_del_posible: num
tipo_del_posible: Int
en_metodo_del_posible: set_var
ambito_del_posible: private
metodo_actual: set_var
clase_padre_actual: B
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: num
tipo_de_asignada: Int
_se_asigna_a_variable: True
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
contenido en verificado: [1]
exit correcto 2
enter correcto 8
correcto 8
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
self._tabla_simbolos._error_in_code: False
TEST
funciones de clase A: []
**********************
entre test main
Main
inherits: IO
enter correcto 1
**********************
correcto 1
var:Int<-0;
nuevas clases agregadas: ['A', 'B', 'Main']
var
 var existe pero no en esta clase
verificacion es true, podemos agregar la variable var
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
**********************
**********************
metodo1
value():Int{var};
los ids: 1
los tipoVariables: 1
el pinche id: var
exp_context
var
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
**********************
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
set_var(snum:Int):SELF_TYPE{{var<-num;self;}};
los ids: 2
los tipoVariables: 2
nombre del metodo: set_var
tipo del metodo: SELF_TYPE
id_metodo???????? : snum
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
**********************
correcto 2 MULAAA
var<-num;
los ids: var, num
*********************
verificamos si esta en el mismo ambito
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}, {'tipo': 'Int', 'id': 'var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: var
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: set_var
clase_padre_actual: Main
id_del_posible: var
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: set_var
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
contenido en verificado: [1, 1, 1, 1]
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'set_var', 'ambito': 'private'}]
id_del_posible: num
tipo_del_posible: Int
en_metodo_del_posible: set_var
ambito_del_posible: private
metodo_actual: set_var
clase_padre_actual: Main
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: num
tipo_de_asignada: Int
_se_asigna_a_variable: True
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
contenido en verificado: [1]
exit correcto 2
enter correcto 8
correcto 8
exitMetodo1
limpiar variable en separado
**********************
metodo3
(newB).set_var(x);
hay_not: None
posible_inicializar: [228 45 41 28]
posible_expr: None
posible_metodo: [234 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newB
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000002759C307450>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'B', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}, {'tipo': 'Main', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
class inicializada: B
lista_metodos: ['set_var']
nombre_metodo: set_var
correcto, metodo esta en B
antes del for
-------------------------------
la mera expresion: x
posible_string: None
posible_num: None
posible_bool: None
expresion: x
vamos a entrar con la info
expresion.getText(): x
nombre_metodo: set_var
metodos permitidos:['abort', 'out_string', 'out_int', 'type_name', 'substr']
entramos?
Tabla posibles valores : []
class inicializada: B
lista_metodos: ['set_var']
nombre_metodo: set_var
correcto, metodo esta en B
exit metodo3
**********************
metodo1
init(i:Int,rest:List):List{{var<-3;self;}};
los ids: 3
los tipoVariables: 3
nombre del metodo: init
tipo del metodo: List
id_metodo???????? : i
id_metodo???????? : rest
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
**********************
correcto 6
var 3;
check_int(expr) False
entramos
el id_object es: {'tipo': 'Int', 'id': 'var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
el valor es Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
**********************
enter correcto 8
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
main():SELF_TYPE{out_string("Hello, World.\n")y:Int;num:Int;x:Int;whiley+numloop{x<-x*y;y<-y+1;}pool};
los ids: 1
los tipoVariables: 1
el pinche id: out_string
el pinche id: ("Hello, World.\n")
el pinche id: whiley+numloop{x<-x*y;y<-y+1;}pool
exp_context
out_string
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
**********************
metodo3
("Hello, World.\n")
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "Hello, World.\n"
**********************
exit metodo3
enter correcto 1
**********************
correcto 1
y:Int;
nuevas clases agregadas: ['A', 'B', 'Main']
y
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
**********************
enter correcto 1
**********************
correcto 1
num:Int;
nuevas clases agregadas: ['A', 'B', 'Main']
num
 num existe pero no en esta clase
verificacion es true, podemos agregar la variable num
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
Int             num             None            None            variable        0               Main            main            private
**********************
enter correcto 1
**********************
correcto 1
x:Int;
nuevas clases agregadas: ['A', 'B', 'Main']
x
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
Int             num             None            None            variable        0               Main            main            private
Int             x               None            None            variable        0               Main            main            private
**********************
metodo5
metodo11
expre en metodo11: y+num
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000002759C3D84A0>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: y
valor2: num
valor1_en_tabla: True
valor2_en_tabla: True
AMBOS OBJETOS ESTAN EN TABLA
tabla posible valor1: [{'tipo': 'Int', 'id': 'y', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
tabla posible valor2: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'set_var', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
/////////////////////
tipo de asignada: Int
tipo_valor_1: Int
tipo_valor_2: Int
CORRECTO, LA OPERACION ES EL MISMO TIPO
enter correcto 4
contenido correcto 4: x<-x*y;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: main
ambito_del_posible: private
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
Int             num             None            None            variable        0               Main            main            private
Int             x               None            None            variable        0               Main            main            private
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: x*y;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000002759C3D91C0>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: x
valor2: y;
valor1_en_tabla: True
valor2_en_tabla: True
AMBOS OBJETOS ESTAN EN TABLA
tabla posible valor1: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
tabla posible valor2: [{'tipo': 'Int', 'id': 'y', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
/////////////////////
tipo de asignada: Int
tipo_valor_1: Int
tipo_valor_2: Int
CORRECTO, LA OPERACION ES EL MISMO TIPO
exit correcto 4
**********************
enter correcto 4
contenido correcto 4: y<-y+1;
id_a_asignar: y
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'y', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
id_del_posible: y
tipo_del_posible: Int
en_metodo_del_posible: main
ambito_del_posible: private
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: y
tipo_de_asignada: Int
_se_asigna_a_variable: True
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
Int             num             None            None            variable        0               Main            main            private
Int             x               None            None            variable        0               Main            main            private
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: y+1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000002759C3D9620>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: y
valor2: 1;
valor1_en_tabla: True
valor2_en_tabla: False
UN VALOR ESTA EN TABLA Y EL SEGUNDO ES UN NUMERO
Main
private
main
current_method: main
clase actual: Main
CORRECTO, se encuentran en el mismo metodo
[{'tipo': 'Int', 'id': 'y', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'Main', 'en_metodo': 'main', 'ambito': 'private'}]
exit correcto 4
**********************
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           A               None            None            clase           None            None            None            global
Int             car             None            None            variable        0               A               None            global
class           B               None            None            clase           None            None            None            global
Int             var             None            None            variable        3;              B               None            global
B               set_var         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               set_var         private
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        3;              Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             snum            None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            None            global
Int             y               None            None            variable        0               Main            main            private
Int             num             None            None            variable        0               Main            main            private
Int             x               None            None            variable        0               Main            main            private
self._tabla_simbolos._error_in_code: False
TEST
funciones de clase A: []
**********************
LISTA ERRORES
[]

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>