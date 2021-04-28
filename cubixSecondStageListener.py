from cubixListener import cubixListener as CubixListener
from init import initial_html, ending_html
from antlr4 import *
from x3domCube import solvedCube
from customExceptions import *



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
        self.variablesDictionary = {}
        self.functionsDeclarations = functionsDeclarations


    def enterCubeInitialization(self, ctx):
        cubeVarName = ctx.VariableName().getText()
        
        if(cubeVarName in self.variablesDictionary.keys()):
            raise VariableExistsException(cubeVarName)

        else:
            
            cubeVarValue = ctx.CubeValue().getText()
            cubeVarState = cubeVarValue[5:len(cubeVarValue)-1]

            if cubeVarState == '"solved"':
                self.output.write(solvedCube)

            elif cubeVarState == "mixed":
                #generate x3dom mixed cube
                pass
            
            else:
                #generate x3dom cube with given sett
                pass


            self.variablesDictionary[cubeVarName] = cubeVarState


    def enterMoveInitalization(self, ctx):

        move_var_name = ctx.VariableName(0).getText()
        move_var_value = str(ctx.MOVEVALUE()) if ctx.MOVEVALUE() is not None else str(ctx.VariableName(1))

        if(move_var_name in self.variablesDictionary.keys()):
            raise VariableExistsException(str(move_var_name))

        else:
            self.assignVariable(move_var_name, move_var_value)




    def enterAlgorithmInitalization(self, ctx):
        
        algo_name = ctx.VariableName().getText()
        algo_value = ctx.AlgorithmValue().getText().replace(" ","")[1:-1].split(",")

        tmp_arr = []

        if(algo_name in self.variablesDictionary.keys()):
            raise VariableExistsException(str(algo_name))
        
        else:
            
            # check if values in algo are valid
            for item in algo_value:
                
                # check if item is default move value
                if item not in self.MOVEVALUES:

                    # check if item is given as variable of move value
                    if item in self.variablesDictionary.keys():

                        found_var_name_val = self.variablesDictionary[item]

                        if found_var_name_val in self.MOVEVALUES: 
                            tmp_arr.append(found_var_name_val)
                        else:
                            raise InvalidVariableValueException()
                            

                    else:
                        raise VariableNotExistsException(item)

                else:
                    tmp_arr.append(item)

        self.assignVariable(algo_name, tmp_arr)
                

    def enterSettingInitalization(self, ctx):
        sett_name = ctx.VariableName().getText()
        sett_value = ctx.SettingValue().getText().replace(" ","").replace("\n","")

        if(sett_name in self.variablesDictionary.keys()):
            raise VariableExistsException(str(sett_name))
        else:
            self.assignVariable(sett_name,sett_value)
            


    def enterArrayInitalization(self, ctx):
        arr_name = ctx.VariableName().getText()
        arr_type = ctx.Type().getText()[1:]
        arr_value = ctx.ArrayValue().getText().replace(" ","")[1:-1].split(",")

        tmp_arr = []

        if(arr_name in self.variablesDictionary.keys()):
            raise VariableExistsException(str(arr_name))

        else:
            
            if arr_type == 'Num':
                for item in arr_value:
                
                    if item in self.variablesDictionary.keys():
                        found_var_name_val = self.variablesDictionary[item]
                        if not isinstance(found_var_name_val,list) and found_var_name_val.isnumeric(): 
                            tmp_arr.append(found_var_name_val)
                        else:
                            raise InvalidVariableValueException()

                    elif item.isnumeric():
                        tmp_arr.append(item)

                    else:
                        raise VariableNotExistsException(item)
        
                    
            elif(arr_type == 'Move'):
                pass
        
        self.assignVariable(arr_name,tmp_arr)
            


    def enterNumberInitalization(self, ctx):

        numberName = ctx.VariableName(0).getText()
        numberValue = ctx.NUMBER().getText() if ctx.NUMBER() is not None else ctx.VariableName(1).getText()

        if(numberName in self.variablesDictionary.keys()):
            raise VariableExistsException(str(numberName))
        else:
            self.assignVariable(numberName, numberValue)



    def assignVariable(self, name, value):
        if( not isinstance(value, list) and value in self.variablesDictionary.keys()):
            self.variablesDictionary[name] = self.variablesDictionary[value]
        else:
            self.variablesDictionary[name] = value



    def enterAlgorithmExecution(self, ctx):
        print(f"Execution of algorithm on the cube: {ctx.getText()}")


    def enterShow(self, ctx):
        show_arg = ctx.VariableName().getText()

        if show_arg not in self.variablesDictionary.keys():
            raise VariableNotExistsException(show_arg)
        
        print(self.variablesDictionary[show_arg])

    
    def enterFunctionExecution(self, ctx):

        argStartIdx= ctx.getText().find('<')
        argEndIdx= ctx.getText().find('>')
        numOfArgs = ctx.getText()[argStartIdx:argEndIdx]
        func_name = ctx.getText()[:argStartIdx]

        if func_name not in self.functionsDeclarations:
            raise FunctionNotExistsException(func_name)
        else:
            print(f"Function {func_name} has been executed")


    def exitStart(self, ctx):
        print(f"\n{self.variablesDictionary}")
        self.output.write(ending_html)
