from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import ParseCancellationException


class ParsingErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        ex = ParseCancellationException(f'In line {line}: {msg}')
        ex.line = line
        ex.column = column
        raise ex