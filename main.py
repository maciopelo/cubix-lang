from cubixLexer import cubixLexer as CubixLexer
from cubixParser import cubixParser as CubixParser
from cubixSecondStageListener import CubixSecondStageListener
from cubixFirstStageListener import CubixFirstStageListener
from cubixErrorListener import ParsingErrorListener
from antlr4 import *
import sys


import os.path
from pathlib import Path





def runFirstStage(input_stream):


    lexer = CubixLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(ParsingErrorListener())

    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(ParsingErrorListener())

    
    tree = parser.start()
    fstStage = CubixFirstStageListener()
    
    walker = ParseTreeWalker()
    walker.walk(fstStage, tree)

    return fstStage.getFunctionsDeclarations()



def runSecondStage(input_stream, output_file, functionsDeclarations):


    lexer = CubixLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = CubixParser(stream)
    tree = parser.start()

    sndStage = CubixSecondStageListener(output_file, functionsDeclarations)
    
    walker = ParseTreeWalker()
    walker.walk(sndStage, tree)




def main(argv):


    # check if given cubix script file
    if len(argv) > 1:

        input_stream = argv[1]
        home = str(Path.home())

        if os.path.exists(input_stream) and os.path.isfile(input_stream):

            # check if given additional output file name or path
            if len(argv) == 3:

                destination = argv[2]

                if argv[2].find("/") != -1:
                    
                    potential_path = "/".join(argv[2].split("/")[:-1])

                    if not os.path.exists(potential_path):
                        print("Given path does not exist")
                        return
                    
                    if argv[2][len(argv[2]) - 1] == "/":
                        destination = f"{argv[2]}index"
                

                functionsDeclarations = runFirstStage(FileStream(input_stream))
                with open(f"{destination}.html","w") as output_file:
                    runSecondStage(FileStream(input_stream), output_file, functionsDeclarations)


            else:
                functionsDeclarations = runFirstStage(FileStream(input_stream))
                with open(f"{home}/index.html","w") as output_file:
                    runSecondStage(FileStream(input_stream), output_file, functionsDeclarations)

            
        elif os.path.isdir(input_stream):
            print ("Directory is no available")

        else:
            print ("File does not exist")

    else:
        print("No user script has been given !")


        


if __name__ == '__main__':
    main(sys.argv)