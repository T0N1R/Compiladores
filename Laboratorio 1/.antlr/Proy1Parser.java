// Generated from c:\Users\toni\Desktop\COMPIS\git\Compiladores\Laboratorio 1\Proy1.g4 by ANTLR 4.9.2
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
	}
	public static class Tipo_correcto_7Context extends DeclararAtributoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Tipo_correcto_7Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
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
	}
	public static class Metodo4Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo4Context(MetodoContext ctx) { copyFrom(ctx); }
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
	}
	public static class Metodo8Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo8Context(MetodoContext ctx) { copyFrom(ctx); }
	}
	public static class Metodo12Context extends MetodoContext {
		public TerminalNode ID() { return getToken(Proy1Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Metodo12Context(MetodoContext ctx) { copyFrom(ctx); }
	}
	public static class Metodo7Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo7Context(MetodoContext ctx) { copyFrom(ctx); }
	}
	public static class Metodo6Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo6Context(MetodoContext ctx) { copyFrom(ctx); }
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
	}
	public static class Metodo13Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo13Context(MetodoContext ctx) { copyFrom(ctx); }
	}
	public static class Metodo14Context extends MetodoContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Metodo14Context(MetodoContext ctx) { copyFrom(ctx); }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\7\3$\n"+
		"\3\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7"+
		"\5\65\n\5\f\5\16\58\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nD"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fO\n\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16W\n\16\3\17\3\17\3\17\3\17\3\17\5\17^\n\17\3\17\5\17a\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17i\n\17\f\17\16\17l\13\17\3\17\5"+
		"\17o\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17w\n\17\f\17\16\17z\13\17\3"+
		"\17\5\17}\n\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0085\n\17\f\17\16\17"+
		"\u0088\13\17\3\17\5\17\u008b\n\17\3\17\3\17\3\17\3\17\5\17\u0091\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a6\n\20\f\20\16\20\u00a9\13\20"+
		"\5\20\u00ab\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\7\20\u00b5"+
		"\n\20\f\20\16\20\u00b8\13\20\3\20\5\20\u00bb\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8\13\20\5\20\u00ca"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\20\7\20\u00d3\n\20\f\20\16"+
		"\20\u00d6\13\20\3\20\3\20\5\20\u00da\n\20\3\20\3\20\5\20\u00de\n\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00e4\n\20\3\20\7\20\u00e7\n\20\f\20\16\20\u00ea"+
		"\13\20\3\20\3\20\7\20\u00ee\n\20\f\20\16\20\u00f1\13\20\3\20\3\20\7\20"+
		"\u00f5\n\20\f\20\16\20\u00f8\13\20\3\20\3\20\7\20\u00fc\n\20\f\20\16\20"+
		"\u00ff\13\20\3\20\7\20\u0102\n\20\f\20\16\20\u0105\13\20\3\20\5\20\u0108"+
		"\n\20\3\20\3\20\7\20\u010c\n\20\f\20\16\20\u010f\13\20\3\20\3\20\7\20"+
		"\u0113\n\20\f\20\16\20\u0116\13\20\3\20\3\20\5\20\u011a\n\20\3\20\3\20"+
		"\7\20\u011e\n\20\f\20\16\20\u0121\13\20\3\20\3\20\3\20\7\20\u0126\n\20"+
		"\f\20\16\20\u0129\13\20\3\20\3\20\3\20\7\20\u012e\n\20\f\20\16\20\u0131"+
		"\13\20\3\20\3\20\7\20\u0135\n\20\f\20\16\20\u0138\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0140\n\20\f\20\16\20\u0143\13\20\3\20\5\20\u0146"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u014d\n\20\3\20\3\20\7\20\u0151\n"+
		"\20\f\20\16\20\u0154\13\20\3\20\3\20\7\20\u0158\n\20\f\20\16\20\u015b"+
		"\13\20\3\20\3\20\3\20\7\20\u0160\n\20\f\20\16\20\u0163\13\20\3\20\5\20"+
		"\u0166\n\20\3\20\7\20\u0169\n\20\f\20\16\20\u016c\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0174\n\20\f\20\16\20\u0177\13\20\3\20\5\20\u017a"+
		"\n\20\3\20\3\20\3\20\5\20\u017f\n\20\3\20\5\20\u0182\n\20\3\20\3\20\7"+
		"\20\u0186\n\20\f\20\16\20\u0189\13\20\3\20\3\20\5\20\u018d\n\20\3\20\7"+
		"\20\u0190\n\20\f\20\16\20\u0193\13\20\3\20\5\20\u0196\n\20\3\20\3\20\7"+
		"\20\u019a\n\20\f\20\16\20\u019d\13\20\3\20\3\20\5\20\u01a1\n\20\3\20\7"+
		"\20\u01a4\n\20\f\20\16\20\u01a7\13\20\3\20\5\20\u01aa\n\20\3\20\3\20\5"+
		"\20\u01ae\n\20\3\20\3\20\5\20\u01b2\n\20\3\20\3\20\5\20\u01b6\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01c0\n\20\f\20\16\20\u01c3\13"+
		"\20\3\20\5\20\u01c6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01ce\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u01d4\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\b\4\2\3\3**\3\2\b\t\3\2\16\26\4\2\7\7\36\36\4\2*"+
		"*,,\3\2*+\2\u0224\2 \3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b\66\3\2\2\2\n9\3\2"+
		"\2\2\f;\3\2\2\2\16=\3\2\2\2\20?\3\2\2\2\22A\3\2\2\2\24E\3\2\2\2\26N\3"+
		"\2\2\2\30P\3\2\2\2\32V\3\2\2\2\34\u0099\3\2\2\2\36\u01d3\3\2\2\2 !\t\2"+
		"\2\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&"+
		"\5\3\2\2\2\'%\3\2\2\2()\7\4\2\2),\7*\2\2*+\7\5\2\2+-\5\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\60\5\b\5\2\60\61\7\7\2\2\61\7\3\2\2\2"+
		"\62\65\5\34\17\2\63\65\5\36\20\2\64\62\3\2\2\2\64\63\3\2\2\2\658\3\2\2"+
		"\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28\66\3\2\2\29:\t\3\2\2:\13"+
		"\3\2\2\2;<\7\n\2\2<\r\3\2\2\2=>\7\13\2\2>\17\3\2\2\2?@\7\f\2\2@\21\3\2"+
		"\2\2AC\7\r\2\2BD\7\f\2\2CB\3\2\2\2CD\3\2\2\2D\23\3\2\2\2EF\t\4\2\2F\25"+
		"\3\2\2\2GO\7*\2\2HO\7,\2\2IO\5\34\17\2JO\5\36\20\2KO\5\n\6\2LO\7+\2\2"+
		"MO\5\22\n\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2"+
		"\2NM\3\2\2\2O\27\3\2\2\2PQ\7\27\2\2Q\31\3\2\2\2RS\7\30\2\2SW\5\2\2\2T"+
		"U\7\31\2\2UW\5\22\n\2VR\3\2\2\2VT\3\2\2\2W\33\3\2\2\2XY\7*\2\2YZ\7\32"+
		"\2\2Z]\5\2\2\2[\\\7\33\2\2\\^\5\26\f\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_"+
		"a\5\20\t\2`_\3\2\2\2`a\3\2\2\2a\u009a\3\2\2\2bc\7*\2\2cd\7\33\2\2dj\5"+
		"\32\16\2ef\5\16\b\2fg\5\36\20\2gi\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2o\u009a"+
		"\3\2\2\2pq\7*\2\2qr\7\33\2\2rx\5\36\20\2st\5\24\13\2tu\5\36\20\2uw\3\2"+
		"\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\5\20"+
		"\t\2|{\3\2\2\2|}\3\2\2\2}\u009a\3\2\2\2~\177\7*\2\2\177\u0080\7\33\2\2"+
		"\u0080\u0086\7*\2\2\u0081\u0082\5\24\13\2\u0082\u0083\5\36\20\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008b\5\20\t\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u009a\3"+
		"\2\2\2\u008c\u008d\7*\2\2\u008d\u008e\7\33\2\2\u008e\u0090\5\26\f\2\u008f"+
		"\u0091\5\20\t\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a\3"+
		"\2\2\2\u0092\u0093\7*\2\2\u0093\u0094\7\33\2\2\u0094\u0095\7\6\2\2\u0095"+
		"\u0096\5\26\f\2\u0096\u0097\7\7\2\2\u0097\u009a\3\2\2\2\u0098\u009a\5"+
		"\22\n\2\u0099X\3\2\2\2\u0099b\3\2\2\2\u0099p\3\2\2\2\u0099~\3\2\2\2\u0099"+
		"\u008c\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35\3\2\2"+
		"\2\u009b\u009c\7*\2\2\u009c\u00aa\7\34\2\2\u009d\u009e\7*\2\2\u009e\u009f"+
		"\7\32\2\2\u009f\u00a7\5\2\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7*\2\2\u00a2"+
		"\u00a3\7\32\2\2\u00a3\u00a4\5\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3"+
		"\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u009d\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\35\2\2\u00ad\u00ae\7\32\2\2\u00ae"+
		"\u00af\5\2\2\2\u00af\u00b1\7\6\2\2\u00b0\u00b2\7\6\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b5\5\26\f\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\36\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\t\5"+
		"\2\2\u00bd\u01d4\3\2\2\2\u00be\u00bf\7*\2\2\u00bf\u00c9\7\34\2\2\u00c0"+
		"\u00c6\5\26\f\2\u00c1\u00c2\5\f\7\2\u00c2\u00c3\5\26\f\2\u00c3\u00c5\3"+
		"\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c0\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\7\35\2\2\u00cc"+
		"\u00cd\5\16\b\2\u00cd\u00ce\5\36\20\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\7\f\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u01d4\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\34\2\2\u00d8"+
		"\u00da\5\30\r\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00de\5\32\16\2\u00dc\u00de\5\26\f\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\7\35\2\2\u00e0\u00e1"+
		"\5\16\b\2\u00e1\u00e2\5\36\20\2\u00e2\u00e4\3\2\2\2\u00e3\u00e0\3\2\2"+
		"\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\7\f\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u01d4\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\7\37\2\2\u00ec\u00ee\5"+
		"\26\f\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\7 "+
		"\2\2\u00f3\u00f5\5\26\f\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fd\7!\2\2\u00fa\u00fc\5\26\f\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\7\"\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\f\2\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u01d4\3\2\2\2\u0109\u010d\7#\2\2\u010a\u010c\5\26"+
		"\f\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0114\7$"+
		"\2\2\u0111\u0113\5\26\f\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0119\7%\2\2\u0118\u011a\7\f\2\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u01d4\3\2\2\2\u011b\u011f\7\6\2\2\u011c\u011e\5\26"+
		"\f\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u01d4\7\7"+
		"\2\2\u0123\u0127\7\6\2\2\u0124\u0126\5\26\f\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u01d4\7\36\2\2\u012b\u012f\7\34\2\2\u012c"+
		"\u012e\5\26\f\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0136\7\35\2\2\u0133\u0135\7\f\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3"+
		"\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u01d4\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\t\6\2\2\u013a\u013b\5\16\b\2\u013b\u0141\5"+
		"\36\20\2\u013c\u013d\5\16\b\2\u013d\u013e\5\36\20\2\u013e\u0140\3\2\2"+
		"\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0146\7\f\2\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u01d4\3\2\2\2\u0147\u0148\7&"+
		"\2\2\u0148\u0149\7*\2\2\u0149\u014c\7\32\2\2\u014a\u014d\5\2\2\2\u014b"+
		"\u014d\5\26\f\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u0165\7\'\2\2\u014f\u0151\5\26\f\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0166\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0159\7\6\2\2\u0156\u0158\5\26\f\2\u0157"+
		"\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0166\7\36\2\2\u015d"+
		"\u0161\7\34\2\2\u015e\u0160\5\26\f\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0166\7\35\2\2\u0165\u0152\3\2\2\2\u0165\u0155\3"+
		"\2\2\2\u0165\u015d\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0169\7\f\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u01d4\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\t\7\2\2\u016e"+
		"\u016f\5\24\13\2\u016f\u0175\5\26\f\2\u0170\u0171\5\24\13\2\u0171\u0172"+
		"\5\26\f\2\u0172\u0174\3\2\2\2\u0173\u0170\3\2\2\2\u0174\u0177\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0178\u017a\7\f\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u01d4\3\2\2\2\u017b\u017e\7(\2\2\u017c\u017f\7*\2\2\u017d\u017f\5\26"+
		"\f\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u0182\7\f\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u01d4\3\2"+
		"\2\2\u0183\u0187\7#\2\2\u0184\u0186\5\26\f\2\u0185\u0184\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018c\7$\2\2\u018b\u018d\7\6\2\2\u018c"+
		"\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191\3\2\2\2\u018e\u0190\5\26"+
		"\f\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7\36"+
		"\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u01d4\3\2\2\2\u0197"+
		"\u019b\7#\2\2\u0198\u019a\5\26\f\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a0\7$\2\2\u019f\u01a1\7\6\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\3\2\2\2\u01a2\u01a4\5\26\f\2\u01a3"+
		"\u01a2\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01aa\7\36\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7%"+
		"\2\2\u01ac\u01ae\7\f\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01d4\3\2\2\2\u01af\u01b1\7\34\2\2\u01b0\u01b2\5\30\r\2\u01b1\u01b0\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b6\5\32\16\2\u01b4"+
		"\u01b6\5\26\f\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3"+
		"\2\2\2\u01b7\u01b8\7\35\2\2\u01b8\u01b9\7)\2\2\u01b9\u01ba\7*\2\2\u01ba"+
		"\u01bb\5\16\b\2\u01bb\u01c1\5\36\20\2\u01bc\u01bd\5\16\b\2\u01bd\u01be"+
		"\5\36\20\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0\u01c3\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c4\u01c6\7\f\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01d4\3\2\2\2\u01c7\u01c8\7\34\2\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\7*"+
		"\2\2\u01ca\u01cd\7\32\2\2\u01cb\u01ce\5\2\2\2\u01cc\u01ce\5\26\f\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\7\'"+
		"\2\2\u01d0\u01d1\5\36\20\2\u01d1\u01d2\7\35\2\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u009b\3\2\2\2\u01d3\u00be\3\2\2\2\u01d3\u00d7\3\2\2\2\u01d3\u00eb\3\2"+
		"\2\2\u01d3\u0109\3\2\2\2\u01d3\u011b\3\2\2\2\u01d3\u0123\3\2\2\2\u01d3"+
		"\u012b\3\2\2\2\u01d3\u0139\3\2\2\2\u01d3\u0147\3\2\2\2\u01d3\u016d\3\2"+
		"\2\2\u01d3\u017b\3\2\2\2\u01d3\u0183\3\2\2\2\u01d3\u0197\3\2\2\2\u01d3"+
		"\u01af\3\2\2\2\u01d3\u01c7\3\2\2\2\u01d4\37\3\2\2\2G%,\64\66CNV]`jnx|"+
		"\u0086\u008a\u0090\u0099\u00a7\u00aa\u00b1\u00b6\u00ba\u00c6\u00c9\u00cf"+
		"\u00d4\u00d9\u00dd\u00e3\u00e8\u00ef\u00f6\u00fd\u0103\u0107\u010d\u0114"+
		"\u0119\u011f\u0127\u012f\u0136\u0141\u0145\u014c\u0152\u0159\u0161\u0165"+
		"\u016a\u0175\u0179\u017e\u0181\u0187\u018c\u0191\u0195\u019b\u01a0\u01a5"+
		"\u01a9\u01ad\u01b1\u01b5\u01c1\u01c5\u01cd\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}