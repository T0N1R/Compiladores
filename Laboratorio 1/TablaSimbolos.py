class TablaSimbolos():
    def __init__(self):
        self._simbolos = []
        self._offset = 0
    
    def agregar_simbolo(self, tipo, id, size, offset, isParameter, valor):
        self._simbolos.append({
            'tipo': tipo,
            'id': id,
            'size': size,
            'offset': offset,
            'isParameter': isParameter,
            'valor': valor
        })
        
    def id_en_tabla(self, id):
        for d in self._simbolos:
            if id == d['id']:
                return True
            
        return False