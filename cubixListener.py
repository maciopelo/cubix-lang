# Generated from cubix.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .cubixParser import cubixParser
else:
    from cubixParser import cubixParser

# This class defines a complete listener for a parse tree produced by cubixParser.
class cubixListener(ParseTreeListener):

    # Enter a parse tree produced by cubixParser#start.
    def enterStart(self, ctx:cubixParser.StartContext):
        pass

    # Exit a parse tree produced by cubixParser#start.
    def exitStart(self, ctx:cubixParser.StartContext):
        pass


    # Enter a parse tree produced by cubixParser#algorithmExecution.
    def enterAlgorithmExecution(self, ctx:cubixParser.AlgorithmExecutionContext):
        pass

    # Exit a parse tree produced by cubixParser#algorithmExecution.
    def exitAlgorithmExecution(self, ctx:cubixParser.AlgorithmExecutionContext):
        pass


    # Enter a parse tree produced by cubixParser#show.
    def enterShow(self, ctx:cubixParser.ShowContext):
        pass

    # Exit a parse tree produced by cubixParser#show.
    def exitShow(self, ctx:cubixParser.ShowContext):
        pass


    # Enter a parse tree produced by cubixParser#statement.
    def enterStatement(self, ctx:cubixParser.StatementContext):
        pass

    # Exit a parse tree produced by cubixParser#statement.
    def exitStatement(self, ctx:cubixParser.StatementContext):
        pass


    # Enter a parse tree produced by cubixParser#expression.
    def enterExpression(self, ctx:cubixParser.ExpressionContext):
        pass

    # Exit a parse tree produced by cubixParser#expression.
    def exitExpression(self, ctx:cubixParser.ExpressionContext):
        pass


    # Enter a parse tree produced by cubixParser#cubeInitialization.
    def enterCubeInitialization(self, ctx:cubixParser.CubeInitializationContext):
        pass

    # Exit a parse tree produced by cubixParser#cubeInitialization.
    def exitCubeInitialization(self, ctx:cubixParser.CubeInitializationContext):
        pass


    # Enter a parse tree produced by cubixParser#algorithmInitalization.
    def enterAlgorithmInitalization(self, ctx:cubixParser.AlgorithmInitalizationContext):
        pass

    # Exit a parse tree produced by cubixParser#algorithmInitalization.
    def exitAlgorithmInitalization(self, ctx:cubixParser.AlgorithmInitalizationContext):
        pass


    # Enter a parse tree produced by cubixParser#numberInitalization.
    def enterNumberInitalization(self, ctx:cubixParser.NumberInitalizationContext):
        pass

    # Exit a parse tree produced by cubixParser#numberInitalization.
    def exitNumberInitalization(self, ctx:cubixParser.NumberInitalizationContext):
        pass


    # Enter a parse tree produced by cubixParser#settingInitalization.
    def enterSettingInitalization(self, ctx:cubixParser.SettingInitalizationContext):
        pass

    # Exit a parse tree produced by cubixParser#settingInitalization.
    def exitSettingInitalization(self, ctx:cubixParser.SettingInitalizationContext):
        pass


    # Enter a parse tree produced by cubixParser#moveInitalization.
    def enterMoveInitalization(self, ctx:cubixParser.MoveInitalizationContext):
        pass

    # Exit a parse tree produced by cubixParser#moveInitalization.
    def exitMoveInitalization(self, ctx:cubixParser.MoveInitalizationContext):
        pass


    # Enter a parse tree produced by cubixParser#arrayInitalization.
    def enterArrayInitalization(self, ctx:cubixParser.ArrayInitalizationContext):
        pass

    # Exit a parse tree produced by cubixParser#arrayInitalization.
    def exitArrayInitalization(self, ctx:cubixParser.ArrayInitalizationContext):
        pass


    # Enter a parse tree produced by cubixParser#iterationForI.
    def enterIterationForI(self, ctx:cubixParser.IterationForIContext):
        pass

    # Exit a parse tree produced by cubixParser#iterationForI.
    def exitIterationForI(self, ctx:cubixParser.IterationForIContext):
        pass


    # Enter a parse tree produced by cubixParser#iterationForEach.
    def enterIterationForEach(self, ctx:cubixParser.IterationForEachContext):
        pass

    # Exit a parse tree produced by cubixParser#iterationForEach.
    def exitIterationForEach(self, ctx:cubixParser.IterationForEachContext):
        pass



del cubixParser