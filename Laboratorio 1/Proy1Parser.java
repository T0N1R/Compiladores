// Generated from Proy1.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Proy1Parser extends Parser {
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
		RULE_bool = 4, RULE_coma = 5, RULE_punto = 6, RULE_semicolon = 7, RULE_self = 8, 
		RULE_operacion = 9, RULE_expr = 10, RULE_inicializar = 11, RULE_declararAtributo = 12, 
		RULE_metodo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipoVariable", "start", "clase", "feature_clases", "bool", "coma", "punto", 
			"semicolon", "self", "operacion", "expr", "inicializar", "declararAtributo", 
			"metodo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'true'", 
			"'false'", "','", "'.'", "';'", "'self'", "'+'", "'-'", "'*'", "'/'", 
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
	public String getGrammarFileName() { return "Proy1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Proy1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipoVariable(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(30);
				clase();
				}
				}
				setState(35);
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
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
	 
		public ClaseContext() { }
		public void copyFrom(ClaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Test_mainContext extends ClaseContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public Feature_clasesContext feature_clases() {
			return getRuleContext(Feature_clasesContext.class,0);
		}
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public Test_mainContext(ClaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTest_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTest_main(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clase);
		int _la;
		try {
			_localctx = new Test_mainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__1);
			setState(37);
			match(ID);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(38);
				match(T__2);
				setState(39);
				tipoVariable();
				}
			}

			setState(42);
			match(T__3);
			setState(43);
			feature_clases();
			setState(44);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterFeature_clases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitFeature_clases(this);
		}
	}

	public final Feature_clasesContext feature_clases() throws RecognitionException {
		Feature_clasesContext _localctx = new Feature_clasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature_clases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(46);
					declararAtributo();
					}
					break;
				case 2:
					{
					setState(47);
					metodo();
					}
					break;
				}
				}
				setState(52);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
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

	public static class ComaContext extends ParserRuleContext {
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterPunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitPunto(this);
		}
	}

	public final PuntoContext punto() throws RecognitionException {
		PuntoContext _localctx = new PuntoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class SelfContext extends ParserRuleContext {
		public SelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitSelf(this);
		}
	}

	public final SelfContext self() throws RecognitionException {
		SelfContext _localctx = new SelfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__10);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				match(T__9);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Proy1Parser.STRING, 0); }
		public DeclararAtributoContext declararAtributo() {
			return getRuleContext(DeclararAtributoContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode NUM() { return getToken(Proy1Parser.NUM, 0); }
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				declararAtributo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				metodo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(NUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
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
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterInicializar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitInicializar(this);
		}
	}

	public final InicializarContext inicializar() throws RecognitionException {
		InicializarContext _localctx = new InicializarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inicializar);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__20);
				setState(77);
				tipoVariable();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(T__21);
				setState(79);
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
		public DeclararAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararAtributo; }
	 
		public DeclararAtributoContext() { }
		public void copyFrom(DeclararAtributoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tipo_correcto_8Context extends DeclararAtributoContext {
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public Tipo_correcto_8Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_8(this);
		}
	}
	public static class Tipo_correcto_7Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Tipo_correcto_7Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_7(this);
		}
	}
	public static class Tipo_correcto_4Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
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
		public Tipo_correcto_4Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_4(this);
		}
	}
	public static class Tipo_correcto_3Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
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
		public Tipo_correcto_3Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_3(this);
		}
	}
	public static class Tipo_correcto_6Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public Tipo_correcto_6Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_6(this);
		}
	}
	public static class Tipo_correcto_5Context extends DeclararAtributoContext {
		public List<TerminalNode> ID() { return getTokens(Proy1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Proy1Parser.ID, i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public Tipo_correcto_5Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_5(this);
		}
	}
	public static class Tipo_correcto_1Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Tipo_correcto_1Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_1(this);
		}
	}

	public final DeclararAtributoContext declararAtributo() throws RecognitionException {
		DeclararAtributoContext _localctx = new DeclararAtributoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declararAtributo);
		int _la;
		try {
			int _alt;
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Tipo_correcto_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(ID);
				setState(83);
				match(T__22);
				setState(84);
				tipoVariable();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(85);
					match(T__23);
					setState(86);
					expr();
					}
				}

				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(89);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Tipo_correcto_3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(ID);
				setState(93);
				match(T__23);
				setState(94);
				inicializar();
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(95);
						punto();
						setState(96);
						metodo();
						}
						} 
					}
					setState(102);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(103);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Tipo_correcto_4Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__23);
				setState(108);
				metodo();
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						operacion();
						setState(110);
						metodo();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(117);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Tipo_correcto_5Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(ID);
				setState(121);
				match(T__23);
				setState(122);
				match(ID);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						operacion();
						setState(124);
						metodo();
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(131);
					semicolon();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Tipo_correcto_6Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(ID);
				setState(135);
				match(T__23);
				setState(136);
				expr();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(137);
					semicolon();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Tipo_correcto_7Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(ID);
				setState(141);
				match(T__23);
				setState(142);
				match(T__3);
				setState(143);
				expr();
				setState(144);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Tipo_correcto_8Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
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
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
	 
		public MetodoContext() { }
		public void copyFrom(MetodoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Metodo5Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo5Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo5(this);
		}
	}
	public static class Metodo4Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo4Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo4(this);
		}
	}
	public static class Metodo3Context extends MetodoContext {
		public InicializarContext inicializar() {
			return getRuleContext(InicializarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public Metodo3Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo3(this);
		}
	}
	public static class Metodo2Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PuntoContext punto() {
			return getRuleContext(PuntoContext.class,0);
		}
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Metodo2Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo2(this);
		}
	}
	public static class Metodo1Context extends MetodoContext {
		public List<TerminalNode> ID() { return getTokens(Proy1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Proy1Parser.ID, i);
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
		public Metodo1Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo1(this);
		}
	}
	public static class Metodo9Context extends MetodoContext {
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
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(Proy1Parser.STRING, 0); }
		public Metodo9Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo9(this);
		}
	}
	public static class Metodo11Context extends MetodoContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TerminalNode NUM() { return getToken(Proy1Parser.NUM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo11Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo11(this);
		}
	}
	public static class Metodo8Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo8Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo8(this);
		}
	}
	public static class Metodo12Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Metodo12Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo12(this);
		}
	}
	public static class Metodo7Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo7Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo7(this);
		}
	}
	public static class Metodo6Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo6Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo6(this);
		}
	}
	public static class Metodo10Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo10Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo10(this);
		}
	}
	public static class Metodo15Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Metodo15Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo15(this);
		}
	}
	public static class Metodo16Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Metodo16Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo16(this);
		}
	}
	public static class Metodo13Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo13Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo13(this);
		}
	}
	public static class Metodo14Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo14Context(MetodoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterMetodo14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitMetodo14(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_metodo);
		int _la;
		try {
			int _alt;
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new Metodo1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ID);
				setState(150);
				match(T__24);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(151);
					match(ID);
					setState(152);
					match(T__22);
					setState(153);
					tipoVariable();
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(154);
						coma();
						setState(155);
						match(ID);
						setState(156);
						match(T__22);
						setState(157);
						tipoVariable();
						}
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(166);
				match(T__25);
				setState(167);
				match(T__22);
				setState(168);
				tipoVariable();
				setState(169);
				match(T__3);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(170);
					match(T__3);
					}
					break;
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(173);
					expr();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(179);
					match(T__26);
					}
					break;
				}
				setState(182);
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
				_localctx = new Metodo2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(ID);
				setState(185);
				match(T__24);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(186);
					expr();
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(187);
						coma();
						setState(188);
						expr();
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(197);
				match(T__25);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(198);
					punto();
					setState(199);
					metodo();
					}
					break;
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						match(T__9);
						}
						} 
					}
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Metodo3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(T__24);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(210);
					match(T__27);
					}
				}

				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
					{
					setState(213);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__10:
				case T__24:
				case T__28:
				case T__32:
				case T__35:
				case T__37:
				case ID:
				case NUM:
				case STRING:
					{
					setState(214);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(217);
				match(T__25);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(218);
					punto();
					setState(219);
					metodo();
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(T__9);
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new Metodo4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(T__28);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(230);
					expr();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(T__29);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(237);
					expr();
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(T__30);
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
						expr();
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						match(T__31);
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(256);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Metodo5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(T__32);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(260);
					expr();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(T__33);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(267);
					expr();
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(T__34);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(274);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Metodo6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(T__3);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(278);
					expr();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Metodo7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(T__3);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(286);
					expr();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				match(T__26);
				}
				break;
			case 8:
				_localctx = new Metodo8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				match(T__24);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(294);
					expr();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(T__25);
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						match(T__9);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 9:
				_localctx = new Metodo9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(308);
				punto();
				setState(309);
				metodo();
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						punto();
						setState(311);
						metodo();
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(318);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new Metodo10Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(T__35);
				setState(322);
				match(ID);
				setState(323);
				match(T__22);
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(324);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(325);
					expr();
					}
					break;
				}
				setState(328);
				match(T__36);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(329);
							expr();
							}
							} 
						}
						setState(334);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(335);
					match(T__3);
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						{
						setState(336);
						expr();
						}
						}
						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(342);
					match(T__26);
					}
					break;
				case 3:
					{
					setState(343);
					match(T__24);
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						{
						setState(344);
						expr();
						}
						}
						setState(349);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(350);
					match(T__25);
					}
					break;
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(353);
						match(T__9);
						}
						} 
					}
					setState(358);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 11:
				_localctx = new Metodo11Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				operacion();
				{
				setState(361);
				expr();
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(362);
						operacion();
						setState(363);
						expr();
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(370);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Metodo12Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(373);
				match(T__37);
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(374);
					match(ID);
					}
					break;
				case 2:
					{
					setState(375);
					expr();
					}
					break;
				}
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(378);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new Metodo13Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(381);
				match(T__32);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(382);
					expr();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(T__33);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(389);
					match(T__3);
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						expr();
						}
						} 
					}
					setState(397);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(398);
					match(T__26);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new Metodo14Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(401);
				match(T__32);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(402);
					expr();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(T__33);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(409);
					match(T__3);
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					{
					setState(412);
					expr();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(418);
					match(T__26);
					}
				}

				setState(421);
				match(T__34);
				setState(423);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(422);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new Metodo15Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(425);
				match(T__24);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(426);
					match(T__27);
					}
				}

				setState(431);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
					{
					setState(429);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__10:
				case T__24:
				case T__28:
				case T__32:
				case T__35:
				case T__37:
				case ID:
				case NUM:
				case STRING:
					{
					setState(430);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433);
				match(T__25);
				setState(434);
				match(T__38);
				setState(435);
				match(ID);
				setState(436);
				punto();
				setState(437);
				metodo();
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						punto();
						setState(439);
						metodo();
						}
						} 
					}
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(446);
					match(T__9);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new Metodo16Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(449);
				match(T__24);
				setState(450);
				match(T__35);
				setState(451);
				match(ID);
				setState(452);
				match(T__22);
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(453);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(454);
					expr();
					}
					break;
				}
				setState(457);
				match(T__36);
				setState(458);
				metodo();
				setState(459);
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
		"\u0004\u00011\u01d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001"+
		" \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u00031\b\u0003\n\u0003\f\u0003"+
		"4\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b@\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\nK\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bQ\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fX\b\f\u0001\f\u0003"+
		"\f[\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fc\b\f\n"+
		"\f\f\ff\t\f\u0001\f\u0003\fi\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\fq\b\f\n\f\f\ft\t\f\u0001\f\u0003\fw\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u007f\b\f\n\f\f\f\u0082\t\f"+
		"\u0001\f\u0003\f\u0085\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008b"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0094"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00a0\b\r\n\r\f\r\u00a3\t\r\u0003\r\u00a5\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ac\b\r\u0001\r\u0005\r\u00af"+
		"\b\r\n\r\f\r\u00b2\t\r\u0001\r\u0003\r\u00b5\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bf\b\r\n\r\f\r\u00c2"+
		"\t\r\u0003\r\u00c4\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ca\b"+
		"\r\u0001\r\u0005\r\u00cd\b\r\n\r\f\r\u00d0\t\r\u0001\r\u0001\r\u0003\r"+
		"\u00d4\b\r\u0001\r\u0001\r\u0003\r\u00d8\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00de\b\r\u0001\r\u0005\r\u00e1\b\r\n\r\f\r\u00e4\t\r\u0001"+
		"\r\u0001\r\u0005\r\u00e8\b\r\n\r\f\r\u00eb\t\r\u0001\r\u0001\r\u0005\r"+
		"\u00ef\b\r\n\r\f\r\u00f2\t\r\u0001\r\u0001\r\u0005\r\u00f6\b\r\n\r\f\r"+
		"\u00f9\t\r\u0001\r\u0005\r\u00fc\b\r\n\r\f\r\u00ff\t\r\u0001\r\u0003\r"+
		"\u0102\b\r\u0001\r\u0001\r\u0005\r\u0106\b\r\n\r\f\r\u0109\t\r\u0001\r"+
		"\u0001\r\u0005\r\u010d\b\r\n\r\f\r\u0110\t\r\u0001\r\u0001\r\u0003\r\u0114"+
		"\b\r\u0001\r\u0001\r\u0005\r\u0118\b\r\n\r\f\r\u011b\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0120\b\r\n\r\f\r\u0123\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u0128\b\r\n\r\f\r\u012b\t\r\u0001\r\u0001\r\u0005\r\u012f\b\r"+
		"\n\r\f\r\u0132\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u013a\b\r\n\r\f\r\u013d\t\r\u0001\r\u0003\r\u0140\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0147\b\r\u0001\r\u0001\r\u0005\r\u014b"+
		"\b\r\n\r\f\r\u014e\t\r\u0001\r\u0001\r\u0005\r\u0152\b\r\n\r\f\r\u0155"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u015a\b\r\n\r\f\r\u015d\t\r\u0001"+
		"\r\u0003\r\u0160\b\r\u0001\r\u0005\r\u0163\b\r\n\r\f\r\u0166\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u016e\b\r\n\r\f\r\u0171"+
		"\t\r\u0001\r\u0003\r\u0174\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0179\b"+
		"\r\u0001\r\u0003\r\u017c\b\r\u0001\r\u0001\r\u0005\r\u0180\b\r\n\r\f\r"+
		"\u0183\t\r\u0001\r\u0001\r\u0003\r\u0187\b\r\u0001\r\u0005\r\u018a\b\r"+
		"\n\r\f\r\u018d\t\r\u0001\r\u0003\r\u0190\b\r\u0001\r\u0001\r\u0005\r\u0194"+
		"\b\r\n\r\f\r\u0197\t\r\u0001\r\u0001\r\u0003\r\u019b\b\r\u0001\r\u0005"+
		"\r\u019e\b\r\n\r\f\r\u01a1\t\r\u0001\r\u0003\r\u01a4\b\r\u0001\r\u0001"+
		"\r\u0003\r\u01a8\b\r\u0001\r\u0001\r\u0003\r\u01ac\b\r\u0001\r\u0001\r"+
		"\u0003\r\u01b0\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u01ba\b\r\n\r\f\r\u01bd\t\r\u0001\r\u0003\r\u01c0\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u01c8\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u01ce\b\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0006\u0002\u0000\u0001\u0001((\u0001\u0000\u0006\u0007\u0001\u0000"+
		"\f\u0014\u0002\u0000\u0005\u0005\u001b\u001b\u0002\u0000((**\u0001\u0000"+
		"()\u021f\u0000\u001c\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000"+
		"\u0000\u0004$\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000\u0000\b"+
		"5\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000"+
		"\u0000\u000e;\u0001\u0000\u0000\u0000\u0010=\u0001\u0000\u0000\u0000\u0012"+
		"A\u0001\u0000\u0000\u0000\u0014J\u0001\u0000\u0000\u0000\u0016P\u0001"+
		"\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u01cd\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0007\u0000\u0000\u0000\u001d\u0001\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0002\u0000\u0000%(\u0005(\u0000\u0000&\'\u0005\u0003"+
		"\u0000\u0000\')\u0003\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0004\u0000\u0000"+
		"+,\u0003\u0006\u0003\u0000,-\u0005\u0005\u0000\u0000-\u0005\u0001\u0000"+
		"\u0000\u0000.1\u0003\u0018\f\u0000/1\u0003\u001a\r\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0007\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000056\u0007\u0001\u0000\u00006\t\u0001\u0000"+
		"\u0000\u000078\u0005\b\u0000\u00008\u000b\u0001\u0000\u0000\u00009:\u0005"+
		"\t\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\n\u0000\u0000<\u000f"+
		"\u0001\u0000\u0000\u0000=?\u0005\u000b\u0000\u0000>@\u0005\n\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0011\u0001\u0000"+
		"\u0000\u0000AB\u0007\u0002\u0000\u0000B\u0013\u0001\u0000\u0000\u0000"+
		"CK\u0005(\u0000\u0000DK\u0005*\u0000\u0000EK\u0003\u0018\f\u0000FK\u0003"+
		"\u001a\r\u0000GK\u0003\b\u0004\u0000HK\u0005)\u0000\u0000IK\u0003\u0010"+
		"\b\u0000JC\u0001\u0000\u0000\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0015\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0015\u0000\u0000MQ\u0003\u0000\u0000\u0000NO\u0005\u0016"+
		"\u0000\u0000OQ\u0003\u0010\b\u0000PL\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000Q\u0017\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000ST\u0005"+
		"\u0017\u0000\u0000TW\u0003\u0000\u0000\u0000UV\u0005\u0018\u0000\u0000"+
		"VX\u0003\u0014\n\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000Y[\u0005\n\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\u0094\u0001\u0000\u0000\u0000\\]\u0005(\u0000"+
		"\u0000]^\u0005\u0018\u0000\u0000^d\u0003\u0016\u000b\u0000_`\u0003\f\u0006"+
		"\u0000`a\u0003\u001a\r\u0000ac\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gi\u0005"+
		"\n\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0094"+
		"\u0001\u0000\u0000\u0000jk\u0005(\u0000\u0000kl\u0005\u0018\u0000\u0000"+
		"lr\u0003\u001a\r\u0000mn\u0003\u0012\t\u0000no\u0003\u001a\r\u0000oq\u0001"+
		"\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uw\u0005\n\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w\u0094\u0001\u0000\u0000\u0000xy\u0005"+
		"(\u0000\u0000yz\u0005\u0018\u0000\u0000z\u0080\u0005(\u0000\u0000{|\u0003"+
		"\u0012\t\u0000|}\u0003\u001a\r\u0000}\u007f\u0001\u0000\u0000\u0000~{"+
		"\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0085\u0003"+
		"\u000e\u0007\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0094\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"(\u0000\u0000\u0087\u0088\u0005\u0018\u0000\u0000\u0088\u008a\u0003\u0014"+
		"\n\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0094\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005(\u0000\u0000\u008d\u008e\u0005\u0018\u0000\u0000"+
		"\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090"+
		"\u0091\u0005\u0005\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0003\u0010\b\u0000\u0093R\u0001\u0000\u0000\u0000\u0093\\\u0001"+
		"\u0000\u0000\u0000\u0093j\u0001\u0000\u0000\u0000\u0093x\u0001\u0000\u0000"+
		"\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0019\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u00a4\u0005\u0019\u0000\u0000"+
		"\u0097\u0098\u0005(\u0000\u0000\u0098\u0099\u0005\u0017\u0000\u0000\u0099"+
		"\u00a1\u0003\u0000\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c"+
		"\u0005(\u0000\u0000\u009c\u009d\u0005\u0017\u0000\u0000\u009d\u009e\u0003"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009a\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u0097\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u001a\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0017\u0000\u0000\u00a8\u00a9\u0003\u0000\u0000\u0000\u00a9\u00ab\u0005"+
		"\u0004\u0000\u0000\u00aa\u00ac\u0005\u0004\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ad\u00af\u0003\u0014\n\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u001b"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0003"+
		"\u0000\u0000\u00b7\u01ce\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005(\u0000"+
		"\u0000\u00b9\u00c3\u0005\u0019\u0000\u0000\u00ba\u00c0\u0003\u0014\n\u0000"+
		"\u00bb\u00bc\u0003\n\u0005\u0000\u00bc\u00bd\u0003\u0014\n\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00ba\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c9\u0005\u001a\u0000\u0000\u00c6\u00c7\u0003\f\u0006\u0000\u00c7\u00c8"+
		"\u0003\u001a\r\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cd\u0005\n\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005\u0019"+
		"\u0000\u0000\u00d2\u00d4\u0005\u001c\u0000\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0003\u0016\u000b\u0000\u00d6\u00d8\u0003\u0014"+
		"\n\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dd\u0005\u001a\u0000"+
		"\u0000\u00da\u00db\u0003\f\u0006\u0000\u00db\u00dc\u0003\u001a\r\u0000"+
		"\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e2\u0001\u0000\u0000\u0000"+
		"\u00df\u00e1\u0005\n\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u01ce\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e9\u0005\u001d\u0000\u0000\u00e6"+
		"\u00e8\u0003\u0014\n\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00f0\u0005\u001e\u0000\u0000\u00ed\u00ef"+
		"\u0003\u0014\n\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f7\u0005\u001f\u0000\u0000\u00f4\u00f6\u0003"+
		"\u0014\n\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fd\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fc\u0005 \u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0102\u0005\n\u0000\u0000"+
		"\u0101\u0100\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u01ce\u0001\u0000\u0000\u0000\u0103\u0107\u0005!\u0000\u0000\u0104"+
		"\u0106\u0003\u0014\n\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109"+
		"\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u010e\u0005\"\u0000\u0000\u010b\u010d\u0003"+
		"\u0014\n\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0005#\u0000\u0000\u0112\u0114\u0005\n\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u01ce\u0001\u0000\u0000\u0000\u0115\u0119\u0005\u0004\u0000"+
		"\u0000\u0116\u0118\u0003\u0014\n\u0000\u0117\u0116\u0001\u0000\u0000\u0000"+
		"\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u01ce\u0005\u0005\u0000\u0000"+
		"\u011d\u0121\u0005\u0004\u0000\u0000\u011e\u0120\u0003\u0014\n\u0000\u011f"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122"+
		"\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124"+
		"\u01ce\u0005\u001b\u0000\u0000\u0125\u0129\u0005\u0019\u0000\u0000\u0126"+
		"\u0128\u0003\u0014\n\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u0130\u0005\u001a\u0000\u0000\u012d\u012f"+
		"\u0005\n\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u01ce\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0007\u0004\u0000\u0000\u0134\u0135\u0003"+
		"\f\u0006\u0000\u0135\u013b\u0003\u001a\r\u0000\u0136\u0137\u0003\f\u0006"+
		"\u0000\u0137\u0138\u0003\u001a\r\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0005\n\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u01ce\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005$\u0000\u0000\u0142\u0143\u0005(\u0000\u0000\u0143\u0146\u0005"+
		"\u0017\u0000\u0000\u0144\u0147\u0003\u0000\u0000\u0000\u0145\u0147\u0003"+
		"\u0014\n\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u015f\u0005%\u0000"+
		"\u0000\u0149\u014b\u0003\u0014\n\u0000\u014a\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0160\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0153\u0005\u0004\u0000\u0000"+
		"\u0150\u0152\u0003\u0014\n\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0156\u0160\u0005\u001b\u0000\u0000\u0157"+
		"\u015b\u0005\u0019\u0000\u0000\u0158\u015a\u0003\u0014\n\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0160"+
		"\u0005\u001a\u0000\u0000\u015f\u014c\u0001\u0000\u0000\u0000\u015f\u014f"+
		"\u0001\u0000\u0000\u0000\u015f\u0157\u0001\u0000\u0000\u0000\u0160\u0164"+
		"\u0001\u0000\u0000\u0000\u0161\u0163\u0005\n\u0000\u0000\u0162\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u01ce\u0001"+
		"\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0007"+
		"\u0005\u0000\u0000\u0168\u0169\u0003\u0012\t\u0000\u0169\u016f\u0003\u0014"+
		"\n\u0000\u016a\u016b\u0003\u0012\t\u0000\u016b\u016c\u0003\u0014\n\u0000"+
		"\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000"+
		"\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0174\u0005\n\u0000\u0000\u0173"+
		"\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174"+
		"\u01ce\u0001\u0000\u0000\u0000\u0175\u0178\u0005&\u0000\u0000\u0176\u0179"+
		"\u0005(\u0000\u0000\u0177\u0179\u0003\u0014\n\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017b\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0005\n\u0000\u0000\u017b\u017a\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u01ce\u0001\u0000"+
		"\u0000\u0000\u017d\u0181\u0005!\u0000\u0000\u017e\u0180\u0003\u0014\n"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0186\u0005\"\u0000\u0000\u0185\u0187\u0005\u0004\u0000\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187\u018b\u0001\u0000\u0000\u0000\u0188\u018a\u0003\u0014\n\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0005\u001b\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u01ce\u0001\u0000\u0000\u0000\u0191"+
		"\u0195\u0005!\u0000\u0000\u0192\u0194\u0003\u0014\n\u0000\u0193\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019a"+
		"\u0005\"\u0000\u0000\u0199\u019b\u0005\u0004\u0000\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019f\u0001"+
		"\u0000\u0000\u0000\u019c\u019e\u0003\u0014\n\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a4\u0005\u001b"+
		"\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0005#\u0000"+
		"\u0000\u01a6\u01a8\u0005\n\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ce\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0005\u0019\u0000\u0000\u01aa\u01ac\u0005\u001c\u0000\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01b0\u0003\u0016\u000b\u0000"+
		"\u01ae\u01b0\u0003\u0014\n\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0005\u001a\u0000\u0000\u01b2\u01b3\u0005\'\u0000\u0000\u01b3\u01b4"+
		"\u0005(\u0000\u0000\u01b4\u01b5\u0003\f\u0006\u0000\u01b5\u01bb\u0003"+
		"\u001a\r\u0000\u01b6\u01b7\u0003\f\u0006\u0000\u01b7\u01b8\u0003\u001a"+
		"\r\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c0\u0005\n\u0000\u0000"+
		"\u01bf\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01ce\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u0019\u0000\u0000"+
		"\u01c2\u01c3\u0005$\u0000\u0000\u01c3\u01c4\u0005(\u0000\u0000\u01c4\u01c7"+
		"\u0005\u0017\u0000\u0000\u01c5\u01c8\u0003\u0000\u0000\u0000\u01c6\u01c8"+
		"\u0003\u0014\n\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005"+
		"%\u0000\u0000\u01ca\u01cb\u0003\u001a\r\u0000\u01cb\u01cc\u0005\u001a"+
		"\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u0095\u0001\u0000"+
		"\u0000\u0000\u01cd\u00b8\u0001\u0000\u0000\u0000\u01cd\u00d1\u0001\u0000"+
		"\u0000\u0000\u01cd\u00e5\u0001\u0000\u0000\u0000\u01cd\u0103\u0001\u0000"+
		"\u0000\u0000\u01cd\u0115\u0001\u0000\u0000\u0000\u01cd\u011d\u0001\u0000"+
		"\u0000\u0000\u01cd\u0125\u0001\u0000\u0000\u0000\u01cd\u0133\u0001\u0000"+
		"\u0000\u0000\u01cd\u0141\u0001\u0000\u0000\u0000\u01cd\u0167\u0001\u0000"+
		"\u0000\u0000\u01cd\u0175\u0001\u0000\u0000\u0000\u01cd\u017d\u0001\u0000"+
		"\u0000\u0000\u01cd\u0191\u0001\u0000\u0000\u0000\u01cd\u01a9\u0001\u0000"+
		"\u0000\u0000\u01cd\u01c1\u0001\u0000\u0000\u0000\u01ce\u001b\u0001\u0000"+
		"\u0000\u0000E!(02?JPWZdhrv\u0080\u0084\u008a\u0093\u00a1\u00a4\u00ab\u00b0"+
		"\u00b4\u00c0\u00c3\u00c9\u00ce\u00d3\u00d7\u00dd\u00e2\u00e9\u00f0\u00f7"+
		"\u00fd\u0101\u0107\u010e\u0113\u0119\u0121\u0129\u0130\u013b\u013f\u0146"+
		"\u014c\u0153\u015b\u015f\u0164\u016f\u0173\u0178\u017b\u0181\u0186\u018b"+
		"\u018f\u0195\u019a\u019f\u01a3\u01a7\u01ab\u01af\u01bb\u01bf\u01c7\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}