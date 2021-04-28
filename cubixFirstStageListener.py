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
        func_idx = len("FUNC")
        args_start_idx = func.find('<')

        begin_idx = func.find('begin') + len('begin')
        end_idx = func.find('end')
        
        func_name = func[func_idx:args_start_idx]
        func_body = func[begin_idx:end_idx].split(";")[:-1]


        if(func_name in self.functionsDeclarations.keys()):
            raise FunctionExistsException(func_name)
        else:
            self.functionsDeclarations[func_name] = func_body
        
    

    def enterAlgorithmExecution(self, ctx):
        if not self.isCubeInitalized:
            raise CubeNotInitializedException()



    def exitStart(self, ctx):
        if not self.isCubeInitalized:
            raise CubeNotInitializedException()


    def getFunctionsDeclarations(self):
        return self.functionsDeclarations
        