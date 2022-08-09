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
        
        self._tabla_simbolos.agregar_simbolo("Int", "Int", None, None, None, None, None)
        self._tabla_simbolos.agregar_simbolo("String", "String", None, None, None, None, None)
        self._tabla_simbolos.agregar_simbolo("Bool", "Bool", None, None, None, None, None)
    
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
                self._tabla_simbolos.agregar_simbolo('class', class_name, None, None, 'clase', None, inhty)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
            else:
                print("Clase Main no puede heredar de esta clase (las clases básicas son Int, String, Bool, IO)")
            
        else:
            if inhty == "vacio":
                self._tabla_simbolos.agregar_simbolo('class', class_name, None, None, 'clase', None, None)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
            else:
                self._tabla_simbolos.agregar_simbolo('class', class_name, None, None, 'clase', None, inhty)
                self._tabla_simbolos.current_class = len(self._tabla_simbolos._simbolos) - 1
            
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_1(self, ctx:Proy1Parser.Tipo_correcto_1Context):
        print("correcto 1")
        
        # tipos basicos
        allowed_types = ["Int", "String", "Bool"]
        
        # obtener id que se inicializa
        asigned_id = ctx.ID().getText()
        print(asigned_id)
        
        # obteneri tipo de variable que sera asignado
        asigned_type = ctx.tipoVariable().getText()
        
        # verificar si la variable ya fue inicializada
        if self._tabla_simbolos.id_en_tabla(asigned_id):
            print("variable ya fue inicializada")
            
        # si no ha sido inicializada, se verifica el tipo de variable y se agrega a la tabla de simbolos
        else:
            if asigned_type in allowed_types:
                
                clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]
                
                if asigned_type == 'String':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', "empty string", clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                    
                if asigned_type == 'Int':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', 0, clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                    
                if asigned_type == 'Bool':
                    self._tabla_simbolos.agregar_simbolo(asigned_type, asigned_id, None, None, 'variable', False, clase_padre['id'])
                    #print("SE AGREGO A LA TABLA")
                
                """for x in self._tabla_simbolos._simbolos:
                    print(x)"""
            
            else:
                print("este tipo de variable no es permitido")
            
            
        print('---------------------------------------')


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_3.
    def exitTipo_correcto_3(self, ctx:Proy1Parser.Tipo_correcto_3Context):
        print("correcto 3")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_4.
    def exitTipo_correcto_4(self, ctx:Proy1Parser.Tipo_correcto_4Context):
        print("correcto 4")


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_5.
    def exitTipo_correcto_5(self, ctx:Proy1Parser.Tipo_correcto_5Context):
        print("correcto 5")
        
        """if self._tabla_simbolos.id_en_tabla(expr):
                print("esta en tabla de simbolos, obtener su valor")
                
                expr_object = self._tabla_simbolos.obtener_objeto(expr)
                
                if id_object['tipo'] == expr_object['tipo']:
                    print("Valido, ambos tienen el mismo tipo")
                    
                else:
                    print('No Valido, tienen tipos distintos')
            
            else:
                #Verificar que se asigna un Int a una variable Int
                if check_int(expr):
                    print("el valor es Int")
                else:
                    print("el valor no es Int")"""
                    
        print('---------------------------------------')
        


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_6.
    def exitTipo_correcto_6(self, ctx:Proy1Parser.Tipo_correcto_6Context):
        print("correcto 6")
        
        id = ctx.ID().getText()
        
        expr = ctx.expr().getText()
        
        print(id, expr)
        
        # verificar si la variable ya fue inicializada
        if self._tabla_simbolos.id_en_tabla(id):
            
            id_object = self._tabla_simbolos.obtener_objeto(id)
            
            #Verificar que se asigna un Int a una variable String
            if '"' in expr and id_object['tipo'] == 'String':
                print("el valor es String")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
            
            #Verificar que se asigna un Int a una variable Int
            if check_int(expr) and id_object['tipo'] == 'Int':
                print("el valor es Int")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
                
            # Verificar que se asigna un Int 0 o 1 para una variable Bool
            if check_int(expr) and id_object['tipo'] == 'Bool':
                print("usando Int para definir un Bool")
                if expr == "1":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 'true')
                
                if expr == "0":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 'false')
                    
            # Verificar que se asigna true/false para una variable Int
            if expr in ['true', 'false'] and id_object['tipo'] == 'Int':
                print("el valor es Bool")
                if expr == "true":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 1)
                    
                if expr == "false":
                    self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], 0)
                
            # Verificar que se asigna true/false a una variable Bool
            if expr in ['true', 'false'] and id_object['tipo'] == 'Bool':
                print("el valor es Bool")
                self._tabla_simbolos.editar_valor_en_tabla(id_object['id'], expr)
            
            
                
        else:
            print("variable no ha sido definida")
            
        """for x in self._tabla_simbolos._simbolos:
            print(x)"""
            
        print('---------------------------------------')


    # Exit a parse tree produced by Proy1Parser#tipo_correcto_7.
    def exitTipo_correcto_7(self, ctx:Proy1Parser.Tipo_correcto_7Context):
        print("correcto 7")


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
        
        # obtener los id de metodo
        # si el len es 0, tenemos idMetodo(), si no hay uno o mas parametros
        id_context = ctx.ID()
        tipoVariable_context = ctx.tipoVariable()
        
        print(f"los ids: {len(id_context)}")
        print(f"los tipoVariables: {len(tipoVariable_context)}")
        
        # si tenemos 1 id y 1 tipo variable, tenemos nombre del metodo y el valor que regresa
        if len(id_context) == 1 and len(tipoVariable_context) == 1:
            id_metodo = id_context[0].getText()
            tipoMetodo = tipoVariable_context[0].getText()
            
            
            clase_padre = self._tabla_simbolos._simbolos[self._tabla_simbolos.current_class]

            
            self._tabla_simbolos.agregar_simbolo(tipoMetodo, id_metodo, None, None, 'metodo', None, clase_padre['id'])
        
            print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %('TIPO', 'ID', 'SIZE', 'OFFSET', 'DEFINICION', 'VALOR', 'PADRE', 'AMBITO'))
            print("-----------------------------------------------------------------------------------------------------------------------------")
            for x in self._tabla_simbolos._simbolos:
                print("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s" %(x['tipo'], x['id'], x['size'], x['offset'], x['definicion'], x['valor'], x['padre'], x['ambito']))
        
        print("**********************")
        
        

    # Exit a parse tree produced by Proy1Parser#metodo1.
    def exitMetodo1(self, ctx:Proy1Parser.Metodo1Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo2.
    def enterMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        print("metodo2")

    # Exit a parse tree produced by Proy1Parser#metodo2.
    def exitMetodo2(self, ctx:Proy1Parser.Metodo2Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo3.
    def enterMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        print("metodo3")

    # Exit a parse tree produced by Proy1Parser#metodo3.
    def exitMetodo3(self, ctx:Proy1Parser.Metodo3Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo4.
    def enterMetodo4(self, ctx:Proy1Parser.Metodo4Context):
        print("metodo4")

    # Exit a parse tree produced by Proy1Parser#metodo4.
    def exitMetodo4(self, ctx:Proy1Parser.Metodo4Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo5.
    def enterMetodo5(self, ctx:Proy1Parser.Metodo5Context):
        print("metodo5")

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
        print("metodo7")

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

    # Exit a parse tree produced by Proy1Parser#metodo9.
    def exitMetodo9(self, ctx:Proy1Parser.Metodo9Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo10.
    def enterMetodo10(self, ctx:Proy1Parser.Metodo10Context):
        print("metodo10")

    # Exit a parse tree produced by Proy1Parser#metodo10.
    def exitMetodo10(self, ctx:Proy1Parser.Metodo10Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo11.
    def enterMetodo11(self, ctx:Proy1Parser.Metodo11Context):
        print("metodo11")

    # Exit a parse tree produced by Proy1Parser#metodo11.
    def exitMetodo11(self, ctx:Proy1Parser.Metodo11Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo12.
    def enterMetodo12(self, ctx:Proy1Parser.Metodo12Context):
        print("metodo12")

    # Exit a parse tree produced by Proy1Parser#metodo12.
    def exitMetodo12(self, ctx:Proy1Parser.Metodo12Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo13.
    def enterMetodo13(self, ctx:Proy1Parser.Metodo13Context):
        print("metodo13")

    # Exit a parse tree produced by Proy1Parser#metodo13.
    def exitMetodo13(self, ctx:Proy1Parser.Metodo13Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo14.
    def enterMetodo14(self, ctx:Proy1Parser.Metodo14Context):
        print("metodo14")

    # Exit a parse tree produced by Proy1Parser#metodo14.
    def exitMetodo14(self, ctx:Proy1Parser.Metodo14Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo15.
    def enterMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        print("metodo15")

    # Exit a parse tree produced by Proy1Parser#metodo15.
    def exitMetodo15(self, ctx:Proy1Parser.Metodo15Context):
        pass


    # Enter a parse tree produced by Proy1Parser#metodo16.
    def enterMetodo16(self, ctx:Proy1Parser.Metodo16Context):
        print("metodo16")

    # Exit a parse tree produced by Proy1Parser#metodo16.
    def exitMetodo16(self, ctx:Proy1Parser.Metodo16Context):
        pass
        

        
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
    text_file = filedialog.askopenfilename(initialdir="C:/Users/toni/Desktop/COMPIS/git/Compiladores/Laboratorio 1/", filetypes=(("Text Files", "*.txt"), ("G4 Files", "*.g4")))
    
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
    
        
    
"""root = Tk()
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



root.mainloop()"""

                
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


