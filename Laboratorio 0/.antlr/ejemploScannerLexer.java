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
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFICADOR=14, NUMERO=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "PALABRA", "ENTERO", "IDENTIFICADOR", 
			"NUMERO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "'class Main'", "'{'", "'};'", "'IO'", 
			"'Object'", "'}'", "':'", "';'", "'<-'", "'Int'", "'String'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFICADOR", "NUMERO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\7\21j\n\21\f\21\16\21m\13\21\3\22\3\22\7\22q\n\22\f\22\16\22"+
		"t\13\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\2\37\2!\20#\21\3\2\3\4\2C\\c|\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7\64\3\2\2\2\t?\3\2\2\2\13"+
		"A\3\2\2\2\rD\3\2\2\2\17G\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27"+
		"T\3\2\2\2\31W\3\2\2\2\33[\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#n"+
		"\3\2\2\2%&\7e\2\2&\'\7n\2\2\'(\7c\2\2()\7u\2\2)*\7u\2\2*\4\3\2\2\2+,\7"+
		"k\2\2,-\7p\2\2-.\7j\2\2./\7g\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7v\2\2"+
		"\62\63\7u\2\2\63\6\3\2\2\2\64\65\7e\2\2\65\66\7n\2\2\66\67\7c\2\2\678"+
		"\7u\2\289\7u\2\29:\7\"\2\2:;\7O\2\2;<\7c\2\2<=\7k\2\2=>\7p\2\2>\b\3\2"+
		"\2\2?@\7}\2\2@\n\3\2\2\2AB\7\177\2\2BC\7=\2\2C\f\3\2\2\2DE\7K\2\2EF\7"+
		"Q\2\2F\16\3\2\2\2GH\7Q\2\2HI\7d\2\2IJ\7l\2\2JK\7g\2\2KL\7e\2\2LM\7v\2"+
		"\2M\20\3\2\2\2NO\7\177\2\2O\22\3\2\2\2PQ\7<\2\2Q\24\3\2\2\2RS\7=\2\2S"+
		"\26\3\2\2\2TU\7>\2\2UV\7/\2\2V\30\3\2\2\2WX\7K\2\2XY\7p\2\2YZ\7v\2\2Z"+
		"\32\3\2\2\2[\\\7U\2\2\\]\7v\2\2]^\7t\2\2^_\7k\2\2_`\7p\2\2`a\7i\2\2a\34"+
		"\3\2\2\2bc\t\2\2\2c\36\3\2\2\2de\4\62;\2e \3\2\2\2fk\5\35\17\2gj\5\35"+
		"\17\2hj\5\37\20\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\""+
		"\3\2\2\2mk\3\2\2\2nr\5\37\20\2oq\5\37\20\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s$\3\2\2\2tr\3\2\2\2\6\2ikr\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}