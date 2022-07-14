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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ID=26, NUM=27, STRING=28, DELIMITER=29, QUOTES=30, APOSTROPHE=31, 
		CHAR_LITERAL=32, PARENTESIS=33;
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
			null, "'class'", "'{'", "'};'", "'inherits'", "'('", "')'", "':'", "'}'", 
			"','", "'main() :'", "'main():'", "'();'", "'() ;'", "';'", "'<-'", "'\"\";'", 
			"'String'", "'self;'", "'new'", "');'", "'.'", "'()'", "'Int'", "'SELF_TYPE'", 
			"'Object'", null, null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", 
			"CHAR_LITERAL", "PARENTESIS"
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
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(ID);
				setState(43);
				match(T__4);
				setState(44);
				match(T__5);
				setState(45);
				match(T__6);
				setState(46);
				tipoVariable();
				setState(47);
				match(T__1);
				setState(48);
				match(ID);
				setState(49);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__4);
				setState(53);
				match(T__5);
				setState(54);
				match(T__6);
				setState(55);
				tipoVariable();
				setState(56);
				match(T__1);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(57);
					declaracionOperacion();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__4);
				setState(67);
				match(T__5);
				setState(68);
				match(T__6);
				setState(69);
				tipoVariable();
				setState(70);
				match(T__1);
				setState(71);
				match(T__1);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(72);
					declaracionOperacion();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				match(T__7);
				setState(79);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__4);
				setState(83);
				match(ID);
				setState(84);
				match(T__6);
				setState(85);
				tipoVariable();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(86);
					match(T__8);
					setState(87);
					match(ID);
					setState(88);
					match(T__6);
					setState(89);
					tipoVariable();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__5);
				setState(96);
				match(T__6);
				setState(97);
				tipoVariable();
				setState(98);
				match(T__1);
				setState(99);
				match(T__1);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(100);
					declaracionOperacion();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(T__7);
				setState(107);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__9);
				setState(110);
				tipoVariable();
				setState(111);
				match(T__1);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(112);
					declaracionOperacion();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(T__10);
				setState(121);
				tipoVariable();
				setState(122);
				match(T__1);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17 || _la==ID) {
					{
					{
					setState(123);
					declaracionOperacion();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
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

	public static class ParametrosParaMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ejemploScanner2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ejemploScanner2Parser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ejemploScanner2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ejemploScanner2Parser.NUM, i);
		}
		public TerminalNode STRING() { return getToken(ejemploScanner2Parser.STRING, 0); }
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__12);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__4);
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(137);
						match(T__8);
						setState(138);
						match(ID);
						}
						break;
					case 2:
						{
						setState(139);
						match(T__8);
						setState(140);
						match(NUM);
						}
						break;
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__4);
				setState(149);
				match(STRING);
				setState(150);
				match(T__5);
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
			setState(153);
			match(T__0);
			setState(154);
			match(ID);
			setState(155);
			match(T__1);
			{
			setState(156);
			contenidoClase();
			}
			setState(157);
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
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					definirVariables();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(165);
				declaracionMetodo();
				}
				}
				setState(170);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(172);
				match(T__6);
				setState(173);
				tipoVariable();
				setState(174);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(ID);
				setState(177);
				match(T__6);
				setState(178);
				match(ID);
				setState(179);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__6);
				setState(182);
				tipoVariable();
				setState(183);
				match(T__14);
				setState(184);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(ID);
				setState(187);
				match(T__6);
				setState(188);
				match(T__16);
				setState(189);
				match(T__14);
				setState(190);
				match(QUOTES);
				{
				setState(191);
				match(ID);
				}
				setState(192);
				match(QUOTES);
				setState(193);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(ID);
				setState(197);
				match(T__6);
				setState(198);
				tipoVariable();
				setState(199);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(201);
					clases();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(207);
					definirVariables();
					}
					}
					setState(212);
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
		public TerminalNode STRING() { return getToken(ejemploScanner2Parser.STRING, 0); }
		public List<TerminalNode> NUM() { return getTokens(ejemploScanner2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ejemploScanner2Parser.NUM, i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(ejemploScanner2Parser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(ejemploScanner2Parser.QUOTES, i);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				setState(216);
				match(T__14);
				setState(217);
				match(STRING);
				setState(218);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__14);
				setState(221);
				match(ID);
				setState(222);
				match(T__13);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(ID);
				setState(224);
				match(T__14);
				setState(225);
				match(NUM);
				setState(226);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(ID);
				setState(228);
				match(T__14);
				setState(229);
				match(T__15);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(T__17);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(ID);
				setState(232);
				match(T__14);
				setState(233);
				match(T__4);
				setState(234);
				match(T__18);
				setState(235);
				match(ID);
				setState(236);
				match(T__19);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__20);
				setState(239);
				match(ID);
				setState(240);
				match(T__4);
				setState(241);
				match(QUOTES);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(242);
					match(ID);
					}
				}

				setState(245);
				match(QUOTES);
				setState(246);
				match(T__19);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(ID);
				setState(248);
				match(T__20);
				setState(249);
				match(ID);
				setState(250);
				match(T__4);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(251);
					match(NUM);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__19);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__4);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(260);
					match(ID);
					setState(261);
					match(T__20);
					setState(262);
					match(ID);
					setState(263);
					match(T__4);
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(264);
						match(NUM);
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(270);
					match(T__5);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(T__19);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				match(ID);
				setState(278);
				match(T__4);
				setState(279);
				match(STRING);
				setState(280);
				match(T__5);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(281);
					match(T__13);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(284);
				match(ID);
				setState(285);
				match(T__4);
				{
				setState(286);
				match(T__4);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(287);
					match(ID);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(T__5);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(294);
					match(T__20);
					setState(295);
					match(ID);
					setState(296);
					match(T__21);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(T__5);
				}
				setState(304);
				match(T__5);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__20) {
					{
					setState(305);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__20) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
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
			setState(310);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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
		"\u0004\u0001!\u0139\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002"+
		"\n\u0002\f\u0002>\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002J\b\u0002\n\u0002\f\u0002M\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002[\b\u0002"+
		"\n\u0002\f\u0002^\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"}\b\u0002\n\u0002\f\u0002\u0080\t\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0084\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008e\b\u0003\n"+
		"\u0003\f\u0003\u0091\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0098\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u00a1"+
		"\b\u0005\n\u0005\f\u0005\u00a4\t\u0005\u0001\u0005\u0005\u0005\u00a7\b"+
		"\u0005\n\u0005\f\u0005\u00aa\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00c3\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00cb\b\u0007"+
		"\n\u0007\f\u0007\u00ce\t\u0007\u0001\u0007\u0005\u0007\u00d1\b\u0007\n"+
		"\u0007\f\u0007\u00d4\t\u0007\u0003\u0007\u00d6\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00f4\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00fd\b\b\n\b\f\b\u0100\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u010a\b\b\n\b\f\b\u010d\t\b\u0001\b\u0005"+
		"\b\u0110\b\b\n\b\f\b\u0113\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u011b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0121"+
		"\b\b\n\b\f\b\u0124\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u012a\b"+
		"\b\n\b\f\b\u012d\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0133\b\b"+
		"\u0003\b\u0135\b\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u001a\u001b\u0002"+
		"\u0000\u000e\u000e\u0015\u0015\u0002\u0000\u0011\u0011\u0017\u0019\u015b"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004"+
		"\u0083\u0001\u0000\u0000\u0000\u0006\u0097\u0001\u0000\u0000\u0000\b\u0099"+
		"\u0001\u0000\u0000\u0000\n\u00a2\u0001\u0000\u0000\u0000\f\u00c2\u0001"+
		"\u0000\u0000\u0000\u000e\u00d5\u0001\u0000\u0000\u0000\u0010\u0134\u0001"+
		"\u0000\u0000\u0000\u0012\u0136\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\u001a\u0000\u0000\u001c\u001d\u0005\u0002\u0000\u0000\u001d\u001e\u0003"+
		"\n\u0005\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f)\u0001\u0000"+
		"\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u001a\u0000\u0000\"#\u0005"+
		"\u0004\u0000\u0000#$\u0005\u001a\u0000\u0000$%\u0005\u0002\u0000\u0000"+
		"%&\u0003\n\u0005\u0000&\'\u0005\u0003\u0000\u0000\')\u0001\u0000\u0000"+
		"\u0000(\u001a\u0001\u0000\u0000\u0000( \u0001\u0000\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*+\u0005\u001a\u0000\u0000+,\u0005\u0005\u0000"+
		"\u0000,-\u0005\u0006\u0000\u0000-.\u0005\u0007\u0000\u0000./\u0003\u0012"+
		"\t\u0000/0\u0005\u0002\u0000\u000001\u0005\u001a\u0000\u000012\u0005\u0003"+
		"\u0000\u00002\u0084\u0001\u0000\u0000\u000034\u0005\u001a\u0000\u0000"+
		"45\u0005\u0005\u0000\u000056\u0005\u0006\u0000\u000067\u0005\u0007\u0000"+
		"\u000078\u0003\u0012\t\u00008<\u0005\u0002\u0000\u00009;\u0003\u0010\b"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?@\u0005\u0003\u0000\u0000@\u0084\u0001\u0000\u0000"+
		"\u0000AB\u0005\u001a\u0000\u0000BC\u0005\u0005\u0000\u0000CD\u0005\u0006"+
		"\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0012\t\u0000FG\u0005\u0002"+
		"\u0000\u0000GK\u0005\u0002\u0000\u0000HJ\u0003\u0010\b\u0000IH\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0005\b\u0000\u0000OP\u0005\u0003\u0000\u0000P\u0084\u0001\u0000\u0000"+
		"\u0000QR\u0005\u001a\u0000\u0000RS\u0005\u0005\u0000\u0000ST\u0005\u001a"+
		"\u0000\u0000TU\u0005\u0007\u0000\u0000U\\\u0003\u0012\t\u0000VW\u0005"+
		"\t\u0000\u0000WX\u0005\u001a\u0000\u0000XY\u0005\u0007\u0000\u0000Y[\u0003"+
		"\u0012\t\u0000ZV\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`a\u0005\u0007"+
		"\u0000\u0000ab\u0003\u0012\t\u0000bc\u0005\u0002\u0000\u0000cg\u0005\u0002"+
		"\u0000\u0000df\u0003\u0010\b\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\b\u0000\u0000kl\u0005"+
		"\u0003\u0000\u0000l\u0084\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000"+
		"no\u0003\u0012\t\u0000os\u0005\u0002\u0000\u0000pr\u0003\u0010\b\u0000"+
		"qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0003\u0000\u0000w\u0084\u0001\u0000\u0000\u0000"+
		"xy\u0005\u000b\u0000\u0000yz\u0003\u0012\t\u0000z~\u0005\u0002\u0000\u0000"+
		"{}\u0003\u0010\b\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u0003\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083*\u0001"+
		"\u0000\u0000\u0000\u00833\u0001\u0000\u0000\u0000\u0083A\u0001\u0000\u0000"+
		"\u0000\u0083Q\u0001\u0000\u0000\u0000\u0083m\u0001\u0000\u0000\u0000\u0083"+
		"x\u0001\u0000\u0000\u0000\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0098"+
		"\u0005\f\u0000\u0000\u0086\u0098\u0005\r\u0000\u0000\u0087\u0088\u0005"+
		"\u0005\u0000\u0000\u0088\u008f\u0007\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\t\u0000\u0000\u008a\u008e\u0005\u001a\u0000\u0000\u008b\u008c\u0005\t"+
		"\u0000\u0000\u008c\u008e\u0005\u001b\u0000\u0000\u008d\u0089\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0098\u0005\u0006\u0000\u0000\u0093\u0094\u0005\u001a"+
		"\u0000\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0096\u0005\u001c"+
		"\u0000\u0000\u0096\u0098\u0005\u0006\u0000\u0000\u0097\u0085\u0001\u0000"+
		"\u0000\u0000\u0097\u0086\u0001\u0000\u0000\u0000\u0097\u0087\u0001\u0000"+
		"\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0098\u0007\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b\u0005\u001a"+
		"\u0000\u0000\u009b\u009c\u0005\u0002\u0000\u0000\u009c\u009d\u0003\n\u0005"+
		"\u0000\u009d\u009e\u0005\u0003\u0000\u0000\u009e\t\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0003\f\u0006\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a8\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u0004\u0002\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u000b\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001a\u0000\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad"+
		"\u00ae\u0003\u0012\t\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af\u00c3"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001a\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0007\u0000\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3\u00c3"+
		"\u0005\u000e\u0000\u0000\u00b4\u00b5\u0005\u001a\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0007\u0000\u0000\u00b6\u00b7\u0003\u0012\t\u0000\u00b7\u00b8\u0005"+
		"\u000f\u0000\u0000\u00b8\u00b9\u0005\u0010\u0000\u0000\u00b9\u00c3\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005\u001a\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0007\u0000\u0000\u00bc\u00bd\u0005\u0011\u0000\u0000\u00bd\u00be\u0005"+
		"\u000f\u0000\u0000\u00be\u00bf\u0005\u001e\u0000\u0000\u00bf\u00c0\u0005"+
		"\u001a\u0000\u0000\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1\u00c3\u0005"+
		"\u000e\u0000\u0000\u00c2\u00ab\u0001\u0000\u0000\u0000\u00c2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b4\u0001\u0000\u0000\u0000\u00c2\u00ba\u0001"+
		"\u0000\u0000\u0000\u00c3\r\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u001a"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c7\u0003\u0012"+
		"\t\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0003\b\u0004\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d6\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\f\u0006\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d6\u000f\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001a\u0000\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9"+
		"\u00da\u0005\u001c\u0000\u0000\u00da\u0135\u0005\u000e\u0000\u0000\u00db"+
		"\u00dc\u0005\u001a\u0000\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000\u00dd"+
		"\u00de\u0005\u001a\u0000\u0000\u00de\u0135\u0005\u000e\u0000\u0000\u00df"+
		"\u00e0\u0005\u001a\u0000\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1"+
		"\u00e2\u0005\u001b\u0000\u0000\u00e2\u0135\u0005\u000e\u0000\u0000\u00e3"+
		"\u00e4\u0005\u001a\u0000\u0000\u00e4\u00e5\u0005\u000f\u0000\u0000\u00e5"+
		"\u0135\u0005\u0010\u0000\u0000\u00e6\u0135\u0005\u0012\u0000\u0000\u00e7"+
		"\u00e8\u0005\u001a\u0000\u0000\u00e8\u00e9\u0005\u000f\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0005\u0000\u0000\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb"+
		"\u00ec\u0005\u001a\u0000\u0000\u00ec\u0135\u0005\u0014\u0000\u0000\u00ed"+
		"\u00ee\u0005\u001a\u0000\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000\u00ef"+
		"\u00f0\u0005\u001a\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1"+
		"\u00f3\u0005\u001e\u0000\u0000\u00f2\u00f4\u0005\u001a\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u001e\u0000\u0000\u00f6"+
		"\u0135\u0005\u0014\u0000\u0000\u00f7\u00f8\u0005\u001a\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0015\u0000\u0000\u00f9\u00fa\u0005\u001a\u0000\u0000\u00fa"+
		"\u00fe\u0005\u0005\u0000\u0000\u00fb\u00fd\u0005\u001b\u0000\u0000\u00fc"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0135\u0005\u0014\u0000\u0000\u0102\u0103\u0005\u001a\u0000\u0000\u0103"+
		"\u0111\u0005\u0005\u0000\u0000\u0104\u0105\u0005\u001a\u0000\u0000\u0105"+
		"\u0106\u0005\u0015\u0000\u0000\u0106\u0107\u0005\u001a\u0000\u0000\u0107"+
		"\u010b\u0005\u0005\u0000\u0000\u0108\u010a\u0005\u001b\u0000\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0005\u0006\u0000\u0000\u010f\u0104\u0001\u0000\u0000\u0000\u0110"+
		"\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0135\u0005\u0014\u0000\u0000\u0115"+
		"\u0116\u0005\u001a\u0000\u0000\u0116\u0117\u0005\u0005\u0000\u0000\u0117"+
		"\u0118\u0005\u001c\u0000\u0000\u0118\u011a\u0005\u0006\u0000\u0000\u0119"+
		"\u011b\u0005\u000e\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u0135\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001a\u0000\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e"+
		"\u0122\u0005\u0005\u0000\u0000\u011f\u0121\u0005\u001a\u0000\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		"\u0125\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125"+
		"\u012b\u0005\u0006\u0000\u0000\u0126\u0127\u0005\u0015\u0000\u0000\u0127"+
		"\u0128\u0005\u001a\u0000\u0000\u0128\u012a\u0005\u0016\u0000\u0000\u0129"+
		"\u0126\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005\u0006\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0005\u0006\u0000\u0000\u0131\u0133\u0007\u0001\u0000\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u00d7\u0001\u0000\u0000\u0000\u0134"+
		"\u00db\u0001\u0000\u0000\u0000\u0134\u00df\u0001\u0000\u0000\u0000\u0134"+
		"\u00e3\u0001\u0000\u0000\u0000\u0134\u00e6\u0001\u0000\u0000\u0000\u0134"+
		"\u00e7\u0001\u0000\u0000\u0000\u0134\u00ed\u0001\u0000\u0000\u0000\u0134"+
		"\u00f7\u0001\u0000\u0000\u0000\u0134\u0102\u0001\u0000\u0000\u0000\u0134"+
		"\u0115\u0001\u0000\u0000\u0000\u0134\u011c\u0001\u0000\u0000\u0000\u0135"+
		"\u0011\u0001\u0000\u0000\u0000\u0136\u0137\u0007\u0002\u0000\u0000\u0137"+
		"\u0013\u0001\u0000\u0000\u0000\u001b\u0017(<K\\gs~\u0083\u008d\u008f\u0097"+
		"\u00a2\u00a8\u00c2\u00cc\u00d2\u00d5\u00f3\u00fe\u010b\u0111\u011a\u0122"+
		"\u012b\u0132\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}