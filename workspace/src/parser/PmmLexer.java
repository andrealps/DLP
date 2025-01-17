// Generated from D:/UNIVERSIDAD/Tercer curso/DLP/Laboratorio/DLP/workspace/src/parser\Pmm.g4 by ANTLR 4.8
package parser;

    import ast.*;
    import errorhandler.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WHITESPACE=38, 
		COMMENT=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, ID=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "WHITESPACE", "COMMENT", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "'int'", 
			"'char'", "'double'", "'['", "']'", "'struct'", "','", "'return'", "'while'", 
			"'if'", "'else'", "'print'", "'input'", "'='", "'.'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WHITESPACE", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\6\'\u00d4\n\'\r"+
		"\'\16\'\u00d5\3\'\3\'\3(\3(\7(\u00dc\n(\f(\16(\u00df\13(\3(\5(\u00e2\n"+
		"(\3(\3(\3(\3(\3(\7(\u00e9\n(\f(\16(\u00ec\13(\3(\3(\3(\5(\u00f1\n(\3("+
		"\3(\3)\3)\3)\7)\u00f8\n)\f)\16)\u00fb\13)\5)\u00fd\n)\3*\3*\3*\5*\u0102"+
		"\n*\3*\6*\u0105\n*\r*\16*\u0106\3*\3*\3*\7*\u010c\n*\f*\16*\u010f\13*"+
		"\3*\3*\6*\u0113\n*\r*\16*\u0114\5*\u0117\n*\3*\3*\5*\u011b\n*\3*\6*\u011e"+
		"\n*\r*\16*\u011f\5*\u0122\n*\5*\u0124\n*\3+\3+\3+\3+\3+\6+\u012b\n+\r"+
		"+\16+\u012c\5+\u012f\n+\5+\u0131\n+\3+\3+\3,\3,\3,\5,\u0138\n,\3,\7,\u013b"+
		"\n,\f,\16,\u013e\13,\4\u00dd\u00ea\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2"+
		"\13\5\2\13\f\17\17\"\"\3\3\f\f\3\2\63;\3\2\62;\4\2GGgg\4\2--//\4\2ppv"+
		"v\6\2\62;C\\aac|\4\2C\\c|\2\u0152\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5]\3"+
		"\2\2\2\7b\3\2\2\2\td\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21l\3"+
		"\2\2\2\23n\3\2\2\2\25r\3\2\2\2\27w\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2"+
		"\2\35\u0082\3\2\2\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u0092\3\2\2\2%\u0098"+
		"\3\2\2\2\'\u009b\3\2\2\2)\u00a0\3\2\2\2+\u00a6\3\2\2\2-\u00ac\3\2\2\2"+
		"/\u00ae\3\2\2\2\61\u00b0\3\2\2\2\63\u00b2\3\2\2\2\65\u00b4\3\2\2\2\67"+
		"\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc\3\2\2\2?\u00be\3\2"+
		"\2\2A\u00c1\3\2\2\2C\u00c3\3\2\2\2E\u00c6\3\2\2\2G\u00c9\3\2\2\2I\u00cc"+
		"\3\2\2\2K\u00cf\3\2\2\2M\u00d3\3\2\2\2O\u00f0\3\2\2\2Q\u00fc\3\2\2\2S"+
		"\u0123\3\2\2\2U\u0125\3\2\2\2W\u0137\3\2\2\2YZ\7f\2\2Z[\7g\2\2[\\\7h\2"+
		"\2\\\4\3\2\2\2]^\7o\2\2^_\7c\2\2_`\7k\2\2`a\7p\2\2a\6\3\2\2\2bc\7*\2\2"+
		"c\b\3\2\2\2de\7+\2\2e\n\3\2\2\2fg\7<\2\2g\f\3\2\2\2hi\7}\2\2i\16\3\2\2"+
		"\2jk\7\177\2\2k\20\3\2\2\2lm\7=\2\2m\22\3\2\2\2no\7k\2\2op\7p\2\2pq\7"+
		"v\2\2q\24\3\2\2\2rs\7e\2\2st\7j\2\2tu\7c\2\2uv\7t\2\2v\26\3\2\2\2wx\7"+
		"f\2\2xy\7q\2\2yz\7w\2\2z{\7d\2\2{|\7n\2\2|}\7g\2\2}\30\3\2\2\2~\177\7"+
		"]\2\2\177\32\3\2\2\2\u0080\u0081\7_\2\2\u0081\34\3\2\2\2\u0082\u0083\7"+
		"u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086\u0087"+
		"\7e\2\2\u0087\u0088\7v\2\2\u0088\36\3\2\2\2\u0089\u008a\7.\2\2\u008a "+
		"\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7w\2\2\u008f\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2"+
		"\u0096\u0097\7g\2\2\u0097$\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h\2"+
		"\2\u009a&\3\2\2\2\u009b\u009c\7g\2\2\u009c\u009d\7n\2\2\u009d\u009e\7"+
		"u\2\2\u009e\u009f\7g\2\2\u009f(\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"*\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7r\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7v\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		".\3\2\2\2\u00ae\u00af\7\60\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7/\2\2\u00b1"+
		"\62\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5"+
		"\66\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b78\3\2\2\2\u00b8\u00b9\7\'\2\2\u00b9"+
		":\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd>"+
		"\3\2\2\2\u00be\u00bf\7@\2\2\u00bf\u00c0\7?\2\2\u00c0@\3\2\2\2\u00c1\u00c2"+
		"\7>\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5D\3"+
		"\2\2\2\u00c6\u00c7\7#\2\2\u00c7\u00c8\7?\2\2\u00c8F\3\2\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\u00cb\7?\2\2\u00cbH\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd\u00ce"+
		"\7(\2\2\u00ceJ\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0\u00d1\7~\2\2\u00d1L\3"+
		"\2\2\2\u00d2\u00d4\t\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\'"+
		"\2\2\u00d8N\3\2\2\2\u00d9\u00dd\7%\2\2\u00da\u00dc\13\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\t\3\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00f1\3\2\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6"+
		"\7$\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\13\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7$\2\2\u00ee\u00ef\7$\2\2\u00ef\u00f1"+
		"\7$\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00e3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\b(\2\2\u00f3P\3\2\2\2\u00f4\u00fd\7\62\2\2\u00f5\u00f9\t\4\2\2"+
		"\u00f6\u00f8\t\5\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fdR\3\2\2\2\u00fe\u00ff\5Q)\2\u00ff"+
		"\u0101\t\6\2\2\u0100\u0102\t\7\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0105\t\5\2\2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0124\3\2"+
		"\2\2\u0108\u0109\5Q)\2\u0109\u010d\7\60\2\2\u010a\u010c\5Q)\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0117\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\60\2\2\u0111\u0113\5"+
		"Q)\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u0110\3\2"+
		"\2\2\u0117\u0121\3\2\2\2\u0118\u011a\t\6\2\2\u0119\u011b\t\7\2\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\t\5"+
		"\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u00fe\3\2\2\2\u0123\u0116\3\2\2\2\u0124"+
		"T\3\2\2\2\u0125\u0130\7)\2\2\u0126\u0131\13\2\2\2\u0127\u012e\7^\2\2\u0128"+
		"\u012f\t\b\2\2\u0129\u012b\t\5\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u0128\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0126\3\2"+
		"\2\2\u0130\u0127\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7)\2\2\u0133"+
		"V\3\2\2\2\u0134\u0135\7a\2\2\u0135\u0138\t\t\2\2\u0136\u0138\t\n\2\2\u0137"+
		"\u0134\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u013c\3\2\2\2\u0139\u013b\t\t"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013dX\3\2\2\2\u013e\u013c\3\2\2\2\30\2\u00d5\u00dd\u00e1"+
		"\u00ea\u00f0\u00f9\u00fc\u0101\u0106\u010d\u0114\u0116\u011a\u011f\u0121"+
		"\u0123\u012c\u012e\u0130\u0137\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}