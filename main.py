from cubixLexer import cubixLexer as CubixLexer
from cubixParser import cubixParser as CubixParser
from cubixLangListener import CubixLangListener
from antlr4 import *
import sys


def main(argv):

    with open("index.html","w") as output_file:

        input_stream = FileStream(argv[1])

        lexer = CubixLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = CubixParser(stream)
        tree = parser.start()


        html_with_x3dom = CubixLangListener(output_file)
        walker = ParseTreeWalker()
        walker.walk(html_with_x3dom, tree)


if __name__ == '__main__':
    main(sys.argv)