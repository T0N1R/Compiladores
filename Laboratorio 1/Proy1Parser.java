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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, NUM=38, STRING=39, 
		DELIMITER=40, QUOTES=41, APOSTROPHE=42, CHAR_LITERAL=43, PARENTESIS=44, 
		COMENTARIO=45, LCOMENTARIO=46, BOOL=47, Not=48;
	public static final int
		RULE_tipoVariable = 0, RULE_start = 1, RULE_clase = 2, RULE_feature_clases = 3, 
		RULE_coma = 4, RULE_punto = 5, RULE_semicolon = 6, RULE_self = 7, RULE_operacion = 8, 
		RULE_expr = 9, RULE_inicializar = 10, RULE_declararAtributo = 11, RULE_metodo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipoVariable", "start", "clase", "feature_clases", "coma", "punto", 
			"semicolon", "self", "operacion", "expr", "inicializar", "declararAtributo", 
			"metodo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELF_TYPE'", "'class'", "'inherits'", "'{'", "'};'", "','", "'.'", 
			"';'", "'self'", "'+'", "'-'", "'*'", "'/'", "'='", "'<'", "'>'", "'<='", 
			"'>='", "'new'", "'isvoid'", "':'", "'<-'", "'('", "')'", "'}'", "'if'", 
			"'then'", "'else'", "'fi'", "'while'", "'loop'", "'pool'", "'let'", "'in'", 
			"'~'", "'@'", null, null, null, null, "'\"'", "'''", null, null, null, 
			null, null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", 
			"PARENTESIS", "COMENTARIO", "LCOMENTARIO", "BOOL", "Not"
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
				tipoVariable();
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
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
		enterRule(_localctx, 8, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__5);
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
		enterRule(_localctx, 10, RULE_punto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__6);
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
		enterRule(_localctx, 12, RULE_semicolon);
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
		enterRule(_localctx, 14, RULE_self);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__8);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				match(T__7);
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
		enterRule(_localctx, 16, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		public TerminalNode BOOL() { return getToken(Proy1Parser.BOOL, 0); }
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
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				declararAtributo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				metodo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(BOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(NUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
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
		enterRule(_localctx, 20, RULE_inicializar);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__18);
				setState(73);
				tipoVariable();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__19);
				setState(75);
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
		enterRule(_localctx, 22, RULE_declararAtributo);
		int _la;
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Tipo_correcto_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				setState(79);
				match(T__20);
				setState(80);
				tipoVariable();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(81);
					match(T__21);
					setState(82);
					expr();
					}
				}

				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(85);
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
				setState(88);
				match(ID);
				setState(89);
				match(T__21);
				setState(90);
				inicializar();
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						punto();
						setState(92);
						metodo();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(99);
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
				setState(102);
				match(ID);
				setState(103);
				match(T__21);
				setState(104);
				metodo();
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						operacion();
						setState(106);
						metodo();
						}
						} 
					}
					setState(112);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(113);
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
				setState(116);
				match(ID);
				setState(117);
				match(T__21);
				setState(118);
				match(ID);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						operacion();
						setState(120);
						metodo();
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(127);
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
				setState(130);
				match(ID);
				setState(131);
				match(T__21);
				setState(132);
				expr();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(133);
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
				setState(136);
				match(ID);
				setState(137);
				match(T__21);
				setState(138);
				match(T__3);
				setState(139);
				expr();
				setState(140);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Tipo_correcto_8Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
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
		public TerminalNode Not() { return getToken(Proy1Parser.Not, 0); }
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
		public List<TerminalNode> ID() { return getTokens(Proy1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Proy1Parser.ID, i);
		}
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
		public TerminalNode Not() { return getToken(Proy1Parser.Not, 0); }
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
		enterRule(_localctx, 24, RULE_metodo);
		int _la;
		try {
			int _alt;
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new Metodo1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(ID);
				setState(146);
				match(T__22);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(147);
					match(ID);
					setState(148);
					match(T__20);
					setState(149);
					tipoVariable();
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(150);
						coma();
						setState(151);
						match(ID);
						setState(152);
						match(T__20);
						setState(153);
						tipoVariable();
						}
						}
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(162);
				match(T__23);
				setState(163);
				match(T__20);
				setState(164);
				tipoVariable();
				setState(165);
				match(T__3);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(166);
					match(T__3);
					}
					break;
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(169);
					expr();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(175);
					match(T__24);
					}
					break;
				}
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__24) ) {
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
				setState(180);
				match(ID);
				setState(181);
				match(T__22);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					setState(182);
					expr();
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(183);
						coma();
						setState(184);
						expr();
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(193);
				match(T__23);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(194);
					punto();
					setState(195);
					metodo();
					}
					break;
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(199);
						match(T__7);
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Metodo3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__22);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(206);
					match(Not);
					}
				}

				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(209);
					inicializar();
					}
					break;
				case T__3:
				case T__8:
				case T__22:
				case T__25:
				case T__29:
				case T__32:
				case T__34:
				case ID:
				case NUM:
				case STRING:
				case BOOL:
					{
					setState(210);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213);
				match(T__23);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(214);
					punto();
					setState(215);
					metodo();
					}
					break;
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						match(T__7);
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new Metodo4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__25);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(226);
					expr();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__26);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(233);
					expr();
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(T__27);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						expr();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(246);
						match(T__28);
						}
						} 
					}
					setState(251);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(252);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Metodo5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(T__29);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(256);
					expr();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__30);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(263);
					expr();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(T__31);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(270);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Metodo6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(T__3);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(274);
					expr();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Metodo7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				match(T__3);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
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
				match(T__24);
				}
				break;
			case 8:
				_localctx = new Metodo8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				match(T__22);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
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
				match(T__23);
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(T__7);
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 9:
				_localctx = new Metodo9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				punto();
				setState(305);
				metodo();
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						punto();
						setState(307);
						metodo();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(314);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new Metodo10Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(317);
				match(T__32);
				setState(318);
				match(ID);
				setState(319);
				match(T__20);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(320);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(321);
					match(ID);
					setState(322);
					match(T__21);
					setState(323);
					expr();
					}
					break;
				}
				setState(326);
				match(T__33);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(327);
							expr();
							}
							} 
						}
						setState(332);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(333);
					match(T__3);
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(334);
						expr();
						}
						}
						setState(339);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(340);
					match(T__24);
					}
					break;
				case 3:
					{
					setState(341);
					match(T__22);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(342);
						expr();
						}
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(348);
					match(T__23);
					}
					break;
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(T__7);
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
				break;
			case 11:
				_localctx = new Metodo11Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				operacion();
				{
				setState(359);
				expr();
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						operacion();
						setState(361);
						expr();
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(368);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new Metodo12Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(371);
				match(T__34);
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(372);
					match(ID);
					}
					break;
				case 2:
					{
					setState(373);
					expr();
					}
					break;
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(376);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new Metodo13Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(379);
				match(T__29);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(380);
					expr();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(T__30);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(387);
					match(T__3);
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(390);
						expr();
						}
						} 
					}
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(396);
					match(T__24);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new Metodo14Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(399);
				match(T__29);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(400);
					expr();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(T__30);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(407);
					match(T__3);
					}
					break;
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(410);
					expr();
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(416);
					match(T__24);
					}
				}

				setState(419);
				match(T__31);
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(420);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new Metodo15Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(423);
				match(T__22);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(424);
					match(Not);
					}
				}

				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(427);
					inicializar();
					}
					break;
				case T__3:
				case T__8:
				case T__22:
				case T__25:
				case T__29:
				case T__32:
				case T__34:
				case ID:
				case NUM:
				case STRING:
				case BOOL:
					{
					setState(428);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431);
				match(T__23);
				setState(432);
				match(T__35);
				setState(433);
				match(ID);
				setState(434);
				punto();
				setState(435);
				metodo();
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						punto();
						setState(437);
						metodo();
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(444);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new Metodo16Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(447);
				match(T__22);
				setState(448);
				match(T__32);
				setState(449);
				match(ID);
				setState(450);
				match(T__20);
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(451);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(452);
					expr();
					}
					break;
				}
				setState(455);
				match(T__33);
				setState(456);
				metodo();
				setState(457);
				match(T__23);
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
		"\u0004\u00010\u01ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e\b\u0001"+
		"\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007<\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tG\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\nM\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bT\b\u000b\u0001\u000b\u0003\u000b"+
		"W\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b_\b\u000b\n\u000b\f\u000bb\t\u000b\u0001\u000b"+
		"\u0003\u000be\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bm\b\u000b\n\u000b\f\u000bp\t\u000b"+
		"\u0001\u000b\u0003\u000bs\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b{\b\u000b\n\u000b\f\u000b"+
		"~\t\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0087\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0090\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u009c\b\f\n\f\f\f\u009f\t\f\u0003\f\u00a1"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a8\b\f\u0001\f"+
		"\u0005\f\u00ab\b\f\n\f\f\f\u00ae\t\f\u0001\f\u0003\f\u00b1\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bb"+
		"\b\f\n\f\f\f\u00be\t\f\u0003\f\u00c0\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00c6\b\f\u0001\f\u0005\f\u00c9\b\f\n\f\f\f\u00cc\t\f\u0001"+
		"\f\u0001\f\u0003\f\u00d0\b\f\u0001\f\u0001\f\u0003\f\u00d4\b\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00da\b\f\u0001\f\u0005\f\u00dd\b\f\n"+
		"\f\f\f\u00e0\t\f\u0001\f\u0001\f\u0005\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001"+
		"\f\u0001\f\u0005\f\u00eb\b\f\n\f\f\f\u00ee\t\f\u0001\f\u0001\f\u0005\f"+
		"\u00f2\b\f\n\f\f\f\u00f5\t\f\u0001\f\u0005\f\u00f8\b\f\n\f\f\f\u00fb\t"+
		"\f\u0001\f\u0003\f\u00fe\b\f\u0001\f\u0001\f\u0005\f\u0102\b\f\n\f\f\f"+
		"\u0105\t\f\u0001\f\u0001\f\u0005\f\u0109\b\f\n\f\f\f\u010c\t\f\u0001\f"+
		"\u0001\f\u0003\f\u0110\b\f\u0001\f\u0001\f\u0005\f\u0114\b\f\n\f\f\f\u0117"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u011c\b\f\n\f\f\f\u011f\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0124\b\f\n\f\f\f\u0127\t\f\u0001\f\u0001\f"+
		"\u0005\f\u012b\b\f\n\f\f\f\u012e\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0136\b\f\n\f\f\f\u0139\t\f\u0001\f\u0003\f\u013c\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0145"+
		"\b\f\u0001\f\u0001\f\u0005\f\u0149\b\f\n\f\f\f\u014c\t\f\u0001\f\u0001"+
		"\f\u0005\f\u0150\b\f\n\f\f\f\u0153\t\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u0158\b\f\n\f\f\f\u015b\t\f\u0001\f\u0003\f\u015e\b\f\u0001\f\u0005\f"+
		"\u0161\b\f\n\f\f\f\u0164\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u016c\b\f\n\f\f\f\u016f\t\f\u0001\f\u0003\f\u0172\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0177\b\f\u0001\f\u0003\f\u017a\b\f\u0001\f"+
		"\u0001\f\u0005\f\u017e\b\f\n\f\f\f\u0181\t\f\u0001\f\u0001\f\u0003\f\u0185"+
		"\b\f\u0001\f\u0005\f\u0188\b\f\n\f\f\f\u018b\t\f\u0001\f\u0003\f\u018e"+
		"\b\f\u0001\f\u0001\f\u0005\f\u0192\b\f\n\f\f\f\u0195\t\f\u0001\f\u0001"+
		"\f\u0003\f\u0199\b\f\u0001\f\u0005\f\u019c\b\f\n\f\f\f\u019f\t\f\u0001"+
		"\f\u0003\f\u01a2\b\f\u0001\f\u0001\f\u0003\f\u01a6\b\f\u0001\f\u0001\f"+
		"\u0003\f\u01aa\b\f\u0001\f\u0001\f\u0003\f\u01ae\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u01b8\b\f\n\f\f\f\u01bb"+
		"\t\f\u0001\f\u0003\f\u01be\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u01c6\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01cc"+
		"\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0005\u0002\u0000\u0001\u0001%%\u0001\u0000\n"+
		"\u0012\u0002\u0000\u0005\u0005\u0019\u0019\u0002\u0000%%\'\'\u0001\u0000"+
		"%&\u021e\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000"+
		"\u0000\u0004\"\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000"+
		"\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000\u0000\f7\u0001\u0000"+
		"\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010=\u0001\u0000\u0000\u0000"+
		"\u0012F\u0001\u0000\u0000\u0000\u0014L\u0001\u0000\u0000\u0000\u0016\u008f"+
		"\u0001\u0000\u0000\u0000\u0018\u01cb\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0007\u0000\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0003\u0004\u0002\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"\"#\u0005\u0002\u0000\u0000#&\u0005%\u0000\u0000$%\u0005\u0003\u0000\u0000"+
		"%\'\u0003\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0005\u0004\u0000\u0000)*\u0003\u0006"+
		"\u0003\u0000*+\u0005\u0005\u0000\u0000+\u0005\u0001\u0000\u0000\u0000"+
		",/\u0003\u0016\u000b\u0000-/\u0003\u0018\f\u0000.,\u0001\u0000\u0000\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000034\u0005\u0006\u0000\u00004\t\u0001\u0000\u0000\u0000"+
		"56\u0005\u0007\u0000\u00006\u000b\u0001\u0000\u0000\u000078\u0005\b\u0000"+
		"\u00008\r\u0001\u0000\u0000\u00009;\u0005\t\u0000\u0000:<\u0005\b\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u000f\u0001"+
		"\u0000\u0000\u0000=>\u0007\u0001\u0000\u0000>\u0011\u0001\u0000\u0000"+
		"\u0000?G\u0005%\u0000\u0000@G\u0005\'\u0000\u0000AG\u0003\u0016\u000b"+
		"\u0000BG\u0003\u0018\f\u0000CG\u0005/\u0000\u0000DG\u0005&\u0000\u0000"+
		"EG\u0003\u000e\u0007\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000"+
		"\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0013"+
		"\u0001\u0000\u0000\u0000HI\u0005\u0013\u0000\u0000IM\u0003\u0000\u0000"+
		"\u0000JK\u0005\u0014\u0000\u0000KM\u0003\u000e\u0007\u0000LH\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000M\u0015\u0001\u0000\u0000\u0000"+
		"NO\u0005%\u0000\u0000OP\u0005\u0015\u0000\u0000PS\u0003\u0000\u0000\u0000"+
		"QR\u0005\u0016\u0000\u0000RT\u0003\u0012\t\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003\f\u0006\u0000"+
		"VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0090\u0001\u0000"+
		"\u0000\u0000XY\u0005%\u0000\u0000YZ\u0005\u0016\u0000\u0000Z`\u0003\u0014"+
		"\n\u0000[\\\u0003\n\u0005\u0000\\]\u0003\u0018\f\u0000]_\u0001\u0000\u0000"+
		"\u0000^[\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000ce\u0003\f\u0006\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u0090\u0001\u0000\u0000\u0000fg\u0005%\u0000\u0000"+
		"gh\u0005\u0016\u0000\u0000hn\u0003\u0018\f\u0000ij\u0003\u0010\b\u0000"+
		"jk\u0003\u0018\f\u0000km\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0003\f\u0006"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0090\u0001"+
		"\u0000\u0000\u0000tu\u0005%\u0000\u0000uv\u0005\u0016\u0000\u0000v|\u0005"+
		"%\u0000\u0000wx\u0003\u0010\b\u0000xy\u0003\u0018\f\u0000y{\u0001\u0000"+
		"\u0000\u0000zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0090\u0001\u0000\u0000\u0000\u0082\u0083\u0005%\u0000\u0000\u0083\u0084"+
		"\u0005\u0016\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000\u0085\u0087\u0003"+
		"\f\u0006\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0090\u0001\u0000\u0000\u0000\u0088\u0089\u0005%\u0000"+
		"\u0000\u0089\u008a\u0005\u0016\u0000\u0000\u008a\u008b\u0005\u0004\u0000"+
		"\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0005\u0005\u0000\u0000"+
		"\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000"+
		"\u008fN\u0001\u0000\u0000\u0000\u008fX\u0001\u0000\u0000\u0000\u008ff"+
		"\u0001\u0000\u0000\u0000\u008ft\u0001\u0000\u0000\u0000\u008f\u0082\u0001"+
		"\u0000\u0000\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0017\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"%\u0000\u0000\u0092\u00a0\u0005\u0017\u0000\u0000\u0093\u0094\u0005%\u0000"+
		"\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095\u009d\u0003\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\b\u0004\u0000\u0097\u0098\u0005%\u0000\u0000"+
		"\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009a\u0003\u0000\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0093\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0018\u0000\u0000\u00a3\u00a4\u0005\u0015\u0000\u0000"+
		"\u00a4\u00a5\u0003\u0000\u0000\u0000\u00a5\u00a7\u0005\u0004\u0000\u0000"+
		"\u00a6\u00a8\u0005\u0004\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ac\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ab\u0003\u0012\t\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u0019\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0002\u0000\u0000\u00b3"+
		"\u01cc\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005%\u0000\u0000\u00b5\u00bf"+
		"\u0005\u0017\u0000\u0000\u00b6\u00bc\u0003\u0012\t\u0000\u00b7\u00b8\u0003"+
		"\b\u0004\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9\u00bb\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005\u0018"+
		"\u0000\u0000\u00c2\u00c3\u0003\n\u0005\u0000\u00c3\u00c4\u0003\u0018\f"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0005\b\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005\u0017\u0000\u0000"+
		"\u00ce\u00d0\u00050\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0003\u0014\n\u0000\u00d2\u00d4\u0003\u0012\t\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d9\u0005\u0018\u0000\u0000\u00d6\u00d7"+
		"\u0003\n\u0005\u0000\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00da\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00de\u0001\u0000\u0000\u0000\u00db\u00dd\u0005"+
		"\b\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u01cc\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e5\u0005\u001a\u0000\u0000\u00e2\u00e4\u0003\u0012"+
		"\t\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ec\u0005\u001b\u0000\u0000\u00e9\u00eb\u0003\u0012\t\u0000"+
		"\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f3\u0005\u001c\u0000\u0000\u00f0\u00f2\u0003\u0012\t\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0005\u001d\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005\b\u0000\u0000\u00fd\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u01cc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0103\u0005\u001e\u0000\u0000\u0100\u0102"+
		"\u0003\u0012\t\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u010a\u0005\u001f\u0000\u0000\u0107\u0109\u0003"+
		"\u0012\t\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010f\u0005 \u0000\u0000\u010e\u0110\u0005\b\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u01cc\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u0004\u0000"+
		"\u0000\u0112\u0114\u0003\u0012\t\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u01cc\u0005\u0005\u0000\u0000"+
		"\u0119\u011d\u0005\u0004\u0000\u0000\u011a\u011c\u0003\u0012\t\u0000\u011b"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120"+
		"\u01cc\u0005\u0019\u0000\u0000\u0121\u0125\u0005\u0017\u0000\u0000\u0122"+
		"\u0124\u0003\u0012\t\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127"+
		"\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012c\u0005\u0018\u0000\u0000\u0129\u012b"+
		"\u0005\b\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u01cc\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0007\u0003\u0000\u0000\u0130\u0131\u0003"+
		"\n\u0005\u0000\u0131\u0137\u0003\u0018\f\u0000\u0132\u0133\u0003\n\u0005"+
		"\u0000\u0133\u0134\u0003\u0018\f\u0000\u0134\u0136\u0001\u0000\u0000\u0000"+
		"\u0135\u0132\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0005\b\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u01cc\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005!\u0000\u0000\u013e\u013f\u0005%\u0000\u0000\u013f\u0144\u0005"+
		"\u0015\u0000\u0000\u0140\u0145\u0003\u0000\u0000\u0000\u0141\u0142\u0005"+
		"%\u0000\u0000\u0142\u0143\u0005\u0016\u0000\u0000\u0143\u0145\u0003\u0012"+
		"\t\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u015d\u0005\"\u0000\u0000"+
		"\u0147\u0149\u0003\u0012\t\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149"+
		"\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u015e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014d\u0151\u0005\u0004\u0000\u0000\u014e"+
		"\u0150\u0003\u0012\t\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u015e\u0005\u0019\u0000\u0000\u0155\u0159"+
		"\u0005\u0017\u0000\u0000\u0156\u0158\u0003\u0012\t\u0000\u0157\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u015e\u0005"+
		"\u0018\u0000\u0000\u015d\u014a\u0001\u0000\u0000\u0000\u015d\u014d\u0001"+
		"\u0000\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015e\u0162\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0005\b\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u01cc\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0007\u0004"+
		"\u0000\u0000\u0166\u0167\u0003\u0010\b\u0000\u0167\u016d\u0003\u0012\t"+
		"\u0000\u0168\u0169\u0003\u0010\b\u0000\u0169\u016a\u0003\u0012\t\u0000"+
		"\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0168\u0001\u0000\u0000\u0000"+
		"\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000"+
		"\u016f\u016d\u0001\u0000\u0000\u0000\u0170\u0172\u0005\b\u0000\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u01cc\u0001\u0000\u0000\u0000\u0173\u0176\u0005#\u0000\u0000\u0174\u0177"+
		"\u0005%\u0000\u0000\u0175\u0177\u0003\u0012\t\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0179\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0005\b\u0000\u0000\u0179\u0178\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u01cc\u0001\u0000"+
		"\u0000\u0000\u017b\u017f\u0005\u001e\u0000\u0000\u017c\u017e\u0003\u0012"+
		"\t\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0005\u001f\u0000\u0000\u0183\u0185\u0005\u0004\u0000"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0189\u0001\u0000\u0000\u0000\u0186\u0188\u0003\u0012\t\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018c\u018e\u0005\u0019\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u01cc\u0001\u0000\u0000\u0000"+
		"\u018f\u0193\u0005\u001e\u0000\u0000\u0190\u0192\u0003\u0012\t\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196"+
		"\u0198\u0005\u001f\u0000\u0000\u0197\u0199\u0005\u0004\u0000\u0000\u0198"+
		"\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019d\u0001\u0000\u0000\u0000\u019a\u019c\u0003\u0012\t\u0000\u019b\u019a"+
		"\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a1"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a2"+
		"\u0005\u0019\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u0005 \u0000\u0000\u01a4\u01a6\u0005\b\u0000\u0000\u01a5\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01cc\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a9\u0005\u0017\u0000\u0000\u01a8\u01aa\u0005"+
		"0\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01ae\u0003\u0014"+
		"\n\u0000\u01ac\u01ae\u0003\u0012\t\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005\u0018\u0000\u0000\u01b0\u01b1\u0005$\u0000\u0000"+
		"\u01b1\u01b2\u0005%\u0000\u0000\u01b2\u01b3\u0003\n\u0005\u0000\u01b3"+
		"\u01b9\u0003\u0018\f\u0000\u01b4\u01b5\u0003\n\u0005\u0000\u01b5\u01b6"+
		"\u0003\u0018\f\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01be\u0005"+
		"\b\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000"+
		"\u0000\u0000\u01be\u01cc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0017"+
		"\u0000\u0000\u01c0\u01c1\u0005!\u0000\u0000\u01c1\u01c2\u0005%\u0000\u0000"+
		"\u01c2\u01c5\u0005\u0015\u0000\u0000\u01c3\u01c6\u0003\u0000\u0000\u0000"+
		"\u01c4\u01c6\u0003\u0012\t\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005\"\u0000\u0000\u01c8\u01c9\u0003\u0018\f\u0000\u01c9\u01ca"+
		"\u0005\u0018\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000\u01cb\u0091"+
		"\u0001\u0000\u0000\u0000\u01cb\u00b4\u0001\u0000\u0000\u0000\u01cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u01cb\u00e1\u0001\u0000\u0000\u0000\u01cb\u00ff"+
		"\u0001\u0000\u0000\u0000\u01cb\u0111\u0001\u0000\u0000\u0000\u01cb\u0119"+
		"\u0001\u0000\u0000\u0000\u01cb\u0121\u0001\u0000\u0000\u0000\u01cb\u012f"+
		"\u0001\u0000\u0000\u0000\u01cb\u013d\u0001\u0000\u0000\u0000\u01cb\u0165"+
		"\u0001\u0000\u0000\u0000\u01cb\u0173\u0001\u0000\u0000\u0000\u01cb\u017b"+
		"\u0001\u0000\u0000\u0000\u01cb\u018f\u0001\u0000\u0000\u0000\u01cb\u01a7"+
		"\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cc\u0019"+
		"\u0001\u0000\u0000\u0000E\u001f&.0;FLSV`dnr|\u0080\u0086\u008f\u009d\u00a0"+
		"\u00a7\u00ac\u00b0\u00bc\u00bf\u00c5\u00ca\u00cf\u00d3\u00d9\u00de\u00e5"+
		"\u00ec\u00f3\u00f9\u00fd\u0103\u010a\u010f\u0115\u011d\u0125\u012c\u0137"+
		"\u013b\u0144\u014a\u0151\u0159\u015d\u0162\u016d\u0171\u0176\u0179\u017f"+
		"\u0184\u0189\u018d\u0193\u0198\u019d\u01a1\u01a5\u01a9\u01ad\u01b9\u01bd"+
		"\u01c5\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}