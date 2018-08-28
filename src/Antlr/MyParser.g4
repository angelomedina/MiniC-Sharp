parser grammar MyParser;

options{
    tokenVocab = Scanner;
}

// Gramatica Libre de contexto

// Inicio del programa

// Estructura general de una clase

program: CLASS IDENT (constDecl | varDecl | classDecl )*
        LLA_IZQ (methodDecl)* LLA_DER EOF;

// Declaracion de una constante
constDecl: CONST type IDENT IG ( NUMBER | CHAR_CONST ) PyC ;

// Declaracion de una variable
varDecl: type IDENT ( COMA IDENT )* PyC ;

// Declaracion de una clase
classDecl: CLASS IDENT LLA_IZQ ( varDecl )* LLA_DER ;

// Declaracion de un metodo
methodDecl: ( type | VOID ) IDENT PAR_IZQ ( formPars )? PAR_DER ( varDecl )* block ;

// Formato de los parametros de un metodo
formPars: type IDENT ( COMA type IDENT )* ;

// Formato para establecer el tipo de dato
type: IDENT (CORC_IZQ CORC_DER)? ;


statement: designator ( IG expr | PAR_IZQ ( actPars )? PAR_DER  | INC | DEC ) PyC
		 |  IF PAR_IZQ condition PAR_DER statement ( ELSE statement )?
		 |  FOR PAR_IZQ expr PyC (condition)? PyC (statement)? PAR_DER statement
		 |  WHILE PAR_IZQ condition PAR_DER statement
		 |  BREAK PyC
		 |  RETURN ( expr )? PyC
		 |  READ PAR_IZQ designator PAR_DER PyC
		 |  WRITE PAR_IZQ expr ( COMA NUMBER )? PAR_DER PyC
		 |  block
		 |  PyC;

block: LLA_IZQ ( statement )* LLA_DER;

actPars: expr ( COMA expr )*;

// Formato de condiciones
condition: condTerm ( OR condTerm )*;

condTerm: condFact ( AND condFact)*;

condFact: expr relop expr;

expr: ( REST )? term ( addop term )*;

term: factor ( mulop factor )*;

factor: designator ( PAR_IZQ ( actPars )? PAR_DER )?
		 |  NUMBER
		 |  CHAR_CONST
		 |  (TRUE | FALSE)
		 |  NEW IDENT
		 |  PAR_IZQ expr PAR_DER;


designator: IDENT ( PUNT IDENT | CORC_IZQ expr CORC_DER )*;

// Operadores logicos
relop: IG | DIF | MAY | MAY_IG | MEN | MEN_IG;

// Operadores matematicos
addop: SUM | REST;
mulop: MULT | DIV | PORC;
