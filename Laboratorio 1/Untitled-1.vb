
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
A
enter correcto 1
**********************
correcto 1
var:Int<-0;
nuevas clases agregadas: ['A']
var
asigned_type: Int
**********************
**********************
metodo1
value():Int{var};
los ids: 1
los tipoVariables: 1
el pinche id: var
exp_context
var
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
**********************
correcto 2 MULAAA
var<-num;
los ids: var, num
*********************
verificamos si esta en el mismo ambito
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': 0, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: var
tipo_del_posible: Int
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: set_var
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'set_var', 'ambito': 'private'}]
id_del_posible: num
tipo_del_posible: Int
en_metodo_del_posible: set_var
ambito_del_posible: private
metodo_actual: set_var
clase_padre_actual: A
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: num
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
exit correcto 2
enter correcto 8
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method1(num:Int):SELF_TYPE{self};
los ids: 2
los tipoVariables: 2
nombre del metodo: method1
tipo del metodo: SELF_TYPE
id_metodo???????? : num
**********************
enter correcto 8
correcto 8
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method2(num1:Int,num2:Int):B{(letx:Intin{x<-num1+num2;(newB).set_var(x);})};
los ids: 3
los tipoVariables: 3
el pinche id: (letx:Intin{x<-num1+num2;(newB).set_var(x);})
nombre del metodo: method2
tipo del metodo: B
id_metodo???????? : num1
id_metodo???????? : num2
**********************
metodo3
(letx:Intin{x<-num1+num2;(newB).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num1+num2;(newB).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED355C9D40>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-num1+num2;(newB).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num1+num2;(newB).set_var(x);}
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
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: num1+num2;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED35ED49E0>]
numero de operaciones: 1
posible id en operacion: num1
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
valor1: num1
valor2: num2;
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
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newB
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method3(num:Int):C{(letx:Intin{x<-~num;(newC).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Intin{x<-~num;(newC).set_var(x);})
nombre del metodo: method3
tipo del metodo: C
id_metodo???????? : num
**********************
metodo3
(letx:Intin{x<-~num;(newC).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-~num;(newC).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED355C8D00>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-~num;(newC).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-~num;(newC).set_var(x);}
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
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
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
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
pasamos por el : num
debug 2
CORRECTO, se puede utilizar la variable por ser una variable global
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
pasamos por el : num
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1, 1, 1]
*************************
exit correcto 4
**********************
metodo3
(newC).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method4(num1:Int,num2:Int):D{ifnum2<num1then(letx:Intin{x<-num1-num2;(newD).set_var(x);})else(letx:Intin{x<-num2-num1;(newD).set_var(x);})fi};
los ids: 3
los tipoVariables: 3
el pinche id: ifnum2<num1then(letx:Intin{x<-num1-num2;(newD).set_var(x);})else(letx:Intin{x<-num2-num1;(newD).set_var(x);})fi
nombre del metodo: method4
tipo del metodo: D
id_metodo???????? : num1
id_metodo???????? : num2
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35F640B0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35F644A0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35F65A80>]
**********************
metodo11
expre en metodo11: num2<num1
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED35F64350>]
numero de operaciones: 1
posible id en operacion: num2
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: num2
valor2: num1
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
metodo3
(letx:Intin{x<-num1-num2;(newD).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 252 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num1-num2;(newD).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED35E810C0>]
let_tipo: [339 72 229 72 252 72 188 45 41 28]
let_expr
{x<-num1-num2;(newD).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num1-num2;(newD).set_var(x);}
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
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
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
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: num1-num2;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED35F649E0>]
numero de operaciones: 1
posible id en operacion: num1
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: num1
valor2: num2;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
exit correcto 4
**********************
metodo3
(newD).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 252 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 252 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newD
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
metodo3
(letx:Intin{x<-num2-num1;(newD).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 259 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num2-num1;(newD).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED355BE8C0>]
let_tipo: [339 72 229 72 259 72 188 45 41 28]
let_expr
{x<-num2-num1;(newD).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num2-num1;(newD).set_var(x);}
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
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method4
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
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
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
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
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: num2-num1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED35F65770>]
numero de operaciones: 1
posible id en operacion: num2
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: num2
valor2: num1;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
exit correcto 4
**********************
metodo3
(newD).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 259 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 259 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newD
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
TERMINA METODO4
**********************
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method5(num:Int):E{(letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);})
nombre del metodo: method5
tipo del metodo: E
id_metodo???????? : num
**********************
metodo3
(letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Int<-1in{(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);(newE).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED3608CD00>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED3608C980>]
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
**********************
metodo3
(lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool);
hay_not: None
posible_inicializar: None
posible_expr: [229 72 301 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: lety:Int<-1inwhiley<=numloop{x<-x*y;y<-y+1;}pool
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED360B3600>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED360B3AC0>]
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
**********************
metodo5
metodo11
expre en metodo11: y<=num
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED3605E7A0>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: y
valor2: num
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
entramos a el _en_while_cr5
correcto
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
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: A
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
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
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: x*y;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED3605F290>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: x
valor2: y;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
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
contenido en verificado: [1]
**********************
metodo11
expre en metodo11: y+1;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED3605F680>]
numero de operaciones: 1
posible id en operacion: y
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: y
valor2: 1;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 1 es un Int
exit correcto 4
**********************
exit metodo3
metodo3
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newE
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
**********************
entre test main
B
inherits: A
**********************
metodo1
method5(num:Int):E{(letx:Intin{x<-num*num;(newE).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Intin{x<-num*num;(newE).set_var(x);})
nombre del metodo: method5
tipo del metodo: E
id_metodo???????? : num
**********************
metodo3
(letx:Intin{x<-num*num;(newE).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num*num;(newE).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED35E5B1C0>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-num*num;(newE).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num*num;(newE).set_var(x);}
**********************
enter correcto 4
contenido correcto 4: x<-num*num;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: B
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: num*num;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36124C80>]
numero de operaciones: 1
posible id en operacion: num
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: num
valor2: num;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: True
exit correcto 4
**********************
metodo3
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newE
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
**********************
entre test main
C
inherits: B
**********************
metodo1
method6(num:Int):A{(letx:Intin{x<-~num;(newA).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Intin{x<-~num;(newA).set_var(x);})
nombre del metodo: method6
tipo del metodo: A
id_metodo???????? : num
**********************
metodo3
(letx:Intin{x<-~num;(newA).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-~num;(newA).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED35E93D40>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-~num;(newA).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-~num;(newA).set_var(x);}
**********************
enter correcto 4
contenido correcto 4: x<-~num;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method6
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: C
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1]
**********************
metodo12
en metodo12: ~num;
posible_id: num
posible_expr: None
se tiene un ID
posible_id: num
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'set_var', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method1', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'num', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}]
pasamos por el : num
pasamos por el : num
pasamos por el : num
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
(newA).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newA
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
method5(num:Int):E{(letx:Intin{x<-num*num*num;(newE).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Intin{x<-num*num*num;(newE).set_var(x);})
nombre del metodo: method5
tipo del metodo: E
id_metodo???????? : num
**********************
metodo3
(letx:Intin{x<-num*num*num;(newE).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num*num*num;(newE).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED355C8340>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-num*num*num;(newE).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num*num*num;(newE).set_var(x);}
**********************
enter correcto 4
contenido correcto 4: x<-num*num*num;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method5', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method6
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
se le puede asignar a la variable por ser una variable global
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method5
clase_padre_actual: C
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1, 1]
**********************
metodo11
expre en metodo11: num*num*num;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36125E70>, <Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36126030>]
numero de operaciones: 2
posible id en operacion: num
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
exit correcto 4
**********************
metodo3
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newE
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
**********************
entre test main
D
inherits: B
**********************
metodo1
method7(num:Int):Bool{(letx:Int<-numinifx<0thenmethod7(~x)elseif0=xthentrueelseif1=xthenfalseelseif2=xthenfalseelsemethod7(x-3)fifififi)};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Int<-numinifx<0thenmethod7(~x)elseif0=xthentrueelseif1=xthenfalseelseif2=xthenfalseelsemethod7(x-3)fifififi)
nombre del metodo: method7
tipo del metodo: Bool
id_metodo???????? : num
**********************
metodo3
(letx:Int<-numinifx<0thenmethod7(~x)elseif0=xthentrueelseif1=xthenfalseelseif2=xthenfalseelsemethod7(x-3)fifififi)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Int<-numinifx<0thenmethod7(~x)elseif0=xthentrueelseif1=xthenfalseelseif2=xthenfalseelsemethod7(x-3)fifififi
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED36055B40>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED36054D40>]
let_tipo: None
let_expr
num
ifx<0thenmethod7(~x)elseif0=xthentrueelseif1=xthenfalseelseif2=xthenfalseelsemethod7(x-3)fifififi
++++++++++++++++++++++++++++++++++
valor_del_let: x
valor_del_tipo: Int
asignacion a la variable en let NUM: None
asignacion a la variable en let ID: num
asignacion a la variable en let STRING: None
asignacion a la variable en let BOOL: None
debug 1
CORRECTO, se puede utilizar la variable por estar en el mismo metodo
contenido en verificado: [1]
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FC190>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FC580>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FC900>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD150>]
**********************
metodo11
expre en metodo11: x<0
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FC350>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: x
valor2: 0
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 0 es un Int
metodo3
(~x)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 252 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: ~x
**********************
metodo12
en metodo12: ~x
posible_id: x
posible_expr: None
se tiene un ID
posible_id: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'D', 'en_metodo': 'method7', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
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
exit metodo3
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD0E0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD380>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD540>]
**********************
metodo11
expre en metodo11: 0=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FD230>]
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
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD690>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD5B0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD850>]
**********************
metodo11
expre en metodo11: 1=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FD700>]
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
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD930>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FD9A0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FDD20>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FE110>]
**********************
metodo11
expre en metodo11: 2=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FDA10>]
numero de operaciones: 1
posible id en operacion: None
posible_num en operacion: 2
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
VALOR 1 EN IF ES NUMERO
POSIBLE NUM DE VALOR1: None
POSIBLE ID DE VALOR2: x
TENEMOSSSSSSS
valor1: 2
valor2: x
se le puede asignar a la variable por estar en el mismo metodo
el tipo es el mismo al de la tipo_se_ asignada, se pede hacer
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
metodo3
(x-3)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 259 72 259 72 259 72 259 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: x-3
**********************
metodo11
expre en metodo11: x-3
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FE180>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: x
valor2: 3
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 3 es un Int
exit metodo3
TERMINA METODO4
**********************
TERMINA METODO4
**********************
TERMINA METODO4
**********************
TERMINA METODO4
**********************
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
**********************
entre test main
E
inherits: D
**********************
metodo1
method6(num:Int):A{(letx:Intin{x<-num/8;(newA).set_var(x);})};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Intin{x<-num/8;(newA).set_var(x);})
nombre del metodo: method6
tipo del metodo: A
id_metodo???????? : num
**********************
metodo3
(letx:Intin{x<-num/8;(newA).set_var(x);})
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Intin{x<-num/8;(newA).set_var(x);}
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED3600BFC0>]
let_tipo: [339 72 229 72 188 45 41 28]
let_expr
{x<-num/8;(newA).set_var(x);}
++++++++++++++++++++++++++++++++++
let_id: x
let_tipo: Int
let_expr: {x<-num/8;(newA).set_var(x);}
**********************
enter correcto 4
contenido correcto 4: x<-num/8;
id_a_asignar: x
tabla posible id a asignar: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'D', 'en_metodo': 'method7', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'E', 'en_metodo': 'method6', 'ambito': 'private'}]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method2
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method3
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method4
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method6
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method5
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method7
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
id_del_posible: x
tipo_del_posible: Int
en_metodo_del_posible: method6
ambito_del_posible: private
metodo_actual: method6
clase_padre_actual: E
se le puede asignar a la variable por estar en el mismo metodo
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
tipo_del_posible: Int
tipo_del_asignable: Int
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
DATOS DEL ASIGNABLE
_variable_asiganda: x
tipo_de_asignada: Int
_se_asigna_a_variable: True
contenido en verificado: [1, 1]
**********************
metodo11
expre en metodo11: num/8;
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED361FEFF0>]
numero de operaciones: 1
posible id en operacion: num
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: num
valor2: 8;
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 8 es un Int
exit correcto 4
**********************
metodo3
(newA).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newA
**********************
metodo2
se ignora set_var(x);
exit metodo2
exit metodo3
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
**********************
entre test main
Main
inherits: IO
enter correcto 1
**********************
correcto 1
char:String;
nuevas clases agregadas: ['A', 'B', 'C', 'D', 'E', 'Main']
char
asigned_type: String
**********************
enter correcto 1
**********************
correcto 1
avar:A;
nuevas clases agregadas: ['A', 'B', 'C', 'D', 'E', 'Main']
avar
asigned_type: A
**********************
enter correcto 1
**********************
correcto 1
a_var:A;
nuevas clases agregadas: ['A', 'B', 'C', 'D', 'E', 'Main']
a_var
asigned_type: A
**********************
enter correcto 1
**********************
correcto 1
flag:Bool<-true;
nuevas clases agregadas: ['A', 'B', 'C', 'D', 'E', 'Main']
flag
asigned_type: Bool
**********************
**********************
metodo1
is_even(num:Int):Bool{(letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi)};
los ids: 2
los tipoVariables: 2
el pinche id: (letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi)
nombre del metodo: is_even
tipo del metodo: Bool
id_metodo???????? : num
**********************
metodo3
(letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: letx:Int<-numinifx<0thenis_even(~x)elseif0=xthentrueelseif1=xthenfalseelseis_even(x-2)fififi
**********************
metodo10
++++++++++++++++++++++++++++++++++++
LET EXPR
let_id: [<antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED355D2900>, <antlr4.tree.Tree.TerminalNodeImpl object at 0x000001ED35E65DC0>]
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
contenido en verificado: [1]
**********************
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278350>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278190>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362784A0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362785F0>]
**********************
metodo11
expre en metodo11: x<0
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED362780B0>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: x
valor2: 0
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 0 es un Int
metodo3
(~x)
hay_not: None
posible_inicializar: None
posible_expr: [229 72 252 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: ~x
**********************
metodo12
en metodo12: ~x
posible_id: x
posible_expr: None
se tiene un ID
posible_id: x
tabla_posibles_valores: [{'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method2', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method3', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method4', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'A', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'B', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method6', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'C', 'en_metodo': 'method5', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'D', 'en_metodo': 'method7', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'E', 'en_metodo': 'method6', 'ambito': 'private'}, {'tipo': 'Int', 'id': 'x', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': 'is_even', 'ambito': 'private'}]
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
pasamos por el : x
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
exit metodo3
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362787B0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278580>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278970>]
**********************
metodo11
expre en metodo11: 0=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36278820>]
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
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362789E0>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278A50>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278C80>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36278CF0>]
**********************
metodo11
expre en metodo11: 1=x
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36278B30>]
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
posible_expr: [229 72 259 72 259 72 259 72 346 72 229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: x-2
**********************
metodo11
expre en metodo11: x-2
lista de operaciones: [<Proy1Parser.Proy1Parser.OperacionContext object at 0x000001ED36278DD0>]
numero de operaciones: 1
posible id en operacion: x
posible_num en operacion: None
antes se asigno una variable: True
el tipo de variable previamente asignada: Int
entramos en el else?
valor1: x
valor2: 2
SE ENCUENTRA EN TABLA?
valor1_en_tabla: True
valor2_en_tabla: False
CORRECTO, el valor 2 es un Int
exit metodo3
TERMINA METODO4
**********************
TERMINA METODO4
**********************
TERMINA METODO4
**********************
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
**********************
metodo1
main():Object{{avar<-(newA);avar.set_var(2);out_int(avar.value());ifis_even(avar.value())thenout_string(" es par!\n")elseout_string(" es impar!\n")fi;a_var<-(newA).set_var(3);avar<-(newB).method2(avar.value(),a_var.value());out_int(avar.value());out_string("\n");avar<-(newC).method6(avar.value());out_int(avar.value());out_string("\n");a_var<-(newA).set_var(5);avar<-(newD).method4(avar.value(),a_var.value());out_int(avar.value());out_string("\n");avar.set_var(5);avar<-(newC)@A.method5(avar.value());out_int(avar.value());out_string("\n");avar.set_var(6);avar<-(newC)@B.method5(avar.value());out_int(avar.value());out_string("\n");}};
los ids: 1
los tipoVariables: 1
el pinche id: avar.set_var(2);
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: ifis_even(avar.value())thenout_string(" es par!\n")elseout_string(" es impar!\n")fi;
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: out_string
el pinche id: ("\n");
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: out_string
el pinche id: ("\n");
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: out_string
el pinche id: ("\n");
el pinche id: avar.set_var(5);
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: out_string
el pinche id: ("\n");
el pinche id: avar.set_var(6);
el pinche id: out_int
el pinche id: (avar.value());
el pinche id: out_string
el pinche id: ("\n");
exp_context
[72 188 45 41 28]
**********************
enter correcto 4
contenido correcto 4: avar<-(newA);
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newA);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: None
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newA
**********************
exit metodo3
exit correcto 4
**********************
metodo9
CONTENIDO METODO 9: avar.set_var(2);
**********************
metodo2
metodo2: set_var(2);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3627BAE0>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'A', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: set_var
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
la mera expresion: 2
posible_string: None
posible_num: 2
posible_bool: None
expresion: 2
no se paso en verificar tabla para estos
exit metodo2
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo4
expresiones del if: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F4B30>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F4A50>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F4F90>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F5230>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F6B90>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F68F0>]
**********************
metodo3
(avar.value())
hay_not: None
posible_inicializar: None
posible_expr: [229 72 245 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
(" es par!\n")
hay_not: None
posible_inicializar: None
posible_expr: [229 72 252 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: " es par!\n"
**********************
exit metodo3
metodo3
(" es impar!\n")
hay_not: None
posible_inicializar: None
posible_expr: [229 72 259 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: " es impar!\n"
**********************
exit metodo3
TERMINA METODO4
**********************
enter correcto 4
contenido correcto 4: a_var<-(newA).set_var(3);
id_a_asignar: a_var
tabla posible id a asignar: [{'tipo': 'A', 'id': 'a_var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: a_var
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newA).set_var(3);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newA
**********************
metodo2
se ignora set_var(3);
exit metodo2
exit metodo3
exit correcto 4
**********************
enter correcto 4
contenido correcto 4: avar<-(newB).method2(avar.value(),a_var.value());
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newB).method2(avar.value(),a_var.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newB
**********************
metodo2
se ignora method2(avar.value(),a_var.value());
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
se ignora value()
exit metodo2
metodo9
CONTENIDO METODO 9: a_var.value()
**********************
metodo2
se ignora value()
exit metodo2
exit metodo2
exit metodo3
exit correcto 4
**********************
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
enter correcto 4
contenido correcto 4: avar<-(newC).method6(avar.value());
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newC).method6(avar.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
**********************
metodo2
se ignora method6(avar.value());
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
se ignora value()
exit metodo2
exit metodo2
exit metodo3
exit correcto 4
**********************
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
enter correcto 4
contenido correcto 4: a_var<-(newA).set_var(5);
id_a_asignar: a_var
tabla posible id a asignar: [{'tipo': 'A', 'id': 'a_var', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: a_var
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newA).set_var(5);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newA
**********************
metodo2
se ignora set_var(5);
exit metodo2
exit metodo3
exit correcto 4
**********************
enter correcto 4
contenido correcto 4: avar<-(newD).method4(avar.value(),a_var.value());
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo3
(newD).method4(avar.value(),a_var.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newD
**********************
metodo2
se ignora method4(avar.value(),a_var.value());
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
se ignora value()
exit metodo2
metodo9
CONTENIDO METODO 9: a_var.value()
**********************
metodo2
se ignora value()
exit metodo2
exit metodo2
exit metodo3
exit correcto 4
**********************
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
metodo9
CONTENIDO METODO 9: avar.set_var(5);
**********************
metodo2
metodo2: set_var(5);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632C820>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'A', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: set_var
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
la mera expresion: 5
posible_string: None
posible_num: 5
posible_bool: None
expresion: 5
no se paso en verificar tabla para estos
exit metodo2
enter correcto 4
contenido correcto 4: avar<-(newC)@A.method5(avar.value());
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo15
(newC)@A.method5(avar.value());
hay_not: None
posible_inicializar: [446 122 187 45 41 28]
posible_id: A
posible_expr: None
posible_metodo: [<Proy1Parser.Proy1Parser.Metodo2Context object at 0x000001ED3632C890>]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
el id/clase: A
el metodo: method5(avar.value());
el tipo del inicializar: C
metodo2
se ignora por el metodo15 method5(avar.value());
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
se ignora por el metodo15 value()
exit metodo2
exit metodo2
exit metodo15
exit correcto 4
**********************
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
metodo9
CONTENIDO METODO 9: avar.set_var(6);
**********************
metodo2
metodo2: set_var(6);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632D3F0>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'A', 'id': 'set_var', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: set_var
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
la mera expresion: 6
posible_string: None
posible_num: 6
posible_bool: None
expresion: 6
no se paso en verificar tabla para estos
exit metodo2
enter correcto 4
contenido correcto 4: avar<-(newC)@B.method5(avar.value());
id_a_asignar: avar
tabla posible id a asignar: [{'tipo': 'A', 'id': 'avar', 'size': None, 'offset': None, 'definicion': 'variable', 'valor': None, 'padre': 'Main', 'en_metodo': None, 'ambito': 'global'}]
id_del_posible: avar
tipo_del_posible: A
en_metodo_del_posible: None
ambito_del_posible: global
metodo_actual: main
clase_padre_actual: Main
se le puede asignar a la variable por ser una variable global
CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE
contenido en verificado: [1, 1]
**********************
metodo15
(newC)@B.method5(avar.value());
hay_not: None
posible_inicializar: [446 122 187 45 41 28]
posible_id: B
posible_expr: None
posible_metodo: [<Proy1Parser.Proy1Parser.Metodo2Context object at 0x000001ED3632D460>]
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
el id/clase: B
el metodo: method5(avar.value());
el tipo del inicializar: C
metodo2
se ignora por el metodo15 method5(avar.value());
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
se ignora por el metodo15 value()
exit metodo2
exit metodo2
exit metodo15
exit correcto 4
**********************
metodo3
(avar.value());
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: avar.value()
**********************
metodo9
CONTENIDO METODO 9: avar.value()
**********************
metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
Tabla posibles valores : [{'tipo': 'Int', 'id': 'value', 'size': None, 'offset': None, 'definicion': 'metodo', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}]
valor en _variable_que_se_opera: ['avar', 'A']
var que se opera: avar
clase_en_que_se_opera: A
nombre_metodo: value
lista_metodos: ['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO, el metodo se encuentra en la clase A
contenido en verificado: [1]
antes del for
-------------------------------
exit metodo2
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [229 72 188 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
exitMetodo1
limpiar variable en separado
**********************
exitTest_main
self._tabla_simbolos._error_in_code: False
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
class           A               None            None            clase           None            None            None            global
Int             var             None            None            variable        0               A               None            global
Int             value           None            None            metodo          None            A               None            global
A               set_var         None            None            metodo          None            A               None            global
Int             num             None            None            variable        None            A               set_var         private
A               method1         None            None            metodo          None            A               None            global
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
class           B               None            None            clase           None            A               None            global
E               method5         None            None            metodo          None            B               None            global
Int             num             None            None            variable        None            B               method5         private
Int             x               None            None            variable        None            B               method5         private
class           C               None            None            clase           None            B               None            global
A               method6         None            None            metodo          None            C               None            global
Int             num             None            None            variable        None            C               method6         private
Int             x               None            None            variable        None            C               method6         private
E               method5         None            None            metodo          None            C               None            global
Int             num             None            None            variable        None            C               method5         private
Int             x               None            None            variable        None            C               method5         private
class           D               None            None            clase           None            B               None            global
Bool            method7         None            None            metodo          None            D               None            global
Int             num             None            None            variable        None            D               method7         private
Int             x               None            None            variable        None            D               method7         private
class           E               None            None            clase           None            D               None            global
A               method6         None            None            metodo          None            E               None            global
Int             num             None            None            variable        None            E               method6         private
Int             x               None            None            variable        None            E               method6         private
class           Main            None            None            clase           None            IO              None            global
String          char            None            None            variable        empty string    Main            None            global
A               avar            None            None            variable        None            Main            None            global
A               a_var           None            None            variable        None            Main            None            global
Bool            flag            None            None            variable        False           Main            None            global
Bool            is_even         None            None            metodo          None            Main            None            global
Int             num             None            None            variable        None            Main            is_even         private
Int             x               None            None            variable        None            Main            is_even         private
Object          main            None            None            metodo          None            Main            None            global
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newB).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newB
B
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35ED7AE0>]
metodos: None
B
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
B si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'B', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: A
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada A
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newC).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newC
C
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35ED62D0>]
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newD).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 252 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 252 72 188 45 41 28]
el inicializar: newD
D
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35F64D60>]
metodos: None
D
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
D si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'D', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newD).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 259 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 259 72 188 45 41 28]
el inicializar: newD
D
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED35F653F0>]
metodos: None
D
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
D si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'D', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
**********************
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newE
E
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3605FA00>]
metodos: None
E
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
E si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'E', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'D', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: D
['method6']
['method7']
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada D
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newE
E
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36124900>]
metodos: None
E
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
E si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'E', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'D', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: D
['method6']
['method7']
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada D
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newA).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newA
A
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361252A0>]
metodos: None
A
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
A si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'A', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': None, 'en_metodo': None, 'ambito': 'global'}
padre de la clase: None
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
[]
CORRECTO metodo se encuentra en clase A
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newE).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newE
E
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED36126420>]
metodos: None
E
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
E si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'E', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'D', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: D
['method6']
['method7']
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada D
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
**********************
exit metodo3
metodo3
**********************
exit metodo3
exit metodo3
metodo3
**********************
metodo3
HAY UNA INICIALIZAR
(newA).set_var(x);
hay_not: None
posible_inicializar: [228 72 301 72 346 72 229 72 188 45 41 28]
posible_expr: None
posible_metodo: [234 72 301 72 346 72 229 72 188 45 41 28]
el inicializar: newA
A
True
**********************
metodo2: set_var(x);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED361FF370>]
metodos: None
A
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
A si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'A', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': None, 'en_metodo': None, 'ambito': 'global'}
padre de la clase: None
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
[]
CORRECTO metodo se encuentra en clase A
exit metodo2
exit metodo3
exit metodo3
metodo3
**********************
metodo3
**********************
exit metodo3
metodo3
**********************
exit metodo3
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newA);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: None
el inicializar: newA
**********************
exit metodo3
metodo2: set_var(2);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3627BAE0>]
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
exit metodo3
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
exit metodo3
metodo3
**********************
exit metodo3
metodo3
**********************
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newA).set_var(3);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
el inicializar: newA
A
True
**********************
metodo2: set_var(3);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F6420>]
metodos: None
A
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
A si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'A', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': None, 'en_metodo': None, 'ambito': 'global'}
padre de la clase: None
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
[]
CORRECTO metodo se encuentra en clase A
exit metodo2
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newB).method2(avar.value(),a_var.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
el inicializar: newB
B
True
**********************
metodo2: method2(avar.value(),a_var.value());
nombre metodo: method2
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F5E70>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F5930>]
metodos: None
B
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
B si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'B', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: A
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada A
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
B
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
B si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'B', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: A
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada A
exit metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
B
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
B si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'B', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'A', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: A
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada A
exit metodo2
exit metodo2
exit metodo3
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
exit metodo3
metodo3
**********************
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newC).method6(avar.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
el inicializar: newC
C
True
**********************
metodo2: method6(avar.value());
nombre metodo: method6
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F70D0>]
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
CORRECTO metodo se encuentra en clase C
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo2
exit metodo3
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
exit metodo3
metodo3
**********************
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newA).set_var(5);
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
el inicializar: newA
A
True
**********************
metodo2: set_var(5);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F7A00>]
metodos: None
A
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
A si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'A', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': None, 'en_metodo': None, 'ambito': 'global'}
padre de la clase: None
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
[]
CORRECTO metodo se encuentra en clase A
exit metodo2
exit metodo3
metodo3
HAY UNA INICIALIZAR
(newD).method4(avar.value(),a_var.value());
hay_not: None
posible_inicializar: [228 122 187 45 41 28]
posible_expr: None
posible_metodo: [234 122 187 45 41 28]
el inicializar: newD
D
True
**********************
metodo2: method4(avar.value(),a_var.value());
nombre metodo: method4
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F7D10>, <Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED362F7ED0>]
metodos: None
D
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
D si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'D', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
D
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
D si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'D', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
D
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
D si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'D', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method7']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo2
exit metodo3
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
exit metodo3
metodo3
**********************
exit metodo3
metodo2: set_var(5);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632C820>]
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
metodo 15 segunda corrida
(newC)@A.method5(avar.value());
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
el id/clase: A
el metodo: method5(avar.value());
el tipo del inicializar: C
metodo2: method5(avar.value());
nombre metodo: method5
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632CBA0>]
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
estamos viendo un @
la class activa: C
la class heredada: B
clase a buscar: A
el objeto de la clase: {'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
CORRECTO: C hereda de la clase A
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo2
exit metodo15 segunda corrida
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo3
metodo3
**********************
exit metodo3
metodo2: set_var(6);
nombre metodo: set_var
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632D3F0>]
metodos: None
None
False
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
exit metodo2
metodo 15 segunda corrida
(newC)@B.method5(avar.value());
IGNORAR TODO NEW
HAY UNA INICIALIZAR
el inicializar: newC
el id/clase: B
el metodo: method5(avar.value());
el tipo del inicializar: C
metodo2: method5(avar.value());
nombre metodo: method5
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x000001ED3632D700>]
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
estamos viendo un @
la class activa: C
la class heredada: B
clase a buscar: B
el objeto de la clase: {'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
CORRECTO: C hereda de la clase B
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo2
exit metodo15 segunda corrida
metodo3
**********************
metodo2: value()
nombre metodo: value
expresiones: []
metodos: None
C
True
<TablaSimbolos.TablaSimbolos object at 0x000001ED35E89840>
C si existe en la tabla de simbolos
objeto de la clase
{'tipo': 'class', 'id': 'C', 'size': None, 'offset': None, 'definicion': 'clase', 'valor': None, 'padre': 'B', 'en_metodo': None, 'ambito': 'global'}
padre de la clase: B
['method6', 'method5']
['method5']
['method5']
['value', 'set_var', 'method1', 'method2', 'method3', 'method4', 'method5']
CORRECTO metodo se encuentra en clase heredada B
exit metodo2
exit metodo3
metodo3
**********************
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
self._tabla_simbolos._error_in_code: False
LISTA ERRORES

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>