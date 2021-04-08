from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html
from antlr4 import *
import sys


class CubixLangListener(CubixListener):

    def __init__(self, output):
        self.output = output
        self.output.write(initial_html)

    # def enterNumberInitalization(self, ctx):
    #     print(f"Enter num: {ctx.getText()}")

    # def exitNumberInitalization(self, ctx):
    #     print(f"Exit num: {ctx.getText()}")


    # def enterExpression(self, ctx):
    #     print(f"Enter expr: {ctx.getText()}")

    # def exitExpression(self, ctx):
    #     print(f"Exit expr: {ctx.getText()}")


    # def enterMoveInitalization(self, ctx):
    #     print(f"Enter move: {ctx.getText()}")

    # def exitMoveInitalization(self, ctx):
    #     print(f"Exit move: {ctx.getText()}")


    # def enterCubeInitialization(self, ctx):
    #     print(f"Enter cubeint: {ctx.getText()}")

    # def exitCubeInitialization(self, ctx):
    #     print(f"Exit cubeint: {ctx.getText()}")


    def exitStart(self, ctx):
        self.output.write(ending_html)

