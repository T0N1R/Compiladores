import copy
from distutils.log import debug
from testfixtures import compare
import sys

def check_int(s):
    if s[0] in ('-', '+'):
        return s[1:].isdigit()
    return s.isdigit()


def verificacion_correcto_3_simple(self, tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible):
    
    # determinar si verifica para 1 de la tabla de posibles valores
    verificado = []
    
    for asignable in tabla_posibles_asignable:
        id_del_asignable = asignable['id']
        tipo_del_asignable = asignable['tipo']
        definicion_del_asignable = asignable['definicion']
        en_metodo_del_asignable = asignable['en_metodo']
        ambito_del_asignable = asignable['ambito']
        padre_del_asignable = asignable['padre']
        
        
        if en_metodo_del_asignable == metodo_actual:
            
            verificado.append(1)
            print(f"tipo_del_posible: {tipo_del_posible}")
            print(f"tipo_del_asignable: {tipo_del_asignable}")

            
            #print("esta variable puede asignarse por estar en el mismo metodo")
            
            # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                self._tabla_simbolos._se_asigna_a_variable = True
                self._tabla_simbolos.tipo_de_asignada = tipo_del_asignable
                self._variable_asiganda = id_del_asignable
                
                print("DATOS DEL ASIGNABLE")
                print(f"_variable_asiganda: {self._variable_asiganda}")
                print(f"tipo_de_asignada: {self._tabla_simbolos.tipo_de_asignada}")
                print(f"_se_asigna_a_variable: {self._tabla_simbolos._se_asigna_a_variable}")
                
                   
                
                self.imprimir_tabla_simbolos()
                
            else:
                print("ERROR, LAS VARIABLES NO SON DEL MISMO TIPO")
                
            
                
            
        elif ambito_del_asignable == 'global':
            
            verificado.append(1)
            
            #print("esta variable puede asignarse por ser una variable global")
            
             # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                self._tabla_simbolos._se_asigna_a_variable = True
                self._tabla_simbolos.tipo_de_asignada = tipo_del_asignable
                self._variable_asiganda = id_del_asignable
                
                verificado.append(1)   
                
                self.imprimir_tabla_simbolos()
                
            else:
                print("ERROR, LAS VARIABLES NO SON DEL MISMO TIPO")
                
            
            
       
            
    print(f"contenido en verificado: {verificado}")
    if len(verificado) == 0:
        # HAY ERROR
        print("debug 3")
        print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
        self._tabla_simbolos._error_in_current_method = True
        self._tabla_simbolos._error_in_code = True
            
# si se encuentra un error dentro de un metodo, este metodo no se considera valido
# se remueven los valores del metodo de la tabla de simbolos.
def remover_contenido_de_metodo(self):
    print(f"metodo actual: {self._tabla_simbolos._current_method}")
    metodo_actual = self._tabla_simbolos._current_method
    tabla_simbolos = copy.deepcopy(self._tabla_simbolos._simbolos)
    nueva_tabla = copy.deepcopy(self._tabla_simbolos._simbolos)
    
    lista_a_borrar = []
    
    for x in tabla_simbolos:
        if x['en_metodo'] == metodo_actual:
            lista_a_borrar.append(x)
            
        if compare(x, self._tabla_simbolos._in_method_object):            
            lista_a_borrar.append(x)
    
    #self._tabla_simbolos._simbolos = [x for x in tabla_simbolos if not x in lista_a_borrar]
    nueva_tabla = [x for x in tabla_simbolos if not x in lista_a_borrar]

def verificacion_metodo_11(self, tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible):
    
    posibles_correctos = []
    
    for asignable in tabla_posibles_asignable:
        tipo_del_asignable = asignable['tipo']
        en_metodo_del_asignable = asignable['en_metodo']
        ambito_del_asignable = asignable['ambito']
        
        if en_metodo_del_asignable == metodo_actual:
            #print("esta variable puede asignarse por estar en el mismo metodo")
            
            # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                if self._tabla_simbolos.tipo_de_asignada != None and self._tabla_simbolos._se_asigna_a_variable != False:
                    if tipo_del_posible == self._tabla_simbolos.tipo_de_asignada:
                        print("el tipo es el mismo al de la tipo_se_ asignada, se pede hacer")
                        print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                        posibles_correctos.append(1)
                        return tipo_del_posible
                        
                    else:
                        print("ERROR, no conecuerda con tipo_de_asignada")
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
                
                
            
        elif ambito_del_asignable == 'global':
            #print("esta variable puede asignarse por ser una variable global")
            
            # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                if self._tabla_simbolos.tipo_de_asignada != None and self._se_asigna_a_variable != False:
                    if tipo_del_posible == self._tabla_simbolos.tipo_de_asignada:
                        print("el tipo es el mismo al de la tipo_se_ asignada, se pede hacer")
                        print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                        posibles_correctos.append(1)
                        return tipo_del_posible
                        
                    else:
                        print("ERROR, no conecuerda con tipo_de_asignada")
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
            
    if len(posibles_correctos) == 0:
        print("ERROR, ESTA VARIABLE NO HA SIGO ASIGNADA")
        self._tabla_simbolos._error_in_current_method = True
        self._tabla_simbolos._error_in_code = True
        
            
