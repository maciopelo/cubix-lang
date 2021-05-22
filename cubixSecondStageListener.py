from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html, colors_initialization, js_script
from antlr4 import *
from x3domCube import solvedCube
from customExceptions import *
from cube import Cube
import random



class CubixSecondStageListener(CubixListener):

    MOVEVALUES = ['R', 'R2', 'Rp', 'r', 'r2', 'rp', 
                  'L', 'L2', 'Lp', 'l', 'l2', 'lp',  
                  'F', 'F2', 'Fp', 'f', 'f2', 'fp', 
                  'B', 'B2', 'Bp', 'b', 'b2', 'bp',  
                  'D', 'D2', 'Dp', 'd', 'd2', 'dp',
                  'U', 'U2', 'Up', 'u', 'u2', 'up', 
                  'M', 'E' , 'S',  'x', 'y',  'z']

    COLORS = ['red', 'green', 'blue', 'yellow', 'white', 'orange']


    def __init__(self, output, functionsDeclarations):
        self.output = output
        self.output.write(initial_html)
        self.variablesDictionaries = []
        self.functionsDeclarations = functionsDeclarations
        self.cube = None
        self.cubeMovesString= "["
        self.cubeStatesString = "["


    def enterStart(self, ctx):
        self.variablesDictionaries.append({})


    def exitStart(self, ctx):
        if self.cube.setting != "mixed":
            self.cube.setInitialSetting()
        self.output.write(self.cube.to_x3dom())
        self.output.write(ending_html)
        if len(self.cubeMovesString) == 1:
            self.cubeMovesString = self.cubeMovesString + "];"
        else:
            self.cubeMovesString = self.cubeMovesString[:-1] + "];"
        self.cubeStatesString = self.cubeStatesString[:-1] + "];"
        self.output.write(self.prepareJavascript())

    
    def prepareJavascript(self):
        jsScript = f""" 
            <script> 
                const states = {self.cubeStatesString}
                const moves = {self.cubeMovesString}
                {js_script}
            </script>
        </html>
        """
        return jsScript
        
        
    def enterCubeInitialization(self, ctx):
        cubeVarName = ctx.VariableName().getText()
        cubeVarValue = ctx.CubeValue().getText()
        
        if self.variableExistInLocalScope(cubeVarName):
            raise VariableExistsException(cubeVarName)

        else:
            self.output.write(colors_initialization)
            cubeVarState = cubeVarValue[5:len(cubeVarValue)-1]

            if cubeVarState == '"solved"':
                self.cube = Cube(None)


            elif cubeVarState == '"mixed"':
                cube = Cube("mixed")
                randomArray = []

                for i in range(30):
                    randomArray.append(random.randint(0,41))

                for i in range(len(randomArray)):
                    move = self.MOVEVALUES[randomArray[i]]
                    if move.islower():
                        move += "_"
                    move = move.replace("p", "1")
                    randomArray[i] = move

                for i in range(len(randomArray)):
                    methodString = "rotate_" + randomArray[i]
                    method = getattr(Cube, methodString)
                    method(cube)

                
                self.cube = cube

            
            else:
                setting = self.variableGet(cubeVarState)
                self.cube = Cube(setting)


            self.appendCurrentCubeState()
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
        settingValueDict = {}
        settingName = ctx.VariableName().getText()
        settingValue = ctx.SettingValue().getText().replace(" ","").replace("\n","").replace("\r","")
        settingValue = settingValue[1:len(settingValue)-1]
        
        settingValue = settingValue.split(";")
        

        for i in range(len(settingValue)):
            settingValueDictName, settingValueDictArr = settingValue[i].split("=")
            settingValueDictName = settingValueDictName.lstrip().rstrip()
            settingValueDictArr = settingValueDictArr[1:len(settingValueDictArr)-1].split(",")
            settingValueDict[settingValueDictName] = settingValueDictArr 

        if self.variableExistInLocalScope(settingName):
            raise VariableExistsException(str(settingName))
        else:
            self.assignVariable(settingName,settingValueDict)
            


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

    

    def appendCurrentCubeState(self):
        state = {
            "right": self.cube.right_side,
            "top": self.cube.top_side,
            "front": self.cube.front_side,
            "left": self.cube.left_side,
            "bottom": self.cube.bottom_side,
            "back": self.cube.back_side,
        }
        self.cubeStatesString += f"{str(state)}," 
        


    def enterAlgorithmExecution(self, ctx):


        if isinstance(ctx,str):
            ctx = ctx.replace("\n","").replace("\t","").lstrip().rstrip()
        else:
            ctx = ctx.getText().replace("\n","").replace("\t","").lstrip().rstrip()


        _input = (ctx[10:])[1:-1].lstrip().rstrip()
        #print(_input)
        #check if given input is move value variable e.g. move1
        if self.variableGet(_input) is not None:

            _input = self.variableGet(_input)

            #check if given input is algorythm e.g algo1
            if isinstance(_input,list):
                for move in _input:

                    if self.variableGet(move) is not None:
                        move = self.variableGet(move)
                        self.executeSingleMove(move)
                    else:
                        self.executeSingleMove(move)
            else:
                self.executeSingleMove(_input)

        else:
            self.executeSingleMove(_input)
        


    def executeSingleMove(self, move):
        print(move)
        
        exec_func = ""
       
        #check if given input is default move value e.g R
        if move in self.MOVEVALUES:
            
            self.cubeMovesString += f"'{move}',"

            exec_func = move

            if move.islower():
                exec_func = move + "_"

            exec_func = exec_func.replace("p","1")
            exec_func = "rotate_" + exec_func
            method = getattr(Cube, exec_func)
            method(self.cube)
            self.appendCurrentCubeState()



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
    

    def exitIterationForI(self, ctx):

        timesKeyword = ctx.getText().find('times')
        numOfIterations = ctx.getText()[4:timesKeyword]

        if self.variableGet(numOfIterations) is not None:
            numOfIterations = self.variableGet(numOfIterations)
        
        bodyOfLoop = ctx.getText()[timesKeyword+len("times")+1:].replace("\n","").replace("\t","").replace(" ","")[:-1].split("+")

        # only cube.exec(...) hanled 
        for i in range(int(numOfIterations)-1):
            for instruction in bodyOfLoop:
                self.enterAlgorithmExecution(instruction)



    def exitIterationForEach(self, ctx):
        print(ctx.getText())


    def enterLoop(self, ctx):
        self.variablesDictionaries.append({})


    def exitLoop(self, ctx):
        x =  self.variablesDictionaries.pop()
        



    def assignVariable(self, name, value):
        if( not isinstance(value, list) and not isinstance(value, dict) and self.variableExist(value)):
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
    