from cubixLexer import cubixLexer as CubixLexer
from cubixParser import cubixParser as CubixParser
from cubixSecondStageListener import CubixSecondStageListener
from cubixFirstStageListener import CubixFirstStageListener
from cubixErrorListener import ParsingErrorListener
from antlr4 import *
import sys



def runFirstStage(argv):
    sys.tracebacklimit = 0

    input_stream = FileStream(argv[1])

    lexer = CubixLexer(input_stream)
    lexer.removeErrorListeners()

    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)

    parseErrorListener = ParsingErrorListener()
    parser.removeErrorListeners()
    parser.addErrorListener(parseErrorListener)

    tree = parser.start()

    if len(parseErrorListener.errors) != 0:
        raise Exception(parseErrorListener.errors)


    fstStage = CubixFirstStageListener()
    
    walker = ParseTreeWalker()
    walker.walk(fstStage, tree)
    

    return fstStage.getFunctionsDeclarations()



def runSecondStage(argv, output_file, functionsDeclarations):

    input_stream = FileStream(argv[1])

    lexer = CubixLexer(input_stream)
    lexer.removeErrorListeners()
    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)
    parser.removeErrorListeners()
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