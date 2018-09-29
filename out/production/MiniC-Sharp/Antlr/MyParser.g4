parser grammar MyParser;

options{
    tokenVocab = Scanner;
}

// Gramatica Libre de contexto

// Inicio del programa

// Estructura general de una clase

program: CLASS IDENT (constDecl | varDecl | classDecl )*
        LLA_IZQ (methodDecl)* LLA_DER EOF                                                                               #programAST;

// Declaracion de una constante
constDecl: CONST type IDENT IG ( NUMBER_INTEGER | NUMBER_INTEGER_ZERO | NUMBER_FLOAT | CHAR_CONST |STRING_CONST) PyC    #constDeclAST;

// Declaracion de una variable
varDecl: type IDENT ( COMA IDENT )* PyC                                                                                 #varDeclAST;

// Declaracion de una clase
classDecl: CLASS IDENT LLA_IZQ ( varDecl )* LLA_DER                                                                     #classDeclAST;

// Declaracion de un metodo
methodDecl: ( type | VOID ) IDENT PAR_IZQ ( formPars )? PAR_DER ( varDecl )* block                                      #methodDeclAST;

// Formato de los parametros de un metodo
formPars: type IDENT ( COMA type IDENT )*                                                                               #formParsAST;

// Formato para establecer el tipo de dato
type: IDENT (CORC_IZQ CORC_DER)?                                                                                    #typeAST;


statement: designator ( IG expr | PAR_IZQ ( actPars )? PAR_DER  | INC | DEC ) PyC                                       #statementSTAST
		 |  IF PAR_IZQ condition PAR_DER statement ( ELSE statement )?                                                  #ifSTAST
		 |  FOR PAR_IZQ expr PyC (condition)? PyC (statement)? PAR_DER statement                                        #forSTAST
		 |  WHILE PAR_IZQ condition PAR_DER statement                                                                   #whileSTAST
		 |  BREAK PyC                                                                                                   #breakStAST
		 |  RETURN ( expr )? PyC                                                                                        #returnSTAST
		 |  READ PAR_IZQ designator PAR_DER PyC                                                                         #readSTAT
		 |  WRITE PAR_IZQ expr ( COMA NUMBER_INTEGER | NUMBER_INTEGER_ZERO | NUMBER_FLOAT)? PAR_DER PyC                 #writeSTAST
		 |  block                                                                                                       #blockSTAST
		 |  PyC                                                                                                         #pycSTAST;

block: LLA_IZQ ( statement )* LLA_DER                                                                                   #blockAST;

actPars: expr ( COMA expr )*                                                                                            #actParsAST;

// Formato de condiciones
condition: condTerm ( OR condTerm )*                                                                                    #conditionAST;

condTerm: condFact ( AND condFact)*                                                                                     #condTermAST;

condFact: expr relop expr                                                                                               #condFactAST;

expr: ( REST )? term ( addop term )*                                                                                    #exprAST;

term: factor ( mulop factor )*                                                                                          #termAST;

factor: designator ( PAR_IZQ ( actPars )? PAR_DER )?                                                                    #factorFAST
		 |  special_function (PAR_IZQ (actPars) PAR_DER)                                                                #spfunctionFAST
		 |  NUMBER_INTEGER                                                                                              #numIntFAST
		 |  NUMBER_INTEGER_ZERO                                                                                         #numIntZeroFAST
		 |  NUMBER_FLOAT                                                                                                #numberFloatFAST
		 |  STRING_CONST                                                                                                #stringFAST
		 |  CHAR_CONST                                                                                                  #chaeFAST
		 |  (TRUE|FALSE)                                                                                                #booleanFAST
		 |  NEW designator                                                                                                   #newFAST
		 |  PAR_IZQ expr PAR_DER                                                                                        #expresionFAST;

special_function: ORD                                                                                                   #spfunctionORD
                | CHR                                                                                                   #spfunctionCHR
                | LEN                                                                                                   #spfunctionLEN;
designator: IDENT ( PUNT IDENT | CORC_IZQ expr CORC_DER )*                                                              #designatorAST;

// Operadores logicos
relop: IGIG | DIF | MAY | MAY_IG | MEN | MEN_IG                                                                         #relopAST;

// Operadores matematicos
addop: SUM | REST                                                                                                       #addopAST;
mulop: MULT | DIV | PORC                                                                                                #mulopAST;
