grammar cubix;




start: ((expression | show SEMICOLON)* cubeInitialization SEMICOLON (expression | statement)*)+ EOF ;


MOVEVALUE:      'R'  | 'R2'   | 'R’'  | 'r'   | 'r2'  |  'rp' | 
                'L'  | 'L2'   | 'L’'  | 'l'   | 'l2'  |  'lp' |  
                'F'  | 'F2'   | 'F’'  | 'f'   | 'f2'  |  'fp' | 
                'B'  | 'B2'   | 'B’'  | 'b'   | 'b2'  |  'bp' |  
                'D'  | 'D2'   | 'D’'  | 'd'   | 'd2'  |  'dp' |
                'U'  | 'U2'   | 'U’'  | 'u'   | 'u2'  |  'up' | 
                'M'  | 'E'    | 'S'   | 'x'   | 'y'   |  'z'  ;



COLOR:  ('Red' Whitespace*)    | 
        ('Green' Whitespace*)  | 
        ('Blue' Whitespace*)   | 
        ('Yellow' Whitespace*) | 
        ('White' Whitespace*)  | 
        ('Orange' Whitespace*) ;



CUBE: 'Cube';
MOVE: 'Move';
ALGO: 'Algo';
NUM: 'Num';
SETTING: 'Setting';
ARRAY: 'Array';
Type: DOLLAR (CUBE | MOVE | ALGO | NUM | SETTING);


LeftRoundBracket: '(' (Whitespace | Newline)*;
RightRoundBracket: ')' (Whitespace | Newline)*;
LeftSquareBracket: '[' (Whitespace | Newline)*;
RightSquareBracket: ']' (Whitespace | Newline)*;
LeftCurlyBracket: '{' (Whitespace | Newline)*;
RightCurlyBracket: '}' (Whitespace | Newline)*;


COMMA: ',' (Whitespace | Newline)*;
SEMICOLON: ';';
DOT: '.';
DOLLAR: '$';
PLUS: '+';
ASSIGN: '=';
COLON: ':';

LOOP: 'loop';
TIMES: 'times';

EXEC: 'exec';
CUBECONSTRUCTOR: 'cube';
SHOW: 'show';
MIXED: '"mixed"';
SOLVED: '"solved"';
IN: 'in';
USING: 'using';

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;

BlockComment: '|@' .*? '@|' -> skip;
LineComment: '||' ~ [\r\n]* -> skip;

VariableName: NONDIGIT+ (NONDIGIT | NUMBER)*;

NONDIGIT: [a-z] | [A-Z] | '_';
NUMBER: [0-9]+;


statement: (algorithmExecution | iterationForI | iterationForEach | show ) SEMICOLON;


algorithmExecution: VariableName DOT EXEC LeftRoundBracket (VariableName | MOVEVALUE) (COMMA NUMBER)? RightRoundBracket;

show: SHOW LeftRoundBracket (VariableName) RightRoundBracket;

iterationForI: LOOP (NUMBER | VariableName) TIMES COLON (algorithmExecution | show) (PLUS (algorithmExecution | show))*;

iterationForEach: LOOP IN VariableName USING VariableName COLON (algorithmExecution | show) (PLUS (algorithmExecution | show))*;



expression: (cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) SEMICOLON;


cubeInitialization: CUBE COLON VariableName ASSIGN CubeValue;

algorithmInitalization: ALGO COLON VariableName ASSIGN AlgorithmValue;

numberInitalization: NUM COLON VariableName ASSIGN NUMBER;

settingInitalization: SETTING COLON VariableName ASSIGN SettingValue;

moveInitalization: MOVE COLON VariableName ASSIGN MOVEVALUE;

arrayInitalization: ARRAY LeftRoundBracket Type RightRoundBracket COLON VariableName ASSIGN ArrayValue;


/* ----------- */


SettingValue: LeftSquareBracket Wall COMMA Wall COMMA Wall COMMA Wall COMMA Wall COMMA Wall RightSquareBracket; 

CubeState: ( MIXED | SOLVED | VariableName );

AlgorithmValue: LeftSquareBracket (VariableName COMMA | MOVEVALUE COMMA)* (VariableName | MOVEVALUE) RightSquareBracket;

CubeValue: CUBECONSTRUCTOR LeftRoundBracket CubeState RightRoundBracket;

ArrayValue: LeftSquareBracket (VariableName COMMA | NUMBER COMMA)* (VariableName | NUMBER) RightSquareBracket;

Wall: COLOR ASSIGN LeftCurlyBracket COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR RightCurlyBracket;