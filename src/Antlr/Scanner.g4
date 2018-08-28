lexer grammar Scanner;

// Gramatica Regular

// Simbologia de elementos
// | : Usado para expresar alternativas
// . : Usado para representar cualquier caracter
// * : Usado para expresar la repeticion de 0 o mas veces
// ? : Usado para expresar la repeticion de 0 o 1 vez

// Palabras reservadas

BREAK: 'break';
CLASS: 'class';
CONST: 'const';
ELSE: 'else';
IF: 'if';
NEW: 'new';
READ: 'read';
RETURN: 'return';
VOID: 'void';
WHILE: 'while';
WRITE: 'write';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';
INT: 'int';
CHAR: 'char';
FLOAT: 'float';
BOOL: 'bool';
STRING: 'string';
LIST: 'list';


// Simbolos

SUM: '+';
REST: '-';
MULT: '*';
DIV: '/';
PORC: '%';
IGIG: '==';
DIF: '!=';
MAY: '>';
MAY_IG: '>=';
MEN: '<';
MEN_IG: '<=';
AND: '&&';
OR: '||';
IG: '=';
INC: '++';
DEC: '--';
PyC: ';';
COMA: ',';
PUNT: '.';
PAR_IZQ: '(';
PAR_DER: ')';
CORC_IZQ: '[';
CORC_DER: ']';
LLA_IZQ: '{';
LLA_DER: '}';
ADM: '!';
COM_DOB: '"';
HASH: '#';
DOLLAR: '$';
AMP: '&';
PREG: '?';
ARRB: '@';
DOS_PU: ':';


// Fragments (Conjuntos de elementos)
fragment LETTER: 'a'.. 'z' | 'A'..'Z' | '_';
fragment DIGIT: '0'..'9';

// Patrones Tokens
IDENT: LETTER (LETTER | DIGIT)*;
NUMBER: DIGIT (DIGIT)*;

CHAR_CONST: '\'' ( PRINTABLE_CHAR | '\n' | '\r' )  '\'';

// Elementos char imprimibles
PRINTABLE_CHAR: LETTER | DIGIT | ADM | COM_DOB |HASH | DOLLAR |
                PORC | AMP | PAR_IZQ | PAR_DER | MULT | SUM |
                COMA | REST | PUNT | DIV | DOS_PU | PyC | MEN | IG |
                MAY | PREG | ARRB | '\'';

// Expresiones Ignoradas
WS : [ \t\n\r]+ -> skip; // Espacio, tabulacion, salto de linea, retorno de carro.
LINE_COMMENT: '//' .*? '\n' -> skip; // Comentario de linea, empieza con // seguido de cualquier caracter
BLOCK_COMMENT: '/*' ( BLOCK_COMMENT | . )*? '*/' -> skip; // Comentario de bloque