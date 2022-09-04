class TablaSimbolos():
    def __init__(self):
        self._simbolos = []
        
        # evaluar para agregar en correct temporal
        # hay let temporal
        self.hay_let_temporal = False
        
        """
        {
            'tipo': tipo,
            'id': id,
            'size': size,
            'offset': offset,
            'definicion': definicion,
            'valor': valor,
            'padre': padre,
            'en_metodo': self._current_method,
            'ambito': current_ambito
        }
        """
        self.objeto_let_temporal = None
        
        # ---------------------------------
        
        self._en_condicion_if = False
        
        self._en_condicion_while = False
        
        self._en_while_cr5 = False
        
        # ---------------------------------
        
        # VARIABLE EN SEPARADO
        # simbolo de variable
        self._se_asigna_a_variable = False
        
        # tipo de variable asignada
        self.tipo_de_asignada = None
        
        # nombre de variable asignada
        self._variable_asiganda = None
        
        # ---------------------------------
        
        # posicion en el array de simbolos de la clase donde estamos
        self.current_class = 0
        
        # indicador de que estamos dentro de un metodo
        self._in_method = False
        
        # identificador del nombre del metodo
        self._current_method = None
        
        # in method object
        self._in_method_object = None
        
        # offset
        self._offset = 0
        
        #
        self._error_in_current_method = False
        
        # error en codigo
        self._error_in_code = False
        
        # lista de clases agregadas
        self._added_classes = []
        
        # guardar variable de la que se opera (al .algo.algo * )
        self._variable_que_se_opera = None
        
        self._class_inicializada = None
        
        # metodos permitidos
        self._metodos_permitidos = ['abort', 'out_string', 'out_int', 'type_name', 'substr']
        
        # lista con los errores
        self._lista_errores = []
        
        self._se_define_new = False
        
        self._ignora_new = False
        
        self._se_define_new_15 = False
        
        self._ignora_new_15 = False
        
        self._class_llamada = None
        
        self._minicondicion = False
    
    def agregar_simbolo(self, tipo, id, size, offset, definicion, valor, padre):
        
        current_ambito = ''
        
        if self._in_method == True:
            current_ambito = 'private'
        else:
            current_ambito = 'global'
        
        self._simbolos.append({
            'tipo': tipo,
            'id': id,
            'size': size,
            'offset': offset,
            'definicion': definicion,
            'valor': valor,
            'padre': padre,
            'en_metodo': self._current_method,
            'ambito': current_ambito
        })
        
    def agregar_in_method_object(self, tipo, id, size, offset, definicion, valor, padre):
        
        current_ambito = ''
        
        if self._in_method == True:
            current_ambito = 'private'
        else:
            current_ambito = 'global'
        
        self._in_method_object = {
            'tipo': tipo,
            'id': id,
            'size': size,
            'offset': offset,
            'definicion': definicion,
            'valor': valor,
            'padre': padre,
            'en_metodo': self._current_method,
            'ambito': current_ambito
        }
        
    def id_en_tabla(self, id):
        for d in self._simbolos:
            if id == d['id']:
                return True
            
        return False
    
    def obtener_objeto(self, id):
        for d in self._simbolos:
            if id == d['id']:
                return d
            
    def editar_valor_en_tabla(self, id_object, valor):
        for d in self._simbolos:
            if id_object == d['id']:
                d['valor'] = valor
                
    # devolver lista de ids con el mismo nombre
    def return_same_ids(self, id):
        return_table = []
        for d in self._simbolos:
            if id == d['id']:
                return_table.append(d)
        
        return return_table
    
    def regresar_objeto_en_ambito(self, posible_objeto):
        for d in posible_objeto:
            tipo_del_posible = d['tipo']
            en_metodo_del_posible = d['en_metodo']
            ambito_del_posible = d['ambito']
            padre_del_posible = d['padre']
            
            metodo_actual = self._current_method
            clase_padre_actual = self._simbolos[self.current_class]['id']
            
            if en_metodo_del_posible == metodo_actual:
                return d
            
            elif padre_del_posible == clase_padre_actual:
                return d