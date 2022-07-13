// Generated from ejemploScanner2.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ejemploScanner2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, NUM=25, 
		DELIMITER=26, QUOTES=27, APOSTROPHE=28, CHAR_LITERAL=29, PARENTESIS=30;
	public static final int
		RULE_start = 0, RULE_clase = 1, RULE_declaracionMetodo = 2, RULE_parametrosParaMetodo = 3, 
		RULE_clases = 4, RULE_contenidoClase = 5, RULE_definirVariables = 6, RULE_declaraciones = 7, 
		RULE_declaracionOperacion = 8, RULE_tipoVariable = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "clase", "declaracionMetodo", "parametrosParaMetodo", "clases", 
			"contenidoClase", "definirVariables", "declaraciones", "declaracionOperacion", 
			"tipoVariable"
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

	@Override
	public String getGrammarFileName() { return "ejemploScanner2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ejemploScanner2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<ClaseContext> clase() {
			return getRuleContexts(ClaseContext.class);
		}
		public ClaseContext clase(int i) {
			return getRuleContext(ClaseContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				clase();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClaseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public ContenidoClaseContext contenidoClase() {
			return getRuleContext(ContenidoClaseContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitClase(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__0);
				setState(27);
				match(ID);
				setState(28);
				match(T__1);
				{
				setState(29);
				contenidoClase();
				}
				setState(30);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__0);
				setState(33);
				match(ID);
				setState(34);
				match(T__3);
				{
				setState(35);
				match(ID);
				}
				setState(36);
				match(T__1);
				{
				setState(37);
				contenidoClase();
				}
				setState(38);
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

	public static class DeclaracionMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public List<DeclaracionOperacionContext> declaracionOperacion() {
			return getRuleContexts(DeclaracionOperacionContext.class);
		}
		public DeclaracionOperacionContext declaracionOperacion(int i) {
			return getRuleContext(DeclaracionOperacionContext.class,i);
		}
		public DeclaracionMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterDeclaracionMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitDeclaracionMetodo(this);
		}
	}

	public final DeclaracionMetodoContext declaracionMetodo() throws RecognitionException {
		DeclaracionMetodoContext _localctx = new DeclaracionMetodoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionMetodo);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				setState(43);
				match(T__4);
				setState(44);
				tipoVariable();
				setState(45);
				match(T__1);
				setState(46);
				match(ID);
				setState(47);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ID);
				setState(50);
				match(T__4);
				setState(51);
				tipoVariable();
				setState(52);
				match(T__1);
				setState(53);
				match(T__1);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(54);
					declaracionOperacion();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(T__5);
				setState(61);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(ID);
				setState(64);
				match(T__6);
				setState(65);
				match(ID);
				setState(66);
				match(T__7);
				setState(67);
				tipoVariable();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(68);
					match(T__8);
					setState(69);
					match(ID);
					setState(70);
					match(T__7);
					setState(71);
					tipoVariable();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__9);
				setState(78);
				match(T__7);
				setState(79);
				tipoVariable();
				setState(80);
				match(T__1);
				setState(81);
				match(T__1);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(82);
					declaracionOperacion();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(T__5);
				setState(89);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(T__4);
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

	public static class ParametrosParaMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ejemploScanner2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ejemploScanner2Parser.NUM, i);
		}
		public ParametrosParaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosParaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterParametrosParaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitParametrosParaMetodo(this);
		}
	}

	public final ParametrosParaMetodoContext parametrosParaMetodo() throws RecognitionException {
		ParametrosParaMetodoContext _localctx = new ParametrosParaMetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametrosParaMetodo);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__11);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__6);
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(98);
						match(T__8);
						setState(99);
						match(ID);
						}
						break;
					case 2:
						{
						setState(100);
						match(T__8);
						setState(101);
						match(NUM);
						}
						break;
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClasesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploScanner2Parser.ID, 0); }
		public ContenidoClaseContext contenidoClase() {
			return getRuleContext(ContenidoClaseContext.class,0);
		}
		public ClasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterClases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitClases(this);
		}
	}

	public final ClasesContext clases() throws RecognitionException {
		ClasesContext _localctx = new ClasesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__0);
			setState(111);
			match(ID);
			setState(112);
			match(T__1);
			{
			setState(113);
			contenidoClase();
			}
			setState(114);
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

	public static class ContenidoClaseContext extends ParserRuleContext {
		public List<DefinirVariablesContext> definirVariables() {
			return getRuleContexts(DefinirVariablesContext.class);
		}
		public DefinirVariablesContext definirVariables(int i) {
			return getRuleContext(DefinirVariablesContext.class,i);
		}
		public List<DeclaracionMetodoContext> declaracionMetodo() {
			return getRuleContexts(DeclaracionMetodoContext.class);
		}
		public DeclaracionMetodoContext declaracionMetodo(int i) {
			return getRuleContext(DeclaracionMetodoContext.class,i);
		}
		public ContenidoClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoClase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterContenidoClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitContenidoClase(this);
		}
	}

	public final ContenidoClaseContext contenidoClase() throws RecognitionException {
		ContenidoClaseContext _localctx = new ContenidoClaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contenidoClase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					definirVariables();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==ID) {
				{
				{
				setState(122);
				declaracionMetodo();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefinirVariablesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public List<TerminalNode> QUOTES() { return getTokens(ejemploScanner2Parser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(ejemploScanner2Parser.QUOTES, i);
		}
		public DefinirVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definirVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterDefinirVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitDefinirVariables(this);
		}
	}

	public final DefinirVariablesContext definirVariables() throws RecognitionException {
		DefinirVariablesContext _localctx = new DefinirVariablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definirVariables);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__7);
				setState(130);
				tipoVariable();
				setState(131);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				setState(134);
				match(T__7);
				setState(135);
				match(ID);
				setState(136);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__7);
				setState(139);
				tipoVariable();
				setState(140);
				match(T__14);
				setState(141);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(ID);
				setState(144);
				match(T__7);
				setState(145);
				match(T__16);
				setState(146);
				match(T__14);
				setState(147);
				match(QUOTES);
				{
				setState(148);
				match(ID);
				}
				setState(149);
				match(QUOTES);
				setState(150);
				match(T__13);
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ejemploScanner2Parser.ID, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public List<ClasesContext> clases() {
			return getRuleContexts(ClasesContext.class);
		}
		public ClasesContext clases(int i) {
			return getRuleContext(ClasesContext.class,i);
		}
		public List<DefinirVariablesContext> definirVariables() {
			return getRuleContexts(DefinirVariablesContext.class);
		}
		public DefinirVariablesContext definirVariables(int i) {
			return getRuleContext(DefinirVariablesContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitDeclaraciones(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaraciones);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__7);
				setState(155);
				tipoVariable();
				setState(156);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(158);
					clases();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(164);
					definirVariables();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DeclaracionOperacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(ejemploScanner2Parser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(ejemploScanner2Parser.QUOTES, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ejemploScanner2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ejemploScanner2Parser.NUM, i);
		}
		public DeclaracionOperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionOperacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterDeclaracionOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitDeclaracionOperacion(this);
		}
	}

	public final DeclaracionOperacionContext declaracionOperacion() throws RecognitionException {
		DeclaracionOperacionContext _localctx = new DeclaracionOperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionOperacion);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ID);
				setState(173);
				match(T__14);
				setState(174);
				match(QUOTES);
				setState(175);
				match(ID);
				setState(176);
				match(QUOTES);
				setState(177);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(ID);
				setState(179);
				match(T__14);
				setState(180);
				match(ID);
				setState(181);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(ID);
				setState(183);
				match(T__14);
				setState(184);
				match(NUM);
				setState(185);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__14);
				setState(188);
				match(T__15);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__17);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(ID);
				setState(191);
				match(T__14);
				setState(192);
				match(T__6);
				setState(193);
				match(T__18);
				setState(194);
				match(ID);
				setState(195);
				match(T__12);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				match(ID);
				setState(197);
				match(T__19);
				setState(198);
				match(ID);
				setState(199);
				match(T__6);
				setState(200);
				match(QUOTES);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(201);
					match(ID);
					}
				}

				setState(204);
				match(QUOTES);
				setState(205);
				match(T__12);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__19);
				setState(208);
				match(ID);
				setState(209);
				match(T__6);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(210);
					match(NUM);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(T__12);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitTipoVariable(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		"\u0004\u0001\u001e\u00de\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000"+
		"\n\u0000\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002"+
		"\f\u0002W\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003g\b\u0003\n\u0003"+
		"\f\u0003j\t\u0003\u0001\u0003\u0003\u0003m\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005"+
		"v\b\u0005\n\u0005\f\u0005y\t\u0005\u0001\u0005\u0005\u0005|\b\u0005\n"+
		"\u0005\f\u0005\u007f\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0098\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a0\b\u0007\n"+
		"\u0007\f\u0007\u00a3\t\u0007\u0001\u0007\u0005\u0007\u00a6\b\u0007\n\u0007"+
		"\f\u0007\u00a9\t\u0007\u0003\u0007\u00ab\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00cb\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00d4\b\b\n\b\f\b\u00d7\t\b\u0001\b\u0003\b\u00da\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0002\u0001\u0000\u0018\u0019\u0002\u0000\u0011\u0011\u0015"+
		"\u0017\u00f1\u0000\u0017\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006l\u0001\u0000\u0000\u0000"+
		"\bn\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000"+
		"\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010\u00d9\u0001\u0000"+
		"\u0000\u0000\u0012\u00db\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002"+
		"\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005\u0018"+
		"\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e\u0003\n\u0005"+
		"\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f)\u0001\u0000\u0000\u0000"+
		" !\u0005\u0001\u0000\u0000!\"\u0005\u0018\u0000\u0000\"#\u0005\u0004\u0000"+
		"\u0000#$\u0005\u0018\u0000\u0000$%\u0005\u0002\u0000\u0000%&\u0003\n\u0005"+
		"\u0000&\'\u0005\u0003\u0000\u0000\')\u0001\u0000\u0000\u0000(\u001a\u0001"+
		"\u0000\u0000\u0000( \u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0018\u0000\u0000+,\u0005\u0005\u0000\u0000,-\u0003\u0012"+
		"\t\u0000-.\u0005\u0002\u0000\u0000./\u0005\u0018\u0000\u0000/0\u0005\u0003"+
		"\u0000\u00000]\u0001\u0000\u0000\u000012\u0005\u0018\u0000\u000023\u0005"+
		"\u0005\u0000\u000034\u0003\u0012\t\u000045\u0005\u0002\u0000\u000059\u0005"+
		"\u0002\u0000\u000068\u0003\u0010\b\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000"+
		"\u0000=>\u0005\u0003\u0000\u0000>]\u0001\u0000\u0000\u0000?@\u0005\u0018"+
		"\u0000\u0000@A\u0005\u0007\u0000\u0000AB\u0005\u0018\u0000\u0000BC\u0005"+
		"\b\u0000\u0000CJ\u0003\u0012\t\u0000DE\u0005\t\u0000\u0000EF\u0005\u0018"+
		"\u0000\u0000FG\u0005\b\u0000\u0000GI\u0003\u0012\t\u0000HD\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"MN\u0005\n\u0000\u0000NO\u0005\b\u0000\u0000OP\u0003\u0012\t\u0000PQ\u0005"+
		"\u0002\u0000\u0000QU\u0005\u0002\u0000\u0000RT\u0003\u0010\b\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0006\u0000\u0000YZ\u0005\u0003\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[]\u0005\u0005\u0000\u0000\\*\u0001\u0000\u0000\u0000\\1\u0001"+
		"\u0000\u0000\u0000\\?\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]\u0005\u0001\u0000\u0000\u0000^m\u0005\u000b\u0000\u0000_m\u0005\f\u0000"+
		"\u0000`a\u0005\u0007\u0000\u0000ah\u0007\u0000\u0000\u0000bc\u0005\t\u0000"+
		"\u0000cg\u0005\u0018\u0000\u0000de\u0005\t\u0000\u0000eg\u0005\u0019\u0000"+
		"\u0000fb\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0005\r\u0000\u0000l^\u0001"+
		"\u0000\u0000\u0000l_\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000"+
		"m\u0007\u0001\u0000\u0000\u0000no\u0005\u0001\u0000\u0000op\u0005\u0018"+
		"\u0000\u0000pq\u0005\u0002\u0000\u0000qr\u0003\n\u0005\u0000rs\u0005\u0003"+
		"\u0000\u0000s\t\u0001\u0000\u0000\u0000tv\u0003\f\u0006\u0000ut\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x}\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z|\u0003\u0004\u0002\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u000b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0018\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0003"+
		"\u0012\t\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084\u0098\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0087\u0005\b\u0000"+
		"\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088\u0098\u0005\u000e\u0000"+
		"\u0000\u0089\u008a\u0005\u0018\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000"+
		"\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d"+
		"\u008e\u0005\u0010\u0000\u0000\u008e\u0098\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0018\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u0092"+
		"\u0005\u0011\u0000\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0094"+
		"\u0005\u001b\u0000\u0000\u0094\u0095\u0005\u0018\u0000\u0000\u0095\u0096"+
		"\u0005\u001b\u0000\u0000\u0096\u0098\u0005\u000e\u0000\u0000\u0097\u0080"+
		"\u0001\u0000\u0000\u0000\u0097\u0085\u0001\u0000\u0000\u0000\u0097\u0089"+
		"\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0098\r\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0018\u0000\u0000\u009a\u009b\u0005"+
		"\b\u0000\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c\u009d\u0005\u000e"+
		"\u0000\u0000\u009d\u00ab\u0001\u0000\u0000\u0000\u009e\u00a0\u0003\b\u0004"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00ab\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0003\f\u0006\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u0099\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0018\u0000\u0000"+
		"\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af\u0005\u001b\u0000\u0000"+
		"\u00af\u00b0\u0005\u0018\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000"+
		"\u00b1\u00da\u0005\u000e\u0000\u0000\u00b2\u00b3\u0005\u0018\u0000\u0000"+
		"\u00b3\u00b4\u0005\u000f\u0000\u0000\u00b4\u00b5\u0005\u0018\u0000\u0000"+
		"\u00b5\u00da\u0005\u000e\u0000\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000"+
		"\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0005\u0019\u0000\u0000"+
		"\u00b9\u00da\u0005\u000e\u0000\u0000\u00ba\u00bb\u0005\u0018\u0000\u0000"+
		"\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00da\u0005\u0010\u0000\u0000"+
		"\u00bd\u00da\u0005\u0012\u0000\u0000\u00be\u00bf\u0005\u0018\u0000\u0000"+
		"\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0013\u0000\u0000\u00c2\u00c3\u0005\u0018\u0000\u0000"+
		"\u00c3\u00da\u0005\r\u0000\u0000\u00c4\u00c5\u0005\u0018\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0014\u0000\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000\u00c7"+
		"\u00c8\u0005\u0007\u0000\u0000\u00c8\u00ca\u0005\u001b\u0000\u0000\u00c9"+
		"\u00cb\u0005\u0018\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u001b\u0000\u0000\u00cd\u00da\u0005\r\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0018\u0000\u0000\u00cf\u00d0\u0005\u0014\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0018\u0000\u0000\u00d1\u00d5\u0005\u0007\u0000\u0000\u00d2\u00d4"+
		"\u0005\u0019\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\r\u0000\u0000\u00d9\u00ac\u0001"+
		"\u0000\u0000\u0000\u00d9\u00b2\u0001\u0000\u0000\u0000\u00d9\u00b6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00ba\u0001\u0000\u0000\u0000\u00d9\u00bd\u0001"+
		"\u0000\u0000\u0000\u00d9\u00be\u0001\u0000\u0000\u0000\u00d9\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d9\u00ce\u0001\u0000\u0000\u0000\u00da\u0011\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0007\u0001\u0000\u0000\u00dc\u0013\u0001"+
		"\u0000\u0000\u0000\u0012\u0017(9JU\\fhlw}\u0097\u00a1\u00a7\u00aa\u00ca"+
		"\u00d5\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}