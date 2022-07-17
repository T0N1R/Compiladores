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
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, MINID=23, MAYID=24, NUM=25, 
		STRING=26, DELIMITER=27, QUOTES=28, APOSTROPHE=29, CHAR_LITERAL=30, PARENTESIS=31, 
		COMENTARIO=32, LCOMENTARIO=33;
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
			"'('", "','", "')'", "'new'", "'.'", null, null, null, null, null, null, 
			"'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "MINID", 
			"MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", "CHAR_LITERAL", 
			"PARENTESIS", "COMENTARIO", "LCOMENTARIO"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
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
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public SelfContext self() {
			return getRuleContext(SelfContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(yaplParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(yaplParser.NUM, 0); }
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				nombreAtributo();
				setState(95);
				match(T__16);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(96);
					nombreAtributo();
					setState(97);
					match(T__13);
					setState(98);
					tipoVariable();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(105);
					match(T__17);
					setState(106);
					nombreAtributo();
					setState(107);
					match(T__13);
					setState(108);
					tipoVariable();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__18);
				setState(116);
				match(T__13);
				setState(117);
				tipoVariable();
				setState(118);
				match(T__3);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(119);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(120);
						metodo(0);
						}
						break;
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__15);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(127);
					match(T__12);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				nombreAtributo();
				setState(131);
				match(T__16);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(132);
					nombreAtributo();
					setState(133);
					match(T__13);
					setState(134);
					tipoVariable();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(141);
					match(T__17);
					setState(142);
					nombreAtributo();
					setState(143);
					match(T__13);
					setState(144);
					tipoVariable();
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__18);
				setState(152);
				match(T__13);
				setState(153);
				tipoVariable();
				setState(154);
				match(T__3);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(155);
						declararAtributo();
						}
						break;
					case 2:
						{
						setState(156);
						metodo(0);
						}
						break;
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162);
				match(T__4);
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
		public InicializarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializar; }
	}

	public final InicializarContext inicializar() throws RecognitionException {
		InicializarContext _localctx = new InicializarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inicializar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__19);
			setState(167);
			tipoVariable();
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
		public List<NombreAtributoContext> nombreAtributo() {
			return getRuleContexts(NombreAtributoContext.class);
		}
		public NombreAtributoContext nombreAtributo(int i) {
			return getRuleContext(NombreAtributoContext.class,i);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public NombreMetodoContext nombreMetodo() {
			return getRuleContext(NombreMetodoContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(yaplParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(yaplParser.STRING, i);
		}
		public List<TerminalNode> NUM() { return getTokens(yaplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(yaplParser.NUM, i);
		}
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(170);
				nombreAtributo();
				setState(171);
				asignacion();
				setState(172);
				metodo(8);
				}
				break;
			case 2:
				{
				setState(174);
				nombreAtributo();
				setState(175);
				operacion();
				setState(176);
				metodo(0);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(177);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(180);
				nombreAtributo();
				setState(181);
				operacion();
				setState(182);
				nombreAtributo();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(186);
				nombreAtributo();
				setState(187);
				match(T__12);
				}
				break;
			case 5:
				{
				setState(189);
				nombreAtributo();
				setState(190);
				match(T__20);
				setState(191);
				nombreMetodo();
				setState(192);
				match(T__16);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(197);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(193);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(194);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(195);
						match(ID);
						}
						break;
					case T__19:
						{
						setState(196);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(202);
					match(T__17);
					setState(207);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(203);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(204);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(205);
						match(ID);
						}
						break;
					case T__19:
						{
						setState(206);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__18);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(215);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(218);
				match(T__16);
				setState(219);
				inicializar();
				setState(220);
				match(T__18);
				setState(221);
				match(T__20);
				setState(222);
				nombreMetodo();
				setState(223);
				match(T__16);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(228);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(224);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(225);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(226);
						match(ID);
						}
						break;
					case T__19:
						{
						setState(227);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(233);
					match(T__17);
					setState(238);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(234);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(235);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(236);
						match(ID);
						}
						break;
					case T__19:
						{
						setState(237);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(T__18);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(246);
					match(T__12);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						operacion();
						setState(253);
						metodo(7);
						}
						break;
					case 2:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(255);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(256);
						operacion();
						setState(260);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(257);
							nombreAtributo();
							}
							break;
						case STRING:
							{
							setState(258);
							match(STRING);
							}
							break;
						case NUM:
							{
							setState(259);
							match(NUM);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(263);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(262);
							match(T__12);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\4\3\4\3\4"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n>\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13U\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13q\n\13\f\13\16\13t\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\13\3\13\5\13\u0083\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00a0\n\13\f\13\16\13\u00a3\13\13\3\13\3\13\5"+
		"\13\u00a7\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b5"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u00bb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2"+
		"\n\r\7\r\u00d4\n\r\f\r\16\r\u00d7\13\r\3\r\3\r\5\r\u00db\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00f1\n\r\7\r\u00f3\n\r\f\r\16\r\u00f6\13\r\3\r\3\r"+
		"\5\r\u00fa\n\r\5\r\u00fc\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0107"+
		"\n\r\3\r\5\r\u010a\n\r\7\r\u010c\n\r\f\r\16\r\u010f\13\r\3\r\2\3\30\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\5\4\2\3\3\30\30\3\2\b\t\3\2\n\r\2\u0139"+
		"\2\32\3\2\2\2\4\37\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\63\3\2\2\2\f\65"+
		"\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8"+
		"\3\2\2\2\30\u00fb\3\2\2\2\32\33\t\2\2\2\33\3\3\2\2\2\34\36\5\6\4\2\35"+
		"\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2"+
		"\2\"#\7\4\2\2#&\7\30\2\2$%\7\5\2\2%\'\7\30\2\2&$\3\2\2\2&\'\3\2\2\2\'"+
		"(\3\2\2\2()\7\6\2\2)*\5\b\5\2*+\7\7\2\2+\7\3\2\2\2,/\5\24\13\2-/\5\30"+
		"\r\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3"+
		"\2\2\2\62\60\3\2\2\2\63\64\7\30\2\2\64\13\3\2\2\2\65\66\7\30\2\2\66\r"+
		"\3\2\2\2\678\t\3\2\28\17\3\2\2\29:\t\4\2\2:\21\3\2\2\2;=\7\16\2\2<>\7"+
		"\17\2\2=<\3\2\2\2=>\3\2\2\2>\23\3\2\2\2?@\5\n\6\2@A\7\20\2\2AB\5\2\2\2"+
		"BC\7\17\2\2C\u00a7\3\2\2\2DE\5\n\6\2EF\7\21\2\2FG\5\2\2\2GH\7\17\2\2H"+
		"\u00a7\3\2\2\2IK\5\22\n\2JL\7\17\2\2KJ\3\2\2\2KL\3\2\2\2L\u00a7\3\2\2"+
		"\2MN\5\n\6\2NO\7\20\2\2OP\5\2\2\2PT\5\16\b\2QU\5\n\6\2RU\7\34\2\2SU\7"+
		"\33\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\7\17\2\2W\u00a7\3\2"+
		"\2\2XY\5\n\6\2YZ\7\20\2\2Z[\5\2\2\2[\\\7\6\2\2\\]\5\n\6\2]^\7\22\2\2^"+
		"_\7\17\2\2_\u00a7\3\2\2\2`a\5\n\6\2ah\7\23\2\2bc\5\n\6\2cd\7\20\2\2de"+
		"\5\2\2\2eg\3\2\2\2fb\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ir\3\2\2\2j"+
		"h\3\2\2\2kl\7\24\2\2lm\5\n\6\2mn\7\20\2\2no\5\2\2\2oq\3\2\2\2pk\3\2\2"+
		"\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\25\2\2vw\7\20"+
		"\2\2wx\5\2\2\2x}\7\6\2\2y|\5\24\13\2z|\5\30\r\2{y\3\2\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7"+
		"\22\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u00a7\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u008c\7\23\2\2\u0086\u0087\5"+
		"\n\6\2\u0087\u0088\7\20\2\2\u0088\u0089\5\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0096\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\24\2\2\u0090"+
		"\u0091\5\n\6\2\u0091\u0092\7\20\2\2\u0092\u0093\5\2\2\2\u0093\u0095\3"+
		"\2\2\2\u0094\u008f\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\25"+
		"\2\2\u009a\u009b\7\20\2\2\u009b\u009c\5\2\2\2\u009c\u00a1\7\6\2\2\u009d"+
		"\u00a0\5\24\13\2\u009e\u00a0\5\30\r\2\u009f\u009d\3\2\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6?\3\2\2\2\u00a6D\3\2\2\2\u00a6I\3\2\2\2\u00a6M\3\2\2\2\u00a6"+
		"X\3\2\2\2\u00a6`\3\2\2\2\u00a6\u0084\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9"+
		"\7\26\2\2\u00a9\u00aa\5\2\2\2\u00aa\27\3\2\2\2\u00ab\u00ac\b\r\1\2\u00ac"+
		"\u00ad\5\n\6\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\5\30\r\n\u00af\u00fc\3"+
		"\2\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\5\20\t\2\u00b2\u00b4\5\30\r\2\u00b3"+
		"\u00b5\7\17\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00fc\3"+
		"\2\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\5\20\t\2\u00b8\u00ba\5\n\6\2\u00b9"+
		"\u00bb\7\17\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00fc\3"+
		"\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\17\2\2\u00be\u00fc\3\2\2\2\u00bf"+
		"\u00c0\5\n\6\2\u00c0\u00c1\7\27\2\2\u00c1\u00c2\5\f\7\2\u00c2\u00c9\7"+
		"\23\2\2\u00c3\u00c8\7\34\2\2\u00c4\u00c8\7\33\2\2\u00c5\u00c8\7\30\2\2"+
		"\u00c6\u00c8\5\26\f\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00d5\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\7\24"+
		"\2\2\u00cd\u00d2\7\34\2\2\u00ce\u00d2\7\33\2\2\u00cf\u00d2\7\30\2\2\u00d0"+
		"\u00d2\5\26\f\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3"+
		"\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7\25\2\2\u00d9\u00db\7\17\2\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00fc\3\2\2\2\u00dc\u00dd\7\23"+
		"\2\2\u00dd\u00de\5\26\f\2\u00de\u00df\7\25\2\2\u00df\u00e0\7\27\2\2\u00e0"+
		"\u00e1\5\f\7\2\u00e1\u00e8\7\23\2\2\u00e2\u00e7\7\34\2\2\u00e3\u00e7\7"+
		"\33\2\2\u00e4\u00e7\7\30\2\2\u00e5\u00e7\5\26\f\2\u00e6\u00e2\3\2\2\2"+
		"\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f4\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00f0\7\24\2\2\u00ec\u00f1\7\34\2\2\u00ed\u00f1\7"+
		"\33\2\2\u00ee\u00f1\7\30\2\2\u00ef\u00f1\5\26\f\2\u00f0\u00ec\3\2\2\2"+
		"\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7\25"+
		"\2\2\u00f8\u00fa\7\17\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\3\2\2\2\u00fb\u00ab\3\2\2\2\u00fb\u00b0\3\2\2\2\u00fb\u00b6\3\2"+
		"\2\2\u00fb\u00bc\3\2\2\2\u00fb\u00bf\3\2\2\2\u00fb\u00dc\3\2\2\2\u00fc"+
		"\u010d\3\2\2\2\u00fd\u00fe\f\b\2\2\u00fe\u00ff\5\20\t\2\u00ff\u0100\5"+
		"\30\r\t\u0100\u010c\3\2\2\2\u0101\u0102\f\7\2\2\u0102\u0106\5\20\t\2\u0103"+
		"\u0107\5\n\6\2\u0104\u0107\7\34\2\2\u0105\u0107\7\33\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\7\17\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3"+
		"\2\2\2\u010b\u00fd\3\2\2\2\u010b\u0101\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\31\3\2\2\2\u010f\u010d\3\2\2"+
		"\2$\37&.\60=KThr{}\u0082\u008c\u0096\u009f\u00a1\u00a6\u00b4\u00ba\u00c7"+
		"\u00c9\u00d1\u00d5\u00da\u00e6\u00e8\u00f0\u00f4\u00f9\u00fb\u0106\u0109"+
		"\u010b\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}