// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1\Proy1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Proy1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, NUM=41, STRING=42, DELIMITER=43, QUOTES=44, APOSTROPHE=45, 
		CHAR_LITERAL=46, PARENTESIS=47, COMENTARIO=48, LCOMENTARIO=49;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "LETRA", "DIGIT", 
			"ID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", 
			"PARENTESIS", "COMENTARIO", "LCOMENTARIO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'true'", 
			"'false'", "','", "'.'", "';'", "'self'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'new'", "'isvoid'", "':'", "'<-'", 
			"'('", "')'", "'}'", "'not'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'~'", "'@'", null, null, null, 
			null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUM", "STRING", "DELIMITER", "QUOTES", 
			"APOSTROPHE", "CHAR_LITERAL", "PARENTESIS", "COMENTARIO", "LCOMENTARIO"
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


	public Proy1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Proy1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u015c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\7+\u00fe"+
		"\n+\f+\16+\u0101\13+\3,\3,\7,\u0105\n,\f,\16,\u0108\13,\3-\3-\3-\3-\3"+
		"-\3-\7-\u0110\n-\f-\16-\u0113\13-\3-\3-\3.\6.\u0118\n.\r.\16.\u0119\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u012a"+
		"\n\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u013d\n\63\f\63\16\63\u0140\13\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\7\64\u0156\n\64\f\64\16\64\u0159\13\64\3\64\3\64"+
		"\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U*W+Y,[-]._/a\60c\61e\62g\63\3\2\7"+
		"\5\2C\\aac|\7\2\f\f##..\60\60^^\5\2\13\f\17\17\"\"\6\2*,.\61<<>A\5\2\13"+
		"\f\17\17==\2\u0175\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5s\3\2\2\2\7y\3\2\2\2\t\u0082"+
		"\3\2\2\2\13\u0084\3\2\2\2\r\u0087\3\2\2\2\17\u008c\3\2\2\2\21\u0092\3"+
		"\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009d\3\2"+
		"\2\2\33\u009f\3\2\2\2\35\u00a1\3\2\2\2\37\u00a3\3\2\2\2!\u00a5\3\2\2\2"+
		"#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b1\3"+
		"\2\2\2-\u00b5\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c1\3\2\2\2"+
		"\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7\3\2\2\2;\u00cb\3\2\2\2=\u00ce"+
		"\3\2\2\2?\u00d3\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E\u00e1\3\2\2\2G"+
		"\u00e6\3\2\2\2I\u00eb\3\2\2\2K\u00ef\3\2\2\2M\u00f2\3\2\2\2O\u00f4\3\2"+
		"\2\2Q\u00f6\3\2\2\2S\u00f8\3\2\2\2U\u00fa\3\2\2\2W\u0102\3\2\2\2Y\u0109"+
		"\3\2\2\2[\u0117\3\2\2\2]\u011d\3\2\2\2_\u011f\3\2\2\2a\u0129\3\2\2\2c"+
		"\u012b\3\2\2\2e\u012d\3\2\2\2g\u0146\3\2\2\2ij\7U\2\2jk\7G\2\2kl\7N\2"+
		"\2lm\7H\2\2mn\7a\2\2no\7V\2\2op\7[\2\2pq\7R\2\2qr\7G\2\2r\4\3\2\2\2st"+
		"\7e\2\2tu\7n\2\2uv\7c\2\2vw\7u\2\2wx\7u\2\2x\6\3\2\2\2yz\7k\2\2z{\7p\2"+
		"\2{|\7j\2\2|}\7g\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7u\2\2\u0081\b\3\2\2\2\u0082\u0083\7}\2\2\u0083\n\3\2\2\2\u0084\u0085"+
		"\7\177\2\2\u0085\u0086\7=\2\2\u0086\f\3\2\2\2\u0087\u0088\7v\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7w\2\2\u008a\u008b\7g\2\2\u008b\16\3\2\2\2\u008c"+
		"\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7g\2\2\u0091\20\3\2\2\2\u0092\u0093\7.\2\2\u0093\22\3\2\2"+
		"\2\u0094\u0095\7\60\2\2\u0095\24\3\2\2\2\u0096\u0097\7=\2\2\u0097\26\3"+
		"\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7h\2\2\u009c\30\3\2\2\2\u009d\u009e\7-\2\2\u009e\32\3\2\2\2\u009f"+
		"\u00a0\7/\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\36\3\2\2\2\u00a3"+
		"\u00a4\7\61\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\"\3\2\2\2\u00a7"+
		"\u00a8\7>\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7>\2\2\u00ac\u00ad\7?\2\2\u00ad(\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0"+
		"\7?\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4"+
		"\7y\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8"+
		"\7x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7f\2\2\u00bb"+
		".\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\60\3\2\2\2\u00be\u00bf\7>\2\2\u00bf"+
		"\u00c0\7/\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\64\3\2\2\2\u00c3"+
		"\u00c4\7+\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c68\3\2\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7v\2\2\u00ca:\3\2\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf"+
		"\u00d0\7j\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2\u00d2>\3\2\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2"+
		"\u00d7@\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7k\2\2\u00daB\3\2\2\2\u00db"+
		"\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7q\2"+
		"\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7r\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7"+
		"r\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00eaH"+
		"\3\2\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee"+
		"J\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1L\3\2\2\2\u00f2\u00f3"+
		"\7\u0080\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7B\2\2\u00f5P\3\2\2\2\u00f6\u00f7"+
		"\t\2\2\2\u00f7R\3\2\2\2\u00f8\u00f9\4\62;\2\u00f9T\3\2\2\2\u00fa\u00ff"+
		"\5Q)\2\u00fb\u00fe\5Q)\2\u00fc\u00fe\5S*\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"V\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0106\5S*\2\u0103\u0105\5S*\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107X\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0111\7$\2\2\u010a\u0110"+
		"\5U+\2\u010b\u0110\7\"\2\2\u010c\u0110\5W,\2\u010d\u0110\t\3\2\2\u010e"+
		"\u0110\5_\60\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\7$\2\2\u0115Z\3\2\2\2\u0116\u0118\t\4\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\b.\2\2\u011c\\\3\2\2\2\u011d\u011e\7$\2\2\u011e"+
		"^\3\2\2\2\u011f\u0120\7)\2\2\u0120`\3\2\2\2\u0121\u0122\7$\2\2\u0122\u0123"+
		"\5U+\2\u0123\u0124\7$\2\2\u0124\u012a\3\2\2\2\u0125\u0126\5_\60\2\u0126"+
		"\u0127\5U+\2\u0127\u0128\5_\60\2\u0128\u012a\3\2\2\2\u0129\u0121\3\2\2"+
		"\2\u0129\u0125\3\2\2\2\u012ab\3\2\2\2\u012b\u012c\4*+\2\u012cd\3\2\2\2"+
		"\u012d\u012e\7*\2\2\u012e\u012f\7,\2\2\u012f\u013e\3\2\2\2\u0130\u013d"+
		"\5U+\2\u0131\u013d\5W,\2\u0132\u013d\t\5\2\2\u0133\u013d\5_\60\2\u0134"+
		"\u013d\5Y-\2\u0135\u013d\7\"\2\2\u0136\u0137\7^\2\2\u0137\u013d\7p\2\2"+
		"\u0138\u0139\7\"\2\2\u0139\u013a\7,\2\2\u013a\u013d\7\"\2\2\u013b\u013d"+
		"\t\6\2\2\u013c\u0130\3\2\2\2\u013c\u0131\3\2\2\2\u013c\u0132\3\2\2\2\u013c"+
		"\u0133\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0135\3\2\2\2\u013c\u0136\3\2"+
		"\2\2\u013c\u0138\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0142\7,\2\2\u0142\u0143\7+\2\2\u0143\u0144\3\2\2\2\u0144\u0145"+
		"\b\63\2\2\u0145f\3\2\2\2\u0146\u0147\7/\2\2\u0147\u0148\7/\2\2\u0148\u0157"+
		"\3\2\2\2\u0149\u0156\5U+\2\u014a\u0156\5W,\2\u014b\u0156\t\5\2\2\u014c"+
		"\u0156\5_\60\2\u014d\u0156\5Y-\2\u014e\u0156\7\"\2\2\u014f\u0150\7^\2"+
		"\2\u0150\u0156\7p\2\2\u0151\u0152\7\"\2\2\u0152\u0153\7,\2\2\u0153\u0156"+
		"\7\"\2\2\u0154\u0156\7=\2\2\u0155\u0149\3\2\2\2\u0155\u014a\3\2\2\2\u0155"+
		"\u014b\3\2\2\2\u0155\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2"+
		"\2\2\u0155\u014f\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015b\b\64\2\2\u015bh\3\2\2\2\16\2\u00fd"+
		"\u00ff\u0106\u010f\u0111\u0119\u0129\u013c\u013e\u0155\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}