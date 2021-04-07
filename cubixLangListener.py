from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html
from antlr4 import *
import sys



class CubixLangListener(CubixListener):

    def __init__(self, output):
        self.output = output
        self.output.write(initial_html)

    
    def enterExpression(self, ctx):
        print(f"Enter: {ctx.getText()}")

    def exitExpression(self, ctx):
        print(f"Exit: {ctx.getText()}")

    def enterCubeInitialization(self, ctx):
        print(f"Enter cubeint: {ctx.getText()}")

    def exitCubeInitialization(self, ctx):
        print(f"Exit cubeint: {ctx.getText()}")


    def exitStart(self, ctx):
        self.output.write(ending_html)

