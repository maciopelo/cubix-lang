grammar cubix;



// start: ((expression | show SEMICOLON)* cubeInitialization SEMICOLON (expression | statement)*)+ EOF ;
start: (expression | statement | functionDeclaration | BlockComment| LineComment | Newline)+ (show SEMICOLON)* EOF;


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


LeftRoundBracket: '(' ;
RightRoundBracket: ')' ;
LeftSquareBracket: '[' ;
RightSquareBracket: ']' ;
LeftCurlyBracket: '{' ;
RightCurlyBracket: '}' ;


COMMA: ',' (Whitespace)*;
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
AFTERALL: 'after_all';
NEVER: 'never';

Whitespace: [ \t]+;
Newline: ('\r' '\n'? | '\n');

BlockComment: '|@' .*? '@|' -> skip;
LineComment: '||' ~ [\r\n]* -> skip;

VariableName: NONDIGIT (NONDIGIT | NUMBER)*;

NONDIGIT: [a-z] | [A-Z] | '_';
NUMBER: [1-9] [0-9]*;


/* ----------------------- */


statement: (algorithmExecution | iterationForI | iterationForEach | show | functionExecution) (Whitespace)* SEMICOLON;


algorithmExecution: VariableName DOT EXEC (Whitespace)* LeftRoundBracket (Whitespace)* (VariableName | MOVEVALUE) (Whitespace)* (COMMA (Whitespace)* (AFTERALL|NEVER))? (Whitespace)* RightRoundBracket;

show: SHOW (Whitespace)* LeftRoundBracket (Whitespace)* (VariableName) (Whitespace)* RightRoundBracket;

loop: (iterationForI | iterationForEach);

iterationForI: LOOP (Whitespace)* (NUMBER | VariableName) (Whitespace)* TIMES (Whitespace|Newline)* LeftCurlyBracket (Whitespace|Newline)* (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) (Whitespace)* (PLUS (Whitespace|Newline)*(algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization)(Whitespace|Newline)* )* (Whitespace|Newline)* RightCurlyBracket;

iterationForEach: LOOP IN VariableName USING VariableName (Whitespace|Newline)* LeftCurlyBracket (Whitespace|Newline)* (algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) (Whitespace)* (PLUS (Whitespace|Newline)*(algorithmExecution | show | loop | cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) (Whitespace|Newline)* )* (Whitespace|Newline)* RightCurlyBracket;

functionExecution: VariableName ( ('<' (VariableName COMMA)* VariableName '>') || ('<' '>') );


/* ----------------------- */


expression: (cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization | moveInitalization | arrayInitalization) SEMICOLON;


cubeInitialization: CUBE (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)* ASSIGN (Whitespace)* CubeValue;

algorithmInitalization: ALGO (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)* ASSIGN (Whitespace)* AAValue;

numberInitalization: NUM (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)* ASSIGN (Whitespace)* (NUMBER | VariableName);

settingInitalization: SETTING (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)* ASSIGN (Whitespace|Newline)* SettingValue;

moveInitalization: MOVE (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)* ASSIGN (Whitespace)* (MOVEVALUE | VariableName);

arrayInitalization: ARRAY (Whitespace)* LeftRoundBracket (Whitespace)* Type (Whitespace)* RightRoundBracket (Whitespace)* COLON (Whitespace)* VariableName (Whitespace)*ASSIGN (Whitespace)* AAValue;

functionDeclaration: FUNC VariableName ( ('<' (VariableName COMMA)* VariableName '>') | ('<' '>') ) BEGIN (statement | expression)+ END;



/* ----------------------- */


SettingValue: LeftSquareBracket (Whitespace|Newline)* Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall SEMICOLON Wall (Whitespace|Newline)* RightSquareBracket; 

// AlgorithmValue: LeftSquareBracket (VariableName COMMA | MOVEVALUE COMMA)* ((VariableName | MOVEVALUE) Whitespace*) RightSquareBracket;

// ArrayValue: LeftSquareBracket (VariableName COMMA | NUMBER COMMA)* (VariableName | NUMBER) RightSquareBracket;

AAValue: LeftSquareBracket (Whitespace)* ((VariableName | NUMBER | MOVEVALUE) (Whitespace)* COMMA)* (Whitespace)* ((VariableName | NUMBER | MOVEVALUE) Whitespace*) RightSquareBracket;

CubeValue: CUBECONSTRUCTOR  (Whitespace)* LeftRoundBracket (Whitespace)* ( MIXED | (MIXED (Whitespace)* COMMA (Whitespace)* (NUMBER | VariableName)) | SOLVED | VariableName )(Whitespace)* RightRoundBracket;

Wall: COLOR (Whitespace)* ASSIGN (Whitespace)* LeftCurlyBracket (Whitespace)*COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR COMMA COLOR (Whitespace)* RightCurlyBracket;


