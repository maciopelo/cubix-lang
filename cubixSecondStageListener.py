from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html, colors_initialization
from antlr4 import *
from x3domCube import solvedCube
from customExceptions import *
from cube import Cube



class CubixSecondStageListener(CubixListener):

    MOVEVALUES = ['R', 'R2', 'Rp', 'r', 'r2', 'rp', 
                  'L', 'L2', 'Lp', 'l', 'l2', 'lp',  
                  'F', 'F2', 'Fp', 'f', 'f2', 'fp', 
                  'B', 'B2', 'Bp', 'b', 'b2', 'bp',  
                  'D', 'D2', 'Dp', 'd', 'd2', 'dp',
                  'U', 'U2', 'Up', 'u', 'u2', 'up', 
                  'M', 'E' , 'S',  'x', 'y',  'z']

    COLORS = ['Red', 'Green', 'Blue', 'Yellow', 'White', 'Orange']


    def __init__(self, output, functionsDeclarations):
        self.output = output
        self.output.write(initial_html)
        self.variablesDictionaries = []
        self.functionsDeclarations = functionsDeclarations


    def enterStart(self, ctx):
        self.variablesDictionaries.append({})

    def exitStart(self, ctx):
        print(f"\n{self.variablesDictionaries}")
        self.output.write(ending_html)

        
    def enterCubeInitialization(self, ctx):
        cubeVarName = ctx.VariableName().getText()
        cubeVarValue = ctx.CubeValue().getText()
        
        if self.variableExistInLocalScope(cubeVarName):
            raise VariableExistsException(cubeVarName)

        else:
            self.output.write(colors_initialization)
            cubeVarState = cubeVarValue[5:len(cubeVarValue)-1]

            if cubeVarState == '"solved"':
                #self.output.write(solvedCube)
                cube = Cube(None)
                cube.rotate_U()
                self.output.write(cube.to_x3dom())
            elif cubeVarState == "mixed":
                #generate x3dom mixed cube
                pass
            
            else:
                #generate x3dom cube with given sett
                pass

            self.assignVariable(cubeVarName, cubeVarState)


    def enterMoveInitalization(self, ctx):

        moveVarName = ctx.VariableName(0).getText()
        moveVarValue = str(ctx.MOVEVALUE()) if ctx.MOVEVALUE() is not None else str(ctx.VariableName(1))

        if self.variableExistInLocalScope(moveVarName):
            raise VariableExistsException(str(moveVarName))

        else:
            self.assignVariable(moveVarName, moveVarValue)




    def enterAlgorithmInitalization(self, ctx):
        
        algorithmName = ctx.VariableName().getText()
        algorithmValue = ctx.AlgorithmValue().getText().replace(" ","")[1:-1].split(",")

        tmpArr = []

        if self.variableExistInLocalScope(algorithmName):
            raise VariableExistsException(str(algorithmName))
        
        else:
            
            # check if values in algo are valid
            for item in algorithmValue:
                
                # check if item is default move value
                if item not in self.MOVEVALUES:

                    # check if item is given as variable of move value
                    if self.variableExist(item):

                        foundVarNameVal = self.variableGet(item)

                        if foundVarNameVal in self.MOVEVALUES: 
                            tmpArr.append(foundVarNameVal)
                        else:
                            raise InvalidVariableValueException()
                            

                    else:
                        raise VariableNotExistsException(item)

                else:
                    tmpArr.append(item)

        self.assignVariable(algorithmName, tmpArr)
                

    def enterSettingInitalization(self, ctx):
        settingName = ctx.VariableName().getText()
        settingValue = ctx.SettingValue().getText().replace(" ","").replace("\n","")

        if self.variableExistInLocalScope(settingName):
            raise VariableExistsException(str(settingName))
        else:
            self.assignVariable(settingName,settingValue)
            


    def enterArrayInitalization(self, ctx):
        arrName = ctx.VariableName().getText()
        arrType = ctx.Type().getText()[1:]
        arrValue = ctx.ArrayValue().getText().replace(" ","")[1:-1].split(",")

        tmpArr = []

        if self.variableExistInLocalScope(arrName):
            raise VariableExistsException(str(arrName))

        else:
            if arrType == 'Num':
                for item in arrValue:
                    if self.variableExist(item):

                        foundVarNameVal = self.variableGet(item)
                        if not isinstance(foundVarNameVal,list) and foundVarNameVal.isnumeric(): 
                            tmpArr.append(foundVarNameVal)
                        else:
                            raise InvalidVariableValueException()

                    elif item.isnumeric():
                        tmpArr.append(item)

                    else:
                        raise VariableNotExistsException(item)
        
                    
            elif(arrType == 'Move'):
                pass
        
        self.assignVariable(arrName,tmpArr)
            


    def enterNumberInitalization(self, ctx):

        numberName = ctx.VariableName(0).getText()
        numberValue = ctx.NUMBER().getText() if ctx.NUMBER() is not None else ctx.VariableName(1).getText()

        if self.variableExistInLocalScope(numberName):
            raise VariableExistsException(str(numberName))
        else:
            self.assignVariable(numberName, numberValue)




    def enterAlgorithmExecution(self, ctx):
        print(f"Execution of algorithm on the cube: {ctx.getText()}") # PLACEMENT


    def enterShow(self, ctx):
        showArg = ctx.VariableName().getText()

        if self.variableExist(showArg):
            print(self.variableGet(showArg))
        else:
            raise VariableNotExistsException(showArg)
        

    
    def enterFunctionExecution(self, ctx):

        argStartIdx= ctx.getText().find('<')
        argEndIdx= ctx.getText().find('>')
        numOfArgs = ctx.getText()[argStartIdx:argEndIdx]
        funcName = ctx.getText()[:argStartIdx]

        if funcName not in self.functionsDeclarations:
            raise FunctionNotExistsException(funcName)
        else:
            print(f"Function {funcName} has been executed") # PLACEMENT



    def enterLoop(self, ctx):
        self.variablesDictionaries.append({})


    def exitLoop(self, ctx):
        x =  self.variablesDictionaries.pop()
        



    def assignVariable(self, name, value):
        if( not isinstance(value, list) and self.variableExist(value)):
            self.variableCreate(name, self.variableGet(value))
        else:
            self.variableCreate(name, value)



    def variableExist(self, varName):
        for dictionary in reversed(self.variablesDictionaries):
            if varName in dictionary:
                return True

        return False
    
    def variableExistInLocalScope(self, varName):
        if varName in self.variablesDictionaries[-1]:
            return True

        return False

    def variableGet(self, varName):
        for dictionary in reversed(self.variablesDictionaries):
            if varName in dictionary:
                return dictionary[varName]

        return None

    def variableCreate(self, varName, varValue):
        self.variablesDictionaries[-1][varName] = varValue
    