// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0\ejemploScanner2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploScanner2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, NUM=25, 
		DELIMITER=26, QUOTES=27, APOSTROPHE=28, CHAR_LITERAL=29, PARENTESIS=30;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "LETTER", "DIGIT", 
			"ID", "NUM", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", "PARENTESIS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'};'", "'inherits'", "'():'", "'}'", "'('", 
			"':'", "','", "')'", "'();'", "'() ;'", "');'", "';'", "'<-'", "'\"\";'", 
			"'String'", "'self;'", "'new'", "'.'", "'Int'", "'SELF_TYPE'", "'Object'", 
			null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "NUM", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", "PARENTESIS"
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


	public ejemploScanner2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ejemploScanner2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u00aa\n\33"+
		"\f\33\16\33\u00ad\13\33\3\34\3\34\7\34\u00b1\n\34\f\34\16\34\u00b4\13"+
		"\34\3\35\6\35\u00b7\n\35\r\35\16\35\u00b8\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u00c9\n \3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\2\63\2\65\32\67\339\34;\35=\36?\37A \3\2\4\5\2C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5I\3\2\2\2\7K"+
		"\3\2\2\2\tN\3\2\2\2\13W\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23"+
		"a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31i\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2"+
		"\37s\3\2\2\2!v\3\2\2\2#z\3\2\2\2%\u0081\3\2\2\2\'\u0087\3\2\2\2)\u008b"+
		"\3\2\2\2+\u008d\3\2\2\2-\u0091\3\2\2\2/\u009b\3\2\2\2\61\u00a2\3\2\2\2"+
		"\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00ae\3\2\2\29\u00b6\3\2\2\2;\u00bc"+
		"\3\2\2\2=\u00be\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2CD\7e\2\2DE\7n\2"+
		"\2EF\7c\2\2FG\7u\2\2GH\7u\2\2H\4\3\2\2\2IJ\7}\2\2J\6\3\2\2\2KL\7\177\2"+
		"\2LM\7=\2\2M\b\3\2\2\2NO\7k\2\2OP\7p\2\2PQ\7j\2\2QR\7g\2\2RS\7t\2\2ST"+
		"\7k\2\2TU\7v\2\2UV\7u\2\2V\n\3\2\2\2WX\7*\2\2XY\7+\2\2YZ\7<\2\2Z\f\3\2"+
		"\2\2[\\\7\177\2\2\\\16\3\2\2\2]^\7*\2\2^\20\3\2\2\2_`\7<\2\2`\22\3\2\2"+
		"\2ab\7.\2\2b\24\3\2\2\2cd\7+\2\2d\26\3\2\2\2ef\7*\2\2fg\7+\2\2gh\7=\2"+
		"\2h\30\3\2\2\2ij\7*\2\2jk\7+\2\2kl\7\"\2\2lm\7=\2\2m\32\3\2\2\2no\7+\2"+
		"\2op\7=\2\2p\34\3\2\2\2qr\7=\2\2r\36\3\2\2\2st\7>\2\2tu\7/\2\2u \3\2\2"+
		"\2vw\7$\2\2wx\7$\2\2xy\7=\2\2y\"\3\2\2\2z{\7U\2\2{|\7v\2\2|}\7t\2\2}~"+
		"\7k\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080$\3\2\2\2\u0081\u0082\7u\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7=\2\2\u0086&\3\2\2\2\u0087\u0088\7p\2\2\u0088\u0089\7g\2\2\u0089\u008a"+
		"\7y\2\2\u008a(\3\2\2\2\u008b\u008c\7\60\2\2\u008c*\3\2\2\2\u008d\u008e"+
		"\7K\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090,\3\2\2\2\u0091\u0092"+
		"\7U\2\2\u0092\u0093\7G\2\2\u0093\u0094\7N\2\2\u0094\u0095\7H\2\2\u0095"+
		"\u0096\7a\2\2\u0096\u0097\7V\2\2\u0097\u0098\7[\2\2\u0098\u0099\7R\2\2"+
		"\u0099\u009a\7G\2\2\u009a.\3\2\2\2\u009b\u009c\7Q\2\2\u009c\u009d\7d\2"+
		"\2\u009d\u009e\7l\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3\62\3\2\2\2\u00a4\u00a5"+
		"\4\62;\2\u00a5\64\3\2\2\2\u00a6\u00ab\5\61\31\2\u00a7\u00aa\5\61\31\2"+
		"\u00a8\u00aa\5\63\32\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\66\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b2\5\63\32\2\u00af\u00b1\5\63\32\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"8\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\b\35\2\2\u00bb:\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd"+
		"<\3\2\2\2\u00be\u00bf\7)\2\2\u00bf>\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1\u00c2"+
		"\5\61\31\2\u00c2\u00c3\7$\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\5=\37\2"+
		"\u00c5\u00c6\5\61\31\2\u00c6\u00c7\5=\37\2\u00c7\u00c9\3\2\2\2\u00c8\u00c0"+
		"\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9@\3\2\2\2\u00ca\u00cb\4*+\2\u00cbB\3"+
		"\2\2\2\b\2\u00a9\u00ab\u00b2\u00b8\u00c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}