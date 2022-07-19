// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 0 remake\yapl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, ID=26, MINID=27, MAYID=28, NUM=29, STRING=30, DELIMITER=31, 
		QUOTES=32, APOSTROPHE=33, CHAR_LITERAL=34, PARENTESIS=35, COMENTARIO=36, 
		LCOMENTARIO=37;
	public static final int
		RULE_tipoVariable = 0, RULE_start = 1, RULE_clase = 2, RULE_feature_clases = 3, 
		RULE_nombreAtributo = 4, RULE_nombreMetodo = 5, RULE_asignacion = 6, RULE_operacion = 7, 
		RULE_self = 8, RULE_declararAtributo = 9, RULE_inicializar = 10, RULE_metodo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipoVariable", "start", "clase", "feature_clases", "nombreAtributo", 
			"nombreMetodo", "asignacion", "operacion", "self", "declararAtributo", 
			"inicializar", "metodo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'<-'", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'self'", "';'", "':'", "'<='", "'}'", 
			"'('", "','", "')'", "'new'", "'isvoid'", "'<'", "'>'", "'@'", "'.'", 
			null, null, null, null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "MINID", "MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", 
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

	@Override
	public String getGrammarFileName() { return "yapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yaplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(yaplParser.ID, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==ID) ) {
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
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(26);
				clase();
				}
				}
				setState(31);
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
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
		}
		public Feature_clasesContext feature_clases() {
			return getRuleContext(Feature_clasesContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__1);
			setState(33);
			match(ID);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(34);
				match(T__2);
				setState(35);
				match(ID);
				}
			}

			setState(38);
			match(T__3);
			setState(39);
			feature_clases();
			setState(40);
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

	public static class Feature_clasesContext extends ParserRuleContext {
		public List<DeclararAtributoContext> declararAtributo() {
			return getRuleContexts(DeclararAtributoContext.class);
		}
		public DeclararAtributoContext declararAtributo(int i) {
			return getRuleContext(DeclararAtributoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public Feature_clasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_clases; }
	}

	public final Feature_clasesContext feature_clases() throws RecognitionException {
		Feature_clasesContext _localctx = new Feature_clasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature_clases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(42);
					declararAtributo();
					}
					break;
				case 2:
					{
					setState(43);
					metodo(0);
					}
					break;
				}
				}
				setState(48);
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

	public static class NombreAtributoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(yaplParser.ID, 0); }
		public NombreAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreAtributo; }
	}

	public final NombreAtributoContext nombreAtributo() throws RecognitionException {
		NombreAtributoContext _localctx = new NombreAtributoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nombreAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
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

	public static class NombreMetodoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(yaplParser.ID, 0); }
		public NombreMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreMetodo; }
	}

	public final NombreMetodoContext nombreMetodo() throws RecognitionException {
		NombreMetodoContext _localctx = new NombreMetodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nombreMetodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class SelfContext extends ParserRuleContext {
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__11);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				match(T__12);
				}
				break;
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

	public static class DeclararAtributoContext extends ParserRuleContext {
		public List<NombreAtributoContext> nombreAtributo() {
			return getRuleContexts(NombreAtributoContext.class);
		}
		public NombreAtributoContext nombreAtributo(int i) {
			return getRuleContext(NombreAtributoContext.class,i);
		}
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(yaplParser.NUM, 0); }
		public List<DeclararAtributoContext> declararAtributo() {
			return getRuleContexts(DeclararAtributoContext.class);
		}
		public DeclararAtributoContext declararAtributo(int i) {
			return getRuleContext(DeclararAtributoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public DeclararAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararAtributo; }
	}

	public final DeclararAtributoContext declararAtributo() throws RecognitionException {
		DeclararAtributoContext _localctx = new DeclararAtributoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declararAtributo);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				nombreAtributo();
				setState(62);
				match(T__13);
				setState(63);
				tipoVariable();
				setState(64);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				nombreAtributo();
				setState(67);
				match(T__14);
				setState(68);
				tipoVariable();
				setState(69);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				self();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(72);
					match(T__12);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				nombreAtributo();
				setState(76);
				match(T__13);
				setState(77);
				tipoVariable();
				setState(78);
				asignacion();
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(79);
					nombreAtributo();
					}
					break;
				case STRING:
					{
					setState(80);
					match(STRING);
					}
					break;
				case NUM:
					{
					setState(81);
					match(NUM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				nombreAtributo();
				setState(87);
				match(T__13);
				setState(88);
				tipoVariable();
				setState(89);
				match(T__3);
				{
				setState(90);
				nombreAtributo();
				}
				setState(91);
				match(T__15);
				setState(92);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				nombreAtributo();
				setState(95);
				match(T__16);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(96);
					nombreAtributo();
					setState(97);
					match(T__13);
					setState(98);
					tipoVariable();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(105);
					match(T__17);
					setState(106);
					nombreAtributo();
					setState(107);
					match(T__13);
					setState(108);
					tipoVariable();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__18);
				setState(116);
				match(T__13);
				setState(117);
				tipoVariable();
				setState(118);
				match(T__3);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(119);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(120);
						metodo(0);
						}
						break;
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__15);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(127);
					match(T__12);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				nombreAtributo();
				setState(131);
				match(T__16);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(132);
					nombreAtributo();
					setState(133);
					match(T__13);
					setState(134);
					tipoVariable();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(141);
					match(T__17);
					setState(142);
					nombreAtributo();
					setState(143);
					match(T__13);
					setState(144);
					tipoVariable();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__18);
				setState(152);
				match(T__13);
				setState(153);
				tipoVariable();
				setState(154);
				match(T__3);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(155);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(156);
						metodo(0);
						}
						break;
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
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

	public static class InicializarContext extends ParserRuleContext {
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public InicializarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializar; }
	}

	public final InicializarContext inicializar() throws RecognitionException {
		InicializarContext _localctx = new InicializarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inicializar);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__19);
				setState(167);
				tipoVariable();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__20);
				setState(169);
				self();
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

	public static class MetodoContext extends ParserRuleContext {
		public List<NombreMetodoContext> nombreMetodo() {
			return getRuleContexts(NombreMetodoContext.class);
		}
		public NombreMetodoContext nombreMetodo(int i) {
			return getRuleContext(NombreMetodoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public List<NombreAtributoContext> nombreAtributo() {
			return getRuleContexts(NombreAtributoContext.class);
		}
		public NombreAtributoContext nombreAtributo(int i) {
			return getRuleContext(NombreAtributoContext.class,i);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(yaplParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(yaplParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(yaplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(yaplParser.NUM, i);
		}
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
		}
		public List<InicializarContext> inicializar() {
			return getRuleContexts(InicializarContext.class);
		}
		public InicializarContext inicializar(int i) {
			return getRuleContext(InicializarContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	}

	public final MetodoContext metodo() throws RecognitionException {
		return metodo(0);
	}

	private MetodoContext metodo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MetodoContext _localctx = new MetodoContext(_ctx, _parentState);
		MetodoContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_metodo, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(173);
				nombreMetodo();
				setState(174);
				match(T__16);
				setState(175);
				metodo(0);
				setState(176);
				match(T__18);
				setState(177);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(179);
				nombreMetodo();
				setState(180);
				match(T__16);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(181);
					nombreAtributo();
					setState(182);
					match(T__13);
					setState(183);
					tipoVariable();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(190);
					match(T__17);
					setState(191);
					nombreAtributo();
					setState(192);
					match(T__13);
					setState(193);
					tipoVariable();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__18);
				setState(201);
				match(T__13);
				setState(202);
				tipoVariable();
				setState(203);
				match(T__3);
				setState(204);
				metodo(0);
				setState(205);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(207);
				match(T__3);
				setState(208);
				metodo(0);
				setState(209);
				match(T__15);
				}
				break;
			case 4:
				{
				setState(211);
				match(T__16);
				setState(212);
				metodo(0);
				setState(213);
				match(T__18);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(214);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(217);
				nombreAtributo();
				setState(218);
				asignacion();
				setState(219);
				metodo(17);
				}
				break;
			case 6:
				{
				setState(221);
				nombreAtributo();
				setState(222);
				operacion();
				setState(223);
				metodo(0);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(224);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(227);
				nombreAtributo();
				setState(228);
				operacion();
				setState(229);
				nombreAtributo();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(230);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(233);
				nombreAtributo();
				setState(234);
				match(T__12);
				}
				break;
			case 9:
				{
				setState(236);
				nombreMetodo();
				setState(237);
				match(T__16);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(238);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(239);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(240);
						match(ID);
						}
						break;
					case 4:
						{
						setState(241);
						inicializar();
						}
						break;
					case 5:
						{
						setState(242);
						metodo(0);
						}
						break;
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(248);
					match(T__17);
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(249);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(250);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(251);
						match(ID);
						}
						break;
					case 4:
						{
						setState(252);
						inicializar();
						}
						break;
					case 5:
						{
						setState(253);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__18);
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(262);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(265);
				nombreMetodo();
				setState(266);
				match(T__16);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(267);
					match(ID);
					setState(268);
					match(T__13);
					setState(269);
					tipoVariable();
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(275);
					match(T__17);
					setState(276);
					match(ID);
					setState(277);
					match(T__13);
					setState(278);
					tipoVariable();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__18);
				setState(285);
				match(T__13);
				setState(286);
				tipoVariable();
				setState(287);
				match(T__3);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(288);
					metodo(0);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(294);
				match(T__15);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(295);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(298);
				nombreMetodo();
				setState(299);
				match(T__16);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(300);
					match(ID);
					setState(301);
					match(T__13);
					setState(302);
					tipoVariable();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(308);
					match(T__17);
					setState(309);
					match(ID);
					setState(310);
					match(T__13);
					setState(311);
					tipoVariable();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(T__18);
				setState(318);
				match(T__13);
				setState(319);
				tipoVariable();
				setState(320);
				match(T__3);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(321);
					metodo(0);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(T__4);
				}
				break;
			case 12:
				{
				setState(329);
				match(T__16);
				setState(330);
				inicializar();
				setState(331);
				match(T__18);
				}
				break;
			case 13:
				{
				setState(335);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(333);
					nombreMetodo();
					}
					break;
				case 2:
					{
					setState(334);
					tipoVariable();
					}
					break;
				}
				setState(337);
				match(T__24);
				setState(338);
				nombreMetodo();
				setState(339);
				match(T__16);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(340);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(341);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(342);
						match(ID);
						}
						break;
					case 4:
						{
						setState(343);
						inicializar();
						}
						break;
					case 5:
						{
						setState(344);
						metodo(0);
						}
						break;
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(350);
					match(T__17);
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(351);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(352);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(353);
						match(ID);
						}
						break;
					case 4:
						{
						setState(354);
						inicializar();
						}
						break;
					case 5:
						{
						setState(355);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(T__18);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(364);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(367);
				match(T__16);
				setState(368);
				inicializar();
				setState(369);
				match(T__18);
				setState(370);
				match(T__24);
				setState(371);
				metodo(2);
				}
				break;
			case 15:
				{
				setState(373);
				match(T__16);
				setState(374);
				inicializar();
				setState(375);
				match(T__18);
				setState(376);
				match(T__24);
				setState(377);
				nombreMetodo();
				setState(378);
				match(T__16);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(383);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(379);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(380);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(381);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(382);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(388);
					match(T__17);
					setState(393);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(389);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(390);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(391);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(392);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(T__18);
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(401);
					match(T__12);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(445);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(406);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(407);
						asignacion();
						setState(408);
						metodo(19);
						}
						break;
					case 2:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(410);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(411);
						operacion();
						setState(412);
						metodo(16);
						}
						break;
					case 3:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(414);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(415);
						match(T__23);
						setState(416);
						metodo(5);
						}
						break;
					case 4:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(417);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(418);
						match(T__21);
						setState(419);
						metodo(0);
						setState(421);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(420);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 5:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(423);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(424);
						match(T__22);
						setState(425);
						metodo(0);
						setState(427);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
						case 1:
							{
							setState(426);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 6:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(429);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(430);
						match(T__6);
						setState(431);
						metodo(0);
						setState(433);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
						case 1:
							{
							setState(432);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(435);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(436);
						operacion();
						setState(440);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(437);
							nombreAtributo();
							}
							break;
						case STRING:
							{
							setState(438);
							match(STRING);
							}
							break;
						case NUM:
							{
							setState(439);
							match(NUM);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(443);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(442);
							match(T__12);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return metodo_sempred((MetodoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean metodo_sempred(MetodoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u01c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n>\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13U\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13q\n\13\f\13\16\13t\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\13\3\13\5\13\u0083\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\13\3\13\5"+
		"\13\u00a7\n\13\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00e4\n\r\3\r\3\r\3\r\3\r\5\r\u00ea\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0101\n\r\7\r\u0103\n\r\f\r\16\r\u0106\13\r\3\r\3\r\5"+
		"\r\u010a\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0111\n\r\f\r\16\r\u0114\13\r\3\r"+
		"\3\r\3\r\3\r\7\r\u011a\n\r\f\r\16\r\u011d\13\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0124\n\r\f\r\16\r\u0127\13\r\3\r\3\r\5\r\u012b\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0132\n\r\f\r\16\r\u0135\13\r\3\r\3\r\3\r\3\r\7\r\u013b\n\r\f\r"+
		"\16\r\u013e\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u0145\n\r\f\r\16\r\u0148\13\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0152\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u015c\n\r\f\r\16\r\u015f\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0167\n\r\7\r\u0169\n\r\f\r\16\r\u016c\13\r\3\r\3\r\5\r\u0170\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0182"+
		"\n\r\f\r\16\r\u0185\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u018c\n\r\7\r\u018e\n"+
		"\r\f\r\16\r\u0191\13\r\3\r\3\r\5\r\u0195\n\r\5\r\u0197\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01a8\n\r\3\r\3\r"+
		"\3\r\3\r\5\r\u01ae\n\r\3\r\3\r\3\r\3\r\5\r\u01b4\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u01bb\n\r\3\r\5\r\u01be\n\r\7\r\u01c0\n\r\f\r\16\r\u01c3\13\r\3"+
		"\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\4\2\3\3\34\34\3\2\b\t\3"+
		"\2\n\r\2\u0217\2\32\3\2\2\2\4\37\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\63"+
		"\3\2\2\2\f\65\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24\u00a6\3"+
		"\2\2\2\26\u00ac\3\2\2\2\30\u0196\3\2\2\2\32\33\t\2\2\2\33\3\3\2\2\2\34"+
		"\36\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2"+
		"\2\2!\37\3\2\2\2\"#\7\4\2\2#&\7\34\2\2$%\7\5\2\2%\'\7\34\2\2&$\3\2\2\2"+
		"&\'\3\2\2\2\'(\3\2\2\2()\7\6\2\2)*\5\b\5\2*+\7\7\2\2+\7\3\2\2\2,/\5\24"+
		"\13\2-/\5\30\r\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\t\3\2\2\2\62\60\3\2\2\2\63\64\7\34\2\2\64\13\3\2\2\2\65\66\7\34"+
		"\2\2\66\r\3\2\2\2\678\t\3\2\28\17\3\2\2\29:\t\4\2\2:\21\3\2\2\2;=\7\16"+
		"\2\2<>\7\17\2\2=<\3\2\2\2=>\3\2\2\2>\23\3\2\2\2?@\5\n\6\2@A\7\20\2\2A"+
		"B\5\2\2\2BC\7\17\2\2C\u00a7\3\2\2\2DE\5\n\6\2EF\7\21\2\2FG\5\2\2\2GH\7"+
		"\17\2\2H\u00a7\3\2\2\2IK\5\22\n\2JL\7\17\2\2KJ\3\2\2\2KL\3\2\2\2L\u00a7"+
		"\3\2\2\2MN\5\n\6\2NO\7\20\2\2OP\5\2\2\2PT\5\16\b\2QU\5\n\6\2RU\7 \2\2"+
		"SU\7\37\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\7\17\2\2W\u00a7"+
		"\3\2\2\2XY\5\n\6\2YZ\7\20\2\2Z[\5\2\2\2[\\\7\6\2\2\\]\5\n\6\2]^\7\22\2"+
		"\2^_\7\17\2\2_\u00a7\3\2\2\2`a\5\n\6\2ah\7\23\2\2bc\5\n\6\2cd\7\20\2\2"+
		"de\5\2\2\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ir\3\2\2\2"+
		"jh\3\2\2\2kl\7\24\2\2lm\5\n\6\2mn\7\20\2\2no\5\2\2\2oq\3\2\2\2pk\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\25\2\2vw\7\20"+
		"\2\2wx\5\2\2\2x}\7\6\2\2y|\5\24\13\2z|\5\30\r\2{y\3\2\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7"+
		"\22\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u00a7\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u008c\7\23\2\2\u0086\u0087\5"+
		"\n\6\2\u0087\u0088\7\20\2\2\u0088\u0089\5\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\24\2\2\u0090"+
		"\u0091\5\n\6\2\u0091\u0092\7\20\2\2\u0092\u0093\5\2\2\2\u0093\u0095\3"+
		"\2\2\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\25"+
		"\2\2\u009a\u009b\7\20\2\2\u009b\u009c\5\2\2\2\u009c\u00a1\7\6\2\2\u009d"+
		"\u00a0\5\24\13\2\u009e\u00a0\5\30\r\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6?\3\2\2\2\u00a6D\3\2\2\2\u00a6I\3\2\2\2\u00a6M\3\2\2\2\u00a6"+
		"X\3\2\2\2\u00a6`\3\2\2\2\u00a6\u0084\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9"+
		"\7\26\2\2\u00a9\u00ad\5\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ad\5\22\n"+
		"\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af"+
		"\b\r\1\2\u00af\u00b0\5\f\7\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\30\r\2"+
		"\u00b2\u00b3\7\25\2\2\u00b3\u00b4\7\17\2\2\u00b4\u0197\3\2\2\2\u00b5\u00b6"+
		"\5\f\7\2\u00b6\u00bd\7\23\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\7\20\2\2"+
		"\u00b9\u00ba\5\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c7\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\7"+
		"\20\2\2\u00c3\u00c4\5\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\20\2\2\u00cc"+
		"\u00cd\5\2\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7"+
		"\7\2\2\u00d0\u0197\3\2\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\5\30\r\2\u00d3"+
		"\u00d4\7\22\2\2\u00d4\u0197\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\5"+
		"\30\r\2\u00d7\u00d9\7\25\2\2\u00d8\u00da\7\17\2\2\u00d9\u00d8\3\2\2\2"+
		"\u00d9\u00da\3\2\2\2\u00da\u0197\3\2\2\2\u00db\u00dc\5\n\6\2\u00dc\u00dd"+
		"\5\16\b\2\u00dd\u00de\5\30\r\23\u00de\u0197\3\2\2\2\u00df\u00e0\5\n\6"+
		"\2\u00e0\u00e1\5\20\t\2\u00e1\u00e3\5\30\r\2\u00e2\u00e4\7\17\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u0197\3\2\2\2\u00e5\u00e6\5\n"+
		"\6\2\u00e6\u00e7\5\20\t\2\u00e7\u00e9\5\n\6\2\u00e8\u00ea\7\17\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u0197\3\2\2\2\u00eb\u00ec\5\n"+
		"\6\2\u00ec\u00ed\7\17\2\2\u00ed\u0197\3\2\2\2\u00ee\u00ef\5\f\7\2\u00ef"+
		"\u00f7\7\23\2\2\u00f0\u00f6\7 \2\2\u00f1\u00f6\7\37\2\2\u00f2\u00f6\7"+
		"\34\2\2\u00f3\u00f6\5\26\f\2\u00f4\u00f6\5\30\r\2\u00f5\u00f0\3\2\2\2"+
		"\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u0104\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0100\7\24\2\2\u00fb\u0101\7"+
		" \2\2\u00fc\u0101\7\37\2\2\u00fd\u0101\7\34\2\2\u00fe\u0101\5\26\f\2\u00ff"+
		"\u0101\5\30\r\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\25\2\2\u0108"+
		"\u010a\7\17\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0197\3"+
		"\2\2\2\u010b\u010c\5\f\7\2\u010c\u0112\7\23\2\2\u010d\u010e\7\34\2\2\u010e"+
		"\u010f\7\20\2\2\u010f\u0111\5\2\2\2\u0110\u010d\3\2\2\2\u0111\u0114\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011b\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0116\7\24\2\2\u0116\u0117\7\34\2\2\u0117\u0118\7"+
		"\20\2\2\u0118\u011a\5\2\2\2\u0119\u0115\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7\20\2\2\u0120\u0121\5\2\2\2\u0121"+
		"\u0125\7\6\2\2\u0122\u0124\5\30\r\2\u0123\u0122\3\2\2\2\u0124\u0127\3"+
		"\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012a\7\22\2\2\u0129\u012b\7\17\2\2\u012a\u0129\3"+
		"\2\2\2\u012a\u012b\3\2\2\2\u012b\u0197\3\2\2\2\u012c\u012d\5\f\7\2\u012d"+
		"\u0133\7\23\2\2\u012e\u012f\7\34\2\2\u012f\u0130\7\20\2\2\u0130\u0132"+
		"\5\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u013c\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\24"+
		"\2\2\u0137\u0138\7\34\2\2\u0138\u0139\7\20\2\2\u0139\u013b\5\2\2\2\u013a"+
		"\u0136\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\25\2\2\u0140"+
		"\u0141\7\20\2\2\u0141\u0142\5\2\2\2\u0142\u0146\7\6\2\2\u0143\u0145\5"+
		"\30\r\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\7"+
		"\2\2\u014a\u0197\3\2\2\2\u014b\u014c\7\23\2\2\u014c\u014d\5\26\f\2\u014d"+
		"\u014e\7\25\2\2\u014e\u0197\3\2\2\2\u014f\u0152\5\f\7\2\u0150\u0152\5"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\7\33\2\2\u0154\u0155\5\f\7\2\u0155\u015d\7\23\2\2\u0156\u015c\7"+
		" \2\2\u0157\u015c\7\37\2\2\u0158\u015c\7\34\2\2\u0159\u015c\5\26\f\2\u015a"+
		"\u015c\5\30\r\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3"+
		"\2\2\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u016a\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0166\7\24\2\2\u0161\u0167\7 \2\2\u0162\u0167\7\37\2\2\u0163"+
		"\u0167\7\34\2\2\u0164\u0167\5\26\f\2\u0165\u0167\5\30\r\2\u0166\u0161"+
		"\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0160\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016f\7\25\2\2\u016e\u0170\7\17\2\2\u016f\u016e\3"+
		"\2\2\2\u016f\u0170\3\2\2\2\u0170\u0197\3\2\2\2\u0171\u0172\7\23\2\2\u0172"+
		"\u0173\5\26\f\2\u0173\u0174\7\25\2\2\u0174\u0175\7\33\2\2\u0175\u0176"+
		"\5\30\r\4\u0176\u0197\3\2\2\2\u0177\u0178\7\23\2\2\u0178\u0179\5\26\f"+
		"\2\u0179\u017a\7\25\2\2\u017a\u017b\7\33\2\2\u017b\u017c\5\f\7\2\u017c"+
		"\u0183\7\23\2\2\u017d\u0182\7 \2\2\u017e\u0182\7\37\2\2\u017f\u0182\7"+
		"\34\2\2\u0180\u0182\5\26\f\2\u0181\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u018f\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u018b\7\24\2\2\u0187\u018c\7 \2\2\u0188\u018c\7\37\2\2\u0189\u018c\7"+
		"\34\2\2\u018a\u018c\5\26\f\2\u018b\u0187\3\2\2\2\u018b\u0188\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0186\3\2"+
		"\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0194\7\25\2\2\u0193\u0195\7"+
		"\17\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196"+
		"\u00ae\3\2\2\2\u0196\u00b5\3\2\2\2\u0196\u00d1\3\2\2\2\u0196\u00d5\3\2"+
		"\2\2\u0196\u00db\3\2\2\2\u0196\u00df\3\2\2\2\u0196\u00e5\3\2\2\2\u0196"+
		"\u00eb\3\2\2\2\u0196\u00ee\3\2\2\2\u0196\u010b\3\2\2\2\u0196\u012c\3\2"+
		"\2\2\u0196\u014b\3\2\2\2\u0196\u0151\3\2\2\2\u0196\u0171\3\2\2\2\u0196"+
		"\u0177\3\2\2\2\u0197\u01c1\3\2\2\2\u0198\u0199\f\24\2\2\u0199\u019a\5"+
		"\16\b\2\u019a\u019b\5\30\r\25\u019b\u01c0\3\2\2\2\u019c\u019d\f\21\2\2"+
		"\u019d\u019e\5\20\t\2\u019e\u019f\5\30\r\22\u019f\u01c0\3\2\2\2\u01a0"+
		"\u01a1\f\6\2\2\u01a1\u01a2\7\32\2\2\u01a2\u01c0\5\30\r\7\u01a3\u01a4\f"+
		"\20\2\2\u01a4\u01a5\7\30\2\2\u01a5\u01a7\5\30\r\2\u01a6\u01a8\7\17\2\2"+
		"\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01c0\3\2\2\2\u01a9\u01aa"+
		"\f\17\2\2\u01aa\u01ab\7\31\2\2\u01ab\u01ad\5\30\r\2\u01ac\u01ae\7\17\2"+
		"\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01c0\3\2\2\2\u01af\u01b0"+
		"\f\16\2\2\u01b0\u01b1\7\t\2\2\u01b1\u01b3\5\30\r\2\u01b2\u01b4\7\17\2"+
		"\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01c0\3\2\2\2\u01b5\u01b6"+
		"\f\r\2\2\u01b6\u01ba\5\20\t\2\u01b7\u01bb\5\n\6\2\u01b8\u01bb\7 \2\2\u01b9"+
		"\u01bb\7\37\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3"+
		"\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\7\17\2\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u0198\3\2\2\2\u01bf\u019c\3\2"+
		"\2\2\u01bf\u01a0\3\2\2\2\u01bf\u01a3\3\2\2\2\u01bf\u01a9\3\2\2\2\u01bf"+
		"\u01af\3\2\2\2\u01bf\u01b5\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\31\3\2\2\2\u01c3\u01c1\3\2\2\28\37&.\60"+
		"=KThr{}\u0082\u008c\u0096\u009f\u00a1\u00a6\u00ac\u00bd\u00c7\u00d9\u00e3"+
		"\u00e9\u00f5\u00f7\u0100\u0104\u0109\u0112\u011b\u0125\u012a\u0133\u013c"+
		"\u0146\u0151\u015b\u015d\u0166\u016a\u016f\u0181\u0183\u018b\u018f\u0194"+
		"\u0196\u01a7\u01ad\u01b3\u01ba\u01bd\u01bf\u01c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}