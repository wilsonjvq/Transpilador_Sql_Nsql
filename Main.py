import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprCodeGenListener import ExprCodeGenListener

def main(argv):
    input = FileStream(argv[1], encoding='ascii', errors='ignore')
    lexer = ExprLexer(input)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.programa()

    with open("output.nsql","w") as output:
        exprListen = ExprCodeGenListener(output)
        walker = ParseTreeWalker()
        walker.walk(exprListen, tree)
        
    output.close()      

if __name__ == '__main__':
    main(sys.argv)



#ejecutar py:
#python

# >>> exec(open("main.py").read())
#15*3-10/5+7*2**3-1

# >>> exec(open("Js2PyCodeGenListener.py").read())
#15*3-10/5+7*2**3-1

#python Main.py Prueba1.sql
    