# verificar que id ya existe en tabla
def verificar_en_tabla(self, valor_id, nombre_metodo):
    
    print("entramos?")
    
    tabla_posibles_valores = self._tabla_simbolos.return_same_ids(valor_id)
        
    print(f"Tabla posibles valores : {tabla_posibles_valores}")
        
    # determinar si verifica para 1 de la tabla de posibles valores
    verificado = []

    for variable in tabla_posibles_valores:
                
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
            print(f"debug 1")
            print("CORRECTO, se puede utilizar la variable por estar en el mismo metodo")
            verificado.append(1)   
        
        # VERIFICAR SI LA POSIBLE VARIABLE en la clase
        elif padre_del_posible == clase_padre_actual:
            print(f"debug 2")
            print("CORRECTO, se puede utilizar la variable por ser una variable global")
            verificado.append(1)
            
        # EVALUAR SI HAY UN VALOR ASIGNADO EN _variable_que_se_opera
        if self._tabla_simbolos._variable_que_se_opera != None:
            print(f"valor en _variable_que_se_opera: {self._tabla_simbolos._variable_que_se_opera}")
            
            var_que_se_opera = self._tabla_simbolos._variable_que_se_opera[0]
            clase_en_que_se_opera = self._tabla_simbolos._variable_que_se_opera[1]            
            lista_metodos = obtener_metodos_de_una_clase(self, clase_en_que_se_opera)
            
            print(f"var que se opera: {var_que_se_opera}")
            print(f"clase_en_que_se_opera: {clase_en_que_se_opera}")
            print(f"nombre_metodo: {nombre_metodo}")
            print(f"lista_metodos: {lista_metodos}")
            
            if nombre_metodo.getText() in lista_metodos:
                print(f"CORRECTO, el metodo se encuentra en la clase {clase_en_que_se_opera}")
                verificado.append(1)
            else:
                print(f"ERROR, el metodo {nombre_metodo} no se encuentra en clase {clase_en_que_se_opera} definida en la variable {var_que_se_opera}")
            
        if self._tabla_simbolos._class_inicializada != None:
            print(f"LA CLASE A LA QUE SE LE HIZO NEW: {self._tabla_simbolos._class_inicializada}")
            print(f"nombre metodo: {nombre_metodo}")
            lista_metodos = obtener_metodos_de_una_clase(self, self._tabla_simbolos._class_inicializada)
            print(lista_metodos)
            
            if nombre_metodo.getText() in lista_metodos:
                print(f"CORRECTO, el metodo se encuentra en la clase {self._tabla_simbolos._class_inicializada}")
                verificado.append(1)
            else:
                print(f"ERROR, el metodo {nombre_metodo} no se encuentra en clase {self._tabla_simbolos._class_inicializada} definida en la variable {var_que_se_opera}")


            
            
    print(f"contenido en verificado: {verificado}")
    if len(verificado) == 0:
        
        print(F"whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy {nombre_metodo}")
        
        print(self._tabla_simbolos._current_method)
        
        if nombre_metodo == self._tabla_simbolos._current_method:
            print("correcto")
        
        elif valor_id in self._tabla_simbolos._metodos_permitidos:
            print("CORRECTO : Es un metodo permitido")
            
        elif self._tabla_simbolos.id_en_tabla(nombre_metodo.getText()):
            print("correcto")
            
        elif nombre_metodo.getText() == 'abort':
            print("correcto")
            
        else:            
            # HAY ERROR
            print("debug 3")
            print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
            self._tabla_simbolos._error_in_current_method = True
            self._tabla_simbolos._error_in_code = True
        

