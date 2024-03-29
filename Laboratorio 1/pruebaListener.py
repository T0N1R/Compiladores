import sys
from antlr4 import *
from antlr4.tree.Trees import TerminalNode
from antlr4.error.ErrorListener import ErrorListener
from Proy1Lexer import Proy1Lexer
from Proy1Parser import Proy1Parser
from Proy1Listener import Proy1Listener
from TablaSimbolos import TablaSimbolos
from funcionesVerificacion import *
from tkinter import *
from tkinter import filedialog
from tkinter import font
class MyListener(Proy1Listener):
    
    def __init__(self):
        self._tabla_simbolos = TablaSimbolos()
        
        self._tabla_simbolos.agregar_simbolo("Int", "Int", 4, self._tabla_simbolos.agregar_offset(4), None, None, None)
        self._tabla_simbolos.agregar_simbolo("String", "String", 5, self._tabla_simbolos.agregar_offset(5), None, None, None)
        self._tabla_simbolos.agregar_simbolo("Bool", "Bool", 2, self._tabla_simbolos.agregar_offset(2), None, None, None)
        self._tabla_simbolos.agregar_simbolo("out_string", "String", 6, self._tabla_simbolos.agregar_offset(6), "metodo", None, None)
        self._tabla_simbolos.agregar_simbolo("out_int", "Int", 4, self._tabla_simbolos.agregar_offset(4), "metodo", None, None)
        
    def imprimir_tabla_simbolos(self):
        print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %('TIPO', 'ID', 'SIZE', 'OFFSET', 'DEFINICION', 'VALOR', 'PADRE', 'EN METODO', 'AMBITO'))
        print("---------------------------------------------------------------------------------------------------------------------------------------")
        for x in self._tabla_simbolos._simbolos:
            print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %(x['tipo'], x['id'], x['size'], x['offset'], x['definicion'], x['valor'], x['padre'], x['en_metodo'], x['ambito']))
        
    # print(f"self._tabla_simbolos._error_in_code: {self._tabla_simbolos._error_in_code}")
    
    def enterTest_main(self, ctx):
        print("entre test main")
        class_name = ctx.ID().getText()
        print(class_name)
        
        inhty = "vacio"
        if ctx.tipoVariable():
            inhty = ctx.tipoVariable().getText()
        
            print(f"inherits: {inhty}")
            
        allowed_for_main = ["Int", "String", "Bool", "IO"]
        
        if class_name == "Main":
            if inhty in allowed_for_main:
                self._tabla_simbolos.agregar_simbolo('class', class_name, 3, self._tabla_simbolos.agregar_offset(3), 'clase', None, inhty)
                self._tabla_simbolos._added_classes.append(class_name)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
            else:
                print(f"Clase Main no puede heredar de esta clase -> {inhty} <- (las clases básicas son Int, String, Bool, IO)")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"Clase Main no puede heredar de esta clase -> {inhty} <- (las clases básicas son Int, String, Bool, IO)")
            
        else:
            if inhty == "vacio":
                self._tabla_simbolos.agregar_simbolo('class', 3, self._tabla_simbolos.agregar_offset(3), None, 'clase', None, None)
                self._tabla_simbolos._added_classes.append(class_name)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
            else:
                self._tabla_simbolos.agregar_simbolo('class', 3, self._tabla_simbolos.agregar_offset(3), None, 'clase', None, inhty)
                self._tabla_simbolos._added_classes.append(class_name)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
                
    # Exit a parse tree produced by Proy1Parser#test_main.
    def exitTest_main(self, ctx:Proy1Parser.Test_mainContext):
        print("exitTest_main")
        #self.imprimir_tabla_simbolos()
        print(f"self._tabla_simbolos._error_in_code: {self._tabla_simbolos._error_in_code}")
        #print("TEST")
        lista_metodos = obtener_metodos_de_una_clase(self, "A")
        #print(f"funciones de clase A: {lista_metodos}")
        print("**********************")
        
    # Enter a parse tree produced by Proy1Parser#tipo_correcto_1.
    def enterTipo_correcto_1(self, ctx:Proy1Parser.Tipo_correcto_1Context):
        print("enter correcto 1")
        
        
        print("**********************")
            
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_1(self, ctx:Proy1Parser.Tipo_correcto_1Context):
        print("correcto 1")
        print(ctx.getText())
        # tipos basicos
        allowed_types = ["Int", "String", "Bool"]
        print(f"nuevas clases agregadas: {self._tabla_simbolos._added_classes}")
        
        # obtener id que se inicializa
        asigned_id = ctx.ID().getText()
        print(asigned_id)
        
        # obteneri tipo de variable que sera asignado
        asigned_type = ctx.tipoVariable().getText()
        
        # verificar si la variable ya fue inicializada
        if self._tabla_simbolos.id_en_tabla(asigned_id):
            #print("variable ya fue inicializada")
            #print(f"ERROR, variable {asigned_id} ya fue inicializada")
            
            verificacion  = verificar_en_mismo_ambito(self, asigned_id)
            
            if verificacion:
                print(f"verificacion es true, podemos agregar la variable {asigned_id}")
            
                print(f"asigned_type: {asigned_type}")
            
                if asigned_type in allowed_types or asigned_type in self._tabla_simbolos._added_classes:
                    
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                    
                    if asigned_type == 'String':
                        self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 5, self._tabla_simbolos.agregar_offset(5), 'variable', "empty string", clase_padre['id'])
                        #print("SE AGREGO A LA TABLA")
                        
                    if asigned_type == 'Int':
                        self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 4, self._tabla_simbolos.agregar_offset(4), 'variable', 0, clase_padre['id'])
                        #print("SE AGREGO A LA TABLA")
                        
                    if asigned_type == 'Bool':
                        self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 2, self._tabla_simbolos.agregar_offset(2), 'variable', False, clase_padre['id'])
                        #print("SE AGREGO A LA TABLA")
                    
                    """for x in self._tabla_simbolos._simbolos:
                        print(x)"""
                        
                    if asigned_type in self._tabla_simbolos._added_classes:
                        self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', None, clase_padre['id'])
                
                else:
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]

                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', None, clase_padre['id'])
                
            #sys.exit()
            
            
            #self._tabla_simbolos._error_in_current_method = True
            #self._tabla_simbolos._error_in_code = True
            #self._tabla_simbolos._lista_errores.append(f"ERROR, variable {asigned_id} ya fue inicializada")

            
        # si no ha sido inicializada, se verifica el tipo de variable y se agrega a la tabla de simbolos
        else:
            
            print(f"asigned_type: {asigned_type}")
            
            if asigned_type in allowed_types or asigned_type in self._tabla_simbolos._added_classes:
                
                clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                
                if asigned_type == 'String':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 5, self._tabla_simbolos.agregar_offset(5), 'variable', "empty string", clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                    
                if asigned_type == 'Int':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 4, self._tabla_simbolos.agregar_offset(4), 'variable', 0, clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                    
                if asigned_type == 'Bool':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, 2, self._tabla_simbolos.agregar_offset(2), 'variable', False, clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                
                """for x in self._tabla_simbolos._simbolos:
                    print(x)"""
                    
                if asigned_type in self._tabla_simbolos._added_classes:
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', None, clase_padre['id'])
            
            else:
                clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]

                self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', None, clase_padre['id'])
                #print("ERROR este tipo de variable no es permitido")
                #self._tabla_simbolos._error_in_current_method = True
                #self._tabla_simbolos._error_in_code = True
                
        #self.imprimir_tabla_simbolos()
        
            
            
        print("**********************")
        
    # Enter a parse tree produced by Proy1Parser#tipo_correcto_2.
    def enterTipo_correcto_2(self, ctx:Proy1Parser.Tipo_correcto_2Context):
        print("correcto 2 MULAAA")
        print(ctx.getText())
        print(f"los ids: {ctx.ID()[0].getText()}, {ctx.ID()[1].getText()}")
        print("*********************")
        
        variable1 = self._tabla_simbolos.id_en_tabla(ctx.ID()[0].getText())
        variable2 = self._tabla_simbolos.id_en_tabla(ctx.ID()[1].getText())

        if variable1 and variable2:
            print("verificamos si esta en el mismo ambito")
            
            tabla_posibles_id_a_asignar = self._tabla_simbolos.return_same_ids(ctx.ID()[0].getText())
            print(f"tabla posible id a asignar: {tabla_posibles_id_a_asignar}")
            
            # Chequear que haya algo en la lista
            if len(tabla_posibles_id_a_asignar) > 0:
                
                posibles_correctos = []
                
                for variable in tabla_posibles_id_a_asignar:
                    #POSIBLE
                    id_del_posible = variable['id']
                    tipo_del_posible = variable['tipo']
                    en_metodo_del_posible = variable['en_metodo']
                    ambito_del_posible = variable['ambito']
                    padre_del_posible = variable['padre']
                    
                    print(f"id_del_posible: {id_del_posible}")
                    print(f"tipo_del_posible: {tipo_del_posible}")
                    print(f"en_metodo_del_posible: {en_metodo_del_posible}")
                    print(f"ambito_del_posible: {ambito_del_posible}")
                    
                    #ACTUAL
                    metodo_actual = self._tabla_simbolos._current_method
                    clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                    
                    print(f"metodo_actual: {metodo_actual}")
                    print(f"clase_padre_actual: {clase_padre_actual}")
                        
                    # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                    if en_metodo_del_posible == metodo_actual:
                        # SE DEFINIO EN EL MISMO METODO
                        print("se le puede asignar a la variable por estar en el mismo metodo")
                        posibles_correctos.append(1)
                        verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)
                    
                    # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                    elif padre_del_posible == clase_padre_actual:
                        print("se le puede asignar a la variable por ser una variable global")
                        posibles_correctos.append(1)
                        verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)

                if len(posibles_correctos) == 0:
                    print(f"ERROR, {ctx.ID()[0].getText()} -> esta variable no ha sido asignada en el mismo ambito")
                    self._tabla_simbolos._error_in_current_method = True
                    self._tabla_simbolos._error_in_code = True
                    self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[0].getText()} -> esta variable no ha sido asignada en el mismo ambito")
    
            # SI NO HAY ALGO EN LA LISTA AVISAR ERROR
            else:
                print(f"ERROR, {ctx.ID()[0].getText()} ESTA VARIABLE NO HA SIDO ASIGNADA en el mismo ambito")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[0].getText()} ESTA VARIABLE NO HA SIDO ASIGNADA en el mismo ambito")


            tabla_posibles_id_a_asignar = self._tabla_simbolos.return_same_ids(ctx.ID()[1].getText())
            print(f"tabla posible id a asignar: {tabla_posibles_id_a_asignar}")
            
            # Chequear que haya algo en la lista
            if len(tabla_posibles_id_a_asignar) > 0:
                
                posibles_correctos = []
                
                for variable in tabla_posibles_id_a_asignar:
                    #POSIBLE
                    id_del_posible = variable['id']
                    tipo_del_posible = variable['tipo']
                    en_metodo_del_posible = variable['en_metodo']
                    ambito_del_posible = variable['ambito']
                    padre_del_posible = variable['padre']
                    
                    print(f"id_del_posible: {id_del_posible}")
                    print(f"tipo_del_posible: {tipo_del_posible}")
                    print(f"en_metodo_del_posible: {en_metodo_del_posible}")
                    print(f"ambito_del_posible: {ambito_del_posible}")
                    
                    #ACTUAL
                    metodo_actual = self._tabla_simbolos._current_method
                    clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                    
                    print(f"metodo_actual: {metodo_actual}")
                    print(f"clase_padre_actual: {clase_padre_actual}")
                        
                    # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                    if en_metodo_del_posible == metodo_actual:
                        # SE DEFINIO EN EL MISMO METODO
                        print("se le puede asignar a la variable por estar en el mismo metodo")
                        posibles_correctos.append(1)
                        verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)
                    
                    # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                    elif padre_del_posible == clase_padre_actual:
                        print("se le puede asignar a la variable por ser una variable global")
                        posibles_correctos.append(1)
                        verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)

                if len(posibles_correctos) == 0:
                    print(f"ERROR, {ctx.ID()[1].getText()} -> esta variable no ha sido asignada en el mismo ambito")
                    self._tabla_simbolos._error_in_current_method = True
                    self._tabla_simbolos._error_in_code = True
                    self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[1].getText()} -> esta variable no ha sido asignada en el mismo ambito")
    
            # SI NO HAY ALGO EN LA LISTA AVISAR ERROR
            else:
                print(f"ERROR, {ctx.ID()[1].getText()} ESTA VARIABLE NO HA SIDO ASIGNADA en el mismo ambito")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[1].getText()} ESTA VARIABLE NO HA SIDO ASIGNADA en el mismo ambito")

            
            
        else:
            if variable1 == False:
                print(f"ERROR, {ctx.ID()[0].getText()} NO HA SIDO ASIGNADA")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[0].getText()} NO HA SIDO ASIGNADA")
                
            if variable2 == False:
                print(f"ERROR, {ctx.ID()[1].getText()} NO HA SIDO ASIGNADA")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, {ctx.ID()[1].getText()} NO HA SIDO ASIGNADA")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_2.
    def exitTipo_correcto_2(self, ctx:Proy1Parser.Tipo_correcto_2Context):
        print("exit correcto 2")

    # Enter a parse tree produced by Proy1Parser#tipo_correcto_3.
    def enterTipo_correcto_3(self, ctx:Proy1Parser.Tipo_correcto_3Context):
        print("enter correcto 3")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_3.
    def exitTipo_correcto_3(self, ctx:Proy1Parser.Tipo_correcto_3Context):
        print("exit correcto 3")


    # Enter a parse tree produced by Proy1Parser#tipo_correcto_4.
    def enterTipo_correcto_4(self, ctx:Proy1Parser.Tipo_correcto_4Context):
        print("enter correcto 4")
        print(f"contenido correcto 4: {ctx.getText()}")
        
        id_a_asignar = ctx.ID()
        print(f"id_a_asignar: {id_a_asignar.getText()}")
        
        # verificar si la variable ya fue inicializada en la tabla de simbolos
        tabla_posibles_id_a_asignar = self._tabla_simbolos.return_same_ids(id_a_asignar.getText())
        print(f"tabla posible id a asignar: {tabla_posibles_id_a_asignar}")
        
        # Chequear que haya algo en la lista
        if len(tabla_posibles_id_a_asignar) > 0:
            
            posibles_correctos = []
            
            for variable in tabla_posibles_id_a_asignar:
                #POSIBLE
                id_del_posible = variable['id']
                tipo_del_posible = variable['tipo']
                en_metodo_del_posible = variable['en_metodo']
                ambito_del_posible = variable['ambito']
                padre_del_posible = variable['padre']
                
                print(f"id_del_posible: {id_del_posible}")
                print(f"tipo_del_posible: {tipo_del_posible}")
                print(f"en_metodo_del_posible: {en_metodo_del_posible}")
                print(f"ambito_del_posible: {ambito_del_posible}")
                
                #ACTUAL
                metodo_actual = self._tabla_simbolos._current_method
                clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                
                print(f"metodo_actual: {metodo_actual}")
                print(f"clase_padre_actual: {clase_padre_actual}")
                    
                # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                if en_metodo_del_posible == metodo_actual:
                    # SE DEFINIO EN EL MISMO METODO
                    print("se le puede asignar a la variable por estar en el mismo metodo")
                    posibles_correctos.append(1)
                    verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)
                
                # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                elif padre_del_posible == clase_padre_actual:
                    print("se le puede asignar a la variable por ser una variable global")
                    posibles_correctos.append(1)
                    verificacion_correcto_3_simple(self, tabla_posibles_id_a_asignar, metodo_actual, clase_padre_actual, tipo_del_posible)

            if len(posibles_correctos) == 0:
                print(f"ERROR, {id_a_asignar} -> esta variable no ha sido asignada")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, {id_a_asignar} -> esta variable no ha sido asignada")
        
        # SI NO HAY ALGO EN LA LISTA AVISAR ERROR
        else:
            print(f"ERROR, {id_a_asignar} ESTA VARIABLE NO HA SIDO ASIGNADA")
            self._tabla_simbolos._error_in_current_method = True
            self._tabla_simbolos._error_in_code = True
            self._tabla_simbolos._lista_errores.append(f"ERROR, {id_a_asignar} ESTA VARIABLE NO HA SIDO ASIGNADA")
        
        print("**********************")



    # Exit a parse tree produced by Proy1Parser#tipo_correcto_4.
    def exitTipo_correcto_4(self, ctx:Proy1Parser.Tipo_correcto_4Context):
        print("exit correcto 4")
        #print("RESET A _se_asigna_a_variable Y tipo_de_asignada")
        #self._tabla_simbolos._se_asigna_a_variable = False
        #self._tabla_simbolos.tipo_de_asignada = None
        #self._variable_asiganda = None
        
        print("**********************")
        
    # Enter a parse tree produced by Proy1Parser#tipo_correcto_5.
    def enterTipo_correcto_5(self, ctx:Proy1Parser.Tipo_correcto_5Context):
        print(" enter correcto 5")
        
        id_context = ctx.ID()
        operacion_context = ctx.operacion()
        metodo_context = ctx.metodo()
        
        if len(operacion_context) == 0 and len(metodo_context) == 0:
            #print(f"variable: {id_context[0].getText()}")
            #print(f"variable que se asigna a la variable: {id_context[1].getText()}")
            
            # DETECTAR si la variable a la que vamos a asignar sí existe en la tabla de simbolos
            # primero miramos si es una variable privada para el metodo en el que estamos (si estamos en metodo) y luego chequear si es global
            
            posible_asignable = id_context[0].getText()            
            tabla_posibles_Vs = self._tabla_simbolos.return_same_ids(posible_asignable)
            
            v_que_se_asigna = id_context[1].getText()      
            tabla_posibles_asignable = self._tabla_simbolos.return_same_ids(v_que_se_asigna)
            
            # Chequear que haya algo en la lista
            if len(tabla_posibles_Vs) > 0:
                for variable in tabla_posibles_Vs:
                    # POSIBLE
                    tipo_del_posible = variable['tipo']
                    definicion_del_posible = variable['definicion']
                    en_metodo_del_posible = variable['en_metodo']
                    ambito_del_posible = variable['ambito']
                    padre_del_posible = variable['padre']
                    
                    #actual
                    metodo_actual = self._tabla_simbolos._current_method
                    clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                    
                    
                    # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                    if en_metodo_del_posible == metodo_actual:
                        # SE DEFINIO EN EL MISMO METODO
                        print("se le puede asignar a la variable por estar en el mismo metodo")
                        
                        verificacion_correcto_3_simple(self, tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible)
                    
                    # VERIFICAR SI EL POSIBLE VARIABLE ES GLOBAL
                    elif padre_del_posible == clase_padre_actual:
                        print("se le puede asignar a la variable por ser una variable global")
                        
                        verificacion_correcto_3_simple(self, tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible)

                        
                    else:
                        print(f"ERROR: {id_context} ESTA VARIABLE NO HA SIDO ASIGNADA")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append(f"ERROR: {id_context} ESTA VARIABLE NO HA SIDO ASIGNADA")
                        
                        
            
            # SI HAY ALGO EN LA LISTA AVISAR ERROR
            else:
                print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR: {id_context} ESTA VARIABLE NO HA SIDO ASIGNADA")
            
            
            self._tabla_simbolos.return_same_ids(id_context[1].getText())
                    
        print("**********************")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_5.
    def exitTipo_correcto_5(self, ctx:Proy1Parser.Tipo_correcto_5Context):
        print("exit correcto5")
        
    
    
    # Enter a parse tree produced by Proy1Parser#tipo_correcto_6.
    def enterTipo_correcto_6(self, ctx:Proy1Parser.Tipo_correcto_6Context):
        print("correcto 6")
        
        id = ctx.ID().getText()
        
        expr = ctx.expr().getText()
        
        print(id, expr)
        print(f"check_int(expr) {check_int(expr)}")
        
        # verificar si la variable ya fue inicializada
        if self._tabla_simbolos.id_en_tabla(id):
            
            print("entramos")
            
            id_object = self._tabla_simbolos.obtener_objeto(id)
            
            print(f"el id_object es: {id_object}")
            
            #Verificar que se asigna un Int a una variable String
            if '"' in expr and id_object['tipo'] == 'String':
                print("el valor es String")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
            
            #Verificar que se asigna un Int a una variable Int
            elif ctx.expr().NUM() != None and id_object['tipo'] == 'Int':
                print("el valor es Int")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
                
            # Verificar que se asigna un Int 0 o 1 para una variable Bool
            elif check_int(expr) and id_object['tipo'] == 'Bool':
                print("usando Int para definir un Bool")
                if expr == "1":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 'true')
                
                if expr == "0":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 'false')
                    
            # Verificar que se asigna true/false para una variable Int
            elif expr in ['true', 'false'] and id_object['tipo'] == 'Int':
                print("el valor es Bool")
                if expr == "true":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 1)
                    
                if expr == "false":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 0)
                
            # Verificar que se asigna true/false a una variable Bool
            elif expr in ['true', 'false'] and id_object['tipo'] == 'Bool':
                print("el valor es Bool")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
            
            else:
                print(f"ERROR : El tipo de la variable {id} NO es igual al tipo de {expr}")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR : El tipo de la variable {id} NO es igual al tipo de {expr}")
                    
            
            #self.imprimir_tabla_simbolos()
            
                
        else:
            print("variable no ha sido definida")
            
        """for x in self._tabla_simbolos._simbolos:
            print(x)"""
            
        print("**********************")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_6.
    def exitTipo_correcto_6(self, ctx:Proy1Parser.Tipo_correcto_6Context):
        pass

        # Enter a parse tree produced by Proy1Parser#tipo_correcto_7.
    def enterTipo_correcto_7(self, ctx:Proy1Parser.Tipo_correcto_7Context):
        print("enter correcto 7")

    # Exit a parse tree produced by Proy1Parser#tipo_correcto_7.
    def exitTipo_correcto_7(self, ctx:Proy1Parser.Tipo_correcto_7Context):
        print("correcto 7")

    # Enter a parse tree produced by Proy1Parser#tipo_correcto_8.
    def enterTipo_correcto_8(self, ctx:Proy1Parser.Tipo_correcto_8Context):
        print("enter correcto 8")

    # Exit a parse tree produced by Proy1Parser#tipo_correcto_8.
    def exitTipo_correcto_8(self, ctx:Proy1Parser.Tipo_correcto_8Context):
        print("correcto 8")
        
    """# Enter a parse tree produced by Proy1Parser#metodo.
    def enterMetodo(self, ctx:Proy1Parser.MetodoContext):
        print("**********************")
        print("metodo")
        print(ctx.ID()[0].getText())
            
        print("**********************")
    """
        
    # Enter a parse tree produced by Proy1Parser#metodo1.
    def enterMetodo1(self, ctx:Proy1Parser.Metodo1Context):
        print("**********************")
        print("metodo1")
        
        print(ctx.getText())
        #print(ctx.expr()[0].getText())
        
        # obtener los id de metodo
        # si el len es 0, tenemos idMetodo(), si no hay uno o mas parametros
        id_context = ctx.ID()
        tipoVariable_context = ctx.tipoVariable()
        
        print(f"los ids: {len(id_context)}")
        print(f"los tipoVariables: {len(tipoVariable_context)}")
        
        if ctx.expr() != None:
            for x in ctx.expr():
                id = x.getText()
                #expr = x.expr().getText()
                
                print(f"el pinche id: {id}")
                #print(f"el pinche expr: {expr}")
        
        # si tenemos 1 id y 1 tipo variable, tenemos nombre del metodo y el valor que regresa
        if len(id_context) == 1 and len(tipoVariable_context) == 1:
            
            id_metodo = id_context[0].getText()
            tipoMetodo = tipoVariable_context[0].getText()
            
            # obtener/explorar expr
            exp_context = ctx.expr()
            
            print("exp_context")
            #print(exp_context[0].getChild(0))
            
            
            clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
            
            
        
            if tipoMetodo == "SELF_TYPE":
                self._tabla_simbolos.agregar_simbolo(clase_padre['id'], id_metodo, 3, self._tabla_simbolos.agregar_offset(3), 'metodo', None, clase_padre['id'])
                self._tabla_simbolos.agregar_in_method_object(clase_padre['id'], id_metodo, None, None, 'metodo', None, clase_padre['id'])
                
                # definir que estamos en un metodo
                self._tabla_simbolos._in_method = True
                self._tabla_simbolos._error_in_current_method = False
                self._tabla_simbolos._current_method = id_metodo
            
                #self.imprimir_tabla_simbolos()
                
            else:
                self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])
                self._tabla_simbolos.agregar_in_method_object(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])
                
        
                # definir que estamos en un metodo
                self._tabla_simbolos._in_method = True
                self._tabla_simbolos._error_in_current_method = False
                self._tabla_simbolos._current_method = id_metodo
            
                #self.imprimir_tabla_simbolos()
            
        # si no hay 1 - 1 es porque hay un parametro en el metodo
        else:
            id_metodo = id_context[0].getText()
            tipoMetodo = tipoVariable_context[len(tipoVariable_context)-1].getText()
            
            print(f"nombre del metodo: {id_metodo}")
            print(f"tipo del metodo: {tipoMetodo}")
            
            clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
            
            if tipoMetodo == 'SELF_TYPE':
                self._tabla_simbolos.agregar_simbolo(clase_padre['id'], id_metodo, None, None, 'metodo', None, clase_padre['id'])

            
            else:
                self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])
        
            # definir que estamos en un metodo
            self._tabla_simbolos._in_method = True
            self._tabla_simbolos._error_in_current_method = False
            self._tabla_simbolos._current_method = id_metodo
        
            
            # agregar argumentos
            limit = len(tipoVariable_context) - 1
            start_counter = 1
            
            while start_counter <= limit:
                id_metodo = id_context[start_counter].getText()
                tipoMetodo = tipoVariable_context[start_counter - 1].getText()
                
                print(f"id_metodo???????? : {id_metodo}")
                
                clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
            
                self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'variable', None, clase_padre['id'])
                
                start_counter += 1
                
            #self.imprimir_tabla_simbolos()
            
        
        print("**********************")
        
        

    # Exit a parse tree produced by Proy1Parser#metodo1.
    def exitMetodo1(self, ctx:Proy1Parser.Metodo1Context):
        print("exitMetodo1")
        
        if self._tabla_simbolos._error_in_current_method:
            print("ERROR METODO NO VALIDO")
            self._tabla_simbolos._error_in_code = True
            #remover_contenido_de_metodo(self)
            
        else:
            print(f"limpiar variable en separado")
            # definir que salimos del metodo 1
            self._tabla_simbolos._in_method = False
            self._tabla_simbolos._current_method = None
            self._tabla_simbolos._in_method_object = None
            
            
            
            
        print("**********************")



    # Enter a parse tree produced by Proy1Parser#metodo2.
    def enterMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        print("metodo2")
        print(ctx.getText())
        
        if self._tabla_simbolos._ignora_new:
            print(f"se ignora {ctx.getText()}")
            
        elif self._tabla_simbolos._ignora_new_15:
            print(f"se ignora por el metodo15 {ctx.getText()}")
            
        else:
            
            print(f"metodo2: {ctx.getText()}")
            
            print(f"nombre metodo: {ctx.ID()}")
            print(f"expresiones: {ctx.expr()}")
            print(f"metodos: {ctx.metodo()}")
            
            nombre_metodo = ctx.ID()
            expresiones = ctx.expr()
            metodos = ctx.metodo()
            
            # solo tenemos la expresion
            if metodos == None:
                # verificar que el metodo esta en la tabla de simbolos y que los parametros tambien
                print(f"PASANDO POR VERIFICAR EN TABLAAAAAAA")
                verificar_en_tabla(self, nombre_metodo.getText(), nombre_metodo)
                
                print("antes del for")
                print("-------------------------------")
                
                for expresion in expresiones:
                    
                    print(f"la mera expresion: {expresion.getText()}")
                    
                    posible_string = expresion.STRING()
                    posible_num = expresion.NUM()
                    posible_bool = expresion.BOOL()
                    
                    print(f"posible_string: {posible_string}")
                    print(f"posible_num: {posible_num}")
                    print(f"posible_bool: {posible_bool}")
                    
                    print(f"expresion: {expresion.getText()}")
                    
                    if posible_string == None and posible_num == None and posible_bool == None and expresion.getText() != "self":
                        
                        print(f"vamos a entrar con la info")
                        print(f"expresion.getText(): {expresion.getText()}")
                        print(f"nombre_metodo: {nombre_metodo}")
                        print(f"metodos permitidos:{self._tabla_simbolos._metodos_permitidos}")
                        
                        if nombre_metodo.getText() in self._tabla_simbolos._metodos_permitidos:
                            print("correcto: metodo permitido")
                        
                        else:
                            verificar_en_tabla(self, expresion.getText(), nombre_metodo)

                    else:
                        print("no se paso en verificar tabla para estos")
            
            

    # Exit a parse tree produced by Proy1Parser#metodo2.
    def exitMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        print("exit metodo2")


    # Enter a parse tree produced by Proy1Parser#metodo3.
    def enterMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        print("metodo3")
        
        print(ctx.getText())
        
        hay_not = ctx.Not()
        posible_inicializar = ctx.inicializar()
        posible_expr = ctx.expr()
        posible_metodo = ctx.metodo()
        
        print(f"hay_not: {hay_not}")
        print(f"posible_inicializar: {posible_inicializar}")
        print(f"posible_expr: {posible_expr}")
        print(f"posible_metodo: {posible_metodo}")


        if posible_metodo != True and posible_expr != None:
            try:
                verificar_metodos = []
                el_inicializar = []
                existe_un_punto_metodo = True
                print("++++++++++++++++++++++++++++++++++++++++++")
                print(f"el posible_expr: {posible_expr.getText()}")
                print(f"posible_metodo: {posible_metodo.getText()}")
                
                print(f"metodos en posible_expr: {posible_expr.metodo().metodo().metodo().ID().getText()}")

                el_pinche_posible_expr = posible_expr

                while existe_un_punto_metodo:
                    if el_pinche_posible_expr.metodo() != None:
                        try:
                            if el_pinche_posible_expr.metodo().inicializar() != None:
                                el_inicializar.append(el_pinche_posible_expr.metodo().inicializar())
                        except:
                            pass
                            
                        
                        if hasattr(el_pinche_posible_expr.metodo().metodo(), 'ID'):
                            verificar_metodos.append(el_pinche_posible_expr.metodo().metodo().ID().getText()) 
                            try:
                                verificar_metodos.append(el_pinche_posible_expr.metodo().metodo().metodo().ID().getText())
                            except:
                                pass
                            el_pinche_posible_expr = el_pinche_posible_expr.metodo().metodo()
                            
                        else:
                            existe_un_punto_metodo = False

                    else:
                        existe_un_punto_metodo = False
                        
                try:                        
                    print(f"verificar metodos")
                    print(verificar_metodos)
                    print(f"metodos en posible_metodo: {posible_metodo.ID().getText()}")
                    print(posible_metodo.expr()[0].metodo().metodo().ID().getText())
                    print(posible_metodo.expr()[0].metodo().metodo().metodo().ID().getText())
                    
                except:
                    pass
        
            except:
                pass

        #sys.exit()
        
        
        
        elif hay_not == None:
            # Si el contexto de inicializar es None, se tiene una expresión, se deja pasar para que lo jale el siguiente listener
            if posible_inicializar == None:
                print("HAY UNA EXPR")
                print(f"EXPRESION: {posible_expr.getText()}")
                pass
            
            if posible_expr == None:
                
                print('IGNORAR TODO NEW')
                self._tabla_simbolos._ignora_new = True
                
                print("HAY UNA INICIALIZAR")
                print(f"el inicializar: {posible_inicializar.getText()}")
                
                if posible_metodo != None:
                    #print(f"el metodo: {posible_metodo.getText()}")
                    #print(f"el tipo del inicializar: {posible_inicializar.tipoVariable().getText()}")
                    
                    try:
                        self._tabla_simbolos._class_inicializada = posible_inicializar.tipoVariable().getText()
                        self._tabla_simbolos._se_define_new = True
                    except:
                        pass
                    
                    #self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])

    
        else:
            print("TIENE UN NOT")
        
        
        print("**********************")
        

    # Exit a parse tree produced by Proy1Parser#metodo3.
    def exitMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        print("exit metodo3")
        self._tabla_simbolos._class_inicializada = None
        self._tabla_simbolos._se_define_new = False
        self._tabla_simbolos._ignora_new = False
        


    # Enter a parse tree produced by Proy1Parser#metodo4.
    def enterMetodo4(self, ctx:Proy1Parser.Metodo4Context):
        print("metodo4")
        expresiones_en_if = ctx.expr()
        print(f"expresiones del if: {expresiones_en_if}")
        self._tabla_simbolos._en_condicion_if = True
        self._tabla_simbolos._minicondicion = True
        print("**********************")
        

    # Exit a parse tree produced by Proy1Parser#metodo4.
    def exitMetodo4(self, ctx:Proy1Parser.Metodo4Context):
        print("TERMINA METODO4")
        #print("self._tabla_simbolos._en_condicion_if = False")
        #self._tabla_simbolos._en_condicion_if = False
        #self._tabla_simbolos._minicondicion = False

        print("**********************")
        pass


    # Enter a parse tree produced by Proy1Parser#metodo5.
    def enterMetodo5(self, ctx:Proy1Parser.Metodo5Context):
        print("metodo5")
        self._tabla_simbolos._en_while_cr5 = True

    # Exit a parse tree produced by Proy1Parser#metodo5.
    def exitMetodo5(self, ctx:Proy1Parser.Metodo5Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo6.
    def enterMetodo6(self, ctx:Proy1Parser.Metodo6Context):
        print("metodo6")

    # Exit a parse tree produced by Proy1Parser#metodo6.
    def exitMetodo6(self, ctx:Proy1Parser.Metodo6Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo7.
    def enterMetodo7(self, ctx:Proy1Parser.Metodo7Context):
        """print("metodo7")
        print("pasar al siguiente listener")
        print("**********************")"""
        # CORRECTO, PASAR AL SIGUIENTE LISTENER
        pass

    # Exit a parse tree produced by Proy1Parser#metodo7.
    def exitMetodo7(self, ctx:Proy1Parser.Metodo7Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo8.
    def enterMetodo8(self, ctx:Proy1Parser.Metodo8Context):
        print("metodo8")

    # Exit a parse tree produced by Proy1Parser#metodo8.
    def exitMetodo8(self, ctx:Proy1Parser.Metodo8Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo9.
    def enterMetodo9(self, ctx:Proy1Parser.Metodo9Context):
        print("metodo9")
        print(f"CONTENIDO METODO 9: {ctx.getText()}")
        #print(f"VARIABLE DE LA QUE SE OPERA: {ctx.ID().getText()}")
        
        clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
        
        variables_en_clase = obtener_variable_de_una_clase(self, clase_padre_actual)
        
        for var in variables_en_clase:
            if ctx.ID() != None:
                if var['id'] == ctx.ID().getText():
                    self._tabla_simbolos._variable_que_se_opera = [ctx.ID().getText(), var['tipo']]
        
        print("**********************")
        

    # Exit a parse tree produced by Proy1Parser#metodo9.
    def exitMetodo9(self, ctx:Proy1Parser.Metodo9Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo10.
    def enterMetodo10(self, ctx:Proy1Parser.Metodo10Context):
        print("metodo10")
        
        # es let ID
        # let crea una variable privada
        let_id = ctx.ID()
        let_tipo = ctx.tipoVariable()
        let_expr = ctx.expr()
        
        print("++++++++++++++++++++++++++++++++++++")
        print("LET EXPR")
        print(f"let_id: {let_id}")
        print(f"let_tipo: {let_tipo}")
        print("let_expr")
        for x in let_expr:
            print(x.getText())
        print("++++++++++++++++++++++++++++++++++")
        
        # si hay algo en let_tipo, se tiene un "let ID : tipoVariable 'in' ( (expr)* | '{' (expr)* '}' | '(' (expr)* ')' ) (';')* "
        if let_tipo is not None:
            print(f"let_id: {let_id[0].getText()}")
            print(f"let_tipo: {let_tipo.getText()}")
            print(f"let_expr: {let_expr[0].getText()}")
            
            clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
            
            # agregar let_id como una variable privada
            self._tabla_simbolos.agregar_simbolo(let_tipo.getText(), let_id[0].getText(), None, None, 'variable', None, clase_padre['id'])

            self._tabla_simbolos._se_asigna_a_variable = True
            self._tabla_simbolos.tipo_de_asignada = let_tipo.getText()
            self._variable_asiganda = let_id[0].getText()

            #self.imprimir_tabla_simbolos()
            
        # si es none hay una expresion
        if let_tipo is None:
           
            valor_del_let = let_id[0].getText()
            valor_del_tipo = let_id[1].getText()
            
            print(f"valor_del_let: {valor_del_let}")
            print(f"valor_del_tipo: {valor_del_tipo}")
            print(f"asignacion a la variable en let NUM: {let_expr[0].NUM()}")
            print(f"asignacion a la variable en let ID: {let_expr[0].ID()}")
            print(f"asignacion a la variable en let STRING: {let_expr[0].STRING()}")
            print(f"asignacion a la variable en let BOOL: {let_expr[0].BOOL()}")
            
           
            #se esta asignando un numero
            if let_expr[0].NUM() != None:
                if valor_del_tipo == "Int":
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
            
                    # agregar let_id como una variable privada
                    self._tabla_simbolos.agregar_simbolo(valor_del_tipo, valor_del_let, None, None, 'variable', None, clase_padre['id'])

                    self._tabla_simbolos._se_asigna_a_variable = True
                    self._tabla_simbolos.tipo_de_asignada = valor_del_tipo
                    self._variable_asiganda = valor_del_let

                    #self.imprimir_tabla_simbolos()
                    
            if let_expr[0].STRING() != None:
                if valor_del_tipo == "String":
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                    
                    # agregar let_id como una variable privada
                    self._tabla_simbolos.agregar_simbolo(valor_del_tipo, valor_del_let, None, None, 'variable', None, clase_padre['id'])

                    self._tabla_simbolos._se_asigna_a_variable = True
                    self._tabla_simbolos.tipo_de_asignada = valor_del_tipo
                    self._variable_asiganda = valor_del_let

                    #self.imprimir_tabla_simbolos()
                    
                    
            if let_expr[0].BOOL() != None:
                if valor_del_tipo == "Bool":
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                    
                    # agregar let_id como una variable privada
                    self._tabla_simbolos.agregar_simbolo(valor_del_tipo, valor_del_let, None, None, 'variable', None, clase_padre['id'])

                    self._tabla_simbolos._se_asigna_a_variable = True
                    self._tabla_simbolos.tipo_de_asignada = valor_del_tipo
                    self._variable_asiganda = valor_del_let

                    #self.imprimir_tabla_simbolos()
                    
            if let_expr[0].ID() != None:
                tabla_posibles_valores = self._tabla_simbolos.return_same_ids(let_expr[0].getText())
                
                verificado = []
                
                clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                
                for variable in tabla_posibles_valores:
                    
                    #POSIBLE
                    tipo_del_posible = variable['tipo']
                    en_metodo_del_posible = variable['en_metodo']
                    ambito_del_posible = variable['ambito']
                    padre_del_posible = variable['padre']
                    
                    #ACTUAL
                    metodo_actual = self._tabla_simbolos._current_method
                    clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']

                    
                    # VERIFICAR SI LA POSIBLE VARIABLE FUE DEFINIDA EN EL MISMO METODO
                    if en_metodo_del_posible == metodo_actual:
                        # se definio en el mismo metodo
                        print(f"debug 1")
                        if tipo_del_posible == valor_del_tipo:
                            print("CORRECTO, se puede utilizar la variable por estar en el mismo metodo")
                            verificado.append(1)  
                            # agregar let_id como una variable privada
                            self._tabla_simbolos.agregar_simbolo(valor_del_tipo, valor_del_let, None, None, 'variable', None, clase_padre['id'])

                            self._tabla_simbolos._se_asigna_a_variable = True
                            self._tabla_simbolos.tipo_de_asignada = valor_del_tipo
                            self._variable_asiganda = valor_del_let

                            #self.imprimir_tabla_simbolos()
                            
                        else:
                            print(f"ERROR, tipo con su variable referenciada no corresponde")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"ERROR, tipo con su variable referenciada no corresponde")

                    
                    elif padre_del_posible == clase_padre_actual:
                        print("CORRECTO, se puede utilizar la variable por ser una variable global")
                        if tipo_del_posible == valor_del_tipo:
                            print("CORRECTO, se puede utilizar la variable por estar en el mismo metodo")
                            verificado.append(1)  
                            # agregar let_id como una variable privada
                            self._tabla_simbolos.agregar_simbolo(valor_del_tipo, valor_del_let, None, None, 'variable', None, clase_padre['id'])

                            self._tabla_simbolos._se_asigna_a_variable = True
                            self._tabla_simbolos.tipo_de_asignada = valor_del_tipo
                            self._variable_asiganda = valor_del_let

                            #self.imprimir_tabla_simbolos()
                            
                        else:
                            print(f"ERROR, tipo con su variable referenciada no corresponde")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"ERROR, tipo con su variable referenciada no corresponde")
                        
                print(f"contenido en verificado: {verificado}")
                if len(verificado) == 0:
                    # HAY ERROR
                    print("debug 3")
                    print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                    self._tabla_simbolos._error_in_current_method = True
                    self._tabla_simbolos._error_in_code = True
                    self._tabla_simbolos._lista_errores.append(f"ERROR {let_expr[0].getText()} NO HA SIDO ASIGNADA")
                    
                    




            
            #posible
            
            
        print("**********************")
        
        
        
        

    # Exit a parse tree produced by Proy1Parser#metodo10.
    def exitMetodo10(self, ctx:Proy1Parser.Metodo10Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo11.
    def enterMetodo11(self, ctx:Proy1Parser.Metodo11Context):
        print("metodo11")
        
        print(f"expre en metodo11: {ctx.getText()}")
        
        posibles_operaciones = ctx.operacion()
        posible_id = ctx.ID()
        posible_num = ctx.NUM()
        posibles_expr = ctx.expr()
        
        print(f"lista de operaciones: {posibles_operaciones}")
        print(f"numero de operaciones: {len(posibles_operaciones)}")
        print(f"posible id en operacion: {posible_id}")
        print(f"posible_num en operacion: {posible_num}")
                        
        # si la operacion es solo sobre una expresion
        print(f"antes se asigno una variable: {self._tabla_simbolos._se_asigna_a_variable}")
        print(f"el tipo de variable previamente asignada: {self._tabla_simbolos.tipo_de_asignada}")
        
        # ESTABA VIENDO ESTO
        if self._tabla_simbolos._en_condicion_if:
                        
            if posible_id == None:
                print("VALOR 1 EN IF ES NUMERO")
                
                print(f"POSIBLE NUM DE VALOR1: {posibles_expr[0].NUM()}")
                print(f"POSIBLE ID DE VALOR2: {posibles_expr[0].ID()}")
                
                valor_num1 = posible_num
                valor_num2 = None
                
                if len(posibles_operaciones) == 1:
                    permitidos = ['>', '<', '==', '>=', '<=', '=']
                    if posibles_operaciones[0].getText() in permitidos:
                        print(f"correcto")
                        self._tabla_simbolos._en_while_cr5 = False
                        self._tabla_simbolos._minicondicion = False

                        
                    else:
                        print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                        self._tabla_simbolos._en_while_cr5 = False
                
                if posibles_expr[0].ID() != None:
                    valor_num2 = posibles_expr[0].ID()
                    
                    print("TENEMOSSSSSSS")
                    print(f"valor1: {valor_num1}")
                    print(f"valor2: {valor_num2}")
                    
                    posible_objeto_2 = self._tabla_simbolos.return_same_ids(valor_num2.getText())
                    print(posible_objeto_2)
                    
                    posible_correto_objeto_2 = []
                    
                    for variable in posible_objeto_2:
                        #POSIBLE
                        tipo_del_posible = variable['tipo']
                        en_metodo_del_posible = variable['en_metodo']
                        ambito_del_posible = variable['ambito']
                        padre_del_posible = variable['padre']
                        
                        #ACTUAL
                        metodo_actual = self._tabla_simbolos._current_method
                        clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                        
                        # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                        if en_metodo_del_posible == metodo_actual:
                            # SE DEFINIO EN EL MISMO METODO
                            print("se le puede asignar a la variable por estar en el mismo metodo")
                            posible_correto_objeto_2.append(1)
                            tipo_valor_1 = verificacion_metodo_11(self, posible_objeto_2, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())
                            
                        # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                        elif padre_del_posible == clase_padre_actual:
                            print("se le puede asignar a la variable por ser una variable global")
                            posible_correto_objeto_2.append(1)
                            print("ble")
                            tipo_valor_1 = verificacion_metodo_11(self, posible_objeto_2, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())
                            
                    if len(posible_correto_objeto_2) == 0:
                        print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append(f"ERROR {valor_num2.getText()} NO HA SIDO ASIGNADA")
                        
            else:
                
                print("entramos en el else?")
                
                if len(posibles_operaciones) == 1:
                    print(f"valor1: {posible_id}")
                    print(f"valor2: {posibles_expr[0].getText()}")
                    
                    sin_semicolon = posibles_expr[0].getText()
                    
                    if ";" in posibles_expr[0].getText():
                        con_semicolon = posibles_expr[0].getText()
                        sin_semicolon = con_semicolon.replace(";", "")

                
                    valor1_en_tabla = self._tabla_simbolos.id_en_tabla(posible_id.getText())
                    valor2_en_tabla = self._tabla_simbolos.id_en_tabla(sin_semicolon)                            
                
                    print("SE ENCUENTRA EN TABLA?")
                    print(f"valor1_en_tabla: {valor1_en_tabla}")
                    print(f"valor2_en_tabla: {valor2_en_tabla}")
                    
                    """for x in valor1_en_tabla:
                        print(x)
                        
                    for y in valor2_en_tabla:
                        print(y)"""
                        
                    if valor1_en_tabla == True and valor2_en_tabla == False:
                        
                        
                        if check_int(sin_semicolon):
                            print(f"CORRECTO, el valor {sin_semicolon} es un Int")
                            
                            mierda = self._tabla_simbolos.return_same_ids(posible_id.getText())
                            
                            objeto_mierda = self._tabla_simbolos.regresar_objeto_en_ambito(mierda)
                            
                            print(f"la mierda: {objeto_mierda}")
                            
                            if objeto_mierda["tipo"] == "Int":
                                print("ambos son Int")
                                
                            else:
                                print(f"Los tipos de valor no coinciden en {ctx.getText()} ")
                                self._tabla_simbolos._error_in_current_method = True
                                self._tabla_simbolos._error_in_code = True
                                self._tabla_simbolos._lista_errores.append(f"Los tipos de valor no coinciden en {ctx.getText()} ")
                        

                            #sys.exit()
                            
                            if self._tabla_simbolos._minicondicion:
                                permitidos = ['>', '<', '==', '>=', '<=', '=']
                                if posibles_operaciones[0].getText() in permitidos:
                                    print(f"correcto")

                                    
                                else:
                                    print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                                    self._tabla_simbolos._error_in_current_method = True
                                    self._tabla_simbolos._error_in_code = True
                                    self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                            
                            self._tabla_simbolos._minicondicion = False
                            
                        else:
                            print(f"ERROR : {sin_semicolon} NO esta definido")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"ERROR : {sin_semicolon} NO esta definido")
                        
                            if self._tabla_simbolos._minicondicion:
                                permitidos = ['>', '<', '==', '>=', '<=', '=']
                                if posibles_operaciones[0].getText() in permitidos:
                                    print(f"correcto")

                                    
                                else:
                                    print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                                    self._tabla_simbolos._error_in_current_method = True
                                    self._tabla_simbolos._error_in_code = True
                                    self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                            
                            self._tabla_simbolos._minicondicion = False
                            
                        
                        
                    elif valor1_en_tabla == False and valor2_en_tabla == True:
                        
                        if check_int(posible_id):
                            print(f"CORRECTO, el valor {posible_id} es un Int")
                            
                            
                            mierda = self._tabla_simbolos.return_same_ids(sin_semicolon)
                            
                            objeto_mierda = self._tabla_simbolos.regresar_objeto_en_ambito(mierda)
                            
                            print(f"la mierda: {objeto_mierda}")
                            
                            if objeto_mierda["tipo"] == "Int":
                                print("ambos son Int")
                                
                            else:
                                print(f"Los tipos de valor no coinciden en {ctx.getText()} ")
                                self._tabla_simbolos._error_in_current_method = True
                                self._tabla_simbolos._error_in_code = True
                                self._tabla_simbolos._lista_errores.append(f"Los tipos de valor no coinciden en {ctx.getText()} ")
                            
                            if self._tabla_simbolos._minicondicion:
                                permitidos = ['>', '<', '==', '>=', '<=', '=']
                                if posibles_operaciones[0].getText() in permitidos:
                                    print(f"correcto")

                                    
                                else:
                                    print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                                    self._tabla_simbolos._error_in_current_method = True
                                    self._tabla_simbolos._error_in_code = True
                                    self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                            
                            self._tabla_simbolos._minicondicion = False
                        
                        else:
                            print(f"ERROR : {posible_id} NO esta definido")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"ERROR : {posible_id} NO esta definido")

                    
                    if valor1_en_tabla == True and valor2_en_tabla == True:
                        print("WUUUUUUUUUUUU")
                        print(f"tenemos minicondicion: {self._tabla_simbolos._minicondicion}")
                        
                        if self._tabla_simbolos._minicondicion:
                            permitidos = ['>', '<', '==', '>=', '<=', '=']
                            if posibles_operaciones[0].getText() in permitidos:
                                print(f"correcto")

                                
                            else:
                                print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                                self._tabla_simbolos._error_in_current_method = True
                                self._tabla_simbolos._error_in_code = True
                                self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if ")
                        
                        self._tabla_simbolos._minicondicion = False
                        """if self._tabla_simbolos._minicondicion:
                            print("WUUUUUUUUUUUU MINICONDICION")
                            print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un if")
                            self._tabla_simbolos._minicondicion = False"""


                    if self._tabla_simbolos._en_while_cr5:
                        print("entramos a el _en_while_cr5")
                        permitidos = ['>', '<', '==', '>=', '<=']
                        if posibles_operaciones[0].getText() in permitidos:
                            print(f"correcto")
                            self._tabla_simbolos._en_while_cr5 = False

                            
                        else:
                            print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un while ")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un while ")
                            self._tabla_simbolos._en_while_cr5 = False
                
                    #sys.exit()
        
        # si lo que se tiene es un id y no un num
        elif posible_id != None and posible_num == None:
            # si solo hay una operacion
            if len(posibles_operaciones) == 1:
                print(f"valor1: {posible_id}")
                print(f"valor2: {posibles_expr[0].getText()}")
                
                sin_semicolon = posibles_expr[0].getText()
                    
                if ";" in posibles_expr[0].getText():
                    con_semicolon = posibles_expr[0].getText()
                    sin_semicolon = con_semicolon.replace(";", "")
                
                valor1_en_tabla = self._tabla_simbolos.id_en_tabla(posible_id.getText())
                valor2_en_tabla = self._tabla_simbolos.id_en_tabla(sin_semicolon)
                
                print(f"valor1_en_tabla: {valor1_en_tabla}")
                print(f"valor2_en_tabla: {valor2_en_tabla}")
                
                
                if self._tabla_simbolos._en_while_cr5:
                    print("entramos a el _en_while_cr5")
                    permitidos = ['>', '<', '==', '>=', '<=']
                    if posibles_operaciones[0].getText() in permitidos:
                        print(f"correcto")
                        self._tabla_simbolos._en_while_cr5 = False

                        
                    else:
                        print(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un while ")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append(f"La operacion {posibles_operaciones[0].getText()} no puede utilizarse en un while ")
                        self._tabla_simbolos._en_while_cr5 = False
                    
                if valor1_en_tabla and valor2_en_tabla:
                    print("AMBOS OBJETOS ESTAN EN TABLA")
                    
                    # verificar si la variable ya fue inicializada en la tabla de simbolos
                    tabla_posibles_valor1 = self._tabla_simbolos.return_same_ids(posible_id.getText())
                    tabla_posibles_valor2 = self._tabla_simbolos.return_same_ids(sin_semicolon)
                    print(f"tabla posible valor1: {tabla_posibles_valor1}")
                    print(f"tabla posible valor2: {tabla_posibles_valor2}")
                    
                    tipo_valor_1 = ""
                    tipo_valor_2 = ""
                    
                    # Chequear que haya algo en la lista
                    if len(tabla_posibles_valor1) > 0:
                        
                        posibles_correctos_v1 = []
                        
                        
                        for variable in tabla_posibles_valor1:
                            #POSIBLE
                            tipo_del_posible = variable['tipo']
                            en_metodo_del_posible = variable['en_metodo']
                            ambito_del_posible = variable['ambito']
                            padre_del_posible = variable['padre']
                            
                            #ACTUAL
                            metodo_actual = self._tabla_simbolos._current_method
                            clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                                
                            # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                            if en_metodo_del_posible == metodo_actual:
                                # SE DEFINIO EN EL MISMO METODO
                                print("se le puede asignar a la variable por estar en el mismo metodo")
                                posibles_correctos_v1.append(1)
                                tipo_valor_1 = verificacion_metodo_11(self, tabla_posibles_valor1, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())
                                
                            # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                            elif padre_del_posible == clase_padre_actual:
                                print("se le puede asignar a la variable por ser una variable global")
                                posibles_correctos_v1.append(1)
                                tipo_valor_1 = verificacion_metodo_11(self, tabla_posibles_valor1, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())

                            # HAY ERROR
                            #else:
                            #    print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                            #    self._tabla_simbolos._error_in_current_method = True
                            #    self._tabla_simbolos._error_in_code = True
                        
                        if len(posibles_correctos_v1) == 0:
                            print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                                
                    # Chequear que haya algo en la lista
                    if len(tabla_posibles_valor2) > 0:
                        
                        posibles_correctos_v2 = []
                        
                        for variable in tabla_posibles_valor2:
                            #POSIBLE
                            tipo_del_posible = variable['tipo']
                            en_metodo_del_posible = variable['en_metodo']
                            ambito_del_posible = variable['ambito']
                            padre_del_posible = variable['padre']
                            
                            #ACTUAL
                            metodo_actual = self._tabla_simbolos._current_method
                            clase_padre_actual = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]['id']
                                
                            # VERIFICAR SI EL POSIBLE VARIABLE FUE DEFINIDO EN EL MISMO METODO
                            if en_metodo_del_posible == metodo_actual:
                                # SE DEFINIO EN EL MISMO METODO
                                print("se le puede asignar a la variable por estar en el mismo metodo")
                                posibles_correctos_v2.append(1)
                                tipo_valor_2 = verificacion_metodo_11(self, tabla_posibles_valor2, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())
                                
                            # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
                            elif padre_del_posible == clase_padre_actual:
                                print("se le puede asignar a la variable por ser una variable global")
                                posibles_correctos_v2.append(1)
                                tipo_valor_2 = verificacion_metodo_11(self, tabla_posibles_valor2, metodo_actual, clase_padre_actual, tipo_del_posible, ctx.getText())

                            # HAY ERROR
                            #else:
                            #    print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                            #    self._tabla_simbolos._error_in_current_method = True
                            #    self._tabla_simbolos._error_in_code = True
                    
                        if len(posibles_correctos_v2) == 0:
                            print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")

                    
                    
                    print("/////////////////////")
                    print(f"tipo de asignada: {self._tabla_simbolos.tipo_de_asignada}")
                    print(f"tipo_valor_1: {tipo_valor_1}")
                    print(f"tipo_valor_2: {tipo_valor_2}")
                    if tipo_valor_1 == self._tabla_simbolos.tipo_de_asignada and tipo_valor_2 == self._tabla_simbolos.tipo_de_asignada:
                        print("CORRECTO, LA OPERACION ES EL MISMO TIPO")
                        
                    else:
                        print("ERROR, UNA EXPRESION DE LA OPERACION NO CONCUERDA CON LA VARIABLE A LA QUE SE ASIGNA")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append("ERROR, UNA EXPRESION DE LA OPERACION NO CONCUERDA CON LA VARIABLE A LA QUE SE ASIGNA")

                       
                elif valor1_en_tabla and posibles_expr[0].NUM() != None:
                    print("UN VALOR ESTA EN TABLA Y EL SEGUNDO ES UN NUMERO") 
                    tabla_posibles_valor1 = self._tabla_simbolos.return_same_ids(posible_id.getText())
                    current_variable = None
                    clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]

                    
                    for valor in tabla_posibles_valor1:
                        print(valor['padre'])
                        print(valor['ambito'])
                        print(valor['en_metodo'])
                        
                        print(f"current_method: {self._tabla_simbolos._current_method}")
                        print(f"clase actual: {clase_padre['id']}")
                        
                        if valor['en_metodo'] == self._tabla_simbolos._current_method:
                            
                            if valor['tipo'] == 'Int':
                                print("CORRECTO, se encuentran en el mismo metodo")
                                current_variable = True
                            else:
                                print(f"ERROR, LA VARIABLE {valor['id']} tiene distinto tipo")
                                self._tabla_simbolos._error_in_current_method = True
                                self._tabla_simbolos._error_in_code = True
                                self._tabla_simbolos._lista_errores.append(f"ERROR, LA VARIABLE {valor['id']} tiene distinto tipo")

                                
                        elif valor['padre'] == clase_padre['id']:
                            
                            if valor['tipo'] == 'Int':
                                print("CORRECTO, se encuentran en la misma clase")
                                current_variable = True
                            else:
                                print(f"ERROR, LA VARIABLE {valor['id']} tiene distinto tipo")
                                self._tabla_simbolos._error_in_current_method = True
                                self._tabla_simbolos._error_in_code = True
                                self._tabla_simbolos._lista_errores.append(f"ERROR, LA VARIABLE {valor['id']} tiene distinto tipo")

                                
                        else:
                            print(f"ERROR, VARIABLE {valor['id']} NO DEFINIDA")
                            self._tabla_simbolos._error_in_current_method = True
                            self._tabla_simbolos._error_in_code = True
                            self._tabla_simbolos._lista_errores.append(f"ERROR, VARIABLE {valor['id']} NO DEFINIDA")

                        
                    print(tabla_posibles_valor1)
                    #verificar_valor_evaluado(self, tabla_posibles_valor1)
                
                else:
                    print(f"EL VALOR CON ERROR ES: {valor1_en_tabla}")
                    self._tabla_simbolos._error_in_current_method = True
                    self._tabla_simbolos._error_in_code = True
                    self._tabla_simbolos._lista_errores.append(f"EL VALOR CON ERROR ES: {valor1_en_tabla}")

        
        # la contunacion de la expresion
        
        
        # SI NO HAY ALGO EN LA LISTA AVISAR ERROR
        else:
            print("PPEPEPEPEPEPEPEPEPEP")
            self._tabla_simbolos._error_in_current_method = True
            self._tabla_simbolos._error_in_code = True
            
    print("*************************")
        

    # Exit a parse tree produced by Proy1Parser#metodo11.
    def exitMetodo11(self, ctx:Proy1Parser.Metodo11Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo12.
    def enterMetodo12(self, ctx:Proy1Parser.Metodo12Context):
        print("metodo12")
        print(f"en metodo12: {ctx.getText()}")
        posible_id = ctx.ID()
        posible_expr = ctx.expr()
        
        print(f"posible_id: {posible_id}")
        print(f"posible_expr: {posible_expr}")
        
        
        # si posible_expr es None, hay un ID
        if posible_expr == None:
            print(f"se tiene un ID")
            print(f"posible_id: {posible_id.getText()}")
            
            si_hay_tablas = self._tabla_simbolos.id_en_tabla(posible_id.getText())
            
            if si_hay_tablas:
                verificar_id_metodo_12(self, posible_id.getText(), self._tabla_simbolos.tipo_de_asignada)
            else:
                print(f"ERROR, LA VARIABLE NO SE ENCUENTRA EN LA TABLA DE SIMBOLOS")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR, LA VARIABLE NO SE ENCUENTRA EN LA TABLA DE SIMBOLOS")

        
        # si posible_id es NOne, hay un ID
        else:
            print(f"se tiene una expr")
            print(f"posible_expr: {posible_expr.getText()}")
            
        print("*************************")

    # Exit a parse tree produced by Proy1Parser#metodo12.
    def exitMetodo12(self, ctx:Proy1Parser.Metodo12Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo13.
    def enterMetodo13(self, ctx:Proy1Parser.Metodo13Context):
        print("metodo13")
        
        print(f"expresiones en el while: {ctx.expr()}")
        for x in ctx.expr():
            print(x.getText())
            
        self._tabla_simbolos._en_condicion_while = True

    # Exit a parse tree produced by Proy1Parser#metodo13.
    def exitMetodo13(self, ctx:Proy1Parser.Metodo13Context):
        print("exit metodo13")
        print("*************************")
        self._tabla_simbolos._en_condicion_while = False


    # Enter a parse tree produced by Proy1Parser#metodo14.
    def enterMetodo14(self, ctx:Proy1Parser.Metodo14Context):
        print("metodo14")

    # Exit a parse tree produced by Proy1Parser#metodo14.
    def exitMetodo14(self, ctx:Proy1Parser.Metodo14Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo15.
    def enterMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        print("metodo15")
        print(ctx.getText())
        
        hay_not = ctx.Not()
        posible_inicializar = ctx.inicializar()
        posible_expr = ctx.expr()
        posible_metodo = ctx.metodo()
        posible_id = ctx.ID()
        
        print(f"hay_not: {hay_not}")
        print(f"posible_inicializar: {posible_inicializar}")
        print(f"posible_id: {posible_id}")
        print(f"posible_expr: {posible_expr}")
        print(f"posible_metodo: {posible_metodo}")
                
        
        #sys.exit()
        
        if posible_expr == None:
            
            print('IGNORAR TODO NEW')
            #self._tabla_simbolos._ignora_new = True
            
            print("HAY UNA INICIALIZAR")
            print(f"el inicializar: {posible_inicializar.getText()}")
            
            if posible_metodo != None:
                print(f"el id/clase: {posible_id.getText()}")
                print(f"el metodo: {posible_metodo[0].getText()}")
                print(f"el tipo del inicializar: {posible_inicializar.tipoVariable().getText()}")
                
                try:
                    self._tabla_simbolos._class_inicializada = posible_inicializar.tipoVariable().getText()
                    self._tabla_simbolos._se_define_new_15 = True
                    self._tabla_simbolos._ignora_new_15 = True
                except:
                    pass
                
            #sys.exit()
        
        

    # Exit a parse tree produced by Proy1Parser#metodo15.
    def exitMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        print("exit metodo15")
        self._tabla_simbolos._class_inicializada = None
        self._tabla_simbolos._se_define_new_15 = False
        self._tabla_simbolos._ignora_new_15 = False


    # Enter a parse tree produced by Proy1Parser#metodo16.
    def enterMetodo16(self, ctx:Proy1Parser.Metodo16Context):
        print("metodo16")

    # Exit a parse tree produced by Proy1Parser#metodo16.
    def exitMetodo16(self, ctx:Proy1Parser.Metodo16Context):
        pass
        
class MyListener2(Proy1Listener):
    
    def __init__(self):
        self._tabla_simbolos = TablaSimbolos()
        
    def imprimir_tabla_simbolos(self):
        print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %('TIPO', 'ID', 'SIZE', 'OFFSET', 'DEFINICION', 'VALOR', 'PADRE', 'EN METODO', 'AMBITO'))
        print("---------------------------------------------------------------------------------------------------------------------------------------")
        for x in self._tabla_simbolos._simbolos:
            print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %(x['tipo'], x['id'], x['size'], x['offset'], x['definicion'], x['valor'], x['padre'], x['en_metodo'], x['ambito']))
        
        
    # Enter a parse tree produced by Proy1Parser#metodo2.
    def enterMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        print(f"metodo2: {ctx.getText()}")
        print(f"nombre metodo: {ctx.ID()}")
        print(f"expresiones: {ctx.expr()}")
        print(f"metodos: {ctx.metodo()}")
        
        nombre_metodo = ctx.ID()
        expresiones = ctx.expr()
        metodos = ctx.metodo()
        
        # determinar si la clase que se inicializó existe
        existe_el_new_en_tabla = self._tabla_simbolos.id_en_tabla(self._tabla_simbolos._class_inicializada)
        print(self._tabla_simbolos._class_inicializada)
        print(existe_el_new_en_tabla)
        print(self._tabla_simbolos)
        #self.imprimir_tabla_simbolos()
        
        if self._tabla_simbolos._se_define_new_15:
            print("estamos viendo un @")
#            print(f"la class inicializada: {self._tabla_simbolos._class_inicializada}")
 #           print(f"la class llamada: {self._tabla_simbolos._class_llamada}")
            
            objeto_de_la_clase = self._tabla_simbolos.obtener_objeto(self._tabla_simbolos._class_inicializada)
            
            clase_activa = self._tabla_simbolos._class_inicializada
            
            clase_heredada = objeto_de_la_clase['padre']
            
            clase_a_buscar = self._tabla_simbolos._class_llamada
            
            objeto_de_clase_a_buscar = self._tabla_simbolos.obtener_objeto(clase_a_buscar)
            
            print(f"la class activa: {clase_activa}")
            print(f"la class heredada: {clase_heredada}")
            print(f"clase a buscar: {clase_a_buscar}")
            print(f"el objeto de la clase: {objeto_de_la_clase}")
            
            terminar_while = False
            
            if objeto_de_clase_a_buscar == None:
                print(f"ERROR: {clase_a_buscar} no puede obtenerse de {self._tabla_simbolos._class_inicializada}")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                self._tabla_simbolos._lista_errores.append(f"ERROR: {clase_a_buscar} no puede obtenerse de {self._tabla_simbolos._class_inicializada}")
                
            else:
                while terminar_while == False:
                    if clase_activa == clase_a_buscar or clase_heredada == clase_a_buscar:
                        print(f"CORRECTO: {self._tabla_simbolos._class_inicializada} hereda de la clase {clase_a_buscar}")
                        terminar_while = True
                    elif clase_heredada != "None":
                        nuevo_objeto_activo = self._tabla_simbolos.obtener_objeto(clase_heredada)
                        
                        clase_activa = clase_heredada
                        clase_heredada = nuevo_objeto_activo['padre']
                        
                    else:
                        
                        print(f"ERROR: la clase {clase_a_buscar} no puede obtenerse de la clase{self._tabla_simbolos._class_inicializada} ni de sus herencias")
                        self._tabla_simbolos._error_in_current_method = True
                        self._tabla_simbolos._error_in_code = True
                        self._tabla_simbolos._lista_errores.append(f"ERROR: la clase {clase_a_buscar} no puede obtenerse de la clase{self._tabla_simbolos._class_inicializada} ni de sus herencias")
                        terminar_while = True
                    
            #sys.exit()
            self._tabla_simbolos._se_define_new_15 = False
        
        elif existe_el_new_en_tabla:
            
            print(f"{self._tabla_simbolos._class_inicializada} si existe en la tabla de simbolos")
            objeto_de_la_clase = self._tabla_simbolos.obtener_objeto(self._tabla_simbolos._class_inicializada)
            
            print(f"objeto de la clase")
            print(objeto_de_la_clase)
            print(f"padre de la clase: {objeto_de_la_clase['padre']}")
            
            clase_activa = self._tabla_simbolos._class_inicializada
            clase_heredada = objeto_de_la_clase['padre']
            
            encontramos_metodo = False
            terminar_while = False
            
            while terminar_while == False:
                # encontramos los metodo  de la clase activa y el padre
                metodos_clase_activa = obtener_metodos_de_una_clase(self, clase_activa)
                metodos_clase_heredada = obtener_metodos_de_una_clase(self, clase_heredada)
            
                print(metodos_clase_activa)
                print(metodos_clase_heredada)
            
                # si encontramos el metodo en la clase activa, imprimimos correcto
                # definimos que encontramos metodo es verdadero y que terminar while es verdadero
                if nombre_metodo.getText() in metodos_clase_activa:
                    print(f'CORRECTO metodo se encuentra en clase {self._tabla_simbolos._class_inicializada}')
                    encontramos_metodo = True
                    terminar_while = True
                    
                elif clase_heredada != "None":
                    
                    
                    # si encontramos el metodo en la clase heredada, imprimimos correcto
                    # definimos que encontramos metodo es verdadero y que terminar while es verdadero
                    if nombre_metodo.getText() in metodos_clase_heredada:
                        print(f"CORRECTO metodo se encuentra en clase heredada {objeto_de_la_clase['padre']}")
                        encontramos_metodo = True
                        terminar_while = True
                        
                    else:
                        nuevo_objeto_inicializado = self._tabla_simbolos.obtener_objeto(clase_heredada)
                        
                        # se define nueva clase_activa y clase heredada
                        clase_activa = nuevo_objeto_inicializado['id']
                        clase_heredada = nuevo_objeto_inicializado['padre']
                        
                        
                        
                else:
                    print(f"ERROR: el metodo {nombre_metodo.getText()} no esta definido en la clase {self._tabla_simbolos._class_inicializada}")
                    self._tabla_simbolos._error_in_current_method = True
                    self._tabla_simbolos._error_in_code = True
                    self._tabla_simbolos._lista_errores.append(f"ERROR: La clase {self._tabla_simbolos._class_inicializada} no existe ")
                    terminar_while = True
        
        # REVISAR PLSSS
        """
        else:
            print(f"el contexto es {ctx.getText()}")
            print(f"ERROR: uiiiii La clase {self._tabla_simbolos._class_inicializada} no existe ")
            self._tabla_simbolos._error_in_current_method = True
            self._tabla_simbolos._error_in_code = True
            self._tabla_simbolos._lista_errores.append(f"ERROR: La clase {self._tabla_simbolos._class_inicializada} no existe ")
        """
        
     # Exit a parse tree produced by Proy1Parser#metodo2.
    def exitMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        print("exit metodo2")
        
    # Enter a parse tree produced by Proy1Parser#metodo3.
    def enterMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        print("metodo3")
        
        
        
        hay_not = ctx.Not()            
        posible_inicializar = ctx.inicializar()
        posible_expr = ctx.expr()
        posible_metodo = ctx.metodo()
        
         
        
        
        if hay_not == None:
            # Si el contexto de inicializar es None, se tiene una expresión, se deja pasar para que lo jale el siguiente listener
            
            if posible_expr == None:
                
                print("HAY UNA INICIALIZAR")
                print(ctx.getText())
                print(f"hay_not: {hay_not}")
                print(f"posible_inicializar: {posible_inicializar}")
                print(f"posible_expr: {posible_expr}")
                print(f"posible_metodo: {posible_metodo}") 
                print(f"el inicializar: {posible_inicializar.getText()}")
                
                if posible_metodo != None:
                    #print(f"el metodo: {posible_metodo.getText()}")
                    #print(f"el tipo del inicializar: {posible_inicializar.tipoVariable().getText()}")
                    
                    try:
                        self._tabla_simbolos._class_inicializada = posible_inicializar.tipoVariable().getText()
                        self._tabla_simbolos._se_define_new = True
                        
                        print(self._tabla_simbolos._class_inicializada)
                        print(self._tabla_simbolos._se_define_new)
                        
                    except:
                        pass
                    
                    #self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])

    
        else:
            print("TIENE UN NOT")
        
        
        print("**********************")
        

    # Exit a parse tree produced by Proy1Parser#metodo3.
    def exitMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        print("exit metodo3")
        self._tabla_simbolos._class_inicializada = None
        self._tabla_simbolos._se_define_new = False
        self._tabla_simbolos._ignora_new = False
        
    # Enter a parse tree produced by Proy1Parser#metodo15.
    def enterMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        print(f"metodo 15 segunda corrida")

        print(ctx.getText())
        
        hay_not = ctx.Not()
        posible_inicializar = ctx.inicializar()
        posible_expr = ctx.expr()
        posible_metodo = ctx.metodo()
        posible_id = ctx.ID()
        
        #sys.exit()
        
        if posible_expr == None:
            
            print('IGNORAR TODO NEW')
            #self._tabla_simbolos._ignora_new = True
            
            print("HAY UNA INICIALIZAR")
            print(f"el inicializar: {posible_inicializar.getText()}")
            
            if posible_metodo != None:
                print(f"el id/clase: {posible_id.getText()}")
                print(f"el metodo: {posible_metodo[0].getText()}")
                print(f"el tipo del inicializar: {posible_inicializar.tipoVariable().getText()}")
                
                try:
                    self._tabla_simbolos._class_inicializada = posible_inicializar.tipoVariable().getText()
                    self._tabla_simbolos._class_llamada = posible_id.getText()
                    self._tabla_simbolos._se_define_new_15 = True
                    self._tabla_simbolos._ignora_new_15 = True
                except:
                    pass
                
            #sys.exit()

    # Exit a parse tree produced by Proy1Parser#metodo15.
    def exitMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        print("exit metodo15 segunda corrida")
        
class ErrorHandler(ErrorListener):
    def __init__(self):
        self.errores = False
        self.erroresLexico = []
        pass

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errores = True
        errorMsg = 'Error Lexico: Linea ' + str(line) + ':' + str(column) +  ' ' + str(msg)
        self.erroresLexico.append(errorMsg)

    def tieneErrores(self):
        return self.errores
    
# COMANDO PARA EL TEXT EDITOR

# borrar todo el texto que estaba
def limpiar_editor():
    my_text.delete("1.0", END)
    
# agregar el contenido de un .txt o un .g4
def abrir_archivo():
    # limpiar texto
    my_text.delete("1.0", END)
    text_file = filedialog.askopenfilename(initialdir="C:/Users/toni/Desktop/COMPIS/git/Compiladores/Laboratorio 1/", filetypes=(("Text Files", "*.txt"), ("G4 Files", "*.g4"), ("Cl Files", "*.cl")))
    
    # abrir texto
    text_file = open(text_file, 'r')
    stuff = text_file.read()
    
    # agregar archivo a el editor de texto
    my_text.insert(END, stuff)
    
    text_file.close()
    
def ejecutar():
    
    with open('ejecutar.txt', 'w') as f:
        data = my_text.get("1.0", END)
        f.write(data)
        
    ### Carga inicial de archivo
    input = FileStream('ejecutar.txt')
    lexer = Proy1Lexer(input)
    stream = CommonTokenStream(lexer)
    parser = Proy1Parser(stream)
    ### Se define un handle de errores para manejarlo de mejor manera
    errores = ErrorHandler()
    parser.removeErrorListeners()
    parser.addErrorListener(errores)
    ### Se obtiene el arbol que genero el parser
    tree = parser.start()
    printerDecaf = None
    tablesResumen = []

    ### En caso no haya errores lexicos se procede con el
    ### analisis semantico
    if not errores.tieneErrores():
        ### Se obtiene el printer y walker para poder hacer el
        ### recorrido por el arbol
        printerDecaf = MyListener()
        walker = ParseTreeWalker()
        walker.walk(printerDecaf, tree)
        
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")

        
        ### Segundo paso
        secondPrinterDecaf = MyListener2()
        secondPrinterDecaf._tabla_simbolos = printerDecaf._tabla_simbolos
        secondPrinterDecaf._tabla_simbolos._error_in_code = printerDecaf._tabla_simbolos._error_in_code
        secondPrinterDecaf._tabla_simbolos._lista_errores = printerDecaf._tabla_simbolos._lista_errores
        
        print(f"LA TABLA EN SEGUNDA CORRIDA")
        
        secondPrinterDecaf.imprimir_tabla_simbolos()
        walker = ParseTreeWalker()
        walker.walk(secondPrinterDecaf, tree)
        
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        
        print(f"self._tabla_simbolos._error_in_code: {secondPrinterDecaf._tabla_simbolos._error_in_code}")
        
        print("LISTA ERRORES")
        for x in secondPrinterDecaf._tabla_simbolos._lista_errores:
            print(x)
    
        
"""
root = Tk()
root.title('Text Editor')
root.geometry("1200x660")

my_frame = Frame(root)
my_frame.pack(pady=5)

text_scroll = Scrollbar(my_frame)
text_scroll.pack(side=RIGHT, fill=Y)

my_text = Text(my_frame, width=97, height=25, font=("Helvetica", 16), selectbackground="yellow", selectforeground="black", undo=True, yscrollcommand=text_scroll.set)
my_text.pack()

text_scroll.config(command=my_text.yview)

my_menu = Menu(root)
root.config(menu=my_menu)

file_menu = Menu(my_menu)
my_menu.add_cascade(label="File", menu=file_menu)
file_menu.add_command(label="New", command=limpiar_editor)
file_menu.add_command(label="Open", command=abrir_archivo)
file_menu.add_separator()
file_menu.add_command(label="Execute", command=ejecutar)
file_menu.add_separator()
file_menu.add_command(label="Exit", command=root.quit)

root.mainloop()
"""



if __name__ == "__main__":
    ### Carga inicial de archivo
    input = FileStream('ejemploOperacion.txt')
    lexer = Proy1Lexer(input)
    stream = CommonTokenStream(lexer)
    parser = Proy1Parser(stream)
    ### Se define un handle de errores para manejarlo de mejor manera
    errores = ErrorHandler()
    parser.removeErrorListeners()
    parser.addErrorListener(errores)
    ### Se obtiene el arbol que genero el parser
    tree = parser.start()
    printerDecaf = None
    tablesResumen = []

    ### En caso no haya errores lexicos se procede con el
    ### analisis semantico
    if not errores.tieneErrores():
        ### Se obtiene el printer y walker para poder hacer el
        ### recorrido por el arbol
        printerDecaf = MyListener()
        walker = ParseTreeWalker()
        walker.walk(printerDecaf, tree)
        
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")

        
        ### Segundo paso
        secondPrinterDecaf = MyListener2()
        secondPrinterDecaf._tabla_simbolos = printerDecaf._tabla_simbolos
        secondPrinterDecaf._tabla_simbolos._error_in_code = printerDecaf._tabla_simbolos._error_in_code
        secondPrinterDecaf._tabla_simbolos._lista_errores = printerDecaf._tabla_simbolos._lista_errores
        
        print(f"LA TABLA EN SEGUNDA CORRIDA")
        
        secondPrinterDecaf.imprimir_tabla_simbolos()
        walker = ParseTreeWalker()
        walker.walk(secondPrinterDecaf, tree)
        
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        print("########################################################")
        
        print(f"self._tabla_simbolos._error_in_code: {secondPrinterDecaf._tabla_simbolos._error_in_code}")
        
        print("LISTA ERRORES")
        for x in secondPrinterDecaf._tabla_simbolos._lista_errores:
            print(x)
