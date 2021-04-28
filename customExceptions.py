class CubeNotInitializedException(Exception):
    def __init__(self, msg="Cube has not been initialized yet!"):
        self.msg = msg
        super().__init__(self.msg)



class VariableExistsException(Exception):
    def __init__(self,  name):
        self.msg = f"Variable of name '{name}' already exists!"
        super().__init__(self.msg)


class VariableNotExistsException(Exception):
    def __init__(self,  name):
        self.msg = f"Variable of name '{name}' does not exist!"
        super().__init__(self.msg)



class FunctionNotExistsException(Exception):
    def __init__(self,  name):
        self.msg = f"Function of name '{name}' has not been declared!"
        super().__init__(self.msg)

class FunctionExistsException(Exception):
    def __init__(self,  name):
        self.msg = f"Function of name '{name}' has been already declared!"
        super().__init__(self.msg)


class InvalidVariableValueException(Exception):
    def __init__(self,  msg = "Invalid variable value"):
        self.msg = msg
        super().__init__(self.msg)