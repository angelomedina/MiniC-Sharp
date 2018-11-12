// Generated from E:/Doccumentos TEC/6 SEMESTRE 2018/Compiladores/Proyectos/I Proyecto/Avance II/MiniC-Sharp/src/Antlr\Scanner.g4 by ANTLR 4.7
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
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, SUM=15, REST=16, MULT=17, 
		DIV=18, PORC=19, IGIG=20, DIF=21, MAY=22, MAY_IG=23, MEN=24, MEN_IG=25, 
		AND=26, OR=27, IG=28, INC=29, DEC=30, PyC=31, COMA=32, PUNT=33, PAR_IZQ=34, 
		PAR_DER=35, CORC_IZQ=36, CORC_DER=37, LLA_IZQ=38, LLA_DER=39, ADM=40, 
		COM_DOB=41, HASH=42, DOLLAR=43, AMP=44, PREG=45, ARRB=46, DOS_PU=47, COM_SIM=48, 
		SALTO_LINEA=49, TAB=50, IDENT=51, NUMBER_INTEGER_ZERO=52, NUMBER_INTEGER=53, 
		NUMBER_FLOAT=54, STRING_CONST=55, CHAR_CONST=56, PRINTABLE_CHAR=57, WS=58, 
		LINE_COMMENT=59, BLOCK_COMMENT=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", "VOID", 
		"WHILE", "WRITE", "FOR", "TRUE", "FALSE", "SUM", "REST", "MULT", "DIV", 
		"PORC", "IGIG", "DIF", "MAY", "MAY_IG", "MEN", "MEN_IG", "AND", "OR", 
		"IG", "INC", "DEC", "PyC", "COMA", "PUNT", "PAR_IZQ", "PAR_DER", "CORC_IZQ", 
		"CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", "COM_DOB", "HASH", "DOLLAR", 
		"AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", "SALTO_LINEA", "TAB", "LETTER", 
		"DIGIT", "DIGIT2", "IDENT", "NUMBER_INTEGER_ZERO", "NUMBER_INTEGER", "NUMBER_FLOAT", 
		"STRING_CONST", "CHAR_CONST", "PRINTABLE_CHAR", "WS", "LINE_COMMENT", 
		"BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'class'", "'const'", "'else'", "'if'", "'new'", "'read'", 
		"'return'", "'void'", "'while'", "'write'", "'for'", "'true'", "'false'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", 
		"'<='", "'&&'", "'||'", "'='", "'++'", "'--'", "';'", "','", "'.'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'!'", "'\"'", "'#'", "'$'", "'&'", 
		"'?'", "'@'", "':'", "'''", "'\\n'", "'\\t'", null, "'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", 
		"VOID", "WHILE", "WRITE", "FOR", "TRUE", "FALSE", "SUM", "REST", "MULT", 
		"DIV", "PORC", "IGIG", "DIF", "MAY", "MAY_IG", "MEN", "MEN_IG", "AND", 
		"OR", "IG", "INC", "DEC", "PyC", "COMA", "PUNT", "PAR_IZQ", "PAR_DER", 
		"CORC_IZQ", "CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", "COM_DOB", "HASH", 
		"DOLLAR", "AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", "SALTO_LINEA", "TAB", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\7\67\u0127\n\67\f\67\16\67\u012a\13\67\38\3"+
		"8\39\39\79\u0130\n9\f9\169\u0133\139\3:\3:\7:\u0137\n:\f:\16:\u013a\13"+
		":\3:\3:\3:\7:\u013f\n:\f:\16:\u0142\13:\3;\3;\3;\7;\u0147\n;\f;\16;\u014a"+
		"\13;\3;\3;\3<\3<\3<\3<\5<\u0152\n<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u016e\n=\3>\6>\u0171\n"+
		">\r>\16>\u0172\3>\3>\3?\3?\3?\3?\7?\u017b\n?\f?\16?\u017e\13?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\7@\u0189\n@\f@\16@\u018c\13@\3@\3@\3@\3@\3@\4\u017c"+
		"\u018a\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i"+
		"\2k\2m\65o\66q\67s8u9w:y;{<}=\177>\3\2\4\5\2C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u01b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\3\u0081\3\2\2\2\5\u0087\3\2\2\2\7\u008d\3\2\2\2\t\u0093\3\2\2"+
		"\2\13\u0098\3\2\2\2\r\u009b\3\2\2\2\17\u009f\3\2\2\2\21\u00a4\3\2\2\2"+
		"\23\u00ab\3\2\2\2\25\u00b0\3\2\2\2\27\u00b6\3\2\2\2\31\u00bc\3\2\2\2\33"+
		"\u00c0\3\2\2\2\35\u00c5\3\2\2\2\37\u00cb\3\2\2\2!\u00cd\3\2\2\2#\u00cf"+
		"\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3\2\2\2+\u00d8\3\2\2\2"+
		"-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00e0\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5"+
		"\3\2\2\2\67\u00e8\3\2\2\29\u00eb\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2"+
		"?\u00f3\3\2\2\2A\u00f5\3\2\2\2C\u00f7\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3"+
		"\2\2\2I\u00fd\3\2\2\2K\u00ff\3\2\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0105"+
		"\3\2\2\2S\u0107\3\2\2\2U\u0109\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2["+
		"\u010f\3\2\2\2]\u0111\3\2\2\2_\u0113\3\2\2\2a\u0115\3\2\2\2c\u0117\3\2"+
		"\2\2e\u011a\3\2\2\2g\u011d\3\2\2\2i\u011f\3\2\2\2k\u0121\3\2\2\2m\u0123"+
		"\3\2\2\2o\u012b\3\2\2\2q\u012d\3\2\2\2s\u0134\3\2\2\2u\u0143\3\2\2\2w"+
		"\u014d\3\2\2\2y\u016d\3\2\2\2{\u0170\3\2\2\2}\u0176\3\2\2\2\177\u0183"+
		"\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7m\2\2\u0086\4\3\2\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7u\2\2"+
		"\u008c\6\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p"+
		"\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2\u0092\b\3\2\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097"+
		"\n\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2\2\u009a\f\3\2\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7g\2\2\u009d\u009e\7y\2\2\u009e\16\3\2\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f\2\2"+
		"\u00a3\20\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7"+
		"v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa\22"+
		"\3\2\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7f\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b5\26\3\2\2\2\u00b6"+
		"\u00b7\7y\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba\u00bb\7g\2\2\u00bb\30\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7"+
		"q\2\2\u00be\u00bf\7t\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7g\2\2\u00c4\34\3\2\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7-\2\2\u00cc \3\2\2\2\u00cd"+
		"\u00ce\7/\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0$\3\2\2\2\u00d1"+
		"\u00d2\7\61\2\2\u00d2&\3\2\2\2\u00d3\u00d4\7\'\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9"+
		"\u00da\7?\2\2\u00da,\3\2\2\2\u00db\u00dc\7@\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7@\2\2\u00de\u00df\7?\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\62"+
		"\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4\7?\2\2\u00e4\64\3\2\2\2\u00e5"+
		"\u00e6\7(\2\2\u00e6\u00e7\7(\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7~\2\2\u00e9"+
		"\u00ea\7~\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec:\3\2\2\2\u00ed\u00ee"+
		"\7-\2\2\u00ee\u00ef\7-\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1\u00f2"+
		"\7/\2\2\u00f2>\3\2\2\2\u00f3\u00f4\7=\2\2\u00f4@\3\2\2\2\u00f5\u00f6\7"+
		".\2\2\u00f6B\3\2\2\2\u00f7\u00f8\7\60\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7"+
		"*\2\2\u00faF\3\2\2\2\u00fb\u00fc\7+\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7]"+
		"\2\2\u00feJ\3\2\2\2\u00ff\u0100\7_\2\2\u0100L\3\2\2\2\u0101\u0102\7}\2"+
		"\2\u0102N\3\2\2\2\u0103\u0104\7\177\2\2\u0104P\3\2\2\2\u0105\u0106\7#"+
		"\2\2\u0106R\3\2\2\2\u0107\u0108\7$\2\2\u0108T\3\2\2\2\u0109\u010a\7%\2"+
		"\2\u010aV\3\2\2\2\u010b\u010c\7&\2\2\u010cX\3\2\2\2\u010d\u010e\7(\2\2"+
		"\u010eZ\3\2\2\2\u010f\u0110\7A\2\2\u0110\\\3\2\2\2\u0111\u0112\7B\2\2"+
		"\u0112^\3\2\2\2\u0113\u0114\7<\2\2\u0114`\3\2\2\2\u0115\u0116\7)\2\2\u0116"+
		"b\3\2\2\2\u0117\u0118\7^\2\2\u0118\u0119\7p\2\2\u0119d\3\2\2\2\u011a\u011b"+
		"\7^\2\2\u011b\u011c\7v\2\2\u011cf\3\2\2\2\u011d\u011e\t\2\2\2\u011eh\3"+
		"\2\2\2\u011f\u0120\4\62;\2\u0120j\3\2\2\2\u0121\u0122\4\63;\2\u0122l\3"+
		"\2\2\2\u0123\u0128\5g\64\2\u0124\u0127\5g\64\2\u0125\u0127\5i\65\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129n\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c"+
		"\7\62\2\2\u012cp\3\2\2\2\u012d\u0131\5k\66\2\u012e\u0130\5i\65\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132r\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0138\5i\65\2\u0135\u0137"+
		"\5i\65\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\5C"+
		"\"\2\u013c\u0140\5i\65\2\u013d\u013f\5i\65\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141t\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0148\7$\2\2\u0144\u0147\5y=\2\u0145\u0147"+
		"\7\"\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\7$\2\2\u014cv\3\2\2\2\u014d\u0151\7)\2\2\u014e\u0152"+
		"\5c\62\2\u014f\u0152\5y=\2\u0150\u0152\5e\63\2\u0151\u014e\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7)"+
		"\2\2\u0154x\3\2\2\2\u0155\u016e\5g\64\2\u0156\u016e\5i\65\2\u0157\u016e"+
		"\5Q)\2\u0158\u016e\5S*\2\u0159\u016e\5U+\2\u015a\u016e\5W,\2\u015b\u016e"+
		"\5\'\24\2\u015c\u016e\5Y-\2\u015d\u016e\5E#\2\u015e\u016e\5G$\2\u015f"+
		"\u016e\5#\22\2\u0160\u016e\5\37\20\2\u0161\u016e\5A!\2\u0162\u016e\5!"+
		"\21\2\u0163\u016e\5C\"\2\u0164\u016e\5%\23\2\u0165\u016e\5_\60\2\u0166"+
		"\u016e\5? \2\u0167\u016e\5\61\31\2\u0168\u016e\59\35\2\u0169\u016e\5-"+
		"\27\2\u016a\u016e\5[.\2\u016b\u016e\5]/\2\u016c\u016e\5a\61\2\u016d\u0155"+
		"\3\2\2\2\u016d\u0156\3\2\2\2\u016d\u0157\3\2\2\2\u016d\u0158\3\2\2\2\u016d"+
		"\u0159\3\2\2\2\u016d\u015a\3\2\2\2\u016d\u015b\3\2\2\2\u016d\u015c\3\2"+
		"\2\2\u016d\u015d\3\2\2\2\u016d\u015e\3\2\2\2\u016d\u015f\3\2\2\2\u016d"+
		"\u0160\3\2\2\2\u016d\u0161\3\2\2\2\u016d\u0162\3\2\2\2\u016d\u0163\3\2"+
		"\2\2\u016d\u0164\3\2\2\2\u016d\u0165\3\2\2\2\u016d\u0166\3\2\2\2\u016d"+
		"\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016a\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016ez\3\2\2\2\u016f\u0171"+
		"\t\3\2\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\b>\2\2\u0175|\3\2\2\2\u0176"+
		"\u0177\7\61\2\2\u0177\u0178\7\61\2\2\u0178\u017c\3\2\2\2\u0179\u017b\13"+
		"\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\f"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b?\2\2\u0182~\3\2\2\2\u0183\u0184"+
		"\7\61\2\2\u0184\u0185\7,\2\2\u0185\u018a\3\2\2\2\u0186\u0189\5\177@\2"+
		"\u0187\u0189\13\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\7,\2\2\u018e\u018f\7\61\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\b@\2\2\u0191\u0080\3\2\2\2\20\2\u0126\u0128\u0131\u0138"+
		"\u0140\u0146\u0148\u0151\u016d\u0172\u017c\u0188\u018a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}