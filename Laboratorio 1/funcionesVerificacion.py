def check_int(s):
    if s[0] in ('-', '+'):
        return s[1:].isdigit()
    return s.isdigit()


def verificacion_correcto_3_simple(tabla_posibles_asignable, metodo_actual, clase_padre_actual, tipo_del_posible):
    for asignable in tabla_posibles_asignable:
        id_del_asignable = asignable['id']
        tipo_del_asignable = asignable['tipo']
        definicion_del_asignable = asignable['definicion']
        en_metodo_del_asignable = asignable['en_metodo']
        ambito_del_asignable = asignable['ambito']
        padre_del_asignable = asignable['padre']
        
        print("DATOS DEL ASIGNABLEEEEEEEEEEEEEEEEEEEE")
        print(f"id_del_asignable: {id_del_asignable}")
        print(f"tipo_del_asignable: {tipo_del_asignable}")
        print(f"definicion_del_asignable: {definicion_del_asignable}")
        print(f"en_metodo_del_asignable: {en_metodo_del_asignable}")
        print(f"ambito_del_asignable: {ambito_del_asignable}")
        print(f"padre_del_asignable: {padre_del_asignable}")
        
        print("DATOS ACTUALESSSSSSSSSSSSSSSS")
        print(f"metodo_actual: {metodo_actual}")
        print(f"clase_padre_actual: {clase_padre_actual}")
        
        if en_metodo_del_asignable == metodo_actual:
            print("esta variable puede asignarse por estar en el mismo metodo")
            
            # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
                
            
        elif ambito_del_asignable == 'global':
            print("esta variable puede asignarse por ser una variable global")
            
             # verificar si los 2 tipos variables son del mismo tipo
            if tipo_del_posible == tipo_del_asignable:
                print("CONFIRMADO, SE PUEDE ASIGNAR ESTA VARIABLE")
                
            else:
                print("ERROR, LAS VARIABLES TIENE DISTINTOS TIPOS")
            
        else:
            print("ESTA VARIABLE NO HA SIGO ASIGNADA")