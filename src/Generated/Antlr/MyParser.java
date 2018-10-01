// Generated from D:/Proyecto Compiladores/MiniC-Sharp/src/Antlr\MyParser.g4 by ANTLR 4.7
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
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, ORD=15, CHR=16, LEN=17, 
		SUM=18, REST=19, MULT=20, DIV=21, PORC=22, IGIG=23, DIF=24, MAY=25, MAY_IG=26, 
		MEN=27, MEN_IG=28, AND=29, OR=30, IG=31, INC=32, DEC=33, PyC=34, COMA=35, 
		PUNT=36, PAR_IZQ=37, PAR_DER=38, CORC_IZQ=39, CORC_DER=40, LLA_IZQ=41, 
		LLA_DER=42, ADM=43, COM_DOB=44, HASH=45, DOLLAR=46, AMP=47, PREG=48, ARRB=49, 
		DOS_PU=50, COM_SIM=51, SALTO_LINEA=52, TAB=53, IDENT=54, NUMBER_INTEGER_ZERO=55, 
		NUMBER_INTEGER=56, NUMBER_FLOAT=57, STRING_CONST=58, CHAR_CONST=59, PRINTABLE_CHAR=60, 
		WS=61, LINE_COMMENT=62, BLOCK_COMMENT=63;
	public static final int
		RULE_program = 0, RULE_constDecl = 1, RULE_varDecl = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_formPars = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_block = 8, RULE_actPars = 9, RULE_condition = 10, RULE_condTerm = 11, 
		RULE_condFact = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_special_function = 16, RULE_designator = 17, RULE_relop = 18, RULE_addop = 19, 
		RULE_mulop = 20;
	public static final String[] ruleNames = {
		"program", "constDecl", "varDecl", "classDecl", "methodDecl", "formPars", 
		"type", "statement", "block", "actPars", "condition", "condTerm", "condFact", 
		"expr", "term", "factor", "special_function", "designator", "relop", "addop", 
		"mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'class'", "'const'", "'else'", "'if'", "'new'", "'read'", 
		"'return'", "'void'", "'while'", "'write'", "'for'", "'true'", "'false'", 
		"'ord'", "'chr'", "'len'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
		"'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", "'='", "'++'", "'--'", 
		"';'", "','", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'!'", 
		"'\"'", "'#'", "'$'", "'&'", "'?'", "'@'", "':'", "'''", "'\\n'", "'\\t'", 
		null, "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", 
		"VOID", "WHILE", "WRITE", "FOR", "TRUE", "FALSE", "ORD", "CHR", "LEN", 
		"SUM", "REST", "MULT", "DIV", "PORC", "IGIG", "DIF", "MAY", "MAY_IG", 
		"MEN", "MEN_IG", "AND", "OR", "IG", "INC", "DEC", "PyC", "COMA", "PUNT", 
		"PAR_IZQ", "PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", 
		"COM_DOB", "HASH", "DOLLAR", "AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", 
		"SALTO_LINEA", "TAB", "IDENT", "NUMBER_INTEGER_ZERO", "NUMBER_INTEGER", 
		"NUMBER_FLOAT", "STRING_CONST", "CHAR_CONST", "PRINTABLE_CHAR", "WS", 
		"LINE_COMMENT", "BLOCK_COMMENT"
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
			setState(42);
			match(CLASS);
			setState(43);
			match(IDENT);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << IDENT))) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(44);
					constDecl();
					}
					break;
				case IDENT:
					{
					setState(45);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(46);
					classDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(LLA_IZQ);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(53);
				methodDecl();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(LLA_DER);
			setState(60);
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
		public TerminalNode CHAR_CONST() { return getToken(MyParser.CHAR_CONST, 0); }
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
			setState(62);
			match(CONST);
			setState(63);
			type();
			setState(64);
			match(IDENT);
			setState(65);
			match(IG);
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << CHAR_CONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
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
			setState(69);
			type();
			setState(70);
			match(IDENT);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(71);
				match(COMA);
				setState(72);
				match(IDENT);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(80);
			match(CLASS);
			setState(81);
			match(IDENT);
			setState(82);
			match(LLA_IZQ);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(83);
				varDecl();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
	public static class MethodTypeDeclASTContext extends MethodDeclContext {
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public MethodTypeDeclASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodTypeDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodVoidDeclASTContext extends MethodDeclContext {
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		public MethodVoidDeclASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodVoidDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new MethodTypeDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				type();
				}
				setState(92);
				match(IDENT);
				setState(93);
				match(PAR_IZQ);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(94);
					formPars();
					}
				}

				setState(97);
				match(PAR_DER);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(98);
					varDecl();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				block();
				}
				break;
			case VOID:
				_localctx = new MethodVoidDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				match(VOID);
				}
				setState(107);
				match(IDENT);
				setState(108);
				match(PAR_IZQ);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(109);
					formPars();
					}
				}

				setState(112);
				match(PAR_DER);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(113);
					varDecl();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				block();
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
			setState(122);
			type();
			setState(123);
			match(IDENT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(124);
				match(COMA);
				setState(125);
				type();
				setState(126);
				match(IDENT);
				}
				}
				setState(132);
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
			setState(133);
			match(IDENT);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CORC_IZQ) {
				{
				setState(134);
				match(CORC_IZQ);
				setState(135);
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
	public static class StatementIncSTASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode INC() { return getToken(MyParser.INC, 0); }
		public StatementIncSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatementIncSTAST(this);
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
	public static class StatementIgSTASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode IG() { return getToken(MyParser.IG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementIgSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatementIgSTAST(this);
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
	public static class StatementMetSTASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public StatementMetSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatementMetSTAST(this);
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
	public static class StatementDecSTASTContext extends StatementContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PyC() { return getToken(MyParser.PyC, 0); }
		public TerminalNode DEC() { return getToken(MyParser.DEC, 0); }
		public StatementDecSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitStatementDecSTAST(this);
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
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new StatementIgSTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				designator();
				{
				setState(139);
				match(IG);
				setState(140);
				expr();
				}
				setState(142);
				match(PyC);
				}
				break;
			case 2:
				_localctx = new StatementMetSTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				designator();
				{
				setState(145);
				match(PAR_IZQ);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(146);
					actPars();
					}
				}

				setState(149);
				match(PAR_DER);
				}
				setState(151);
				match(PyC);
				}
				break;
			case 3:
				_localctx = new StatementIncSTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				designator();
				{
				setState(154);
				match(INC);
				}
				setState(155);
				match(PyC);
				}
				break;
			case 4:
				_localctx = new StatementDecSTASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				designator();
				{
				setState(158);
				match(DEC);
				}
				setState(159);
				match(PyC);
				}
				break;
			case 5:
				_localctx = new IfSTASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(IF);
				setState(162);
				match(PAR_IZQ);
				setState(163);
				condition();
				setState(164);
				match(PAR_DER);
				setState(165);
				statement();
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(166);
					match(ELSE);
					setState(167);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ForSTASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(FOR);
				setState(171);
				match(PAR_IZQ);
				setState(172);
				expr();
				setState(173);
				match(PyC);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(174);
					condition();
					}
				}

				setState(177);
				match(PyC);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
					{
					setState(178);
					statement();
					}
				}

				setState(181);
				match(PAR_DER);
				setState(182);
				statement();
				}
				break;
			case 7:
				_localctx = new WhileSTASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(WHILE);
				setState(185);
				match(PAR_IZQ);
				setState(186);
				condition();
				setState(187);
				match(PAR_DER);
				setState(188);
				statement();
				}
				break;
			case 8:
				_localctx = new BreakStASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(BREAK);
				setState(191);
				match(PyC);
				}
				break;
			case 9:
				_localctx = new ReturnSTASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(RETURN);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(193);
					expr();
					}
				}

				setState(196);
				match(PyC);
				}
				break;
			case 10:
				_localctx = new ReadSTATContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(197);
				match(READ);
				setState(198);
				match(PAR_IZQ);
				setState(199);
				designator();
				setState(200);
				match(PAR_DER);
				setState(201);
				match(PyC);
				}
				break;
			case 11:
				_localctx = new WriteSTASTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				match(WRITE);
				setState(204);
				match(PAR_IZQ);
				setState(205);
				expr();
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMA:
					{
					setState(206);
					match(COMA);
					setState(207);
					match(NUMBER_INTEGER);
					}
					break;
				case NUMBER_INTEGER_ZERO:
					{
					setState(208);
					match(NUMBER_INTEGER_ZERO);
					}
					break;
				case NUMBER_FLOAT:
					{
					setState(209);
					match(NUMBER_FLOAT);
					}
					break;
				case PAR_DER:
					break;
				default:
					break;
				}
				setState(212);
				match(PAR_DER);
				setState(213);
				match(PyC);
				}
				break;
			case 12:
				_localctx = new BlockSTASTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(215);
				block();
				}
				break;
			case 13:
				_localctx = new PycSTASTContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(216);
				match(PyC);
				}
				break;
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
			setState(219);
			match(LLA_IZQ);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
				{
				{
				setState(220);
				statement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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
			setState(228);
			expr();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(229);
				match(COMA);
				setState(230);
				expr();
				}
				}
				setState(235);
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
			setState(236);
			condTerm();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(237);
				match(OR);
				setState(238);
				condTerm();
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
			setState(244);
			condFact();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(245);
				match(AND);
				setState(246);
				condFact();
				}
				}
				setState(251);
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
			setState(252);
			expr();
			setState(253);
			relop();
			setState(254);
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
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REST) {
				{
				setState(256);
				match(REST);
				}
			}

			setState(259);
			term();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(260);
				addop();
				setState(261);
				term();
				}
				}
				setState(267);
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
			setState(268);
			factor();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PORC))) != 0)) {
				{
				{
				setState(269);
				mulop();
				setState(270);
				factor();
				}
				}
				setState(276);
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
	public static class SpfunctionFASTContext extends FactorContext {
		public Special_functionContext special_function() {
			return getRuleContext(Special_functionContext.class,0);
		}
		public TerminalNode PAR_IZQ() { return getToken(MyParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(MyParser.PAR_DER, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public SpfunctionFASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSpfunctionFAST(this);
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
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
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
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new FactorFASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				designator();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAR_IZQ) {
					{
					setState(278);
					match(PAR_IZQ);
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(279);
						actPars();
						}
					}

					setState(282);
					match(PAR_DER);
					}
				}

				}
				break;
			case ORD:
			case CHR:
			case LEN:
				_localctx = new SpfunctionFASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				special_function();
				{
				setState(286);
				match(PAR_IZQ);
				{
				setState(287);
				actPars();
				}
				setState(288);
				match(PAR_DER);
				}
				}
				break;
			case NUMBER_INTEGER:
				_localctx = new NumIntFASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(NUMBER_INTEGER);
				}
				break;
			case NUMBER_INTEGER_ZERO:
				_localctx = new NumIntZeroFASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(NUMBER_INTEGER_ZERO);
				}
				break;
			case NUMBER_FLOAT:
				_localctx = new NumberFloatFASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				match(NUMBER_FLOAT);
				}
				break;
			case STRING_CONST:
				_localctx = new StringFASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				match(STRING_CONST);
				}
				break;
			case CHAR_CONST:
				_localctx = new ChaeFASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				match(CHAR_CONST);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanFASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
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
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				match(NEW);
				setState(297);
				designator();
				}
				break;
			case PAR_IZQ:
				_localctx = new ExpresionFASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(298);
				match(PAR_IZQ);
				setState(299);
				expr();
				setState(300);
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

	public static class Special_functionContext extends ParserRuleContext {
		public Special_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_function; }
	 
		public Special_functionContext() { }
		public void copyFrom(Special_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpfunctionORDContext extends Special_functionContext {
		public TerminalNode ORD() { return getToken(MyParser.ORD, 0); }
		public SpfunctionORDContext(Special_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSpfunctionORD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpfunctionCHRContext extends Special_functionContext {
		public TerminalNode CHR() { return getToken(MyParser.CHR, 0); }
		public SpfunctionCHRContext(Special_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSpfunctionCHR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpfunctionLENContext extends Special_functionContext {
		public TerminalNode LEN() { return getToken(MyParser.LEN, 0); }
		public SpfunctionLENContext(Special_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitSpfunctionLEN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_functionContext special_function() throws RecognitionException {
		Special_functionContext _localctx = new Special_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_special_function);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORD:
				_localctx = new SpfunctionORDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(ORD);
				}
				break;
			case CHR:
				_localctx = new SpfunctionCHRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(CHR);
				}
				break;
			case LEN:
				_localctx = new SpfunctionLENContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(LEN);
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
		enterRule(_localctx, 34, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENT);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNT || _la==CORC_IZQ) {
				{
				setState(316);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUNT:
					{
					setState(310);
					match(PUNT);
					setState(311);
					match(IDENT);
					}
					break;
				case CORC_IZQ:
					{
					setState(312);
					match(CORC_IZQ);
					setState(313);
					expr();
					setState(314);
					match(CORC_DER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(320);
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
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	 
		public RelopContext() { }
		public void copyFrom(RelopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelopMenIgASTContext extends RelopContext {
		public TerminalNode MEN_IG() { return getToken(MyParser.MEN_IG, 0); }
		public RelopMenIgASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopMenIgAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopMenASTContext extends RelopContext {
		public TerminalNode MEN() { return getToken(MyParser.MEN, 0); }
		public RelopMenASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopMenAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopDifASTContext extends RelopContext {
		public TerminalNode DIF() { return getToken(MyParser.DIF, 0); }
		public RelopDifASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopDifAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopMayASTContext extends RelopContext {
		public TerminalNode MAY() { return getToken(MyParser.MAY, 0); }
		public RelopMayASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopMayAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopIgIgASTContext extends RelopContext {
		public TerminalNode IGIG() { return getToken(MyParser.IGIG, 0); }
		public RelopIgIgASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopIgIgAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelopMatIgASTContext extends RelopContext {
		public TerminalNode MAY_IG() { return getToken(MyParser.MAY_IG, 0); }
		public RelopMatIgASTContext(RelopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitRelopMatIgAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relop);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGIG:
				_localctx = new RelopIgIgASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(IGIG);
				}
				break;
			case DIF:
				_localctx = new RelopDifASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(DIF);
				}
				break;
			case MAY:
				_localctx = new RelopMayASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(MAY);
				}
				break;
			case MAY_IG:
				_localctx = new RelopMatIgASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(MAY_IG);
				}
				break;
			case MEN:
				_localctx = new RelopMenASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(MEN);
				}
				break;
			case MEN_IG:
				_localctx = new RelopMenIgASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				match(MEN_IG);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	 
		public AddopContext() { }
		public void copyFrom(AddopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddopRestASTContext extends AddopContext {
		public TerminalNode REST() { return getToken(MyParser.REST, 0); }
		public AddopRestASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAddopRestAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddopSumASTContext extends AddopContext {
		public TerminalNode SUM() { return getToken(MyParser.SUM, 0); }
		public AddopSumASTContext(AddopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitAddopSumAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_addop);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new AddopSumASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(SUM);
				}
				break;
			case REST:
				_localctx = new AddopRestASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(REST);
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	 
		public MulopContext() { }
		public void copyFrom(MulopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulopDivASTContext extends MulopContext {
		public TerminalNode DIV() { return getToken(MyParser.DIV, 0); }
		public MulopDivASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulopDivAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulopPorcASTContext extends MulopContext {
		public TerminalNode PORC() { return getToken(MyParser.PORC, 0); }
		public MulopPorcASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulopPorcAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulopMultASTContext extends MulopContext {
		public TerminalNode MULT() { return getToken(MyParser.MULT, 0); }
		public MulopMultASTContext(MulopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMulopMultAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mulop);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MulopMultASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new MulopDivASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(DIV);
				}
				break;
			case PORC:
				_localctx = new MulopPorcASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(PORC);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6b"+
		"\n\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6q\n\6"+
		"\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\5\6{\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00b2\n\t\3\t\3\t\5\t\u00b6\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d5\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00dc"+
		"\n\t\3\n\3\n\7\n\u00e0\n\n\f\n\16\n\u00e3\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13\u00ea\n\13\f\13\16\13\u00ed\13\13\3\f\3\f\3\f\7\f\u00f2\n\f\f\f"+
		"\16\f\u00f5\13\f\3\r\3\r\3\r\7\r\u00fa\n\r\f\r\16\r\u00fd\13\r\3\16\3"+
		"\16\3\16\3\16\3\17\5\17\u0104\n\17\3\17\3\17\3\17\3\17\7\17\u010a\n\17"+
		"\f\17\16\17\u010d\13\17\3\20\3\20\3\20\3\20\7\20\u0113\n\20\f\20\16\20"+
		"\u0116\13\20\3\21\3\21\3\21\5\21\u011b\n\21\3\21\5\21\u011e\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0131\n\21\3\22\3\22\3\22\5\22\u0136\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\7\23\u013f\n\23\f\23\16\23\u0142\13\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u014a\n\24\3\25\3\25\5\25\u014e\n\25\3\26"+
		"\3\26\3\26\5\26\u0153\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\4\4\29:==\3\2\17\20\2\u017e\2,\3\2\2\2\4@\3\2\2\2\6G\3"+
		"\2\2\2\bR\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u0087\3\2\2\2\20\u00db\3\2"+
		"\2\2\22\u00dd\3\2\2\2\24\u00e6\3\2\2\2\26\u00ee\3\2\2\2\30\u00f6\3\2\2"+
		"\2\32\u00fe\3\2\2\2\34\u0103\3\2\2\2\36\u010e\3\2\2\2 \u0130\3\2\2\2\""+
		"\u0135\3\2\2\2$\u0137\3\2\2\2&\u0149\3\2\2\2(\u014d\3\2\2\2*\u0152\3\2"+
		"\2\2,-\7\4\2\2-\63\78\2\2.\62\5\4\3\2/\62\5\6\4\2\60\62\5\b\5\2\61.\3"+
		"\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7+\2\2\679\5\n\6\28\67\3\2\2\29<"+
		"\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7,\2\2>?\7\2\2\3?\3"+
		"\3\2\2\2@A\7\5\2\2AB\5\16\b\2BC\78\2\2CD\7!\2\2DE\t\2\2\2EF\7$\2\2F\5"+
		"\3\2\2\2GH\5\16\b\2HM\78\2\2IJ\7%\2\2JL\78\2\2KI\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7$\2\2Q\7\3\2\2\2RS\7\4\2\2ST\7"+
		"8\2\2TX\7+\2\2UW\5\6\4\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2ZX\3\2\2\2[\\\7,\2\2\\\t\3\2\2\2]^\5\16\b\2^_\78\2\2_a\7\'\2\2`b\5"+
		"\f\7\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cg\7(\2\2df\5\6\4\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\22\n\2k{\3\2\2\2lm"+
		"\7\13\2\2mn\78\2\2np\7\'\2\2oq\5\f\7\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r"+
		"v\7(\2\2su\5\6\4\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2x"+
		"v\3\2\2\2y{\5\22\n\2z]\3\2\2\2zl\3\2\2\2{\13\3\2\2\2|}\5\16\b\2}\u0084"+
		"\78\2\2~\177\7%\2\2\177\u0080\5\16\b\2\u0080\u0081\78\2\2\u0081\u0083"+
		"\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008a\78\2\2"+
		"\u0088\u0089\7)\2\2\u0089\u008b\7*\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\5$\23\2\u008d\u008e\7!\2\2\u008e"+
		"\u008f\5\34\17\2\u008f\u0090\3\2\2\2\u0090\u0091\7$\2\2\u0091\u00dc\3"+
		"\2\2\2\u0092\u0093\5$\23\2\u0093\u0095\7\'\2\2\u0094\u0096\5\24\13\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7("+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7$\2\2\u009a\u00dc\3\2\2\2\u009b"+
		"\u009c\5$\23\2\u009c\u009d\7\"\2\2\u009d\u009e\7$\2\2\u009e\u00dc\3\2"+
		"\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7$\2\2\u00a2\u00dc"+
		"\3\2\2\2\u00a3\u00a4\7\7\2\2\u00a4\u00a5\7\'\2\2\u00a5\u00a6\5\26\f\2"+
		"\u00a6\u00a7\7(\2\2\u00a7\u00aa\5\20\t\2\u00a8\u00a9\7\6\2\2\u00a9\u00ab"+
		"\5\20\t\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00dc\3\2\2\2"+
		"\u00ac\u00ad\7\16\2\2\u00ad\u00ae\7\'\2\2\u00ae\u00af\5\34\17\2\u00af"+
		"\u00b1\7$\2\2\u00b0\u00b2\5\26\f\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\7$\2\2\u00b4\u00b6\5\20\t\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7("+
		"\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00dc\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb"+
		"\u00bc\7\'\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be\7(\2\2\u00be\u00bf\5\20"+
		"\t\2\u00bf\u00dc\3\2\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00dc\7$\2\2\u00c2"+
		"\u00c4\7\n\2\2\u00c3\u00c5\5\34\17\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00dc\7$\2\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00c9\7\'\2\2\u00c9\u00ca\5$\23\2\u00ca\u00cb\7(\2\2\u00cb\u00cc\7$\2"+
		"\2\u00cc\u00dc\3\2\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\7\'\2\2\u00cf\u00d4"+
		"\5\34\17\2\u00d0\u00d1\7%\2\2\u00d1\u00d5\7:\2\2\u00d2\u00d5\79\2\2\u00d3"+
		"\u00d5\7;\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7(\2\2\u00d7"+
		"\u00d8\7$\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00dc\5\22\n\2\u00da\u00dc\7$"+
		"\2\2\u00db\u008c\3\2\2\2\u00db\u0092\3\2\2\2\u00db\u009b\3\2\2\2\u00db"+
		"\u009f\3\2\2\2\u00db\u00a3\3\2\2\2\u00db\u00ac\3\2\2\2\u00db\u00ba\3\2"+
		"\2\2\u00db\u00c0\3\2\2\2\u00db\u00c2\3\2\2\2\u00db\u00c7\3\2\2\2\u00db"+
		"\u00cd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\21\3\2\2"+
		"\2\u00dd\u00e1\7+\2\2\u00de\u00e0\5\20\t\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5\23\3\2\2\2\u00e6\u00eb\5\34\17"+
		"\2\u00e7\u00e8\7%\2\2\u00e8\u00ea\5\34\17\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\25\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\5\30\r\2\u00ef\u00f0\7 \2\2\u00f0\u00f2"+
		"\5\30\r\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\27\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fb"+
		"\5\32\16\2\u00f7\u00f8\7\37\2\2\u00f8\u00fa\5\32\16\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\31\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\5&\24"+
		"\2\u0100\u0101\5\34\17\2\u0101\33\3\2\2\2\u0102\u0104\7\25\2\2\u0103\u0102"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010b\5\36\20\2"+
		"\u0106\u0107\5(\25\2\u0107\u0108\5\36\20\2\u0108\u010a\3\2\2\2\u0109\u0106"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\35\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0114\5 \21\2\u010f\u0110\5*\26"+
		"\2\u0110\u0111\5 \21\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\37\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u011d\5$\23\2\u0118\u011a\7\'\2\2\u0119\u011b\5\24"+
		"\13\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011e\7(\2\2\u011d\u0118\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0131\3\2"+
		"\2\2\u011f\u0120\5\"\22\2\u0120\u0121\7\'\2\2\u0121\u0122\5\24\13\2\u0122"+
		"\u0123\7(\2\2\u0123\u0131\3\2\2\2\u0124\u0131\7:\2\2\u0125\u0131\79\2"+
		"\2\u0126\u0131\7;\2\2\u0127\u0131\7<\2\2\u0128\u0131\7=\2\2\u0129\u0131"+
		"\t\3\2\2\u012a\u012b\7\b\2\2\u012b\u0131\5$\23\2\u012c\u012d\7\'\2\2\u012d"+
		"\u012e\5\34\17\2\u012e\u012f\7(\2\2\u012f\u0131\3\2\2\2\u0130\u0117\3"+
		"\2\2\2\u0130\u011f\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u0125\3\2\2\2\u0130"+
		"\u0126\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2"+
		"\2\2\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0131!\3\2\2\2\u0132\u0136"+
		"\7\21\2\2\u0133\u0136\7\22\2\2\u0134\u0136\7\23\2\2\u0135\u0132\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136#\3\2\2\2\u0137\u0140"+
		"\78\2\2\u0138\u0139\7&\2\2\u0139\u013f\78\2\2\u013a\u013b\7)\2\2\u013b"+
		"\u013c\5\34\17\2\u013c\u013d\7*\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3"+
		"\2\2\2\u013e\u013a\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141%\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u014a\7\31\2\2"+
		"\u0144\u014a\7\32\2\2\u0145\u014a\7\33\2\2\u0146\u014a\7\34\2\2\u0147"+
		"\u014a\7\35\2\2\u0148\u014a\7\36\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3"+
		"\2\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\'\3\2\2\2\u014b\u014e\7\24\2\2\u014c\u014e\7\25\2"+
		"\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e)\3\2\2\2\u014f\u0153"+
		"\7\26\2\2\u0150\u0153\7\27\2\2\u0151\u0153\7\30\2\2\u0152\u014f\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153+\3\2\2\2%\61\63:MXag"+
		"pvz\u0084\u008a\u0095\u00aa\u00b1\u00b5\u00c4\u00d4\u00db\u00e1\u00eb"+
		"\u00f3\u00fb\u0103\u010b\u0114\u011a\u011d\u0130\u0135\u013e\u0140\u0149"+
		"\u014d\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}