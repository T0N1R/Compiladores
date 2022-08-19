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
		public TerminalNode Not() { return getToken(Proy1Parser.Not, 0); }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u01d0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\7\3 \n\3\f\3\16\3#\13\3\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t>\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13I\n\13\3\f\3\f\3\f\3\f\5\fO\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\rV\n\r\3\r\5\rY\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\ra\n\r\f\r\16\r"+
		"d\13\r\3\r\5\rg\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\ro\n\r\f\r\16\rr\13\r\3"+
		"\r\5\ru\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\r\5"+
		"\r\u0083\n\r\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0092\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u009e\n\16\f\16\16\16\u00a1\13\16\5\16\u00a3\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00aa\n\16\3\16\7\16\u00ad\n\16\f\16\16\16\u00b0\13\16\3\16"+
		"\5\16\u00b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00bd\n"+
		"\16\f\16\16\16\u00c0\13\16\5\16\u00c2\n\16\3\16\3\16\3\16\3\16\5\16\u00c8"+
		"\n\16\3\16\7\16\u00cb\n\16\f\16\16\16\u00ce\13\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\3\16\3\16\5\16\u00dc\n\16\3"+
		"\16\7\16\u00df\n\16\f\16\16\16\u00e2\13\16\3\16\3\16\7\16\u00e6\n\16\f"+
		"\16\16\16\u00e9\13\16\3\16\3\16\7\16\u00ed\n\16\f\16\16\16\u00f0\13\16"+
		"\3\16\3\16\7\16\u00f4\n\16\f\16\16\16\u00f7\13\16\3\16\7\16\u00fa\n\16"+
		"\f\16\16\16\u00fd\13\16\3\16\5\16\u0100\n\16\3\16\3\16\7\16\u0104\n\16"+
		"\f\16\16\16\u0107\13\16\3\16\3\16\7\16\u010b\n\16\f\16\16\16\u010e\13"+
		"\16\3\16\3\16\5\16\u0112\n\16\3\16\3\16\7\16\u0116\n\16\f\16\16\16\u0119"+
		"\13\16\3\16\3\16\3\16\7\16\u011e\n\16\f\16\16\16\u0121\13\16\3\16\3\16"+
		"\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3\16\3\16\7\16\u012d\n\16"+
		"\f\16\16\16\u0130\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0138\n\16"+
		"\f\16\16\16\u013b\13\16\3\16\5\16\u013e\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0147\n\16\3\16\3\16\7\16\u014b\n\16\f\16\16\16\u014e"+
		"\13\16\3\16\3\16\7\16\u0152\n\16\f\16\16\16\u0155\13\16\3\16\3\16\3\16"+
		"\7\16\u015a\n\16\f\16\16\16\u015d\13\16\3\16\5\16\u0160\n\16\3\16\7\16"+
		"\u0163\n\16\f\16\16\16\u0166\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u016e\n\16\f\16\16\16\u0171\13\16\3\16\5\16\u0174\n\16\3\16\3\16\3\16"+
		"\5\16\u0179\n\16\3\16\5\16\u017c\n\16\3\16\3\16\7\16\u0180\n\16\f\16\16"+
		"\16\u0183\13\16\3\16\3\16\5\16\u0187\n\16\3\16\7\16\u018a\n\16\f\16\16"+
		"\16\u018d\13\16\3\16\5\16\u0190\n\16\3\16\3\16\7\16\u0194\n\16\f\16\16"+
		"\16\u0197\13\16\3\16\3\16\5\16\u019b\n\16\3\16\7\16\u019e\n\16\f\16\16"+
		"\16\u01a1\13\16\3\16\5\16\u01a4\n\16\3\16\3\16\5\16\u01a8\n\16\3\16\3"+
		"\16\5\16\u01ac\n\16\3\16\3\16\5\16\u01b0\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u01ba\n\16\f\16\16\16\u01bd\13\16\3\16\5\16\u01c0"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01c8\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u01ce\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\4\2"+
		"\3\3\'\'\3\2\f\24\4\2\7\7\33\33\4\2\'\'))\3\2\'(\2\u0220\2\34\3\2\2\2"+
		"\4!\3\2\2\2\6$\3\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\169\3\2"+
		"\2\2\20;\3\2\2\2\22?\3\2\2\2\24H\3\2\2\2\26N\3\2\2\2\30\u0091\3\2\2\2"+
		"\32\u01cd\3\2\2\2\34\35\t\2\2\2\35\3\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2"+
		" #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2$%\7\4\2\2%(\7"+
		"\'\2\2&\'\7\5\2\2\')\5\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\6\2\2+"+
		",\5\b\5\2,-\7\7\2\2-\7\3\2\2\2.\61\5\30\r\2/\61\5\32\16\2\60.\3\2\2\2"+
		"\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\t\3\2\2\2\64"+
		"\62\3\2\2\2\65\66\7\b\2\2\66\13\3\2\2\2\678\7\t\2\28\r\3\2\2\29:\7\n\2"+
		"\2:\17\3\2\2\2;=\7\13\2\2<>\7\n\2\2=<\3\2\2\2=>\3\2\2\2>\21\3\2\2\2?@"+
		"\t\3\2\2@\23\3\2\2\2AI\7\'\2\2BI\7)\2\2CI\5\30\r\2DI\5\32\16\2EI\7\61"+
		"\2\2FI\7(\2\2GI\5\20\t\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2"+
		"\2\2HF\3\2\2\2HG\3\2\2\2I\25\3\2\2\2JK\7\25\2\2KO\5\2\2\2LM\7\26\2\2M"+
		"O\5\20\t\2NJ\3\2\2\2NL\3\2\2\2O\27\3\2\2\2PQ\7\'\2\2QR\7\27\2\2RU\5\2"+
		"\2\2ST\7\30\2\2TV\5\24\13\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5\16\b\2X"+
		"W\3\2\2\2XY\3\2\2\2Y\u0092\3\2\2\2Z[\7\'\2\2[\\\7\30\2\2\\b\5\26\f\2]"+
		"^\5\f\7\2^_\5\32\16\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2eg\5\16\b\2fe\3\2\2\2fg\3\2\2\2g\u0092\3\2\2\2h"+
		"i\7\'\2\2ij\7\30\2\2jp\5\32\16\2kl\5\22\n\2lm\5\32\16\2mo\3\2\2\2nk\3"+
		"\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2su\5\16\b\2ts"+
		"\3\2\2\2tu\3\2\2\2u\u0092\3\2\2\2vw\7\'\2\2wx\7\30\2\2x~\7\'\2\2yz\5\22"+
		"\n\2z{\5\32\16\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\16\b\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0092\3\2\2\2\u0084\u0085\7\'\2\2\u0085"+
		"\u0086\7\30\2\2\u0086\u0088\5\24\13\2\u0087\u0089\5\16\b\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0092\3\2\2\2\u008a\u008b\7\'\2\2\u008b"+
		"\u008c\7\30\2\2\u008c\u008d\7\6\2\2\u008d\u008e\5\24\13\2\u008e\u008f"+
		"\7\7\2\2\u008f\u0092\3\2\2\2\u0090\u0092\5\20\t\2\u0091P\3\2\2\2\u0091"+
		"Z\3\2\2\2\u0091h\3\2\2\2\u0091v\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u008a"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\7\'\2\2\u0094"+
		"\u00a2\7\31\2\2\u0095\u0096\7\'\2\2\u0096\u0097\7\27\2\2\u0097\u009f\5"+
		"\2\2\2\u0098\u0099\5\n\6\2\u0099\u009a\7\'\2\2\u009a\u009b\7\27\2\2\u009b"+
		"\u009c\5\2\2\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\5\2\2\2\u00a7"+
		"\u00a9\7\6\2\2\u00a8\u00aa\7\6\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\7\33\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5\u01ce\3\2"+
		"\2\2\u00b6\u00b7\7\'\2\2\u00b7\u00c1\7\31\2\2\u00b8\u00be\5\24\13\2\u00b9"+
		"\u00ba\5\n\6\2\u00ba\u00bb\5\24\13\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\7\32\2\2\u00c4\u00c5\5\f\7\2\u00c5"+
		"\u00c6\5\32\16\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\7\n\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u01ce\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\7\31\2\2\u00d0\u00d2\7\62\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d6\5\26"+
		"\f\2\u00d4\u00d6\5\24\13\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00db\7\32\2\2\u00d8\u00d9\5\f\7\2\u00d9\u00da\5"+
		"\32\16\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00e0\3\2\2\2\u00dd\u00df\7\n\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u01ce\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e7\7\34\2\2\u00e4\u00e6\5\24\13\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ee\7\35\2\2\u00eb\u00ed\5"+
		"\24\13\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f5\7\36"+
		"\2\2\u00f2\u00f4\5\24\13\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\7\37\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u0100\7\n\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u01ce\3\2\2\2\u0101\u0105\7 \2\2\u0102\u0104\5\24\13\2\u0103\u0102\3"+
		"\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\7!\2\2\u0109\u010b\5\24"+
		"\13\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\7\""+
		"\2\2\u0110\u0112\7\n\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u01ce\3\2\2\2\u0113\u0117\7\6\2\2\u0114\u0116\5\24\13\2\u0115\u0114\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u01ce\7\7\2\2\u011b\u011f\7\6"+
		"\2\2\u011c\u011e\5\24\13\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u01ce\7\33\2\2\u0123\u0127\7\31\2\2\u0124\u0126\5\24\13\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012e\7\32\2\2\u012b"+
		"\u012d\7\n\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u01ce\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0132\t\5\2\2\u0132\u0133\5\f\7\2\u0133\u0139\5\32\16\2\u0134\u0135\5"+
		"\f\7\2\u0135\u0136\5\32\16\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013e\7\n\2\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u01ce\3\2\2\2\u013f\u0140\7#\2\2\u0140\u0141\7\'"+
		"\2\2\u0141\u0146\7\27\2\2\u0142\u0147\5\2\2\2\u0143\u0144\7\'\2\2\u0144"+
		"\u0145\7\30\2\2\u0145\u0147\5\24\13\2\u0146\u0142\3\2\2\2\u0146\u0143"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u015f\7$\2\2\u0149\u014b\5\24\13\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u0160\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\7\6\2\2\u0150"+
		"\u0152\5\24\13\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0160\7\33\2\2\u0157\u015b\7\31\2\2\u0158\u015a\5\24\13\2\u0159\u0158"+
		"\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\7\32\2\2\u015f\u014c\3"+
		"\2\2\2\u015f\u014f\3\2\2\2\u015f\u0157\3\2\2\2\u0160\u0164\3\2\2\2\u0161"+
		"\u0163\7\n\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u01ce\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\t\6\2\2\u0168\u0169\5\22\n\2\u0169\u016f\5\24\13\2\u016a\u016b"+
		"\5\22\n\2\u016b\u016c\5\24\13\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2\2"+
		"\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0173"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7\n\2\2\u0173\u0172\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u01ce\3\2\2\2\u0175\u0178\7%\2\2\u0176\u0179\7\'"+
		"\2\2\u0177\u0179\5\24\13\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u017c\7\n\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u01ce\3\2\2\2\u017d\u0181\7 \2\2\u017e\u0180\5\24\13\2\u017f"+
		"\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\7!\2\2\u0185"+
		"\u0187\7\6\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018b\3\2"+
		"\2\2\u0188\u018a\5\24\13\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0190\7\33\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u01ce\3\2\2\2\u0191\u0195\7 \2\2\u0192\u0194\5\24\13\2\u0193\u0192\3"+
		"\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\7!\2\2\u0199\u019b\7\6"+
		"\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019f\3\2\2\2\u019c"+
		"\u019e\5\24\13\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\7\33\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3"+
		"\2\2\2\u01a5\u01a7\7\"\2\2\u01a6\u01a8\7\n\2\2\u01a7\u01a6\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01ce\3\2\2\2\u01a9\u01ab\7\31\2\2\u01aa\u01ac\7"+
		"\62\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01b0\5\26\f\2\u01ae\u01b0\5\24\13\2\u01af\u01ad\3\2\2\2\u01af\u01ae"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7\32\2\2\u01b2\u01b3\7&\2\2\u01b3"+
		"\u01b4\7\'\2\2\u01b4\u01b5\5\f\7\2\u01b5\u01bb\5\32\16\2\u01b6\u01b7\5"+
		"\f\7\2\u01b7\u01b8\5\32\16\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\7\n\2\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01ce\3\2\2\2\u01c1\u01c2\7\31\2\2\u01c2\u01c3\7"+
		"#\2\2\u01c3\u01c4\7\'\2\2\u01c4\u01c7\7\27\2\2\u01c5\u01c8\5\2\2\2\u01c6"+
		"\u01c8\5\24\13\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3"+
		"\2\2\2\u01c9\u01ca\7$\2\2\u01ca\u01cb\5\32\16\2\u01cb\u01cc\7\32\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u0093\3\2\2\2\u01cd\u00b6\3\2\2\2\u01cd\u00cf\3\2"+
		"\2\2\u01cd\u00e3\3\2\2\2\u01cd\u0101\3\2\2\2\u01cd\u0113\3\2\2\2\u01cd"+
		"\u011b\3\2\2\2\u01cd\u0123\3\2\2\2\u01cd\u0131\3\2\2\2\u01cd\u013f\3\2"+
		"\2\2\u01cd\u0167\3\2\2\2\u01cd\u0175\3\2\2\2\u01cd\u017d\3\2\2\2\u01cd"+
		"\u0191\3\2\2\2\u01cd\u01a9\3\2\2\2\u01cd\u01c1\3\2\2\2\u01ce\33\3\2\2"+
		"\2G!(\60\62=HNUXbfpt~\u0082\u0088\u0091\u009f\u00a2\u00a9\u00ae\u00b2"+
		"\u00be\u00c1\u00c7\u00cc\u00d1\u00d5\u00db\u00e0\u00e7\u00ee\u00f5\u00fb"+
		"\u00ff\u0105\u010c\u0111\u0117\u011f\u0127\u012e\u0139\u013d\u0146\u014c"+
		"\u0153\u015b\u015f\u0164\u016f\u0173\u0178\u017b\u0181\u0186\u018b\u018f"+
		"\u0195\u019a\u019f\u01a3\u01a7\u01ab\u01af\u01bb\u01bf\u01c7\u01cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}