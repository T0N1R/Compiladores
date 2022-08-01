// Generated from newYapl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newYaplParser extends Parser {
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
		T__38=39, ID=40, NUM=41, STRING=42, DELIMITER=43, QUOTES=44, APOSTROPHE=45, 
		CHAR_LITERAL=46, PARENTESIS=47, COMENTARIO=48, LCOMENTARIO=49;
	public static final int
		RULE_tipoVariable = 0, RULE_start = 1, RULE_clase = 2, RULE_feature_clases = 3, 
		RULE_bool = 4, RULE_coma = 5, RULE_punto = 6, RULE_self = 7, RULE_operacion = 8, 
		RULE_expr = 9, RULE_inicializar = 10, RULE_declararAtributo = 11, RULE_metodo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipoVariable", "start", "clase", "feature_clases", "bool", "coma", "punto", 
			"self", "operacion", "expr", "inicializar", "declararAtributo", "metodo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'true'", 
			"'false'", "','", "'.'", "'self'", "';'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'new'", "'isvoid'", "':'", "'<-'", 
			"'('", "')'", "'}'", "'not'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'let'", "'in'", "'~'", "'@'", null, null, null, 
			null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUM", "STRING", "DELIMITER", "QUOTES", 
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
	public String getGrammarFileName() { return "newYapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public newYaplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(newYaplParser.ID, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitTipoVariable(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(28);
				clase();
				}
				}
				setState(33);
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
		public List<TerminalNode> ID() { return getTokens(newYaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newYaplParser.ID, i);
		}
		public Feature_clasesContext feature_clases() {
			return getRuleContext(Feature_clasesContext.class,0);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitClase(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(35);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(36);
				match(T__2);
				setState(37);
				match(ID);
				}
			}

			setState(40);
			match(T__3);
			setState(41);
			feature_clases();
			setState(42);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterFeature_clases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitFeature_clases(this);
		}
	}

	public final Feature_clasesContext feature_clases() throws RecognitionException {
		Feature_clasesContext _localctx = new Feature_clasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature_clases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(44);
					declararAtributo();
					}
					break;
				case 2:
					{
					setState(45);
					metodo();
					}
					break;
				}
				}
				setState(50);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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

	public static class ComaContext extends ParserRuleContext {
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
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

	public static class PuntoContext extends ParserRuleContext {
		public PuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitPunto(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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

	public static class SelfContext extends ParserRuleContext {
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitSelf(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__9);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				match(T__10);
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

	public static class OperacionContext extends ParserRuleContext {
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(newYaplParser.ID, 0); }
		public TerminalNode STRING() { return getToken(newYaplParser.STRING, 0); }
		public DeclararAtributoContext declararAtributo() {
			return getRuleContext(DeclararAtributoContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NUM() { return getToken(newYaplParser.NUM, 0); }
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(STRING);
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(68);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(ID);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(72);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				declararAtributo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				metodo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				bool();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				match(NUM);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(82);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(85);
				self();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterInicializar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitInicializar(this);
		}
	}

	public final InicializarContext inicializar() throws RecognitionException {
		InicializarContext _localctx = new InicializarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inicializar);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__20);
				setState(89);
				tipoVariable();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__21);
				setState(91);
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

	public static class DeclararAtributoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(newYaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newYaplParser.ID, i);
		}
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InicializarContext inicializar() {
			return getRuleContext(InicializarContext.class,0);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public DeclararAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterDeclararAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitDeclararAtributo(this);
		}
	}

	public final DeclararAtributoContext declararAtributo() throws RecognitionException {
		DeclararAtributoContext _localctx = new DeclararAtributoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declararAtributo);
		int _la;
		try {
			int _alt;
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(ID);
				setState(95);
				match(T__22);
				setState(96);
				tipoVariable();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(97);
					match(T__23);
					setState(98);
					expr();
					}
				}

				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(101);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(ID);
				setState(105);
				match(T__23);
				setState(106);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(107);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(ID);
				setState(111);
				match(T__23);
				setState(112);
				inicializar();
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						punto();
						setState(114);
						metodo();
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(121);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(ID);
				setState(125);
				match(T__23);
				setState(126);
				match(ID);
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(127);
						operacion();
						setState(128);
						metodo();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(135);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(ID);
				setState(139);
				match(T__23);
				setState(140);
				expr();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(141);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__23);
				setState(146);
				match(T__3);
				setState(147);
				expr();
				setState(148);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				self();
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

	public static class MetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(newYaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(newYaplParser.ID, i);
		}
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public List<PuntoContext> punto() {
			return getRuleContexts(PuntoContext.class);
		}
		public PuntoContext punto(int i) {
			return getRuleContext(PuntoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public InicializarContext inicializar() {
			return getRuleContext(InicializarContext.class,0);
		}
		public TerminalNode STRING() { return getToken(newYaplParser.STRING, 0); }
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode NUM() { return getToken(newYaplParser.NUM, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newYaplListener ) ((newYaplListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_metodo);
		int _la;
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__24);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(155);
					match(ID);
					setState(156);
					match(T__22);
					setState(157);
					tipoVariable();
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(158);
						coma();
						setState(159);
						match(ID);
						setState(160);
						match(T__22);
						setState(161);
						tipoVariable();
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__25);
				setState(171);
				match(T__22);
				setState(172);
				tipoVariable();
				setState(173);
				match(T__3);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(174);
					match(T__3);
					}
					break;
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(177);
					expr();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__26);
					}
					break;
				}
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(ID);
				setState(189);
				match(T__24);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(190);
					expr();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(191);
						coma();
						setState(192);
						expr();
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(201);
				match(T__25);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(202);
					punto();
					setState(203);
					metodo();
					}
					break;
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						match(T__10);
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__24);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(214);
					match(T__27);
					}
				}

				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
					{
					setState(217);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__9:
				case T__24:
				case T__28:
				case T__32:
				case T__35:
				case T__37:
				case ID:
				case NUM:
				case STRING:
					{
					setState(218);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				match(T__25);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(222);
					punto();
					setState(223);
					metodo();
					}
					break;
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(T__10);
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__28);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(234);
					expr();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(T__29);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(241);
					expr();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(T__30);
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						expr();
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(254);
						match(T__31);
						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(260);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(T__32);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(264);
					expr();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__33);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(271);
					expr();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(T__34);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(278);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(T__3);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(282);
					expr();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(T__3);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(290);
					expr();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(T__26);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(T__24);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(298);
					expr();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(T__25);
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(T__10);
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(311);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
				punto();
				setState(313);
				metodo();
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						punto();
						setState(315);
						metodo();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(322);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				match(T__35);
				setState(326);
				match(ID);
				setState(327);
				match(T__22);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(328);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(329);
					expr();
					}
					break;
				}
				setState(332);
				match(T__36);
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(333);
							expr();
							}
							} 
						}
						setState(338);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(339);
					match(T__3);
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						{
						setState(340);
						expr();
						}
						}
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(346);
					match(T__26);
					}
					break;
				case 3:
					{
					setState(347);
					match(T__24);
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						{
						setState(348);
						expr();
						}
						}
						setState(353);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(354);
					match(T__25);
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(357);
						match(T__10);
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(364);
				operacion();
				{
				setState(365);
				expr();
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366);
						operacion();
						setState(367);
						expr();
						}
						} 
					}
					setState(373);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(374);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				match(T__37);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(378);
					match(ID);
					}
					break;
				case 2:
					{
					setState(379);
					expr();
					}
					break;
				}
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(382);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(385);
				match(T__32);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(386);
					expr();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(T__33);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(393);
					match(T__3);
					}
					break;
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						expr();
						}
						} 
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(402);
					match(T__26);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(405);
				match(T__32);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(406);
					expr();
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(T__33);
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(413);
					match(T__3);
					}
					break;
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(416);
					expr();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(422);
					match(T__26);
					}
				}

				setState(425);
				match(T__34);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(426);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(429);
				match(T__24);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(430);
					match(T__27);
					}
				}

				setState(435);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
					{
					setState(433);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__9:
				case T__24:
				case T__28:
				case T__32:
				case T__35:
				case T__37:
				case ID:
				case NUM:
				case STRING:
					{
					setState(434);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(437);
				match(T__25);
				setState(438);
				match(T__38);
				setState(439);
				match(ID);
				setState(440);
				punto();
				setState(441);
				metodo();
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						punto();
						setState(443);
						metodo();
						}
						} 
					}
					setState(449);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(450);
					match(T__10);
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(453);
				match(T__24);
				setState(454);
				match(T__35);
				setState(455);
				match(ID);
				setState(456);
				match(T__22);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(457);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(458);
					expr();
					}
					break;
				}
				setState(461);
				match(T__36);
				setState(462);
				metodo();
				setState(463);
				match(T__25);
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

	public static final String _serializedATN =
		"\u0004\u00011\u01d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e\b\u0001"+
		"\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007<\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0003\tB\b\t\u0001\t\u0001\t\u0003\tF\b\t\u0001\t\u0001\t\u0003"+
		"\tJ\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tP\b\t\u0001\t\u0001\t\u0003"+
		"\tT\b\t\u0001\t\u0003\tW\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n]"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000bd\b\u000b\u0001\u000b\u0003\u000bg\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bm\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bu\b\u000b"+
		"\n\u000b\f\u000bx\t\u000b\u0001\u000b\u0003\u000b{\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0083\b\u000b\n\u000b\f\u000b\u0086\t\u000b\u0001\u000b\u0003\u000b\u0089"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a4\b\f\n"+
		"\f\f\f\u00a7\t\f\u0003\f\u00a9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00b0\b\f\u0001\f\u0005\f\u00b3\b\f\n\f\f\f\u00b6\t\f\u0001"+
		"\f\u0003\f\u00b9\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00c3\b\f\n\f\f\f\u00c6\t\f\u0003\f\u00c8\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ce\b\f\u0001\f\u0005\f\u00d1\b\f"+
		"\n\f\f\f\u00d4\t\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00dc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2\b\f\u0001\f"+
		"\u0005\f\u00e5\b\f\n\f\f\f\u00e8\t\f\u0001\f\u0001\f\u0005\f\u00ec\b\f"+
		"\n\f\f\f\u00ef\t\f\u0001\f\u0001\f\u0005\f\u00f3\b\f\n\f\f\f\u00f6\t\f"+
		"\u0001\f\u0001\f\u0005\f\u00fa\b\f\n\f\f\f\u00fd\t\f\u0001\f\u0005\f\u0100"+
		"\b\f\n\f\f\f\u0103\t\f\u0001\f\u0003\f\u0106\b\f\u0001\f\u0001\f\u0005"+
		"\f\u010a\b\f\n\f\f\f\u010d\t\f\u0001\f\u0001\f\u0005\f\u0111\b\f\n\f\f"+
		"\f\u0114\t\f\u0001\f\u0001\f\u0003\f\u0118\b\f\u0001\f\u0001\f\u0005\f"+
		"\u011c\b\f\n\f\f\f\u011f\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u0124\b\f"+
		"\n\f\f\f\u0127\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u012c\b\f\n\f\f\f\u012f"+
		"\t\f\u0001\f\u0001\f\u0005\f\u0133\b\f\n\f\f\f\u0136\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u013e\b\f\n\f\f\f\u0141\t\f"+
		"\u0001\f\u0003\f\u0144\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u014b\b\f\u0001\f\u0001\f\u0005\f\u014f\b\f\n\f\f\f\u0152\t\f\u0001"+
		"\f\u0001\f\u0005\f\u0156\b\f\n\f\f\f\u0159\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u015e\b\f\n\f\f\f\u0161\t\f\u0001\f\u0003\f\u0164\b\f\u0001\f"+
		"\u0005\f\u0167\b\f\n\f\f\f\u016a\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0172\b\f\n\f\f\f\u0175\t\f\u0001\f\u0003\f\u0178\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u017d\b\f\u0001\f\u0003\f\u0180\b\f"+
		"\u0001\f\u0001\f\u0005\f\u0184\b\f\n\f\f\f\u0187\t\f\u0001\f\u0001\f\u0003"+
		"\f\u018b\b\f\u0001\f\u0005\f\u018e\b\f\n\f\f\f\u0191\t\f\u0001\f\u0003"+
		"\f\u0194\b\f\u0001\f\u0001\f\u0005\f\u0198\b\f\n\f\f\f\u019b\t\f\u0001"+
		"\f\u0001\f\u0003\f\u019f\b\f\u0001\f\u0005\f\u01a2\b\f\n\f\f\f\u01a5\t"+
		"\f\u0001\f\u0003\f\u01a8\b\f\u0001\f\u0001\f\u0003\f\u01ac\b\f\u0001\f"+
		"\u0001\f\u0003\f\u01b0\b\f\u0001\f\u0001\f\u0003\f\u01b4\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u01be\b\f\n"+
		"\f\f\f\u01c1\t\f\u0001\f\u0003\f\u01c4\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u01cc\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u01d2\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0006\u0002\u0000\u0001\u0001((\u0001"+
		"\u0000\u0006\u0007\u0001\u0000\f\u0014\u0002\u0000\u0005\u0005\u001b\u001b"+
		"\u0002\u0000((**\u0001\u0000()\u0229\u0000\u001a\u0001\u0000\u0000\u0000"+
		"\u0002\u001f\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f7\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010"+
		"=\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014\\\u0001"+
		"\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u01d1\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#&\u0005(\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%\'\u0005(\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0004"+
		"\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0005\u0000\u0000+\u0005"+
		"\u0001\u0000\u0000\u0000,/\u0003\u0016\u000b\u0000-/\u0003\u0018\f\u0000"+
		".,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0007\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0007\u0001\u0000\u0000"+
		"4\t\u0001\u0000\u0000\u000056\u0005\b\u0000\u00006\u000b\u0001\u0000\u0000"+
		"\u000078\u0005\t\u0000\u00008\r\u0001\u0000\u0000\u00009;\u0005\n\u0000"+
		"\u0000:<\u0005\u000b\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<\u000f\u0001\u0000\u0000\u0000=>\u0007\u0002\u0000\u0000"+
		">\u0011\u0001\u0000\u0000\u0000?A\u0005(\u0000\u0000@B\u0005\u000b\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BW\u0001\u0000"+
		"\u0000\u0000CE\u0005*\u0000\u0000DF\u0005\u000b\u0000\u0000ED\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FW\u0001\u0000\u0000\u0000GI\u0005"+
		"(\u0000\u0000HJ\u0005\u000b\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JW\u0001\u0000\u0000\u0000KW\u0003\u0016\u000b\u0000"+
		"LW\u0003\u0018\f\u0000MO\u0003\b\u0004\u0000NP\u0005\u000b\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PW\u0001\u0000\u0000"+
		"\u0000QS\u0005)\u0000\u0000RT\u0005\u000b\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000UW\u0003\u000e"+
		"\u0007\u0000V?\u0001\u0000\u0000\u0000VC\u0001\u0000\u0000\u0000VG\u0001"+
		"\u0000\u0000\u0000VK\u0001\u0000\u0000\u0000VL\u0001\u0000\u0000\u0000"+
		"VM\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\u0013\u0001\u0000\u0000\u0000XY\u0005\u0015\u0000\u0000Y]\u0003"+
		"\u0000\u0000\u0000Z[\u0005\u0016\u0000\u0000[]\u0003\u000e\u0007\u0000"+
		"\\X\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]\u0015\u0001\u0000"+
		"\u0000\u0000^_\u0005(\u0000\u0000_`\u0005\u0017\u0000\u0000`c\u0003\u0000"+
		"\u0000\u0000ab\u0005\u0018\u0000\u0000bd\u0003\u0012\t\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0005"+
		"\u000b\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u0098\u0001\u0000\u0000\u0000hi\u0005(\u0000\u0000ij\u0005\u0018\u0000"+
		"\u0000jl\u0005(\u0000\u0000km\u0005\u000b\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0098\u0001\u0000\u0000\u0000no\u0005"+
		"(\u0000\u0000op\u0005\u0018\u0000\u0000pv\u0003\u0014\n\u0000qr\u0003"+
		"\f\u0006\u0000rs\u0003\u0018\f\u0000su\u0001\u0000\u0000\u0000tq\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y{\u0005\u000b\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\u0098\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000}~\u0005"+
		"\u0018\u0000\u0000~\u0084\u0005(\u0000\u0000\u007f\u0080\u0003\u0010\b"+
		"\u0000\u0080\u0081\u0003\u0018\f\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0005\u000b\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0098\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005(\u0000\u0000\u008b\u008c\u0005\u0018\u0000\u0000\u008c"+
		"\u008e\u0003\u0012\t\u0000\u008d\u008f\u0005\u000b\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0098"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005(\u0000\u0000\u0091\u0092\u0005"+
		"\u0018\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0094\u0003"+
		"\u0012\t\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0003\u000e\u0007\u0000\u0097^\u0001\u0000\u0000"+
		"\u0000\u0097h\u0001\u0000\u0000\u0000\u0097n\u0001\u0000\u0000\u0000\u0097"+
		"|\u0001\u0000\u0000\u0000\u0097\u008a\u0001\u0000\u0000\u0000\u0097\u0090"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0017"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005(\u0000\u0000\u009a\u00a8\u0005"+
		"\u0019\u0000\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\u009d\u0005\u0017"+
		"\u0000\u0000\u009d\u00a5\u0003\u0000\u0000\u0000\u009e\u009f\u0003\n\u0005"+
		"\u0000\u009f\u00a0\u0005(\u0000\u0000\u00a0\u00a1\u0005\u0017\u0000\u0000"+
		"\u00a1\u00a2\u0003\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u009b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001a\u0000\u0000"+
		"\u00ab\u00ac\u0005\u0017\u0000\u0000\u00ac\u00ad\u0003\u0000\u0000\u0000"+
		"\u00ad\u00af\u0005\u0004\u0000\u0000\u00ae\u00b0\u0005\u0004\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0005\u001b\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0007\u0003\u0000\u0000\u00bb\u01d2\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005(\u0000\u0000\u00bd\u00c7\u0005\u0019\u0000\u0000\u00be\u00c4"+
		"\u0003\u0012\t\u0000\u00bf\u00c0\u0003\n\u0005\u0000\u00c0\u00c1\u0003"+
		"\u0012\t\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00be\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cd\u0005\u001a\u0000\u0000\u00ca\u00cb\u0003\f\u0006"+
		"\u0000\u00cb\u00cc\u0003\u0018\f\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005\u000b\u0000\u0000"+
		"\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u01d2\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0005\u0019\u0000\u0000\u00d6\u00d8\u0005\u001c\u0000\u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003\u0014\n\u0000\u00da"+
		"\u00dc\u0003\u0012\t\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1"+
		"\u0005\u001a\u0000\u0000\u00de\u00df\u0003\f\u0006\u0000\u00df\u00e0\u0003"+
		"\u0018\f\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0005\u000b\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u01d2\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ed\u0005\u001d"+
		"\u0000\u0000\u00ea\u00ec\u0003\u0012\t\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005\u001e\u0000"+
		"\u0000\u00f1\u00f3\u0003\u0012\t\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb\u0005\u001f\u0000\u0000"+
		"\u00f8\u00fa\u0003\u0012\t\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u0101\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0005 \u0000\u0000\u00ff\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0106"+
		"\u0005\u000b\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u01d2\u0001\u0000\u0000\u0000\u0107\u010b"+
		"\u0005!\u0000\u0000\u0108\u010a\u0003\u0012\t\u0000\u0109\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0112\u0005"+
		"\"\u0000\u0000\u010f\u0111\u0003\u0012\t\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u0005#\u0000"+
		"\u0000\u0116\u0118\u0005\u000b\u0000\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u01d2\u0001\u0000\u0000"+
		"\u0000\u0119\u011d\u0005\u0004\u0000\u0000\u011a\u011c\u0003\u0012\t\u0000"+
		"\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u01d2\u0005\u0005\u0000\u0000\u0121\u0125\u0005\u0004\u0000\u0000"+
		"\u0122\u0124\u0003\u0012\t\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0128\u01d2\u0005\u001b\u0000\u0000\u0129"+
		"\u012d\u0005\u0019\u0000\u0000\u012a\u012c\u0003\u0012\t\u0000\u012b\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0134"+
		"\u0005\u001a\u0000\u0000\u0131\u0133\u0005\u000b\u0000\u0000\u0132\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u01d2"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0007\u0004\u0000\u0000\u0138\u0139\u0003\f\u0006\u0000\u0139\u013f\u0003"+
		"\u0018\f\u0000\u013a\u013b\u0003\f\u0006\u0000\u013b\u013c\u0003\u0018"+
		"\f\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013a\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0144\u0005\u000b\u0000"+
		"\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u01d2\u0001\u0000\u0000\u0000\u0145\u0146\u0005$\u0000\u0000"+
		"\u0146\u0147\u0005(\u0000\u0000\u0147\u014a\u0005\u0017\u0000\u0000\u0148"+
		"\u014b\u0003\u0000\u0000\u0000\u0149\u014b\u0003\u0012\t\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u0163\u0005%\u0000\u0000\u014d\u014f\u0003"+
		"\u0012\t\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0164\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000"+
		"\u0000\u0000\u0153\u0157\u0005\u0004\u0000\u0000\u0154\u0156\u0003\u0012"+
		"\t\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u0164\u0005\u001b\u0000\u0000\u015b\u015f\u0005\u0019\u0000"+
		"\u0000\u015c\u015e\u0003\u0012\t\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u001a\u0000\u0000"+
		"\u0163\u0150\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000\u0000\u0000"+
		"\u0163\u015b\u0001\u0000\u0000\u0000\u0164\u0168\u0001\u0000\u0000\u0000"+
		"\u0165\u0167\u0005\u000b\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u01d2\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0005\u0000\u0000"+
		"\u016c\u016d\u0003\u0010\b\u0000\u016d\u0173\u0003\u0012\t\u0000\u016e"+
		"\u016f\u0003\u0010\b\u0000\u016f\u0170\u0003\u0012\t\u0000\u0170\u0172"+
		"\u0001\u0000\u0000\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0172\u0175"+
		"\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u0178\u0005\u000b\u0000\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u01d2"+
		"\u0001\u0000\u0000\u0000\u0179\u017c\u0005&\u0000\u0000\u017a\u017d\u0005"+
		"(\u0000\u0000\u017b\u017d\u0003\u0012\t\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000"+
		"\u0000\u0000\u017e\u0180\u0005\u000b\u0000\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u01d2\u0001\u0000"+
		"\u0000\u0000\u0181\u0185\u0005!\u0000\u0000\u0182\u0184\u0003\u0012\t"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000"+
		"\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0005\"\u0000\u0000\u0189\u018b\u0005\u0004\u0000\u0000"+
		"\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018f\u0001\u0000\u0000\u0000\u018c\u018e\u0003\u0012\t\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0005\u001b\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0001\u0000\u0000\u0000\u0194\u01d2\u0001\u0000\u0000\u0000\u0195"+
		"\u0199\u0005!\u0000\u0000\u0196\u0198\u0003\u0012\t\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0005\"\u0000\u0000\u019d\u019f\u0005\u0004\u0000\u0000\u019e\u019d\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0003\u0012\t\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005\u001b"+
		"\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005#\u0000"+
		"\u0000\u01aa\u01ac\u0005\u000b\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01d2\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0005\u0019\u0000\u0000\u01ae\u01b0\u0005\u001c\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01b4\u0003\u0014\n\u0000"+
		"\u01b2\u01b4\u0003\u0012\t\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0005\u001a\u0000\u0000\u01b6\u01b7\u0005\'\u0000\u0000\u01b7\u01b8"+
		"\u0005(\u0000\u0000\u01b8\u01b9\u0003\f\u0006\u0000\u01b9\u01bf\u0003"+
		"\u0018\f\u0000\u01ba\u01bb\u0003\f\u0006\u0000\u01bb\u01bc\u0003\u0018"+
		"\f\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000"+
		"\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c4\u0005\u000b\u0000"+
		"\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c4\u01d2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0019\u0000"+
		"\u0000\u01c6\u01c7\u0005$\u0000\u0000\u01c7\u01c8\u0005(\u0000\u0000\u01c8"+
		"\u01cb\u0005\u0017\u0000\u0000\u01c9\u01cc\u0003\u0000\u0000\u0000\u01ca"+
		"\u01cc\u0003\u0012\t\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0005%\u0000\u0000\u01ce\u01cf\u0003\u0018\f\u0000\u01cf\u01d0\u0005"+
		"\u001a\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u0099\u0001"+
		"\u0000\u0000\u0000\u01d1\u00bc\u0001\u0000\u0000\u0000\u01d1\u00d5\u0001"+
		"\u0000\u0000\u0000\u01d1\u00e9\u0001\u0000\u0000\u0000\u01d1\u0107\u0001"+
		"\u0000\u0000\u0000\u01d1\u0119\u0001\u0000\u0000\u0000\u01d1\u0121\u0001"+
		"\u0000\u0000\u0000\u01d1\u0129\u0001\u0000\u0000\u0000\u01d1\u0137\u0001"+
		"\u0000\u0000\u0000\u01d1\u0145\u0001\u0000\u0000\u0000\u01d1\u016b\u0001"+
		"\u0000\u0000\u0000\u01d1\u0179\u0001\u0000\u0000\u0000\u01d1\u0181\u0001"+
		"\u0000\u0000\u0000\u01d1\u0195\u0001\u0000\u0000\u0000\u01d1\u01ad\u0001"+
		"\u0000\u0000\u0000\u01d1\u01c5\u0001\u0000\u0000\u0000\u01d2\u0019\u0001"+
		"\u0000\u0000\u0000I\u001f&.0;AEIOSV\\cflvz\u0084\u0088\u008e\u0097\u00a5"+
		"\u00a8\u00af\u00b4\u00b8\u00c4\u00c7\u00cd\u00d2\u00d7\u00db\u00e1\u00e6"+
		"\u00ed\u00f4\u00fb\u0101\u0105\u010b\u0112\u0117\u011d\u0125\u012d\u0134"+
		"\u013f\u0143\u014a\u0150\u0157\u015f\u0163\u0168\u0173\u0177\u017c\u017f"+
		"\u0185\u018a\u018f\u0193\u0199\u019e\u01a3\u01a7\u01ab\u01af\u01b3\u01bf"+
		"\u01c3\u01cb\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}