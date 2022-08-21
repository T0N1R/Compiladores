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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
					match(T__7);
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
					match(T__7);
					}
					break;
				}
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
				match(BOOL);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(74);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(NUM);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				match(NUM);
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(79);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__18);
				setState(86);
				tipoVariable();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__19);
				setState(88);
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
	public static class Tipo_correcto_2Context extends DeclararAtributoContext {
		public List<TerminalNode> ID() { return getTokens(Proy1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Proy1Parser.ID, i);
		}
		public Tipo_correcto_2Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).enterTipo_correcto_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Proy1Listener ) ((Proy1Listener)listener).exitTipo_correcto_2(this);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Tipo_correcto_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(92);
				match(T__20);
				setState(93);
				tipoVariable();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(94);
					match(T__21);
					setState(95);
					expr();
					}
				}

				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(98);
					semicolon();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Tipo_correcto_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__21);
				setState(103);
				match(ID);
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Tipo_correcto_3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__21);
				setState(109);
				inicializar();
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						punto();
						setState(111);
						metodo();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(118);
					semicolon();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Tipo_correcto_4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(ID);
				setState(122);
				match(T__21);
				setState(123);
				metodo();
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						operacion();
						setState(125);
						metodo();
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(132);
					semicolon();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new Tipo_correcto_5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(ID);
				setState(136);
				match(T__21);
				setState(137);
				match(ID);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						operacion();
						setState(139);
						metodo();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(146);
					semicolon();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Tipo_correcto_6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(ID);
				setState(150);
				match(T__21);
				setState(151);
				expr();
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(152);
					semicolon();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Tipo_correcto_7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__21);
				setState(157);
				match(T__3);
				setState(158);
				expr();
				setState(159);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new Tipo_correcto_8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
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
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new Metodo1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(ID);
				setState(165);
				match(T__22);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(166);
					match(ID);
					setState(167);
					match(T__20);
					setState(168);
					tipoVariable();
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(169);
						coma();
						setState(170);
						match(ID);
						setState(171);
						match(T__20);
						setState(172);
						tipoVariable();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(181);
				match(T__23);
				setState(182);
				match(T__20);
				setState(183);
				tipoVariable();
				setState(184);
				match(T__3);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(185);
					match(T__3);
					}
					break;
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(188);
					expr();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(194);
					match(T__24);
					}
					break;
				}
				setState(197);
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
				setState(199);
				match(ID);
				setState(200);
				match(T__22);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					setState(201);
					expr();
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(202);
						coma();
						setState(203);
						expr();
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(212);
				match(T__23);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(213);
					punto();
					setState(214);
					metodo();
					}
					break;
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						match(T__7);
						}
						} 
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Metodo3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(T__22);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(225);
					match(Not);
					}
				}

				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(228);
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
					setState(229);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232);
				match(T__23);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(233);
					punto();
					setState(234);
					metodo();
					}
					break;
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						match(T__7);
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new Metodo4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(T__25);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(245);
					expr();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(T__26);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(252);
					expr();
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__27);
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(259);
						expr();
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						match(T__28);
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(271);
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
				setState(274);
				match(T__29);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(275);
					expr();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
				match(T__30);
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
				match(T__31);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(289);
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
				setState(292);
				match(T__3);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(293);
					expr();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Metodo7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				match(T__3);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(301);
					expr();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(307);
				match(T__24);
				}
				break;
			case 8:
				_localctx = new Metodo8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(308);
				match(T__22);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(309);
					expr();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__23);
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						match(T__7);
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 9:
				_localctx = new Metodo9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				punto();
				setState(324);
				metodo();
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						punto();
						setState(326);
						metodo();
						}
						} 
					}
					setState(332);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(333);
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
				setState(336);
				match(T__32);
				setState(337);
				match(ID);
				setState(338);
				match(T__20);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(339);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(340);
					match(ID);
					setState(341);
					match(T__21);
					setState(342);
					expr();
					}
					break;
				}
				setState(345);
				match(T__33);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(346);
							expr();
							}
							} 
						}
						setState(351);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(352);
					match(T__3);
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(353);
						expr();
						}
						}
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(359);
					match(T__24);
					}
					break;
				case 3:
					{
					setState(360);
					match(T__22);
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(361);
						expr();
						}
						}
						setState(366);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(367);
					match(T__23);
					}
					break;
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(370);
						match(T__7);
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 11:
				_localctx = new Metodo11Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(376);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				operacion();
				{
				setState(378);
				expr();
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						operacion();
						setState(380);
						expr();
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(387);
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
				setState(390);
				match(T__34);
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(391);
					match(ID);
					}
					break;
				case 2:
					{
					setState(392);
					expr();
					}
					break;
				}
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(395);
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
				setState(398);
				match(T__29);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(399);
					expr();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(T__30);
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(406);
					match(T__3);
					}
					break;
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						expr();
						}
						} 
					}
					setState(414);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(415);
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
				setState(418);
				match(T__29);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(419);
					expr();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(T__30);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(426);
					match(T__3);
					}
					break;
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(429);
					expr();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(435);
					match(T__24);
					}
				}

				setState(438);
				match(T__31);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(439);
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
				setState(442);
				match(T__22);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(443);
					match(Not);
					}
				}

				setState(448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(446);
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
					setState(447);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(450);
				match(T__23);
				setState(451);
				match(T__35);
				setState(452);
				match(ID);
				setState(453);
				punto();
				setState(454);
				metodo();
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(455);
						punto();
						setState(456);
						metodo();
						}
						} 
					}
					setState(462);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(463);
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
				setState(466);
				match(T__22);
				setState(467);
				match(T__32);
				setState(468);
				match(ID);
				setState(469);
				match(T__20);
				setState(472);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(470);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(471);
					expr();
					}
					break;
				}
				setState(474);
				match(T__33);
				setState(475);
				metodo();
				setState(476);
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
		"\u0004\u00010\u01e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001e\b\u0001"+
		"\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003\f\u00032\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007<\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0003\tB\b\t\u0001\t\u0001\t\u0003\tF\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tL\b\t\u0001\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001\t\u0003"+
		"\tT\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nZ\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000ba\b\u000b\u0001"+
		"\u000b\u0003\u000bd\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000bj\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000br\b\u000b\n\u000b\f\u000bu\t"+
		"\u000b\u0001\u000b\u0003\u000bx\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0080\b\u000b\n"+
		"\u000b\f\u000b\u0083\t\u000b\u0001\u000b\u0003\u000b\u0086\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u008e\b\u000b\n\u000b\f\u000b\u0091\t\u000b\u0001\u000b\u0003\u000b"+
		"\u0094\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u009a\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00a3\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00af"+
		"\b\f\n\f\f\f\u00b2\t\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00bb\b\f\u0001\f\u0005\f\u00be\b\f\n\f\f\f\u00c1\t"+
		"\f\u0001\f\u0003\f\u00c4\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f\u00d1\t\f\u0003\f\u00d3\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001\f\u0005\f\u00dc"+
		"\b\f\n\f\f\f\u00df\t\f\u0001\f\u0001\f\u0003\f\u00e3\b\f\u0001\f\u0001"+
		"\f\u0003\f\u00e7\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ed\b\f"+
		"\u0001\f\u0005\f\u00f0\b\f\n\f\f\f\u00f3\t\f\u0001\f\u0001\f\u0005\f\u00f7"+
		"\b\f\n\f\f\f\u00fa\t\f\u0001\f\u0001\f\u0005\f\u00fe\b\f\n\f\f\f\u0101"+
		"\t\f\u0001\f\u0001\f\u0005\f\u0105\b\f\n\f\f\f\u0108\t\f\u0001\f\u0005"+
		"\f\u010b\b\f\n\f\f\f\u010e\t\f\u0001\f\u0003\f\u0111\b\f\u0001\f\u0001"+
		"\f\u0005\f\u0115\b\f\n\f\f\f\u0118\t\f\u0001\f\u0001\f\u0005\f\u011c\b"+
		"\f\n\f\f\f\u011f\t\f\u0001\f\u0001\f\u0003\f\u0123\b\f\u0001\f\u0001\f"+
		"\u0005\f\u0127\b\f\n\f\f\f\u012a\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u012f"+
		"\b\f\n\f\f\f\u0132\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u0137\b\f\n\f\f"+
		"\f\u013a\t\f\u0001\f\u0001\f\u0005\f\u013e\b\f\n\f\f\f\u0141\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0149\b\f\n\f\f\f\u014c"+
		"\t\f\u0001\f\u0003\f\u014f\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u0158\b\f\u0001\f\u0001\f\u0005\f\u015c\b\f\n"+
		"\f\f\f\u015f\t\f\u0001\f\u0001\f\u0005\f\u0163\b\f\n\f\f\f\u0166\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u016b\b\f\n\f\f\f\u016e\t\f\u0001\f\u0003\f"+
		"\u0171\b\f\u0001\f\u0005\f\u0174\b\f\n\f\f\f\u0177\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u017f\b\f\n\f\f\f\u0182\t\f\u0001"+
		"\f\u0003\f\u0185\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u018a\b\f\u0001\f"+
		"\u0003\f\u018d\b\f\u0001\f\u0001\f\u0005\f\u0191\b\f\n\f\f\f\u0194\t\f"+
		"\u0001\f\u0001\f\u0003\f\u0198\b\f\u0001\f\u0005\f\u019b\b\f\n\f\f\f\u019e"+
		"\t\f\u0001\f\u0003\f\u01a1\b\f\u0001\f\u0001\f\u0005\f\u01a5\b\f\n\f\f"+
		"\f\u01a8\t\f\u0001\f\u0001\f\u0003\f\u01ac\b\f\u0001\f\u0005\f\u01af\b"+
		"\f\n\f\f\f\u01b2\t\f\u0001\f\u0003\f\u01b5\b\f\u0001\f\u0001\f\u0003\f"+
		"\u01b9\b\f\u0001\f\u0001\f\u0003\f\u01bd\b\f\u0001\f\u0001\f\u0003\f\u01c1"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u01cb\b\f\n\f\f\f\u01ce\t\f\u0001\f\u0003\f\u01d1\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01d9\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u01df\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0002\u0000\u0001"+
		"\u0001%%\u0001\u0000\n\u0012\u0002\u0000\u0005\u0005\u0019\u0019\u0002"+
		"\u0000%%\'\'\u0001\u0000%&\u0238\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"\u001f\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u00060"+
		"\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f7\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010"+
		"=\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014Y\u0001"+
		"\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u01de\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0004\u0002\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0003\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#&\u0005%\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%\'\u0003\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0005"+
		"\u0004\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0005\u0000\u0000"+
		"+\u0005\u0001\u0000\u0000\u0000,/\u0003\u0016\u000b\u0000-/\u0003\u0018"+
		"\f\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0007"+
		"\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0005\u0006\u0000"+
		"\u00004\t\u0001\u0000\u0000\u000056\u0005\u0007\u0000\u00006\u000b\u0001"+
		"\u0000\u0000\u000078\u0005\b\u0000\u00008\r\u0001\u0000\u0000\u00009;"+
		"\u0005\t\u0000\u0000:<\u0005\b\u0000\u0000;:\u0001\u0000\u0000\u0000;"+
		"<\u0001\u0000\u0000\u0000<\u000f\u0001\u0000\u0000\u0000=>\u0007\u0001"+
		"\u0000\u0000>\u0011\u0001\u0000\u0000\u0000?A\u0005%\u0000\u0000@B\u0005"+
		"\b\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BT\u0001"+
		"\u0000\u0000\u0000CE\u0005\'\u0000\u0000DF\u0005\b\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FT\u0001\u0000\u0000\u0000"+
		"GT\u0003\u0016\u000b\u0000HT\u0003\u0018\f\u0000IK\u0005/\u0000\u0000"+
		"JL\u0005\b\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LT\u0001\u0000\u0000\u0000MT\u0005&\u0000\u0000NP\u0005&\u0000\u0000O"+
		"Q\u0005\b\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RT\u0003\u000e\u0007\u0000S?\u0001\u0000\u0000"+
		"\u0000SC\u0001\u0000\u0000\u0000SG\u0001\u0000\u0000\u0000SH\u0001\u0000"+
		"\u0000\u0000SI\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SN\u0001"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0013\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0013\u0000\u0000VZ\u0003\u0000\u0000\u0000WX\u0005\u0014"+
		"\u0000\u0000XZ\u0003\u000e\u0007\u0000YU\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z\u0015\u0001\u0000\u0000\u0000[\\\u0005%\u0000\u0000"+
		"\\]\u0005\u0015\u0000\u0000]`\u0003\u0000\u0000\u0000^_\u0005\u0016\u0000"+
		"\u0000_a\u0003\u0012\t\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ac\u0001\u0000\u0000\u0000bd\u0003\f\u0006\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000d\u00a3\u0001\u0000\u0000\u0000ef\u0005"+
		"%\u0000\u0000fg\u0005\u0016\u0000\u0000gi\u0005%\u0000\u0000hj\u0005\b"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u00a3"+
		"\u0001\u0000\u0000\u0000kl\u0005%\u0000\u0000lm\u0005\u0016\u0000\u0000"+
		"ms\u0003\u0014\n\u0000no\u0003\n\u0005\u0000op\u0003\u0018\f\u0000pr\u0001"+
		"\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vx\u0003\f\u0006\u0000wv\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u00a3\u0001\u0000\u0000\u0000yz\u0005"+
		"%\u0000\u0000z{\u0005\u0016\u0000\u0000{\u0081\u0003\u0018\f\u0000|}\u0003"+
		"\u0010\b\u0000}~\u0003\u0018\f\u0000~\u0080\u0001\u0000\u0000\u0000\u007f"+
		"|\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0003\f\u0006\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u00a3\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"%\u0000\u0000\u0088\u0089\u0005\u0016\u0000\u0000\u0089\u008f\u0005%\u0000"+
		"\u0000\u008a\u008b\u0003\u0010\b\u0000\u008b\u008c\u0003\u0018\f\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0003\f\u0006\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u00a3\u0001\u0000\u0000\u0000\u0095\u0096\u0005%\u0000\u0000\u0096\u0097"+
		"\u0005\u0016\u0000\u0000\u0097\u0099\u0003\u0012\t\u0000\u0098\u009a\u0003"+
		"\f\u0006\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u00a3\u0001\u0000\u0000\u0000\u009b\u009c\u0005%\u0000"+
		"\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u009e\u0005\u0004\u0000"+
		"\u0000\u009e\u009f\u0003\u0012\t\u0000\u009f\u00a0\u0005\u0005\u0000\u0000"+
		"\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\u000e\u0007\u0000"+
		"\u00a2[\u0001\u0000\u0000\u0000\u00a2e\u0001\u0000\u0000\u0000\u00a2k"+
		"\u0001\u0000\u0000\u0000\u00a2y\u0001\u0000\u0000\u0000\u00a2\u0087\u0001"+
		"\u0000\u0000\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a2\u009b\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0017\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005%\u0000\u0000\u00a5\u00b3\u0005\u0017"+
		"\u0000\u0000\u00a6\u00a7\u0005%\u0000\u0000\u00a7\u00a8\u0005\u0015\u0000"+
		"\u0000\u00a8\u00b0\u0003\u0000\u0000\u0000\u00a9\u00aa\u0003\b\u0004\u0000"+
		"\u00aa\u00ab\u0005%\u0000\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac"+
		"\u00ad\u0003\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00a9\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0018\u0000\u0000\u00b6"+
		"\u00b7\u0005\u0015\u0000\u0000\u00b7\u00b8\u0003\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0005\u0004\u0000\u0000\u00b9\u00bb\u0005\u0004\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bc\u00be\u0003\u0012\t\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\u0019\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0007\u0002\u0000\u0000\u00c6\u01df\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005%\u0000\u0000\u00c8\u00d2\u0005\u0017\u0000\u0000\u00c9\u00cf\u0003"+
		"\u0012\t\u0000\u00ca\u00cb\u0003\b\u0004\u0000\u00cb\u00cc\u0003\u0012"+
		"\t\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d8\u0005\u0018\u0000\u0000\u00d5\u00d6\u0003\n\u0005\u0000"+
		"\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dd\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\b\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u01df"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0005\u0017\u0000\u0000\u00e1\u00e3\u00050\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0003\u0014\n\u0000\u00e5\u00e7\u0003\u0012"+
		"\t\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005\u0018\u0000"+
		"\u0000\u00e9\u00ea\u0003\n\u0005\u0000\u00ea\u00eb\u0003\u0018\f\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u0005\b\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u01df\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f8\u0005\u001a\u0000\u0000\u00f5"+
		"\u00f7\u0003\u0012\t\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\u001b\u0000\u0000\u00fc\u00fe"+
		"\u0003\u0012\t\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u0106\u0005\u001c\u0000\u0000\u0103\u0105\u0003"+
		"\u0012\t\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u010c\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0005\u001d\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0111\u0005\b\u0000"+
		"\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u0111\u01df\u0001\u0000\u0000\u0000\u0112\u0116\u0005\u001e\u0000"+
		"\u0000\u0113\u0115\u0003\u0012\t\u0000\u0114\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011d\u0005\u001f\u0000\u0000"+
		"\u011a\u011c\u0003\u0012\t\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0122\u0005 \u0000\u0000\u0121\u0123"+
		"\u0005\b\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u01df\u0001\u0000\u0000\u0000\u0124\u0128\u0005"+
		"\u0004\u0000\u0000\u0125\u0127\u0003\u0012\t\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u01df\u0005\u0005"+
		"\u0000\u0000\u012c\u0130\u0005\u0004\u0000\u0000\u012d\u012f\u0003\u0012"+
		"\t\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u01df\u0005\u0019\u0000\u0000\u0134\u0138\u0005\u0017\u0000"+
		"\u0000\u0135\u0137\u0003\u0012\t\u0000\u0136\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013f\u0005\u0018\u0000\u0000"+
		"\u013c\u013e\u0005\b\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u01df\u0001\u0000\u0000\u0000\u0141"+
		"\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0007\u0003\u0000\u0000\u0143"+
		"\u0144\u0003\n\u0005\u0000\u0144\u014a\u0003\u0018\f\u0000\u0145\u0146"+
		"\u0003\n\u0005\u0000\u0146\u0147\u0003\u0018\f\u0000\u0147\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014c\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0005\b\u0000\u0000\u014e\u014d\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u01df\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005!\u0000\u0000\u0151\u0152\u0005%\u0000\u0000"+
		"\u0152\u0157\u0005\u0015\u0000\u0000\u0153\u0158\u0003\u0000\u0000\u0000"+
		"\u0154\u0155\u0005%\u0000\u0000\u0155\u0156\u0005\u0016\u0000\u0000\u0156"+
		"\u0158\u0003\u0012\t\u0000\u0157\u0153\u0001\u0000\u0000\u0000\u0157\u0154"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0170"+
		"\u0005\"\u0000\u0000\u015a\u015c\u0003\u0012\t\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0171\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0164\u0005"+
		"\u0004\u0000\u0000\u0161\u0163\u0003\u0012\t\u0000\u0162\u0161\u0001\u0000"+
		"\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000"+
		"\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u0171\u0005\u0019"+
		"\u0000\u0000\u0168\u016c\u0005\u0017\u0000\u0000\u0169\u016b\u0003\u0012"+
		"\t\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000"+
		"\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0005\u0018\u0000\u0000\u0170\u015d\u0001\u0000\u0000"+
		"\u0000\u0170\u0160\u0001\u0000\u0000\u0000\u0170\u0168\u0001\u0000\u0000"+
		"\u0000\u0171\u0175\u0001\u0000\u0000\u0000\u0172\u0174\u0005\b\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u01df\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0007\u0004\u0000\u0000\u0179\u017a\u0003\u0010\b\u0000\u017a"+
		"\u0180\u0003\u0012\t\u0000\u017b\u017c\u0003\u0010\b\u0000\u017c\u017d"+
		"\u0003\u0012\t\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017b\u0001"+
		"\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0184\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0185\u0005"+
		"\b\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185\u01df\u0001\u0000\u0000\u0000\u0186\u0189\u0005#\u0000"+
		"\u0000\u0187\u018a\u0005%\u0000\u0000\u0188\u018a\u0003\u0012\t\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u018d\u0005\b\u0000\u0000\u018c"+
		"\u018b\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d"+
		"\u01df\u0001\u0000\u0000\u0000\u018e\u0192\u0005\u001e\u0000\u0000\u018f"+
		"\u0191\u0003\u0012\t\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194"+
		"\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0195\u0197\u0005\u001f\u0000\u0000\u0196\u0198"+
		"\u0005\u0004\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u019c\u0001\u0000\u0000\u0000\u0199\u019b"+
		"\u0003\u0012\t\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001"+
		"\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001"+
		"\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001"+
		"\u0000\u0000\u0000\u019f\u01a1\u0005\u0019\u0000\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01df\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a6\u0005\u001e\u0000\u0000\u01a3\u01a5\u0003"+
		"\u0012\t\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a9\u01ab\u0005\u001f\u0000\u0000\u01aa\u01ac\u0005\u0004"+
		"\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01b0\u0001\u0000\u0000\u0000\u01ad\u01af\u0003\u0012"+
		"\t\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b5\u0005\u0019\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b8\u0005 \u0000\u0000\u01b7\u01b9\u0005\b\u0000\u0000"+
		"\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9\u01df\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005\u0017\u0000\u0000"+
		"\u01bb\u01bd\u00050\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be"+
		"\u01c1\u0003\u0014\n\u0000\u01bf\u01c1\u0003\u0012\t\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u0018\u0000\u0000\u01c3\u01c4"+
		"\u0005$\u0000\u0000\u01c4\u01c5\u0005%\u0000\u0000\u01c5\u01c6\u0003\n"+
		"\u0005\u0000\u01c6\u01cc\u0003\u0018\f\u0000\u01c7\u01c8\u0003\n\u0005"+
		"\u0000\u01c8\u01c9\u0003\u0018\f\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c7\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d1\u0005\b\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01df\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0005\u0017\u0000\u0000\u01d3\u01d4\u0005!\u0000\u0000\u01d4\u01d5"+
		"\u0005%\u0000\u0000\u01d5\u01d8\u0005\u0015\u0000\u0000\u01d6\u01d9\u0003"+
		"\u0000\u0000\u0000\u01d7\u01d9\u0003\u0012\t\u0000\u01d8\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0005\"\u0000\u0000\u01db\u01dc\u0003\u0018\f"+
		"\u0000\u01dc\u01dd\u0005\u0018\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u00a4\u0001\u0000\u0000\u0000\u01de\u00c7\u0001\u0000\u0000"+
		"\u0000\u01de\u00e0\u0001\u0000\u0000\u0000\u01de\u00f4\u0001\u0000\u0000"+
		"\u0000\u01de\u0112\u0001\u0000\u0000\u0000\u01de\u0124\u0001\u0000\u0000"+
		"\u0000\u01de\u012c\u0001\u0000\u0000\u0000\u01de\u0134\u0001\u0000\u0000"+
		"\u0000\u01de\u0142\u0001\u0000\u0000\u0000\u01de\u0150\u0001\u0000\u0000"+
		"\u0000\u01de\u0178\u0001\u0000\u0000\u0000\u01de\u0186\u0001\u0000\u0000"+
		"\u0000\u01de\u018e\u0001\u0000\u0000\u0000\u01de\u01a2\u0001\u0000\u0000"+
		"\u0000\u01de\u01ba\u0001\u0000\u0000\u0000\u01de\u01d2\u0001\u0000\u0000"+
		"\u0000\u01df\u0019\u0001\u0000\u0000\u0000J\u001f&.0;AEKPSY`cisw\u0081"+
		"\u0085\u008f\u0093\u0099\u00a2\u00b0\u00b3\u00ba\u00bf\u00c3\u00cf\u00d2"+
		"\u00d8\u00dd\u00e2\u00e6\u00ec\u00f1\u00f8\u00ff\u0106\u010c\u0110\u0116"+
		"\u011d\u0122\u0128\u0130\u0138\u013f\u014a\u014e\u0157\u015d\u0164\u016c"+
		"\u0170\u0175\u0180\u0184\u0189\u018c\u0192\u0197\u019c\u01a0\u01a6\u01ab"+
		"\u01b0\u01b4\u01b8\u01bc\u01c0\u01cc\u01d0\u01d8\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}