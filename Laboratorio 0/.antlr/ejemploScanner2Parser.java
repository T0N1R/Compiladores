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
	}

	public final DeclaracionMetodoContext declaracionMetodo() throws RecognitionException {
		DeclaracionMetodoContext _localctx = new DeclaracionMetodoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracionMetodo);
		int _la;
		try {
			setState(258);
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
				match(T__4);
				setState(59);
				match(ID);
				setState(60);
				match(ID);
				setState(61);
				match(T__6);
				setState(62);
				tipoVariable();
				setState(63);
				match(ID);
				setState(64);
				match(T__1);
				setState(65);
				declaracionOperacion(0);
				setState(66);
				match(T__7);
				setState(67);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(ID);
				setState(70);
				match(T__4);
				setState(71);
				match(T__5);
				setState(72);
				match(T__6);
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(73);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(74);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77);
				match(T__1);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(78);
					declaracionOperacion(0);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(ID);
				setState(86);
				match(T__4);
				setState(87);
				match(T__5);
				setState(88);
				match(T__6);
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(89);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(90);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93);
				match(T__1);
				setState(94);
				match(T__1);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(95);
					declaracionOperacion(0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__7);
				setState(102);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__4);
				setState(105);
				match(ID);
				setState(106);
				match(T__6);
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(107);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(108);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(111);
					match(T__8);
					setState(112);
					match(ID);
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
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__5);
				setState(124);
				match(T__6);
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(125);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(126);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129);
				match(T__1);
				setState(130);
				match(T__1);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(131);
					declaracionOperacion(0);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__7);
				setState(138);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__4);
				setState(141);
				match(ID);
				setState(142);
				match(T__6);
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(143);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(144);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(147);
					match(T__8);
					setState(148);
					match(ID);
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
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__5);
				setState(160);
				match(T__6);
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
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
				match(T__9);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
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
				match(T__10);
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
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
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(192);
					declaracionOperacion(0);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				match(T__9);
				setState(202);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(200);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(201);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204);
				match(T__1);
				setState(205);
				match(T__1);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(206);
					declaracionOperacion(0);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(T__7);
				setState(213);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				match(T__10);
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(215);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(216);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219);
				match(T__1);
				setState(220);
				match(T__1);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(221);
					declaracionOperacion(0);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(T__7);
				setState(228);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
				match(ID);
				setState(230);
				match(T__4);
				setState(231);
				match(T__5);
				setState(232);
				match(T__6);
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(233);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(234);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(237);
				match(T__11);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__4);
				setState(240);
				match(T__5);
				setState(241);
				match(T__6);
				setState(244);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(242);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(243);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(246);
				match(T__1);
				setState(247);
				match(T__1);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(248);
					declaracionOperacion(0);
					setState(249);
					match(T__11);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(T__7);
				setState(257);
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
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__13);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(T__4);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(268);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(264);
						match(T__8);
						setState(265);
						match(ID);
						}
						break;
					case 2:
						{
						setState(266);
						match(T__8);
						setState(267);
						match(NUM);
						}
						break;
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(T__5);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(ID);
				setState(275);
				match(T__4);
				setState(276);
				match(STRING);
				setState(277);
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
			setState(280);
			match(T__0);
			setState(281);
			match(ID);
			setState(282);
			match(T__1);
			{
			setState(283);
			contenidoClase();
			}
			setState(284);
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
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					definirVariables();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0)) {
				{
				{
				setState(292);
				declaracionMetodo();
				}
				}
				setState(297);
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
	}

	public final DefinirVariablesContext definirVariables() throws RecognitionException {
		DefinirVariablesContext _localctx = new DefinirVariablesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definirVariables);
		int _la;
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(ID);
				setState(299);
				match(T__6);
				setState(300);
				tipoVariable();
				setState(301);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(ID);
				setState(304);
				match(T__6);
				setState(305);
				match(ID);
				setState(306);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(ID);
				setState(308);
				match(T__6);
				setState(309);
				tipoVariable();
				setState(310);
				match(T__14);
				setState(311);
				match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(ID);
				setState(314);
				match(T__6);
				setState(315);
				match(T__16);
				setState(316);
				match(T__14);
				setState(317);
				match(QUOTES);
				{
				setState(318);
				match(ID);
				}
				setState(319);
				match(QUOTES);
				setState(320);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321);
				match(ID);
				setState(322);
				match(T__6);
				setState(323);
				tipoVariable();
				setState(324);
				match(T__14);
				setState(325);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(ID);
				setState(331);
				match(T__6);
				setState(332);
				tipoVariable();
				setState(333);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(335);
					clases();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(341);
					definirVariables();
					}
					}
					setState(346);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(350);
				match(ID);
				setState(351);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(352);
				match(ID);
				setState(353);
				match(T__4);
				setState(354);
				match(ID);
				setState(355);
				match(T__5);
				setState(356);
				match(T__11);
				}
				break;
			case 3:
				{
				setState(357);
				match(ID);
				setState(358);
				match(T__4);
				setState(359);
				match(ID);
				setState(360);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(361);
				match(ID);
				setState(362);
				match(T__4);
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
				match(T__5);
				setState(365);
				match(T__11);
				}
				break;
			case 5:
				{
				setState(366);
				match(ID);
				setState(367);
				match(T__4);
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(370);
				match(ID);
				setState(371);
				match(T__4);
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(373);
				operador();
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
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
				setState(377);
				match(ID);
				setState(378);
				match(T__14);
				setState(379);
				match(STRING);
				setState(380);
				match(T__11);
				}
				break;
			case 8:
				{
				setState(381);
				match(ID);
				setState(382);
				match(T__14);
				setState(383);
				match(ID);
				setState(384);
				match(T__11);
				}
				break;
			case 9:
				{
				setState(385);
				match(ID);
				setState(386);
				match(T__14);
				setState(387);
				match(NUM);
				setState(388);
				match(T__11);
				}
				break;
			case 10:
				{
				setState(389);
				match(ID);
				setState(390);
				match(T__14);
				setState(391);
				match(T__15);
				}
				break;
			case 11:
				{
				setState(392);
				match(ID);
				setState(393);
				match(T__4);
				setState(394);
				match(NUM);
				setState(395);
				match(T__17);
				}
				break;
			case 12:
				{
				setState(396);
				match(ID);
				setState(397);
				match(T__14);
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(399);
				operador();
				setState(400);
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
				setState(402);
				match(T__18);
				}
				break;
			case 14:
				{
				setState(403);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				match(T__11);
				}
				break;
			case 15:
				{
				setState(405);
				match(T__19);
				}
				break;
			case 16:
				{
				setState(406);
				match(T__20);
				}
				break;
			case 17:
				{
				setState(407);
				match(ID);
				setState(408);
				match(T__14);
				setState(409);
				match(T__4);
				setState(410);
				declaracionEspecial();
				setState(413);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(411);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(412);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415);
				match(T__17);
				}
				break;
			case 18:
				{
				setState(417);
				match(ID);
				setState(418);
				match(T__21);
				setState(419);
				match(ID);
				setState(420);
				match(T__4);
				setState(421);
				match(QUOTES);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(422);
					match(ID);
					}
				}

				setState(425);
				match(QUOTES);
				setState(426);
				match(T__17);
				}
				break;
			case 19:
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
				match(T__17);
				}
				break;
			case 20:
				{
				setState(438);
				match(ID);
				setState(439);
				match(T__21);
				setState(440);
				match(ID);
				setState(441);
				match(T__4);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(442);
					match(NUM);
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(T__5);
				}
				break;
			case 21:
				{
				setState(449);
				match(ID);
				setState(450);
				match(T__4);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(451);
					match(ID);
					setState(452);
					match(T__21);
					setState(453);
					match(ID);
					setState(454);
					match(T__4);
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM) {
						{
						{
						setState(455);
						match(NUM);
						}
						}
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(461);
					match(T__5);
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467);
				match(T__17);
				}
				break;
			case 22:
				{
				setState(468);
				match(T__22);
				}
				break;
			case 23:
				{
				setState(469);
				match(T__23);
				}
				break;
			case 24:
				{
				setState(470);
				match(ID);
				setState(471);
				match(T__4);
				setState(475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(472);
					match(ID);
					}
					break;
				case NUM:
					{
					setState(473);
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
					setState(474);
					tipoVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						setState(477);
						match(T__8);
						setState(478);
						match(ID);
						}
						break;
					case 2:
						{
						setState(479);
						match(T__8);
						setState(480);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(481);
						match(T__8);
						setState(482);
						tipoVariable();
						}
						break;
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
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
				setState(489);
				match(ID);
				setState(490);
				match(T__4);
				{
				setState(491);
				match(T__4);
				setState(492);
				declaracionEspecial();
				setState(495);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(493);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(494);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(497);
				match(T__5);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(498);
					match(T__21);
					setState(499);
					match(ID);
					setState(500);
					match(T__4);
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(501);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(506);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(502);
							match(T__8);
							setState(503);
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
							setState(508);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(513);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(514);
					match(T__5);
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(520);
				match(T__17);
				}
				break;
			case 26:
				{
				setState(522);
				match(ID);
				setState(523);
				match(T__4);
				{
				setState(524);
				match(T__4);
				setState(525);
				declaracionEspecial();
				setState(528);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(526);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(527);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(530);
				match(T__5);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(531);
					match(T__21);
					setState(532);
					match(ID);
					setState(533);
					match(T__4);
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NUM || _la==STRING) {
						{
						{
						setState(534);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(539);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(535);
							match(T__8);
							setState(536);
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
							setState(541);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						setState(546);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(547);
					match(T__5);
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(553);
				match(T__5);
				}
				break;
			case 27:
				{
				setState(555);
				match(T__4);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41 || _la==T__42) {
					{
					setState(556);
					declaracionEspecial();
					}
				}

				setState(561);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
				case T__20:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
					{
					setState(559);
					tipoVariable();
					}
					break;
				case ID:
					{
					setState(560);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(563);
				match(T__5);
				}
				break;
			case 28:
				{
				setState(564);
				match(ID);
				setState(565);
				match(T__14);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__41 || _la==T__42) {
					{
					setState(566);
					declaracionEspecial();
					}
				}

				setState(569);
				match(ID);
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						match(T__21);
						setState(571);
						match(ID);
						setState(572);
						match(T__4);
						setState(573);
						_la = _input.LA(1);
						if ( !(_la==NUM || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(574);
						match(T__5);
						}
						} 
					}
					setState(579);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case 29:
				{
				setState(580);
				match(T__24);
				setState(581);
				declaracionOperacion(0);
				setState(582);
				match(T__25);
				setState(583);
				declaracionOperacion(0);
				setState(584);
				match(T__26);
				setState(585);
				match(T__1);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(586);
					declaracionOperacion(0);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
				match(T__7);
				setState(593);
				match(T__27);
				}
				break;
			case 30:
				{
				setState(595);
				match(T__28);
				setState(596);
				match(T__4);
				setState(597);
				match(ID);
				setState(598);
				declaracionOperacion(0);
				setState(599);
				match(T__5);
				setState(600);
				match(T__29);
				setState(601);
				match(T__1);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__28) | (1L << ID) | (1L << NUM))) != 0)) {
					{
					{
					setState(602);
					declaracionOperacion(0);
					}
					}
					setState(607);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(608);
				match(T__7);
				}
				break;
			case 31:
				{
				setState(610);
				match(T__24);
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(612);
				operador();
				setState(613);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(614);
				match(T__25);
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(615);
					declaracionOperacion(0);
					}
					break;
				case 2:
					{
					setState(616);
					match(ID);
					}
					break;
				}
				setState(619);
				match(T__26);
				setState(620);
				declaracionOperacion(0);
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(621);
						match(T__27);
						}
						} 
					}
					setState(626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
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
					setState(629);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(632); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(630);
							match(T__21);
							setState(631);
							declaracionOperacion(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(634); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(640);
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
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
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
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
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
	}

	public final DeclaracionEspecialContext declaracionEspecial() throws RecognitionException {
		DeclaracionEspecialContext _localctx = new DeclaracionEspecialContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracionEspecial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u028a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\7\4R\n\4\f\4\16\4U\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\4\7\4c\n\4\f\4\16\4f\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\4\3\4\3\4\3\4\3\4\5\4w\n"+
		"\4\7\4y\n\4\f\4\16\4|\13\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\4\3\4\3\4\7"+
		"\4\u0087\n\4\f\4\16\4\u008a\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0094"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u009b\n\4\7\4\u009d\n\4\f\4\16\4\u00a0\13"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00a6\n\4\3\4\3\4\7\4\u00aa\n\4\f\4\16\4\u00ad"+
		"\13\4\3\4\3\4\3\4\3\4\5\4\u00b3\n\4\3\4\3\4\7\4\u00b7\n\4\f\4\16\4\u00ba"+
		"\13\4\3\4\3\4\3\4\3\4\5\4\u00c0\n\4\3\4\3\4\7\4\u00c4\n\4\f\4\16\4\u00c7"+
		"\13\4\3\4\3\4\3\4\3\4\5\4\u00cd\n\4\3\4\3\4\3\4\7\4\u00d2\n\4\f\4\16\4"+
		"\u00d5\13\4\3\4\3\4\3\4\3\4\3\4\5\4\u00dc\n\4\3\4\3\4\3\4\7\4\u00e1\n"+
		"\4\f\4\16\4\u00e4\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00ee\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f7\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u00fe"+
		"\n\4\f\4\16\4\u0101\13\4\3\4\3\4\5\4\u0105\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5\u010f\n\5\f\5\16\5\u0112\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0119"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\u0122\n\7\f\7\16\7\u0125\13\7\3\7"+
		"\7\7\u0128\n\7\f\7\16\7\u012b\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u014b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0153\n\t\f\t"+
		"\16\t\u0156\13\t\3\t\7\t\u0159\n\t\f\t\16\t\u015c\13\t\5\t\u015e\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01a0\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u01aa\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01b3"+
		"\n\n\f\n\16\n\u01b6\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01be\n\n\f\n\16"+
		"\n\u01c1\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01cb\n\n\f\n\16\n\u01ce"+
		"\13\n\3\n\7\n\u01d1\n\n\f\n\16\n\u01d4\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u01de\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01e6\n\n\f\n\16\n\u01e9"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01f2\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u01fb\n\n\f\n\16\n\u01fe\13\n\7\n\u0200\n\n\f\n\16\n\u0203"+
		"\13\n\3\n\7\n\u0206\n\n\f\n\16\n\u0209\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0213\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u021c\n\n\f\n\16"+
		"\n\u021f\13\n\7\n\u0221\n\n\f\n\16\n\u0224\13\n\3\n\7\n\u0227\n\n\f\n"+
		"\16\n\u022a\13\n\3\n\3\n\3\n\3\n\5\n\u0230\n\n\3\n\3\n\5\n\u0234\n\n\3"+
		"\n\3\n\3\n\3\n\5\n\u023a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0242\n\n\f\n"+
		"\16\n\u0245\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u024e\n\n\f\n\16\n\u0251"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u025e\n\n\f\n\16"+
		"\n\u0261\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u026c\n\n\3\n\3"+
		"\n\3\n\7\n\u0271\n\n\f\n\16\n\u0274\13\n\5\n\u0276\n\n\3\n\3\n\3\n\6\n"+
		"\u027b\n\n\r\n\16\n\u027c\7\n\u027f\n\n\f\n\16\n\u0282\13\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\2\3\22\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\3\2."+
		"/\3\2/\60\4\2\b\b\24\24\3\2!\'\5\2\23\23\27\27(+\3\2,-\2\u02ef\2\36\3"+
		"\2\2\2\4/\3\2\2\2\6\u0104\3\2\2\2\b\u0118\3\2\2\2\n\u011a\3\2\2\2\f\u0123"+
		"\3\2\2\2\16\u014a\3\2\2\2\20\u015d\3\2\2\2\22\u0275\3\2\2\2\24\u0283\3"+
		"\2\2\2\26\u0285\3\2\2\2\30\u0287\3\2\2\2\32\35\7\61\2\2\33\35\5\4\3\2"+
		"\34\32\3\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37"+
		"\3\3\2\2\2 \36\3\2\2\2!\"\7\3\2\2\"#\7.\2\2#$\7\4\2\2$%\5\f\7\2%&\7\5"+
		"\2\2&\60\3\2\2\2\'(\7\3\2\2()\7.\2\2)*\7\6\2\2*+\7.\2\2+,\7\4\2\2,-\5"+
		"\f\7\2-.\7\5\2\2.\60\3\2\2\2/!\3\2\2\2/\'\3\2\2\2\60\5\3\2\2\2\61\62\7"+
		".\2\2\62\63\7\7\2\2\63\64\7\b\2\2\64\67\7\t\2\2\658\5\26\f\2\668\7.\2"+
		"\2\67\65\3\2\2\2\67\66\3\2\2\289\3\2\2\29:\7\4\2\2:;\7.\2\2;\u0105\7\5"+
		"\2\2<=\7\7\2\2=>\7.\2\2>?\7.\2\2?@\7\t\2\2@A\5\26\f\2AB\7.\2\2BC\7\4\2"+
		"\2CD\5\22\n\2DE\7\n\2\2EF\7\b\2\2F\u0105\3\2\2\2GH\7.\2\2HI\7\7\2\2IJ"+
		"\7\b\2\2JM\7\t\2\2KN\5\26\f\2LN\7.\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2O"+
		"S\7\4\2\2PR\5\22\n\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2V\u0105\7\5\2\2WX\7.\2\2XY\7\7\2\2YZ\7\b\2\2Z]\7\t\2\2[^\5\26"+
		"\f\2\\^\7.\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\4\2\2`d\7\4\2\2ac\5"+
		"\22\n\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh"+
		"\7\n\2\2h\u0105\7\5\2\2ij\7.\2\2jk\7\7\2\2kl\7.\2\2lo\7\t\2\2mp\5\26\f"+
		"\2np\7.\2\2om\3\2\2\2on\3\2\2\2pz\3\2\2\2qr\7\13\2\2rs\7.\2\2sv\7\t\2"+
		"\2tw\5\26\f\2uw\7.\2\2vt\3\2\2\2vu\3\2\2\2wy\3\2\2\2xq\3\2\2\2y|\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\b\2\2~\u0081\7\t\2\2\177"+
		"\u0082\5\26\f\2\u0080\u0082\7.\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\7\4\2\2\u0084\u0088\7\4\2\2\u0085\u0087"+
		"\5\22\n\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c"+
		"\7\n\2\2\u008c\u0105\7\5\2\2\u008d\u008e\7.\2\2\u008e\u008f\7\7\2\2\u008f"+
		"\u0090\7.\2\2\u0090\u0093\7\t\2\2\u0091\u0094\5\26\f\2\u0092\u0094\7."+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u009e\3\2\2\2\u0095"+
		"\u0096\7\13\2\2\u0096\u0097\7.\2\2\u0097\u009a\7\t\2\2\u0098\u009b\5\26"+
		"\f\2\u0099\u009b\7.\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0095\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\b\2\2\u00a2\u00a5\7\t\2\2\u00a3\u00a6\5\26\f\2\u00a4\u00a6\7"+
		".\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ab\7\4\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u0105\7\5\2\2\u00af\u00b2\7\f\2\2\u00b0\u00b3\5\26"+
		"\f\2\u00b1\u00b3\7.\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b8\7\4\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u0105\7\5\2\2\u00bc\u00bf\7\r"+
		"\2\2\u00bd\u00c0\5\26\f\2\u00be\u00c0\7.\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\7\4\2\2\u00c2\u00c4\5\22"+
		"\n\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u0105\7\5"+
		"\2\2\u00c9\u00cc\7\f\2\2\u00ca\u00cd\5\26\f\2\u00cb\u00cd\7.\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\4"+
		"\2\2\u00cf\u00d3\7\4\2\2\u00d0\u00d2\5\22\n\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\n\2\2\u00d7\u0105\7\5\2\2\u00d8"+
		"\u00db\7\r\2\2\u00d9\u00dc\5\26\f\2\u00da\u00dc\7.\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\4\2\2\u00de"+
		"\u00e2\7\4\2\2\u00df\u00e1\5\22\n\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\n\2\2\u00e6\u0105\7\5\2\2\u00e7\u00e8\7."+
		"\2\2\u00e8\u00e9\7\7\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00ed\7\t\2\2\u00eb"+
		"\u00ee\5\26\f\2\u00ec\u00ee\7.\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0105\7\16\2\2\u00f0\u00f1\7.\2\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u00f3\7\b\2\2\u00f3\u00f6\7\t\2\2\u00f4\u00f7\5\26"+
		"\f\2\u00f5\u00f7\7.\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\7\4\2\2\u00f9\u00ff\7\4\2\2\u00fa\u00fb\5\22"+
		"\n\2\u00fb\u00fc\7\16\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe"+
		"\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\n\2\2\u0103\u0105\7\5\2\2\u0104"+
		"\61\3\2\2\2\u0104<\3\2\2\2\u0104G\3\2\2\2\u0104W\3\2\2\2\u0104i\3\2\2"+
		"\2\u0104\u008d\3\2\2\2\u0104\u00af\3\2\2\2\u0104\u00bc\3\2\2\2\u0104\u00c9"+
		"\3\2\2\2\u0104\u00d8\3\2\2\2\u0104\u00e7\3\2\2\2\u0104\u00f0\3\2\2\2\u0105"+
		"\7\3\2\2\2\u0106\u0119\7\17\2\2\u0107\u0119\7\20\2\2\u0108\u0109\7\7\2"+
		"\2\u0109\u0110\t\2\2\2\u010a\u010b\7\13\2\2\u010b\u010f\7.\2\2\u010c\u010d"+
		"\7\13\2\2\u010d\u010f\7/\2\2\u010e\u010a\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0119\7\b\2\2\u0114\u0115\7.\2\2\u0115"+
		"\u0116\7\7\2\2\u0116\u0117\7\60\2\2\u0117\u0119\7\b\2\2\u0118\u0106\3"+
		"\2\2\2\u0118\u0107\3\2\2\2\u0118\u0108\3\2\2\2\u0118\u0114\3\2\2\2\u0119"+
		"\t\3\2\2\2\u011a\u011b\7\3\2\2\u011b\u011c\7.\2\2\u011c\u011d\7\4\2\2"+
		"\u011d\u011e\5\f\7\2\u011e\u011f\7\5\2\2\u011f\13\3\2\2\2\u0120\u0122"+
		"\5\16\b\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128"+
		"\5\6\4\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\r\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7.\2\2"+
		"\u012d\u012e\7\t\2\2\u012e\u012f\5\26\f\2\u012f\u0130\7\16\2\2\u0130\u014b"+
		"\3\2\2\2\u0131\u0132\7.\2\2\u0132\u0133\7\t\2\2\u0133\u0134\7.\2\2\u0134"+
		"\u014b\7\16\2\2\u0135\u0136\7.\2\2\u0136\u0137\7\t\2\2\u0137\u0138\5\26"+
		"\f\2\u0138\u0139\7\21\2\2\u0139\u013a\7\22\2\2\u013a\u014b\3\2\2\2\u013b"+
		"\u013c\7.\2\2\u013c\u013d\7\t\2\2\u013d\u013e\7\23\2\2\u013e\u013f\7\21"+
		"\2\2\u013f\u0140\7\64\2\2\u0140\u0141\7.\2\2\u0141\u0142\7\64\2\2\u0142"+
		"\u014b\7\16\2\2\u0143\u0144\7.\2\2\u0144\u0145\7\t\2\2\u0145\u0146\5\26"+
		"\f\2\u0146\u0147\7\21\2\2\u0147\u0148\t\3\2\2\u0148\u0149\7\16\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u012c\3\2\2\2\u014a\u0131\3\2\2\2\u014a\u0135\3\2"+
		"\2\2\u014a\u013b\3\2\2\2\u014a\u0143\3\2\2\2\u014b\17\3\2\2\2\u014c\u014d"+
		"\7.\2\2\u014d\u014e\7\t\2\2\u014e\u014f\5\26\f\2\u014f\u0150\7\16\2\2"+
		"\u0150\u015e\3\2\2\2\u0151\u0153\5\n\6\2\u0152\u0151\3\2\2\2\u0153\u0156"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015e\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\5\16\b\2\u0158\u0157\3\2\2\2\u0159\u015c\3"+
		"\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015d\u014c\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u015a\3\2"+
		"\2\2\u015e\21\3\2\2\2\u015f\u0160\b\n\1\2\u0160\u0161\7.\2\2\u0161\u0276"+
		"\7\17\2\2\u0162\u0163\7.\2\2\u0163\u0164\7\7\2\2\u0164\u0165\7.\2\2\u0165"+
		"\u0166\7\b\2\2\u0166\u0276\7\16\2\2\u0167\u0168\7.\2\2\u0168\u0169\7\7"+
		"\2\2\u0169\u016a\7.\2\2\u016a\u0276\7\b\2\2\u016b\u016c\7.\2\2\u016c\u016d"+
		"\7\7\2\2\u016d\u016e\t\3\2\2\u016e\u016f\7\b\2\2\u016f\u0276\7\16\2\2"+
		"\u0170\u0171\7.\2\2\u0171\u0172\7\7\2\2\u0172\u0173\t\3\2\2\u0173\u0276"+
		"\7\b\2\2\u0174\u0175\7.\2\2\u0175\u0176\7\7\2\2\u0176\u0177\t\3\2\2\u0177"+
		"\u0178\5\24\13\2\u0178\u0179\t\3\2\2\u0179\u017a\t\4\2\2\u017a\u0276\3"+
		"\2\2\2\u017b\u017c\7.\2\2\u017c\u017d\7\21\2\2\u017d\u017e\7\60\2\2\u017e"+
		"\u0276\7\16\2\2\u017f\u0180\7.\2\2\u0180\u0181\7\21\2\2\u0181\u0182\7"+
		".\2\2\u0182\u0276\7\16\2\2\u0183\u0184\7.\2\2\u0184\u0185\7\21\2\2\u0185"+
		"\u0186\7/\2\2\u0186\u0276\7\16\2\2\u0187\u0188\7.\2\2\u0188\u0189\7\21"+
		"\2\2\u0189\u0276\7\22\2\2\u018a\u018b\7.\2\2\u018b\u018c\7\7\2\2\u018c"+
		"\u018d\7/\2\2\u018d\u0276\7\24\2\2\u018e\u018f\7.\2\2\u018f\u0190\7\21"+
		"\2\2\u0190\u0191\t\3\2\2\u0191\u0192\5\24\13\2\u0192\u0193\t\3\2\2\u0193"+
		"\u0276\3\2\2\2\u0194\u0276\7\25\2\2\u0195\u0196\t\2\2\2\u0196\u0276\7"+
		"\16\2\2\u0197\u0276\7\26\2\2\u0198\u0276\7\27\2\2\u0199\u019a\7.\2\2\u019a"+
		"\u019b\7\21\2\2\u019b\u019c\7\7\2\2\u019c\u019f\5\30\r\2\u019d\u01a0\5"+
		"\26\f\2\u019e\u01a0\7.\2\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a2\7\24\2\2\u01a2\u0276\3\2\2\2\u01a3\u01a4\7"+
		".\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\7.\2\2\u01a6\u01a7\7\7\2\2\u01a7"+
		"\u01a9\7\64\2\2\u01a8\u01aa\7.\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7\64\2\2\u01ac\u0276\7\24\2\2\u01ad"+
		"\u01ae\7.\2\2\u01ae\u01af\7\30\2\2\u01af\u01b0\7.\2\2\u01b0\u01b4\7\7"+
		"\2\2\u01b1\u01b3\7/\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b7\u0276\7\24\2\2\u01b8\u01b9\7.\2\2\u01b9\u01ba\7\30\2\2\u01ba"+
		"\u01bb\7.\2\2\u01bb\u01bf\7\7\2\2\u01bc\u01be\7/\2\2\u01bd\u01bc\3\2\2"+
		"\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u0276\7\b\2\2\u01c3\u01c4\7.\2\2\u01c4"+
		"\u01d2\7\7\2\2\u01c5\u01c6\7.\2\2\u01c6\u01c7\7\30\2\2\u01c7\u01c8\7."+
		"\2\2\u01c8\u01cc\7\7\2\2\u01c9\u01cb\7/\2\2\u01ca\u01c9\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7\b\2\2\u01d0\u01c5\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u0276\7\24\2\2\u01d6\u0276\7\31\2\2\u01d7"+
		"\u0276\7\32\2\2\u01d8\u01d9\7.\2\2\u01d9\u01dd\7\7\2\2\u01da\u01de\7."+
		"\2\2\u01db\u01de\7/\2\2\u01dc\u01de\5\26\f\2\u01dd\u01da\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\u01e7\3\2\2\2\u01df\u01e0\7\13"+
		"\2\2\u01e0\u01e6\7.\2\2\u01e1\u01e2\7\13\2\2\u01e2\u01e6\7/\2\2\u01e3"+
		"\u01e4\7\13\2\2\u01e4\u01e6\5\26\f\2\u01e5\u01df\3\2\2\2\u01e5\u01e1\3"+
		"\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u0276\t\4"+
		"\2\2\u01eb\u01ec\7.\2\2\u01ec\u01ed\7\7\2\2\u01ed\u01ee\7\7\2\2\u01ee"+
		"\u01f1\5\30\r\2\u01ef\u01f2\5\26\f\2\u01f0\u01f2\7.\2\2\u01f1\u01ef\3"+
		"\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u0207\7\b\2\2\u01f4"+
		"\u01f5\7\30\2\2\u01f5\u01f6\7.\2\2\u01f6\u0201\7\7\2\2\u01f7\u01fc\t\3"+
		"\2\2\u01f8\u01f9\7\13\2\2\u01f9\u01fb\t\3\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0200\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01ff\u01f7\3\2\2\2\u0200\u0203\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2"+
		"\2\2\u0204\u0206\7\b\2\2\u0205\u01f4\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u020a\u020b\7\24\2\2\u020b\u0276\3\2\2\2\u020c\u020d\7.\2\2\u020d"+
		"\u020e\7\7\2\2\u020e\u020f\7\7\2\2\u020f\u0212\5\30\r\2\u0210\u0213\5"+
		"\26\f\2\u0211\u0213\7.\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0228\7\b\2\2\u0215\u0216\7\30\2\2\u0216\u0217\7"+
		".\2\2\u0217\u0222\7\7\2\2\u0218\u021d\t\3\2\2\u0219\u021a\7\13\2\2\u021a"+
		"\u021c\t\3\2\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u0218\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\7\b\2\2\u0226"+
		"\u0215\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022c\7\b\2\2\u022c"+
		"\u0276\3\2\2\2\u022d\u022f\7\7\2\2\u022e\u0230\5\30\r\2\u022f\u022e\3"+
		"\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u0234\5\26\f\2\u0232"+
		"\u0234\7.\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0276\7\b\2\2\u0236\u0237\7.\2\2\u0237\u0239\7\21\2\2\u0238"+
		"\u023a\5\30\r\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3"+
		"\2\2\2\u023b\u0243\7.\2\2\u023c\u023d\7\30\2\2\u023d\u023e\7.\2\2\u023e"+
		"\u023f\7\7\2\2\u023f\u0240\t\3\2\2\u0240\u0242\7\b\2\2\u0241\u023c\3\2"+
		"\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0276\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\7\33\2\2\u0247\u0248\5"+
		"\22\n\2\u0248\u0249\7\34\2\2\u0249\u024a\5\22\n\2\u024a\u024b\7\35\2\2"+
		"\u024b\u024f\7\4\2\2\u024c\u024e\5\22\n\2\u024d\u024c\3\2\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0253\7\n\2\2\u0253\u0254\7\36\2\2\u0254\u0276\3"+
		"\2\2\2\u0255\u0256\7\37\2\2\u0256\u0257\7\7\2\2\u0257\u0258\7.\2\2\u0258"+
		"\u0259\5\22\n\2\u0259\u025a\7\b\2\2\u025a\u025b\7 \2\2\u025b\u025f\7\4"+
		"\2\2\u025c\u025e\5\22\n\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0262\u0263\7\n\2\2\u0263\u0276\3\2\2\2\u0264\u0265\7\33\2\2\u0265"+
		"\u0266\t\2\2\2\u0266\u0267\5\24\13\2\u0267\u0268\t\2\2\2\u0268\u026b\7"+
		"\34\2\2\u0269\u026c\5\22\n\2\u026a\u026c\7.\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7\35\2\2\u026e\u0272\5"+
		"\22\n\2\u026f\u0271\7\36\2\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0275\u015f\3\2\2\2\u0275\u0162\3\2\2\2\u0275\u0167\3\2\2\2\u0275"+
		"\u016b\3\2\2\2\u0275\u0170\3\2\2\2\u0275\u0174\3\2\2\2\u0275\u017b\3\2"+
		"\2\2\u0275\u017f\3\2\2\2\u0275\u0183\3\2\2\2\u0275\u0187\3\2\2\2\u0275"+
		"\u018a\3\2\2\2\u0275\u018e\3\2\2\2\u0275\u0194\3\2\2\2\u0275\u0195\3\2"+
		"\2\2\u0275\u0197\3\2\2\2\u0275\u0198\3\2\2\2\u0275\u0199\3\2\2\2\u0275"+
		"\u01a3\3\2\2\2\u0275\u01ad\3\2\2\2\u0275\u01b8\3\2\2\2\u0275\u01c3\3\2"+
		"\2\2\u0275\u01d6\3\2\2\2\u0275\u01d7\3\2\2\2\u0275\u01d8\3\2\2\2\u0275"+
		"\u01eb\3\2\2\2\u0275\u020c\3\2\2\2\u0275\u022d\3\2\2\2\u0275\u0236\3\2"+
		"\2\2\u0275\u0246\3\2\2\2\u0275\u0255\3\2\2\2\u0275\u0264\3\2\2\2\u0276"+
		"\u0280\3\2\2\2\u0277\u027a\f\7\2\2\u0278\u0279\7\30\2\2\u0279\u027b\5"+
		"\22\n\2\u027a\u0278\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0277\3\2\2\2\u027f\u0282\3\2"+
		"\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\23\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0283\u0284\t\5\2\2\u0284\25\3\2\2\2\u0285\u0286\t\6\2\2\u0286"+
		"\27\3\2\2\2\u0287\u0288\t\7\2\2\u0288\31\3\2\2\2E\34\36/\67MS]dovz\u0081"+
		"\u0088\u0093\u009a\u009e\u00a5\u00ab\u00b2\u00b8\u00bf\u00c5\u00cc\u00d3"+
		"\u00db\u00e2\u00ed\u00f6\u00ff\u0104\u010e\u0110\u0118\u0123\u0129\u014a"+
		"\u0154\u015a\u015d\u019f\u01a9\u01b4\u01bf\u01cc\u01d2\u01dd\u01e5\u01e7"+
		"\u01f1\u01fc\u0201\u0207\u0212\u021d\u0222\u0228\u022f\u0233\u0239\u0243"+
		"\u024f\u025f\u026b\u0272\u0275\u027c\u0280";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}