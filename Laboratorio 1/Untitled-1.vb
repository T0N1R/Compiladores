
C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>python pruebaListener.py
*************************
entre test main
Main
inherits: IO
**********************
metodo1
los ids: 1
los tipoVariables: 1
exp_context
out_string
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
SELF_TYPE       main            None            None            metodo          None            Main            None            global
**********************
metodo3
((newObject).type_name().substr(4,1)).out_string((isvoidself).type_name().substr(1,3));
hay_not: None
posible_inicializar: None
posible_expr: [228 72 187 45 41 28]
posible_metodo: [233 72 187 45 41 28]
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: (newObject).type_name().substr(4,1)
posible_metodo: out_string((isvoidself).type_name().substr(1,3));
metodos en posible_expr: substr
verificar metodos
['type_name', 'substr']
metodos en posible_metodo: out_string
type_name
substr
**********************
metodo3
(newObject).type_name().substr(4,1)
hay_not: None
posible_inicializar: [227 72 228 72 187 45 41 28]
posible_expr: None
posible_metodo: [233 72 228 72 187 45 41 28]
HAY UNA INICIALIZAR
el inicializar: newObject
**********************
metodo2
metodo2: type_name().substr(4,1)
nombre metodo: type_name
expresiones: []
metodos: [213 233 72 228 72 187 45 41 28]
metodo2
metodo2: substr(4,1)
nombre metodo: substr
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000201FD22D690>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000201FD22FA70>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
contenido en verificado: []
whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
CORRECTO : Es un metodo permitido
antes del for
-------------------------------
la mera expresion: 4
posible_string: None
posible_num: 4
posible_bool: None
expresion: 4
no se paso en verificar tabla para estos
la mera expresion: 1
posible_string: None
posible_num: 1
posible_bool: None
expresion: 1
no se paso en verificar tabla para estos
exit metodo3
metodo2
metodo2: out_string((isvoidself).type_name().substr(1,3));
nombre metodo: out_string
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000201FD22F6F0>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
contenido en verificado: []
whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
CORRECTO : Es un metodo permitido
antes del for
-------------------------------
la mera expresion: (isvoidself).type_name().substr(1,3)
posible_string: None
posible_num: None
posible_bool: None
expresion: (isvoidself).type_name().substr(1,3)
vamos a entrar con la info
expresion.getText(): (isvoidself).type_name().substr(1,3)
nombre_metodo: out_string
metodos permitidos:['abort', 'out_string', 'out_int', 'type_name', 'substr']
entramos?
contenido en verificado: []
whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
debug 3
ERROR ESTA VARIABLE NO HA SIDO ASIGNADA
metodo3
(isvoidself).type_name().substr(1,3)
hay_not: None
posible_inicializar: [227 72 200 233 72 187 45 41 28]
posible_expr: None
posible_metodo: [233 72 200 233 72 187 45 41 28]
HAY UNA INICIALIZAR
el inicializar: isvoidself
**********************
metodo2
metodo2: type_name().substr(1,3)
nombre metodo: type_name
expresiones: []
metodos: [213 233 72 200 233 72 187 45 41 28]
metodo2
metodo2: substr(1,3)
nombre metodo: substr
expresiones: [<Proy1Parser.Proy1Parser.ExprContext object at 0x00000201FD2D1620>, <Proy1Parser.Proy1Parser.ExprContext object at 0x00000201FD2D1690>]
metodos: None
PASANDO POR VERIFICAR EN TABLAAAAAAA
entramos?
contenido en verificado: []
whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
CORRECTO : Es un metodo permitido
antes del for
-------------------------------
la mera expresion: 1
posible_string: None
posible_num: 1
posible_bool: None
expresion: 1
no se paso en verificar tabla para estos
la mera expresion: 3
posible_string: None
posible_num: 3
posible_bool: None
expresion: 3
no se paso en verificar tabla para estos
exit metodo3
exit metodo3
metodo3
("\n");
hay_not: None
posible_inicializar: None
posible_expr: [228 72 187 45 41 28]
posible_metodo: None
++++++++++++++++++++++++++++++++++++++++++
el posible_expr: "\n"
**********************
exit metodo3
exitMetodo1
ERROR METODO NO VALIDO
**********************
exitTest_main
TIPO            ID              SIZE            OFFSET          DEFINICION      VALOR           PADRE           EN METODO       AMBITO
---------------------------------------------------------------------------------------------------------------------------------------
Int             Int             None            None            None            None            None            None            global
String          String          None            None            None            None            None            None            global
Bool            Bool            None            None            None            None            None            None            global
class           Main            None            None            clase           None            IO              None            global
SELF_TYPE       main            None            None            metodo          None            Main            None            global
self._tabla_simbolos._error_in_code: True
TEST
funciones de clase A: []
**********************
LISTA ERRORES
[]

C:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1>