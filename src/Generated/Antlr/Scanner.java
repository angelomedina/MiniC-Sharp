// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/MiniC-Sharp/src/Antlr\Scanner.g4 by ANTLR 4.7
package Antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, CLASS=2, CONST=3, ELSE=4, IF=5, NEW=6, READ=7, RETURN=8, VOID=9, 
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, INT=15, CHAR=16, FLOAT=17, 
		BOOL=18, STRING=19, LIST=20, SUM=21, REST=22, MULT=23, DIV=24, PORC=25, 
		IGIG=26, DIF=27, MAY=28, MAY_IG=29, MEN=30, MEN_IG=31, AND=32, OR=33, 
		IG=34, INC=35, DEC=36, PyC=37, COMA=38, PUNT=39, PAR_IZQ=40, PAR_DER=41, 
		CORC_IZQ=42, CORC_DER=43, LLA_IZQ=44, LLA_DER=45, ADM=46, COM_DOB=47, 
		HASH=48, DOLLAR=49, AMP=50, PREG=51, ARRB=52, DOS_PU=53, IDENT=54, NUMBER=55, 
		CHAR_CONST=56, PRINTABLE_CHAR=57, WS=58, LINE_COMMENT=59, BLOCK_COMMENT=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", "VOID", 
		"WHILE", "WRITE", "FOR", "TRUE", "FALSE", "INT", "CHAR", "FLOAT", "BOOL", 
		"STRING", "LIST", "SUM", "REST", "MULT", "DIV", "PORC", "IGIG", "DIF", 
		"MAY", "MAY_IG", "MEN", "MEN_IG", "AND", "OR", "IG", "INC", "DEC", "PyC", 
		"COMA", "PUNT", "PAR_IZQ", "PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", 
		"LLA_DER", "ADM", "COM_DOB", "HASH", "DOLLAR", "AMP", "PREG", "ARRB", 
		"DOS_PU", "LETTER", "DIGIT", "IDENT", "NUMBER", "CHAR_CONST", "PRINTABLE_CHAR", 
		"WS", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'class'", "'const'", "'else'", "'if'", "'new'", "'read'", 
		"'return'", "'void'", "'while'", "'write'", "'for'", "'true'", "'false'", 
		"'int'", "'char'", "'float'", "'bool'", "'string'", "'list'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", 
		"'||'", "'='", "'++'", "'--'", "';'", "','", "'.'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'!'", "'\"'", "'#'", "'$'", "'&'", "'?'", "'@'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", 
		"VOID", "WHILE", "WRITE", "FOR", "TRUE", "FALSE", "INT", "CHAR", "FLOAT", 
		"BOOL", "STRING", "LIST", "SUM", "REST", "MULT", "DIV", "PORC", "IGIG", 
		"DIF", "MAY", "MAY_IG", "MEN", "MEN_IG", "AND", "OR", "IG", "INC", "DEC", 
		"PyC", "COMA", "PUNT", "PAR_IZQ", "PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", 
		"LLA_DER", "ADM", "COM_DOB", "HASH", "DOLLAR", "AMP", "PREG", "ARRB", 
		"DOS_PU", "IDENT", "NUMBER", "CHAR_CONST", "PRINTABLE_CHAR", "WS", "LINE_COMMENT", 
		"BLOCK_COMMENT"
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


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u018a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\79\u013b\n9\f9\169\u013e\139"+
		"\3:\3:\7:\u0142\n:\f:\16:\u0145\13:\3;\3;\3;\5;\u014a\n;\3;\3;\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0166"+
		"\n<\3=\6=\u0169\n=\r=\16=\u016a\3=\3=\3>\3>\3>\3>\7>\u0173\n>\f>\16>\u0176"+
		"\13>\3>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u0181\n?\f?\16?\u0184\13?\3?\3?\3?"+
		"\3?\3?\4\u0174\u0182\2@\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m\2o\2q8s9u:w;y<{=}>\3\2\5\5\2C\\aac|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u01a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0085\3\2\2\2\7\u008b\3\2\2"+
		"\2\t\u0091\3\2\2\2\13\u0096\3\2\2\2\r\u0099\3\2\2\2\17\u009d\3\2\2\2\21"+
		"\u00a2\3\2\2\2\23\u00a9\3\2\2\2\25\u00ae\3\2\2\2\27\u00b4\3\2\2\2\31\u00ba"+
		"\3\2\2\2\33\u00be\3\2\2\2\35\u00c3\3\2\2\2\37\u00c9\3\2\2\2!\u00cd\3\2"+
		"\2\2#\u00d2\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3\2\2\2)\u00e4\3\2\2\2+\u00e9"+
		"\3\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2"+
		"\2\65\u00f3\3\2\2\2\67\u00f6\3\2\2\29\u00f9\3\2\2\2;\u00fb\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0103\3\2\2\2C\u0106\3\2\2\2E\u0109\3\2\2\2G"+
		"\u010b\3\2\2\2I\u010e\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0115\3\2"+
		"\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u011b\3\2\2\2W\u011d\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0121\3\2\2\2]\u0123\3\2\2\2_\u0125\3\2\2\2a\u0127\3\2\2\2c"+
		"\u0129\3\2\2\2e\u012b\3\2\2\2g\u012d\3\2\2\2i\u012f\3\2\2\2k\u0131\3\2"+
		"\2\2m\u0133\3\2\2\2o\u0135\3\2\2\2q\u0137\3\2\2\2s\u013f\3\2\2\2u\u0146"+
		"\3\2\2\2w\u0165\3\2\2\2y\u0168\3\2\2\2{\u016e\3\2\2\2}\u017b\3\2\2\2\177"+
		"\u0080\7d\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7m\2\2\u0084\4\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7n"+
		"\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2\u0089\u008a\7u\2\2\u008a\6"+
		"\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7v\2\2\u0090\b\3\2\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\n\3\2\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\f\3\2\2\2\u0099\u009a\7p\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7y\2\2\u009c\16\3\2\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7f\2\2\u00a1\20\3\2\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7w\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\u00a8\7p\2\2\u00a8\22\3\2\2\2\u00a9\u00aa\7"+
		"x\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7f\2\2\u00ad\24"+
		"\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\30\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7"+
		"t\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c2\7g\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\36\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		" \3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7t\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7$\3\2\2\2\u00d8"+
		"\u00d9\7d\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7n\2\2"+
		"\u00dc&\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2"+
		"\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7i\2\2\u00e3(\3\2"+
		"\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8*\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7"+
		"/\2\2\u00ec.\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7"+
		"\61\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7\'\2\2\u00f2\64\3\2\2\2\u00f3\u00f4"+
		"\7?\2\2\u00f4\u00f5\7?\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f88\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7"+
		"@\2\2\u00fc\u00fd\7?\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff>\3\2"+
		"\2\2\u0100\u0101\7>\2\2\u0101\u0102\7?\2\2\u0102@\3\2\2\2\u0103\u0104"+
		"\7(\2\2\u0104\u0105\7(\2\2\u0105B\3\2\2\2\u0106\u0107\7~\2\2\u0107\u0108"+
		"\7~\2\2\u0108D\3\2\2\2\u0109\u010a\7?\2\2\u010aF\3\2\2\2\u010b\u010c\7"+
		"-\2\2\u010c\u010d\7-\2\2\u010dH\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110"+
		"\7/\2\2\u0110J\3\2\2\2\u0111\u0112\7=\2\2\u0112L\3\2\2\2\u0113\u0114\7"+
		".\2\2\u0114N\3\2\2\2\u0115\u0116\7\60\2\2\u0116P\3\2\2\2\u0117\u0118\7"+
		"*\2\2\u0118R\3\2\2\2\u0119\u011a\7+\2\2\u011aT\3\2\2\2\u011b\u011c\7]"+
		"\2\2\u011cV\3\2\2\2\u011d\u011e\7_\2\2\u011eX\3\2\2\2\u011f\u0120\7}\2"+
		"\2\u0120Z\3\2\2\2\u0121\u0122\7\177\2\2\u0122\\\3\2\2\2\u0123\u0124\7"+
		"#\2\2\u0124^\3\2\2\2\u0125\u0126\7$\2\2\u0126`\3\2\2\2\u0127\u0128\7%"+
		"\2\2\u0128b\3\2\2\2\u0129\u012a\7&\2\2\u012ad\3\2\2\2\u012b\u012c\7(\2"+
		"\2\u012cf\3\2\2\2\u012d\u012e\7A\2\2\u012eh\3\2\2\2\u012f\u0130\7B\2\2"+
		"\u0130j\3\2\2\2\u0131\u0132\7<\2\2\u0132l\3\2\2\2\u0133\u0134\t\2\2\2"+
		"\u0134n\3\2\2\2\u0135\u0136\4\62;\2\u0136p\3\2\2\2\u0137\u013c\5m\67\2"+
		"\u0138\u013b\5m\67\2\u0139\u013b\5o8\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"r\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0143\5o8\2\u0140\u0142\5o8\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144t\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0149\7)\2\2\u0147\u014a"+
		"\5w<\2\u0148\u014a\t\3\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7)\2\2\u014cv\3\2\2\2\u014d\u0166\5m\67\2\u014e"+
		"\u0166\5o8\2\u014f\u0166\5]/\2\u0150\u0166\5_\60\2\u0151\u0166\5a\61\2"+
		"\u0152\u0166\5c\62\2\u0153\u0166\5\63\32\2\u0154\u0166\5e\63\2\u0155\u0166"+
		"\5Q)\2\u0156\u0166\5S*\2\u0157\u0166\5/\30\2\u0158\u0166\5+\26\2\u0159"+
		"\u0166\5M\'\2\u015a\u0166\5-\27\2\u015b\u0166\5O(\2\u015c\u0166\5\61\31"+
		"\2\u015d\u0166\5k\66\2\u015e\u0166\5K&\2\u015f\u0166\5=\37\2\u0160\u0166"+
		"\5E#\2\u0161\u0166\59\35\2\u0162\u0166\5g\64\2\u0163\u0166\5i\65\2\u0164"+
		"\u0166\7)\2\2\u0165\u014d\3\2\2\2\u0165\u014e\3\2\2\2\u0165\u014f\3\2"+
		"\2\2\u0165\u0150\3\2\2\2\u0165\u0151\3\2\2\2\u0165\u0152\3\2\2\2\u0165"+
		"\u0153\3\2\2\2\u0165\u0154\3\2\2\2\u0165\u0155\3\2\2\2\u0165\u0156\3\2"+
		"\2\2\u0165\u0157\3\2\2\2\u0165\u0158\3\2\2\2\u0165\u0159\3\2\2\2\u0165"+
		"\u015a\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u015c\3\2\2\2\u0165\u015d\3\2"+
		"\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2"+
		"\2\2\u0166x\3\2\2\2\u0167\u0169\t\4\2\2\u0168\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\b=\2\2\u016dz\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61\2\2"+
		"\u0170\u0174\3\2\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177\u0178\7\f\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b>"+
		"\2\2\u017a|\3\2\2\2\u017b\u017c\7\61\2\2\u017c\u017d\7,\2\2\u017d\u0182"+
		"\3\2\2\2\u017e\u0181\5}?\2\u017f\u0181\13\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7,\2\2\u0186"+
		"\u0187\7\61\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b?\2\2\u0189~\3\2\2\2"+
		"\f\2\u013a\u013c\u0143\u0149\u0165\u016a\u0174\u0180\u0182\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}