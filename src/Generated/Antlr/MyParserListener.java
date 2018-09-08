// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/MiniC-Sharp/src/Antlr\MyParser.g4 by ANTLR 4.7
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(MyParser.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(MyParser.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link MyParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclAST(MyParser.ConstDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link MyParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclAST(MyParser.ConstDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link MyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAST(MyParser.VarDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link MyParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAST(MyParser.VarDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link MyParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclAST(MyParser.ClassDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link MyParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclAST(MyParser.ClassDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclAST}
	 * labeled alternative in {@link MyParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclAST(MyParser.MethodDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclAST}
	 * labeled alternative in {@link MyParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclAST(MyParser.MethodDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MyParser#formPars}.
	 * @param ctx the parse tree
	 */
	void enterFormParsAST(MyParser.FormParsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MyParser#formPars}.
	 * @param ctx the parse tree
	 */
	void exitFormParsAST(MyParser.FormParsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeAST(MyParser.TypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeAST(MyParser.TypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSTAST(MyParser.StatementSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSTAST(MyParser.StatementSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfSTAST(MyParser.IfSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfSTAST(MyParser.IfSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForSTAST(MyParser.ForSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForSTAST(MyParser.ForSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileSTAST(MyParser.WhileSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileSTAST(MyParser.WhileSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStAST(MyParser.BreakStASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStAST(MyParser.BreakStASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnSTAST(MyParser.ReturnSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnSTAST(MyParser.ReturnSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readSTAT}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadSTAT(MyParser.ReadSTATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readSTAT}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadSTAT(MyParser.ReadSTATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteSTAST(MyParser.WriteSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteSTAST(MyParser.WriteSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockSTAST(MyParser.BlockSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockSTAST(MyParser.BlockSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pycSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPycSTAST(MyParser.PycSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pycSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPycSTAST(MyParser.PycSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link MyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockAST(MyParser.BlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link MyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockAST(MyParser.BlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MyParser#actPars}.
	 * @param ctx the parse tree
	 */
	void enterActParsAST(MyParser.ActParsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MyParser#actPars}.
	 * @param ctx the parse tree
	 */
	void exitActParsAST(MyParser.ActParsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionAST(MyParser.ConditionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MyParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionAST(MyParser.ConditionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MyParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void enterCondTermAST(MyParser.CondTermASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MyParser#condTerm}.
	 * @param ctx the parse tree
	 */
	void exitCondTermAST(MyParser.CondTermASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MyParser#condFact}.
	 * @param ctx the parse tree
	 */
	void enterCondFactAST(MyParser.CondFactASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MyParser#condFact}.
	 * @param ctx the parse tree
	 */
	void exitCondFactAST(MyParser.CondFactASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAST}
	 * labeled alternative in {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAST(MyParser.ExprASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAST}
	 * labeled alternative in {@link MyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAST(MyParser.ExprASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link MyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermAST(MyParser.TermASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link MyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermAST(MyParser.TermASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorFAST(MyParser.FactorFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorFAST(MyParser.FactorFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numIntFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumIntFAST(MyParser.NumIntFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numIntFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumIntFAST(MyParser.NumIntFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numIntZeroFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numIntZeroFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFloatFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloatFAST(MyParser.NumberFloatFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFloatFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloatFAST(MyParser.NumberFloatFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFAST(MyParser.StringFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFAST(MyParser.StringFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chaeFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterChaeFAST(MyParser.ChaeFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chaeFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitChaeFAST(MyParser.ChaeFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFAST(MyParser.BooleanFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFAST(MyParser.BooleanFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNewFAST(MyParser.NewFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNewFAST(MyParser.NewFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expresionFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpresionFAST(MyParser.ExpresionFASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpresionFAST(MyParser.ExpresionFASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MyParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorAST(MyParser.DesignatorASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MyParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorAST(MyParser.DesignatorASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(MyParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(MyParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(MyParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(MyParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(MyParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(MyParser.MulopContext ctx);
}