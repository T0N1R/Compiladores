class TablaSimbolos():
    def __init__(self):
        self._simbolos = []
        # posicion en el array de simbolos de la clase donde estamos
        self.current_class = 0
        # indicador de que estamos dentro de un metodo
        self._in_method = False
        # identificador del nombre del metodo
        self._current_method = None
        self._offset = 0
    
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