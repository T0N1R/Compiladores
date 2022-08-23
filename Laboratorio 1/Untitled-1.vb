
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
Main
inherits: IO
enter correcto 1
**********************
correcto 1
argsregse
nuevas clases agregadas: ['Main']
var
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
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
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
**********************
exitMetodo1
limpiar variable en separado
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
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             num             None            None            variable        None            Main            set_var         private
**********************
correcto 2 MULAAA
var<-num;
los ids: var, num
*********************
verificamos si esta en el mismo ambito
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
init(i:Int,rest:List):List{{car<-pi;cdr<-rest;self;}};
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
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             num             None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
**********************
correcto 2 MULAAA
car<-pi;
los ids: car, pi
*********************
ERROR, car NO HA SIDO ASIGNADA
ERROR, pi NO HA SIDO ASIGNADA
correcto 2 MULAAA
cdr<-rest;
los ids: cdr, rest
*********************
ERROR, cdr NO HA SIDO ASIGNADA
correcto 8
exitMetodo1
ERROR METODO NO VALIDO
**********************
**********************
metodo1
main():SELF_TYPE{out_string("Hello, World.\n")};
los ids: 1
los tipoVariables: 1
el pinche id: out_string
el pinche id: ("Hello, World.\n")
exp_context
out_string
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             num             None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            init            private
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
Int             var             None            None            variable        0               Main            None            global
Int             value           None            None            metodo          None            Main            None            global
Main            set_var         None            None            metodo          None            Main            None            global
Int             num             None            None            variable        None            Main            set_var         private
List            init            None            None            metodo          None            Main            None            global
Int             i               None            None            variable        None            Main            init            private
List            rest            None            None            variable        None            Main            init            private
Main            main            None            None            metodo          None            Main            init            private
self._tabla_simbolos._error_in_code: True
TEST
funciones de clase A: []
**********************
LISTA ERRORES
['ERROR, car NO HA SIDO ASIGNADA', 'ERROR, pi NO HA SIDO ASIGNADA', 'ERROR, cdr NO HA SIDO ASIGNADA']

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>