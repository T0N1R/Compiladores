// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0\ejemploScanner.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploScannerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, DELIMITER=12, QUOTES=13, APOSTROPHE=14, CHAR_LITERAL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"LETTER", "DIGIT", "ID", "NUM", "DELIMITER", "QUOTES", "APOSTROPHE", 
			"CHAR_LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class Main inherits IO {'", "'main(): Object {'", "'};'", "':'", 
			"';'", "'{'", "'<-'", "'}'", "'Int'", null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL"
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


	public ejemploScannerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ejemploScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r"+
		"i\n\r\f\r\16\rl\13\r\3\16\3\16\7\16p\n\16\f\16\16\16s\13\16\3\17\6\17"+
		"v\n\17\r\17\16\17w\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0088\n\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\2\27\2\31\f\33\r\35\16\37\17!\20#\21\3\2\4\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\2\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5>\3\2\2\2\7O\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rV\3\2\2\2"+
		"\17X\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31e\3\2\2"+
		"\2\33m\3\2\2\2\35u\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\u0087\3\2\2\2%&\7e\2"+
		"\2&\'\7n\2\2\'(\7c\2\2()\7u\2\2)*\7u\2\2*+\7\"\2\2+,\7O\2\2,-\7c\2\2-"+
		".\7k\2\2./\7p\2\2/\60\7\"\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7j\2\2\63"+
		"\64\7g\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67\7v\2\2\678\7u\2\289\7\"\2\2"+
		"9:\7K\2\2:;\7Q\2\2;<\7\"\2\2<=\7}\2\2=\4\3\2\2\2>?\7o\2\2?@\7c\2\2@A\7"+
		"k\2\2AB\7p\2\2BC\7*\2\2CD\7+\2\2DE\7<\2\2EF\7\"\2\2FG\7Q\2\2GH\7d\2\2"+
		"HI\7l\2\2IJ\7g\2\2JK\7e\2\2KL\7v\2\2LM\7\"\2\2MN\7}\2\2N\6\3\2\2\2OP\7"+
		"\177\2\2PQ\7=\2\2Q\b\3\2\2\2RS\7<\2\2S\n\3\2\2\2TU\7=\2\2U\f\3\2\2\2V"+
		"W\7}\2\2W\16\3\2\2\2XY\7>\2\2YZ\7/\2\2Z\20\3\2\2\2[\\\7\177\2\2\\\22\3"+
		"\2\2\2]^\7K\2\2^_\7p\2\2_`\7v\2\2`\24\3\2\2\2ab\t\2\2\2b\26\3\2\2\2cd"+
		"\4\62;\2d\30\3\2\2\2ej\5\25\13\2fi\5\25\13\2gi\5\27\f\2hf\3\2\2\2hg\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\32\3\2\2\2lj\3\2\2\2mq\5\27\f\2"+
		"np\5\27\f\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\34\3\2\2\2sq\3\2"+
		"\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\b\17"+
		"\2\2z\36\3\2\2\2{|\7$\2\2| \3\2\2\2}~\7)\2\2~\"\3\2\2\2\177\u0080\7$\2"+
		"\2\u0080\u0081\5\25\13\2\u0081\u0082\7$\2\2\u0082\u0088\3\2\2\2\u0083"+
		"\u0084\5!\21\2\u0084\u0085\5\25\13\2\u0085\u0086\5!\21\2\u0086\u0088\3"+
		"\2\2\2\u0087\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088$\3\2\2\2\b\2hjqw\u0087"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}