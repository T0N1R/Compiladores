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
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFICADOR=14, NUMERO=15;
	public static final int
		RULE_clase = 0, RULE_librerias = 1, RULE_declaracionClase = 2, RULE_declaracionVariable = 3, 
		RULE_declaracionOperacion = 4, RULE_objeto = 5, RULE_tipoVariable = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"clase", "librerias", "declaracionClase", "declaracionVariable", "declaracionOperacion", 
			"objeto", "tipoVariable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'};'", "'inherits'", "'class Main'", "'IO'", 
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(ejemploScannerParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(ejemploScannerParser.IDENTIFICADOR, i);
		}
		public DeclaracionClaseContext declaracionClase() {
			return getRuleContext(DeclaracionClaseContext.class,0);
		}
		public List<LibreriasContext> librerias() {
			return getRuleContexts(LibreriasContext.class);
		}
		public LibreriasContext librerias(int i) {
			return getRuleContext(LibreriasContext.class,i);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_clase);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__0);
				setState(15);
				match(IDENTIFICADOR);
				setState(16);
				match(T__1);
				{
				setState(17);
				declaracionClase();
				}
				setState(18);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(T__0);
				setState(21);
				match(IDENTIFICADOR);
				setState(22);
				match(T__3);
				setState(23);
				match(IDENTIFICADOR);
				setState(24);
				match(T__1);
				{
				setState(25);
				declaracionClase();
				}
				setState(26);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(T__4);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(29);
					match(T__3);
					}
				}

				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==T__6) {
					{
					{
					setState(32);
					librerias();
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(38);
				match(T__1);
				{
				setState(39);
				declaracionClase();
				}
				setState(40);
				match(T__2);
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

	public static class LibreriasContext extends ParserRuleContext {
		public LibreriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_librerias; }
	}

	public final LibreriasContext librerias() throws RecognitionException {
		LibreriasContext _localctx = new LibreriasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_librerias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DeclaracionClaseContext extends ParserRuleContext {
		public List<DeclaracionVariableContext> declaracionVariable() {
			return getRuleContexts(DeclaracionVariableContext.class);
		}
		public DeclaracionVariableContext declaracionVariable(int i) {
			return getRuleContext(DeclaracionVariableContext.class,i);
		}
		public List<DeclaracionOperacionContext> declaracionOperacion() {
			return getRuleContexts(DeclaracionOperacionContext.class);
		}
		public DeclaracionOperacionContext declaracionOperacion(int i) {
			return getRuleContext(DeclaracionOperacionContext.class,i);
		}
		public DeclaracionClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionClase; }
	}

	public final DeclaracionClaseContext declaracionClase() throws RecognitionException {
		DeclaracionClaseContext _localctx = new DeclaracionClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionClase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					declaracionVariable();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFICADOR || _la==NUMERO) {
				{
				{
				setState(53);
				declaracionOperacion();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__7);
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
		public TerminalNode IDENTIFICADOR() { return getToken(ejemploScannerParser.IDENTIFICADOR, 0); }
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
		enterRule(_localctx, 6, RULE_declaracionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IDENTIFICADOR);
			setState(62);
			match(T__8);
			setState(63);
			tipoVariable();
			setState(64);
			match(T__9);
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
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(ejemploScannerParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploScannerParser.NUMERO, 0); }
		public DeclaracionOperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionOperacion; }
	}

	public final DeclaracionOperacionContext declaracionOperacion() throws RecognitionException {
		DeclaracionOperacionContext _localctx = new DeclaracionOperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracionOperacion);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				objeto();
				setState(67);
				match(T__10);
				setState(68);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				objeto();
				setState(71);
				match(T__10);
				setState(72);
				match(NUMERO);
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(ejemploScannerParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(ejemploScannerParser.NUMERO, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==NUMERO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 12, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\2\7\2$\n\2\f\2\16\2\'"+
		"\13\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\4\3\4\7\4\63\n\4\f\4\16\4\66"+
		"\13\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n"+
		"\f\16\2\5\3\2\b\t\3\2\20\21\3\2\16\17\2R\2,\3\2\2\2\4.\3\2\2\2\6\60\3"+
		"\2\2\2\b?\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20\21\7\3\2\2\21\22"+
		"\7\20\2\2\22\23\7\4\2\2\23\24\5\6\4\2\24\25\7\5\2\2\25-\3\2\2\2\26\27"+
		"\7\3\2\2\27\30\7\20\2\2\30\31\7\6\2\2\31\32\7\20\2\2\32\33\7\4\2\2\33"+
		"\34\5\6\4\2\34\35\7\5\2\2\35-\3\2\2\2\36 \7\7\2\2\37!\7\6\2\2 \37\3\2"+
		"\2\2 !\3\2\2\2!%\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\4\2\2)*\5\6\4\2*+\7\5\2\2+-\3\2\2\2"+
		",\20\3\2\2\2,\26\3\2\2\2,\36\3\2\2\2-\3\3\2\2\2./\t\2\2\2/\5\3\2\2\2\60"+
		"\64\7\4\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\5\n\6\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\n\2\2>\7\3\2\2\2?@\7\20"+
		"\2\2@A\7\13\2\2AB\5\16\b\2BC\7\f\2\2C\t\3\2\2\2DE\5\f\7\2EF\7\r\2\2FG"+
		"\7\20\2\2GM\3\2\2\2HI\5\f\7\2IJ\7\r\2\2JK\7\21\2\2KM\3\2\2\2LD\3\2\2\2"+
		"LH\3\2\2\2M\13\3\2\2\2NO\t\3\2\2O\r\3\2\2\2PQ\t\4\2\2Q\17\3\2\2\2\b %"+
		",\64:L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}