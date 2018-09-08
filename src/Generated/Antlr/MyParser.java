// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/MiniC-Sharp/src/Antlr\MyParser.g4 by ANTLR 4.7
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CLASS=2, CONST=3, ELSE=4, IF=5, NEW=6, READ=7, RETURN=8, VOID=9, 
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, LIST=15, ORD=16, CHR=17, 
		LEN=18, SUM=19, REST=20, MULT=21, DIV=22, PORC=23, IGIG=24, DIF=25, MAY=26, 
		MAY_IG=27, MEN=28, MEN_IG=29, AND=30, OR=31, IG=32, INC=33, DEC=34, PyC=35, 
		COMA=36, PUNT=37, PAR_IZQ=38, PAR_DER=39, CORC_IZQ=40, CORC_DER=41, LLA_IZQ=42, 
		LLA_DER=43, ADM=44, COM_DOB=45, HASH=46, DOLLAR=47, AMP=48, PREG=49, ARRB=50, 
		DOS_PU=51, COM_SIM=52, IDENT=53, NUMBER_INTEGER_ZERO=54, NUMBER_INTEGER=55, 
		NUMBER_FLOAT=56, STRING_CONST=57, CHAR_CONST=58, PRINTABLE_CHAR=59, WS=60, 
		LINE_COMMENT=61, BLOCK_COMMENT=62;
	public static final int
		RULE_program = 0, RULE_constDecl = 1, RULE_varDecl = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_formPars = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_block = 8, RULE_actPars = 9, RULE_condition = 10, RULE_condTerm = 11, 
		RULE_condFact = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_designator = 16, RULE_relop = 17, RULE_addop = 18, RULE_mulop = 19;
	public static final String[] ruleNames = {
		"program", "constDecl", "varDecl", "classDecl", "methodDecl", "formPars", 
		"type", "statement", "block", "actPars", "condition", "condTerm", "condFact", 
		"expr", "term", "factor", "designator", "relop", "addop", "mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'class'", "'const'", "'else'", "'if'", "'new'", "'read'", 
		"'return'", "'void'", "'while'", "'write'", "'for'", "'true'", "'false'", 
		"'list'", "'ord'", "'chr'", "'len'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'='", "'++'", 
		"'--'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'!'", "'\"'", "'#'", "'$'", "'&'", "'?'", "'@'", "':'", "'''", null, 
		"'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", 
		"VOID", "WHILE", "WRITE", "FOR", "TRUE", "FALSE", "LIST", "ORD", "CHR", 
		"LEN", "SUM", "REST", "MULT", "DIV", "PORC", "IGIG", "DIF", "MAY", "MAY_IG", 
		"MEN", "MEN_IG", "AND", "OR", "IG", "INC", "DEC", "PyC", "COMA", "PUNT", 
		"PAR_IZQ", "PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", 
		"COM_DOB", "HASH", "DOLLAR", "AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", 
		"IDENT", "NUMBER_INTEGER_ZERO", "NUMBER_INTEGER", "NUMBER_FLOAT", "STRING_CONST", 
		"CHAR_CONST", "PRINTABLE_CHAR", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode LLA_IZQ() { return getToken(MyParser.LLA_IZQ, 0); }
		public TerminalNode LLA_DER() { return getToken(MyParser.LLA_DER, 0); }
		public TerminalNode EOF() { return getToken(MyParser.EOF, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CLASS);
			setState(41);
			match(IDENT);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << IDENT))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(42);
					constDecl();
					}
					break;
				case IDENT:
					{
					setState(43);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(44);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(LLA_IZQ);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(51);
				methodDecl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(LLA_DER);
			setState(58);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclContext extends ParserRuleContext {
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
	 
		public ConstDeclContext() { }
		public void copyFrom(ConstDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclASTContext extends ConstDeclContext {
		public TerminalNode CONST() { return getToken(MyParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode IG() { return getToken(MyParser.IG, 0); }
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode NUMBER_INTEGER() { return getToken(MyParser.NUMBER_INTEGER, 0); }
		public TerminalNode NUMBER_INTEGER_ZERO() { return getToken(MyParser.NUMBER_INTEGER_ZERO, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(MyParser.NUMBER_FLOAT, 0); }
		public TerminalNode CHAR_CONST() { return getToken(MyParser.CHAR_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(MyParser.STRING_CONST, 0); }
		public ConstDeclASTContext(ConstDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDecl);
		int _la;
		try {
			_localctx = new ConstDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONST);
			setState(61);
			type();
			setState(62);
			match(IDENT);
			setState(63);
			match(IG);
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(PyC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclASTContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MyParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyParser.IDENT, i);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public List<TerminalNode> COMA() { return getTokens(MyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParser.COMA, i);
		}
		public VarDeclASTContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitVarDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			_localctx = new VarDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(IDENT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(69);
				match(COMA);
				setState(70);
				match(IDENT);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(PyC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclASTContext extends ClassDeclContext {
		public TerminalNode CLASS() { return getToken(MyParser.CLASS, 0); }
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode LLA_IZQ() { return getToken(MyParser.LLA_IZQ, 0); }
		public TerminalNode LLA_DER() { return getToken(MyParser.LLA_DER, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public ClassDeclASTContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CLASS);
			setState(79);
			match(IDENT);
			setState(80);
			match(LLA_IZQ);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(81);
				varDecl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(LLA_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDeclASTContext extends MethodDeclContext {
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MyParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodDeclASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			_localctx = new MethodDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(89);
				type();
				}
				break;
			case VOID:
				{
				setState(90);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			match(IDENT);
			setState(94);
			match(PAR_IZQ);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(95);
				formPars();
				}
			}

			setState(98);
			match(PAR_DER);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(99);
				varDecl();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormParsContext extends ParserRuleContext {
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
	 
		public FormParsContext() { }
		public void copyFrom(FormParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormParsASTContext extends FormParsContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MyParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyParser.IDENT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(MyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParser.COMA, i);
		}
		public FormParsASTContext(FormParsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFormParsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formPars);
		int _la;
		try {
			_localctx = new FormParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(IDENT);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				type();
				setState(111);
				match(IDENT);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeASTContext extends TypeContext {
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode CORC_IZQ() { return getToken(MyParser.CORC_IZQ, 0); }
		public TerminalNode CORC_DER() { return getToken(MyParser.CORC_DER, 0); }
		public TypeASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			_localctx = new TypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CORC_IZQ) {
				{
				setState(119);
				match(CORC_IZQ);
				setState(120);
				match(CORC_DER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnSTASTContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(MyParser.RETURN, 0); }
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReturnSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSTASTContext extends StatementContext {
		public TerminalNode IF() { return getToken(MyParser.IF, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyParser.ELSE, 0); }
		public IfSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitIfSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSTASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBlockSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadSTATContext extends StatementContext {
		public TerminalNode READ() { return getToken(MyParser.READ, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public ReadSTATContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitReadSTAT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForSTASTContext extends StatementContext {
		public TerminalNode FOR() { return getToken(MyParser.FOR, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> PyC() { return getTokens(MyParser.PyC); }
		public TerminalNode PyC(int i) {
			return getToken(MyParser.PyC, i);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitForSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStASTContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(MyParser.BREAK, 0); }
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public BreakStASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBreakStAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PycSTASTContext extends StatementContext {
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public PycSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitPycSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementSTASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode IG() { return getToken(MyParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public TerminalNode INC() { return getToken(MyParser.INC, 0); }
		public TerminalNode DEC() { return getToken(MyParser.DEC, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public StatementSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatementSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSTASTContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(MyParser.WHILE, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWhileSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteSTASTContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(MyParser.WRITE, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode COMA() { return getToken(MyParser.COMA, 0); }
		public TerminalNode NUMBER_INTEGER() { return getToken(MyParser.NUMBER_INTEGER, 0); }
		public TerminalNode NUMBER_INTEGER_ZERO() { return getToken(MyParser.NUMBER_INTEGER_ZERO, 0); }
		public TerminalNode NUMBER_FLOAT() { return getToken(MyParser.NUMBER_FLOAT, 0); }
		public WriteSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWriteSTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new StatementSTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				designator();
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IG:
					{
					setState(124);
					match(IG);
					setState(125);
					expr();
					}
					break;
				case PAR_IZQ:
					{
					setState(126);
					match(PAR_IZQ);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(127);
						actPars();
						}
					}

					setState(130);
					match(PAR_DER);
					}
					break;
				case INC:
					{
					setState(131);
					match(INC);
					}
					break;
				case DEC:
					{
					setState(132);
					match(DEC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(PyC);
				}
				break;
			case IF:
				_localctx = new IfSTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IF);
				setState(138);
				match(PAR_IZQ);
				setState(139);
				condition();
				setState(140);
				match(PAR_DER);
				setState(141);
				statement();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(142);
					match(ELSE);
					setState(143);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				_localctx = new ForSTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(FOR);
				setState(147);
				match(PAR_IZQ);
				setState(148);
				expr();
				setState(149);
				match(PyC);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(150);
					condition();
					}
				}

				setState(153);
				match(PyC);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
					{
					setState(154);
					statement();
					}
				}

				setState(157);
				match(PAR_DER);
				setState(158);
				statement();
				}
				break;
			case WHILE:
				_localctx = new WhileSTASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(WHILE);
				setState(161);
				match(PAR_IZQ);
				setState(162);
				condition();
				setState(163);
				match(PAR_DER);
				setState(164);
				statement();
				}
				break;
			case BREAK:
				_localctx = new BreakStASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(BREAK);
				setState(167);
				match(PyC);
				}
				break;
			case RETURN:
				_localctx = new ReturnSTASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(RETURN);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(169);
					expr();
					}
				}

				setState(172);
				match(PyC);
				}
				break;
			case READ:
				_localctx = new ReadSTATContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(READ);
				setState(174);
				match(PAR_IZQ);
				setState(175);
				designator();
				setState(176);
				match(PAR_DER);
				setState(177);
				match(PyC);
				}
				break;
			case WRITE:
				_localctx = new WriteSTASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				match(WRITE);
				setState(180);
				match(PAR_IZQ);
				setState(181);
				expr();
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMA:
					{
					setState(182);
					match(COMA);
					setState(183);
					match(NUMBER_INTEGER);
					}
					break;
				case NUMBER_INTEGER_ZERO:
					{
					setState(184);
					match(NUMBER_INTEGER_ZERO);
					}
					break;
				case NUMBER_FLOAT:
					{
					setState(185);
					match(NUMBER_FLOAT);
					}
					break;
				case PAR_DER:
					break;
				default:
					break;
				}
				setState(188);
				match(PAR_DER);
				setState(189);
				match(PyC);
				}
				break;
			case LLA_IZQ:
				_localctx = new BlockSTASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				block();
				}
				break;
			case PyC:
				_localctx = new PycSTASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(192);
				match(PyC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode LLA_IZQ() { return getToken(MyParser.LLA_IZQ, 0); }
		public TerminalNode LLA_DER() { return getToken(MyParser.LLA_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(LLA_IZQ);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(LLA_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActParsContext extends ParserRuleContext {
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
	 
		public ActParsContext() { }
		public void copyFrom(ActParsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActParsASTContext extends ActParsContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MyParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MyParser.COMA, i);
		}
		public ActParsASTContext(ActParsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitActParsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			_localctx = new ActParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(205);
				match(COMA);
				setState(206);
				expr();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionASTContext extends ConditionContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MyParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MyParser.OR, i);
		}
		public ConditionASTContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConditionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			_localctx = new ConditionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			condTerm();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(213);
				match(OR);
				setState(214);
				condTerm();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondTermContext extends ParserRuleContext {
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
	 
		public CondTermContext() { }
		public void copyFrom(CondTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondTermASTContext extends CondTermContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MyParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MyParser.AND, i);
		}
		public CondTermASTContext(CondTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCondTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condTerm);
		int _la;
		try {
			_localctx = new CondTermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			condFact();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(221);
				match(AND);
				setState(222);
				condFact();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondFactContext extends ParserRuleContext {
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
	 
		public CondFactContext() { }
		public void copyFrom(CondFactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondFactASTContext extends CondFactContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondFactASTContext(CondFactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitCondFactAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condFact);
		try {
			_localctx = new CondFactASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expr();
			setState(229);
			relop();
			setState(230);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprASTContext extends ExprContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode REST() { return getToken(MyParser.REST, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprASTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExprAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			_localctx = new ExprASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REST) {
				{
				setState(232);
				match(REST);
				}
			}

			setState(235);
			term();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(236);
				addop();
				setState(237);
				term();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			factor();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PORC))) != 0)) {
				{
				{
				setState(245);
				mulop();
				setState(246);
				factor();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumIntFASTContext extends FactorContext {
		public TerminalNode NUMBER_INTEGER() { return getToken(MyParser.NUMBER_INTEGER, 0); }
		public NumIntFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumIntFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorFASTContext extends FactorContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public FactorFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitFactorFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumIntZeroFASTContext extends FactorContext {
		public TerminalNode NUMBER_INTEGER_ZERO() { return getToken(MyParser.NUMBER_INTEGER_ZERO, 0); }
		public NumIntZeroFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumIntZeroFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpresionFASTContext extends FactorContext {
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public ExpresionFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitExpresionFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChaeFASTContext extends FactorContext {
		public TerminalNode CHAR_CONST() { return getToken(MyParser.CHAR_CONST, 0); }
		public ChaeFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitChaeFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringFASTContext extends FactorContext {
		public TerminalNode STRING_CONST() { return getToken(MyParser.STRING_CONST, 0); }
		public StringFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStringFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewFASTContext extends FactorContext {
		public TerminalNode NEW() { return getToken(MyParser.NEW, 0); }
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public NewFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNewFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFASTContext extends FactorContext {
		public TerminalNode TRUE() { return getToken(MyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MyParser.FALSE, 0); }
		public BooleanFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBooleanFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFloatFASTContext extends FactorContext {
		public TerminalNode NUMBER_FLOAT() { return getToken(MyParser.NUMBER_FLOAT, 0); }
		public NumberFloatFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitNumberFloatFAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new FactorFASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				designator();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAR_IZQ) {
					{
					setState(254);
					match(PAR_IZQ);
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(255);
						actPars();
						}
					}

					setState(258);
					match(PAR_DER);
					}
				}

				}
				break;
			case NUMBER_INTEGER:
				_localctx = new NumIntFASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(NUMBER_INTEGER);
				}
				break;
			case NUMBER_INTEGER_ZERO:
				_localctx = new NumIntZeroFASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(NUMBER_INTEGER_ZERO);
				}
				break;
			case NUMBER_FLOAT:
				_localctx = new NumberFloatFASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(NUMBER_FLOAT);
				}
				break;
			case STRING_CONST:
				_localctx = new StringFASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(STRING_CONST);
				}
				break;
			case CHAR_CONST:
				_localctx = new ChaeFASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(CHAR_CONST);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanFASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NEW:
				_localctx = new NewFASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				match(NEW);
				setState(268);
				match(IDENT);
				}
				break;
			case PAR_IZQ:
				_localctx = new ExpresionFASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				match(PAR_IZQ);
				setState(270);
				expr();
				setState(271);
				match(PAR_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesignatorASTContext extends DesignatorContext {
		public List<TerminalNode> IDENT() { return getTokens(MyParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MyParser.IDENT, i);
		}
		public List<TerminalNode> PUNT() { return getTokens(MyParser.PUNT); }
		public TerminalNode PUNT(int i) {
			return getToken(MyParser.PUNT, i);
		}
		public List<TerminalNode> CORC_IZQ() { return getTokens(MyParser.CORC_IZQ); }
		public TerminalNode CORC_IZQ(int i) {
			return getToken(MyParser.CORC_IZQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORC_DER() { return getTokens(MyParser.CORC_DER); }
		public TerminalNode CORC_DER(int i) {
			return getToken(MyParser.CORC_DER, i);
		}
		public DesignatorASTContext(DesignatorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDesignatorAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENT);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNT || _la==CORC_IZQ) {
				{
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUNT:
					{
					setState(276);
					match(PUNT);
					setState(277);
					match(IDENT);
					}
					break;
				case CORC_IZQ:
					{
					setState(278);
					match(CORC_IZQ);
					setState(279);
					expr();
					setState(280);
					match(CORC_DER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode IGIG() { return getToken(MyParser.IGIG, 0); }
		public TerminalNode DIF() { return getToken(MyParser.DIF, 0); }
		public TerminalNode MAY() { return getToken(MyParser.MAY, 0); }
		public TerminalNode MAY_IG() { return getToken(MyParser.MAY_IG, 0); }
		public TerminalNode MEN() { return getToken(MyParser.MEN, 0); }
		public TerminalNode MEN_IG() { return getToken(MyParser.MEN_IG, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGIG) | (1L << DIF) | (1L << MAY) | (1L << MAY_IG) | (1L << MEN) | (1L << MEN_IG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(MyParser.SUM, 0); }
		public TerminalNode REST() { return getToken(MyParser.REST, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==SUM || _la==REST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(MyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MyParser.DIV, 0); }
		public TerminalNode PORC() { return getToken(MyParser.PORC, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PORC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0128\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\5"+
		"\6c\n\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0083\n\t\3\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0093\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\5\t\u009e"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bd\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00d2\n\13\f\13\16\13\u00d5\13\13\3"+
		"\f\3\f\3\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\r\3\r\3\r\7\r\u00e2\n\r"+
		"\f\r\16\r\u00e5\13\r\3\16\3\16\3\16\3\16\3\17\5\17\u00ec\n\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00f2\n\17\f\17\16\17\u00f5\13\17\3\20\3\20\3\20\3\20"+
		"\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21\3\21\3\21\5\21\u0103\n\21"+
		"\3\21\5\21\u0106\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0114\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011d"+
		"\n\22\f\22\16\22\u0120\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\28<\3\2\17\20\3\2"+
		"\32\37\3\2\25\26\3\2\27\31\2\u0145\2*\3\2\2\2\4>\3\2\2\2\6E\3\2\2\2\b"+
		"P\3\2\2\2\n]\3\2\2\2\fm\3\2\2\2\16x\3\2\2\2\20\u00c3\3\2\2\2\22\u00c5"+
		"\3\2\2\2\24\u00ce\3\2\2\2\26\u00d6\3\2\2\2\30\u00de\3\2\2\2\32\u00e6\3"+
		"\2\2\2\34\u00eb\3\2\2\2\36\u00f6\3\2\2\2 \u0113\3\2\2\2\"\u0115\3\2\2"+
		"\2$\u0121\3\2\2\2&\u0123\3\2\2\2(\u0125\3\2\2\2*+\7\4\2\2+\61\7\67\2\2"+
		",\60\5\4\3\2-\60\5\6\4\2.\60\5\b\5\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648"+
		"\7,\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\2"+
		"9;\3\2\2\2:8\3\2\2\2;<\7-\2\2<=\7\2\2\3=\3\3\2\2\2>?\7\5\2\2?@\5\16\b"+
		"\2@A\7\67\2\2AB\7\"\2\2BC\t\2\2\2CD\7%\2\2D\5\3\2\2\2EF\5\16\b\2FK\7\67"+
		"\2\2GH\7&\2\2HJ\7\67\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2"+
		"\2\2MK\3\2\2\2NO\7%\2\2O\7\3\2\2\2PQ\7\4\2\2QR\7\67\2\2RV\7,\2\2SU\5\6"+
		"\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7-"+
		"\2\2Z\t\3\2\2\2[^\5\16\b\2\\^\7\13\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2"+
		"_`\7\67\2\2`b\7(\2\2ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2dh\7)\2\2"+
		"eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2"+
		"kl\5\22\n\2l\13\3\2\2\2mn\5\16\b\2nu\7\67\2\2op\7&\2\2pq\5\16\b\2qr\7"+
		"\67\2\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3\2\2\2w"+
		"u\3\2\2\2x{\7\67\2\2yz\7*\2\2z|\7+\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2"+
		"}\u0087\5\"\22\2~\177\7\"\2\2\177\u0088\5\34\17\2\u0080\u0082\7(\2\2\u0081"+
		"\u0083\5\24\13\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0088\7)\2\2\u0085\u0088\7#\2\2\u0086\u0088\7$\2\2\u0087"+
		"~\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\7%\2\2\u008a\u00c4\3\2\2\2\u008b\u008c"+
		"\7\7\2\2\u008c\u008d\7(\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7)\2\2\u008f"+
		"\u0092\5\20\t\2\u0090\u0091\7\6\2\2\u0091\u0093\5\20\t\2\u0092\u0090\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u00c4\3\2\2\2\u0094\u0095\7\16\2\2\u0095"+
		"\u0096\7(\2\2\u0096\u0097\5\34\17\2\u0097\u0099\7%\2\2\u0098\u009a\5\26"+
		"\f\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\7%\2\2\u009c\u009e\5\20\t\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7)\2\2\u00a0\u00a1\5\20\t\2\u00a1"+
		"\u00c4\3\2\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\7(\2\2\u00a4\u00a5\5\26"+
		"\f\2\u00a5\u00a6\7)\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00c4\3\2\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\u00c4\7%\2\2\u00aa\u00ac\7\n\2\2\u00ab\u00ad\5\34"+
		"\17\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00c4\7%\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\5\"\22"+
		"\2\u00b2\u00b3\7)\2\2\u00b3\u00b4\7%\2\2\u00b4\u00c4\3\2\2\2\u00b5\u00b6"+
		"\7\r\2\2\u00b6\u00b7\7(\2\2\u00b7\u00bc\5\34\17\2\u00b8\u00b9\7&\2\2\u00b9"+
		"\u00bd\79\2\2\u00ba\u00bd\78\2\2\u00bb\u00bd\7:\2\2\u00bc\u00b8\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00bf\7)\2\2\u00bf\u00c0\7%\2\2\u00c0\u00c4\3\2\2\2\u00c1"+
		"\u00c4\5\22\n\2\u00c2\u00c4\7%\2\2\u00c3}\3\2\2\2\u00c3\u008b\3\2\2\2"+
		"\u00c3\u0094\3\2\2\2\u00c3\u00a2\3\2\2\2\u00c3\u00a8\3\2\2\2\u00c3\u00aa"+
		"\3\2\2\2\u00c3\u00af\3\2\2\2\u00c3\u00b5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\21\3\2\2\2\u00c5\u00c9\7,\2\2\u00c6\u00c8\5\20\t"+
		"\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7-\2\2\u00cd"+
		"\23\3\2\2\2\u00ce\u00d3\5\34\17\2\u00cf\u00d0\7&\2\2\u00d0\u00d2\5\34"+
		"\17\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\5\30\r"+
		"\2\u00d7\u00d8\7!\2\2\u00d8\u00da\5\30\r\2\u00d9\u00d7\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\27\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00e3\5\32\16\2\u00df\u00e0\7 \2\2\u00e0\u00e2\5"+
		"\32\16\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\31\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\34\17"+
		"\2\u00e7\u00e8\5$\23\2\u00e8\u00e9\5\34\17\2\u00e9\33\3\2\2\2\u00ea\u00ec"+
		"\7\26\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00f3\5\36\20\2\u00ee\u00ef\5&\24\2\u00ef\u00f0\5\36\20\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fc"+
		"\5 \21\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\5 \21\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\37\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0105\5\"\22\2\u0100\u0102"+
		"\7(\2\2\u0101\u0103\5\24\13\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0104\3\2\2\2\u0104\u0106\7)\2\2\u0105\u0100\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0114\3\2\2\2\u0107\u0114\79\2\2\u0108\u0114\78\2\2\u0109"+
		"\u0114\7:\2\2\u010a\u0114\7;\2\2\u010b\u0114\7<\2\2\u010c\u0114\t\3\2"+
		"\2\u010d\u010e\7\b\2\2\u010e\u0114\7\67\2\2\u010f\u0110\7(\2\2\u0110\u0111"+
		"\5\34\17\2\u0111\u0112\7)\2\2\u0112\u0114\3\2\2\2\u0113\u00ff\3\2\2\2"+
		"\u0113\u0107\3\2\2\2\u0113\u0108\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u010a"+
		"\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2\2\2\u0113"+
		"\u010f\3\2\2\2\u0114!\3\2\2\2\u0115\u011e\7\67\2\2\u0116\u0117\7\'\2\2"+
		"\u0117\u011d\7\67\2\2\u0118\u0119\7*\2\2\u0119\u011a\5\34\17\2\u011a\u011b"+
		"\7+\2\2\u011b\u011d\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0118\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f#\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0122\t\4\2\2\u0122%\3\2\2\2\u0123\u0124\t"+
		"\5\2\2\u0124\'\3\2\2\2\u0125\u0126\t\6\2\2\u0126)\3\2\2\2 /\618KV]bhu"+
		"{\u0082\u0087\u0092\u0099\u009d\u00ac\u00bc\u00c3\u00c9\u00d3\u00db\u00e3"+
		"\u00eb\u00f3\u00fc\u0102\u0105\u0113\u011c\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}