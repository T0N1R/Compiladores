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
	public static class Tipo_correcto_2Context extends DeclararAtributoContext {
		public List<TerminalNode> ID() { return getTokens(Proy1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Proy1Parser.ID, i);
		}
		public Tipo_correcto_2Context(DeclararAtributoContext ctx) { copyFrom(ctx); }
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
		public List<DeclararAtributoContext> declararAtributo() {
			return getRuleContexts(DeclararAtributoContext.class);
		}
		public DeclararAtributoContext declararAtributo(int i) {
			return getRuleContext(DeclararAtributoContext.class,i);
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
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
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
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__22) | (1L << T__25) | (1L << T__29) | (1L << T__32) | (1L << T__34) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << BOOL))) != 0)) {
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(187);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(188);
						expr();
						}
						break;
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(406);
					match(T__3);
					}
					break;
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
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
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(464);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u01e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\7\3 \n\3\f\3\16\3#\13\3\3"+
		"\4\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t>\n\t\3\n\3\n\3\13\3\13\5\13"+
		"D\n\13\3\13\3\13\5\13H\n\13\3\13\3\13\3\13\3\13\5\13N\n\13\3\13\3\13\5"+
		"\13R\n\13\3\13\5\13U\n\13\3\f\3\f\3\f\3\f\5\f[\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\rb\n\r\3\r\5\re\n\r\3\r\3\r\3\r\3\r\5\rk\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\rs\n\r\f\r\16\rv\13\r\3\r\5\ry\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0081"+
		"\n\r\f\r\16\r\u0084\13\r\3\r\5\r\u0087\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u008f\n\r\f\r\16\r\u0092\13\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\r\5\r\u009b"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a4\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\5\16"+
		"\u00b5\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\7\16\u00c0"+
		"\n\16\f\16\16\16\u00c3\13\16\3\16\5\16\u00c6\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3\13\16\5\16\u00d5"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u00db\n\16\3\16\7\16\u00de\n\16\f\16\16"+
		"\16\u00e1\13\16\3\16\3\16\5\16\u00e5\n\16\3\16\3\16\5\16\u00e9\n\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\16\7\16\u00f2\n\16\f\16\16\16\u00f5"+
		"\13\16\3\16\3\16\7\16\u00f9\n\16\f\16\16\16\u00fc\13\16\3\16\3\16\7\16"+
		"\u0100\n\16\f\16\16\16\u0103\13\16\3\16\3\16\7\16\u0107\n\16\f\16\16\16"+
		"\u010a\13\16\3\16\7\16\u010d\n\16\f\16\16\16\u0110\13\16\3\16\5\16\u0113"+
		"\n\16\3\16\3\16\7\16\u0117\n\16\f\16\16\16\u011a\13\16\3\16\3\16\7\16"+
		"\u011e\n\16\f\16\16\16\u0121\13\16\3\16\3\16\5\16\u0125\n\16\3\16\3\16"+
		"\7\16\u0129\n\16\f\16\16\16\u012c\13\16\3\16\3\16\3\16\7\16\u0131\n\16"+
		"\f\16\16\16\u0134\13\16\3\16\3\16\3\16\7\16\u0139\n\16\f\16\16\16\u013c"+
		"\13\16\3\16\3\16\7\16\u0140\n\16\f\16\16\16\u0143\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u014b\n\16\f\16\16\16\u014e\13\16\3\16\5\16\u0151"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u015a\n\16\3\16\3\16\7\16"+
		"\u015e\n\16\f\16\16\16\u0161\13\16\3\16\3\16\7\16\u0165\n\16\f\16\16\16"+
		"\u0168\13\16\3\16\3\16\3\16\7\16\u016d\n\16\f\16\16\16\u0170\13\16\3\16"+
		"\5\16\u0173\n\16\3\16\7\16\u0176\n\16\f\16\16\16\u0179\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0181\n\16\f\16\16\16\u0184\13\16\3\16\5\16"+
		"\u0187\n\16\3\16\3\16\3\16\5\16\u018c\n\16\3\16\5\16\u018f\n\16\3\16\3"+
		"\16\7\16\u0193\n\16\f\16\16\16\u0196\13\16\3\16\3\16\5\16\u019a\n\16\3"+
		"\16\7\16\u019d\n\16\f\16\16\16\u01a0\13\16\3\16\5\16\u01a3\n\16\3\16\3"+
		"\16\7\16\u01a7\n\16\f\16\16\16\u01aa\13\16\3\16\3\16\5\16\u01ae\n\16\3"+
		"\16\7\16\u01b1\n\16\f\16\16\16\u01b4\13\16\3\16\5\16\u01b7\n\16\3\16\3"+
		"\16\5\16\u01bb\n\16\3\16\3\16\5\16\u01bf\n\16\3\16\3\16\5\16\u01c3\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01cd\n\16\f\16\16\16\u01d0"+
		"\13\16\3\16\5\16\u01d3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01db\n"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01e1\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\7\4\2\3\3\'\'\3\2\f\24\4\2\7\7\33\33\4\2\'\'))\3\2\'"+
		"(\2\u023a\2\34\3\2\2\2\4!\3\2\2\2\6$\3\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2"+
		"\f\67\3\2\2\2\169\3\2\2\2\20;\3\2\2\2\22?\3\2\2\2\24T\3\2\2\2\26Z\3\2"+
		"\2\2\30\u00a3\3\2\2\2\32\u01e0\3\2\2\2\34\35\t\2\2\2\35\3\3\2\2\2\36 "+
		"\5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!"+
		"\3\2\2\2$%\7\4\2\2%(\7\'\2\2&\'\7\5\2\2\')\5\2\2\2(&\3\2\2\2()\3\2\2\2"+
		")*\3\2\2\2*+\7\6\2\2+,\5\b\5\2,-\7\7\2\2-\7\3\2\2\2.\61\5\30\r\2/\61\5"+
		"\32\16\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\t\3\2\2\2\64\62\3\2\2\2\65\66\7\b\2\2\66\13\3\2\2\2\678\7\t\2"+
		"\28\r\3\2\2\29:\7\n\2\2:\17\3\2\2\2;=\7\13\2\2<>\7\n\2\2=<\3\2\2\2=>\3"+
		"\2\2\2>\21\3\2\2\2?@\t\3\2\2@\23\3\2\2\2AC\7\'\2\2BD\7\n\2\2CB\3\2\2\2"+
		"CD\3\2\2\2DU\3\2\2\2EG\7)\2\2FH\7\n\2\2GF\3\2\2\2GH\3\2\2\2HU\3\2\2\2"+
		"IU\5\30\r\2JU\5\32\16\2KM\7\61\2\2LN\7\n\2\2ML\3\2\2\2MN\3\2\2\2NU\3\2"+
		"\2\2OQ\7(\2\2PR\7\n\2\2QP\3\2\2\2QR\3\2\2\2RU\3\2\2\2SU\5\20\t\2TA\3\2"+
		"\2\2TE\3\2\2\2TI\3\2\2\2TJ\3\2\2\2TK\3\2\2\2TO\3\2\2\2TS\3\2\2\2U\25\3"+
		"\2\2\2VW\7\25\2\2W[\5\2\2\2XY\7\26\2\2Y[\5\20\t\2ZV\3\2\2\2ZX\3\2\2\2"+
		"[\27\3\2\2\2\\]\7\'\2\2]^\7\27\2\2^a\5\2\2\2_`\7\30\2\2`b\5\24\13\2a_"+
		"\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\5\16\b\2dc\3\2\2\2de\3\2\2\2e\u00a4\3\2"+
		"\2\2fg\7\'\2\2gh\7\30\2\2hj\7\'\2\2ik\7\n\2\2ji\3\2\2\2jk\3\2\2\2k\u00a4"+
		"\3\2\2\2lm\7\'\2\2mn\7\30\2\2nt\5\26\f\2op\5\f\7\2pq\5\32\16\2qs\3\2\2"+
		"\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wy\5\16"+
		"\b\2xw\3\2\2\2xy\3\2\2\2y\u00a4\3\2\2\2z{\7\'\2\2{|\7\30\2\2|\u0082\5"+
		"\32\16\2}~\5\22\n\2~\177\5\32\16\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\16\b\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u00a4\3\2\2\2\u0088\u0089\7\'\2\2\u0089\u008a\7\30"+
		"\2\2\u008a\u0090\7\'\2\2\u008b\u008c\5\22\n\2\u008c\u008d\5\32\16\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0095\5\16\b\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00a4\3"+
		"\2\2\2\u0096\u0097\7\'\2\2\u0097\u0098\7\30\2\2\u0098\u009a\5\24\13\2"+
		"\u0099\u009b\5\16\b\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a4"+
		"\3\2\2\2\u009c\u009d\7\'\2\2\u009d\u009e\7\30\2\2\u009e\u009f\7\6\2\2"+
		"\u009f\u00a0\5\24\13\2\u00a0\u00a1\7\7\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a4"+
		"\5\20\t\2\u00a3\\\3\2\2\2\u00a3f\3\2\2\2\u00a3l\3\2\2\2\u00a3z\3\2\2\2"+
		"\u00a3\u0088\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00b4\7\31\2\2\u00a7"+
		"\u00a8\7\'\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00b1\5\2\2\2\u00aa\u00ab\5"+
		"\n\6\2\u00ab\u00ac\7\'\2\2\u00ac\u00ad\7\27\2\2\u00ad\u00ae\5\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00a7\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\32"+
		"\2\2\u00b7\u00b8\7\27\2\2\u00b8\u00b9\5\2\2\2\u00b9\u00bb\7\6\2\2\u00ba"+
		"\u00bc\7\6\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c1\3\2"+
		"\2\2\u00bd\u00c0\5\30\r\2\u00be\u00c0\5\24\13\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\33\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\t\4"+
		"\2\2\u00c8\u01e1\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00d4\7\31\2\2\u00cb"+
		"\u00d1\5\24\13\2\u00cc\u00cd\5\n\6\2\u00cd\u00ce\5\24\13\2\u00ce\u00d0"+
		"\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cb\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\7\32\2\2\u00d7"+
		"\u00d8\5\f\7\2\u00d8\u00d9\5\32\16\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\7\n\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u01e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\7\31\2\2\u00e3"+
		"\u00e5\7\62\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e9\5\26\f\2\u00e7\u00e9\5\24\13\2\u00e8\u00e6\3\2\2\2"+
		"\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\7\32\2\2\u00eb\u00ec"+
		"\5\f\7\2\u00ec\u00ed\5\32\16\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\7\n\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u01e1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\7\34\2\2\u00f7\u00f9\5"+
		"\24\13\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\7\35"+
		"\2\2\u00fe\u0100\5\24\13\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0108\7\36\2\2\u0105\u0107\5\24\13\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010e\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010d\7\37\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0113\7\n\2\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u01e1\3\2\2\2\u0114\u0118\7 \2\2\u0115\u0117\5\24"+
		"\13\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\7!"+
		"\2\2\u011c\u011e\5\24\13\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0124\7\"\2\2\u0123\u0125\7\n\2\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u01e1\3\2\2\2\u0126\u012a\7\6\2\2\u0127\u0129\5\24"+
		"\13\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u01e1\7\7"+
		"\2\2\u012e\u0132\7\6\2\2\u012f\u0131\5\24\13\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u01e1\7\33\2\2\u0136\u013a\7\31\2\2\u0137"+
		"\u0139\5\24\13\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u0141\7\32\2\2\u013e\u0140\7\n\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u01e1\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\t\5\2\2\u0145\u0146\5\f\7\2\u0146\u014c\5\32"+
		"\16\2\u0147\u0148\5\f\7\2\u0148\u0149\5\32\16\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0147\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7\n\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u01e1\3\2\2\2\u0152\u0153\7#"+
		"\2\2\u0153\u0154\7\'\2\2\u0154\u0159\7\27\2\2\u0155\u015a\5\2\2\2\u0156"+
		"\u0157\7\'\2\2\u0157\u0158\7\30\2\2\u0158\u015a\5\24\13\2\u0159\u0155"+
		"\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0172\7$\2\2\u015c"+
		"\u015e\5\24\13\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0173\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0166\7\6\2\2\u0163\u0165\5\24\13\2\u0164\u0163\3\2\2\2\u0165\u0168\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u0173\7\33\2\2\u016a\u016e\7\31\2\2\u016b\u016d\5"+
		"\24\13\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7\32"+
		"\2\2\u0172\u015f\3\2\2\2\u0172\u0162\3\2\2\2\u0172\u016a\3\2\2\2\u0173"+
		"\u0177\3\2\2\2\u0174\u0176\7\n\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u01e1\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017b\t\6\2\2\u017b\u017c\5\22\n\2\u017c\u0182\5"+
		"\24\13\2\u017d\u017e\5\22\n\2\u017e\u017f\5\24\13\2\u017f\u0181\3\2\2"+
		"\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0187\7\n\2\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u01e1\3\2\2\2\u0188\u018b\7%"+
		"\2\2\u0189\u018c\7\'\2\2\u018a\u018c\5\24\13\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018f\7\n\2\2\u018e\u018d\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u01e1\3\2\2\2\u0190\u0194\7 \2\2\u0191"+
		"\u0193\5\24\13\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0199\7!\2\2\u0198\u019a\7\6\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019e\3\2\2\2\u019b\u019d\5\24\13\2\u019c\u019b\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7\33\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01e1\3\2\2\2\u01a4\u01a8\7 \2\2\u01a5\u01a7\5\24"+
		"\13\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\7!"+
		"\2\2\u01ac\u01ae\7\6\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b2\3\2\2\2\u01af\u01b1\5\24\13\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3"+
		"\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b7\7\33\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3"+
		"\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7\"\2\2\u01b9\u01bb\7\n\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01e1\3\2\2\2\u01bc\u01be\7\31"+
		"\2\2\u01bd\u01bf\7\62\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c2\3\2\2\2\u01c0\u01c3\5\26\f\2\u01c1\u01c3\5\24\13\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\7\32\2\2"+
		"\u01c5\u01c6\7&\2\2\u01c6\u01c7\7\'\2\2\u01c7\u01c8\5\f\7\2\u01c8\u01ce"+
		"\5\32\16\2\u01c9\u01ca\5\f\7\2\u01ca\u01cb\5\32\16\2\u01cb\u01cd\3\2\2"+
		"\2\u01cc\u01c9\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d3\7\n\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01e1\3\2\2\2\u01d4\u01d5\7\31"+
		"\2\2\u01d5\u01d6\7#\2\2\u01d6\u01d7\7\'\2\2\u01d7\u01da\7\27\2\2\u01d8"+
		"\u01db\5\2\2\2\u01d9\u01db\5\24\13\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7$\2\2\u01dd\u01de\5\32\16\2\u01de"+
		"\u01df\7\32\2\2\u01df\u01e1\3\2\2\2\u01e0\u00a5\3\2\2\2\u01e0\u00c9\3"+
		"\2\2\2\u01e0\u00e2\3\2\2\2\u01e0\u00f6\3\2\2\2\u01e0\u0114\3\2\2\2\u01e0"+
		"\u0126\3\2\2\2\u01e0\u012e\3\2\2\2\u01e0\u0136\3\2\2\2\u01e0\u0144\3\2"+
		"\2\2\u01e0\u0152\3\2\2\2\u01e0\u017a\3\2\2\2\u01e0\u0188\3\2\2\2\u01e0"+
		"\u0190\3\2\2\2\u01e0\u01a4\3\2\2\2\u01e0\u01bc\3\2\2\2\u01e0\u01d4\3\2"+
		"\2\2\u01e1\33\3\2\2\2M!(\60\62=CGMQTZadjtx\u0082\u0086\u0090\u0094\u009a"+
		"\u00a3\u00b1\u00b4\u00bb\u00bf\u00c1\u00c5\u00d1\u00d4\u00da\u00df\u00e4"+
		"\u00e8\u00ee\u00f3\u00fa\u0101\u0108\u010e\u0112\u0118\u011f\u0124\u012a"+
		"\u0132\u013a\u0141\u014c\u0150\u0159\u015f\u0166\u016e\u0172\u0177\u0182"+
		"\u0186\u018b\u018e\u0194\u0199\u019e\u01a2\u01a8\u01ad\u01b2\u01b6\u01ba"+
		"\u01be\u01c2\u01ce\u01d2\u01da\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}