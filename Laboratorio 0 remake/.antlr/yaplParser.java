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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, MINID=25, 
		MAYID=26, NUM=27, STRING=28, DELIMITER=29, QUOTES=30, APOSTROPHE=31, CHAR_LITERAL=32, 
		PARENTESIS=33, COMENTARIO=34, LCOMENTARIO=35;
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
			"'('", "','", "')'", "'new'", "'isvoid'", "'@'", "'.'", null, null, null, 
			null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "MINID", "MAYID", "NUM", "STRING", "DELIMITER", "QUOTES", "APOSTROPHE", 
			"CHAR_LITERAL", "PARENTESIS", "COMENTARIO", "LCOMENTARIO"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << ID))) != 0)) {
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__19);
				setState(167);
				tipoVariable();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__20);
				setState(169);
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
		public List<TipoVariableContext> tipoVariable() {
			return getRuleContexts(TipoVariableContext.class);
		}
		public TipoVariableContext tipoVariable(int i) {
			return getRuleContext(TipoVariableContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(173);
				nombreMetodo();
				setState(174);
				match(T__16);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(175);
					nombreAtributo();
					setState(176);
					match(T__13);
					setState(177);
					tipoVariable();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(184);
					match(T__17);
					setState(185);
					nombreAtributo();
					setState(186);
					match(T__13);
					setState(187);
					tipoVariable();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__18);
				setState(195);
				match(T__13);
				setState(196);
				tipoVariable();
				setState(197);
				match(T__3);
				setState(198);
				metodo(0);
				setState(199);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(201);
				match(T__3);
				setState(202);
				metodo(0);
				setState(203);
				match(T__15);
				}
				break;
			case 3:
				{
				setState(205);
				nombreAtributo();
				setState(206);
				asignacion();
				setState(207);
				metodo(13);
				}
				break;
			case 4:
				{
				setState(209);
				nombreAtributo();
				setState(210);
				operacion();
				setState(211);
				metodo(0);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(212);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(215);
				nombreAtributo();
				setState(216);
				operacion();
				setState(217);
				nombreAtributo();
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(218);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(221);
				nombreAtributo();
				setState(222);
				match(T__12);
				}
				break;
			case 7:
				{
				setState(224);
				nombreMetodo();
				setState(225);
				match(T__16);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(226);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(227);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(228);
						match(ID);
						}
						break;
					case 4:
						{
						setState(229);
						inicializar();
						}
						break;
					case 5:
						{
						setState(230);
						metodo(0);
						}
						break;
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(236);
					match(T__17);
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(237);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(238);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(239);
						match(ID);
						}
						break;
					case 4:
						{
						setState(240);
						inicializar();
						}
						break;
					case 5:
						{
						setState(241);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(T__18);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(250);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(253);
				nombreMetodo();
				setState(254);
				match(T__16);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(255);
					match(ID);
					setState(256);
					match(T__13);
					setState(257);
					tipoVariable();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(263);
					match(T__17);
					setState(264);
					match(ID);
					setState(265);
					match(T__13);
					setState(266);
					tipoVariable();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(T__18);
				setState(273);
				match(T__13);
				setState(274);
				tipoVariable();
				setState(275);
				match(T__3);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(276);
					metodo(0);
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(282);
				match(T__15);
				setState(284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(283);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(286);
				nombreMetodo();
				setState(287);
				match(T__16);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(288);
					match(ID);
					setState(289);
					match(T__13);
					setState(290);
					tipoVariable();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(296);
					match(T__17);
					setState(297);
					match(ID);
					setState(298);
					match(T__13);
					setState(299);
					tipoVariable();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
				match(T__18);
				setState(306);
				match(T__13);
				setState(307);
				tipoVariable();
				setState(308);
				match(T__3);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(309);
					metodo(0);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__4);
				}
				break;
			case 10:
				{
				setState(317);
				match(T__16);
				setState(318);
				inicializar();
				setState(319);
				match(T__18);
				}
				break;
			case 11:
				{
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(321);
					nombreMetodo();
					}
					break;
				case 2:
					{
					setState(322);
					tipoVariable();
					}
					break;
				}
				setState(325);
				match(T__22);
				setState(326);
				nombreMetodo();
				setState(327);
				match(T__16);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(328);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(329);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(330);
						match(ID);
						}
						break;
					case 4:
						{
						setState(331);
						inicializar();
						}
						break;
					case 5:
						{
						setState(332);
						metodo(0);
						}
						break;
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(338);
					match(T__17);
					setState(344);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(339);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(340);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(341);
						match(ID);
						}
						break;
					case 4:
						{
						setState(342);
						inicializar();
						}
						break;
					case 5:
						{
						setState(343);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(T__18);
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(352);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(355);
				match(T__16);
				setState(356);
				inicializar();
				setState(357);
				match(T__18);
				setState(358);
				match(T__22);
				setState(359);
				nombreMetodo();
				setState(360);
				match(T__16);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(361);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(362);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(363);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(364);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(370);
					match(T__17);
					setState(375);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(371);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(372);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(373);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(374);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(382);
				match(T__18);
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(383);
					match(T__12);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(409);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(388);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(389);
						asignacion();
						setState(390);
						metodo(15);
						}
						break;
					case 2:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(392);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(393);
						operacion();
						setState(394);
						metodo(12);
						}
						break;
					case 3:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(396);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(397);
						match(T__21);
						setState(398);
						metodo(4);
						}
						break;
					case 4:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(399);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(400);
						operacion();
						setState(404);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(401);
							nombreAtributo();
							}
							break;
						case STRING:
							{
							setState(402);
							match(STRING);
							}
							break;
						case NUM:
							{
							setState(403);
							match(NUM);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(406);
							match(T__12);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u01a1\4\2\t\2\4"+
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
		"\13\u00a7\n\13\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c0\n\r"+
		"\f\r\16\r\u00c3\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\r\3\r\3\r\3\r\5\r\u00de\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ea\n\r\f\r\16\r\u00ed"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\7\r\u00f7\n\r\f\r\16\r\u00fa"+
		"\13\r\3\r\3\r\5\r\u00fe\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0105\n\r\f\r\16\r"+
		"\u0108\13\r\3\r\3\r\3\r\3\r\7\r\u010e\n\r\f\r\16\r\u0111\13\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0118\n\r\f\r\16\r\u011b\13\r\3\r\3\r\5\r\u011f\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u0126\n\r\f\r\16\r\u0129\13\r\3\r\3\r\3\r\3\r\7"+
		"\r\u012f\n\r\f\r\16\r\u0132\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u0139\n\r\f\r"+
		"\16\r\u013c\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0146\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0150\n\r\f\r\16\r\u0153\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u015b\n\r\7\r\u015d\n\r\f\r\16\r\u0160\13\r\3\r\3\r\5"+
		"\r\u0164\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0170\n\r\f\r"+
		"\16\r\u0173\13\r\3\r\3\r\3\r\3\r\3\r\5\r\u017a\n\r\7\r\u017c\n\r\f\r\16"+
		"\r\u017f\13\r\3\r\3\r\5\r\u0183\n\r\5\r\u0185\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0197\n\r\3\r\5\r\u019a"+
		"\n\r\7\r\u019c\n\r\f\r\16\r\u019f\13\r\3\r\2\3\30\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\5\4\2\3\3\32\32\3\2\b\t\3\2\n\r\2\u01e9\2\32\3\2\2\2\4"+
		"\37\3\2\2\2\6\"\3\2\2\2\b\60\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16\67\3"+
		"\2\2\2\209\3\2\2\2\22;\3\2\2\2\24\u00a6\3\2\2\2\26\u00ac\3\2\2\2\30\u0184"+
		"\3\2\2\2\32\33\t\2\2\2\33\3\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\37\3\2\2\2\"#\7\4\2\2#&\7"+
		"\32\2\2$%\7\5\2\2%\'\7\32\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\6\2"+
		"\2)*\5\b\5\2*+\7\7\2\2+\7\3\2\2\2,/\5\24\13\2-/\5\30\r\2.,\3\2\2\2.-\3"+
		"\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3\2\2\2\62\60\3\2\2"+
		"\2\63\64\7\32\2\2\64\13\3\2\2\2\65\66\7\32\2\2\66\r\3\2\2\2\678\t\3\2"+
		"\28\17\3\2\2\29:\t\4\2\2:\21\3\2\2\2;=\7\16\2\2<>\7\17\2\2=<\3\2\2\2="+
		">\3\2\2\2>\23\3\2\2\2?@\5\n\6\2@A\7\20\2\2AB\5\2\2\2BC\7\17\2\2C\u00a7"+
		"\3\2\2\2DE\5\n\6\2EF\7\21\2\2FG\5\2\2\2GH\7\17\2\2H\u00a7\3\2\2\2IK\5"+
		"\22\n\2JL\7\17\2\2KJ\3\2\2\2KL\3\2\2\2L\u00a7\3\2\2\2MN\5\n\6\2NO\7\20"+
		"\2\2OP\5\2\2\2PT\5\16\b\2QU\5\n\6\2RU\7\36\2\2SU\7\35\2\2TQ\3\2\2\2TR"+
		"\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\7\17\2\2W\u00a7\3\2\2\2XY\5\n\6\2YZ\7\20"+
		"\2\2Z[\5\2\2\2[\\\7\6\2\2\\]\5\n\6\2]^\7\22\2\2^_\7\17\2\2_\u00a7\3\2"+
		"\2\2`a\5\n\6\2ah\7\23\2\2bc\5\n\6\2cd\7\20\2\2de\5\2\2\2eg\3\2\2\2fb\3"+
		"\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ir\3\2\2\2jh\3\2\2\2kl\7\24\2\2lm"+
		"\5\n\6\2mn\7\20\2\2no\5\2\2\2oq\3\2\2\2pk\3\2\2\2qt\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\25\2\2vw\7\20\2\2wx\5\2\2\2x}\7\6\2"+
		"\2y|\5\24\13\2z|\5\30\r\2{y\3\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}"+
		"~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0082\7\22\2\2\u0081\u0083"+
		"\7\17\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u00a7\3\2\2\2"+
		"\u0084\u0085\5\n\6\2\u0085\u008c\7\23\2\2\u0086\u0087\5\n\6\2\u0087\u0088"+
		"\7\20\2\2\u0088\u0089\5\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0096"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\24\2\2\u0090\u0091\5\n\6\2"+
		"\u0091\u0092\7\20\2\2\u0092\u0093\5\2\2\2\u0093\u0095\3\2\2\2\u0094\u008f"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\25\2\2\u009a\u009b\7"+
		"\20\2\2\u009b\u009c\5\2\2\2\u009c\u00a1\7\6\2\2\u009d\u00a0\5\24\13\2"+
		"\u009e\u00a0\5\30\r\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a7\3\2\2\2\u00a6?\3\2\2\2"+
		"\u00a6D\3\2\2\2\u00a6I\3\2\2\2\u00a6M\3\2\2\2\u00a6X\3\2\2\2\u00a6`\3"+
		"\2\2\2\u00a6\u0084\3\2\2\2\u00a7\25\3\2\2\2\u00a8\u00a9\7\26\2\2\u00a9"+
		"\u00ad\5\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ad\5\22\n\2\u00ac\u00a8\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af\b\r\1\2\u00af"+
		"\u00b0\5\f\7\2\u00b0\u00b7\7\23\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3\7"+
		"\20\2\2\u00b3\u00b4\5\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c1\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00bc\5\n\6\2\u00bc"+
		"\u00bd\7\20\2\2\u00bd\u00be\5\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00ba\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\25\2\2\u00c5\u00c6\7"+
		"\20\2\2\u00c6\u00c7\5\2\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\5\30\r\2\u00c9"+
		"\u00ca\7\7\2\2\u00ca\u0185\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\5\30"+
		"\r\2\u00cd\u00ce\7\22\2\2\u00ce\u0185\3\2\2\2\u00cf\u00d0\5\n\6\2\u00d0"+
		"\u00d1\5\16\b\2\u00d1\u00d2\5\30\r\17\u00d2\u0185\3\2\2\2\u00d3\u00d4"+
		"\5\n\6\2\u00d4\u00d5\5\20\t\2\u00d5\u00d7\5\30\r\2\u00d6\u00d8\7\17\2"+
		"\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u0185\3\2\2\2\u00d9\u00da"+
		"\5\n\6\2\u00da\u00db\5\20\t\2\u00db\u00dd\5\n\6\2\u00dc\u00de\7\17\2\2"+
		"\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u0185\3\2\2\2\u00df\u00e0"+
		"\5\n\6\2\u00e0\u00e1\7\17\2\2\u00e1\u0185\3\2\2\2\u00e2\u00e3\5\f\7\2"+
		"\u00e3\u00eb\7\23\2\2\u00e4\u00ea\7\36\2\2\u00e5\u00ea\7\35\2\2\u00e6"+
		"\u00ea\7\32\2\2\u00e7\u00ea\5\26\f\2\u00e8\u00ea\5\30\r\2\u00e9\u00e4"+
		"\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f8\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f4\7\24\2\2\u00ef"+
		"\u00f5\7\36\2\2\u00f0\u00f5\7\35\2\2\u00f1\u00f5\7\32\2\2\u00f2\u00f5"+
		"\5\26\f\2\u00f3\u00f5\5\30\r\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2"+
		"\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\25"+
		"\2\2\u00fc\u00fe\7\17\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0185\3\2\2\2\u00ff\u0100\5\f\7\2\u0100\u0106\7\23\2\2\u0101\u0102\7"+
		"\32\2\2\u0102\u0103\7\20\2\2\u0103\u0105\5\2\2\2\u0104\u0101\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010f\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\24\2\2\u010a\u010b\7\32\2\2\u010b"+
		"\u010c\7\20\2\2\u010c\u010e\5\2\2\2\u010d\u0109\3\2\2\2\u010e\u0111\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0113\7\25\2\2\u0113\u0114\7\20\2\2\u0114\u0115\5"+
		"\2\2\2\u0115\u0119\7\6\2\2\u0116\u0118\5\30\r\2\u0117\u0116\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011c\u011e\7\22\2\2\u011d\u011f\7\17\2\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0185\3\2\2\2\u0120\u0121\5\f"+
		"\7\2\u0121\u0127\7\23\2\2\u0122\u0123\7\32\2\2\u0123\u0124\7\20\2\2\u0124"+
		"\u0126\5\2\2\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0130\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012b\7\24\2\2\u012b\u012c\7\32\2\2\u012c\u012d\7\20\2\2\u012d\u012f"+
		"\5\2\2\2\u012e\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\25"+
		"\2\2\u0134\u0135\7\20\2\2\u0135\u0136\5\2\2\2\u0136\u013a\7\6\2\2\u0137"+
		"\u0139\5\30\r\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u013e\7\7\2\2\u013e\u0185\3\2\2\2\u013f\u0140\7\23\2\2\u0140\u0141\5"+
		"\26\f\2\u0141\u0142\7\25\2\2\u0142\u0185\3\2\2\2\u0143\u0146\5\f\7\2\u0144"+
		"\u0146\5\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\7\31\2\2\u0148\u0149\5\f\7\2\u0149\u0151\7\23\2\2\u014a"+
		"\u0150\7\36\2\2\u014b\u0150\7\35\2\2\u014c\u0150\7\32\2\2\u014d\u0150"+
		"\5\26\f\2\u014e\u0150\5\30\r\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2\2\2"+
		"\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u015e\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u015a\7\24\2\2\u0155\u015b\7\36\2\2\u0156\u015b\7"+
		"\35\2\2\u0157\u015b\7\32\2\2\u0158\u015b\5\26\f\2\u0159\u015b\5\30\r\2"+
		"\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u0154\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7\25\2\2\u0162\u0164\7\17\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0185\3\2\2\2\u0165\u0166\7\23"+
		"\2\2\u0166\u0167\5\26\f\2\u0167\u0168\7\25\2\2\u0168\u0169\7\31\2\2\u0169"+
		"\u016a\5\f\7\2\u016a\u0171\7\23\2\2\u016b\u0170\7\36\2\2\u016c\u0170\7"+
		"\35\2\2\u016d\u0170\7\32\2\2\u016e\u0170\5\26\f\2\u016f\u016b\3\2\2\2"+
		"\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u017d\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0179\7\24\2\2\u0175\u017a\7\36\2\2\u0176\u017a\7"+
		"\35\2\2\u0177\u017a\7\32\2\2\u0178\u017a\5\26\f\2\u0179\u0175\3\2\2\2"+
		"\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017c"+
		"\3\2\2\2\u017b\u0174\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7\25"+
		"\2\2\u0181\u0183\7\17\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u00ae\3\2\2\2\u0184\u00cb\3\2\2\2\u0184\u00cf\3\2"+
		"\2\2\u0184\u00d3\3\2\2\2\u0184\u00d9\3\2\2\2\u0184\u00df\3\2\2\2\u0184"+
		"\u00e2\3\2\2\2\u0184\u00ff\3\2\2\2\u0184\u0120\3\2\2\2\u0184\u013f\3\2"+
		"\2\2\u0184\u0145\3\2\2\2\u0184\u0165\3\2\2\2\u0185\u019d\3\2\2\2\u0186"+
		"\u0187\f\20\2\2\u0187\u0188\5\16\b\2\u0188\u0189\5\30\r\21\u0189\u019c"+
		"\3\2\2\2\u018a\u018b\f\r\2\2\u018b\u018c\5\20\t\2\u018c\u018d\5\30\r\16"+
		"\u018d\u019c\3\2\2\2\u018e\u018f\f\5\2\2\u018f\u0190\7\30\2\2\u0190\u019c"+
		"\5\30\r\6\u0191\u0192\f\f\2\2\u0192\u0196\5\20\t\2\u0193\u0197\5\n\6\2"+
		"\u0194\u0197\7\36\2\2\u0195\u0197\7\35\2\2\u0196\u0193\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0195\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\7\17\2\2"+
		"\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0186"+
		"\3\2\2\2\u019b\u018a\3\2\2\2\u019b\u018e\3\2\2\2\u019b\u0191\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\31\3\2\2"+
		"\2\u019f\u019d\3\2\2\2\64\37&.\60=KThr{}\u0082\u008c\u0096\u009f\u00a1"+
		"\u00a6\u00ac\u00b7\u00c1\u00d7\u00dd\u00e9\u00eb\u00f4\u00f8\u00fd\u0106"+
		"\u010f\u0119\u011e\u0127\u0130\u013a\u0145\u014f\u0151\u015a\u015e\u0163"+
		"\u016f\u0171\u0179\u017d\u0182\u0184\u0196\u0199\u019b\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}