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
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, LIST=15, ORD=16, CHR=17, 
		LEN=18, SUM=19, REST=20, MULT=21, DIV=22, PORC=23, IGIG=24, DIF=25, MAY=26, 
		MAY_IG=27, MEN=28, MEN_IG=29, AND=30, OR=31, IG=32, INC=33, DEC=34, PyC=35, 
		COMA=36, PUNT=37, PAR_IZQ=38, PAR_DER=39, CORC_IZQ=40, CORC_DER=41, LLA_IZQ=42, 
		LLA_DER=43, ADM=44, COM_DOB=45, HASH=46, DOLLAR=47, AMP=48, PREG=49, ARRB=50, 
		DOS_PU=51, COM_SIM=52, IDENT=53, NUMBER_INTEGER_ZERO=54, NUMBER_INTEGER=55, 
		NUMBER_FLOAT=56, STRING_CONST=57, CHAR_CONST=58, PRINTABLE_CHAR=59, WS=60, 
		LINE_COMMENT=61, BLOCK_COMMENT=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", "VOID", 
		"WHILE", "WRITE", "FOR", "TRUE", "FALSE", "LIST", "ORD", "CHR", "LEN", 
		"SUM", "REST", "MULT", "DIV", "PORC", "IGIG", "DIF", "MAY", "MAY_IG", 
		"MEN", "MEN_IG", "AND", "OR", "IG", "INC", "DEC", "PyC", "COMA", "PUNT", 
		"PAR_IZQ", "PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", 
		"COM_DOB", "HASH", "DOLLAR", "AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", 
		"LETTER", "DIGIT", "DIGIT2", "IDENT", "NUMBER_INTEGER_ZERO", "NUMBER_INTEGER", 
		"NUMBER_FLOAT", "STRING_CONST", "CHAR_CONST", "PRINTABLE_CHAR", "WS", 
		"LINE_COMMENT", "BLOCK_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01a0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\3"+
		"8\39\39\39\79\u0136\n9\f9\169\u0139\139\3:\3:\3;\3;\7;\u013f\n;\f;\16"+
		";\u0142\13;\3<\3<\7<\u0146\n<\f<\16<\u0149\13<\3<\3<\3<\7<\u014e\n<\f"+
		"<\16<\u0151\13<\3=\3=\3=\7=\u0156\n=\f=\16=\u0159\13=\3=\3=\3>\3>\3>\5"+
		">\u0160\n>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\5?\u017c\n?\3@\6@\u017f\n@\r@\16@\u0180\3@\3@\3A\3"+
		"A\3A\3A\7A\u0189\nA\fA\16A\u018c\13A\3A\3A\3A\3A\3B\3B\3B\3B\3B\7B\u0197"+
		"\nB\fB\16B\u019a\13B\3B\3B\3B\3B\3B\4\u018a\u0198\2C\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\67s8u9w:y;{<}="+
		"\177>\u0081?\u0083@\3\2\5\5\2C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\2\u01bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008b\3\2\2"+
		"\2\7\u0091\3\2\2\2\t\u0097\3\2\2\2\13\u009c\3\2\2\2\r\u009f\3\2\2\2\17"+
		"\u00a3\3\2\2\2\21\u00a8\3\2\2\2\23\u00af\3\2\2\2\25\u00b4\3\2\2\2\27\u00ba"+
		"\3\2\2\2\31\u00c0\3\2\2\2\33\u00c4\3\2\2\2\35\u00c9\3\2\2\2\37\u00cf\3"+
		"\2\2\2!\u00d4\3\2\2\2#\u00d8\3\2\2\2%\u00dc\3\2\2\2\'\u00e0\3\2\2\2)\u00e2"+
		"\3\2\2\2+\u00e4\3\2\2\2-\u00e6\3\2\2\2/\u00e8\3\2\2\2\61\u00ea\3\2\2\2"+
		"\63\u00ed\3\2\2\2\65\u00f0\3\2\2\2\67\u00f2\3\2\2\29\u00f5\3\2\2\2;\u00f7"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E"+
		"\u0105\3\2\2\2G\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2"+
		"\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0118"+
		"\3\2\2\2Y\u011a\3\2\2\2[\u011c\3\2\2\2]\u011e\3\2\2\2_\u0120\3\2\2\2a"+
		"\u0122\3\2\2\2c\u0124\3\2\2\2e\u0126\3\2\2\2g\u0128\3\2\2\2i\u012a\3\2"+
		"\2\2k\u012c\3\2\2\2m\u012e\3\2\2\2o\u0130\3\2\2\2q\u0132\3\2\2\2s\u013a"+
		"\3\2\2\2u\u013c\3\2\2\2w\u0143\3\2\2\2y\u0152\3\2\2\2{\u015c\3\2\2\2}"+
		"\u017b\3\2\2\2\177\u017e\3\2\2\2\u0081\u0184\3\2\2\2\u0083\u0191\3\2\2"+
		"\2\u0085\u0086\7d\2\2\u0086\u0087\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7c\2\2\u0089\u008a\7m\2\2\u008a\4\3\2\2\2\u008b\u008c\7e\2\2\u008c\u008d"+
		"\7n\2\2\u008d\u008e\7c\2\2\u008e\u008f\7u\2\2\u008f\u0090\7u\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096\b\3\2\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b\n\3\2\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e\f\3\2\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\u00a2\7y\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7\20\3\2\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae\22\3\2\2\2\u00af\u00b0\7"+
		"x\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\24"+
		"\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\30\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7"+
		"t\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7w\2\2\u00c7\u00c8\7g\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\36\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3 \3\2\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7f\2\2\u00d7\"\3\2\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7j\2\2\u00da"+
		"\u00db\7t\2\2\u00db$\3\2\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7p\2\2\u00df&\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1(\3\2\2\2\u00e2\u00e3"+
		"\7/\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7,\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7"+
		"\61\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7\'\2\2\u00e9\60\3\2\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb\u00ec\7?\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\64\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\66\3\2\2\2\u00f2\u00f3"+
		"\7@\2\2\u00f3\u00f4\7?\2\2\u00f48\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6:\3"+
		"\2\2\2\u00f7\u00f8\7>\2\2\u00f8\u00f9\7?\2\2\u00f9<\3\2\2\2\u00fa\u00fb"+
		"\7(\2\2\u00fb\u00fc\7(\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe\u00ff"+
		"\7~\2\2\u00ff@\3\2\2\2\u0100\u0101\7?\2\2\u0101B\3\2\2\2\u0102\u0103\7"+
		"-\2\2\u0103\u0104\7-\2\2\u0104D\3\2\2\2\u0105\u0106\7/\2\2\u0106\u0107"+
		"\7/\2\2\u0107F\3\2\2\2\u0108\u0109\7=\2\2\u0109H\3\2\2\2\u010a\u010b\7"+
		".\2\2\u010bJ\3\2\2\2\u010c\u010d\7\60\2\2\u010dL\3\2\2\2\u010e\u010f\7"+
		"*\2\2\u010fN\3\2\2\2\u0110\u0111\7+\2\2\u0111P\3\2\2\2\u0112\u0113\7]"+
		"\2\2\u0113R\3\2\2\2\u0114\u0115\7_\2\2\u0115T\3\2\2\2\u0116\u0117\7}\2"+
		"\2\u0117V\3\2\2\2\u0118\u0119\7\177\2\2\u0119X\3\2\2\2\u011a\u011b\7#"+
		"\2\2\u011bZ\3\2\2\2\u011c\u011d\7$\2\2\u011d\\\3\2\2\2\u011e\u011f\7%"+
		"\2\2\u011f^\3\2\2\2\u0120\u0121\7&\2\2\u0121`\3\2\2\2\u0122\u0123\7(\2"+
		"\2\u0123b\3\2\2\2\u0124\u0125\7A\2\2\u0125d\3\2\2\2\u0126\u0127\7B\2\2"+
		"\u0127f\3\2\2\2\u0128\u0129\7<\2\2\u0129h\3\2\2\2\u012a\u012b\7)\2\2\u012b"+
		"j\3\2\2\2\u012c\u012d\t\2\2\2\u012dl\3\2\2\2\u012e\u012f\4\62;\2\u012f"+
		"n\3\2\2\2\u0130\u0131\4\63;\2\u0131p\3\2\2\2\u0132\u0137\5k\66\2\u0133"+
		"\u0136\5k\66\2\u0134\u0136\5m\67\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"r\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\62\2\2\u013bt\3\2\2\2\u013c"+
		"\u0140\5o8\2\u013d\u013f\5m\67\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141v\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0143\u0147\5m\67\2\u0144\u0146\5m\67\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5K&\2\u014b\u014f\5m\67\2\u014c\u014e"+
		"\5m\67\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150x\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0157\7$\2\2\u0153"+
		"\u0156\5}?\2\u0154\u0156\7\"\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2"+
		"\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7$\2\2\u015bz\3\2\2\2\u015c\u015f"+
		"\7)\2\2\u015d\u0160\5}?\2\u015e\u0160\t\3\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7)\2\2\u0162|\3\2\2\2\u0163"+
		"\u017c\5k\66\2\u0164\u017c\5m\67\2\u0165\u017c\5Y-\2\u0166\u017c\5[.\2"+
		"\u0167\u017c\5]/\2\u0168\u017c\5_\60\2\u0169\u017c\5/\30\2\u016a\u017c"+
		"\5a\61\2\u016b\u017c\5M\'\2\u016c\u017c\5O(\2\u016d\u017c\5+\26\2\u016e"+
		"\u017c\5\'\24\2\u016f\u017c\5I%\2\u0170\u017c\5)\25\2\u0171\u017c\5K&"+
		"\2\u0172\u017c\5-\27\2\u0173\u017c\5g\64\2\u0174\u017c\5G$\2\u0175\u017c"+
		"\59\35\2\u0176\u017c\5A!\2\u0177\u017c\5\65\33\2\u0178\u017c\5c\62\2\u0179"+
		"\u017c\5e\63\2\u017a\u017c\5i\65\2\u017b\u0163\3\2\2\2\u017b\u0164\3\2"+
		"\2\2\u017b\u0165\3\2\2\2\u017b\u0166\3\2\2\2\u017b\u0167\3\2\2\2\u017b"+
		"\u0168\3\2\2\2\u017b\u0169\3\2\2\2\u017b\u016a\3\2\2\2\u017b\u016b\3\2"+
		"\2\2\u017b\u016c\3\2\2\2\u017b\u016d\3\2\2\2\u017b\u016e\3\2\2\2\u017b"+
		"\u016f\3\2\2\2\u017b\u0170\3\2\2\2\u017b\u0171\3\2\2\2\u017b\u0172\3\2"+
		"\2\2\u017b\u0173\3\2\2\2\u017b\u0174\3\2\2\2\u017b\u0175\3\2\2\2\u017b"+
		"\u0176\3\2\2\2\u017b\u0177\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017a\3\2\2\2\u017c~\3\2\2\2\u017d\u017f\t\4\2\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\b@\2\2\u0183\u0080\3\2\2\2\u0184\u0185\7\61"+
		"\2\2\u0185\u0186\7\61\2\2\u0186\u018a\3\2\2\2\u0187\u0189\13\2\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\f\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0190\bA\2\2\u0190\u0082\3\2\2\2\u0191\u0192\7\61"+
		"\2\2\u0192\u0193\7,\2\2\u0193\u0198\3\2\2\2\u0194\u0197\5\u0083B\2\u0195"+
		"\u0197\13\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019c\7,\2\2\u019c\u019d\7\61\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019f\bB\2\2\u019f\u0084\3\2\2\2\20\2\u0135\u0137\u0140\u0147"+
		"\u014f\u0155\u0157\u015f\u017b\u0180\u018a\u0196\u0198\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}