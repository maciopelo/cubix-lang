grammar cubix;


/*
- Czy na pewno wiecej niz 1 kostka??? np. 1000 w tablicy
- Czy iteracja/loop przed inizlaicja kostki
 */



start: ((expression | show)* cubeInitialization Semicolon (expression | statement)*)+ EOF ;



algorithmExecution: VariableName Dot Exec LeftRoundBracket VariableName (Comma NUMBER)? RightRoundBracket Semicolon;

show: Show LeftRoundBracket VariableName RightRoundBracket Semicolon;




statement: (algorithmExecution | iterationForI | iterationForEach | show ) Semicolon;

expression: (cubeInitialization | algorithmInitalization | numberInitalization | settingInitalization) Semicolon;




cubeInitialization: Cube Colon VariableName Assign CubeValue;

algorithmInitalization: Algo Colon VariableName Assign LeftSquareBracket (Move Comma)* Move RightSquareBracket;

numberInitalization: Num Colon VariableName Assign NUMBER;

settingInitalization: Setting Colon VariableName Assign SettingValue;

moveInitalization: Move Colon VariableName Assign MOVEVALUE;

arrayInitalization: Array LeftRoundBracket Dollar Type RightRoundBracket Colon VariableName Assign ArrayValue;




iterationForI: Loop NUMBER Times Colon algorithmExecution;
iterationForEach: Loop In VariableName Using VariableName Colon (algorithmExecution | show) (Plus (algorithmExecution | show))* Semicolon;




MOVEVALUE:      'R'  | 'R2'   | 'R’'  | 'r'   | 'r2'  |  'r’' | 
                'L'  | 'L2'   | 'L’'  | 'l'   | 'l2'  |  'l’' |  
                'F'  | 'F2'   | 'F’'  | 'f'   | 'f2'  |  'f’' | 
                'B'  | 'B2'   | 'B’'  | 'b'   | 'b2'  |  'b’' |  
                'D'  | 'D2'   | 'D’'  | 'd'   | 'd2'  |  'd’' |
                'U'  | 'U2'   | 'U’'  | 'u'   | 'u2'  |  'u’' | 
                'M'  | 'E'    | 'S'   | 'x'   | 'y'   |  'z'  ;




COLOR: 'Red' | 'Green' | 'Blue' | 'Yellow' | 'White' | 'Orange';


NONDIGIT: [a-z] | [A-Z];
DIGIT: [0-9];
NUMBER: [1-9] DIGIT*;


/* Data types */
Cube: 'Cube';
Move: 'Move';
Algo: 'Algo';
Num: 'Num';
Setting: 'Setting';
Array: 'Array';
Type: (Cube | Move | Algo | Num | Setting); 


LeftRoundBracket: '(';
RightRoundBracket: ')';
LeftSquareBracket: '[';
RightSquareBracket: ']';
LeftCurlyBracket: '{';
RightCurlyBracket: '}';


Comma: ',';
Semicolon: ';';
Dot: '.';
Dollar: '$';
Plus: '+';
Assign: '=';
Colon: ':';


Loop: 'loop';
Times: 'times';

Exec: 'exec';
Show: 'show';
Mixed: '"mixed"';
Solved: '"solved"';
In: 'in';
Using: 'using';

Whitespace: [ \r\n\t] + -> skip;

/* ----------- */

VariableName: NONDIGIT+ (NONDIGIT | DIGIT)*;

SettingValue: LeftSquareBracket (Wall Comma){5} Wall RightSquareBracket; 

CubeState: ( Mixed | Solved | SettingValue );

CubeValue: 'cube' LeftRoundBracket CubeState RightRoundBracket;

ArrayValue: LeftSquareBracket (VariableName Comma)* VariableName RightSquareBracket;

Wall: COLOR Assign LeftCurlyBracket (COLOR Comma){7} COLOR RightCurlyBracket;
