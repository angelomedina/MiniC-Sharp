// Generated from D:/Proyecto Compiladores/MiniC-Sharp/src/Antlr\Scanner.g4 by ANTLR 4.7
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
		WHILE=10, WRITE=11, FOR=12, TRUE=13, FALSE=14, ORD=15, CHR=16, LEN=17, 
		SUM=18, REST=19, MULT=20, DIV=21, PORC=22, IGIG=23, DIF=24, MAY=25, MAY_IG=26, 
		MEN=27, MEN_IG=28, AND=29, OR=30, IG=31, INC=32, DEC=33, PyC=34, COMA=35, 
		PUNT=36, PAR_IZQ=37, PAR_DER=38, CORC_IZQ=39, CORC_DER=40, LLA_IZQ=41, 
		LLA_DER=42, ADM=43, COM_DOB=44, HASH=45, DOLLAR=46, AMP=47, PREG=48, ARRB=49, 
		DOS_PU=50, COM_SIM=51, SALTO_LINEA=52, TAB=53, IDENT=54, NUMBER_INTEGER_ZERO=55, 
		NUMBER_INTEGER=56, NUMBER_FLOAT=57, STRING_CONST=58, CHAR_CONST=59, PRINTABLE_CHAR=60, 
		WS=61, LINE_COMMENT=62, BLOCK_COMMENT=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "CLASS", "CONST", "ELSE", "IF", "NEW", "READ", "RETURN", "VOID", 
		"WHILE", "WRITE", "FOR", "TRUE", "FALSE", "ORD", "CHR", "LEN", "SUM", 
		"REST", "MULT", "DIV", "PORC", "IGIG", "DIF", "MAY", "MAY_IG", "MEN", 
		"MEN_IG", "AND", "OR", "IG", "INC", "DEC", "PyC", "COMA", "PUNT", "PAR_IZQ", 
		"PAR_DER", "CORC_IZQ", "CORC_DER", "LLA_IZQ", "LLA_DER", "ADM", "COM_DOB", 
		"HASH", "DOLLAR", "AMP", "PREG", "ARRB", "DOS_PU", "COM_SIM", "SALTO_LINEA", 
		"TAB", "LETTER", "DIGIT", "DIGIT2", "IDENT", "NUMBER_INTEGER_ZERO", "NUMBER_INTEGER", 
		"NUMBER_FLOAT", "STRING_CONST", "CHAR_CONST", "PRINTABLE_CHAR", "WS", 
		"LINE_COMMENT", "BLOCK_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01a4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3:\7:\u0139\n:\f:\16:\u013c\13:\3;\3;\3<\3<\7<\u0142"+
		"\n<\f<\16<\u0145\13<\3=\3=\7=\u0149\n=\f=\16=\u014c\13=\3=\3=\3=\7=\u0151"+
		"\n=\f=\16=\u0154\13=\3>\3>\3>\7>\u0159\n>\f>\16>\u015c\13>\3>\3>\3?\3"+
		"?\3?\3?\5?\u0164\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0180\n@\3A\6A\u0183\nA\rA\16A\u0184\3"+
		"A\3A\3B\3B\3B\3B\7B\u018d\nB\fB\16B\u0190\13B\3B\3B\3B\3B\3C\3C\3C\3C"+
		"\3C\7C\u019b\nC\fC\16C\u019e\13C\3C\3C\3C\3C\3C\4\u018e\u019c\2D\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q"+
		"\2s8u9w:y;{<}=\177>\u0081?\u0083@\u0085A\3\2\4\5\2C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u01c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087"+
		"\3\2\2\2\5\u008d\3\2\2\2\7\u0093\3\2\2\2\t\u0099\3\2\2\2\13\u009e\3\2"+
		"\2\2\r\u00a1\3\2\2\2\17\u00a5\3\2\2\2\21\u00aa\3\2\2\2\23\u00b1\3\2\2"+
		"\2\25\u00b6\3\2\2\2\27\u00bc\3\2\2\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2"+
		"\35\u00cb\3\2\2\2\37\u00d1\3\2\2\2!\u00d5\3\2\2\2#\u00d9\3\2\2\2%\u00dd"+
		"\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2"+
		"/\u00e7\3\2\2\2\61\u00ea\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67"+
		"\u00f2\3\2\2\29\u00f4\3\2\2\2;\u00f7\3\2\2\2=\u00fa\3\2\2\2?\u00fd\3\2"+
		"\2\2A\u00ff\3\2\2\2C\u0102\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109"+
		"\3\2\2\2K\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S"+
		"\u0113\3\2\2\2U\u0115\3\2\2\2W\u0117\3\2\2\2Y\u0119\3\2\2\2[\u011b\3\2"+
		"\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c\u0123\3\2\2\2e\u0125"+
		"\3\2\2\2g\u0127\3\2\2\2i\u0129\3\2\2\2k\u012c\3\2\2\2m\u012f\3\2\2\2o"+
		"\u0131\3\2\2\2q\u0133\3\2\2\2s\u0135\3\2\2\2u\u013d\3\2\2\2w\u013f\3\2"+
		"\2\2y\u0146\3\2\2\2{\u0155\3\2\2\2}\u015f\3\2\2\2\177\u017f\3\2\2\2\u0081"+
		"\u0182\3\2\2\2\u0083\u0188\3\2\2\2\u0085\u0195\3\2\2\2\u0087\u0088\7d"+
		"\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7c\2\2\u008b\u008c"+
		"\7m\2\2\u008c\4\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f\7n\2\2\u008f\u0090"+
		"\7c\2\2\u0090\u0091\7u\2\2\u0091\u0092\7u\2\2\u0092\6\3\2\2\2\u0093\u0094"+
		"\7e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097\7u\2\2\u0097"+
		"\u0098\7v\2\2\u0098\b\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\n\3\2\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7y\2\2\u00a4\16\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7c\2\2\u00a8\u00a9\7f\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2"+
		"\u00af\u00b0\7p\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7"+
		"q\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2\u00b5\24\3\2\2\2\u00b6\u00b7"+
		"\7y\2\2\u00b7\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\30\3\2\2\2\u00c2"+
		"\u00c3\7h\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5\32\3\2\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2"+
		"\u00ca\34\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7"+
		"n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\36\3\2\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7f\2\2\u00d4 \3\2\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7t\2\2\u00d8\"\3\2\2\2\u00d9\u00da"+
		"\7n\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc$\3\2\2\2\u00dd\u00de"+
		"\7-\2\2\u00de&\3\2\2\2\u00df\u00e0\7/\2\2\u00e0(\3\2\2\2\u00e1\u00e2\7"+
		",\2\2\u00e2*\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7"+
		"\'\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e9\60\3"+
		"\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\7?\2\2\u00ec\62\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1\7?\2\2\u00f1\66"+
		"\3\2\2\2\u00f2\u00f3\7>\2\2\u00f38\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7(\2\2\u00f9<\3"+
		"\2\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fc\7~\2\2\u00fc>\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe@\3\2\2\2\u00ff\u0100\7-\2\2\u0100\u0101\7-\2\2\u0101B\3"+
		"\2\2\2\u0102\u0103\7/\2\2\u0103\u0104\7/\2\2\u0104D\3\2\2\2\u0105\u0106"+
		"\7=\2\2\u0106F\3\2\2\2\u0107\u0108\7.\2\2\u0108H\3\2\2\2\u0109\u010a\7"+
		"\60\2\2\u010aJ\3\2\2\2\u010b\u010c\7*\2\2\u010cL\3\2\2\2\u010d\u010e\7"+
		"+\2\2\u010eN\3\2\2\2\u010f\u0110\7]\2\2\u0110P\3\2\2\2\u0111\u0112\7_"+
		"\2\2\u0112R\3\2\2\2\u0113\u0114\7}\2\2\u0114T\3\2\2\2\u0115\u0116\7\177"+
		"\2\2\u0116V\3\2\2\2\u0117\u0118\7#\2\2\u0118X\3\2\2\2\u0119\u011a\7$\2"+
		"\2\u011aZ\3\2\2\2\u011b\u011c\7%\2\2\u011c\\\3\2\2\2\u011d\u011e\7&\2"+
		"\2\u011e^\3\2\2\2\u011f\u0120\7(\2\2\u0120`\3\2\2\2\u0121\u0122\7A\2\2"+
		"\u0122b\3\2\2\2\u0123\u0124\7B\2\2\u0124d\3\2\2\2\u0125\u0126\7<\2\2\u0126"+
		"f\3\2\2\2\u0127\u0128\7)\2\2\u0128h\3\2\2\2\u0129\u012a\7^\2\2\u012a\u012b"+
		"\7p\2\2\u012bj\3\2\2\2\u012c\u012d\7^\2\2\u012d\u012e\7v\2\2\u012el\3"+
		"\2\2\2\u012f\u0130\t\2\2\2\u0130n\3\2\2\2\u0131\u0132\4\62;\2\u0132p\3"+
		"\2\2\2\u0133\u0134\4\63;\2\u0134r\3\2\2\2\u0135\u013a\5m\67\2\u0136\u0139"+
		"\5m\67\2\u0137\u0139\5o8\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bt\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u013e\7\62\2\2\u013ev\3\2\2\2\u013f\u0143\5"+
		"q9\2\u0140\u0142\5o8\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144x\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u014a\5o8\2\u0147\u0149\5o8\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2"+
		"\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014e\5I%\2\u014e\u0152\5o8\2\u014f\u0151\5o8\2\u0150\u014f"+
		"\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"z\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u015a\7$\2\2\u0156\u0159\5\177@\2"+
		"\u0157\u0159\7\"\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\u015c"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u015e\7$\2\2\u015e|\3\2\2\2\u015f\u0163\7)\2\2\u0160"+
		"\u0164\5i\65\2\u0161\u0164\5\177@\2\u0162\u0164\5k\66\2\u0163\u0160\3"+
		"\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\7)\2\2\u0166~\3\2\2\2\u0167\u0180\5m\67\2\u0168\u0180\5o8\2\u0169"+
		"\u0180\5W,\2\u016a\u0180\5Y-\2\u016b\u0180\5[.\2\u016c\u0180\5]/\2\u016d"+
		"\u0180\5-\27\2\u016e\u0180\5_\60\2\u016f\u0180\5K&\2\u0170\u0180\5M\'"+
		"\2\u0171\u0180\5)\25\2\u0172\u0180\5%\23\2\u0173\u0180\5G$\2\u0174\u0180"+
		"\5\'\24\2\u0175\u0180\5I%\2\u0176\u0180\5+\26\2\u0177\u0180\5e\63\2\u0178"+
		"\u0180\5E#\2\u0179\u0180\5\67\34\2\u017a\u0180\5? \2\u017b\u0180\5\63"+
		"\32\2\u017c\u0180\5a\61\2\u017d\u0180\5c\62\2\u017e\u0180\5g\64\2\u017f"+
		"\u0167\3\2\2\2\u017f\u0168\3\2\2\2\u017f\u0169\3\2\2\2\u017f\u016a\3\2"+
		"\2\2\u017f\u016b\3\2\2\2\u017f\u016c\3\2\2\2\u017f\u016d\3\2\2\2\u017f"+
		"\u016e\3\2\2\2\u017f\u016f\3\2\2\2\u017f\u0170\3\2\2\2\u017f\u0171\3\2"+
		"\2\2\u017f\u0172\3\2\2\2\u017f\u0173\3\2\2\2\u017f\u0174\3\2\2\2\u017f"+
		"\u0175\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u0177\3\2\2\2\u017f\u0178\3\2"+
		"\2\2\u017f\u0179\3\2\2\2\u017f\u017a\3\2\2\2\u017f\u017b\3\2\2\2\u017f"+
		"\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180\u0080\3\2"+
		"\2\2\u0181\u0183\t\3\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\bA"+
		"\2\2\u0187\u0082\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7\61\2\2\u018a"+
		"\u018e\3\2\2\2\u018b\u018d\13\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\7\f\2\2\u0192\u0193\3\2\2\2\u0193\u0194\bB"+
		"\2\2\u0194\u0084\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197"+
		"\u019c\3\2\2\2\u0198\u019b\5\u0085C\2\u0199\u019b\13\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019d\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7,"+
		"\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\bC\2\2\u01a3"+
		"\u0086\3\2\2\2\20\2\u0138\u013a\u0143\u014a\u0152\u0158\u015a\u0163\u017f"+
		"\u0184\u018e\u019a\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}