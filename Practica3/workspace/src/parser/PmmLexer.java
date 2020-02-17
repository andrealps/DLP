// Generated from D:/UNIVERSIDAD/Tercer curso/DLP/Laboratorio/Practica3/workspace/src/parser\Pmm.g4 by ANTLR 4.8
package parser;
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
		REAL_CONSTANT=1, ID=2, CHAR_CONSTANT=3, INT_CONSTANT=4, COMMENT=5, WHITESPACE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REAL_CONSTANT", "ID", "CHAR_CONSTANT", "INT_CONSTANT", "COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REAL_CONSTANT", "ID", "CHAR_CONSTANT", "INT_CONSTANT", "COMMENT", 
			"WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\5\2\23\n\2\3\2\6\2"+
		"\26\n\2\r\2\16\2\27\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\5\2)\n\2\3\2\3\2\5\2-\n\2\3\2\6\2\60\n\2\r\2\16"+
		"\2\61\5\2\64\n\2\5\2\66\n\2\3\3\3\3\3\3\5\3;\n\3\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\4\3\4\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\5\4L\n\4\5\4N\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\6\3\6\7\6^\n\6\f\6\16"+
		"\6a\13\6\3\6\5\6d\n\6\3\6\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6"+
		"\3\6\3\6\5\6s\n\6\3\6\3\6\3\7\6\7x\n\7\r\7\16\7y\3\7\3\7\4_l\2\b\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\3\2\13\4\2GGgg\4\2--//\3\2\62;\6\2\62;C\\aac|\4\2"+
		"C\\c|\4\2ppvv\3\2\63;\3\3\f\f\5\2\13\f\17\17\"\"\2\u0090\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\65\3\2\2"+
		"\2\5:\3\2\2\2\7B\3\2\2\2\tY\3\2\2\2\13r\3\2\2\2\rw\3\2\2\2\17\20\5\t\5"+
		"\2\20\22\t\2\2\2\21\23\t\3\2\2\22\21\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2"+
		"\2\24\26\t\4\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\66\3\2\2\2\31\32\5\t\5\2\32\36\7\60\2\2\33\35\5\t\5\2\34\33\3\2"+
		"\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37)\3\2\2\2 \36\3\2\2\2!"+
		"%\7\60\2\2\"$\5\t\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2"+
		"\2\2\'%\3\2\2\2(\31\3\2\2\2(!\3\2\2\2)\63\3\2\2\2*,\t\2\2\2+-\t\3\2\2"+
		",+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\t\4\2\2/.\3\2\2\2\60\61\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63*\3\2\2\2\63\64\3\2\2\2\64\66"+
		"\3\2\2\2\65\17\3\2\2\2\65(\3\2\2\2\66\4\3\2\2\2\678\7a\2\28;\t\5\2\29"+
		";\t\6\2\2:\67\3\2\2\2:9\3\2\2\2;?\3\2\2\2<>\t\5\2\2=<\3\2\2\2>A\3\2\2"+
		"\2?=\3\2\2\2?@\3\2\2\2@\6\3\2\2\2A?\3\2\2\2BM\7)\2\2CN\13\2\2\2DK\7^\2"+
		"\2EL\t\7\2\2FH\t\4\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KE\3\2\2\2KG\3\2\2\2LN\3\2\2\2MC\3\2\2\2MD\3\2\2\2NO\3\2\2\2OP\7)\2"+
		"\2P\b\3\2\2\2QZ\7\62\2\2RV\t\b\2\2SU\t\4\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YQ\3\2\2\2YR\3\2\2\2Z\n\3\2\2\2[_\7"+
		"%\2\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`c\3\2\2\2a"+
		"_\3\2\2\2bd\t\t\2\2cb\3\2\2\2ds\3\2\2\2ef\7$\2\2fg\7$\2\2gh\7$\2\2hl\3"+
		"\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl"+
		"\3\2\2\2op\7$\2\2pq\7$\2\2qs\7$\2\2r[\3\2\2\2re\3\2\2\2st\3\2\2\2tu\b"+
		"\6\2\2u\f\3\2\2\2vx\t\n\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\b\7\2\2|\16\3\2\2\2\30\2\22\27\36%(,\61\63\65:?IKMVY_clry\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}