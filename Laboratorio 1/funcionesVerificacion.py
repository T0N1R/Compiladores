import copy
from testfixtures import compare

def check_int(s):
    if s[0] in ('-', '+'):
        return s[1:].isdigit()
    return s.isdigit()


def verificacion_correcto_3_simple(self, tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible):
    for asignable in tabla_posibles_asignable:
        id_del_asignable = asignable['id']
        tipo_del_asignable = asignable['tipo']
        definicion_del_asignable = asignable['definicion']
        en_metodo_del_asignable = asignable['en_metodo']
        ambito_del_asignable = asignable['ambito']
        padre_del_asignable = asignable['padre']
        
        """print("DATOS DEL ASIGNABLEEEEEEEEEEEEEEEEEEEE")
        print(f"id_del_asignable: {id_del_asignable}")
        print(f"tipo_del_asignable: {tipo_del_asignable}")
        print(f"definicion_del_asignable: {definicion_del_asignable}")
        print(f"en_metodo_del_asignable: {en_metodo_del_asignable}")
        print(f"ambito_del_asignable: {ambito_del_asignable}")
        print(f"padre_del_asignable: {padre_del_asignable}")
        
        print("DATOS ACTUALESSSSSSSSSSSSSSSS")
        print(f"metodo_actual: {metodo_actual}")
        print(f"clase_padre_actual: {clase_padre_actual}")"""
        
        if en_metodo_del_asignable == metodo_actual:
            #print("esta variable puede asignarse por estar en el mismo metodo")
            
            # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                self.imprimir_tabla_simbolos()
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
                
            
        elif ambito_del_asignable == 'global':
            #print("esta variable puede asignarse por ser una variable global")
            
             # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                self.imprimir_tabla_simbolos()
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
                self._tabla_simbolos._error_in_current_method = True
                self._tabla_simbolos._error_in_code = True
            
        else:
            print("ERROR, ESTA VARIABLE NO HA SIGO ASIGNADA")
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

    