import sys
from antlr4 import *
from Proy1Lexer import Proy1Lexer
from Proy1Parser import Proy1Parser
from Proy1Visitor import Proy1Visitor

class MyVisitor(Proy1Visitor):
    
    def visitTest_main(self, ctx):
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
             
    # Visit a parse tree produced by Proy1Parser#declararAtributo.
    def DeclararAtributo(self, ctx:Proy1Parser.DeclararAtributoContext):
        print("algo")
        
    
                
if __name__ == "__main__":
    data = FileStream('ejemploOperacion.txt')
    lexer = Proy1Lexer(data)
    stream = CommonTokenStream(lexer)
    parser = Proy1Parser(stream)
    tree = parser.start()
    
    visitor = MyVisitor()
    output = visitor.visit(tree)
    #print(output)
