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
//INT: 'int';
//CHAR: 'char';
//FLOAT: 'float';
//BOOL: 'bool';
//STRING: 'string';
LIST: 'list';
// Para metodos
ORD: 'ord';
CHR: 'chr';
LEN: 'len';

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
COM_SIM: '\'';


// Fragments (Conjuntos de elementos)
fragment LETTER: 'a'.. 'z' | 'A'..'Z' | '_';
fragment DIGIT: '0'..'9';
fragment DIGIT2: '1'..'9';

// Patrones Tokens
IDENT: LETTER (LETTER | DIGIT)*;

// Representa a los numeros enteros
NUMBER_INTEGER_ZERO: '0'; // Estrictamente el numero 0
NUMBER_INTEGER: DIGIT2 (DIGIT)*; // Los numero enteros de 1 en adelante

//BOOL_CONST: (TRUE|FALSE); Valores booleanos
NUMBER_FLOAT: DIGIT (DIGIT)* PUNT DIGIT (DIGIT)*;// Valores flotantes

// Representa a las cadenas string
STRING_CONST: '"' (PRINTABLE_CHAR | ' ')* '"';

// Representa a los caracteres char
CHAR_CONST: '\'' ( PRINTABLE_CHAR | '\n' | '\r' )  '\''; // longitud 1 caracter

// Elementos char imprimibles
PRINTABLE_CHAR: LETTER | DIGIT | ADM | COM_DOB |HASH | DOLLAR |
                PORC | AMP | PAR_IZQ | PAR_DER | MULT | SUM |
                COMA | REST | PUNT | DIV | DOS_PU | PyC | MEN | IG |
                MAY | PREG | ARRB | COM_SIM;

// Expresiones Ignoradas
WS : [ \t\n\r]+ -> skip; // Espacio, tabulacion, salto de linea, retorno de carro.
LINE_COMMENT: '//' .*? '\n' -> skip; // Comentario de linea, empieza con // seguido de cualquier caracter
BLOCK_COMMENT: '/*' ( BLOCK_COMMENT | . )*? '*/' -> skip; // Comentario de bloque