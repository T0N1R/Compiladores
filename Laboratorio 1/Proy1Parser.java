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
			setState(82);
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
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					match(T__7);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__18);
				setState(85);
				tipoVariable();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__19);
				setState(87);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Tipo_correcto_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__20);
				setState(92);
				tipoVariable();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(93);
					match(T__21);
					setState(94);
					expr();
					}
				}

				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(97);
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
				setState(100);
				match(ID);
				setState(101);
				match(T__21);
				setState(102);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(103);
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
				setState(106);
				match(ID);
				setState(107);
				match(T__21);
				setState(108);
				inicializar();
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						punto();
						setState(110);
						metodo();
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(117);
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
				setState(120);
				match(ID);
				setState(121);
				match(T__21);
				setState(122);
				metodo();
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
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
				_localctx = new Tipo_correcto_5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(ID);
				setState(135);
				match(T__21);
				setState(136);
				match(ID);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						operacion();
						setState(138);
						metodo();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(145);
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
				setState(148);
				match(ID);
				setState(149);
				match(T__21);
				setState(150);
				expr();
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(151);
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
				setState(154);
				match(ID);
				setState(155);
				match(T__21);
				setState(156);
				match(T__3);
				setState(157);
				expr();
				setState(158);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new Tipo_correcto_8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new Metodo1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ID);
				setState(164);
				match(T__22);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(165);
					match(ID);
					setState(166);
					match(T__20);
					setState(167);
					tipoVariable();
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(168);
						coma();
						setState(169);
						match(ID);
						setState(170);
						match(T__20);
						setState(171);
						tipoVariable();
						}
						}
						setState(177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(180);
				match(T__23);
				setState(181);
				match(T__20);
				setState(182);
				tipoVariable();
				setState(183);
				match(T__3);
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(184);
					match(T__3);
					}
					break;
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(187);
					expr();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(193);
					match(T__24);
					}
					break;
				}
				setState(196);
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
				setState(198);
				match(ID);
				setState(199);
				match(T__22);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					setState(200);
					expr();
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(201);
						coma();
						setState(202);
						expr();
						}
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(211);
				match(T__23);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(212);
					punto();
					setState(213);
					metodo();
					}
					break;
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(217);
						match(T__7);
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Metodo3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__22);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(224);
					match(Not);
					}
				}

				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(227);
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
					setState(228);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231);
				match(T__23);
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(232);
					punto();
					setState(233);
					metodo();
					}
					break;
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(T__7);
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new Metodo4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(T__25);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(244);
					expr();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(T__26);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(251);
					expr();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__27);
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						expr();
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						match(T__28);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(270);
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
				setState(273);
				match(T__29);
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
				match(T__30);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(281);
					expr();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(287);
				match(T__31);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(288);
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
				setState(291);
				match(T__3);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(292);
					expr();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new Metodo7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(T__3);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(300);
					expr();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(T__24);
				}
				break;
			case 8:
				_localctx = new Metodo8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				match(T__22);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(308);
					expr();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				match(T__23);
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(T__7);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				}
				break;
			case 9:
				_localctx = new Metodo9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				punto();
				setState(323);
				metodo();
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						punto();
						setState(325);
						metodo();
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(332);
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
				setState(335);
				match(T__32);
				setState(336);
				match(ID);
				setState(337);
				match(T__20);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(338);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(339);
					match(ID);
					setState(340);
					match(T__21);
					setState(341);
					expr();
					}
					break;
				}
				setState(344);
				match(T__33);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(345);
							expr();
							}
							} 
						}
						setState(350);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(351);
					match(T__3);
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(352);
						expr();
						}
						}
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(358);
					match(T__24);
					}
					break;
				case 3:
					{
					setState(359);
					match(T__22);
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
						{
						{
						setState(360);
						expr();
						}
						}
						setState(365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(366);
					match(T__23);
					}
					break;
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(T__7);
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 11:
				_localctx = new Metodo11Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(376);
				operacion();
				{
				setState(377);
				expr();
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						operacion();
						setState(379);
						expr();
						}
						} 
					}
					setState(385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(386);
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
				setState(389);
				match(T__34);
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(390);
					match(ID);
					}
					break;
				case 2:
					{
					setState(391);
					expr();
					}
					break;
				}
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(394);
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
				setState(397);
				match(T__29);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(398);
					expr();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
				match(T__30);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(405);
					match(T__3);
					}
					break;
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(408);
						expr();
						}
						} 
					}
					setState(413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(414);
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
				setState(417);
				match(T__29);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(418);
					expr();
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				match(T__30);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(425);
					match(T__3);
					}
					break;
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					{
					setState(428);
					expr();
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(434);
					match(T__24);
					}
				}

				setState(437);
				match(T__31);
				setState(439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(438);
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
				setState(441);
				match(T__22);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(442);
					match(Not);
					}
				}

				setState(447);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(445);
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
					setState(446);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(449);
				match(T__23);
				setState(450);
				match(T__35);
				setState(451);
				match(ID);
				setState(452);
				punto();
				setState(453);
				metodo();
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(454);
						punto();
						setState(455);
						metodo();
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(462);
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
				setState(465);
				match(T__22);
				setState(466);
				match(T__32);
				setState(467);
				match(ID);
				setState(468);
				match(T__20);
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(469);
					tipoVariable();
					}
					break;
				case 2:
					{
					setState(470);
					expr();
					}
					break;
				}
				setState(473);
				match(T__33);
				setState(474);
				metodo();
				setState(475);
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
		"\u0004\u00010\u01e0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\t\u0001\t\u0003\tL\b\t\u0001\t\u0001\t\u0003\tP\b\t\u0001\t\u0003\tS"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nY\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b`\b\u000b\u0001\u000b"+
		"\u0003\u000bc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000bi\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000bq\b\u000b\n\u000b\f\u000bt\t\u000b"+
		"\u0001\u000b\u0003\u000bw\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u007f\b\u000b\n\u000b"+
		"\f\u000b\u0082\t\u000b\u0001\u000b\u0003\u000b\u0085\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u008d\b\u000b\n\u000b\f\u000b\u0090\t\u000b\u0001\u000b\u0003\u000b\u0093"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0099"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00a2\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ae\b\f\n"+
		"\f\f\f\u00b1\t\f\u0003\f\u00b3\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ba\b\f\u0001\f\u0005\f\u00bd\b\f\n\f\f\f\u00c0\t\f\u0001"+
		"\f\u0003\f\u00c3\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00cd\b\f\n\f\f\f\u00d0\t\f\u0003\f\u00d2\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d8\b\f\u0001\f\u0005\f\u00db\b\f"+
		"\n\f\f\f\u00de\t\f\u0001\f\u0001\f\u0003\f\u00e2\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00e6\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ec\b\f\u0001\f"+
		"\u0005\f\u00ef\b\f\n\f\f\f\u00f2\t\f\u0001\f\u0001\f\u0005\f\u00f6\b\f"+
		"\n\f\f\f\u00f9\t\f\u0001\f\u0001\f\u0005\f\u00fd\b\f\n\f\f\f\u0100\t\f"+
		"\u0001\f\u0001\f\u0005\f\u0104\b\f\n\f\f\f\u0107\t\f\u0001\f\u0005\f\u010a"+
		"\b\f\n\f\f\f\u010d\t\f\u0001\f\u0003\f\u0110\b\f\u0001\f\u0001\f\u0005"+
		"\f\u0114\b\f\n\f\f\f\u0117\t\f\u0001\f\u0001\f\u0005\f\u011b\b\f\n\f\f"+
		"\f\u011e\t\f\u0001\f\u0001\f\u0003\f\u0122\b\f\u0001\f\u0001\f\u0005\f"+
		"\u0126\b\f\n\f\f\f\u0129\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u012e\b\f"+
		"\n\f\f\f\u0131\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u0136\b\f\n\f\f\f\u0139"+
		"\t\f\u0001\f\u0001\f\u0005\f\u013d\b\f\n\f\f\f\u0140\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0148\b\f\n\f\f\f\u014b\t\f"+
		"\u0001\f\u0003\f\u014e\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0157\b\f\u0001\f\u0001\f\u0005\f\u015b\b\f\n\f\f\f"+
		"\u015e\t\f\u0001\f\u0001\f\u0005\f\u0162\b\f\n\f\f\f\u0165\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u016a\b\f\n\f\f\f\u016d\t\f\u0001\f\u0003\f\u0170"+
		"\b\f\u0001\f\u0005\f\u0173\b\f\n\f\f\f\u0176\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u017e\b\f\n\f\f\f\u0181\t\f\u0001\f"+
		"\u0003\f\u0184\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0189\b\f\u0001\f\u0003"+
		"\f\u018c\b\f\u0001\f\u0001\f\u0005\f\u0190\b\f\n\f\f\f\u0193\t\f\u0001"+
		"\f\u0001\f\u0003\f\u0197\b\f\u0001\f\u0005\f\u019a\b\f\n\f\f\f\u019d\t"+
		"\f\u0001\f\u0003\f\u01a0\b\f\u0001\f\u0001\f\u0005\f\u01a4\b\f\n\f\f\f"+
		"\u01a7\t\f\u0001\f\u0001\f\u0003\f\u01ab\b\f\u0001\f\u0005\f\u01ae\b\f"+
		"\n\f\f\f\u01b1\t\f\u0001\f\u0003\f\u01b4\b\f\u0001\f\u0001\f\u0003\f\u01b8"+
		"\b\f\u0001\f\u0001\f\u0003\f\u01bc\b\f\u0001\f\u0001\f\u0003\f\u01c0\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u01ca\b\f\n\f\f\f\u01cd\t\f\u0001\f\u0003\f\u01d0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01d8\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u01de\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0005\u0002\u0000\u0001"+
		"\u0001%%\u0001\u0000\n\u0012\u0002\u0000\u0005\u0005\u0019\u0019\u0002"+
		"\u0000%%\'\'\u0001\u0000%&\u0236\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"\u001f\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u00060"+
		"\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f7\u0001\u0000\u0000\u0000\u000e9\u0001\u0000\u0000\u0000\u0010"+
		"=\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014X\u0001"+
		"\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u01dd\u0001"+
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
		"\b\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BS\u0001"+
		"\u0000\u0000\u0000CE\u0005\'\u0000\u0000DF\u0005\b\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FS\u0001\u0000\u0000\u0000"+
		"GS\u0003\u0016\u000b\u0000HS\u0003\u0018\f\u0000IK\u0005/\u0000\u0000"+
		"JL\u0005\b\u0000\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LS\u0001\u0000\u0000\u0000MO\u0005&\u0000\u0000NP\u0005\b\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000"+
		"\u0000QS\u0003\u000e\u0007\u0000R?\u0001\u0000\u0000\u0000RC\u0001\u0000"+
		"\u0000\u0000RG\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000\u0000RI\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"S\u0013\u0001\u0000\u0000\u0000TU\u0005\u0013\u0000\u0000UY\u0003\u0000"+
		"\u0000\u0000VW\u0005\u0014\u0000\u0000WY\u0003\u000e\u0007\u0000XT\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\u0015\u0001\u0000\u0000"+
		"\u0000Z[\u0005%\u0000\u0000[\\\u0005\u0015\u0000\u0000\\_\u0003\u0000"+
		"\u0000\u0000]^\u0005\u0016\u0000\u0000^`\u0003\u0012\t\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000ac\u0003"+
		"\f\u0006\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u00a2"+
		"\u0001\u0000\u0000\u0000de\u0005%\u0000\u0000ef\u0005\u0016\u0000\u0000"+
		"fh\u0005%\u0000\u0000gi\u0005\b\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u00a2\u0001\u0000\u0000\u0000jk\u0005%\u0000"+
		"\u0000kl\u0005\u0016\u0000\u0000lr\u0003\u0014\n\u0000mn\u0003\n\u0005"+
		"\u0000no\u0003\u0018\f\u0000oq\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0003"+
		"\f\u0006\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u00a2"+
		"\u0001\u0000\u0000\u0000xy\u0005%\u0000\u0000yz\u0005\u0016\u0000\u0000"+
		"z\u0080\u0003\u0018\f\u0000{|\u0003\u0010\b\u0000|}\u0003\u0018\f\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0003\f\u0006\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u00a2\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005%\u0000\u0000\u0087\u0088\u0005\u0016\u0000"+
		"\u0000\u0088\u008e\u0005%\u0000\u0000\u0089\u008a\u0003\u0010\b\u0000"+
		"\u008a\u008b\u0003\u0018\f\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u0089\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0093\u0003\f\u0006\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u00a2\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005%\u0000\u0000\u0095\u0096\u0005\u0016\u0000\u0000\u0096\u0098\u0003"+
		"\u0012\t\u0000\u0097\u0099\u0003\f\u0006\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u00a2\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005%\u0000\u0000\u009b\u009c\u0005\u0016\u0000"+
		"\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0003\u0012\t\u0000"+
		"\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0003\u000e\u0007\u0000\u00a1Z\u0001\u0000\u0000\u0000\u00a1"+
		"d\u0001\u0000\u0000\u0000\u00a1j\u0001\u0000\u0000\u0000\u00a1x\u0001"+
		"\u0000\u0000\u0000\u00a1\u0086\u0001\u0000\u0000\u0000\u00a1\u0094\u0001"+
		"\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"%\u0000\u0000\u00a4\u00b2\u0005\u0017\u0000\u0000\u00a5\u00a6\u0005%\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00af\u0003\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0003\b\u0004\u0000\u00a9\u00aa\u0005%\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0015\u0000\u0000\u00ab\u00ac\u0003\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00a5\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u0018\u0000\u0000\u00b5\u00b6\u0005\u0015\u0000\u0000"+
		"\u00b6\u00b7\u0003\u0000\u0000\u0000\u00b7\u00b9\u0005\u0004\u0000\u0000"+
		"\u00b8\u00ba\u0005\u0004\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00be\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0003\u0012\t\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005\u0019\u0000\u0000\u00c2"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0002\u0000\u0000\u00c5"+
		"\u01de\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005%\u0000\u0000\u00c7\u00d1"+
		"\u0005\u0017\u0000\u0000\u00c8\u00ce\u0003\u0012\t\u0000\u00c9\u00ca\u0003"+
		"\b\u0004\u0000\u00ca\u00cb\u0003\u0012\t\u0000\u00cb\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d7\u0005\u0018"+
		"\u0000\u0000\u00d4\u00d5\u0003\n\u0005\u0000\u00d5\u00d6\u0003\u0018\f"+
		"\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00dc\u0001\u0000\u0000"+
		"\u0000\u00d9\u00db\u0005\b\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u01de\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e1\u0005\u0017\u0000\u0000"+
		"\u00e0\u00e2\u00050\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0003\u0014\n\u0000\u00e4\u00e6\u0003\u0012\t\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00eb\u0005\u0018\u0000\u0000\u00e8\u00e9"+
		"\u0003\n\u0005\u0000\u00e9\u00ea\u0003\u0018\f\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005"+
		"\b\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u01de\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f7\u0005\u001a\u0000\u0000\u00f4\u00f6\u0003\u0012"+
		"\t\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fe\u0005\u001b\u0000\u0000\u00fb\u00fd\u0003\u0012\t\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u0105\u0005\u001c\u0000\u0000\u0102\u0104\u0003\u0012\t\u0000\u0103"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u010b\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u0005\u001d\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0005\b\u0000\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u01de"+
		"\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u001e\u0000\u0000\u0112\u0114"+
		"\u0003\u0012\t\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u011c\u0005\u001f\u0000\u0000\u0119\u011b\u0003"+
		"\u0012\t\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0005 \u0000\u0000\u0120\u0122\u0005\b\u0000"+
		"\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u01de\u0001\u0000\u0000\u0000\u0123\u0127\u0005\u0004\u0000"+
		"\u0000\u0124\u0126\u0003\u0012\t\u0000\u0125\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u01de\u0005\u0005\u0000\u0000"+
		"\u012b\u012f\u0005\u0004\u0000\u0000\u012c\u012e\u0003\u0012\t\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132"+
		"\u01de\u0005\u0019\u0000\u0000\u0133\u0137\u0005\u0017\u0000\u0000\u0134"+
		"\u0136\u0003\u0012\t\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013e\u0005\u0018\u0000\u0000\u013b\u013d"+
		"\u0005\b\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u01de\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0007\u0003\u0000\u0000\u0142\u0143\u0003"+
		"\n\u0005\u0000\u0143\u0149\u0003\u0018\f\u0000\u0144\u0145\u0003\n\u0005"+
		"\u0000\u0145\u0146\u0003\u0018\f\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0005\b\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e\u01de\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005!\u0000\u0000\u0150\u0151\u0005%\u0000\u0000\u0151\u0156\u0005"+
		"\u0015\u0000\u0000\u0152\u0157\u0003\u0000\u0000\u0000\u0153\u0154\u0005"+
		"%\u0000\u0000\u0154\u0155\u0005\u0016\u0000\u0000\u0155\u0157\u0003\u0012"+
		"\t\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u016f\u0005\"\u0000\u0000"+
		"\u0159\u015b\u0003\u0012\t\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b"+
		"\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0001\u0000\u0000\u0000\u015d\u0170\u0001\u0000\u0000\u0000\u015e"+
		"\u015c\u0001\u0000\u0000\u0000\u015f\u0163\u0005\u0004\u0000\u0000\u0160"+
		"\u0162\u0003\u0012\t\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165"+
		"\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0166\u0170\u0005\u0019\u0000\u0000\u0167\u016b"+
		"\u0005\u0017\u0000\u0000\u0168\u016a\u0003\u0012\t\u0000\u0169\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0170\u0005"+
		"\u0018\u0000\u0000\u016f\u015c\u0001\u0000\u0000\u0000\u016f\u015f\u0001"+
		"\u0000\u0000\u0000\u016f\u0167\u0001\u0000\u0000\u0000\u0170\u0174\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u0005\b\u0000\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u01de\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0178\u0007\u0004"+
		"\u0000\u0000\u0178\u0179\u0003\u0010\b\u0000\u0179\u017f\u0003\u0012\t"+
		"\u0000\u017a\u017b\u0003\u0010\b\u0000\u017b\u017c\u0003\u0012\t\u0000"+
		"\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000"+
		"\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0184\u0005\b\u0000\u0000\u0183"+
		"\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u01de\u0001\u0000\u0000\u0000\u0185\u0188\u0005#\u0000\u0000\u0186\u0189"+
		"\u0005%\u0000\u0000\u0187\u0189\u0003\u0012\t\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018b\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0005\b\u0000\u0000\u018b\u018a\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u01de\u0001\u0000"+
		"\u0000\u0000\u018d\u0191\u0005\u001e\u0000\u0000\u018e\u0190\u0003\u0012"+
		"\t\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0196\u0005\u001f\u0000\u0000\u0195\u0197\u0005\u0004\u0000"+
		"\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u019b\u0001\u0000\u0000\u0000\u0198\u019a\u0003\u0012\t\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"+
		"\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000"+
		"\u019e\u01a0\u0005\u0019\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01de\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a5\u0005\u001e\u0000\u0000\u01a2\u01a4\u0003\u0012\t\u0000\u01a3"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8"+
		"\u01aa\u0005\u001f\u0000\u0000\u01a9\u01ab\u0005\u0004\u0000\u0000\u01aa"+
		"\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01af\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003\u0012\t\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0005\u0019\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7"+
		"\u0005 \u0000\u0000\u01b6\u01b8\u0005\b\u0000\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01de\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bb\u0005\u0017\u0000\u0000\u01ba\u01bc\u0005"+
		"0\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01c0\u0003\u0014"+
		"\n\u0000\u01be\u01c0\u0003\u0012\t\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\u0018\u0000\u0000\u01c2\u01c3\u0005$\u0000\u0000"+
		"\u01c3\u01c4\u0005%\u0000\u0000\u01c4\u01c5\u0003\n\u0005\u0000\u01c5"+
		"\u01cb\u0003\u0018\f\u0000\u01c6\u01c7\u0003\n\u0005\u0000\u01c7\u01c8"+
		"\u0003\u0018\f\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c6\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d0\u0005"+
		"\b\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01de\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0017"+
		"\u0000\u0000\u01d2\u01d3\u0005!\u0000\u0000\u01d3\u01d4\u0005%\u0000\u0000"+
		"\u01d4\u01d7\u0005\u0015\u0000\u0000\u01d5\u01d8\u0003\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0003\u0012\t\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0005\"\u0000\u0000\u01da\u01db\u0003\u0018\f\u0000\u01db\u01dc"+
		"\u0005\u0018\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u00a3"+
		"\u0001\u0000\u0000\u0000\u01dd\u00c6\u0001\u0000\u0000\u0000\u01dd\u00df"+
		"\u0001\u0000\u0000\u0000\u01dd\u00f3\u0001\u0000\u0000\u0000\u01dd\u0111"+
		"\u0001\u0000\u0000\u0000\u01dd\u0123\u0001\u0000\u0000\u0000\u01dd\u012b"+
		"\u0001\u0000\u0000\u0000\u01dd\u0133\u0001\u0000\u0000\u0000\u01dd\u0141"+
		"\u0001\u0000\u0000\u0000\u01dd\u014f\u0001\u0000\u0000\u0000\u01dd\u0177"+
		"\u0001\u0000\u0000\u0000\u01dd\u0185\u0001\u0000\u0000\u0000\u01dd\u018d"+
		"\u0001\u0000\u0000\u0000\u01dd\u01a1\u0001\u0000\u0000\u0000\u01dd\u01b9"+
		"\u0001\u0000\u0000\u0000\u01dd\u01d1\u0001\u0000\u0000\u0000\u01de\u0019"+
		"\u0001\u0000\u0000\u0000J\u001f&.0;AEKORX_bhrv\u0080\u0084\u008e\u0092"+
		"\u0098\u00a1\u00af\u00b2\u00b9\u00be\u00c2\u00ce\u00d1\u00d7\u00dc\u00e1"+
		"\u00e5\u00eb\u00f0\u00f7\u00fe\u0105\u010b\u010f\u0115\u011c\u0121\u0127"+
		"\u012f\u0137\u013e\u0149\u014d\u0156\u015c\u0163\u016b\u016f\u0174\u017f"+
		"\u0183\u0188\u018b\u0191\u0196\u019b\u019f\u01a5\u01aa\u01af\u01b3\u01b7"+
		"\u01bb\u01bf\u01cb\u01cf\u01d7\u01dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}