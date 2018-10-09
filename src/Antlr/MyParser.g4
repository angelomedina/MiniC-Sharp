parser grammar MyParser;

options{
    tokenVocab = Scanner;
}

// Gramatica Libre de contexto

// Inicio del programa

// Estructura general de una clase
// ¿Se debe separar ?
program: CLASS IDENT (declaration)* LLA_IZQ (methodDecl)* LLA_DER EOF                                                   #programAST;

declaration: constDecl                                                                                                  #programConstAST
           | varDecl                                                                                                    #programVarAST
           | classDecl                                                                                                  #programClassAST;

// Declaracion de una constante
constDecl: CONST type IDENT IG (valueTypeConst) PyC                                                                     #constDeclAST;

valueTypeConst: NUMBER_INTEGER                                                                                          #constNumberIntDeclAST
              | NUMBER_INTEGER_ZERO                                                                                     #constNumberIntZDeclAST
              | CHAR_CONST                                                                                              #constCharDeclAST;


// Declaracion de una variable
varDecl: type IDENT ( COMA IDENT )* PyC                                                                                 #varDeclAST;

// Declaracion de una clase
classDecl: CLASS IDENT LLA_IZQ ( varDecl )* LLA_DER                                                                     #classDeclAST;

// Declaracion de un metodo
methodDecl: ( optionMethodDecl )IDENT PAR_IZQ ( formPars )? PAR_DER ( varDecl )* block                                  #methodDeclAST;


optionMethodDecl: type                                                                                                  #methodTypeDeclAST
                | VOID                                                                                                  #methodVoidDeclAST;

// Formato de los parametros de un metodo
formPars: type IDENT ( COMA type IDENT )*                                                                               #formParsAST;

// Formato para establecer el tipo de dato
type: IDENT (CORC_IZQ CORC_DER)?                                                                                        #typeAST;


statement: designator ( IG expr) PyC                                                                                    #statementIgSTAST
         | designator (PAR_IZQ ( actPars )? PAR_DER ) PyC                                                               #statementMetSTAST
         | designator ( INC ) PyC                                                                                       #statementIncSTAST
         | designator ( DEC ) PyC                                                                                       #statementDecSTAST
		 |  IF PAR_IZQ condition PAR_DER statement ( ELSE statement )?                                                  #ifSTAST
		 |  FOR PAR_IZQ expr PyC (condition)? PyC (statement)? PAR_DER statement                                        #forSTAST
		 |  WHILE PAR_IZQ condition PAR_DER statement                                                                   #whileSTAST
		 |  BREAK PyC                                                                                                   #breakStAST
		 |  RETURN ( expr )? PyC                                                                                        #returnSTAST
		 |  READ PAR_IZQ designator PAR_DER PyC                                                                         #readSTAT
		 |  WRITE PAR_IZQ expr (writeType)? PAR_DER PyC                 #writeSTAST
		 |  block                                                                                                       #blockSTAST
		 |  PyC                                                                                                         #pycSTAST;

writeType: COMA NUMBER_INTEGER                                                                                          #writeTypeNumIntSTAST
        | NUMBER_INTEGER_ZERO                                                                                           #writeTypeNumIntZSTAST
        | NUMBER_FLOAT                                                                                                  #writeTypeNumFloatSTAST;

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
		 |  (booleanValue)                                                                                              #booleanFAST
		 |  NEW designator                                                                                              #newFAST
		 |  PAR_IZQ expr PAR_DER                                                                                        #expresionFAST;

booleanValue: TRUE                                                                                                      #booleanTrueFAST
            |FALSE                                                                                                      #booleanFalseFAST;

special_function: ORD                                                                                                   #spfunctionORD
                | CHR                                                                                                   #spfunctionCHR
                | LEN                                                                                                   #spfunctionLEN;

designator: IDENT (designatorExp)*                                                                                      #designatorAST;

designatorExp: PUNT IDENT                                                                                               #designatorPuntIdAST
            | CORC_IZQ expr CORC_DER                                                                                    #designatorCorcsAST;

// Operadores logicos
relop: IGIG                                                                                                             #relopIgIgAST
     | DIF                                                                                                              #relopDifAST
     | MAY                                                                                                              #relopMayAST
     | MAY_IG                                                                                                           #relopMatIgAST
     | MEN                                                                                                              #relopMenAST
     | MEN_IG                                                                                                           #relopMenIgAST;

// Operadores matematicos
addop: SUM                                                                                                              #addopSumAST
     | REST                                                                                                             #addopRestAST;

mulop: MULT                                                                                                             #mulopMultAST
     | DIV                                                                                                              #mulopDivAST
     | PORC                                                                                                             #mulopPorcAST;
