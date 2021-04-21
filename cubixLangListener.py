from typing import Dict
from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html
from antlr4 import *
import sys
from cubixParser import cubixParser


class CubixLangListener(CubixListener):


    def __init__(self, output):
        self.output = output
        self.output.write(initial_html)

        self.variablesDictionary = {}


    def enterNumberInitalization(self, ctx):
        name = ctx.VariableName().getText()
        value = ctx.NUMBER().getText()
        if(name in self.variablesDictionary.keys()):
            print("Variable with this name already exist")
        else:
            self.variablesDictionary[name] = value
        

    def enterMoveInitalization(self, ctx):
        name = ctx.VariableName().getText()
        value = ctx.MOVEVALUE().getText()
        if(name in self.variablesDictionary.keys()):
            print("Variable with this name already exist")
        else:
            if(value in self.variablesDictionary.keys()):
                self.variablesDictionary[name] = self.variablesDictionary[value]
            else:
                self.variablesDictionary[name] = value


    def enterCubeInitialization(self, ctx):
        name = ctx.VariableName().getText()
        value = ctx.CubeValue().getText()
        print(value)
        if(name in self.variablesDictionary.keys()):
            print("Variable with this name already exist")
        else:
            self.variablesDictionary[name] = value


        print(f"Enter cubeint: {ctx.getText()}")
        print(f"Type: {ctx.CUBE()}")
        print(f"Variable name: {ctx.VariableName()}")
        print(f"Value: {ctx.CubeValue()}\n")


    def exitStart(self, ctx):
        self.output.write(ending_html)

