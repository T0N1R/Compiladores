// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0\ejemploScanner.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploScannerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, DELIMITER=12, QUOTES=13, APOSTROPHE=14, CHAR_LITERAL=15;
	public static final int
		RULE_clase = 0, RULE_declaracionVariable = 1, RULE_declaracionOperacion = 2, 
		RULE_tipoVariable = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"clase", "declaracionVariable", "declaracionOperacion", "tipoVariable"
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

	@Override
	public String getGrammarFileName() { return "ejemploScanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ejemploScannerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClaseContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionOperacionContext declaracionOperacion() {
			return getRuleContext(DeclaracionOperacionContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			{
			setState(9);
			declaracionVariable();
			}
			setState(10);
			match(T__1);
			{
			setState(11);
			declaracionOperacion();
			}
			setState(12);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploScannerParser.ID, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(ID);
			setState(15);
			match(T__3);
			setState(16);
			tipoVariable();
			setState(17);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionOperacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScannerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScannerParser.ID, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(ejemploScannerParser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(ejemploScannerParser.QUOTES, i);
		}
		public TerminalNode NUM() { return getToken(ejemploScannerParser.NUM, 0); }
		public DeclaracionOperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionOperacion; }
	}

	public final DeclaracionOperacionContext declaracionOperacion() throws RecognitionException {
		DeclaracionOperacionContext _localctx = new DeclaracionOperacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionOperacion);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__5);
				setState(20);
				match(ID);
				setState(21);
				match(T__6);
				setState(22);
				match(QUOTES);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(23);
					match(ID);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				match(QUOTES);
				setState(30);
				match(T__4);
				setState(31);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__5);
				setState(33);
				match(ID);
				setState(34);
				match(T__6);
				setState(35);
				match(ID);
				setState(36);
				match(T__4);
				setState(37);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__5);
				setState(39);
				match(ID);
				setState(40);
				match(T__6);
				setState(41);
				match(NUM);
				setState(42);
				match(T__4);
				setState(43);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2"+
		"\2\2\61\2\n\3\2\2\2\4\20\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\13\7\3\2\2"+
		"\13\f\5\4\3\2\f\r\7\4\2\2\r\16\5\6\4\2\16\17\7\5\2\2\17\3\3\2\2\2\20\21"+
		"\7\f\2\2\21\22\7\6\2\2\22\23\5\b\5\2\23\24\7\7\2\2\24\5\3\2\2\2\25\26"+
		"\7\b\2\2\26\27\7\f\2\2\27\30\7\t\2\2\30\34\7\17\2\2\31\33\7\f\2\2\32\31"+
		"\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34"+
		"\3\2\2\2\37 \7\17\2\2 !\7\7\2\2!/\7\n\2\2\"#\7\b\2\2#$\7\f\2\2$%\7\t\2"+
		"\2%&\7\f\2\2&\'\7\7\2\2\'/\7\n\2\2()\7\b\2\2)*\7\f\2\2*+\7\t\2\2+,\7\r"+
		"\2\2,-\7\7\2\2-/\7\n\2\2.\25\3\2\2\2.\"\3\2\2\2.(\3\2\2\2/\7\3\2\2\2\60"+
		"\61\7\13\2\2\61\t\3\2\2\2\4\34.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}