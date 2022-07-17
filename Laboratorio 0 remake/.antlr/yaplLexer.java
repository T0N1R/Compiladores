// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0 remake\yapl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, MINID=23, MAYID=24, NUM=25, 
		STRING=26, DELIMITER=27, QUOTES=28, APOSTROPHE=29, CHAR_LITERAL=30, PARENTESIS=31, 
		COMENTARIO=32, LCOMENTARIO=33;
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
			"T__17", "T__18", "T__19", "T__20", "LETRA", "MAYUSCULA", "MINUSCULA", 
			"DIGIT", "ID", "MINID", "MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", 
			"APOSTROPHE", "CHAR_LITERAL", "PARENTESIS", "COMENTARIO", "LCOMENTARIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'<-'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'self'", "';'", "':'", "'<='", "'}'", 
			"'('", "','", "')'", "'new'", "'.'", null, null, null, null, null, null, 
			"'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "MINID", 
			"MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", 
			"PARENTESIS", "COMENTARIO", "LCOMENTARIO"
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


	public yaplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yapl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u010a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u009e\n\33\f\33\16\33\u00a1"+
		"\13\33\3\34\3\34\3\34\7\34\u00a6\n\34\f\34\16\34\u00a9\13\34\3\35\3\35"+
		"\3\35\7\35\u00ae\n\35\f\35\16\35\u00b1\13\35\3\36\3\36\7\36\u00b5\n\36"+
		"\f\36\16\36\u00b8\13\36\3\37\3\37\3\37\3\37\3\37\7\37\u00bf\n\37\f\37"+
		"\16\37\u00c2\13\37\3\37\3\37\3 \6 \u00c7\n \r \16 \u00c8\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00d9\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\7%\u00ec\n%\f%\16%\u00ef\13%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0104\n&\f&\16&\u0107\13&"+
		"\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\30\67\31"+
		"9\32;\33=\34?\35A\36C\37E G!I\"K#\3\2\7\4\2C\\c|\6\2\f\f..\60\60^^\5\2"+
		"\13\f\17\17\"\"\5\2*,.\60<<\4\2\13\f\17\17\2\u0123\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5W\3\2\2\2\7]\3\2\2\2\tf\3\2\2\2\13"+
		"h\3\2\2\2\rk\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27"+
		"v\3\2\2\2\31x\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0084"+
		"\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2"+
		"+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61\u0096\3\2\2\2\63\u0098"+
		"\3\2\2\2\65\u009a\3\2\2\2\67\u00a2\3\2\2\29\u00aa\3\2\2\2;\u00b2\3\2\2"+
		"\2=\u00b9\3\2\2\2?\u00c6\3\2\2\2A\u00cc\3\2\2\2C\u00ce\3\2\2\2E\u00d8"+
		"\3\2\2\2G\u00da\3\2\2\2I\u00dc\3\2\2\2K\u00f5\3\2\2\2MN\7U\2\2NO\7G\2"+
		"\2OP\7N\2\2PQ\7H\2\2QR\7a\2\2RS\7V\2\2ST\7[\2\2TU\7R\2\2UV\7G\2\2V\4\3"+
		"\2\2\2WX\7e\2\2XY\7n\2\2YZ\7c\2\2Z[\7u\2\2[\\\7u\2\2\\\6\3\2\2\2]^\7k"+
		"\2\2^_\7p\2\2_`\7j\2\2`a\7g\2\2ab\7t\2\2bc\7k\2\2cd\7v\2\2de\7u\2\2e\b"+
		"\3\2\2\2fg\7}\2\2g\n\3\2\2\2hi\7\177\2\2ij\7=\2\2j\f\3\2\2\2kl\7>\2\2"+
		"lm\7/\2\2m\16\3\2\2\2no\7?\2\2o\20\3\2\2\2pq\7-\2\2q\22\3\2\2\2rs\7/\2"+
		"\2s\24\3\2\2\2tu\7,\2\2u\26\3\2\2\2vw\7\61\2\2w\30\3\2\2\2xy\7u\2\2yz"+
		"\7g\2\2z{\7n\2\2{|\7h\2\2|\32\3\2\2\2}~\7=\2\2~\34\3\2\2\2\177\u0080\7"+
		"<\2\2\u0080\36\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0083\7?\2\2\u0083 \3"+
		"\2\2\2\u0084\u0085\7\177\2\2\u0085\"\3\2\2\2\u0086\u0087\7*\2\2\u0087"+
		"$\3\2\2\2\u0088\u0089\7.\2\2\u0089&\3\2\2\2\u008a\u008b\7+\2\2\u008b("+
		"\3\2\2\2\u008c\u008d\7p\2\2\u008d\u008e\7g\2\2\u008e\u008f\7y\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7\60\2\2\u0091,\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		".\3\2\2\2\u0094\u0095\4C\\\2\u0095\60\3\2\2\2\u0096\u0097\4c|\2\u0097"+
		"\62\3\2\2\2\u0098\u0099\4\62;\2\u0099\64\3\2\2\2\u009a\u009f\5-\27\2\u009b"+
		"\u009e\5-\27\2\u009c\u009e\5\63\32\2\u009d\u009b\3\2\2\2\u009d\u009c\3"+
		"\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7\5\61\31\2\u00a3\u00a6\5-\27"+
		"\2\u00a4\u00a6\5\63\32\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a88\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00af\5/\30\2\u00ab\u00ae\5-\27\2\u00ac\u00ae"+
		"\5\63\32\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0:\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b2\u00b6\5\63\32\2\u00b3\u00b5\5\63\32\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7<\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00c0\7$\2\2\u00ba\u00bf\5\65\33\2\u00bb"+
		"\u00bf\7\"\2\2\u00bc\u00bf\5;\36\2\u00bd\u00bf\t\3\2\2\u00be\u00ba\3\2"+
		"\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4>\3\2\2\2\u00c5\u00c7"+
		"\t\4\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b \2\2\u00cb@\3\2\2\2\u00cc"+
		"\u00cd\7$\2\2\u00cdB\3\2\2\2\u00ce\u00cf\7)\2\2\u00cfD\3\2\2\2\u00d0\u00d1"+
		"\7$\2\2\u00d1\u00d2\5\65\33\2\u00d2\u00d3\7$\2\2\u00d3\u00d9\3\2\2\2\u00d4"+
		"\u00d5\5C\"\2\u00d5\u00d6\5\65\33\2\u00d6\u00d7\5C\"\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9F\3\2\2\2\u00da\u00db"+
		"\4*+\2\u00dbH\3\2\2\2\u00dc\u00dd\7*\2\2\u00dd\u00de\7,\2\2\u00de\u00ed"+
		"\3\2\2\2\u00df\u00ec\5\65\33\2\u00e0\u00ec\5;\36\2\u00e1\u00ec\t\5\2\2"+
		"\u00e2\u00ec\5C\"\2\u00e3\u00ec\5=\37\2\u00e4\u00ec\7\"\2\2\u00e5\u00e6"+
		"\7^\2\2\u00e6\u00ec\7p\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7,\2\2\u00e9"+
		"\u00ec\7\"\2\2\u00ea\u00ec\t\6\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e0\3\2"+
		"\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb"+
		"\u00e4\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7+\2"+
		"\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b%\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7"+
		"/\2\2\u00f6\u00f7\7/\2\2\u00f7\u0105\3\2\2\2\u00f8\u0104\5\65\33\2\u00f9"+
		"\u0104\5;\36\2\u00fa\u0104\t\5\2\2\u00fb\u0104\5C\"\2\u00fc\u0104\5=\37"+
		"\2\u00fd\u0104\7\"\2\2\u00fe\u00ff\7^\2\2\u00ff\u0104\7p\2\2\u0100\u0101"+
		"\7\"\2\2\u0101\u0102\7,\2\2\u0102\u0104\7\"\2\2\u0103\u00f8\3\2\2\2\u0103"+
		"\u00f9\3\2\2\2\u0103\u00fa\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2"+
		"\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0100\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b&\2\2\u0109L\3\2\2\2\22\2\u009d"+
		"\u009f\u00a5\u00a7\u00ad\u00af\u00b6\u00be\u00c0\u00c8\u00d8\u00eb\u00ed"+
		"\u0103\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}