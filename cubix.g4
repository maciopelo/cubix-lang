grammar cubix;



// start: ((expression | show SEMICOLON)* cubeInitialization SEMICOLON (expression | statement)*)+ EOF ;
start: (expression | statement | functionDeclaration)+ (show SEMICOLON)* EOF;


MOVEVALUE:      'R'  | 'R2'   | 'Rp'  | 'r'   | 'r2'  |  'rp' | 
                'L'  | 'L2'   | 'Lp'  | 'l'   | 'l2'  |  'lp' |  
                'F'  | 'F2'   | 'Fp'  | 'f'   | 'f2'  |  'fp' | 
                'B'  | 'B2'   | 'Bp'  | 'b'   | 'b2'  |  'bp' |  
                'D'  | 'D2'   | 'Dp'  | 'd'   | 'd2'  |  'dp' |
                'U'  | 'U2'   | 'Up'  | 'u'   | 'u2'  |  'up' | 
                'M'  | 'E'    | 'S'   | 'x'   | 'y'   |  'z'  ;



COLOR:  ('red' Whitespace*)    | 
        ('green' Whitespace*)  | 
        ('blue' Whitespace*)   | 
        ('yellow' Whitespace*) | 
        ('white' Whitespace*)  | 
        ('orange' Whitespace*) ;



CUBE: 'Cube';
MOVE: 'Move';
ALGO: 'Algo';
NUM: 'Num';
SETTING: 'Setting';
ARRAY: 'Array';
FUNC: 'FUNC';
Type: DOLLAR ( ALGO | NUM );


LeftRoundBracket: '(' (Whitespace | Newline)*;
RightRoundBracket: ')' (Whitespace | Newline)*;
LeftSquareBracket: '[' (Whitespace | Newline)*;
RightSquareBracket: ']' (Whitespace | Newline)*;
LeftCurlyBracket: '{' (Whitespace | Newline)*;
RightCurlyBracket: '}' (Whitespace | Newline)*;


COMMA: ',' (Whitespace | Newline)*;
SEMICOLON: ';' (Whitespace | Newline)*;
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
BEGIN: 'begin';
END: 'end';

Whitespace: [ \t]+ -> skip;
Newline: ('\r' '\n'? | '\n') -> skip;

BlockComment: '|@' .*? '@|' -> skip;
LineComment: '||' ~ [\r\n]* -> skip;

VariableName: NONDIGIT (NONDIGIT | NUMBER)*;

NONDIGIT: [a-z] | [A-Z] | '_';
NUMBER: [1-9] [0-9]*;


/* ----------------------- */


statement: (algorithmExecution | iterationForI | iterationForEach | show | functionExecution) SEMICOLON;


algorithmExecution: VariableName DOT EXEC LeftRoundBracket (VariableName | MOVEVALUE) (COMMA NUMBER)? RightRoundBracket;

show: SHOW LeftRoundBracket (VariableName) RightRoundBracket;

loop: (iterationForI | iterationForEach);

iterationForI: LOOP (NUMBER | VariableName) TIMES LeftCurlyBracket (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) (PLUS (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization))* RightCurlyBracket;

iterationForEach: LOOP IN VariableName USING VariableName LeftCurlyBracket (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) (PLUS (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization))* RightCurlyBracket;

functionExecution: VariableName ( ('<' (VariableName COMMA)* VariableName '>') || ('<' '>') );


/* ----------------------- */


expression: (cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) SEMICOLON;


cubeInitialization: CUBE COLON VariableName ASSIGN CubeValue;

algorithmInitalization: ALGO COLON VariableName ASSIGN AAValue;

numberInitalization: NUM COLON VariableName ASSIGN (NUMBER | VariableName);

settingInitalization: SETTING COLON VariableName ASSIGN SettingValue;

moveInitalization: MOVE COLON VariableName ASSIGN (MOVEVALUE | VariableName);

arrayInitalization: ARRAY LeftRoundBracket Type RightRoundBracket COLON VariableName ASSIGN AAValue;

functionDeclaration: FUNC VariableName ( ('<' (VariableName COMMA)* VariableName '>') | ('<' '>') ) BEGIN (statement | expression)+ END;



/* ----------------------- */


SettingValue: LeftSquareBracket Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall RightSquareBracket; 

// AlgorithmValue: LeftSquareBracket (VariableName COMMA | MOVEVALUE COMMA)* ((VariableName | MOVEVALUE) Whitespace*) RightSquareBracket;

// ArrayValue: LeftSquareBracket (VariableName COMMA | NUMBER COMMA)* (VariableName | NUMBER) RightSquareBracket;

AAValue: LeftSquareBracket (VariableName COMMA | NUMBER COMMA | MOVEVALUE COMMA)* ((VariableName | NUMBER | MOVEVALUE)Whitespace*) RightSquareBracket;

CubeValue: CUBECONSTRUCTOR LeftRoundBracket ( MIXED | (MIXED COMMA (NUMBER | VariableName)) | SOLVED | VariableName ) RightRoundBracket;

Wall: COLOR ASSIGN LeftCurlyBracket COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR RightCurlyBracket;