def verificar_id_metodo_12(self, valor_id, tipo_id):
    tabla_posibles_valores = self._tabla_simbolos.return_same_ids(valor_id)
    print(f"tabla_posibles_valores: {tabla_posibles_valores}")
        
    # determinar si verifica para 1 de la tabla de posibles valores
    verificado = []
    error_distinto_tipo = []

    for variable in tabla_posibles_valores:
        
        print(f"pasamos por el : {variable['id']}")
        
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
            print(f"debug 1")
            if tipo_del_posible == tipo_id:
                print("CORRECTO, se puede utilizar la variable por estar en el mismo metodo")
                verificado.append(1)  
                
            else:
                print(f"ERROR, tipo con su variable referenciada no corresponde")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
            
            
        # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
        elif padre_del_posible == clase_padre_actual:
            print(f"debug 2")
            print("CORRECTO, se puede utilizar la variable por ser una variable global")
            if tipo_del_posible == tipo_id:
                print("CORRECTO, se puede utilizar la variable por estar en el mismo metodo")
                verificado.append(1)  
                
            else:
                print(f"ERROR, tipo con su variable referenciada no corresponde")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
            
    print(f"contenido en verificado: {verificado}")
    if len(verificado) == 0:
        # HAY ERROR
        print("debug 3")
        print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
        self._tabla_simbolos._error_in_current_method = True
        self._tabla_simbolos._error_in_code = True
        

# Obtener los metodos que pertenecen a una clase espcifica
# nombre_de_clase es el tipo en tabla de simbolos
def obtener_metodos_de_una_clase(self, nombre_de_clase):
    tabla_metodos = []
    tabla_simbolos = copy.deepcopy(self._tabla_simbolos._simbolos)

    # por cada elemento en la tabla de simbolos
    for element in tabla_simbolos:
        #si la definicion del elemento es un metodo
        if element['definicion'] == "metodo":
            #verificar si el padre del elemento es igual al nombre de clase
            if element['padre'] == nombre_de_clase:
                # si son iguales, agregar el ID del elemento a la lista
                tabla_metodos.append(element['id'])
                
    return tabla_metodos
            

# Obtener las variables que pertenecen a una clase especifica
def obtener_variable_de_una_clase(self, nombre_de_clase):
    tabla_variables = []
    tabla_simbolos = copy.deepcopy(self._tabla_simbolos._simbolos)
    
    for element in tabla_simbolos:
        # si la definicion del elemento es una variable
        if element['definicion'] == "variable":
            #verificar si el padre del elemento es igual al nombre de clase
            if element['padre'] == nombre_de_clase:
                # si son iguales, agregar el ID del elemento a la lista
                tabla_variables.append(
                    {
                        "id": element['id'],
                        "padre": element['padre'],
                        "tipo": element['tipo']
                    }
                )
                
    return tabla_variables


def verificar_valor_evaluado(self, tabla_posibles_valor1):
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
                tipo_valor_1 = verificacion_metodo_11(self, tabla_posibles_valor1, metodo_actual, clase_padre_actual, tipo_del_posible)
                
            # VERIFICAR SI LA POSIBLE VARIABLE ES GLOBAL
            elif padre_del_posible == clase_padre_actual:
                print("se le puede asignar a la variable por ser una variable global")
                posibles_correctos_v1.append(1)
                tipo_valor_1 = verificacion_metodo_11(self, tabla_posibles_valor1, metodo_actual, clase_padre_actual, tipo_del_posible)

            # HAY ERROR
            #else:
            #    print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
            #    self._tabla_simbolos._error_in_current_method = True
            #    self._tabla_simbolos._error_in_code = True
        
        if len(posibles_correctos_v1) == 0:
            print("ERROR ESTA VARIABLE NO HA SIDO ASIGNADA")
            self._tabla_simbolos._error_in_current_method = True
            self._tabla_simbolos._error_in_code = True
            
    print("/////////////////////")
    print(f"tipo de asignada: {self._tabla_simbolos.tipo_de_asignada}")
    print(f"tipo_valor_1: {tipo_valor_1}")
    print("ding ding")
    if tipo_valor_1 == self._tabla_simbolos.tipo_de_asignada:
        print("CORRECTO, LA OPERACION ES EL MISMO TIPO")
        
    else:
        print("ERROR, UNA EXPRESION DE LA OPERACION NO CONCUERDA CON LA VARIABLE A LA QUE SE ASIGNA")
        self._tabla_simbolos._error_in_current_method = True
        self._tabla_simbolos._error_in_code = True