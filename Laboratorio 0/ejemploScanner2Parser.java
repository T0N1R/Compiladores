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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, NUM=38, STRING=39, 
		COMENTARIO=40, LCOMENTARIO=41, DELIMITER=42, QUOTES=43, APOSTROPHE=44, 
		CHAR_LITERAL=45, PARENTESIS=46;
	public static final int
		RULE_start = 0, RULE_clase = 1, RULE_declaracionMetodo = 2, RULE_parametrosParaMetodo = 3, 
		RULE_clases = 4, RULE_contenidoClase = 5, RULE_definirVariables = 6, RULE_declaraciones = 7, 
		RULE_declaracionOperacion = 8, RULE_tipoVariable = 9, RULE_declaracionEspecial = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "clase", "declaracionMetodo", "parametrosParaMetodo", "clases", 
			"contenidoClase", "definirVariables", "declaraciones", "declaracionOperacion", 
			"tipoVariable", "declaracionEspecial"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'};'", "'inherits'", "'('", "')'", "':'", "'}'", 
			"','", "'main() :'", "'main():'", "';'", "'();'", "'() ;'", "'<-'", "'\"\";'", 
			"'String'", "');'", "'abort();'", "'self;'", "'.'", "'out_string(\"\\n\");'", 
			"'out_string(\" \");'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'Int'", "'SELF_TYPE'", "'Object'", "'self'", "'Bool'", "'new'", 
			"'isvoid'", null, null, null, null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUM", "STRING", "COMENTARIO", "LCOMENTARIO", "DELIMITER", 
			"QUOTES", "APOSTROPHE", "CHAR_LITERAL", "PARENTESIS"
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==COMENTARIO) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMENTARIO:
					{
					setState(22);
					match(COMENTARIO);
					}
					break;
				case T__0:
					{
					setState(23);
					clase();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(ID);
				setState(31);
				match(T__1);
				{
				setState(32);
				contenidoClase();
				}
				setState(33);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__0);
				setState(36);
				match(ID);
				setState(37);
				match(T__3);
				{
				setState(38);
				match(ID);
				}
				setState(39);
				match(T__1);
				{
				setState(40);
				contenidoClase();
				}
				setState(41);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(ID);
				setState(46);
				match(T__4);
				setState(47);
				match(T__5);
				setState(48);
				match(T__6);
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(49);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(50);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53);
				match(T__1);
				setState(54);
				match(ID);
				setState(55);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ID);
				setState(57);
				match(T__4);
				setState(58);
				match(T__5);
				setState(59);
				match(T__6);
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(60);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(61);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(64);
				match(T__1);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(65);
					declaracionOperacion(0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(ID);
				setState(73);
				match(T__4);
				setState(74);
				match(T__5);
				setState(75);
				match(T__6);
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(76);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(77);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80);
				match(T__1);
				setState(81);
				match(T__1);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(82);
					declaracionOperacion(0);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(T__7);
				setState(89);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__4);
				setState(92);
				match(ID);
				setState(93);
				match(T__6);
				setState(96);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(94);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(95);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(98);
					match(T__8);
					setState(99);
					match(ID);
					setState(100);
					match(T__6);
					setState(103);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
						{
						setState(101);
						tipoVariable();
						}
						break;
					case ID:
						{
						setState(102);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(T__5);
				setState(111);
				match(T__6);
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(112);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(113);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116);
				match(T__1);
				setState(117);
				match(T__1);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(118);
					declaracionOperacion(0);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__7);
				setState(125);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(ID);
				setState(127);
				match(T__4);
				setState(128);
				match(ID);
				setState(129);
				match(T__6);
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(130);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(131);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(134);
					match(T__8);
					setState(135);
					match(ID);
					setState(136);
					match(T__6);
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__16:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case T__33:
						{
						setState(137);
						tipoVariable();
						}
						break;
					case ID:
						{
						setState(138);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__5);
				setState(147);
				match(T__6);
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(148);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(149);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152);
				match(T__1);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(153);
					declaracionOperacion(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(T__9);
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(161);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(162);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165);
				match(T__1);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(166);
					declaracionOperacion(0);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(173);
				match(T__10);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(174);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(175);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				match(T__1);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(179);
					declaracionOperacion(0);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(T__9);
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(187);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(188);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191);
				match(T__1);
				setState(192);
				match(T__1);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(193);
					declaracionOperacion(0);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__7);
				setState(200);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(201);
				match(T__10);
				setState(204);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(202);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(203);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(206);
				match(T__1);
				setState(207);
				match(T__1);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(208);
					declaracionOperacion(0);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__7);
				setState(215);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(216);
				match(ID);
				setState(217);
				match(T__4);
				setState(218);
				match(T__5);
				setState(219);
				match(T__6);
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(220);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(221);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224);
				match(T__11);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(225);
				match(ID);
				setState(226);
				match(T__4);
				setState(227);
				match(T__5);
				setState(228);
				match(T__6);
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(229);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(230);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(233);
				match(T__1);
				setState(234);
				match(T__1);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(235);
					declaracionOperacion(0);
					setState(236);
					match(T__11);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__7);
				setState(244);
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__13);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(T__4);
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(251);
						match(T__8);
						setState(252);
						match(ID);
						}
						break;
					case 2:
						{
						setState(253);
						match(T__8);
						setState(254);
						match(NUM);
						}
						break;
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__4);
				setState(263);
				match(STRING);
				setState(264);
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
			setState(267);
			match(T__0);
			setState(268);
			match(ID);
			setState(269);
			match(T__1);
			{
			setState(270);
			contenidoClase();
			}
			setState(271);
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
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					definirVariables();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(279);
				declaracionMetodo();
				}
				}
				setState(284);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(ID);
				setState(286);
				match(T__6);
				setState(287);
				tipoVariable();
				setState(288);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(ID);
				setState(291);
				match(T__6);
				setState(292);
				match(ID);
				setState(293);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(ID);
				setState(295);
				match(T__6);
				setState(296);
				tipoVariable();
				setState(297);
				match(T__14);
				setState(298);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(ID);
				setState(301);
				match(T__6);
				setState(302);
				match(T__16);
				setState(303);
				match(T__14);
				setState(304);
				match(QUOTES);
				{
				setState(305);
				match(ID);
				}
				setState(306);
				match(QUOTES);
				setState(307);
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
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(ID);
				setState(311);
				match(T__6);
				setState(312);
				tipoVariable();
				setState(313);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(315);
					clases();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(321);
					definirVariables();
					}
					}
					setState(326);
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
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(330);
				match(ID);
				setState(331);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(332);
				match(ID);
				setState(333);
				match(T__4);
				setState(334);
				match(ID);
				setState(335);
				match(T__5);
				setState(336);
				match(T__11);
				}
				break;
			case 3:
				{
				setState(337);
				match(ID);
				setState(338);
				match(T__4);
				setState(339);
				match(ID);
				setState(340);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(341);
				match(ID);
				setState(342);
				match(T__4);
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				match(T__5);
				setState(345);
				match(T__11);
				}
				break;
			case 5:
				{
				setState(346);
				match(ID);
				setState(347);
				match(T__4);
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(350);
				match(ID);
				setState(351);
				match(T__14);
				setState(352);
				match(STRING);
				setState(353);
				match(T__11);
				}
				break;
			case 7:
				{
				setState(354);
				match(ID);
				setState(355);
				match(T__14);
				setState(356);
				match(ID);
				setState(357);
				match(T__11);
				}
				break;
			case 8:
				{
				setState(358);
				match(ID);
				setState(359);
				match(T__14);
				setState(360);
				match(NUM);
				setState(361);
				match(T__11);
				}
				break;
			case 9:
				{
				setState(362);
				match(ID);
				setState(363);
				match(T__14);
				setState(364);
				match(T__15);
				}
				break;
			case 10:
				{
				setState(365);
				match(ID);
				setState(366);
				match(T__4);
				setState(367);
				match(NUM);
				setState(368);
				match(T__17);
				}
				break;
			case 11:
				{
				setState(369);
				match(T__18);
				}
				break;
			case 12:
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				match(T__11);
				}
				break;
			case 13:
				{
				setState(372);
				match(T__19);
				}
				break;
			case 14:
				{
				setState(373);
				match(ID);
				setState(374);
				match(T__14);
				setState(375);
				match(T__4);
				setState(376);
				declaracionEspecial();
				setState(379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(377);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(378);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(381);
				match(T__17);
				}
				break;
			case 15:
				{
				setState(383);
				match(ID);
				setState(384);
				match(T__20);
				setState(385);
				match(ID);
				setState(386);
				match(T__4);
				setState(387);
				match(QUOTES);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(388);
					match(ID);
					}
				}

				setState(391);
				match(QUOTES);
				setState(392);
				match(T__17);
				}
				break;
			case 16:
				{
				setState(393);
				match(ID);
				setState(394);
				match(T__20);
				setState(395);
				match(ID);
				setState(396);
				match(T__4);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(397);
					match(NUM);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(T__17);
				}
				break;
			case 17:
				{
				setState(404);
				match(ID);
				setState(405);
				match(T__20);
				setState(406);
				match(ID);
				setState(407);
				match(T__4);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(408);
					match(NUM);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(T__5);
				}
				break;
			case 18:
				{
				setState(415);
				match(ID);
				setState(416);
				match(T__4);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(417);
					match(ID);
					setState(418);
					match(T__20);
					setState(419);
					match(ID);
					setState(420);
					match(T__4);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(421);
						match(NUM);
						}
						}
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(427);
					match(T__5);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(T__17);
				}
				break;
			case 19:
				{
				setState(434);
				match(T__21);
				}
				break;
			case 20:
				{
				setState(435);
				match(T__22);
				}
				break;
			case 21:
				{
				setState(436);
				match(ID);
				setState(437);
				match(T__4);
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(438);
					match(ID);
					}
					break;
				case NUM:
					{
					setState(439);
					match(NUM);
					}
					break;
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(440);
					tipoVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(443);
						match(T__8);
						setState(444);
						match(ID);
						}
						break;
					case 2:
						{
						setState(445);
						match(T__8);
						setState(446);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(447);
						match(T__8);
						setState(448);
						tipoVariable();
						}
						break;
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(454);
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
			case 22:
				{
				setState(455);
				match(ID);
				setState(456);
				match(T__4);
				{
				setState(457);
				match(T__4);
				setState(458);
				declaracionEspecial();
				setState(461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(459);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(460);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(463);
				match(T__5);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(464);
					match(T__20);
					setState(465);
					match(ID);
					setState(466);
					match(T__4);
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(467);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(472);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(468);
							match(T__8);
							setState(469);
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
							setState(474);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(479);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(480);
					match(T__5);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(486);
				match(T__17);
				}
				break;
			case 23:
				{
				setState(488);
				match(ID);
				setState(489);
				match(T__4);
				{
				setState(490);
				match(T__4);
				setState(491);
				declaracionEspecial();
				setState(494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(492);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(493);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(496);
				match(T__5);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(497);
					match(T__20);
					setState(498);
					match(ID);
					setState(499);
					match(T__4);
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(500);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(501);
							match(T__8);
							setState(502);
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
							setState(507);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(512);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(513);
					match(T__5);
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(519);
				match(T__5);
				}
				break;
			case 24:
				{
				setState(521);
				match(T__4);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34 || _la==T__35) {
					{
					setState(522);
					declaracionEspecial();
					}
				}

				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
					{
					setState(525);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(526);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529);
				match(T__5);
				}
				break;
			case 25:
				{
				setState(530);
				match(ID);
				setState(531);
				match(T__14);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34 || _la==T__35) {
					{
					setState(532);
					declaracionEspecial();
					}
				}

				setState(535);
				match(ID);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						match(T__20);
						setState(537);
						match(ID);
						setState(538);
						match(T__4);
						setState(539);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(540);
						match(T__5);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 26:
				{
				setState(546);
				match(T__23);
				setState(547);
				declaracionOperacion(0);
				setState(548);
				match(T__24);
				setState(549);
				declaracionOperacion(0);
				setState(550);
				match(T__25);
				setState(551);
				match(T__1);
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(552);
					declaracionOperacion(0);
					}
					}
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(558);
				match(T__7);
				setState(559);
				match(T__26);
				}
				break;
			case 27:
				{
				setState(561);
				match(T__27);
				setState(562);
				match(T__4);
				setState(563);
				match(ID);
				setState(564);
				declaracionOperacion(0);
				setState(565);
				match(T__5);
				setState(566);
				match(T__28);
				setState(567);
				match(T__1);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__27) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(568);
					declaracionOperacion(0);
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclaracionOperacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaracionOperacion);
					setState(578);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(581); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(579);
							match(T__20);
							setState(580);
							declaracionOperacion(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(583); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			setState(590);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_declaracionEspecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0253\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"C\b\u0002\n\u0002\f\u0002F\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002"+
		"W\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002a\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002"+
		"\u0005\u0002j\b\u0002\n\u0002\f\u0002m\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002s\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002x\b\u0002\n\u0002\f\u0002{\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u008c\b\u0002\u0005\u0002\u008e\b"+
		"\u0002\n\u0002\f\u0002\u0091\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0097\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u009b\b\u0002\n\u0002\f\u0002\u009e\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00a4\b\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u00a8\b\u0002\n\u0002\f\u0002\u00ab\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00b1\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u00b5\b\u0002\n\u0002\f\u0002\u00b8\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00be\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u00c3\b\u0002\n\u0002\f\u0002\u00c6\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00cd\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00d2\b"+
		"\u0002\n\u0002\f\u0002\u00d5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00df\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00e8\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ef\b\u0002\n\u0002"+
		"\f\u0002\u00f2\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f6\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0100\b\u0003\n\u0003\f\u0003\u0103"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u010a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0005\u0005\u0113\b\u0005\n\u0005\f\u0005"+
		"\u0116\t\u0005\u0001\u0005\u0005\u0005\u0119\b\u0005\n\u0005\f\u0005\u011c"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0135\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u013d\b\u0007\n\u0007\f\u0007\u0140\t\u0007"+
		"\u0001\u0007\u0005\u0007\u0143\b\u0007\n\u0007\f\u0007\u0146\t\u0007\u0003"+
		"\u0007\u0148\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u017c"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0186\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u018f\b\b\n\b\f\b\u0192\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0005\b\u019a\b\b\n\b\f\b\u019d\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u01a7\b\b\n\b\f\b\u01aa\t\b"+
		"\u0001\b\u0005\b\u01ad\b\b\n\b\f\b\u01b0\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01ba\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u01c2\b\b\n\b\f\b\u01c5\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u01ce\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u01d7\b\b\n"+
		"\b\f\b\u01da\t\b\u0005\b\u01dc\b\b\n\b\f\b\u01df\t\b\u0001\b\u0005\b\u01e2"+
		"\b\b\n\b\f\b\u01e5\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u01ef\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u01f8\b\b\n\b\f\b\u01fb\t\b\u0005\b\u01fd\b"+
		"\b\n\b\f\b\u0200\t\b\u0001\b\u0005\b\u0203\b\b\n\b\f\b\u0206\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u020c\b\b\u0001\b\u0001\b\u0003\b\u0210"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0216\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u021e\b\b\n\b\f\b\u0221\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u022a\b\b\n"+
		"\b\f\b\u022d\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u023a\b\b\n\b\f\b\u023d\t\b"+
		"\u0001\b\u0001\b\u0003\b\u0241\b\b\u0001\b\u0001\b\u0001\b\u0004\b\u0246"+
		"\b\b\u000b\b\f\b\u0247\u0005\b\u024a\b\b\n\b\f\b\u024d\t\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0000\u0001\u0010\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0001\u0000%&\u0001\u0000&"+
		"\'\u0002\u0000\u0006\u0006\u0012\u0012\u0002\u0000\u0011\u0011\u001e\""+
		"\u0001\u0000#$\u02b1\u0000\u001a\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u0004\u00f5\u0001\u0000\u0000\u0000\u0006\u0109\u0001"+
		"\u0000\u0000\u0000\b\u010b\u0001\u0000\u0000\u0000\n\u0114\u0001\u0000"+
		"\u0000\u0000\f\u0134\u0001\u0000\u0000\u0000\u000e\u0147\u0001\u0000\u0000"+
		"\u0000\u0010\u0240\u0001\u0000\u0000\u0000\u0012\u024e\u0001\u0000\u0000"+
		"\u0000\u0014\u0250\u0001\u0000\u0000\u0000\u0016\u0019\u0005(\u0000\u0000"+
		"\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005%\u0000\u0000\u001f"+
		" \u0005\u0002\u0000\u0000 !\u0003\n\u0005\u0000!\"\u0005\u0003\u0000\u0000"+
		"\",\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0005%\u0000\u0000"+
		"%&\u0005\u0004\u0000\u0000&\'\u0005%\u0000\u0000\'(\u0005\u0002\u0000"+
		"\u0000()\u0003\n\u0005\u0000)*\u0005\u0003\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+\u001d\u0001\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000,\u0003"+
		"\u0001\u0000\u0000\u0000-.\u0005%\u0000\u0000./\u0005\u0005\u0000\u0000"+
		"/0\u0005\u0006\u0000\u000003\u0005\u0007\u0000\u000014\u0003\u0012\t\u0000"+
		"24\u0005%\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u000067\u0005%\u0000\u0000"+
		"7\u00f6\u0005\u0003\u0000\u000089\u0005%\u0000\u00009:\u0005\u0005\u0000"+
		"\u0000:;\u0005\u0006\u0000\u0000;>\u0005\u0007\u0000\u0000<?\u0003\u0012"+
		"\t\u0000=?\u0005%\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@D\u0005\u0002\u0000\u0000AC\u0003"+
		"\u0010\b\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000G\u00f6\u0005\u0003\u0000\u0000HI\u0005%\u0000"+
		"\u0000IJ\u0005\u0005\u0000\u0000JK\u0005\u0006\u0000\u0000KN\u0005\u0007"+
		"\u0000\u0000LO\u0003\u0012\t\u0000MO\u0005%\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0002\u0000\u0000QU\u0005\u0002\u0000\u0000RT\u0003\u0010\b\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\b\u0000\u0000Y\u00f6\u0005\u0003\u0000\u0000Z[\u0005%\u0000"+
		"\u0000[\\\u0005\u0005\u0000\u0000\\]\u0005%\u0000\u0000]`\u0005\u0007"+
		"\u0000\u0000^a\u0003\u0012\t\u0000_a\u0005%\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ak\u0001\u0000\u0000\u0000bc\u0005"+
		"\t\u0000\u0000cd\u0005%\u0000\u0000dg\u0005\u0007\u0000\u0000eh\u0003"+
		"\u0012\t\u0000fh\u0005%\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0006"+
		"\u0000\u0000or\u0005\u0007\u0000\u0000ps\u0003\u0012\t\u0000qs\u0005%"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0005\u0002\u0000\u0000uy\u0005\u0002\u0000\u0000"+
		"vx\u0003\u0010\b\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005\b\u0000\u0000}\u00f6\u0005\u0003"+
		"\u0000\u0000~\u007f\u0005%\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000"+
		"\u0080\u0081\u0005%\u0000\u0000\u0081\u0084\u0005\u0007\u0000\u0000\u0082"+
		"\u0085\u0003\u0012\t\u0000\u0083\u0085\u0005%\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u008f"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0088\u0005"+
		"%\u0000\u0000\u0088\u008b\u0005\u0007\u0000\u0000\u0089\u008c\u0003\u0012"+
		"\t\u0000\u008a\u008c\u0005%\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\u0006\u0000\u0000\u0093\u0096\u0005\u0007\u0000"+
		"\u0000\u0094\u0097\u0003\u0012\t\u0000\u0095\u0097\u0005%\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009c\u0005\u0002\u0000\u0000"+
		"\u0099\u009b\u0003\u0010\b\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u00f6\u0005\u0003\u0000\u0000\u00a0"+
		"\u00a3\u0005\n\u0000\u0000\u00a1\u00a4\u0003\u0012\t\u0000\u00a2\u00a4"+
		"\u0005%\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a9\u0005"+
		"\u0002\u0000\u0000\u00a6\u00a8\u0003\u0010\b\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00f6\u0005\u0003"+
		"\u0000\u0000\u00ad\u00b0\u0005\u000b\u0000\u0000\u00ae\u00b1\u0003\u0012"+
		"\t\u0000\u00af\u00b1\u0005%\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b6\u0005\u0002\u0000\u0000\u00b3\u00b5\u0003\u0010\b\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00f6\u0005\u0003\u0000\u0000\u00ba\u00bd\u0005\n\u0000\u0000\u00bb"+
		"\u00be\u0003\u0012\t\u0000\u00bc\u00be\u0005%\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000\u00c0\u00c4"+
		"\u0005\u0002\u0000\u0000\u00c1\u00c3\u0003\u0010\b\u0000\u00c2\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\b\u0000\u0000\u00c8\u00f6\u0005\u0003\u0000\u0000\u00c9\u00cc\u0005\u000b"+
		"\u0000\u0000\u00ca\u00cd\u0003\u0012\t\u0000\u00cb\u00cd\u0005%\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0002\u0000"+
		"\u0000\u00cf\u00d3\u0005\u0002\u0000\u0000\u00d0\u00d2\u0003\u0010\b\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\b\u0000\u0000\u00d7\u00f6\u0005\u0003\u0000\u0000\u00d8"+
		"\u00d9\u0005%\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00db"+
		"\u0005\u0006\u0000\u0000\u00db\u00de\u0005\u0007\u0000\u0000\u00dc\u00df"+
		"\u0003\u0012\t\u0000\u00dd\u00df\u0005%\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00f6\u0005\f\u0000\u0000\u00e1\u00e2\u0005%"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3\u00e4\u0005\u0006"+
		"\u0000\u0000\u00e4\u00e7\u0005\u0007\u0000\u0000\u00e5\u00e8\u0003\u0012"+
		"\t\u0000\u00e6\u00e8\u0005%\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u0002\u0000\u0000\u00ea\u00f0\u0005\u0002\u0000"+
		"\u0000\u00eb\u00ec\u0003\u0010\b\u0000\u00ec\u00ed\u0005\f\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\b\u0000\u0000\u00f4"+
		"\u00f6\u0005\u0003\u0000\u0000\u00f5-\u0001\u0000\u0000\u0000\u00f58\u0001"+
		"\u0000\u0000\u0000\u00f5H\u0001\u0000\u0000\u0000\u00f5Z\u0001\u0000\u0000"+
		"\u0000\u00f5~\u0001\u0000\u0000\u0000\u00f5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00f5\u00ad\u0001\u0000\u0000\u0000\u00f5\u00ba\u0001\u0000\u0000\u0000"+
		"\u00f5\u00c9\u0001\u0000\u0000\u0000\u00f5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00f5\u00e1\u0001\u0000\u0000\u0000\u00f6\u0005\u0001\u0000\u0000\u0000"+
		"\u00f7\u010a\u0005\r\u0000\u0000\u00f8\u010a\u0005\u000e\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0005\u0000\u0000\u00fa\u0101\u0007\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\t\u0000\u0000\u00fc\u0100\u0005%\u0000\u0000\u00fd\u00fe"+
		"\u0005\t\u0000\u0000\u00fe\u0100\u0005&\u0000\u0000\u00ff\u00fb\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u010a\u0005\u0006\u0000\u0000\u0105\u0106\u0005"+
		"%\u0000\u0000\u0106\u0107\u0005\u0005\u0000\u0000\u0107\u0108\u0005\'"+
		"\u0000\u0000\u0108\u010a\u0005\u0006\u0000\u0000\u0109\u00f7\u0001\u0000"+
		"\u0000\u0000\u0109\u00f8\u0001\u0000\u0000\u0000\u0109\u00f9\u0001\u0000"+
		"\u0000\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u010a\u0007\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005\u0001\u0000\u0000\u010c\u010d\u0005%\u0000"+
		"\u0000\u010d\u010e\u0005\u0002\u0000\u0000\u010e\u010f\u0003\n\u0005\u0000"+
		"\u010f\u0110\u0005\u0003\u0000\u0000\u0110\t\u0001\u0000\u0000\u0000\u0111"+
		"\u0113\u0003\f\u0006\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u011a\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u0119\u0003\u0004\u0002\u0000\u0118\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u000b"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0005%\u0000\u0000\u011e\u011f\u0005\u0007\u0000\u0000\u011f\u0120\u0003"+
		"\u0012\t\u0000\u0120\u0121\u0005\f\u0000\u0000\u0121\u0135\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005%\u0000\u0000\u0123\u0124\u0005\u0007\u0000"+
		"\u0000\u0124\u0125\u0005%\u0000\u0000\u0125\u0135\u0005\f\u0000\u0000"+
		"\u0126\u0127\u0005%\u0000\u0000\u0127\u0128\u0005\u0007\u0000\u0000\u0128"+
		"\u0129\u0003\u0012\t\u0000\u0129\u012a\u0005\u000f\u0000\u0000\u012a\u012b"+
		"\u0005\u0010\u0000\u0000\u012b\u0135\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005%\u0000\u0000\u012d\u012e\u0005\u0007\u0000\u0000\u012e\u012f\u0005"+
		"\u0011\u0000\u0000\u012f\u0130\u0005\u000f\u0000\u0000\u0130\u0131\u0005"+
		"+\u0000\u0000\u0131\u0132\u0005%\u0000\u0000\u0132\u0133\u0005+\u0000"+
		"\u0000\u0133\u0135\u0005\f\u0000\u0000\u0134\u011d\u0001\u0000\u0000\u0000"+
		"\u0134\u0122\u0001\u0000\u0000\u0000\u0134\u0126\u0001\u0000\u0000\u0000"+
		"\u0134\u012c\u0001\u0000\u0000\u0000\u0135\r\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0005%\u0000\u0000\u0137\u0138\u0005\u0007\u0000\u0000\u0138\u0139"+
		"\u0003\u0012\t\u0000\u0139\u013a\u0005\f\u0000\u0000\u013a\u0148\u0001"+
		"\u0000\u0000\u0000\u013b\u013d\u0003\b\u0004\u0000\u013c\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0148\u0001\u0000"+
		"\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0143\u0003\f\u0006"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u0136\u0001\u0000\u0000\u0000\u0147\u013e\u0001\u0000\u0000"+
		"\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u000f\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0006\b\uffff\uffff\u0000\u014a\u014b\u0005%\u0000"+
		"\u0000\u014b\u0241\u0005\r\u0000\u0000\u014c\u014d\u0005%\u0000\u0000"+
		"\u014d\u014e\u0005\u0005\u0000\u0000\u014e\u014f\u0005%\u0000\u0000\u014f"+
		"\u0150\u0005\u0006\u0000\u0000\u0150\u0241\u0005\f\u0000\u0000\u0151\u0152"+
		"\u0005%\u0000\u0000\u0152\u0153\u0005\u0005\u0000\u0000\u0153\u0154\u0005"+
		"%\u0000\u0000\u0154\u0241\u0005\u0006\u0000\u0000\u0155\u0156\u0005%\u0000"+
		"\u0000\u0156\u0157\u0005\u0005\u0000\u0000\u0157\u0158\u0007\u0001\u0000"+
		"\u0000\u0158\u0159\u0005\u0006\u0000\u0000\u0159\u0241\u0005\f\u0000\u0000"+
		"\u015a\u015b\u0005%\u0000\u0000\u015b\u015c\u0005\u0005\u0000\u0000\u015c"+
		"\u015d\u0007\u0001\u0000\u0000\u015d\u0241\u0005\u0006\u0000\u0000\u015e"+
		"\u015f\u0005%\u0000\u0000\u015f\u0160\u0005\u000f\u0000\u0000\u0160\u0161"+
		"\u0005\'\u0000\u0000\u0161\u0241\u0005\f\u0000\u0000\u0162\u0163\u0005"+
		"%\u0000\u0000\u0163\u0164\u0005\u000f\u0000\u0000\u0164\u0165\u0005%\u0000"+
		"\u0000\u0165\u0241\u0005\f\u0000\u0000\u0166\u0167\u0005%\u0000\u0000"+
		"\u0167\u0168\u0005\u000f\u0000\u0000\u0168\u0169\u0005&\u0000\u0000\u0169"+
		"\u0241\u0005\f\u0000\u0000\u016a\u016b\u0005%\u0000\u0000\u016b\u016c"+
		"\u0005\u000f\u0000\u0000\u016c\u0241\u0005\u0010\u0000\u0000\u016d\u016e"+
		"\u0005%\u0000\u0000\u016e\u016f\u0005\u0005\u0000\u0000\u016f\u0170\u0005"+
		"&\u0000\u0000\u0170\u0241\u0005\u0012\u0000\u0000\u0171\u0241\u0005\u0013"+
		"\u0000\u0000\u0172\u0173\u0007\u0000\u0000\u0000\u0173\u0241\u0005\f\u0000"+
		"\u0000\u0174\u0241\u0005\u0014\u0000\u0000\u0175\u0176\u0005%\u0000\u0000"+
		"\u0176\u0177\u0005\u000f\u0000\u0000\u0177\u0178\u0005\u0005\u0000\u0000"+
		"\u0178\u017b\u0003\u0014\n\u0000\u0179\u017c\u0003\u0012\t\u0000\u017a"+
		"\u017c\u0005%\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017a"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005\u0012\u0000\u0000\u017e\u0241\u0001\u0000\u0000\u0000\u017f\u0180"+
		"\u0005%\u0000\u0000\u0180\u0181\u0005\u0015\u0000\u0000\u0181\u0182\u0005"+
		"%\u0000\u0000\u0182\u0183\u0005\u0005\u0000\u0000\u0183\u0185\u0005+\u0000"+
		"\u0000\u0184\u0186\u0005%\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0005+\u0000\u0000\u0188\u0241\u0005\u0012\u0000\u0000\u0189"+
		"\u018a\u0005%\u0000\u0000\u018a\u018b\u0005\u0015\u0000\u0000\u018b\u018c"+
		"\u0005%\u0000\u0000\u018c\u0190\u0005\u0005\u0000\u0000\u018d\u018f\u0005"+
		"&\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0241\u0005\u0012\u0000\u0000\u0194\u0195\u0005%\u0000"+
		"\u0000\u0195\u0196\u0005\u0015\u0000\u0000\u0196\u0197\u0005%\u0000\u0000"+
		"\u0197\u019b\u0005\u0005\u0000\u0000\u0198\u019a\u0005&\u0000\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u0241\u0005\u0006\u0000\u0000\u019f\u01a0\u0005%\u0000\u0000\u01a0\u01ae"+
		"\u0005\u0005\u0000\u0000\u01a1\u01a2\u0005%\u0000\u0000\u01a2\u01a3\u0005"+
		"\u0015\u0000\u0000\u01a3\u01a4\u0005%\u0000\u0000\u01a4\u01a8\u0005\u0005"+
		"\u0000\u0000\u01a5\u01a7\u0005&\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ad\u0005\u0006\u0000"+
		"\u0000\u01ac\u01a1\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u0241\u0005\u0012\u0000\u0000\u01b2\u0241\u0005\u0016\u0000"+
		"\u0000\u01b3\u0241\u0005\u0017\u0000\u0000\u01b4\u01b5\u0005%\u0000\u0000"+
		"\u01b5\u01b9\u0005\u0005\u0000\u0000\u01b6\u01ba\u0005%\u0000\u0000\u01b7"+
		"\u01ba\u0005&\u0000\u0000\u01b8\u01ba\u0003\u0012\t\u0000\u01b9\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01c3\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0005\t\u0000\u0000\u01bc\u01c2\u0005%\u0000\u0000\u01bd\u01be\u0005"+
		"\t\u0000\u0000\u01be\u01c2\u0005&\u0000\u0000\u01bf\u01c0\u0005\t\u0000"+
		"\u0000\u01c0\u01c2\u0003\u0012\t\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c1\u01bd\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u0241\u0007\u0002\u0000\u0000"+
		"\u01c7\u01c8\u0005%\u0000\u0000\u01c8\u01c9\u0005\u0005\u0000\u0000\u01c9"+
		"\u01ca\u0005\u0005\u0000\u0000\u01ca\u01cd\u0003\u0014\n\u0000\u01cb\u01ce"+
		"\u0003\u0012\t\u0000\u01cc\u01ce\u0005%\u0000\u0000\u01cd\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01e3\u0005\u0006\u0000\u0000\u01d0\u01d1\u0005"+
		"\u0015\u0000\u0000\u01d1\u01d2\u0005%\u0000\u0000\u01d2\u01dd\u0005\u0005"+
		"\u0000\u0000\u01d3\u01d8\u0007\u0001\u0000\u0000\u01d4\u01d5\u0005\t\u0000"+
		"\u0000\u01d5\u01d7\u0007\u0001\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d7\u01da\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000"+
		"\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000"+
		"\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e2\u0005\u0006\u0000"+
		"\u0000\u01e1\u01d0\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005\u0012\u0000\u0000\u01e7\u0241\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u0005%\u0000\u0000\u01e9\u01ea\u0005\u0005\u0000\u0000"+
		"\u01ea\u01eb\u0005\u0005\u0000\u0000\u01eb\u01ee\u0003\u0014\n\u0000\u01ec"+
		"\u01ef\u0003\u0012\t\u0000\u01ed\u01ef\u0005%\u0000\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f0\u0204\u0005\u0006\u0000\u0000\u01f1\u01f2"+
		"\u0005\u0015\u0000\u0000\u01f2\u01f3\u0005%\u0000\u0000\u01f3\u01fe\u0005"+
		"\u0005\u0000\u0000\u01f4\u01f9\u0007\u0001\u0000\u0000\u01f5\u01f6\u0005"+
		"\t\u0000\u0000\u01f6\u01f8\u0007\u0001\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01f4\u0001\u0000"+
		"\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000"+
		"\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0203\u0005\u0006"+
		"\u0000\u0000\u0202\u01f1\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000"+
		"\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0005\u0006\u0000\u0000\u0208\u0241\u0001\u0000"+
		"\u0000\u0000\u0209\u020b\u0005\u0005\u0000\u0000\u020a\u020c\u0003\u0014"+
		"\n\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u0210\u0003\u0012\t\u0000"+
		"\u020e\u0210\u0005%\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211"+
		"\u0241\u0005\u0006\u0000\u0000\u0212\u0213\u0005%\u0000\u0000\u0213\u0215"+
		"\u0005\u000f\u0000\u0000\u0214\u0216\u0003\u0014\n\u0000\u0215\u0214\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u021f\u0005%\u0000\u0000\u0218\u0219\u0005\u0015"+
		"\u0000\u0000\u0219\u021a\u0005%\u0000\u0000\u021a\u021b\u0005\u0005\u0000"+
		"\u0000\u021b\u021c\u0007\u0001\u0000\u0000\u021c\u021e\u0005\u0006\u0000"+
		"\u0000\u021d\u0218\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0241\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0005\u0018\u0000\u0000\u0223\u0224\u0003\u0010\b\u0000"+
		"\u0224\u0225\u0005\u0019\u0000\u0000\u0225\u0226\u0003\u0010\b\u0000\u0226"+
		"\u0227\u0005\u001a\u0000\u0000\u0227\u022b\u0005\u0002\u0000\u0000\u0228"+
		"\u022a\u0003\u0010\b\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u022d"+
		"\u0001\u0000\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u022b"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0005\b\u0000\u0000\u022f\u0230\u0005"+
		"\u001b\u0000\u0000\u0230\u0241\u0001\u0000\u0000\u0000\u0231\u0232\u0005"+
		"\u001c\u0000\u0000\u0232\u0233\u0005\u0005\u0000\u0000\u0233\u0234\u0005"+
		"%\u0000\u0000\u0234\u0235\u0003\u0010\b\u0000\u0235\u0236\u0005\u0006"+
		"\u0000\u0000\u0236\u0237\u0005\u001d\u0000\u0000\u0237\u023b\u0005\u0002"+
		"\u0000\u0000\u0238\u023a\u0003\u0010\b\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0005\b\u0000\u0000"+
		"\u023f\u0241\u0001\u0000\u0000\u0000\u0240\u0149\u0001\u0000\u0000\u0000"+
		"\u0240\u014c\u0001\u0000\u0000\u0000\u0240\u0151\u0001\u0000\u0000\u0000"+
		"\u0240\u0155\u0001\u0000\u0000\u0000\u0240\u015a\u0001\u0000\u0000\u0000"+
		"\u0240\u015e\u0001\u0000\u0000\u0000\u0240\u0162\u0001\u0000\u0000\u0000"+
		"\u0240\u0166\u0001\u0000\u0000\u0000\u0240\u016a\u0001\u0000\u0000\u0000"+
		"\u0240\u016d\u0001\u0000\u0000\u0000\u0240\u0171\u0001\u0000\u0000\u0000"+
		"\u0240\u0172\u0001\u0000\u0000\u0000\u0240\u0174\u0001\u0000\u0000\u0000"+
		"\u0240\u0175\u0001\u0000\u0000\u0000\u0240\u017f\u0001\u0000\u0000\u0000"+
		"\u0240\u0189\u0001\u0000\u0000\u0000\u0240\u0194\u0001\u0000\u0000\u0000"+
		"\u0240\u019f\u0001\u0000\u0000\u0000\u0240\u01b2\u0001\u0000\u0000\u0000"+
		"\u0240\u01b3\u0001\u0000\u0000\u0000\u0240\u01b4\u0001\u0000\u0000\u0000"+
		"\u0240\u01c7\u0001\u0000\u0000\u0000\u0240\u01e8\u0001\u0000\u0000\u0000"+
		"\u0240\u0209\u0001\u0000\u0000\u0000\u0240\u0212\u0001\u0000\u0000\u0000"+
		"\u0240\u0222\u0001\u0000\u0000\u0000\u0240\u0231\u0001\u0000\u0000\u0000"+
		"\u0241\u024b\u0001\u0000\u0000\u0000\u0242\u0245\n\u0004\u0000\u0000\u0243"+
		"\u0244\u0005\u0015\u0000\u0000\u0244\u0246\u0003\u0010\b\u0000\u0245\u0243"+
		"\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0245"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024a"+
		"\u0001\u0000\u0000\u0000\u0249\u0242\u0001\u0000\u0000\u0000\u024a\u024d"+
		"\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u0001\u0000\u0000\u0000\u024c\u0011\u0001\u0000\u0000\u0000\u024d\u024b"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0007\u0003\u0000\u0000\u024f\u0013"+
		"\u0001\u0000\u0000\u0000\u0250\u0251\u0007\u0004\u0000\u0000\u0251\u0015"+
		"\u0001\u0000\u0000\u0000A\u0018\u001a+3>DNU`gkry\u0084\u008b\u008f\u0096"+
		"\u009c\u00a3\u00a9\u00b0\u00b6\u00bd\u00c4\u00cc\u00d3\u00de\u00e7\u00f0"+
		"\u00f5\u00ff\u0101\u0109\u0114\u011a\u0134\u013e\u0144\u0147\u017b\u0185"+
		"\u0190\u019b\u01a8\u01ae\u01b9\u01c1\u01c3\u01cd\u01d8\u01dd\u01e3\u01ee"+
		"\u01f9\u01fe\u0204\u020b\u020f\u0215\u021f\u022b\u023b\u0240\u0247\u024b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}