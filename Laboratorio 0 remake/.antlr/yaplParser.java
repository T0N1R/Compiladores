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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, MINID=38, MAYID=39, 
		NUM=40, STRING=41, DELIMITER=42, QUOTES=43, APOSTROPHE=44, CHAR_LITERAL=45, 
		PARENTESIS=46, COMENTARIO=47, LCOMENTARIO=48;
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
			"'new'", "'isvoid'", "'('", "')'", "'.'", "','", "'let'", "'in'", "'~'", 
			"'<'", "'>'", "'not'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
			"'loop'", "'pool'", "'@'", null, null, null, null, null, null, "'\"'", 
			"'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "MINID", "MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
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
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(yaplParser.NUM, 0); }
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__16);
				setState(97);
				tipoVariable();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__17);
				setState(99);
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
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
		}
		public List<DeclararAtributoContext> declararAtributo() {
			return getRuleContexts(DeclararAtributoContext.class);
		}
		public DeclararAtributoContext declararAtributo(int i) {
			return getRuleContext(DeclararAtributoContext.class,i);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(yaplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(yaplParser.NUM, i);
		}
		public List<TerminalNode> STRING() { return getTokens(yaplParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(yaplParser.STRING, i);
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
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(103);
				nombreMetodo();
				setState(104);
				match(T__18);
				setState(105);
				metodo(0);
				setState(106);
				match(T__19);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						match(T__20);
						setState(108);
						metodo(0);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(114);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(117);
				nombreMetodo();
				setState(118);
				match(T__18);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(119);
					match(ID);
					setState(120);
					match(T__13);
					setState(121);
					tipoVariable();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(127);
					match(T__21);
					setState(128);
					match(ID);
					setState(129);
					match(T__13);
					setState(130);
					tipoVariable();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__19);
				setState(137);
				match(T__13);
				setState(138);
				tipoVariable();
				setState(139);
				match(T__3);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(140);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(141);
						metodo(0);
						}
						break;
					case 3:
						{
						setState(142);
						match(ID);
						}
						break;
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__15);
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(149);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(152);
				nombreMetodo();
				setState(153);
				match(T__18);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(154);
					match(ID);
					setState(155);
					match(T__13);
					setState(156);
					tipoVariable();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(162);
					match(T__21);
					setState(163);
					match(ID);
					setState(164);
					match(T__13);
					setState(165);
					tipoVariable();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(T__19);
				setState(172);
				match(T__13);
				setState(173);
				tipoVariable();
				setState(174);
				match(T__3);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(175);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(176);
						metodo(0);
						}
						break;
					case 3:
						{
						setState(177);
						match(ID);
						}
						break;
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(185);
				self();
				}
				break;
			case 5:
				{
				setState(186);
				nombreMetodo();
				setState(187);
				match(T__18);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(188);
					match(ID);
					setState(189);
					match(T__13);
					setState(190);
					tipoVariable();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(196);
					match(T__21);
					setState(197);
					match(ID);
					setState(198);
					match(T__13);
					setState(199);
					tipoVariable();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__19);
				setState(206);
				match(T__13);
				setState(207);
				tipoVariable();
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(208);
					match(T__3);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(209);
						metodo(0);
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(215);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(216);
					match(T__3);
					setState(217);
					match(T__3);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(218);
						metodo(0);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(224);
					match(T__15);
					setState(225);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(228);
				match(T__3);
				setState(229);
				metodo(0);
				setState(230);
				match(T__15);
				}
				break;
			case 7:
				{
				setState(232);
				match(T__18);
				setState(233);
				metodo(0);
				setState(234);
				match(T__19);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(235);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(238);
				match(T__22);
				setState(239);
				match(ID);
				setState(240);
				match(T__13);
				setState(241);
				tipoVariable();
				setState(242);
				match(T__23);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(246);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(243);
							metodo(0);
							}
							} 
						}
						setState(248);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(249);
					match(T__3);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(250);
						metodo(0);
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(256);
					match(T__15);
					}
					break;
				case 3:
					{
					setState(257);
					match(T__18);
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(258);
						metodo(0);
						}
						}
						setState(263);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(264);
					match(T__19);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(267);
				match(T__22);
				setState(268);
				match(ID);
				setState(269);
				match(T__13);
				setState(270);
				tipoVariable();
				setState(271);
				match(T__5);
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				match(T__23);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(274);
							metodo(0);
							}
							} 
						}
						setState(279);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(280);
					match(T__3);
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(281);
						metodo(0);
						}
						}
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(287);
					match(T__15);
					}
					break;
				case 3:
					{
					setState(288);
					match(T__18);
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
						{
						{
						setState(289);
						metodo(0);
						}
						}
						setState(294);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(295);
					match(T__19);
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(298);
				nombreAtributo();
				setState(299);
				asignacion();
				setState(300);
				metodo(0);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(301);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(304);
				nombreAtributo();
				setState(305);
				operacion();
				setState(306);
				metodo(0);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(307);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(310);
				match(T__24);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(311);
					nombreMetodo();
					}
					break;
				case 2:
					{
					setState(312);
					metodo(0);
					}
					break;
				}
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(315);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 13:
				{
				setState(318);
				match(ID);
				setState(319);
				match(T__25);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(320);
					metodo(0);
					}
					break;
				case 2:
					{
					setState(321);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(322);
					match(ID);
					}
					break;
				}
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(325);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(328);
				match(ID);
				setState(329);
				match(T__26);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(330);
					metodo(0);
					}
					break;
				case 2:
					{
					setState(331);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(332);
					match(ID);
					}
					break;
				}
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(335);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 15:
				{
				setState(338);
				match(ID);
				setState(339);
				match(T__6);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(340);
					metodo(0);
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
				}
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(345);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 16:
				{
				setState(348);
				match(T__27);
				setState(349);
				metodo(0);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(350);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 17:
				{
				setState(353);
				match(T__28);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(354);
					metodo(0);
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				match(T__29);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(361);
					metodo(0);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				match(T__30);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(368);
					metodo(0);
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				match(T__31);
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(375);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 18:
				{
				setState(378);
				match(T__32);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(379);
					metodo(0);
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(T__33);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(386);
					metodo(0);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				match(T__34);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(393);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 19:
				{
				setState(396);
				nombreAtributo();
				setState(397);
				operacion();
				setState(398);
				nombreAtributo();
				setState(400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(399);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 20:
				{
				setState(402);
				nombreAtributo();
				setState(403);
				match(T__12);
				}
				break;
			case 21:
				{
				setState(405);
				nombreMetodo();
				setState(406);
				match(T__18);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(407);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(408);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(409);
						match(ID);
						}
						break;
					case 4:
						{
						setState(410);
						inicializar();
						}
						break;
					case 5:
						{
						setState(411);
						metodo(0);
						}
						break;
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(417);
					match(T__21);
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						setState(418);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(419);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(420);
						match(ID);
						}
						break;
					case 4:
						{
						setState(421);
						inicializar();
						}
						break;
					case 5:
						{
						setState(422);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__19);
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(431);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 22:
				{
				setState(434);
				nombreMetodo();
				setState(435);
				match(T__18);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(436);
					match(ID);
					setState(437);
					match(T__13);
					setState(438);
					tipoVariable();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(444);
					match(T__21);
					setState(445);
					match(ID);
					setState(446);
					match(T__13);
					setState(447);
					tipoVariable();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(T__19);
				setState(454);
				match(T__13);
				setState(455);
				tipoVariable();
				setState(456);
				match(T__3);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(457);
					metodo(0);
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463);
				match(T__15);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(464);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 23:
				{
				setState(467);
				nombreMetodo();
				setState(468);
				match(T__18);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(469);
					match(ID);
					setState(470);
					match(T__13);
					setState(471);
					tipoVariable();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(477);
					match(T__21);
					setState(478);
					match(ID);
					setState(479);
					match(T__13);
					setState(480);
					tipoVariable();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				match(T__19);
				setState(487);
				match(T__13);
				setState(488);
				tipoVariable();
				setState(489);
				match(T__3);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID))) != 0)) {
					{
					{
					setState(490);
					metodo(0);
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(T__4);
				}
				break;
			case 24:
				{
				setState(498);
				match(T__18);
				setState(499);
				inicializar();
				setState(500);
				match(T__19);
				}
				break;
			case 25:
				{
				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(502);
					nombreMetodo();
					}
					break;
				case 2:
					{
					setState(503);
					tipoVariable();
					}
					break;
				}
				setState(506);
				match(T__20);
				setState(507);
				nombreMetodo();
				setState(508);
				match(T__18);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__32) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						setState(509);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(510);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(511);
						match(ID);
						}
						break;
					case 4:
						{
						setState(512);
						inicializar();
						}
						break;
					case 5:
						{
						setState(513);
						metodo(0);
						}
						break;
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(519);
					match(T__21);
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(520);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(521);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(522);
						match(ID);
						}
						break;
					case 4:
						{
						setState(523);
						inicializar();
						}
						break;
					case 5:
						{
						setState(524);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				match(T__19);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(533);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 26:
				{
				setState(536);
				match(T__18);
				setState(537);
				inicializar();
				setState(538);
				match(T__19);
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						match(T__20);
						setState(540);
						metodo(0);
						}
						} 
					}
					setState(545);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;
			case 27:
				{
				setState(546);
				match(T__18);
				setState(547);
				inicializar();
				setState(548);
				match(T__19);
				setState(549);
				match(T__20);
				setState(550);
				nombreMetodo();
				setState(551);
				match(T__18);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(556);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(552);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(553);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(554);
						match(ID);
						}
						break;
					case T__16:
					case T__17:
						{
						setState(555);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(560);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(561);
					match(T__21);
					setState(566);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(562);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(563);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(564);
						match(ID);
						}
						break;
					case T__16:
					case T__17:
						{
						setState(565);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				match(T__19);
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(574);
					match(T__12);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(604);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(579);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(580);
						match(T__35);
						setState(581);
						metodo(5);
						}
						break;
					case 2:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(582);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(583);
						asignacion();
						setState(584);
						metodo(0);
						setState(586);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(585);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(588);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(589);
						operacion();
						setState(590);
						metodo(0);
						setState(592);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(591);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 4:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(594);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(595);
						operacion();
						setState(599);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(596);
							nombreAtributo();
							}
							break;
						case STRING:
							{
							setState(597);
							match(STRING);
							}
							break;
						case NUM:
							{
							setState(598);
							match(NUM);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(602);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
						case 1:
							{
							setState(601);
							match(T__12);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0264\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3"+
		"\4\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n>\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13U\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13a\n\13\3\f\3\f\3\f\3\f\5\fg\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rp"+
		"\n\r\f\r\16\rs\13\r\3\r\5\rv\n\r\3\r\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r"+
		"\u0080\13\r\3\r\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\r\3\r\5\r\u0099"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00a9\n\r\f\r\16\r\u00ac\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00b5\n\r\f\r\16\r\u00b8\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c2"+
		"\n\r\f\r\16\r\u00c5\13\r\3\r\3\r\3\r\3\r\7\r\u00cb\n\r\f\r\16\r\u00ce"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d5\n\r\f\r\16\r\u00d8\13\r\3\r\3\r\3"+
		"\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1\13\r\3\r\3\r\5\r\u00e5\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ef\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f7"+
		"\n\r\f\r\16\r\u00fa\13\r\3\r\3\r\7\r\u00fe\n\r\f\r\16\r\u0101\13\r\3\r"+
		"\3\r\3\r\7\r\u0106\n\r\f\r\16\r\u0109\13\r\3\r\5\r\u010c\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\r\3\r\7\r\u011d"+
		"\n\r\f\r\16\r\u0120\13\r\3\r\3\r\3\r\7\r\u0125\n\r\f\r\16\r\u0128\13\r"+
		"\3\r\5\r\u012b\n\r\3\r\3\r\3\r\3\r\5\r\u0131\n\r\3\r\3\r\3\r\3\r\5\r\u0137"+
		"\n\r\3\r\3\r\3\r\5\r\u013c\n\r\3\r\5\r\u013f\n\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0146\n\r\3\r\5\r\u0149\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0150\n\r\3\r\5"+
		"\r\u0153\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u015a\n\r\3\r\5\r\u015d\n\r\3\r\3"+
		"\r\3\r\5\r\u0162\n\r\3\r\3\r\7\r\u0166\n\r\f\r\16\r\u0169\13\r\3\r\3\r"+
		"\7\r\u016d\n\r\f\r\16\r\u0170\13\r\3\r\3\r\7\r\u0174\n\r\f\r\16\r\u0177"+
		"\13\r\3\r\3\r\5\r\u017b\n\r\3\r\3\r\7\r\u017f\n\r\f\r\16\r\u0182\13\r"+
		"\3\r\3\r\7\r\u0186\n\r\f\r\16\r\u0189\13\r\3\r\3\r\5\r\u018d\n\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0193\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u019f"+
		"\n\r\f\r\16\r\u01a2\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01aa\n\r\7\r\u01ac"+
		"\n\r\f\r\16\r\u01af\13\r\3\r\3\r\5\r\u01b3\n\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u01ba\n\r\f\r\16\r\u01bd\13\r\3\r\3\r\3\r\3\r\7\r\u01c3\n\r\f\r\16\r"+
		"\u01c6\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u01cd\n\r\f\r\16\r\u01d0\13\r\3\r"+
		"\3\r\5\r\u01d4\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u01db\n\r\f\r\16\r\u01de\13"+
		"\r\3\r\3\r\3\r\3\r\7\r\u01e4\n\r\f\r\16\r\u01e7\13\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u01ee\n\r\f\r\16\r\u01f1\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u01fb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0205\n\r\f\r\16\r\u0208"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0210\n\r\7\r\u0212\n\r\f\r\16\r\u0215"+
		"\13\r\3\r\3\r\5\r\u0219\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0220\n\r\f\r\16\r"+
		"\u0223\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u022f\n\r\f\r"+
		"\16\r\u0232\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u0239\n\r\7\r\u023b\n\r\f\r\16"+
		"\r\u023e\13\r\3\r\3\r\5\r\u0242\n\r\5\r\u0244\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u024d\n\r\3\r\3\r\3\r\3\r\5\r\u0253\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u025a\n\r\3\r\5\r\u025d\n\r\7\r\u025f\n\r\f\r\16\r\u0262\13\r\3"+
		"\r\2\3\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6\4\2\3\3\'\'\3\2\b\t\3\2"+
		"\n\r\3\2*+\2\u02e2\2\32\3\2\2\2\4\37\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2"+
		"\n\63\3\2\2\2\f\65\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24`\3"+
		"\2\2\2\26f\3\2\2\2\30\u0243\3\2\2\2\32\33\t\2\2\2\33\3\3\2\2\2\34\36\5"+
		"\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2"+
		"!\37\3\2\2\2\"#\7\4\2\2#&\7\'\2\2$%\7\5\2\2%\'\7\'\2\2&$\3\2\2\2&\'\3"+
		"\2\2\2\'(\3\2\2\2()\7\6\2\2)*\5\b\5\2*+\7\7\2\2+\7\3\2\2\2,/\5\24\13\2"+
		"-/\5\30\r\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\t\3\2\2\2\62\60\3\2\2\2\63\64\7\'\2\2\64\13\3\2\2\2\65\66\7\'\2\2"+
		"\66\r\3\2\2\2\678\t\3\2\28\17\3\2\2\29:\t\4\2\2:\21\3\2\2\2;=\7\16\2\2"+
		"<>\7\17\2\2=<\3\2\2\2=>\3\2\2\2>\23\3\2\2\2?@\5\n\6\2@A\7\20\2\2AB\5\2"+
		"\2\2BC\7\17\2\2Ca\3\2\2\2DE\5\n\6\2EF\7\21\2\2FG\5\2\2\2GH\7\17\2\2Ha"+
		"\3\2\2\2IK\5\22\n\2JL\7\17\2\2KJ\3\2\2\2KL\3\2\2\2La\3\2\2\2MN\5\n\6\2"+
		"NO\7\20\2\2OP\5\2\2\2PT\5\16\b\2QU\5\n\6\2RU\7+\2\2SU\7*\2\2TQ\3\2\2\2"+
		"TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\7\17\2\2Wa\3\2\2\2XY\5\n\6\2YZ\7\20\2"+
		"\2Z[\5\2\2\2[\\\7\6\2\2\\]\5\n\6\2]^\7\22\2\2^_\7\17\2\2_a\3\2\2\2`?\3"+
		"\2\2\2`D\3\2\2\2`I\3\2\2\2`M\3\2\2\2`X\3\2\2\2a\25\3\2\2\2bc\7\23\2\2"+
		"cg\5\2\2\2de\7\24\2\2eg\5\22\n\2fb\3\2\2\2fd\3\2\2\2g\27\3\2\2\2hi\b\r"+
		"\1\2ij\5\f\7\2jk\7\25\2\2kl\5\30\r\2lq\7\26\2\2mn\7\27\2\2np\5\30\r\2"+
		"om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\7\17\2"+
		"\2ut\3\2\2\2uv\3\2\2\2v\u0244\3\2\2\2wx\5\f\7\2x~\7\25\2\2yz\7\'\2\2z"+
		"{\7\20\2\2{}\5\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\u0087\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\30\2\2\u0082\u0083\7\'\2\2"+
		"\u0083\u0084\7\20\2\2\u0084\u0086\5\2\2\2\u0085\u0081\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\26\2\2\u008b\u008c\7\20\2\2\u008c\u008d\5"+
		"\2\2\2\u008d\u0093\7\6\2\2\u008e\u0092\5\24\13\2\u008f\u0092\5\30\r\2"+
		"\u0090\u0092\7\'\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\22\2\2\u0097\u0099\7"+
		"\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0244\3\2\2\2\u009a"+
		"\u009b\5\f\7\2\u009b\u00a1\7\25\2\2\u009c\u009d\7\'\2\2\u009d\u009e\7"+
		"\20\2\2\u009e\u00a0\5\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7\7\20\2\2\u00a7"+
		"\u00a9\5\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\26\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\5\2\2\2\u00b0\u00b6\7"+
		"\6\2\2\u00b1\u00b5\5\24\13\2\u00b2\u00b5\5\30\r\2\u00b3\u00b5\7\'\2\2"+
		"\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba\u0244\3\2\2\2\u00bb\u0244\5\22"+
		"\n\2\u00bc\u00bd\5\f\7\2\u00bd\u00c3\7\25\2\2\u00be\u00bf\7\'\2\2\u00bf"+
		"\u00c0\7\20\2\2\u00c0\u00c2\5\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\7\'\2\2\u00c8\u00c9\7"+
		"\20\2\2\u00c9\u00cb\5\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\7\20\2\2\u00d1\u00e4\5\2\2\2\u00d2"+
		"\u00d6\7\6\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00e5\7\7\2\2\u00da\u00db\7\6\2\2\u00db\u00df\7\6"+
		"\2\2\u00dc\u00de\5\30\r\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e5\7\7\2\2\u00e4\u00d2\3\2\2\2\u00e4"+
		"\u00da\3\2\2\2\u00e5\u0244\3\2\2\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8\5\30"+
		"\r\2\u00e8\u00e9\7\22\2\2\u00e9\u0244\3\2\2\2\u00ea\u00eb\7\25\2\2\u00eb"+
		"\u00ec\5\30\r\2\u00ec\u00ee\7\26\2\2\u00ed\u00ef\7\17\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u0244\3\2\2\2\u00f0\u00f1\7\31\2\2"+
		"\u00f1\u00f2\7\'\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\5\2\2\2\u00f4\u010b"+
		"\7\32\2\2\u00f5\u00f7\5\30\r\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u010c\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00ff\7\6\2\2\u00fc\u00fe\5\30\r\2\u00fd\u00fc\3\2\2\2"+
		"\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u010c\7\22\2\2\u0103\u0107\7\25\2\2"+
		"\u0104\u0106\5\30\r\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010c\7\26\2\2\u010b\u00f8\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u0103\3"+
		"\2\2\2\u010c\u0244\3\2\2\2\u010d\u010e\7\31\2\2\u010e\u010f\7\'\2\2\u010f"+
		"\u0110\7\20\2\2\u0110\u0111\5\2\2\2\u0111\u0112\7\b\2\2\u0112\u0113\t"+
		"\5\2\2\u0113\u012a\7\32\2\2\u0114\u0116\5\30\r\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u012b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011e\7\6\2\2\u011b\u011d\5\30\r\2\u011c"+
		"\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u012b\7\22\2\2\u0122"+
		"\u0126\7\25\2\2\u0123\u0125\5\30\r\2\u0124\u0123\3\2\2\2\u0125\u0128\3"+
		"\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\7\26\2\2\u012a\u0117\3\2\2\2\u012a\u011a\3"+
		"\2\2\2\u012a\u0122\3\2\2\2\u012b\u0244\3\2\2\2\u012c\u012d\5\n\6\2\u012d"+
		"\u012e\5\16\b\2\u012e\u0130\5\30\r\2\u012f\u0131\7\17\2\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0244\3\2\2\2\u0132\u0133\5\n\6\2\u0133"+
		"\u0134\5\20\t\2\u0134\u0136\5\30\r\2\u0135\u0137\7\17\2\2\u0136\u0135"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0244\3\2\2\2\u0138\u013b\7\33\2\2"+
		"\u0139\u013c\5\f\7\2\u013a\u013c\5\30\r\2\u013b\u0139\3\2\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\7\17\2\2\u013e\u013d\3\2\2\2"+
		"\u013e\u013f\3\2\2\2\u013f\u0244\3\2\2\2\u0140\u0141\7\'\2\2\u0141\u0145"+
		"\7\34\2\2\u0142\u0146\5\30\r\2\u0143\u0146\7*\2\2\u0144\u0146\7\'\2\2"+
		"\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0148"+
		"\3\2\2\2\u0147\u0149\7\17\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0149\u0244\3\2\2\2\u014a\u014b\7\'\2\2\u014b\u014f\7\35\2\2\u014c\u0150"+
		"\5\30\r\2\u014d\u0150\7*\2\2\u014e\u0150\7\'\2\2\u014f\u014c\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\7\17"+
		"\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0244\3\2\2\2\u0154"+
		"\u0155\7\'\2\2\u0155\u0159\7\t\2\2\u0156\u015a\5\30\r\2\u0157\u015a\7"+
		"*\2\2\u0158\u015a\7\'\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7\17\2\2\u015c\u015b\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u0244\3\2\2\2\u015e\u015f\7\36\2\2\u015f"+
		"\u0161\5\30\r\2\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162\u0244\3\2\2\2\u0163\u0167\7\37\2\2\u0164\u0166\5\30\r\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\7 \2\2\u016b"+
		"\u016d\5\30\r\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3"+
		"\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0175\7!\2\2\u0172\u0174\5\30\r\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017a\7\"\2\2\u0179\u017b\7\17\2\2\u017a\u0179\3"+
		"\2\2\2\u017a\u017b\3\2\2\2\u017b\u0244\3\2\2\2\u017c\u0180\7#\2\2\u017d"+
		"\u017f\5\30\r\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0187\7$\2\2\u0184\u0186\5\30\r\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018c\7%\2\2\u018b\u018d\7\17\2\2\u018c\u018b\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u0244\3\2\2\2\u018e\u018f\5\n\6\2\u018f"+
		"\u0190\5\20\t\2\u0190\u0192\5\n\6\2\u0191\u0193\7\17\2\2\u0192\u0191\3"+
		"\2\2\2\u0192\u0193\3\2\2\2\u0193\u0244\3\2\2\2\u0194\u0195\5\n\6\2\u0195"+
		"\u0196\7\17\2\2\u0196\u0244\3\2\2\2\u0197\u0198\5\f\7\2\u0198\u01a0\7"+
		"\25\2\2\u0199\u019f\7+\2\2\u019a\u019f\7*\2\2\u019b\u019f\7\'\2\2\u019c"+
		"\u019f\5\26\f\2\u019d\u019f\5\30\r\2\u019e\u0199\3\2\2\2\u019e\u019a\3"+
		"\2\2\2\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01ad\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a9\7\30\2\2\u01a4\u01aa\7+\2\2\u01a5"+
		"\u01aa\7*\2\2\u01a6\u01aa\7\'\2\2\u01a7\u01aa\5\26\f\2\u01a8\u01aa\5\30"+
		"\r\2\u01a9\u01a4\3\2\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a3\3\2"+
		"\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b2\7\26\2\2\u01b1\u01b3\7"+
		"\17\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u0244\3\2\2\2\u01b4"+
		"\u01b5\5\f\7\2\u01b5\u01bb\7\25\2\2\u01b6\u01b7\7\'\2\2\u01b7\u01b8\7"+
		"\20\2\2\u01b8\u01ba\5\2\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01c4\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01bf\7\30\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c1\7\20\2\2\u01c1"+
		"\u01c3\5\2\2\2\u01c2\u01be\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7\26\2\2\u01c8\u01c9\7\20\2\2\u01c9\u01ca\5\2\2\2\u01ca\u01ce\7"+
		"\6\2\2\u01cb\u01cd\5\30\r\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d3\7\22\2\2\u01d2\u01d4\7\17\2\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u0244\3\2\2\2\u01d5\u01d6\5\f\7\2\u01d6\u01dc\7\25"+
		"\2\2\u01d7\u01d8\7\'\2\2\u01d8\u01d9\7\20\2\2\u01d9\u01db\5\2\2\2\u01da"+
		"\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01e5\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\7\30\2\2\u01e0"+
		"\u01e1\7\'\2\2\u01e1\u01e2\7\20\2\2\u01e2\u01e4\5\2\2\2\u01e3\u01df\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7\26\2\2\u01e9\u01ea\7"+
		"\20\2\2\u01ea\u01eb\5\2\2\2\u01eb\u01ef\7\6\2\2\u01ec\u01ee\5\30\r\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2"+
		"\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7\7\2\2\u01f3"+
		"\u0244\3\2\2\2\u01f4\u01f5\7\25\2\2\u01f5\u01f6\5\26\f\2\u01f6\u01f7\7"+
		"\26\2\2\u01f7\u0244\3\2\2\2\u01f8\u01fb\5\f\7\2\u01f9\u01fb\5\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7\27"+
		"\2\2\u01fd\u01fe\5\f\7\2\u01fe\u0206\7\25\2\2\u01ff\u0205\7+\2\2\u0200"+
		"\u0205\7*\2\2\u0201\u0205\7\'\2\2\u0202\u0205\5\26\f\2\u0203\u0205\5\30"+
		"\r\2\u0204\u01ff\3\2\2\2\u0204\u0200\3\2\2\2\u0204\u0201\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0213\3\2\2\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020f\7\30\2\2\u020a\u0210\7+\2\2\u020b\u0210\7*\2\2\u020c\u0210\7\'"+
		"\2\2\u020d\u0210\5\26\f\2\u020e\u0210\5\30\r\2\u020f\u020a\3\2\2\2\u020f"+
		"\u020b\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210\u0212\3\2\2\2\u0211\u0209\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0213\3\2"+
		"\2\2\u0216\u0218\7\26\2\2\u0217\u0219\7\17\2\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0244\3\2\2\2\u021a\u021b\7\25\2\2\u021b\u021c\5"+
		"\26\f\2\u021c\u0221\7\26\2\2\u021d\u021e\7\27\2\2\u021e\u0220\5\30\r\2"+
		"\u021f\u021d\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0244\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\7\25\2\2"+
		"\u0225\u0226\5\26\f\2\u0226\u0227\7\26\2\2\u0227\u0228\7\27\2\2\u0228"+
		"\u0229\5\f\7\2\u0229\u0230\7\25\2\2\u022a\u022f\7+\2\2\u022b\u022f\7*"+
		"\2\2\u022c\u022f\7\'\2\2\u022d\u022f\5\26\f\2\u022e\u022a\3\2\2\2\u022e"+
		"\u022b\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u023c\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0238\7\30\2\2\u0234\u0239\7+\2\2\u0235\u0239\7*"+
		"\2\2\u0236\u0239\7\'\2\2\u0237\u0239\5\26\f\2\u0238\u0234\3\2\2\2\u0238"+
		"\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u023b\3\2"+
		"\2\2\u023a\u0233\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0241\7\26"+
		"\2\2\u0240\u0242\7\17\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0244\3\2\2\2\u0243h\3\2\2\2\u0243w\3\2\2\2\u0243\u009a\3\2\2\2\u0243"+
		"\u00bb\3\2\2\2\u0243\u00bc\3\2\2\2\u0243\u00e6\3\2\2\2\u0243\u00ea\3\2"+
		"\2\2\u0243\u00f0\3\2\2\2\u0243\u010d\3\2\2\2\u0243\u012c\3\2\2\2\u0243"+
		"\u0132\3\2\2\2\u0243\u0138\3\2\2\2\u0243\u0140\3\2\2\2\u0243\u014a\3\2"+
		"\2\2\u0243\u0154\3\2\2\2\u0243\u015e\3\2\2\2\u0243\u0163\3\2\2\2\u0243"+
		"\u017c\3\2\2\2\u0243\u018e\3\2\2\2\u0243\u0194\3\2\2\2\u0243\u0197\3\2"+
		"\2\2\u0243\u01b4\3\2\2\2\u0243\u01d5\3\2\2\2\u0243\u01f4\3\2\2\2\u0243"+
		"\u01fa\3\2\2\2\u0243\u021a\3\2\2\2\u0243\u0224\3\2\2\2\u0244\u0260\3\2"+
		"\2\2\u0245\u0246\f\6\2\2\u0246\u0247\7&\2\2\u0247\u025f\5\30\r\7\u0248"+
		"\u0249\f\30\2\2\u0249\u024a\5\16\b\2\u024a\u024c\5\30\r\2\u024b\u024d"+
		"\7\17\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u025f\3\2\2\2"+
		"\u024e\u024f\f\25\2\2\u024f\u0250\5\20\t\2\u0250\u0252\5\30\r\2\u0251"+
		"\u0253\7\17\2\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u025f\3"+
		"\2\2\2\u0254\u0255\f\r\2\2\u0255\u0259\5\20\t\2\u0256\u025a\5\n\6\2\u0257"+
		"\u025a\7+\2\2\u0258\u025a\7*\2\2\u0259\u0256\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u0258\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u025d\7\17\2\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0245\3\2"+
		"\2\2\u025e\u0248\3\2\2\2\u025e\u024e\3\2\2\2\u025e\u0254\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\31\3\2\2"+
		"\2\u0262\u0260\3\2\2\2V\37&.\60=KT`fqu~\u0087\u0091\u0093\u0098\u00a1"+
		"\u00aa\u00b4\u00b6\u00c3\u00cc\u00d6\u00df\u00e4\u00ee\u00f8\u00ff\u0107"+
		"\u010b\u0117\u011e\u0126\u012a\u0130\u0136\u013b\u013e\u0145\u0148\u014f"+
		"\u0152\u0159\u015c\u0161\u0167\u016e\u0175\u017a\u0180\u0187\u018c\u0192"+
		"\u019e\u01a0\u01a9\u01ad\u01b2\u01bb\u01c4\u01ce\u01d3\u01dc\u01e5\u01ef"+
		"\u01fa\u0204\u0206\u020f\u0213\u0218\u0221\u022e\u0230\u0238\u023c\u0241"+
		"\u0243\u024c\u0252\u0259\u025c\u025e\u0260";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}