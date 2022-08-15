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
		RULE_operacion = 9, RULE_expr = 10, RULE_not = 11, RULE_inicializar = 12, 
		RULE_declararAtributo = 13, RULE_metodo = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipoVariable", "start", "clase", "feature_clases", "bool", "coma", "punto", 
			"semicolon", "self", "operacion", "expr", "not", "inicializar", "declararAtributo", 
			"metodo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "'true'", 
			"'false'", "','", "'.'", "';'", "'self'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'<'", "'>'", "'<='", "'>='", "'not'", "'new'", "'isvoid'", "':'", 
			"'<-'", "'('", "')'", "'}'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
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
			setState(30);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				clase();
				}
				}
				setState(37);
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
			setState(38);
			match(T__1);
			setState(39);
			match(ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(40);
				match(T__2);
				setState(41);
				tipoVariable();
				}
			}

			setState(44);
			match(T__3);
			setState(45);
			feature_clases();
			setState(46);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(48);
					declararAtributo();
					}
					break;
				case 2:
					{
					setState(49);
					metodo();
					}
					break;
				}
				}
				setState(54);
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
			setState(55);
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
			setState(57);
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
			setState(59);
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
			setState(61);
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
			setState(63);
			match(T__10);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
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
			setState(67);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				declararAtributo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				metodo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				bool();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(NUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__20);
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
		enterRule(_localctx, 24, RULE_inicializar);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__21);
				setState(81);
				tipoVariable();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__22);
				setState(83);
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
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
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
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
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
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
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
		enterRule(_localctx, 26, RULE_declararAtributo);
		int _la;
		try {
			int _alt;
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Tipo_correcto_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(ID);
				setState(87);
				match(T__23);
				setState(88);
				tipoVariable();
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(89);
					match(T__24);
					setState(90);
					expr();
					}
				}

				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(93);
					semicolon();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Tipo_correcto_3Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ID);
				setState(97);
				match(T__24);
				setState(98);
				inicializar();
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(99);
						punto();
						setState(100);
						metodo();
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(107);
					semicolon();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Tipo_correcto_4Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(ID);
				setState(111);
				match(T__24);
				setState(112);
				metodo();
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						operacion();
						setState(114);
						metodo();
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(121);
					semicolon();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Tipo_correcto_5Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(ID);
				setState(125);
				match(T__24);
				setState(126);
				match(ID);
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(135);
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
				setState(138);
				match(ID);
				setState(139);
				match(T__24);
				setState(140);
				expr();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(141);
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
				setState(144);
				match(ID);
				setState(145);
				match(T__24);
				setState(146);
				match(T__3);
				setState(147);
				expr();
				setState(148);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Tipo_correcto_8Context(_localctx);
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
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
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
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
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
		enterRule(_localctx, 28, RULE_metodo);
		int _la;
		try {
			int _alt;
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new Metodo1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__25);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(155);
					match(ID);
					setState(156);
					match(T__23);
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
						match(T__23);
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
				match(T__26);
				setState(171);
				match(T__23);
				setState(172);
				tipoVariable();
				setState(173);
				match(T__3);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__27);
					}
					break;
				}
				setState(186);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__27) ) {
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
				setState(188);
				match(ID);
				setState(189);
				match(T__25);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				match(T__26);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						match(T__9);
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Metodo3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__25);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(214);
					not();
					}
				}

				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
				case T__22:
					{
					setState(217);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__10:
				case T__25:
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
				match(T__26);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(T__9);
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new Metodo4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__28);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(260);
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
				setState(263);
				match(T__32);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(278);
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
				setState(281);
				match(T__3);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				_localctx = new Metodo7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(T__3);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				match(T__27);
				}
				break;
			case 8:
				_localctx = new Metodo8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(297);
				match(T__25);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				match(T__26);
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(305);
						match(T__9);
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 9:
				_localctx = new Metodo9Context(_localctx);
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
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(322);
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
				setState(325);
				match(T__35);
				setState(326);
				match(ID);
				setState(327);
				match(T__23);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
					match(T__27);
					}
					break;
				case 3:
					{
					setState(347);
					match(T__25);
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
					match(T__26);
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(357);
						match(T__9);
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 11:
				_localctx = new Metodo11Context(_localctx);
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
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(374);
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
				setState(377);
				match(T__37);
				setState(380);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(382);
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
				setState(385);
				match(T__32);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(393);
					match(T__3);
					}
					break;
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(402);
					match(T__27);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new Metodo14Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(405);
				match(T__32);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__25) | (1L << T__28) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
				if (_la==T__27) {
					{
					setState(422);
					match(T__27);
					}
				}

				setState(425);
				match(T__34);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(426);
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
				setState(429);
				match(T__25);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(430);
					not();
					}
				}

				setState(435);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
				case T__22:
					{
					setState(433);
					inicializar();
					}
					break;
				case T__3:
				case T__5:
				case T__6:
				case T__10:
				case T__25:
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
				match(T__26);
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
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(451);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(450);
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
				setState(453);
				match(T__25);
				setState(454);
				match(T__35);
				setState(455);
				match(ID);
				setState(456);
				match(T__23);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
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
				match(T__26);
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
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001\"\b\u0001\n\u0001\f\u0001%\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"3\b\u0003\n\u0003\f\u00036\t\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\bB\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nM\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\fU\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\\\b\r\u0001\r\u0003\r_\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\rg\b\r\n\r\f\rj\t\r\u0001\r\u0003\rm\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\ru\b\r\n\r\f\rx\t\r\u0001"+
		"\r\u0003\r{\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0083\b\r\n\r\f\r\u0086\t\r\u0001\r\u0003\r\u0089\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u008f\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0098\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00a4\b\u000e\n\u000e\f\u000e\u00a7\t\u000e\u0003"+
		"\u000e\u00a9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00b0\b\u000e\u0001\u000e\u0005\u000e\u00b3\b\u000e"+
		"\n\u000e\f\u000e\u00b6\t\u000e\u0001\u000e\u0003\u000e\u00b9\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00c3\b\u000e\n\u000e\f\u000e\u00c6\t\u000e"+
		"\u0003\u000e\u00c8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ce\b\u000e\u0001\u000e\u0005\u000e\u00d1\b\u000e\n\u000e"+
		"\f\u000e\u00d4\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d8\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00dc\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00e2\b\u000e\u0001\u000e\u0005\u000e"+
		"\u00e5\b\u000e\n\u000e\f\u000e\u00e8\t\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00ec\b\u000e\n\u000e\f\u000e\u00ef\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00f3\b\u000e\n\u000e\f\u000e\u00f6\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00fa\b\u000e\n\u000e\f\u000e\u00fd\t\u000e\u0001\u000e"+
		"\u0005\u000e\u0100\b\u000e\n\u000e\f\u000e\u0103\t\u000e\u0001\u000e\u0003"+
		"\u000e\u0106\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u010a\b\u000e"+
		"\n\u000e\f\u000e\u010d\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0111"+
		"\b\u000e\n\u000e\f\u000e\u0114\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0118\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u011c\b\u000e\n\u000e"+
		"\f\u000e\u011f\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0124\b\u000e\n\u000e\f\u000e\u0127\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u012c\b\u000e\n\u000e\f\u000e\u012f\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0133\b\u000e\n\u000e\f\u000e\u0136\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u013e\b\u000e\n\u000e\f\u000e\u0141\t\u000e\u0001\u000e\u0003\u000e"+
		"\u0144\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u014b\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u014f\b"+
		"\u000e\n\u000e\f\u000e\u0152\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0156\b\u000e\n\u000e\f\u000e\u0159\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u015e\b\u000e\n\u000e\f\u000e\u0161\t\u000e\u0001\u000e"+
		"\u0003\u000e\u0164\b\u000e\u0001\u000e\u0005\u000e\u0167\b\u000e\n\u000e"+
		"\f\u000e\u016a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0172\b\u000e\n\u000e\f\u000e\u0175"+
		"\t\u000e\u0001\u000e\u0003\u000e\u0178\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u017d\b\u000e\u0001\u000e\u0003\u000e\u0180\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0184\b\u000e\n\u000e\f\u000e"+
		"\u0187\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u018b\b\u000e\u0001"+
		"\u000e\u0005\u000e\u018e\b\u000e\n\u000e\f\u000e\u0191\t\u000e\u0001\u000e"+
		"\u0003\u000e\u0194\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0198\b"+
		"\u000e\n\u000e\f\u000e\u019b\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u019f\b\u000e\u0001\u000e\u0005\u000e\u01a2\b\u000e\n\u000e\f\u000e\u01a5"+
		"\t\u000e\u0001\u000e\u0003\u000e\u01a8\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u01ac\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01b0\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01b4\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u01be\b\u000e\n\u000e\f\u000e\u01c1\t\u000e\u0001\u000e"+
		"\u0003\u000e\u01c4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01cc\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u01d2\b\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0006\u0002\u0000\u0001\u0001((\u0001\u0000\u0006\u0007"+
		"\u0001\u0000\f\u0014\u0002\u0000\u0005\u0005\u001c\u001c\u0002\u0000("+
		"(**\u0001\u0000()\u0222\u0000\u001e\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b7\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001"+
		"\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010?\u0001\u0000\u0000"+
		"\u0000\u0012C\u0001\u0000\u0000\u0000\u0014L\u0001\u0000\u0000\u0000\u0016"+
		"N\u0001\u0000\u0000\u0000\u0018T\u0001\u0000\u0000\u0000\u001a\u0097\u0001"+
		"\u0000\u0000\u0000\u001c\u01d1\u0001\u0000\u0000\u0000\u001e\u001f\u0007"+
		"\u0000\u0000\u0000\u001f\u0001\u0001\u0000\u0000\u0000 \"\u0003\u0004"+
		"\u0002\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'*\u0005("+
		"\u0000\u0000()\u0005\u0003\u0000\u0000)+\u0003\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0005\u0004\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0005\u0005\u0000"+
		"\u0000/\u0005\u0001\u0000\u0000\u000003\u0003\u001a\r\u000013\u0003\u001c"+
		"\u000e\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"5\u0007\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0007\u0001"+
		"\u0000\u00008\t\u0001\u0000\u0000\u00009:\u0005\b\u0000\u0000:\u000b\u0001"+
		"\u0000\u0000\u0000;<\u0005\t\u0000\u0000<\r\u0001\u0000\u0000\u0000=>"+
		"\u0005\n\u0000\u0000>\u000f\u0001\u0000\u0000\u0000?A\u0005\u000b\u0000"+
		"\u0000@B\u0005\n\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0011\u0001\u0000\u0000\u0000CD\u0007\u0002\u0000\u0000D\u0013"+
		"\u0001\u0000\u0000\u0000EM\u0005(\u0000\u0000FM\u0005*\u0000\u0000GM\u0003"+
		"\u001a\r\u0000HM\u0003\u001c\u000e\u0000IM\u0003\b\u0004\u0000JM\u0005"+
		")\u0000\u0000KM\u0003\u0010\b\u0000LE\u0001\u0000\u0000\u0000LF\u0001"+
		"\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000"+
		"LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000M\u0015\u0001\u0000\u0000\u0000NO\u0005\u0015\u0000\u0000O\u0017"+
		"\u0001\u0000\u0000\u0000PQ\u0005\u0016\u0000\u0000QU\u0003\u0000\u0000"+
		"\u0000RS\u0005\u0017\u0000\u0000SU\u0003\u0010\b\u0000TP\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000U\u0019\u0001\u0000\u0000\u0000VW\u0005"+
		"(\u0000\u0000WX\u0005\u0018\u0000\u0000X[\u0003\u0000\u0000\u0000YZ\u0005"+
		"\u0019\u0000\u0000Z\\\u0003\u0014\n\u0000[Y\u0001\u0000\u0000\u0000[\\"+
		"\u0001\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000]_\u0003\u000e\u0007"+
		"\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0098\u0001"+
		"\u0000\u0000\u0000`a\u0005(\u0000\u0000ab\u0005\u0019\u0000\u0000bh\u0003"+
		"\u0018\f\u0000cd\u0003\f\u0006\u0000de\u0003\u001c\u000e\u0000eg\u0001"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000km\u0003\u000e\u0007\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0098\u0001\u0000\u0000\u0000"+
		"no\u0005(\u0000\u0000op\u0005\u0019\u0000\u0000pv\u0003\u001c\u000e\u0000"+
		"qr\u0003\u0012\t\u0000rs\u0003\u001c\u000e\u0000su\u0001\u0000\u0000\u0000"+
		"tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y{\u0003\u000e\u0007\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0098\u0001\u0000\u0000\u0000|}\u0005(\u0000\u0000"+
		"}~\u0005\u0019\u0000\u0000~\u0084\u0005(\u0000\u0000\u007f\u0080\u0003"+
		"\u0012\t\u0000\u0080\u0081\u0003\u001c\u000e\u0000\u0081\u0083\u0001\u0000"+
		"\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0003\u000e\u0007\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0098\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005(\u0000\u0000\u008b\u008c\u0005\u0019\u0000"+
		"\u0000\u008c\u008e\u0003\u0014\n\u0000\u008d\u008f\u0003\u000e\u0007\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0098\u0001\u0000\u0000\u0000\u0090\u0091\u0005(\u0000\u0000\u0091"+
		"\u0092\u0005\u0019\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093"+
		"\u0094\u0003\u0014\n\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0010\b\u0000\u0097V\u0001"+
		"\u0000\u0000\u0000\u0097`\u0001\u0000\u0000\u0000\u0097n\u0001\u0000\u0000"+
		"\u0000\u0097|\u0001\u0000\u0000\u0000\u0097\u008a\u0001\u0000\u0000\u0000"+
		"\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005(\u0000\u0000\u009a"+
		"\u00a8\u0005\u001a\u0000\u0000\u009b\u009c\u0005(\u0000\u0000\u009c\u009d"+
		"\u0005\u0018\u0000\u0000\u009d\u00a5\u0003\u0000\u0000\u0000\u009e\u009f"+
		"\u0003\n\u0005\u0000\u009f\u00a0\u0005(\u0000\u0000\u00a0\u00a1\u0005"+
		"\u0018\u0000\u0000\u00a1\u00a2\u0003\u0000\u0000\u0000\u00a2\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a8\u009b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u001b\u0000\u0000\u00ab\u00ac\u0005\u0018\u0000\u0000\u00ac\u00ad\u0003"+
		"\u0000\u0000\u0000\u00ad\u00af\u0005\u0004\u0000\u0000\u00ae\u00b0\u0005"+
		"\u0004\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003"+
		"\u0014\n\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0005\u001c\u0000\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0007\u0003\u0000\u0000\u00bb\u01d2\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005(\u0000\u0000\u00bd\u00c7\u0005\u001a\u0000"+
		"\u0000\u00be\u00c4\u0003\u0014\n\u0000\u00bf\u00c0\u0003\n\u0005\u0000"+
		"\u00c0\u00c1\u0003\u0014\n\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00be\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cd\u0005\u001b\u0000\u0000\u00ca"+
		"\u00cb\u0003\f\u0006\u0000\u00cb\u00cc\u0003\u001c\u000e\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf\u00d1"+
		"\u0005\n\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u01d2\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d7\u0005\u001a\u0000\u0000\u00d6\u00d8\u0003"+
		"\u0016\u000b\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003"+
		"\u0018\f\u0000\u00da\u00dc\u0003\u0014\n\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e1\u0005\u001b\u0000\u0000\u00de\u00df\u0003\f\u0006"+
		"\u0000\u00df\u00e0\u0003\u001c\u000e\u0000\u00e0\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e6\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\n\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u01d2\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ed\u0005\u001d\u0000\u0000\u00ea\u00ec\u0003\u0014\n\u0000\u00eb"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f4\u0005\u001e\u0000\u0000\u00f1\u00f3\u0003\u0014\n\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb"+
		"\u0005\u001f\u0000\u0000\u00f8\u00fa\u0003\u0014\n\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0101\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0005"+
		" \u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0005\n\u0000\u0000\u0105\u0104\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u01d2\u0001\u0000\u0000"+
		"\u0000\u0107\u010b\u0005!\u0000\u0000\u0108\u010a\u0003\u0014\n\u0000"+
		"\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010e\u0112\u0005\"\u0000\u0000\u010f\u0111\u0003\u0014\n\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0005#\u0000\u0000\u0116\u0118\u0005\n\u0000\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u01d2"+
		"\u0001\u0000\u0000\u0000\u0119\u011d\u0005\u0004\u0000\u0000\u011a\u011c"+
		"\u0003\u0014\n\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u0120\u01d2\u0005\u0005\u0000\u0000\u0121\u0125\u0005"+
		"\u0004\u0000\u0000\u0122\u0124\u0003\u0014\n\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u01d2\u0005\u001c"+
		"\u0000\u0000\u0129\u012d\u0005\u001a\u0000\u0000\u012a\u012c\u0003\u0014"+
		"\n\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0134\u0005\u001b\u0000\u0000\u0131\u0133\u0005\n\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u01d2\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0007\u0004\u0000\u0000\u0138\u0139\u0003\f\u0006\u0000\u0139"+
		"\u013f\u0003\u001c\u000e\u0000\u013a\u013b\u0003\f\u0006\u0000\u013b\u013c"+
		"\u0003\u001c\u000e\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013a"+
		"\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0144"+
		"\u0005\n\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u01d2\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"$\u0000\u0000\u0146\u0147\u0005(\u0000\u0000\u0147\u014a\u0005\u0018\u0000"+
		"\u0000\u0148\u014b\u0003\u0000\u0000\u0000\u0149\u014b\u0003\u0014\n\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0163\u0005%\u0000\u0000\u014d"+
		"\u014f\u0003\u0014\n\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0164\u0001\u0000\u0000\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0157\u0005\u0004\u0000\u0000\u0154\u0156"+
		"\u0003\u0014\n\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0159\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u015a\u0164\u0005\u001c\u0000\u0000\u015b\u015f\u0005"+
		"\u001a\u0000\u0000\u015c\u015e\u0003\u0014\n\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u0005\u001b"+
		"\u0000\u0000\u0163\u0150\u0001\u0000\u0000\u0000\u0163\u0153\u0001\u0000"+
		"\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0164\u0168\u0001\u0000"+
		"\u0000\u0000\u0165\u0167\u0005\n\u0000\u0000\u0166\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u01d2\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0007\u0005\u0000"+
		"\u0000\u016c\u016d\u0003\u0012\t\u0000\u016d\u0173\u0003\u0014\n\u0000"+
		"\u016e\u016f\u0003\u0012\t\u0000\u016f\u0170\u0003\u0014\n\u0000\u0170"+
		"\u0172\u0001\u0000\u0000\u0000\u0171\u016e\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0005\n\u0000\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u01d2"+
		"\u0001\u0000\u0000\u0000\u0179\u017c\u0005&\u0000\u0000\u017a\u017d\u0005"+
		"(\u0000\u0000\u017b\u017d\u0003\u0014\n\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000"+
		"\u0000\u0000\u017e\u0180\u0005\n\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u01d2\u0001\u0000\u0000"+
		"\u0000\u0181\u0185\u0005!\u0000\u0000\u0182\u0184\u0003\u0014\n\u0000"+
		"\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0188\u018a\u0005\"\u0000\u0000\u0189\u018b\u0005\u0004\u0000\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018f\u0001\u0000\u0000\u0000\u018c\u018e\u0003\u0014\n\u0000\u018d\u018c"+
		"\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0193"+
		"\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0005\u001c\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0001\u0000\u0000\u0000\u0194\u01d2\u0001\u0000\u0000\u0000\u0195\u0199"+
		"\u0005!\u0000\u0000\u0196\u0198\u0003\u0014\n\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e\u0005"+
		"\"\u0000\u0000\u019d\u019f\u0005\u0004\u0000\u0000\u019e\u019d\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a2\u0003\u0014\n\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005\u001c\u0000"+
		"\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005#\u0000\u0000"+
		"\u01aa\u01ac\u0005\n\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01d2\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0005\u001a\u0000\u0000\u01ae\u01b0\u0003\u0016\u000b\u0000\u01af"+
		"\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b1\u01b4\u0003\u0018\f\u0000\u01b2\u01b4"+
		"\u0003\u0014\n\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005"+
		"\u001b\u0000\u0000\u01b6\u01b7\u0005\'\u0000\u0000\u01b7\u01b8\u0005("+
		"\u0000\u0000\u01b8\u01b9\u0003\f\u0006\u0000\u01b9\u01bf\u0003\u001c\u000e"+
		"\u0000\u01ba\u01bb\u0003\f\u0006\u0000\u01bb\u01bc\u0003\u001c\u000e\u0000"+
		"\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000"+
		"\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c4\u0005\n\u0000\u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01d2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u001a\u0000\u0000\u01c6"+
		"\u01c7\u0005$\u0000\u0000\u01c7\u01c8\u0005(\u0000\u0000\u01c8\u01cb\u0005"+
		"\u0018\u0000\u0000\u01c9\u01cc\u0003\u0000\u0000\u0000\u01ca\u01cc\u0003"+
		"\u0014\n\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005%\u0000"+
		"\u0000\u01ce\u01cf\u0003\u001c\u000e\u0000\u01cf\u01d0\u0005\u001b\u0000"+
		"\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u0099\u0001\u0000\u0000"+
		"\u0000\u01d1\u00bc\u0001\u0000\u0000\u0000\u01d1\u00d5\u0001\u0000\u0000"+
		"\u0000\u01d1\u00e9\u0001\u0000\u0000\u0000\u01d1\u0107\u0001\u0000\u0000"+
		"\u0000\u01d1\u0119\u0001\u0000\u0000\u0000\u01d1\u0121\u0001\u0000\u0000"+
		"\u0000\u01d1\u0129\u0001\u0000\u0000\u0000\u01d1\u0137\u0001\u0000\u0000"+
		"\u0000\u01d1\u0145\u0001\u0000\u0000\u0000\u01d1\u016b\u0001\u0000\u0000"+
		"\u0000\u01d1\u0179\u0001\u0000\u0000\u0000\u01d1\u0181\u0001\u0000\u0000"+
		"\u0000\u01d1\u0195\u0001\u0000\u0000\u0000\u01d1\u01ad\u0001\u0000\u0000"+
		"\u0000\u01d1\u01c5\u0001\u0000\u0000\u0000\u01d2\u001d\u0001\u0000\u0000"+
		"\u0000E#*24ALT[^hlvz\u0084\u0088\u008e\u0097\u00a5\u00a8\u00af\u00b4\u00b8"+
		"\u00c4\u00c7\u00cd\u00d2\u00d7\u00db\u00e1\u00e6\u00ed\u00f4\u00fb\u0101"+
		"\u0105\u010b\u0112\u0117\u011d\u0125\u012d\u0134\u013f\u0143\u014a\u0150"+
		"\u0157\u015f\u0163\u0168\u0173\u0177\u017c\u017f\u0185\u018a\u018f\u0193"+
		"\u0199\u019e\u01a3\u01a7\u01ab\u01af\u01b3\u01bf\u01c3\u01cb\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}