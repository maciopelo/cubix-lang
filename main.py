from cubixLexer import cubixLexer as CubixLexer
from cubixListener import cubixListener as CubixListener
from cubixParser import cubixParser as CubixParser
import antlr4
import sys



class Arithmetic(ArithmeticListener):
    pass



def main(argv):
    input_stream = antlr4.FileStream(argv[1])

    lexer = CubixLexer(input_stream)
    stream = antlr4.CommonTokenStream(lexer)
    parser = CubixParser(stream)
    tree = parser.expression()

    arithmetic = Arithmetic()
    arithmetic.exitExpression(tree)

 
if __name__ == '__main__':
    main(sys.argv)