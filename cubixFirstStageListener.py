from cubixListener import cubixListener as CubixListener
from customExceptions import *



class CubixFirstStageListener(CubixListener):

    def __init__(self):
       self.isCubeInitalized = False
       self.functionsDeclarations = {}

    
    def exitCubeInitialization(self, ctx):
        self.isCubeInitalized = True


    def exitFunctionDeclaration(self, ctx):
        func = ctx.getText()
        funcId = len("FUNC")
        argStartId = func.find('<')

        beginId = func.find('begin') + len('begin')
        endId = func.find('end')
        
        funcName = func[funcId:argStartId]
        funcBody = func[beginId:endId].split(";")[:-1]


        if(funcName in self.functionsDeclarations.keys()):
            raise FunctionExistsException(funcName)
        else:
            self.functionsDeclarations[funcName] = funcBody
        
    

    def enterAlgorithmExecution(self, ctx):
        if not self.isCubeInitalized:
            raise CubeNotInitializedException()



    def exitStart(self, ctx):
        if not self.isCubeInitalized:
            raise CubeNotInitializedException()


    def getFunctionsDeclarations(self):
        return self.functionsDeclarations
        