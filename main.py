from cubixLexer import cubixLexer as CubixLexer
from cubixParser import cubixParser as CubixParser
from cubixSecondStageListener import CubixSecondStageListener
from cubixFirstStageListener import CubixFirstStageListener
from antlr4 import *
import sys



def runFirstStage(argv):

    input_stream = FileStream(argv[1])

    lexer = CubixLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)
    tree = parser.start()

    fstStage = CubixFirstStageListener()
    
    walker = ParseTreeWalker()
    walker.walk(fstStage, tree)

    return fstStage.getFunctionsDeclarations()



def runSecondStage(argv, output_file, functionsDeclarations):

    input_stream = FileStream(argv[1])

    lexer = CubixLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)
    tree = parser.start()

    sndStage = CubixSecondStageListener(output_file, functionsDeclarations)
    
    walker = ParseTreeWalker()
    walker.walk(sndStage, tree)




def main(argv):

    
    functionsDeclarations = runFirstStage(argv)

    with open("index.html","w") as output_file:
        runSecondStage(argv, output_file, functionsDeclarations)


if __name__ == '__main__':
    main(sys.argv)