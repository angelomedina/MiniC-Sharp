// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/Avance II/MiniC-Sharp/src/Antlr\MyParser.g4 by ANTLR 4.7
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
		RULE_program = 0, RULE_declaration = 1, RULE_constDecl = 2, RULE_valueTypeConst = 3, 
		RULE_varDecl = 4, RULE_classDecl = 5, RULE_methodDecl = 6, RULE_optionMethodDecl = 7, 
		RULE_formPars = 8, RULE_type = 9, RULE_statement = 10, RULE_writeType = 11, 
		RULE_block = 12, RULE_actPars = 13, RULE_condition = 14, RULE_condTerm = 15, 
		RULE_condFact = 16, RULE_expr = 17, RULE_term = 18, RULE_factor = 19, 
		RULE_booleanValue = 20, RULE_special_function = 21, RULE_designator = 22, 
		RULE_designatorExp = 23, RULE_relop = 24, RULE_addop = 25, RULE_mulop = 26;
	public static final String[] ruleNames = {
		"program", "declaration", "constDecl", "valueTypeConst", "varDecl", "classDecl", 
		"methodDecl", "optionMethodDecl", "formPars", "type", "statement", "writeType", 
		"block", "actPars", "condition", "condTerm", "condFact", "expr", "term", 
		"factor", "booleanValue", "special_function", "designator", "designatorExp", 
		"relop", "addop", "mulop"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(54);
			match(CLASS);
			setState(55);
			match(IDENT);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << IDENT))) != 0)) {
				{
				{
				setState(56);
				declaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(LLA_IZQ);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==IDENT) {
				{
				{
				setState(63);
				methodDecl();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(LLA_DER);
			setState(70);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramClassASTContext extends DeclarationContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ProgramClassASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgramClassAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramVarASTContext extends DeclarationContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ProgramVarASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgramVarAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgramConstASTContext extends DeclarationContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public ProgramConstASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitProgramConstAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ProgramConstASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				constDecl();
				}
				break;
			case IDENT:
				_localctx = new ProgramVarASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				varDecl();
				}
				break;
			case CLASS:
				_localctx = new ProgramClassASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				classDecl();
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
		public ValueTypeConstContext valueTypeConst() {
			return getRuleContext(ValueTypeConstContext.class,0);
		}
		public ConstDeclASTContext(ConstDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		try {
			_localctx = new ConstDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CONST);
			setState(78);
			type();
			setState(79);
			match(IDENT);
			setState(80);
			match(IG);
			{
			setState(81);
			valueTypeConst();
			}
			setState(82);
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

	public static class ValueTypeConstContext extends ParserRuleContext {
		public ValueTypeConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueTypeConst; }
	 
		public ValueTypeConstContext() { }
		public void copyFrom(ValueTypeConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstCharDeclASTContext extends ValueTypeConstContext {
		public TerminalNode CHAR_CONST() { return getToken(MyParser.CHAR_CONST, 0); }
		public ConstCharDeclASTContext(ValueTypeConstContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstCharDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstNumberIntDeclASTContext extends ValueTypeConstContext {
		public TerminalNode NUMBER_INTEGER() { return getToken(MyParser.NUMBER_INTEGER, 0); }
		public ConstNumberIntDeclASTContext(ValueTypeConstContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstNumberIntDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstNumberIntZDeclASTContext extends ValueTypeConstContext {
		public TerminalNode NUMBER_INTEGER_ZERO() { return getToken(MyParser.NUMBER_INTEGER_ZERO, 0); }
		public ConstNumberIntZDeclASTContext(ValueTypeConstContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitConstNumberIntZDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeConstContext valueTypeConst() throws RecognitionException {
		ValueTypeConstContext _localctx = new ValueTypeConstContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valueTypeConst);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_INTEGER:
				_localctx = new ConstNumberIntDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(NUMBER_INTEGER);
				}
				break;
			case NUMBER_INTEGER_ZERO:
				_localctx = new ConstNumberIntZDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(NUMBER_INTEGER_ZERO);
				}
				break;
			case CHAR_CONST:
				_localctx = new ConstCharDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(CHAR_CONST);
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
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			_localctx = new VarDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			match(IDENT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(91);
				match(COMA);
				setState(92);
				match(IDENT);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CLASS);
			setState(101);
			match(IDENT);
			setState(102);
			match(LLA_IZQ);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(103);
				varDecl();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		public OptionMethodDeclContext optionMethodDecl() {
			return getRuleContext(OptionMethodDeclContext.class,0);
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
		public MethodDeclASTContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			_localctx = new MethodDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			optionMethodDecl();
			}
			setState(112);
			match(IDENT);
			setState(113);
			match(PAR_IZQ);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(114);
				formPars();
				}
			}

			setState(117);
			match(PAR_DER);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(118);
				varDecl();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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

	public static class OptionMethodDeclContext extends ParserRuleContext {
		public OptionMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionMethodDecl; }
	 
		public OptionMethodDeclContext() { }
		public void copyFrom(OptionMethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodTypeDeclASTContext extends OptionMethodDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodTypeDeclASTContext(OptionMethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodTypeDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodVoidDeclASTContext extends OptionMethodDeclContext {
		public TerminalNode VOID() { return getToken(MyParser.VOID, 0); }
		public MethodVoidDeclASTContext(OptionMethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitMethodVoidDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionMethodDeclContext optionMethodDecl() throws RecognitionException {
		OptionMethodDeclContext _localctx = new OptionMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optionMethodDecl);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new MethodTypeDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				type();
				}
				break;
			case VOID:
				_localctx = new MethodVoidDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(VOID);
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
		enterRule(_localctx, 16, RULE_formPars);
		int _la;
		try {
			_localctx = new FormParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			type();
			setState(131);
			match(IDENT);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(132);
				match(COMA);
				setState(133);
				type();
				setState(134);
				match(IDENT);
				}
				}
				setState(140);
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
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			_localctx = new TypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CORC_IZQ) {
				{
				setState(142);
				match(CORC_IZQ);
				setState(143);
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
		public TerminalNode LLA_IZQ() { return getToken(MyParser.LLA_IZQ, 0); }
		public TerminalNode LLA_DER() { return getToken(MyParser.LLA_DER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		public WriteTypeContext writeType() {
			return getRuleContext(WriteTypeContext.class,0);
		}
		public WriteSTASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWriteSTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new StatementIgSTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				designator();
				{
				setState(147);
				match(IG);
				setState(148);
				expr();
				}
				setState(150);
				match(PyC);
				}
				break;
			case 2:
				_localctx = new StatementMetSTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				designator();
				{
				setState(153);
				match(PAR_IZQ);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(154);
					actPars();
					}
				}

				setState(157);
				match(PAR_DER);
				}
				setState(159);
				match(PyC);
				}
				break;
			case 3:
				_localctx = new StatementIncSTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				designator();
				{
				setState(162);
				match(INC);
				}
				setState(163);
				match(PyC);
				}
				break;
			case 4:
				_localctx = new StatementDecSTASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				designator();
				{
				setState(166);
				match(DEC);
				}
				setState(167);
				match(PyC);
				}
				break;
			case 5:
				_localctx = new IfSTASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(IF);
				setState(170);
				match(PAR_IZQ);
				setState(171);
				condition();
				setState(172);
				match(PAR_DER);
				setState(173);
				statement();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(174);
					match(ELSE);
					setState(175);
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
				setState(178);
				match(FOR);
				setState(179);
				match(PAR_IZQ);
				setState(180);
				expr();
				setState(181);
				match(PyC);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(182);
					condition();
					}
				}

				setState(185);
				match(PyC);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
					{
					setState(186);
					statement();
					}
				}

				setState(189);
				match(PAR_DER);
				setState(190);
				statement();
				}
				break;
			case 7:
				_localctx = new WhileSTASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				match(WHILE);
				setState(193);
				match(PAR_IZQ);
				setState(194);
				condition();
				setState(195);
				match(PAR_DER);
				setState(196);
				statement();
				}
				break;
			case 8:
				_localctx = new BreakStASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				match(BREAK);
				setState(199);
				match(PyC);
				}
				break;
			case 9:
				_localctx = new ReturnSTASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				match(RETURN);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
					{
					setState(201);
					expr();
					}
				}

				setState(204);
				match(PyC);
				}
				break;
			case 10:
				_localctx = new ReadSTATContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				match(READ);
				setState(206);
				match(PAR_IZQ);
				setState(207);
				designator();
				setState(208);
				match(PAR_DER);
				setState(209);
				match(PyC);
				}
				break;
			case 11:
				_localctx = new WriteSTASTContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(211);
				match(WRITE);
				setState(212);
				match(PAR_IZQ);
				setState(213);
				expr();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMA) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_FLOAT))) != 0)) {
					{
					setState(214);
					writeType();
					}
				}

				setState(217);
				match(PAR_DER);
				setState(218);
				match(PyC);
				}
				break;
			case 12:
				_localctx = new BlockSTASTContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(220);
				match(LLA_IZQ);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
					{
					{
					setState(221);
					statement();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(LLA_DER);
				}
				break;
			case 13:
				_localctx = new PycSTASTContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
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

	public static class WriteTypeContext extends ParserRuleContext {
		public WriteTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeType; }
	 
		public WriteTypeContext() { }
		public void copyFrom(WriteTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteTypeNumFloatSTASTContext extends WriteTypeContext {
		public TerminalNode NUMBER_FLOAT() { return getToken(MyParser.NUMBER_FLOAT, 0); }
		public WriteTypeNumFloatSTASTContext(WriteTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWriteTypeNumFloatSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteTypeNumIntZSTASTContext extends WriteTypeContext {
		public TerminalNode NUMBER_INTEGER_ZERO() { return getToken(MyParser.NUMBER_INTEGER_ZERO, 0); }
		public WriteTypeNumIntZSTASTContext(WriteTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWriteTypeNumIntZSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteTypeNumIntSTASTContext extends WriteTypeContext {
		public TerminalNode COMA() { return getToken(MyParser.COMA, 0); }
		public TerminalNode NUMBER_INTEGER() { return getToken(MyParser.NUMBER_INTEGER, 0); }
		public WriteTypeNumIntSTASTContext(WriteTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitWriteTypeNumIntSTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteTypeContext writeType() throws RecognitionException {
		WriteTypeContext _localctx = new WriteTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writeType);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				_localctx = new WriteTypeNumIntSTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(COMA);
				setState(232);
				match(NUMBER_INTEGER);
				}
				break;
			case NUMBER_INTEGER_ZERO:
				_localctx = new WriteTypeNumIntZSTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(NUMBER_INTEGER_ZERO);
				}
				break;
			case NUMBER_FLOAT:
				_localctx = new WriteTypeNumFloatSTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(NUMBER_FLOAT);
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
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LLA_IZQ);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << READ) | (1L << RETURN) | (1L << WHILE) | (1L << WRITE) | (1L << FOR) | (1L << PyC) | (1L << LLA_IZQ) | (1L << IDENT))) != 0)) {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		enterRule(_localctx, 26, RULE_actPars);
		int _la;
		try {
			_localctx = new ActParsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			expr();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(247);
				match(COMA);
				setState(248);
				expr();
				}
				}
				setState(253);
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
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			_localctx = new ConditionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			condTerm();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(255);
				match(OR);
				setState(256);
				condTerm();
				}
				}
				setState(261);
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
		enterRule(_localctx, 30, RULE_condTerm);
		int _la;
		try {
			_localctx = new CondTermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			condFact();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(263);
				match(AND);
				setState(264);
				condFact();
				}
				}
				setState(269);
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
		enterRule(_localctx, 32, RULE_condFact);
		try {
			_localctx = new CondFactASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expr();
			setState(271);
			relop();
			setState(272);
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
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			_localctx = new ExprASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REST) {
				{
				setState(274);
				match(REST);
				}
			}

			setState(277);
			term();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(278);
				addop();
				setState(279);
				term();
				}
				}
				setState(285);
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			factor();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << PORC))) != 0)) {
				{
				{
				setState(287);
				mulop();
				setState(288);
				factor();
				}
				}
				setState(294);
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
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_factor);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new FactorFASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				designator();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PAR_IZQ) {
					{
					setState(296);
					match(PAR_IZQ);
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << ORD) | (1L << CHR) | (1L << LEN) | (1L << REST) | (1L << PAR_IZQ) | (1L << IDENT) | (1L << NUMBER_INTEGER_ZERO) | (1L << NUMBER_INTEGER) | (1L << NUMBER_FLOAT) | (1L << STRING_CONST) | (1L << CHAR_CONST))) != 0)) {
						{
						setState(297);
						actPars();
						}
					}

					setState(300);
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
				setState(303);
				special_function();
				{
				setState(304);
				match(PAR_IZQ);
				{
				setState(305);
				actPars();
				}
				setState(306);
				match(PAR_DER);
				}
				}
				break;
			case NUMBER_INTEGER:
				_localctx = new NumIntFASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(NUMBER_INTEGER);
				}
				break;
			case NUMBER_INTEGER_ZERO:
				_localctx = new NumIntZeroFASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(NUMBER_INTEGER_ZERO);
				}
				break;
			case NUMBER_FLOAT:
				_localctx = new NumberFloatFASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(NUMBER_FLOAT);
				}
				break;
			case STRING_CONST:
				_localctx = new StringFASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				match(STRING_CONST);
				}
				break;
			case CHAR_CONST:
				_localctx = new ChaeFASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				match(CHAR_CONST);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanFASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(313);
				booleanValue();
				}
				}
				break;
			case NEW:
				_localctx = new NewFASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(314);
				match(NEW);
				setState(315);
				designator();
				}
				break;
			case PAR_IZQ:
				_localctx = new ExpresionFASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(316);
				match(PAR_IZQ);
				setState(317);
				expr();
				setState(318);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
	 
		public BooleanValueContext() { }
		public void copyFrom(BooleanValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanTrueFASTContext extends BooleanValueContext {
		public TerminalNode TRUE() { return getToken(MyParser.TRUE, 0); }
		public BooleanTrueFASTContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBooleanTrueFAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanFalseFASTContext extends BooleanValueContext {
		public TerminalNode FALSE() { return getToken(MyParser.FALSE, 0); }
		public BooleanFalseFASTContext(BooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitBooleanFalseFAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanValue);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new BooleanTrueFASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new BooleanFalseFASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(FALSE);
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
		enterRule(_localctx, 42, RULE_special_function);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORD:
				_localctx = new SpfunctionORDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(ORD);
				}
				break;
			case CHR:
				_localctx = new SpfunctionCHRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(CHR);
				}
				break;
			case LEN:
				_localctx = new SpfunctionLENContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
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
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public List<DesignatorExpContext> designatorExp() {
			return getRuleContexts(DesignatorExpContext.class);
		}
		public DesignatorExpContext designatorExp(int i) {
			return getRuleContext(DesignatorExpContext.class,i);
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
		enterRule(_localctx, 44, RULE_designator);
		int _la;
		try {
			_localctx = new DesignatorASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(IDENT);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNT || _la==CORC_IZQ) {
				{
				{
				setState(332);
				designatorExp();
				}
				}
				setState(337);
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

	public static class DesignatorExpContext extends ParserRuleContext {
		public DesignatorExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorExp; }
	 
		public DesignatorExpContext() { }
		public void copyFrom(DesignatorExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesignatorCorcsASTContext extends DesignatorExpContext {
		public TerminalNode CORC_IZQ() { return getToken(MyParser.CORC_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORC_DER() { return getToken(MyParser.CORC_DER, 0); }
		public DesignatorCorcsASTContext(DesignatorExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDesignatorCorcsAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesignatorPuntIdASTContext extends DesignatorExpContext {
		public TerminalNode PUNT() { return getToken(MyParser.PUNT, 0); }
		public TerminalNode IDENT() { return getToken(MyParser.IDENT, 0); }
		public DesignatorPuntIdASTContext(DesignatorExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyParserVisitor ) return ((MyParserVisitor<? extends T>)visitor).visitDesignatorPuntIdAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorExpContext designatorExp() throws RecognitionException {
		DesignatorExpContext _localctx = new DesignatorExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_designatorExp);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNT:
				_localctx = new DesignatorPuntIdASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(PUNT);
				setState(339);
				match(IDENT);
				}
				break;
			case CORC_IZQ:
				_localctx = new DesignatorCorcsASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(CORC_IZQ);
				setState(341);
				expr();
				setState(342);
				match(CORC_DER);
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
		enterRule(_localctx, 48, RULE_relop);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGIG:
				_localctx = new RelopIgIgASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(IGIG);
				}
				break;
			case DIF:
				_localctx = new RelopDifASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(DIF);
				}
				break;
			case MAY:
				_localctx = new RelopMayASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(MAY);
				}
				break;
			case MAY_IG:
				_localctx = new RelopMatIgASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(MAY_IG);
				}
				break;
			case MEN:
				_localctx = new RelopMenASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(MEN);
				}
				break;
			case MEN_IG:
				_localctx = new RelopMenIgASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
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
		enterRule(_localctx, 50, RULE_addop);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new AddopSumASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(SUM);
				}
				break;
			case REST:
				_localctx = new AddopRestASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
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
		enterRule(_localctx, 52, RULE_mulop);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MulopMultASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new MulopDivASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(DIV);
				}
				break;
			case PORC:
				_localctx = new MulopPorcASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3N\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\7\6`\n\6\f\6"+
		"\16\6c\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7k\n\7\f\7\16\7n\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\5\bv\n\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\t\3"+
		"\t\5\t\u0083\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008b\n\n\f\n\16\n\u008e"+
		"\13\n\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u009e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ba\n\f"+
		"\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00cd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00da"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e1\n\f\f\f\16\f\u00e4\13\f\3\f\3\f\5\f"+
		"\u00e8\n\f\3\r\3\r\3\r\3\r\5\r\u00ee\n\r\3\16\3\16\7\16\u00f2\n\16\f\16"+
		"\16\16\u00f5\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00fc\n\17\f\17\16\17"+
		"\u00ff\13\17\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107\13\20\3\21"+
		"\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\3\22\3\22\3\22\3\22"+
		"\3\23\5\23\u0116\n\23\3\23\3\23\3\23\3\23\7\23\u011c\n\23\f\23\16\23\u011f"+
		"\13\23\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128\13\24\3\25"+
		"\3\25\3\25\5\25\u012d\n\25\3\25\5\25\u0130\n\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0143"+
		"\n\25\3\26\3\26\5\26\u0147\n\26\3\27\3\27\3\27\5\27\u014c\n\27\3\30\3"+
		"\30\7\30\u0150\n\30\f\30\16\30\u0153\13\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u015b\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0163\n\32\3\33"+
		"\3\33\5\33\u0167\n\33\3\34\3\34\3\34\5\34\u016c\n\34\3\34\2\2\35\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u0193\28"+
		"\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\ff\3\2\2\2\16q\3"+
		"\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u008f\3\2\2\2\26\u00e7\3\2"+
		"\2\2\30\u00ed\3\2\2\2\32\u00ef\3\2\2\2\34\u00f8\3\2\2\2\36\u0100\3\2\2"+
		"\2 \u0108\3\2\2\2\"\u0110\3\2\2\2$\u0115\3\2\2\2&\u0120\3\2\2\2(\u0142"+
		"\3\2\2\2*\u0146\3\2\2\2,\u014b\3\2\2\2.\u014d\3\2\2\2\60\u015a\3\2\2\2"+
		"\62\u0162\3\2\2\2\64\u0166\3\2\2\2\66\u016b\3\2\2\289\7\4\2\29=\78\2\2"+
		":<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2"+
		"@D\7+\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2"+
		"FD\3\2\2\2GH\7,\2\2HI\7\2\2\3I\3\3\2\2\2JN\5\6\4\2KN\5\n\6\2LN\5\f\7\2"+
		"MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\7\5\2\2PQ\5\24\13\2QR\78\2"+
		"\2RS\7!\2\2ST\5\b\5\2TU\7$\2\2U\7\3\2\2\2VZ\7:\2\2WZ\79\2\2XZ\7=\2\2Y"+
		"V\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\t\3\2\2\2[\\\5\24\13\2\\a\78\2\2]^\7%\2"+
		"\2^`\78\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2"+
		"\2de\7$\2\2e\13\3\2\2\2fg\7\4\2\2gh\78\2\2hl\7+\2\2ik\5\n\6\2ji\3\2\2"+
		"\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2p\r\3\2\2"+
		"\2qr\5\20\t\2rs\78\2\2su\7\'\2\2tv\5\22\n\2ut\3\2\2\2uv\3\2\2\2vw\3\2"+
		"\2\2w{\7(\2\2xz\5\n\6\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2"+
		"\2\2}{\3\2\2\2~\177\5\32\16\2\177\17\3\2\2\2\u0080\u0083\5\24\13\2\u0081"+
		"\u0083\7\13\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\21\3\2\2"+
		"\2\u0084\u0085\5\24\13\2\u0085\u008c\78\2\2\u0086\u0087\7%\2\2\u0087\u0088"+
		"\5\24\13\2\u0088\u0089\78\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\23"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\78\2\2\u0090\u0091\7)\2\2\u0091"+
		"\u0093\7*\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2\2"+
		"\u0094\u0095\5.\30\2\u0095\u0096\7!\2\2\u0096\u0097\5$\23\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0099\7$\2\2\u0099\u00e8\3\2\2\2\u009a\u009b\5.\30\2\u009b"+
		"\u009d\7\'\2\2\u009c\u009e\5\34\17\2\u009d\u009c\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\7$\2\2\u00a2\u00e8\3\2\2\2\u00a3\u00a4\5.\30\2\u00a4\u00a5\7\""+
		"\2\2\u00a5\u00a6\7$\2\2\u00a6\u00e8\3\2\2\2\u00a7\u00a8\5.\30\2\u00a8"+
		"\u00a9\7#\2\2\u00a9\u00aa\7$\2\2\u00aa\u00e8\3\2\2\2\u00ab\u00ac\7\7\2"+
		"\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7(\2\2\u00af"+
		"\u00b2\5\26\f\2\u00b0\u00b1\7\6\2\2\u00b1\u00b3\5\26\f\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00e8\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5"+
		"\u00b6\7\'\2\2\u00b6\u00b7\5$\23\2\u00b7\u00b9\7$\2\2\u00b8\u00ba\5\36"+
		"\20\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\7$\2\2\u00bc\u00be\5\26\f\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\u00e8\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\7\'\2\2\u00c4\u00c5\5\36"+
		"\20\2\u00c5\u00c6\7(\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00e8\3\2\2\2\u00c8"+
		"\u00c9\7\3\2\2\u00c9\u00e8\7$\2\2\u00ca\u00cc\7\n\2\2\u00cb\u00cd\5$\23"+
		"\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00e8"+
		"\7$\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00d1\7\'\2\2\u00d1\u00d2\5.\30\2\u00d2"+
		"\u00d3\7(\2\2\u00d3\u00d4\7$\2\2\u00d4\u00e8\3\2\2\2\u00d5\u00d6\7\r\2"+
		"\2\u00d6\u00d7\7\'\2\2\u00d7\u00d9\5$\23\2\u00d8\u00da\5\30\r\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7("+
		"\2\2\u00dc\u00dd\7$\2\2\u00dd\u00e8\3\2\2\2\u00de\u00e2\7+\2\2\u00df\u00e1"+
		"\5\26\f\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8"+
		"\7,\2\2\u00e6\u00e8\7$\2\2\u00e7\u0094\3\2\2\2\u00e7\u009a\3\2\2\2\u00e7"+
		"\u00a3\3\2\2\2\u00e7\u00a7\3\2\2\2\u00e7\u00ab\3\2\2\2\u00e7\u00b4\3\2"+
		"\2\2\u00e7\u00c2\3\2\2\2\u00e7\u00c8\3\2\2\2\u00e7\u00ca\3\2\2\2\u00e7"+
		"\u00cf\3\2\2\2\u00e7\u00d5\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8\27\3\2\2\2\u00e9\u00ea\7%\2\2\u00ea\u00ee\7:\2\2\u00eb\u00ee"+
		"\79\2\2\u00ec\u00ee\7;\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00f3\7+\2\2\u00f0\u00f2\5\26\f"+
		"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7"+
		"\33\3\2\2\2\u00f8\u00fd\5$\23\2\u00f9\u00fa\7%\2\2\u00fa\u00fc\5$\23\2"+
		"\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\35\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5 \21\2\u0101"+
		"\u0102\7 \2\2\u0102\u0104\5 \21\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\37\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010d\5\"\22\2\u0109\u010a\7\37\2\2\u010a\u010c\5\"\22"+
		"\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e!\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5$\23\2\u0111"+
		"\u0112\5\62\32\2\u0112\u0113\5$\23\2\u0113#\3\2\2\2\u0114\u0116\7\25\2"+
		"\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011d"+
		"\5&\24\2\u0118\u0119\5\64\33\2\u0119\u011a\5&\24\2\u011a\u011c\3\2\2\2"+
		"\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e%\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0126\5(\25\2\u0121"+
		"\u0122\5\66\34\2\u0122\u0123\5(\25\2\u0123\u0125\3\2\2\2\u0124\u0121\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\'\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012f\5.\30\2\u012a\u012c\7\'\2\2"+
		"\u012b\u012d\5\34\17\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u0130\7(\2\2\u012f\u012a\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0143\3\2\2\2\u0131\u0132\5,\27\2\u0132\u0133\7\'\2\2\u0133\u0134\5\34"+
		"\17\2\u0134\u0135\7(\2\2\u0135\u0143\3\2\2\2\u0136\u0143\7:\2\2\u0137"+
		"\u0143\79\2\2\u0138\u0143\7;\2\2\u0139\u0143\7<\2\2\u013a\u0143\7=\2\2"+
		"\u013b\u0143\5*\26\2\u013c\u013d\7\b\2\2\u013d\u0143\5.\30\2\u013e\u013f"+
		"\7\'\2\2\u013f\u0140\5$\23\2\u0140\u0141\7(\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0129\3\2\2\2\u0142\u0131\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0137\3\2"+
		"\2\2\u0142\u0138\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013a\3\2\2\2\u0142"+
		"\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013e\3\2\2\2\u0143)\3\2\2\2"+
		"\u0144\u0147\7\17\2\2\u0145\u0147\7\20\2\2\u0146\u0144\3\2\2\2\u0146\u0145"+
		"\3\2\2\2\u0147+\3\2\2\2\u0148\u014c\7\21\2\2\u0149\u014c\7\22\2\2\u014a"+
		"\u014c\7\23\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3"+
		"\2\2\2\u014c-\3\2\2\2\u014d\u0151\78\2\2\u014e\u0150\5\60\31\2\u014f\u014e"+
		"\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"/\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7&\2\2\u0155\u015b\78\2\2\u0156"+
		"\u0157\7)\2\2\u0157\u0158\5$\23\2\u0158\u0159\7*\2\2\u0159\u015b\3\2\2"+
		"\2\u015a\u0154\3\2\2\2\u015a\u0156\3\2\2\2\u015b\61\3\2\2\2\u015c\u0163"+
		"\7\31\2\2\u015d\u0163\7\32\2\2\u015e\u0163\7\33\2\2\u015f\u0163\7\34\2"+
		"\2\u0160\u0163\7\35\2\2\u0161\u0163\7\36\2\2\u0162\u015c\3\2\2\2\u0162"+
		"\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0161\3\2\2\2\u0163\63\3\2\2\2\u0164\u0167\7\24\2\2\u0165\u0167"+
		"\7\25\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\65\3\2\2\2\u0168"+
		"\u016c\7\26\2\2\u0169\u016c\7\27\2\2\u016a\u016c\7\30\2\2\u016b\u0168"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c\67\3\2\2\2\'=D"+
		"MYalu{\u0082\u008c\u0092\u009d\u00b2\u00b9\u00bd\u00cc\u00d9\u00e2\u00e7"+
		"\u00ed\u00f3\u00fd\u0105\u010d\u0115\u011d\u0126\u012c\u012f\u0142\u0146"+
		"\u014b\u0151\u015a\u0162\u0166\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}