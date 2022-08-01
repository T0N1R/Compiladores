import sys
from antlr4 import *
from antlr4.tree.Trees import TerminalNode
from antlr4.error.ErrorListener import ErrorListener
from Proy1Lexer import Proy1Lexer
from Proy1Parser import Proy1Parser
from Proy1Listener import Proy1Listener

class MyListener(Proy1Listener):
    
    def exitTest_main(self, ctx):
        print("entre test main")
        class_name = ctx.ID().getText()
        print(class_name)
        
        inhty = ctx.tipoVariable().getText()
            
        allowed_for_main = ["Int", "String", "Bool", "IO"]
        
        if class_name == "Main":
            if inhty in allowed_for_main:
                print("correcto")
            else:
                print("Clase Main no puede heredar de esta clase (las clases básicas son Int, String, Bool, IO)")
             
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_1(self, ctx:Proy1Parser.Tipo_correcto_1Context):
        print("correcto 1")
        allowed_types = ["Int", "String", "Bool"]
        asigned_id = ctx.ID().getText()
        print(asigned_id)
        asigned_type = ctx.tipoVariable().getText()
        if asigned_type in allowed_types:
            print("tipo de variable correcto")
        else:
            print("este tipo de variable no es permitido")
        print(asigned_type)
        print('---------------------------------------')

    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_2(self, ctx:Proy1Parser.Tipo_correcto_2Context):
        print("correcto 2")
        print(ctx.ID())
        print('---------------------------------------')
    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_3(self, ctx:Proy1Parser.Tipo_correcto_3Context):
        print("correcto 3")
    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_4(self, ctx:Proy1Parser.Tipo_correcto_4Context):
        print("correcto 4")
    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_5(self, ctx:Proy1Parser.Tipo_correcto_5Context):
        print("correcto 5")
    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_6(self, ctx:Proy1Parser.Tipo_correcto_6Context):
        print("correcto 6")
    
    # Exit a parse tree produced by Proy1Parser#tipo_correcto_1.
    def exitTipo_correcto_7(self, ctx:Proy1Parser.Tipo_correcto_7Context):
        print("correcto 7")
        
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


