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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, NUM=45, STRING=46, 
		COMENTARIO=47, LCOMENTARIO=48, DELIMITER=49, QUOTES=50, APOSTROPHE=51, 
		CHAR_LITERAL=52, PARENTESIS=53;
	public static final int
		RULE_start = 0, RULE_clase = 1, RULE_declaracionMetodo = 2, RULE_parametrosParaMetodo = 3, 
		RULE_clases = 4, RULE_contenidoClase = 5, RULE_definirVariables = 6, RULE_declaraciones = 7, 
		RULE_declaracionOperacion = 8, RULE_operador = 9, RULE_tipoVariable = 10, 
		RULE_declaracionEspecial = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "clase", "declaracionMetodo", "parametrosParaMetodo", "clases", 
			"contenidoClase", "definirVariables", "declaraciones", "declaracionOperacion", 
			"operador", "tipoVariable", "declaracionEspecial"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'};'", "'inherits'", "'('", "')'", "':'", "'}'", 
			"','", "'main() :'", "'main():'", "';'", "'();'", "'() ;'", "'<-'", "'\"\";'", 
			"'String'", "');'", "'abort();'", "'self;'", "'self'", "'.'", "'out_string(\"\\n\");'", 
			"'out_string(\" \");'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'+'", "'-'", "'*'", "'/'", "'<='", "'<'", "'>'", "'Int'", 
			"'SELF_TYPE'", "'Object'", "'Bool'", "'new'", "'isvoid'", null, null, 
			null, null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "NUM", "STRING", 
			"COMENTARIO", "LCOMENTARIO", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", 
			"PARENTESIS"
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
		public List<TerminalNode> COMENTARIO() { return getTokens(ejemploScanner2Parser.COMENTARIO); }
		public TerminalNode COMENTARIO(int i) {
			return getToken(ejemploScanner2Parser.COMENTARIO, i);
		}
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
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==COMENTARIO) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIO:
					{
					setState(24);
					match(COMENTARIO);
					}
					break;
				case T__0:
					{
					setState(25);
					clase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(ID);
				setState(33);
				match(T__1);
				{
				setState(34);
				contenidoClase();
				}
				setState(35);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(T__0);
				setState(38);
				match(ID);
				setState(39);
				match(T__3);
				{
				setState(40);
				match(ID);
				}
				setState(41);
				match(T__1);
				{
				setState(42);
				contenidoClase();
				}
				setState(43);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(ID);
				setState(48);
				match(T__4);
				setState(49);
				match(T__5);
				setState(50);
				match(T__6);
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(51);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(52);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55);
				match(T__1);
				setState(56);
				match(ID);
				setState(57);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(ID);
				setState(59);
				match(T__4);
				setState(60);
				match(T__5);
				setState(61);
				match(T__6);
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(62);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(63);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66);
				match(T__1);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(67);
					declaracionOperacion(0);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(ID);
				setState(75);
				match(T__4);
				setState(76);
				match(T__5);
				setState(77);
				match(T__6);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(78);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(79);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(T__1);
				setState(83);
				match(T__1);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(84);
					declaracionOperacion(0);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__7);
				setState(91);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(ID);
				setState(93);
				match(T__4);
				setState(94);
				match(ID);
				setState(95);
				match(T__6);
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(96);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(97);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(100);
					match(T__8);
					setState(101);
					match(ID);
					setState(102);
					match(T__6);
					setState(105);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
					case T__20:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
						{
						setState(103);
						tipoVariable();
						}
						break;
					case ID:
						{
						setState(104);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__5);
				setState(113);
				match(T__6);
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(114);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(115);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118);
				match(T__1);
				setState(119);
				match(T__1);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(120);
					declaracionOperacion(0);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__7);
				setState(127);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__4);
				setState(130);
				match(ID);
				setState(131);
				match(T__6);
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(132);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(133);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(136);
					match(T__8);
					setState(137);
					match(ID);
					setState(138);
					match(T__6);
					setState(141);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
					case T__20:
					case T__37:
					case T__38:
					case T__39:
					case T__40:
						{
						setState(139);
						tipoVariable();
						}
						break;
					case ID:
						{
						setState(140);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__5);
				setState(149);
				match(T__6);
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(150);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(151);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(154);
				match(T__1);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(155);
					declaracionOperacion(0);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(T__9);
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(163);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(164);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167);
				match(T__1);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(168);
					declaracionOperacion(0);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(T__10);
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(176);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(177);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180);
				match(T__1);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(181);
					declaracionOperacion(0);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(T__9);
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(189);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(190);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
				match(T__1);
				setState(194);
				match(T__1);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(195);
					declaracionOperacion(0);
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				match(T__7);
				setState(202);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(203);
				match(T__10);
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(204);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(205);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208);
				match(T__1);
				setState(209);
				match(T__1);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(210);
					declaracionOperacion(0);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(T__7);
				setState(217);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__4);
				setState(220);
				match(T__5);
				setState(221);
				match(T__6);
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(222);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(223);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226);
				match(T__11);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(227);
				match(ID);
				setState(228);
				match(T__4);
				setState(229);
				match(T__5);
				setState(230);
				match(T__6);
				setState(233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(231);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(232);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(235);
				match(T__1);
				setState(236);
				match(T__1);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(237);
					declaracionOperacion(0);
					setState(238);
					match(T__11);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(T__7);
				setState(246);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__13);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__4);
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(253);
						match(T__8);
						setState(254);
						match(ID);
						}
						break;
					case 2:
						{
						setState(255);
						match(T__8);
						setState(256);
						match(NUM);
						}
						break;
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(ID);
				setState(264);
				match(T__4);
				setState(265);
				match(STRING);
				setState(266);
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
			setState(269);
			match(T__0);
			setState(270);
			match(ID);
			setState(271);
			match(T__1);
			{
			setState(272);
			contenidoClase();
			}
			setState(273);
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
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					definirVariables();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(281);
				declaracionMetodo();
				}
				}
				setState(286);
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
		public TerminalNode STRING() { return getToken(ejemploScanner2Parser.STRING, 0); }
		public TerminalNode NUM() { return getToken(ejemploScanner2Parser.NUM, 0); }
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
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(ID);
				setState(288);
				match(T__6);
				setState(289);
				tipoVariable();
				setState(290);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(ID);
				setState(293);
				match(T__6);
				setState(294);
				match(ID);
				setState(295);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(ID);
				setState(297);
				match(T__6);
				setState(298);
				tipoVariable();
				setState(299);
				match(T__14);
				setState(300);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(ID);
				setState(303);
				match(T__6);
				setState(304);
				match(T__16);
				setState(305);
				match(T__14);
				setState(306);
				match(QUOTES);
				{
				setState(307);
				match(ID);
				}
				setState(308);
				match(QUOTES);
				setState(309);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(310);
				match(ID);
				setState(311);
				match(T__6);
				setState(312);
				tipoVariable();
				setState(313);
				match(T__14);
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				match(T__11);
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
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ID);
				setState(320);
				match(T__6);
				setState(321);
				tipoVariable();
				setState(322);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(324);
					clases();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(330);
					definirVariables();
					}
					}
					setState(335);
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
		public List<TerminalNode> STRING() { return getTokens(ejemploScanner2Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ejemploScanner2Parser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ejemploScanner2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ejemploScanner2Parser.NUM, i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public DeclaracionEspecialContext declaracionEspecial() {
			return getRuleContext(DeclaracionEspecialContext.class,0);
		}
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public List<TerminalNode> QUOTES() { return getTokens(ejemploScanner2Parser.QUOTES); }
		public TerminalNode QUOTES(int i) {
			return getToken(ejemploScanner2Parser.QUOTES, i);
		}
		public List<DeclaracionOperacionContext> declaracionOperacion() {
			return getRuleContexts(DeclaracionOperacionContext.class);
		}
		public DeclaracionOperacionContext declaracionOperacion(int i) {
			return getRuleContext(DeclaracionOperacionContext.class,i);
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
		return declaracionOperacion(0);
	}

	private DeclaracionOperacionContext declaracionOperacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaracionOperacionContext _localctx = new DeclaracionOperacionContext(_ctx, _parentState);
		DeclaracionOperacionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_declaracionOperacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(339);
				match(ID);
				setState(340);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(341);
				match(ID);
				setState(342);
				match(T__4);
				setState(343);
				match(ID);
				setState(344);
				match(T__5);
				setState(345);
				match(T__11);
				}
				break;
			case 3:
				{
				setState(346);
				match(ID);
				setState(347);
				match(T__4);
				setState(348);
				match(ID);
				setState(349);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(350);
				match(ID);
				setState(351);
				match(T__4);
				setState(352);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(353);
				match(T__5);
				setState(354);
				match(T__11);
				}
				break;
			case 5:
				{
				setState(355);
				match(ID);
				setState(356);
				match(T__4);
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(359);
				match(ID);
				setState(360);
				match(T__4);
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				operador();
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				setState(366);
				match(ID);
				setState(367);
				match(T__14);
				setState(368);
				match(STRING);
				setState(369);
				match(T__11);
				}
				break;
			case 8:
				{
				setState(370);
				match(ID);
				setState(371);
				match(T__14);
				setState(372);
				match(ID);
				setState(373);
				match(T__11);
				}
				break;
			case 9:
				{
				setState(374);
				match(ID);
				setState(375);
				match(T__14);
				setState(376);
				match(NUM);
				setState(377);
				match(T__11);
				}
				break;
			case 10:
				{
				setState(378);
				match(ID);
				setState(379);
				match(T__14);
				setState(380);
				match(T__15);
				}
				break;
			case 11:
				{
				setState(381);
				match(ID);
				setState(382);
				match(T__4);
				setState(383);
				match(NUM);
				setState(384);
				match(T__17);
				}
				break;
			case 12:
				{
				setState(385);
				match(ID);
				setState(386);
				match(T__14);
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				operador();
				setState(389);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 13:
				{
				setState(391);
				match(T__18);
				}
				break;
			case 14:
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				match(T__11);
				}
				break;
			case 15:
				{
				setState(394);
				match(T__19);
				}
				break;
			case 16:
				{
				setState(395);
				match(T__20);
				}
				break;
			case 17:
				{
				setState(396);
				match(ID);
				setState(397);
				match(T__14);
				setState(398);
				match(T__4);
				setState(399);
				declaracionEspecial();
				setState(402);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(400);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(401);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404);
				match(T__17);
				}
				break;
			case 18:
				{
				setState(406);
				match(ID);
				setState(407);
				match(T__21);
				setState(408);
				match(ID);
				setState(409);
				match(T__4);
				setState(410);
				match(QUOTES);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(411);
					match(ID);
					}
				}

				setState(414);
				match(QUOTES);
				setState(415);
				match(T__17);
				}
				break;
			case 19:
				{
				setState(416);
				match(ID);
				setState(417);
				match(T__21);
				setState(418);
				match(ID);
				setState(419);
				match(T__4);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(420);
					match(NUM);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(426);
				match(T__17);
				}
				break;
			case 20:
				{
				setState(427);
				match(ID);
				setState(428);
				match(T__21);
				setState(429);
				match(ID);
				setState(430);
				match(T__4);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(431);
					match(NUM);
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(T__5);
				}
				break;
			case 21:
				{
				setState(438);
				match(ID);
				setState(439);
				match(T__4);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(440);
					match(ID);
					setState(441);
					match(T__21);
					setState(442);
					match(ID);
					setState(443);
					match(T__4);
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(444);
						match(NUM);
						}
						}
						setState(449);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(450);
					match(T__5);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
				match(T__17);
				}
				break;
			case 22:
				{
				setState(457);
				match(T__22);
				}
				break;
			case 23:
				{
				setState(458);
				match(T__23);
				}
				break;
			case 24:
				{
				setState(459);
				match(ID);
				setState(460);
				match(T__4);
				setState(464);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(461);
					match(ID);
					}
					break;
				case NUM:
					{
					setState(462);
					match(NUM);
					}
					break;
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(463);
					tipoVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(466);
						match(T__8);
						setState(467);
						match(ID);
						}
						break;
					case 2:
						{
						setState(468);
						match(T__8);
						setState(469);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(470);
						match(T__8);
						setState(471);
						tipoVariable();
						}
						break;
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 25:
				{
				setState(478);
				match(ID);
				setState(479);
				match(T__4);
				{
				setState(480);
				match(T__4);
				setState(481);
				declaracionEspecial();
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(482);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(483);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(486);
				match(T__5);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(487);
					match(T__21);
					setState(488);
					match(ID);
					setState(489);
					match(T__4);
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(490);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(495);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(491);
							match(T__8);
							setState(492);
							_la = _input.LA(1);
							if ( !(_la==NUM || _la==STRING) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(497);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(502);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(503);
					match(T__5);
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(509);
				match(T__17);
				}
				break;
			case 26:
				{
				setState(511);
				match(ID);
				setState(512);
				match(T__4);
				{
				setState(513);
				match(T__4);
				setState(514);
				declaracionEspecial();
				setState(517);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(515);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(516);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519);
				match(T__5);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(520);
					match(T__21);
					setState(521);
					match(ID);
					setState(522);
					match(T__4);
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(523);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(528);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(524);
							match(T__8);
							setState(525);
							_la = _input.LA(1);
							if ( !(_la==NUM || _la==STRING) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(530);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(535);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(536);
					match(T__5);
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(542);
				match(T__5);
				}
				break;
			case 27:
				{
				setState(544);
				match(T__4);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41 || _la==T__42) {
					{
					setState(545);
					declaracionEspecial();
					}
				}

				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(548);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(549);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552);
				match(T__5);
				}
				break;
			case 28:
				{
				setState(553);
				match(ID);
				setState(554);
				match(T__14);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41 || _la==T__42) {
					{
					setState(555);
					declaracionEspecial();
					}
				}

				setState(558);
				match(ID);
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(559);
						match(T__21);
						setState(560);
						match(ID);
						setState(561);
						match(T__4);
						setState(562);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(563);
						match(T__5);
						}
						} 
					}
					setState(568);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 29:
				{
				setState(569);
				match(T__24);
				setState(570);
				declaracionOperacion(0);
				setState(571);
				match(T__25);
				setState(572);
				declaracionOperacion(0);
				setState(573);
				match(T__26);
				setState(574);
				match(T__1);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(575);
					declaracionOperacion(0);
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
				match(T__7);
				setState(582);
				match(T__27);
				}
				break;
			case 30:
				{
				setState(584);
				match(T__28);
				setState(585);
				match(T__4);
				setState(586);
				match(ID);
				setState(587);
				declaracionOperacion(0);
				setState(588);
				match(T__5);
				setState(589);
				match(T__29);
				setState(590);
				match(T__1);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(591);
					declaracionOperacion(0);
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(T__7);
				}
				break;
			case 31:
				{
				setState(599);
				match(T__24);
				setState(600);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(601);
				operador();
				setState(602);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(603);
				match(T__25);
				setState(606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(604);
					declaracionOperacion(0);
					}
					break;
				case 2:
					{
					setState(605);
					match(ID);
					}
					break;
				}
				setState(608);
				match(T__26);
				setState(609);
				declaracionOperacion(0);
				setState(613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(T__27);
						}
						} 
					}
					setState(615);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclaracionOperacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaracionOperacion);
					setState(618);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(621); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(619);
							match(T__21);
							setState(620);
							declaracionOperacion(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(623); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__20) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class DeclaracionEspecialContext extends ParserRuleContext {
		public DeclaracionEspecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionEspecial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).enterDeclaracionEspecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ejemploScanner2Listener ) ((ejemploScanner2Listener)listener).exitDeclaracionEspecial(this);
		}
	}

	public final DeclaracionEspecialContext declaracionEspecial() throws RecognitionException {
		DeclaracionEspecialContext _localctx = new DeclaracionEspecialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracionEspecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return declaracionOperacion_sempred((DeclaracionOperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declaracionOperacion_sempred(DeclaracionOperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u027d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002Q\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"V\b\u0002\n\u0002\f\u0002Y\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002j\b\u0002\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002u\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002z\b\u0002\n\u0002\f\u0002}\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0087\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008e\b\u0002\u0005"+
		"\u0002\u0090\b\u0002\n\u0002\f\u0002\u0093\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0099\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u009d\b\u0002\n\u0002\f\u0002\u00a0\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a6\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00aa\b\u0002\n\u0002\f\u0002\u00ad\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b3\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u00b7\b\u0002\n\u0002\f\u0002\u00ba\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00c0\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00c5\b\u0002\n\u0002\f\u0002"+
		"\u00c8\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00cf\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00d4\b\u0002\n\u0002\f\u0002\u00d7\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00e1\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ea\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00f1\b\u0002\n"+
		"\u0002\f\u0002\u00f4\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f8"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0102\b\u0003\n\u0003\f\u0003"+
		"\u0105\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u010c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u0115\b\u0005\n\u0005"+
		"\f\u0005\u0118\t\u0005\u0001\u0005\u0005\u0005\u011b\b\u0005\n\u0005\f"+
		"\u0005\u011e\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u013e\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0146\b\u0007\n"+
		"\u0007\f\u0007\u0149\t\u0007\u0001\u0007\u0005\u0007\u014c\b\u0007\n\u0007"+
		"\f\u0007\u014f\t\u0007\u0003\u0007\u0151\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0193"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u019d\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u01a6\b\b\n\b\f\b\u01a9\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u01b1\b\b\n\b\f\b\u01b4\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u01be\b\b\n\b\f\b\u01c1\t\b"+
		"\u0001\b\u0005\b\u01c4\b\b\n\b\f\b\u01c7\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01d1\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u01d9\b\b\n\b\f\b\u01dc\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01e5\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u01ee\b\b\n"+
		"\b\f\b\u01f1\t\b\u0005\b\u01f3\b\b\n\b\f\b\u01f6\t\b\u0001\b\u0005\b\u01f9"+
		"\b\b\n\b\f\b\u01fc\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0206\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u020f\b\b\n\b\f\b\u0212\t\b\u0005\b\u0214\b"+
		"\b\n\b\f\b\u0217\t\b\u0001\b\u0005\b\u021a\b\b\n\b\f\b\u021d\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0223\b\b\u0001\b\u0001\b\u0003\b\u0227"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u022d\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0235\b\b\n\b\f\b\u0238\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0241\b\b\n"+
		"\b\f\b\u0244\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0251\b\b\n\b\f\b\u0254\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u025f\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u0264\b\b\n\b\f\b"+
		"\u0267\t\b\u0003\b\u0269\b\b\u0001\b\u0001\b\u0001\b\u0004\b\u026e\b\b"+
		"\u000b\b\f\b\u026f\u0005\b\u0272\b\b\n\b\f\b\u0275\t\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0001\u0010"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0006"+
		"\u0001\u0000,-\u0001\u0000-.\u0002\u0000\u0006\u0006\u0012\u0012\u0001"+
		"\u0000\u001f%\u0003\u0000\u0011\u0011\u0015\u0015&)\u0001\u0000*+\u02e1"+
		"\u0000\u001c\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004"+
		"\u00f7\u0001\u0000\u0000\u0000\u0006\u010b\u0001\u0000\u0000\u0000\b\u010d"+
		"\u0001\u0000\u0000\u0000\n\u0116\u0001\u0000\u0000\u0000\f\u013d\u0001"+
		"\u0000\u0000\u0000\u000e\u0150\u0001\u0000\u0000\u0000\u0010\u0268\u0001"+
		"\u0000\u0000\u0000\u0012\u0276\u0001\u0000\u0000\u0000\u0014\u0278\u0001"+
		"\u0000\u0000\u0000\u0016\u027a\u0001\u0000\u0000\u0000\u0018\u001b\u0005"+
		"/\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005,\u0000\u0000!\"\u0005"+
		"\u0002\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0005\u0003\u0000\u0000$."+
		"\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005,\u0000\u0000"+
		"\'(\u0005\u0004\u0000\u0000()\u0005,\u0000\u0000)*\u0005\u0002\u0000\u0000"+
		"*+\u0003\n\u0005\u0000+,\u0005\u0003\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-\u001f\u0001\u0000\u0000\u0000-%\u0001\u0000\u0000\u0000.\u0003\u0001"+
		"\u0000\u0000\u0000/0\u0005,\u0000\u000001\u0005\u0005\u0000\u000012\u0005"+
		"\u0006\u0000\u000025\u0005\u0007\u0000\u000036\u0003\u0014\n\u000046\u0005"+
		",\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0005\u0002\u0000\u000089\u0005,\u0000\u00009\u00f8"+
		"\u0005\u0003\u0000\u0000:;\u0005,\u0000\u0000;<\u0005\u0005\u0000\u0000"+
		"<=\u0005\u0006\u0000\u0000=@\u0005\u0007\u0000\u0000>A\u0003\u0014\n\u0000"+
		"?A\u0005,\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BF\u0005\u0002\u0000\u0000CE\u0003\u0010\b\u0000"+
		"DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000I\u00f8\u0005\u0003\u0000\u0000JK\u0005,\u0000\u0000KL\u0005"+
		"\u0005\u0000\u0000LM\u0005\u0006\u0000\u0000MP\u0005\u0007\u0000\u0000"+
		"NQ\u0003\u0014\n\u0000OQ\u0005,\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0002\u0000"+
		"\u0000SW\u0005\u0002\u0000\u0000TV\u0003\u0010\b\u0000UT\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005"+
		"\b\u0000\u0000[\u00f8\u0005\u0003\u0000\u0000\\]\u0005,\u0000\u0000]^"+
		"\u0005\u0005\u0000\u0000^_\u0005,\u0000\u0000_b\u0005\u0007\u0000\u0000"+
		"`c\u0003\u0014\n\u0000ac\u0005,\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cm\u0001\u0000\u0000\u0000de\u0005\t\u0000\u0000"+
		"ef\u0005,\u0000\u0000fi\u0005\u0007\u0000\u0000gj\u0003\u0014\n\u0000"+
		"hj\u0005,\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0006\u0000\u0000qt\u0005"+
		"\u0007\u0000\u0000ru\u0003\u0014\n\u0000su\u0005,\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0002\u0000\u0000w{\u0005\u0002\u0000\u0000xz\u0003\u0010\b\u0000"+
		"yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u00f8\u0005\u0003\u0000"+
		"\u0000\u0080\u0081\u0005,\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000"+
		"\u0082\u0083\u0005,\u0000\u0000\u0083\u0086\u0005\u0007\u0000\u0000\u0084"+
		"\u0087\u0003\u0014\n\u0000\u0085\u0087\u0005,\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0091"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0005"+
		",\u0000\u0000\u008a\u008d\u0005\u0007\u0000\u0000\u008b\u008e\u0003\u0014"+
		"\n\u0000\u008c\u008e\u0005,\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000"+
		"\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095\u0098\u0005\u0007\u0000"+
		"\u0000\u0096\u0099\u0003\u0014\n\u0000\u0097\u0099\u0005,\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009e\u0005\u0002\u0000\u0000"+
		"\u009b\u009d\u0003\u0010\b\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u00f8\u0005\u0003\u0000\u0000\u00a2"+
		"\u00a5\u0005\n\u0000\u0000\u00a3\u00a6\u0003\u0014\n\u0000\u00a4\u00a6"+
		"\u0005,\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ab\u0005"+
		"\u0002\u0000\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00f8\u0005\u0003"+
		"\u0000\u0000\u00af\u00b2\u0005\u000b\u0000\u0000\u00b0\u00b3\u0003\u0014"+
		"\n\u0000\u00b1\u00b3\u0005,\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b8\u0005\u0002\u0000\u0000\u00b5\u00b7\u0003\u0010\b\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00f8\u0005\u0003\u0000\u0000\u00bc\u00bf\u0005\n\u0000\u0000\u00bd"+
		"\u00c0\u0003\u0014\n\u0000\u00be\u00c0\u0005,\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0002\u0000\u0000\u00c2\u00c6"+
		"\u0005\u0002\u0000\u0000\u00c3\u00c5\u0003\u0010\b\u0000\u00c4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\b\u0000\u0000\u00ca\u00f8\u0005\u0003\u0000\u0000\u00cb\u00ce\u0005\u000b"+
		"\u0000\u0000\u00cc\u00cf\u0003\u0014\n\u0000\u00cd\u00cf\u0005,\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0002\u0000"+
		"\u0000\u00d1\u00d5\u0005\u0002\u0000\u0000\u00d2\u00d4\u0003\u0010\b\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005\b\u0000\u0000\u00d9\u00f8\u0005\u0003\u0000\u0000\u00da"+
		"\u00db\u0005,\u0000\u0000\u00db\u00dc\u0005\u0005\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0006\u0000\u0000\u00dd\u00e0\u0005\u0007\u0000\u0000\u00de\u00e1"+
		"\u0003\u0014\n\u0000\u00df\u00e1\u0005,\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00f8\u0005\f\u0000\u0000\u00e3\u00e4\u0005,"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5\u00e6\u0005\u0006"+
		"\u0000\u0000\u00e6\u00e9\u0005\u0007\u0000\u0000\u00e7\u00ea\u0003\u0014"+
		"\n\u0000\u00e8\u00ea\u0005,\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000\u00ec\u00f2\u0005\u0002\u0000"+
		"\u0000\u00ed\u00ee\u0003\u0010\b\u0000\u00ee\u00ef\u0005\f\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\b\u0000\u0000\u00f6"+
		"\u00f8\u0005\u0003\u0000\u0000\u00f7/\u0001\u0000\u0000\u0000\u00f7:\u0001"+
		"\u0000\u0000\u0000\u00f7J\u0001\u0000\u0000\u0000\u00f7\\\u0001\u0000"+
		"\u0000\u0000\u00f7\u0080\u0001\u0000\u0000\u0000\u00f7\u00a2\u0001\u0000"+
		"\u0000\u0000\u00f7\u00af\u0001\u0000\u0000\u0000\u00f7\u00bc\u0001\u0000"+
		"\u0000\u0000\u00f7\u00cb\u0001\u0000\u0000\u0000\u00f7\u00da\u0001\u0000"+
		"\u0000\u0000\u00f7\u00e3\u0001\u0000\u0000\u0000\u00f8\u0005\u0001\u0000"+
		"\u0000\u0000\u00f9\u010c\u0005\r\u0000\u0000\u00fa\u010c\u0005\u000e\u0000"+
		"\u0000\u00fb\u00fc\u0005\u0005\u0000\u0000\u00fc\u0103\u0007\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u0102\u0005,\u0000\u0000"+
		"\u00ff\u0100\u0005\t\u0000\u0000\u0100\u0102\u0005-\u0000\u0000\u0101"+
		"\u00fd\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0106\u010c\u0005\u0006\u0000\u0000\u0107"+
		"\u0108\u0005,\u0000\u0000\u0108\u0109\u0005\u0005\u0000\u0000\u0109\u010a"+
		"\u0005.\u0000\u0000\u010a\u010c\u0005\u0006\u0000\u0000\u010b\u00f9\u0001"+
		"\u0000\u0000\u0000\u010b\u00fa\u0001\u0000\u0000\u0000\u010b\u00fb\u0001"+
		"\u0000\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010c\u0007\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0001\u0000\u0000\u010e\u010f\u0005"+
		",\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0111\u0003\n"+
		"\u0005\u0000\u0111\u0112\u0005\u0003\u0000\u0000\u0112\t\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0003\f\u0006\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011c\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0003\u0004\u0002\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u000b\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0005,\u0000\u0000\u0120\u0121\u0005\u0007\u0000\u0000\u0121"+
		"\u0122\u0003\u0014\n\u0000\u0122\u0123\u0005\f\u0000\u0000\u0123\u013e"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005,\u0000\u0000\u0125\u0126\u0005"+
		"\u0007\u0000\u0000\u0126\u0127\u0005,\u0000\u0000\u0127\u013e\u0005\f"+
		"\u0000\u0000\u0128\u0129\u0005,\u0000\u0000\u0129\u012a\u0005\u0007\u0000"+
		"\u0000\u012a\u012b\u0003\u0014\n\u0000\u012b\u012c\u0005\u000f\u0000\u0000"+
		"\u012c\u012d\u0005\u0010\u0000\u0000\u012d\u013e\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005,\u0000\u0000\u012f\u0130\u0005\u0007\u0000\u0000\u0130"+
		"\u0131\u0005\u0011\u0000\u0000\u0131\u0132\u0005\u000f\u0000\u0000\u0132"+
		"\u0133\u00052\u0000\u0000\u0133\u0134\u0005,\u0000\u0000\u0134\u0135\u0005"+
		"2\u0000\u0000\u0135\u013e\u0005\f\u0000\u0000\u0136\u0137\u0005,\u0000"+
		"\u0000\u0137\u0138\u0005\u0007\u0000\u0000\u0138\u0139\u0003\u0014\n\u0000"+
		"\u0139\u013a\u0005\u000f\u0000\u0000\u013a\u013b\u0007\u0001\u0000\u0000"+
		"\u013b\u013c\u0005\f\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u011f\u0001\u0000\u0000\u0000\u013d\u0124\u0001\u0000\u0000\u0000\u013d"+
		"\u0128\u0001\u0000\u0000\u0000\u013d\u012e\u0001\u0000\u0000\u0000\u013d"+
		"\u0136\u0001\u0000\u0000\u0000\u013e\r\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005,\u0000\u0000\u0140\u0141\u0005\u0007\u0000\u0000\u0141\u0142\u0003"+
		"\u0014\n\u0000\u0142\u0143\u0005\f\u0000\u0000\u0143\u0151\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0003\b\u0004\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0151\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014c\u0003\f\u0006\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u0150\u013f\u0001\u0000\u0000\u0000\u0150\u0147\u0001\u0000\u0000\u0000"+
		"\u0150\u014d\u0001\u0000\u0000\u0000\u0151\u000f\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0006\b\uffff\uffff\u0000\u0153\u0154\u0005,\u0000\u0000"+
		"\u0154\u0269\u0005\r\u0000\u0000\u0155\u0156\u0005,\u0000\u0000\u0156"+
		"\u0157\u0005\u0005\u0000\u0000\u0157\u0158\u0005,\u0000\u0000\u0158\u0159"+
		"\u0005\u0006\u0000\u0000\u0159\u0269\u0005\f\u0000\u0000\u015a\u015b\u0005"+
		",\u0000\u0000\u015b\u015c\u0005\u0005\u0000\u0000\u015c\u015d\u0005,\u0000"+
		"\u0000\u015d\u0269\u0005\u0006\u0000\u0000\u015e\u015f\u0005,\u0000\u0000"+
		"\u015f\u0160\u0005\u0005\u0000\u0000\u0160\u0161\u0007\u0001\u0000\u0000"+
		"\u0161\u0162\u0005\u0006\u0000\u0000\u0162\u0269\u0005\f\u0000\u0000\u0163"+
		"\u0164\u0005,\u0000\u0000\u0164\u0165\u0005\u0005\u0000\u0000\u0165\u0166"+
		"\u0007\u0001\u0000\u0000\u0166\u0269\u0005\u0006\u0000\u0000\u0167\u0168"+
		"\u0005,\u0000\u0000\u0168\u0169\u0005\u0005\u0000\u0000\u0169\u016a\u0007"+
		"\u0001\u0000\u0000\u016a\u016b\u0003\u0012\t\u0000\u016b\u016c\u0007\u0001"+
		"\u0000\u0000\u016c\u016d\u0007\u0002\u0000\u0000\u016d\u0269\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005,\u0000\u0000\u016f\u0170\u0005\u000f\u0000"+
		"\u0000\u0170\u0171\u0005.\u0000\u0000\u0171\u0269\u0005\f\u0000\u0000"+
		"\u0172\u0173\u0005,\u0000\u0000\u0173\u0174\u0005\u000f\u0000\u0000\u0174"+
		"\u0175\u0005,\u0000\u0000\u0175\u0269\u0005\f\u0000\u0000\u0176\u0177"+
		"\u0005,\u0000\u0000\u0177\u0178\u0005\u000f\u0000\u0000\u0178\u0179\u0005"+
		"-\u0000\u0000\u0179\u0269\u0005\f\u0000\u0000\u017a\u017b\u0005,\u0000"+
		"\u0000\u017b\u017c\u0005\u000f\u0000\u0000\u017c\u0269\u0005\u0010\u0000"+
		"\u0000\u017d\u017e\u0005,\u0000\u0000\u017e\u017f\u0005\u0005\u0000\u0000"+
		"\u017f\u0180\u0005-\u0000\u0000\u0180\u0269\u0005\u0012\u0000\u0000\u0181"+
		"\u0182\u0005,\u0000\u0000\u0182\u0183\u0005\u000f\u0000\u0000\u0183\u0184"+
		"\u0007\u0001\u0000\u0000\u0184\u0185\u0003\u0012\t\u0000\u0185\u0186\u0007"+
		"\u0001\u0000\u0000\u0186\u0269\u0001\u0000\u0000\u0000\u0187\u0269\u0005"+
		"\u0013\u0000\u0000\u0188\u0189\u0007\u0000\u0000\u0000\u0189\u0269\u0005"+
		"\f\u0000\u0000\u018a\u0269\u0005\u0014\u0000\u0000\u018b\u0269\u0005\u0015"+
		"\u0000\u0000\u018c\u018d\u0005,\u0000\u0000\u018d\u018e\u0005\u000f\u0000"+
		"\u0000\u018e\u018f\u0005\u0005\u0000\u0000\u018f\u0192\u0003\u0016\u000b"+
		"\u0000\u0190\u0193\u0003\u0014\n\u0000\u0191\u0193\u0005,\u0000\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0012\u0000\u0000"+
		"\u0195\u0269\u0001\u0000\u0000\u0000\u0196\u0197\u0005,\u0000\u0000\u0197"+
		"\u0198\u0005\u0016\u0000\u0000\u0198\u0199\u0005,\u0000\u0000\u0199\u019a"+
		"\u0005\u0005\u0000\u0000\u019a\u019c\u00052\u0000\u0000\u019b\u019d\u0005"+
		",\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u00052\u0000"+
		"\u0000\u019f\u0269\u0005\u0012\u0000\u0000\u01a0\u01a1\u0005,\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0016\u0000\u0000\u01a2\u01a3\u0005,\u0000\u0000\u01a3"+
		"\u01a7\u0005\u0005\u0000\u0000\u01a4\u01a6\u0005-\u0000\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u0269"+
		"\u0005\u0012\u0000\u0000\u01ab\u01ac\u0005,\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0016\u0000\u0000\u01ad\u01ae\u0005,\u0000\u0000\u01ae\u01b2\u0005\u0005"+
		"\u0000\u0000\u01af\u01b1\u0005-\u0000\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u0269\u0005\u0006\u0000"+
		"\u0000\u01b6\u01b7\u0005,\u0000\u0000\u01b7\u01c5\u0005\u0005\u0000\u0000"+
		"\u01b8\u01b9\u0005,\u0000\u0000\u01b9\u01ba\u0005\u0016\u0000\u0000\u01ba"+
		"\u01bb\u0005,\u0000\u0000\u01bb\u01bf\u0005\u0005\u0000\u0000\u01bc\u01be"+
		"\u0005-\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0005\u0006\u0000\u0000\u01c3\u01b8\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u0269\u0005"+
		"\u0012\u0000\u0000\u01c9\u0269\u0005\u0017\u0000\u0000\u01ca\u0269\u0005"+
		"\u0018\u0000\u0000\u01cb\u01cc\u0005,\u0000\u0000\u01cc\u01d0\u0005\u0005"+
		"\u0000\u0000\u01cd\u01d1\u0005,\u0000\u0000\u01ce\u01d1\u0005-\u0000\u0000"+
		"\u01cf\u01d1\u0003\u0014\n\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		"\u01da\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\t\u0000\u0000\u01d3\u01d9"+
		"\u0005,\u0000\u0000\u01d4\u01d5\u0005\t\u0000\u0000\u01d5\u01d9\u0005"+
		"-\u0000\u0000\u01d6\u01d7\u0005\t\u0000\u0000\u01d7\u01d9\u0003\u0014"+
		"\n\u0000\u01d8\u01d2\u0001\u0000\u0000\u0000\u01d8\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dd\u0269\u0007\u0002\u0000\u0000\u01de\u01df\u0005,\u0000\u0000"+
		"\u01df\u01e0\u0005\u0005\u0000\u0000\u01e0\u01e1\u0005\u0005\u0000\u0000"+
		"\u01e1\u01e4\u0003\u0016\u000b\u0000\u01e2\u01e5\u0003\u0014\n\u0000\u01e3"+
		"\u01e5\u0005,\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01fa"+
		"\u0005\u0006\u0000\u0000\u01e7\u01e8\u0005\u0016\u0000\u0000\u01e8\u01e9"+
		"\u0005,\u0000\u0000\u01e9\u01f4\u0005\u0005\u0000\u0000\u01ea\u01ef\u0007"+
		"\u0001\u0000\u0000\u01eb\u01ec\u0005\t\u0000\u0000\u01ec\u01ee\u0007\u0001"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000"+
		"\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f2\u01ea\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f9\u0005\u0006\u0000\u0000\u01f8\u01e7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u0012"+
		"\u0000\u0000\u01fe\u0269\u0001\u0000\u0000\u0000\u01ff\u0200\u0005,\u0000"+
		"\u0000\u0200\u0201\u0005\u0005\u0000\u0000\u0201\u0202\u0005\u0005\u0000"+
		"\u0000\u0202\u0205\u0003\u0016\u000b\u0000\u0203\u0206\u0003\u0014\n\u0000"+
		"\u0204\u0206\u0005,\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207"+
		"\u021b\u0005\u0006\u0000\u0000\u0208\u0209\u0005\u0016\u0000\u0000\u0209"+
		"\u020a\u0005,\u0000\u0000\u020a\u0215\u0005\u0005\u0000\u0000\u020b\u0210"+
		"\u0007\u0001\u0000\u0000\u020c\u020d\u0005\t\u0000\u0000\u020d\u020f\u0007"+
		"\u0001\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0212\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000\u0214\u0217\u0001"+
		"\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001"+
		"\u0000\u0000\u0000\u0218\u021a\u0005\u0006\u0000\u0000\u0219\u0208\u0001"+
		"\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021e\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0005"+
		"\u0006\u0000\u0000\u021f\u0269\u0001\u0000\u0000\u0000\u0220\u0222\u0005"+
		"\u0005\u0000\u0000\u0221\u0223\u0003\u0016\u000b\u0000\u0222\u0221\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0226\u0001"+
		"\u0000\u0000\u0000\u0224\u0227\u0003\u0014\n\u0000\u0225\u0227\u0005,"+
		"\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0269\u0005\u0006"+
		"\u0000\u0000\u0229\u022a\u0005,\u0000\u0000\u022a\u022c\u0005\u000f\u0000"+
		"\u0000\u022b\u022d\u0003\u0016\u000b\u0000\u022c\u022b\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u0236\u0005,\u0000\u0000\u022f\u0230\u0005\u0016\u0000\u0000"+
		"\u0230\u0231\u0005,\u0000\u0000\u0231\u0232\u0005\u0005\u0000\u0000\u0232"+
		"\u0233\u0007\u0001\u0000\u0000\u0233\u0235\u0005\u0006\u0000\u0000\u0234"+
		"\u022f\u0001\u0000\u0000\u0000\u0235\u0238\u0001\u0000\u0000\u0000\u0236"+
		"\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237"+
		"\u0269\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0005\u0019\u0000\u0000\u023a\u023b\u0003\u0010\b\u0000\u023b\u023c"+
		"\u0005\u001a\u0000\u0000\u023c\u023d\u0003\u0010\b\u0000\u023d\u023e\u0005"+
		"\u001b\u0000\u0000\u023e\u0242\u0005\u0002\u0000\u0000\u023f\u0241\u0003"+
		"\u0010\b\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0005\b\u0000\u0000\u0246\u0247\u0005\u001c\u0000"+
		"\u0000\u0247\u0269\u0001\u0000\u0000\u0000\u0248\u0249\u0005\u001d\u0000"+
		"\u0000\u0249\u024a\u0005\u0005\u0000\u0000\u024a\u024b\u0005,\u0000\u0000"+
		"\u024b\u024c\u0003\u0010\b\u0000\u024c\u024d\u0005\u0006\u0000\u0000\u024d"+
		"\u024e\u0005\u001e\u0000\u0000\u024e\u0252\u0005\u0002\u0000\u0000\u024f"+
		"\u0251\u0003\u0010\b\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0254"+
		"\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0001\u0000\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0252"+
		"\u0001\u0000\u0000\u0000\u0255\u0256\u0005\b\u0000\u0000\u0256\u0269\u0001"+
		"\u0000\u0000\u0000\u0257\u0258\u0005\u0019\u0000\u0000\u0258\u0259\u0007"+
		"\u0000\u0000\u0000\u0259\u025a\u0003\u0012\t\u0000\u025a\u025b\u0007\u0000"+
		"\u0000\u0000\u025b\u025e\u0005\u001a\u0000\u0000\u025c\u025f\u0003\u0010"+
		"\b\u0000\u025d\u025f\u0005,\u0000\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0005\u001b\u0000\u0000\u0261\u0265\u0003\u0010\b\u0000"+
		"\u0262\u0264\u0005\u001c\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000"+
		"\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u0152\u0001\u0000\u0000\u0000"+
		"\u0268\u0155\u0001\u0000\u0000\u0000\u0268\u015a\u0001\u0000\u0000\u0000"+
		"\u0268\u015e\u0001\u0000\u0000\u0000\u0268\u0163\u0001\u0000\u0000\u0000"+
		"\u0268\u0167\u0001\u0000\u0000\u0000\u0268\u016e\u0001\u0000\u0000\u0000"+
		"\u0268\u0172\u0001\u0000\u0000\u0000\u0268\u0176\u0001\u0000\u0000\u0000"+
		"\u0268\u017a\u0001\u0000\u0000\u0000\u0268\u017d\u0001\u0000\u0000\u0000"+
		"\u0268\u0181\u0001\u0000\u0000\u0000\u0268\u0187\u0001\u0000\u0000\u0000"+
		"\u0268\u0188\u0001\u0000\u0000\u0000\u0268\u018a\u0001\u0000\u0000\u0000"+
		"\u0268\u018b\u0001\u0000\u0000\u0000\u0268\u018c\u0001\u0000\u0000\u0000"+
		"\u0268\u0196\u0001\u0000\u0000\u0000\u0268\u01a0\u0001\u0000\u0000\u0000"+
		"\u0268\u01ab\u0001\u0000\u0000\u0000\u0268\u01b6\u0001\u0000\u0000\u0000"+
		"\u0268\u01c9\u0001\u0000\u0000\u0000\u0268\u01ca\u0001\u0000\u0000\u0000"+
		"\u0268\u01cb\u0001\u0000\u0000\u0000\u0268\u01de\u0001\u0000\u0000\u0000"+
		"\u0268\u01ff\u0001\u0000\u0000\u0000\u0268\u0220\u0001\u0000\u0000\u0000"+
		"\u0268\u0229\u0001\u0000\u0000\u0000\u0268\u0239\u0001\u0000\u0000\u0000"+
		"\u0268\u0248\u0001\u0000\u0000\u0000\u0268\u0257\u0001\u0000\u0000\u0000"+
		"\u0269\u0273\u0001\u0000\u0000\u0000\u026a\u026d\n\u0005\u0000\u0000\u026b"+
		"\u026c\u0005\u0016\u0000\u0000\u026c\u026e\u0003\u0010\b\u0000\u026d\u026b"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u026d"+
		"\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0272"+
		"\u0001\u0000\u0000\u0000\u0271\u026a\u0001\u0000\u0000\u0000\u0272\u0275"+
		"\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0011\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0007\u0003\u0000\u0000\u0277\u0013"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0007\u0004\u0000\u0000\u0279\u0015"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0007\u0005\u0000\u0000\u027b\u0017"+
		"\u0001\u0000\u0000\u0000C\u001a\u001c-5@FPWbimt{\u0086\u008d\u0091\u0098"+
		"\u009e\u00a5\u00ab\u00b2\u00b8\u00bf\u00c6\u00ce\u00d5\u00e0\u00e9\u00f2"+
		"\u00f7\u0101\u0103\u010b\u0116\u011c\u013d\u0147\u014d\u0150\u0192\u019c"+
		"\u01a7\u01b2\u01bf\u01c5\u01d0\u01d8\u01da\u01e4\u01ef\u01f4\u01fa\u0205"+
		"\u0210\u0215\u021b\u0222\u0226\u022c\u0236\u0242\u0252\u025e\u0265\u0268"+
		"\u026f\u0273";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}