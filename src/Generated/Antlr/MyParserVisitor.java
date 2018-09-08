// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/MiniC-Sharp/src/Antlr\MyParser.g4 by ANTLR 4.7
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(MyParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link MyParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclAST(MyParser.ConstDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link MyParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclAST(MyParser.VarDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link MyParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclAST(MyParser.ClassDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclAST}
	 * labeled alternative in {@link MyParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclAST(MyParser.MethodDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formParsAST}
	 * labeled alternative in {@link MyParser#formPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormParsAST(MyParser.FormParsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAST}
	 * labeled alternative in {@link MyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAST(MyParser.TypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSTAST(MyParser.StatementSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSTAST(MyParser.IfSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSTAST(MyParser.ForSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSTAST(MyParser.WhileSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStAST(MyParser.BreakStASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSTAST(MyParser.ReturnSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readSTAT}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadSTAT(MyParser.ReadSTATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteSTAST(MyParser.WriteSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSTAST(MyParser.BlockSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pycSTAST}
	 * labeled alternative in {@link MyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPycSTAST(MyParser.PycSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link MyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockAST(MyParser.BlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actParsAST}
	 * labeled alternative in {@link MyParser#actPars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActParsAST(MyParser.ActParsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionAST}
	 * labeled alternative in {@link MyParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAST(MyParser.ConditionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condTermAST}
	 * labeled alternative in {@link MyParser#condTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondTermAST(MyParser.CondTermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condFactAST}
	 * labeled alternative in {@link MyParser#condFact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondFactAST(MyParser.CondFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAST}
	 * labeled alternative in {@link MyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAST(MyParser.ExprASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link MyParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAST(MyParser.TermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFAST(MyParser.FactorFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numIntFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIntFAST(MyParser.NumIntFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numIntZeroFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumIntZeroFAST(MyParser.NumIntZeroFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFloatFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloatFAST(MyParser.NumberFloatFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFAST(MyParser.StringFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chaeFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChaeFAST(MyParser.ChaeFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFAST(MyParser.BooleanFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewFAST(MyParser.NewFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expresionFAST}
	 * labeled alternative in {@link MyParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionFAST(MyParser.ExpresionFASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code designatorAST}
	 * labeled alternative in {@link MyParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorAST(MyParser.DesignatorASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(MyParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(MyParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(MyParser.MulopContext ctx);
}