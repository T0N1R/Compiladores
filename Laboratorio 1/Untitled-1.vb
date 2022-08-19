
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
A
enter correcto 1
correcto 1
nuevas clases agregadas: ['A']
var
asigned_type: Int
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
**********************
**********************
metodo1
los ids: 1
los tipoVariables: 1
exp_context
var
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
**********************
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
**********************
 enter correcto 5
se le puede asignar a la variable por ser una variable global
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
contenido en verificado: [1]
**********************
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 2
los tipoVariables: 2
nombre del metodo: method1
tipo del metodo: SELF_TYPE
id_metodo???????? : num
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
**********************
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 3
los tipoVariables: 3
nombre del metodo: method2
tipo del metodo: B
id_metodo???????? : num1
id_metodo???????? : num2
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
**********************
metodo3
(letx:Intin{x<-num1+num2;(newB).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Intin{x<-num1+num2;(newB).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43C1E700>]
let_tipo: [320 66 210 66 169 45 41 28]
let_expr
{x<-num1+num2;(newB).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num1+num2;(newB).set_var(x);}
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
**********************
enter correcto 4
contenido correcto 4: x<-num1+num2;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method2
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: num1+num2;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43C9E110>]
numero de operaciones: 1
posible id en operacion: num1
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: num1
valor2: num2
valor1_en_tabla: True
valor2_en_tabla: True
AMBOS OBJETOS ESTAN EN TABLA
tabla posible valor1: [{'tipo': 'Int', 'id': 'num1', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}]
tabla posible valor2: [{'tipo': 'Int', 'id': 'num2', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}]
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
metodo3
(newB).set_var(x);
hay_not: None
posible_inicializar: [209 66 282 66 327 66 210 66 169 45 41 28]
posible_expr: None
posible_metodo: [215 66 282 66 327 66 210 66 169 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newB
el metodo: set_var(x);
el tipo del inicializar: B
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43C9FD10>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: None
posible_bool: None
expresion: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}]
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 2
los tipoVariables: 2
nombre del metodo: method3
tipo del metodo: C
id_metodo???????? : num
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
**********************
metodo3
(letx:Intin{x<-~num;(newC).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Intin{x<-~num;(newC).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43C491C0>]
let_tipo: [320 66 210 66 169 45 41 28]
let_expr
{x<-~num;(newC).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-~num;(newC).set_var(x);}
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
**********************
enter correcto 4
contenido correcto 4: x<-~num;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method3
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method3
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
contenido en verificado: [1]
**********************
metodo12
en metodo12: ~num;
posible_id: num
posible_expr: None
se tiene un ID
posible_id: num
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'set_var', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method1', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}]
pasamos por el : num
pasamos por el : num
pasamos por el : num
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
*************************
exit correcto 4
**********************
metodo3
(newC).set_var(x);
hay_not: None
posible_inicializar: [209 66 282 66 327 66 210 66 169 45 41 28]
posible_expr: None
posible_metodo: [215 66 282 66 327 66 210 66 169 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newC
el metodo: set_var(x);
el tipo del inicializar: C
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC6500>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: None
posible_bool: None
expresion: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 3
los tipoVariables: 3
nombre del metodo: method4
tipo del metodo: D
id_metodo???????? : num1
id_metodo???????? : num2
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC6110>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC5C40>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC6E30>]
**********************
metodo11
expre en metodo11: num2<num1
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43DC5EE0>]
numero de operaciones: 1
posible id en operacion: num2
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
metodo3
(letx:Intin{x<-num1-num2;(newD).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [210 66 233 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Intin{x<-num1-num2;(newD).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43CFD4C0>]
let_tipo: [320 66 210 66 233 66 169 45 41 28]
let_expr
{x<-num1-num2;(newD).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num1-num2;(newD).set_var(x);}
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
**********************
enter correcto 4
contenido correcto 4: x<-num1-num2;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: num1-num2;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43DC5A10>]
numero de operaciones: 1
posible id en operacion: num1
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
exit correcto 4
**********************
metodo3
(newD).set_var(x);
hay_not: None
posible_inicializar: [209 66 282 66 327 66 210 66 233 66 169 45 41 28]
posible_expr: None
posible_metodo: [215 66 282 66 327 66 210 66 233 66 169 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newD
el metodo: set_var(x);
el tipo del inicializar: D
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC52A0>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: None
posible_bool: None
expresion: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
metodo3
(letx:Intin{x<-num2-num1;(newD).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [210 66 240 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Intin{x<-num2-num1;(newD).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43C1E140>]
let_tipo: [320 66 210 66 240 66 169 45 41 28]
let_expr
{x<-num2-num1;(newD).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num2-num1;(newD).set_var(x);}
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
**********************
enter correcto 4
contenido correcto 4: x<-num2-num1;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
contenido en verificado: [1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: num2-num1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43DC6B20>]
numero de operaciones: 1
posible id en operacion: num2
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
exit correcto 4
**********************
metodo3
(newD).set_var(x);
hay_not: None
posible_inicializar: [209 66 282 66 327 66 210 66 240 66 169 45 41 28]
posible_expr: None
posible_metodo: [215 66 282 66 327 66 210 66 240 66 169 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newD
el metodo: set_var(x);
el tipo del inicializar: D
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43DC4DD0>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: None
posible_bool: None
expresion: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1, 1]
TERMINA METODO4
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 2
los tipoVariables: 2
nombre del metodo: method5
tipo del metodo: E
id_metodo???????? : num
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
**********************
metodo3
(letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43F0E000>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43F0F340>]
let_tipo: None
let_expr
1
{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);}
++++++++++++++++++++++++++++++++++
valor_del_let: x
valor_del_tipo: Int
asignacion a la variable en let NUM: 1
asignacion a la variable en let ID: None
asignacion a la variable en let STRING: None
asignacion a la variable en let BOOL: None
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
**********************
metodo3
(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);
hay_not: None
posible_inicializar: None
posible_expr: [210 66 282 66 327 66 210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43F446C0>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43F44B80>]
let_tipo: None
let_expr
1
whiley<=numloop{x<-x*y;y<-y+1;}pool
++++++++++++++++++++++++++++++++++
valor_del_let: y
valor_del_tipo: Int
asignacion a la variable en let NUM: 1
asignacion a la variable en let ID: None
asignacion a la variable en let STRING: None
asignacion a la variable en let BOOL: None
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
**********************
metodo5
metodo11
expre en metodo11: y<=num
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43E27BC0>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
enter correcto 4
contenido correcto 4: x<-x*y;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: x*y;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43F8C740>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
exit correcto 4
**********************
enter correcto 4
contenido correcto 4: y<-y+1;
id_a_asignar: y
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'y', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}]
id_del_posible: y
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: y+1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43F8CA50>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
exit correcto 4
**********************
metodo3
(newE).set_var(x);
hay_not: None
posible_inicializar: [209 66 282 66 327 66 210 66 169 45 41 28]
posible_expr: None
posible_metodo: [215 66 282 66 327 66 210 66 169 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newE
el metodo: set_var(x);
el tipo del inicializar: E
**********************
metodo2
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8DF50>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: None
posible_bool: None
expresion: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
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
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
self._tabla_simbolos._error_in_code: False
TEST
funciones de clase A: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
**********************
entre test main
Main
inherits: IO
enter correcto 1
correcto 1
nuevas clases agregadas: ['A', 'Main']
char
asigned_type: String
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
**********************
enter correcto 1
correcto 1
nuevas clases agregadas: ['A', 'Main']
avar
asigned_type: A
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
**********************
enter correcto 1
correcto 1
nuevas clases agregadas: ['A', 'Main']
a_var
asigned_type: A
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
**********************
enter correcto 1
correcto 1
nuevas clases agregadas: ['A', 'Main']
flag
asigned_type: Bool
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
**********************
**********************
metodo1
los ids: 2
los tipoVariables: 2
nombre del metodo: is_even
tipo del metodo: Bool
id_metodo???????? : num
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
Bool            is_even         None            None            metodo          None            Main            None            global         
Int             num             None            None            variable        None            Main            is_even         private        
**********************
metodo3
(letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi)
hay_not: None
posible_inicializar: None
posible_expr: [210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43C40080>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x0000024E43C41FC0>]
let_tipo: None
let_expr
num
ifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi
++++++++++++++++++++++++++++++++++
valor_del_let: x
valor_del_tipo: Int
asignacion a la variable en let NUM: None
asignacion a la variable en let ID: num
asignacion a la variable en let STRING: None
asignacion a la variable en let BOOL: None
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
Bool            is_even         None            None            metodo          None            Main            None            global         
Int             num             None            None            variable        None            Main            is_even         private        
Int             x               None            None            variable        None            Main            is_even         private        
contenido en verificado: [1]
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8F0D0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8F1B0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8F6F0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8FF40>]
**********************
metodo11
expre en metodo11: x<0
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E43F8F220>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
metodo3
(~x)
hay_not: None
posible_inicializar: None
posible_expr: [210 66 233 66 327 66 210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: ~x
**********************
metodo12
en metodo12: ~x
posible_id: x
posible_expr: None
se tiene un ID
posible_id: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': 'is_even', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
*************************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8FC30>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E43F8FE60>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E440682E0>]
**********************
metodo11
expre en metodo11: 0=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E44068120>]
numero de operaciones: 1
posible id en operacion: None
posible_num en operacion: 0
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
VALOR 1 EN IF ES NUMERO
POSIBLE NUM DE VALOR1: None
POSIBLE ID DE VALOR2: x
TENEMOSSSSSSS
valor1: 0
valor2: x
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E440683C0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E44068430>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E44068820>, <Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E44068C10>]
**********************
metodo11
expre en metodo11: 1=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E44068510>]
numero de operaciones: 1
posible id en operacion: None
posible_num en operacion: 1
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
VALOR 1 EN IF ES NUMERO
POSIBLE NUM DE VALOR1: None
POSIBLE ID DE VALOR2: x
TENEMOSSSSSSS
valor1: 1
valor2: x
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
metodo3
(x-2)
hay_not: None
posible_inicializar: None
posible_expr: [210 66 240 66 240 66 240 66 327 66 210 66 169 45 41 28]
posible_metodo: None
HAY UNA EXPR
EXPRESION: x-2
**********************
metodo11
expre en metodo11: x-2
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x0000024E44068C80>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
TERMINA METODO4
TERMINA METODO4
TERMINA METODO4
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
los ids: 1
los tipoVariables: 1
exp_context
[65 169 45 41 28]
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
Bool            is_even         None            None            metodo          None            Main            None            global         
Int             num             None            None            variable        None            Main            is_even         private        
Int             x               None            None            variable        None            Main            is_even         private        
Object          main            None            None            metodo          None            Main            None            global         
**********************
enter correcto 4
contenido correcto 4: avar<-(newA);
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'class', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
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
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
Bool            is_even         None            None            metodo          None            Main            None            global         
Int             num             None            None            variable        None            Main            is_even         private        
Int             x               None            None            variable        None            Main            is_even         private        
Object          main            None            None            metodo          None            Main            None            global         
contenido en verificado: [1, 1]
**********************
metodo3
(newA);
hay_not: None
posible_inicializar: [209 104 65 169 45 41 28]
posible_expr: None
posible_metodo: None
HAY UNA INICIALIZAR
el inicializar: newA
**********************
exit correcto 4
**********************
metodo9
**********************
metodo2
metodo2: set_var(2);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x0000024E4406A180>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
tabla_posibles_valores: [{'tipo': 'SELF_TYPE', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
pasamos por el : set_var
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
contenido en verificado: [1]
antes del for
-------------------------------
posible_string: None
posible_num: 2
posible_bool: None
expresion: 2
tabla_posibles_valores: []
contenido en verificado: []
debug 3
ERROR ESTA VARIABLE NO HA SIDO ASIGNADA
exitMetodo1
ERROR METODO NO VALIDO
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO         
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global         
String          String          None            None            None            None            None            None            global         
Bool            Bool            None            None            None            None            None            None            global         
class           A               None            None            clase           None            None            None            global         
Int             var             None            None            variable        0               A               None            global         
Int             value           None            None            metodo          None            A               None            global         
SELF_TYPE       set_var         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               set_var         private        
SELF_TYPE       method1         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method1         private        
B               method2         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method2         private        
Int             num2            None            None            variable        None            A               method2         private        
Int             x               None            None            variable        None            A               method2         private        
C               method3         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method3         private        
Int             x               None            None            variable        None            A               method3         private        
D               method4         None            None            metodo          None            A               None            global         
Int             num1            None            None            variable        None            A               method4         private        
Int             num2            None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
Int             x               None            None            variable        None            A               method4         private        
E               method5         None            None            metodo          None            A               None            global         
Int             num             None            None            variable        None            A               method5         private        
Int             x               None            None            variable        None            A               method5         private        
Int             y               None            None            variable        None            A               method5         private        
class           Main            None            None            clase           None            IO              None            global         
String          char            None            None            variable        empty string    Main            None            global         
A               avar            None            None            class           None            Main            None            global         
A               a_var           None            None            class           None            Main            None            global         
Bool            flag            None            None            variable        False           Main            None            global         
Bool            is_even         None            None            metodo          None            Main            None            global         
Int             num             None            None            variable        None            Main            is_even         private        
Int             x               None            None            variable        None            Main            is_even         private        
Object          main            None            None            metodo          None            Main            None            global         
self._tabla_simbolos._error_in_code: True
TEST
funciones de clase A: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
**********************

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>