from typing import List
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import ParseCancellationException


class ParsingErrorListener(ErrorListener):
    errors = []
    
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        ex = ParseCancellationException(f'In line {line}, column {column}: {msg}')
        ex.line = line
        ex.column = column
        self.errors.append(ex)