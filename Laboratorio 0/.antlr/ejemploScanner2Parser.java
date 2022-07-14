// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0\ejemploScanner2.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4t\n\4\f\4\16\4"+
		"w\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\4\3\4"+
		"\5\4\u0086\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5"+
		"\u0093\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u009a\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00cd\n\t\f\t\16\t\u00d0\13\t\3\t\7\t\u00d3\n\t\f\t\16\t\u00d6\13\t\5"+
		"\t\u00d8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00f6\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ff\n\n\f\n\16\n\u0102\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f\13\n\3\n\7\n\u0112"+
		"\n\n\f\n\16\n\u0115\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u011d\n\n\3\n\3\n"+
		"\3\n\3\n\7\n\u0123\n\n\f\n\16\n\u0126\13\n\3\n\3\n\3\n\3\n\7\n\u012c\n"+
		"\n\f\n\16\n\u012f\13\n\3\n\3\n\3\n\3\n\5\n\u0135\n\n\5\n\u0137\n\n\3\13"+
		"\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\34\35\4\2\20\20\27\27"+
		"\4\2\23\23\31\33\2\u015d\2\31\3\2\2\2\4*\3\2\2\2\6\u0085\3\2\2\2\b\u0099"+
		"\3\2\2\2\n\u009b\3\2\2\2\f\u00a4\3\2\2\2\16\u00c4\3\2\2\2\20\u00d7\3\2"+
		"\2\2\22\u0136\3\2\2\2\24\u0138\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30"+
		"\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\31\3\2\2\2\34"+
		"\35\7\3\2\2\35\36\7\34\2\2\36\37\7\4\2\2\37 \5\f\7\2 !\7\5\2\2!+\3\2\2"+
		"\2\"#\7\3\2\2#$\7\34\2\2$%\7\6\2\2%&\7\34\2\2&\'\7\4\2\2\'(\5\f\7\2()"+
		"\7\5\2\2)+\3\2\2\2*\34\3\2\2\2*\"\3\2\2\2+\5\3\2\2\2,-\7\34\2\2-.\7\7"+
		"\2\2./\7\b\2\2/\60\7\t\2\2\60\61\5\24\13\2\61\62\7\4\2\2\62\63\7\34\2"+
		"\2\63\64\7\5\2\2\64\u0086\3\2\2\2\65\66\7\34\2\2\66\67\7\7\2\2\678\7\b"+
		"\2\289\7\t\2\29:\5\24\13\2:>\7\4\2\2;=\5\22\n\2<;\3\2\2\2=@\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\5\2\2B\u0086\3\2\2\2CD\7\34"+
		"\2\2DE\7\7\2\2EF\7\b\2\2FG\7\t\2\2GH\5\24\13\2HI\7\4\2\2IM\7\4\2\2JL\5"+
		"\22\n\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ"+
		"\7\n\2\2QR\7\5\2\2R\u0086\3\2\2\2ST\7\34\2\2TU\7\7\2\2UV\7\34\2\2VW\7"+
		"\t\2\2W^\5\24\13\2XY\7\13\2\2YZ\7\34\2\2Z[\7\t\2\2[]\5\24\13\2\\X\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\b\2\2bc\7"+
		"\t\2\2cd\5\24\13\2de\7\4\2\2ei\7\4\2\2fh\5\22\n\2gf\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\n\2\2mn\7\5\2\2n\u0086\3"+
		"\2\2\2op\7\f\2\2pq\5\24\13\2qu\7\4\2\2rt\5\22\n\2sr\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\5\2\2y\u0086\3\2\2\2z{\7"+
		"\r\2\2{|\5\24\13\2|\u0080\7\4\2\2}\177\5\22\n\2~}\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7\5\2\2\u0084\u0086\3\2\2\2\u0085,\3\2\2\2\u0085"+
		"\65\3\2\2\2\u0085C\3\2\2\2\u0085S\3\2\2\2\u0085o\3\2\2\2\u0085z\3\2\2"+
		"\2\u0086\7\3\2\2\2\u0087\u009a\7\16\2\2\u0088\u009a\7\17\2\2\u0089\u008a"+
		"\7\7\2\2\u008a\u0091\t\2\2\2\u008b\u008c\7\13\2\2\u008c\u0090\7\34\2\2"+
		"\u008d\u008e\7\13\2\2\u008e\u0090\7\35\2\2\u008f\u008b\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009a\7\b\2\2\u0095\u0096\7\34"+
		"\2\2\u0096\u0097\7\7\2\2\u0097\u0098\7\36\2\2\u0098\u009a\7\b\2\2\u0099"+
		"\u0087\3\2\2\2\u0099\u0088\3\2\2\2\u0099\u0089\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u009a\t\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d\7\34\2\2\u009d\u009e"+
		"\7\4\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\7\5\2\2\u00a0\13\3\2\2\2\u00a1"+
		"\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\5\6\4\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\r\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae"+
		"\7\34\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\20\2"+
		"\2\u00b1\u00c5\3\2\2\2\u00b2\u00b3\7\34\2\2\u00b3\u00b4\7\t\2\2\u00b4"+
		"\u00b5\7\34\2\2\u00b5\u00c5\7\20\2\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8"+
		"\7\t\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\7\22\2"+
		"\2\u00bb\u00c5\3\2\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00be\7\t\2\2\u00be"+
		"\u00bf\7\23\2\2\u00bf\u00c0\7\21\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c2\7"+
		"\34\2\2\u00c2\u00c3\7 \2\2\u00c3\u00c5\7\20\2\2\u00c4\u00ad\3\2\2\2\u00c4"+
		"\u00b2\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5\17\3\2\2"+
		"\2\u00c6\u00c7\7\34\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00c9\5\24\13\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00d8\3\2\2\2\u00cb\u00cd\5\n\6\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d8\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5\16\b\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00ce\3\2"+
		"\2\2\u00d7\u00d4\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00da\7\34\2\2\u00da\u00db"+
		"\7\21\2\2\u00db\u00dc\7\36\2\2\u00dc\u0137\7\20\2\2\u00dd\u00de\7\34\2"+
		"\2\u00de\u00df\7\21\2\2\u00df\u00e0\7\34\2\2\u00e0\u0137\7\20\2\2\u00e1"+
		"\u00e2\7\34\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00e4\7\35\2\2\u00e4\u0137"+
		"\7\20\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\7\21\2\2\u00e7\u0137\7\22\2"+
		"\2\u00e8\u0137\7\24\2\2\u00e9\u00ea\7\34\2\2\u00ea\u00eb\7\21\2\2\u00eb"+
		"\u00ec\7\7\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\7\34\2\2\u00ee\u0137\7"+
		"\26\2\2\u00ef\u00f0\7\34\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\7\34\2\2"+
		"\u00f2\u00f3\7\7\2\2\u00f3\u00f5\7 \2\2\u00f4\u00f6\7\34\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7 \2\2\u00f8"+
		"\u0137\7\26\2\2\u00f9\u00fa\7\34\2\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc"+
		"\7\34\2\2\u00fc\u0100\7\7\2\2\u00fd\u00ff\7\35\2\2\u00fe\u00fd\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0137\7\26\2\2\u0104\u0105\7\34\2\2"+
		"\u0105\u0113\7\7\2\2\u0106\u0107\7\34\2\2\u0107\u0108\7\27\2\2\u0108\u0109"+
		"\7\34\2\2\u0109\u010d\7\7\2\2\u010a\u010c\7\35\2\2\u010b\u010a\3\2\2\2"+
		"\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\b\2\2\u0111\u0106\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u0137\7\26\2\2\u0117\u0118\7\34\2\2\u0118"+
		"\u0119\7\7\2\2\u0119\u011a\7\36\2\2\u011a\u011c\7\b\2\2\u011b\u011d\7"+
		"\20\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0137\3\2\2\2\u011e"+
		"\u011f\7\34\2\2\u011f\u0120\7\7\2\2\u0120\u0124\7\7\2\2\u0121\u0123\7"+
		"\34\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012d\7\b"+
		"\2\2\u0128\u0129\7\27\2\2\u0129\u012a\7\34\2\2\u012a\u012c\7\30\2\2\u012b"+
		"\u0128\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\b\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\7\b\2\2\u0133\u0135\t\3\2\2\u0134\u0133\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u00d9\3\2\2\2\u0136"+
		"\u00dd\3\2\2\2\u0136\u00e1\3\2\2\2\u0136\u00e5\3\2\2\2\u0136\u00e8\3\2"+
		"\2\2\u0136\u00e9\3\2\2\2\u0136\u00ef\3\2\2\2\u0136\u00f9\3\2\2\2\u0136"+
		"\u0104\3\2\2\2\u0136\u0117\3\2\2\2\u0136\u011e\3\2\2\2\u0137\23\3\2\2"+
		"\2\u0138\u0139\t\4\2\2\u0139\25\3\2\2\2\35\31*>M^iu\u0080\u0085\u008f"+
		"\u0091\u0099\u00a4\u00aa\u00c4\u00ce\u00d4\u00d7\u00f5\u0100\u010d\u0113"+
		"\u011c\u0124\u012d\u0134\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}