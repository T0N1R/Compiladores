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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0255\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\66\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\7\4E"+
		"\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\4\7"+
		"\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4j\n\4\7\4l\n\4\f\4\16\4o\13\4\3\4\3\4\3\4\3\4\5\4u\n"+
		"\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0087\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u008e\n\4\7\4\u0090\n\4\f\4\16"+
		"\4\u0093\13\4\3\4\3\4\3\4\3\4\5\4\u0099\n\4\3\4\3\4\7\4\u009d\n\4\f\4"+
		"\16\4\u00a0\13\4\3\4\3\4\3\4\3\4\5\4\u00a6\n\4\3\4\3\4\7\4\u00aa\n\4\f"+
		"\4\16\4\u00ad\13\4\3\4\3\4\3\4\3\4\5\4\u00b3\n\4\3\4\3\4\7\4\u00b7\n\4"+
		"\f\4\16\4\u00ba\13\4\3\4\3\4\3\4\3\4\5\4\u00c0\n\4\3\4\3\4\3\4\7\4\u00c5"+
		"\n\4\f\4\16\4\u00c8\13\4\3\4\3\4\3\4\3\4\3\4\5\4\u00cf\n\4\3\4\3\4\3\4"+
		"\7\4\u00d4\n\4\f\4\16\4\u00d7\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00e1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ea\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\u00f1\n\4\f\4\16\4\u00f4\13\4\3\4\3\4\5\4\u00f8\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u0102\n\5\f\5\16\5\u0105\13\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u010c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0115\n\7\f\7\16\7"+
		"\u0118\13\7\3\7\7\7\u011b\n\7\f\7\16\7\u011e\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0137\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u013f\n\t\f\t\16\t\u0142"+
		"\13\t\3\t\7\t\u0145\n\t\f\t\16\t\u0148\13\t\5\t\u014a\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u017e\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0188\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0191\n\n\f\n\16\n\u0194\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u019c\n\n\f"+
		"\n\16\n\u019f\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01a9\n\n\f\n\16"+
		"\n\u01ac\13\n\3\n\7\n\u01af\n\n\f\n\16\n\u01b2\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01bc\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01c4\n\n\f\n"+
		"\16\n\u01c7\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01d0\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u01d9\n\n\f\n\16\n\u01dc\13\n\7\n\u01de\n\n\f\n\16"+
		"\n\u01e1\13\n\3\n\7\n\u01e4\n\n\f\n\16\n\u01e7\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u01f1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01fa\n\n"+
		"\f\n\16\n\u01fd\13\n\7\n\u01ff\n\n\f\n\16\n\u0202\13\n\3\n\7\n\u0205\n"+
		"\n\f\n\16\n\u0208\13\n\3\n\3\n\3\n\3\n\5\n\u020e\n\n\3\n\3\n\5\n\u0212"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u0218\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0220\n"+
		"\n\f\n\16\n\u0223\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u022c\n\n\f\n\16"+
		"\n\u022f\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u023c\n"+
		"\n\f\n\16\n\u023f\13\n\3\n\3\n\5\n\u0243\n\n\3\n\3\n\3\n\6\n\u0248\n\n"+
		"\r\n\16\n\u0249\7\n\u024c\n\n\f\n\16\n\u024f\13\n\3\13\3\13\3\f\3\f\3"+
		"\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\7\3\2\'(\3\2()\4\2\b\b\24\24"+
		"\4\2\23\23 $\3\2%&\2\u02b3\2\34\3\2\2\2\4-\3\2\2\2\6\u00f7\3\2\2\2\b\u010b"+
		"\3\2\2\2\n\u010d\3\2\2\2\f\u0116\3\2\2\2\16\u0136\3\2\2\2\20\u0149\3\2"+
		"\2\2\22\u0242\3\2\2\2\24\u0250\3\2\2\2\26\u0252\3\2\2\2\30\33\7*\2\2\31"+
		"\33\5\4\3\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37 \7\3\2\2 !\7\'\2\2!\"\7\4\2"+
		"\2\"#\5\f\7\2#$\7\5\2\2$.\3\2\2\2%&\7\3\2\2&\'\7\'\2\2\'(\7\6\2\2()\7"+
		"\'\2\2)*\7\4\2\2*+\5\f\7\2+,\7\5\2\2,.\3\2\2\2-\37\3\2\2\2-%\3\2\2\2."+
		"\5\3\2\2\2/\60\7\'\2\2\60\61\7\7\2\2\61\62\7\b\2\2\62\65\7\t\2\2\63\66"+
		"\5\24\13\2\64\66\7\'\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67"+
		"8\7\4\2\289\7\'\2\29\u00f8\7\5\2\2:;\7\'\2\2;<\7\7\2\2<=\7\b\2\2=@\7\t"+
		"\2\2>A\5\24\13\2?A\7\'\2\2@>\3\2\2\2@?\3\2\2\2AB\3\2\2\2BF\7\4\2\2CE\5"+
		"\22\n\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2I\u00f8"+
		"\7\5\2\2JK\7\'\2\2KL\7\7\2\2LM\7\b\2\2MP\7\t\2\2NQ\5\24\13\2OQ\7\'\2\2"+
		"PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\7\4\2\2SW\7\4\2\2TV\5\22\n\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\n\2\2[\u00f8"+
		"\7\5\2\2\\]\7\'\2\2]^\7\7\2\2^_\7\'\2\2_b\7\t\2\2`c\5\24\13\2ac\7\'\2"+
		"\2b`\3\2\2\2ba\3\2\2\2cm\3\2\2\2de\7\13\2\2ef\7\'\2\2fi\7\t\2\2gj\5\24"+
		"\13\2hj\7\'\2\2ig\3\2\2\2ih\3\2\2\2jl\3\2\2\2kd\3\2\2\2lo\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\b\2\2qt\7\t\2\2ru\5\24\13\2s"+
		"u\7\'\2\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\4\2\2w{\7\4\2\2xz\5\22\n\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\n"+
		"\2\2\177\u00f8\7\5\2\2\u0080\u0081\7\'\2\2\u0081\u0082\7\7\2\2\u0082\u0083"+
		"\7\'\2\2\u0083\u0086\7\t\2\2\u0084\u0087\5\24\13\2\u0085\u0087\7\'\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0091\3\2\2\2\u0088\u0089"+
		"\7\13\2\2\u0089\u008a\7\'\2\2\u008a\u008d\7\t\2\2\u008b\u008e\5\24\13"+
		"\2\u008c\u008e\7\'\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u0088\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\b"+
		"\2\2\u0095\u0098\7\t\2\2\u0096\u0099\5\24\13\2\u0097\u0099\7\'\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\7\4"+
		"\2\2\u009b\u009d\5\22\n\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00f8\7\5\2\2\u00a2\u00a5\7\f\2\2\u00a3\u00a6\5\24\13\2\u00a4"+
		"\u00a6\7\'\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ab\7\4\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00f8\7\5\2\2\u00af\u00b2\7\r\2\2\u00b0"+
		"\u00b3\5\24\13\2\u00b1\u00b3\7\'\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\7\4\2\2\u00b5\u00b7\5\22\n\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00f8\7\5\2\2\u00bc"+
		"\u00bf\7\f\2\2\u00bd\u00c0\5\24\13\2\u00be\u00c0\7\'\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\4\2\2\u00c2"+
		"\u00c6\7\4\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\n\2\2\u00ca\u00f8\7\5\2\2\u00cb\u00ce\7\r"+
		"\2\2\u00cc\u00cf\5\24\13\2\u00cd\u00cf\7\'\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d5\7\4"+
		"\2\2\u00d2\u00d4\5\22\n\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00f8\7\5\2\2\u00da\u00db\7\'\2\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00e0\7\t\2\2\u00de\u00e1\5\24"+
		"\13\2\u00df\u00e1\7\'\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00f8\7\16\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5\7"+
		"\7\2\2\u00e5\u00e6\7\b\2\2\u00e6\u00e9\7\t\2\2\u00e7\u00ea\5\24\13\2\u00e8"+
		"\u00ea\7\'\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00f2\7\4\2\2\u00ed\u00ee\5\22\n\2\u00ee"+
		"\u00ef\7\16\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\u00f4\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f8\7\5\2\2\u00f7/\3\2\2\2"+
		"\u00f7:\3\2\2\2\u00f7J\3\2\2\2\u00f7\\\3\2\2\2\u00f7\u0080\3\2\2\2\u00f7"+
		"\u00a2\3\2\2\2\u00f7\u00af\3\2\2\2\u00f7\u00bc\3\2\2\2\u00f7\u00cb\3\2"+
		"\2\2\u00f7\u00da\3\2\2\2\u00f7\u00e3\3\2\2\2\u00f8\7\3\2\2\2\u00f9\u010c"+
		"\7\17\2\2\u00fa\u010c\7\20\2\2\u00fb\u00fc\7\7\2\2\u00fc\u0103\t\2\2\2"+
		"\u00fd\u00fe\7\13\2\2\u00fe\u0102\7\'\2\2\u00ff\u0100\7\13\2\2\u0100\u0102"+
		"\7(\2\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u010c\7\b\2\2\u0107\u0108\7\'\2\2\u0108\u0109\7\7\2\2\u0109"+
		"\u010a\7)\2\2\u010a\u010c\7\b\2\2\u010b\u00f9\3\2\2\2\u010b\u00fa\3\2"+
		"\2\2\u010b\u00fb\3\2\2\2\u010b\u0107\3\2\2\2\u010c\t\3\2\2\2\u010d\u010e"+
		"\7\3\2\2\u010e\u010f\7\'\2\2\u010f\u0110\7\4\2\2\u0110\u0111\5\f\7\2\u0111"+
		"\u0112\7\5\2\2\u0112\13\3\2\2\2\u0113\u0115\5\16\b\2\u0114\u0113\3\2\2"+
		"\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\5\6\4\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\r\3\2\2\2"+
		"\u011e\u011c\3\2\2\2\u011f\u0120\7\'\2\2\u0120\u0121\7\t\2\2\u0121\u0122"+
		"\5\24\13\2\u0122\u0123\7\16\2\2\u0123\u0137\3\2\2\2\u0124\u0125\7\'\2"+
		"\2\u0125\u0126\7\t\2\2\u0126\u0127\7\'\2\2\u0127\u0137\7\16\2\2\u0128"+
		"\u0129\7\'\2\2\u0129\u012a\7\t\2\2\u012a\u012b\5\24\13\2\u012b\u012c\7"+
		"\21\2\2\u012c\u012d\7\22\2\2\u012d\u0137\3\2\2\2\u012e\u012f\7\'\2\2\u012f"+
		"\u0130\7\t\2\2\u0130\u0131\7\23\2\2\u0131\u0132\7\21\2\2\u0132\u0133\7"+
		"-\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7-\2\2\u0135\u0137\7\16\2\2\u0136"+
		"\u011f\3\2\2\2\u0136\u0124\3\2\2\2\u0136\u0128\3\2\2\2\u0136\u012e\3\2"+
		"\2\2\u0137\17\3\2\2\2\u0138\u0139\7\'\2\2\u0139\u013a\7\t\2\2\u013a\u013b"+
		"\5\24\13\2\u013b\u013c\7\16\2\2\u013c\u014a\3\2\2\2\u013d\u013f\5\n\6"+
		"\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u014a\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\5\16\b\2"+
		"\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u0138\3\2\2\2\u0149"+
		"\u0140\3\2\2\2\u0149\u0146\3\2\2\2\u014a\21\3\2\2\2\u014b\u014c\b\n\1"+
		"\2\u014c\u014d\7\'\2\2\u014d\u0243\7\17\2\2\u014e\u014f\7\'\2\2\u014f"+
		"\u0150\7\7\2\2\u0150\u0151\7\'\2\2\u0151\u0152\7\b\2\2\u0152\u0243\7\16"+
		"\2\2\u0153\u0154\7\'\2\2\u0154\u0155\7\7\2\2\u0155\u0156\7\'\2\2\u0156"+
		"\u0243\7\b\2\2\u0157\u0158\7\'\2\2\u0158\u0159\7\7\2\2\u0159\u015a\t\3"+
		"\2\2\u015a\u015b\7\b\2\2\u015b\u0243\7\16\2\2\u015c\u015d\7\'\2\2\u015d"+
		"\u015e\7\7\2\2\u015e\u015f\t\3\2\2\u015f\u0243\7\b\2\2\u0160\u0161\7\'"+
		"\2\2\u0161\u0162\7\21\2\2\u0162\u0163\7)\2\2\u0163\u0243\7\16\2\2\u0164"+
		"\u0165\7\'\2\2\u0165\u0166\7\21\2\2\u0166\u0167\7\'\2\2\u0167\u0243\7"+
		"\16\2\2\u0168\u0169\7\'\2\2\u0169\u016a\7\21\2\2\u016a\u016b\7(\2\2\u016b"+
		"\u0243\7\16\2\2\u016c\u016d\7\'\2\2\u016d\u016e\7\21\2\2\u016e\u0243\7"+
		"\22\2\2\u016f\u0170\7\'\2\2\u0170\u0171\7\7\2\2\u0171\u0172\7(\2\2\u0172"+
		"\u0243\7\24\2\2\u0173\u0243\7\25\2\2\u0174\u0175\t\2\2\2\u0175\u0243\7"+
		"\16\2\2\u0176\u0243\7\26\2\2\u0177\u0178\7\'\2\2\u0178\u0179\7\21\2\2"+
		"\u0179\u017a\7\7\2\2\u017a\u017d\5\26\f\2\u017b\u017e\5\24\13\2\u017c"+
		"\u017e\7\'\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0180\7\24\2\2\u0180\u0243\3\2\2\2\u0181\u0182\7\'\2\2\u0182"+
		"\u0183\7\27\2\2\u0183\u0184\7\'\2\2\u0184\u0185\7\7\2\2\u0185\u0187\7"+
		"-\2\2\u0186\u0188\7\'\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\7-\2\2\u018a\u0243\7\24\2\2\u018b\u018c\7\'"+
		"\2\2\u018c\u018d\7\27\2\2\u018d\u018e\7\'\2\2\u018e\u0192\7\7\2\2\u018f"+
		"\u0191\7(\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0243\7\24\2\2\u0196\u0197\7\'\2\2\u0197\u0198\7\27\2\2\u0198\u0199\7"+
		"\'\2\2\u0199\u019d\7\7\2\2\u019a\u019c\7(\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u0243\7\b\2\2\u01a1\u01a2\7\'\2\2\u01a2"+
		"\u01b0\7\7\2\2\u01a3\u01a4\7\'\2\2\u01a4\u01a5\7\27\2\2\u01a5\u01a6\7"+
		"\'\2\2\u01a6\u01aa\7\7\2\2\u01a7\u01a9\7(\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01af\7\b\2\2\u01ae\u01a3\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u0243\7\24\2\2\u01b4\u0243\7\30\2\2\u01b5"+
		"\u0243\7\31\2\2\u01b6\u01b7\7\'\2\2\u01b7\u01bb\7\7\2\2\u01b8\u01bc\7"+
		"\'\2\2\u01b9\u01bc\7(\2\2\u01ba\u01bc\5\24\13\2\u01bb\u01b8\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01c5\3\2\2\2\u01bd\u01be\7\13"+
		"\2\2\u01be\u01c4\7\'\2\2\u01bf\u01c0\7\13\2\2\u01c0\u01c4\7(\2\2\u01c1"+
		"\u01c2\7\13\2\2\u01c2\u01c4\5\24\13\2\u01c3\u01bd\3\2\2\2\u01c3\u01bf"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u0243\t\4"+
		"\2\2\u01c9\u01ca\7\'\2\2\u01ca\u01cb\7\7\2\2\u01cb\u01cc\7\7\2\2\u01cc"+
		"\u01cf\5\26\f\2\u01cd\u01d0\5\24\13\2\u01ce\u01d0\7\'\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01e5\7\b\2\2\u01d2"+
		"\u01d3\7\27\2\2\u01d3\u01d4\7\'\2\2\u01d4\u01df\7\7\2\2\u01d5\u01da\t"+
		"\3\2\2\u01d6\u01d7\7\13\2\2\u01d7\u01d9\t\3\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01d5\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e4\7\b\2\2\u01e3\u01d2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e8\u01e9\7\24\2\2\u01e9\u0243\3\2\2\2\u01ea\u01eb\7\'\2\2\u01eb"+
		"\u01ec\7\7\2\2\u01ec\u01ed\7\7\2\2\u01ed\u01f0\5\26\f\2\u01ee\u01f1\5"+
		"\24\13\2\u01ef\u01f1\7\'\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u0206\7\b\2\2\u01f3\u01f4\7\27\2\2\u01f4\u01f5\7"+
		"\'\2\2\u01f5\u0200\7\7\2\2\u01f6\u01fb\t\3\2\2\u01f7\u01f8\7\13\2\2\u01f8"+
		"\u01fa\t\3\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u01f6\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0205\7\b\2\2\u0204"+
		"\u01f3\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\b\2\2\u020a"+
		"\u0243\3\2\2\2\u020b\u020d\7\7\2\2\u020c\u020e\5\26\f\2\u020d\u020c\3"+
		"\2\2\2\u020d\u020e\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u0212\5\24\13\2\u0210"+
		"\u0212\7\'\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0243\7\b\2\2\u0214\u0215\7\'\2\2\u0215\u0217\7\21\2\2\u0216"+
		"\u0218\5\26\f\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3"+
		"\2\2\2\u0219\u0221\7\'\2\2\u021a\u021b\7\27\2\2\u021b\u021c\7\'\2\2\u021c"+
		"\u021d\7\7\2\2\u021d\u021e\t\3\2\2\u021e\u0220\7\b\2\2\u021f\u021a\3\2"+
		"\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0243\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7\32\2\2\u0225\u0226\5"+
		"\22\n\2\u0226\u0227\7\33\2\2\u0227\u0228\5\22\n\2\u0228\u0229\7\34\2\2"+
		"\u0229\u022d\7\4\2\2\u022a\u022c\5\22\n\2\u022b\u022a\3\2\2\2\u022c\u022f"+
		"\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\7\n\2\2\u0231\u0232\7\35\2\2\u0232\u0243\3"+
		"\2\2\2\u0233\u0234\7\36\2\2\u0234\u0235\7\7\2\2\u0235\u0236\7\'\2\2\u0236"+
		"\u0237\5\22\n\2\u0237\u0238\7\b\2\2\u0238\u0239\7\37\2\2\u0239\u023d\7"+
		"\4\2\2\u023a\u023c\5\22\n\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0241\7\n\2\2\u0241\u0243\3\2\2\2\u0242\u014b\3\2\2\2\u0242"+
		"\u014e\3\2\2\2\u0242\u0153\3\2\2\2\u0242\u0157\3\2\2\2\u0242\u015c\3\2"+
		"\2\2\u0242\u0160\3\2\2\2\u0242\u0164\3\2\2\2\u0242\u0168\3\2\2\2\u0242"+
		"\u016c\3\2\2\2\u0242\u016f\3\2\2\2\u0242\u0173\3\2\2\2\u0242\u0174\3\2"+
		"\2\2\u0242\u0176\3\2\2\2\u0242\u0177\3\2\2\2\u0242\u0181\3\2\2\2\u0242"+
		"\u018b\3\2\2\2\u0242\u0196\3\2\2\2\u0242\u01a1\3\2\2\2\u0242\u01b4\3\2"+
		"\2\2\u0242\u01b5\3\2\2\2\u0242\u01b6\3\2\2\2\u0242\u01c9\3\2\2\2\u0242"+
		"\u01ea\3\2\2\2\u0242\u020b\3\2\2\2\u0242\u0214\3\2\2\2\u0242\u0224\3\2"+
		"\2\2\u0242\u0233\3\2\2\2\u0243\u024d\3\2\2\2\u0244\u0247\f\6\2\2\u0245"+
		"\u0246\7\27\2\2\u0246\u0248\5\22\n\2\u0247\u0245\3\2\2\2\u0248\u0249\3"+
		"\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b"+
		"\u0244\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\23\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\t\5\2\2\u0251\25"+
		"\3\2\2\2\u0252\u0253\t\6\2\2\u0253\27\3\2\2\2C\32\34-\65@FPWbimt{\u0086"+
		"\u008d\u0091\u0098\u009e\u00a5\u00ab\u00b2\u00b8\u00bf\u00c6\u00ce\u00d5"+
		"\u00e0\u00e9\u00f2\u00f7\u0101\u0103\u010b\u0116\u011c\u0136\u0140\u0146"+
		"\u0149\u017d\u0187\u0192\u019d\u01aa\u01b0\u01bb\u01c3\u01c5\u01cf\u01da"+
		"\u01df\u01e5\u01f0\u01fb\u0200\u0206\u020d\u0211\u0217\u0221\u022d\u023d"+
		"\u0242\u0249\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}