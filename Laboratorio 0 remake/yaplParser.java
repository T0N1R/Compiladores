// Generated from yapl.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, ID=36, MINID=37, MAYID=38, NUM=39, 
		STRING=40, DELIMITER=41, QUOTES=42, APOSTROPHE=43, CHAR_LITERAL=44, PARENTESIS=45, 
		COMENTARIO=46, LCOMENTARIO=47;
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
			"'('", "','", "')'", "'new'", "'isvoid'", "'.'", "'let'", "'in'", "'<'", 
			"'>'", "'not'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'loop'", 
			"'pool'", "'@'", null, null, null, null, null, null, "'\"'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitTipoVariable(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitStart(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitClase(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterFeature_clases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitFeature_clases(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterNombreAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitNombreAtributo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterNombreMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitNombreMetodo(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitAsignacion(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitOperacion(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitSelf(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterDeclararAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitDeclararAtributo(this);
		}
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterInicializar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitInicializar(this);
		}
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
		public List<NombreAtributoContext> nombreAtributo() {
			return getRuleContexts(NombreAtributoContext.class);
		}
		public NombreAtributoContext nombreAtributo(int i) {
			return getRuleContext(NombreAtributoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(yaplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(yaplParser.ID, i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaplListener ) ((yaplListener)listener).exitMetodo(this);
		}
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(173);
				nombreMetodo();
				setState(174);
				match(T__16);
				setState(175);
				metodo(0);
				setState(176);
				match(T__18);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(177);
					match(T__21);
					setState(178);
					metodo(0);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(186);
				nombreMetodo();
				setState(187);
				match(T__16);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(188);
					nombreAtributo();
					setState(189);
					match(T__13);
					setState(190);
					tipoVariable();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(197);
					match(T__17);
					setState(198);
					nombreAtributo();
					setState(199);
					match(T__13);
					setState(200);
					tipoVariable();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__18);
				setState(208);
				match(T__13);
				setState(209);
				tipoVariable();
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(210);
					match(T__3);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
						{
						{
						setState(211);
						metodo(0);
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(217);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(218);
					match(T__3);
					setState(219);
					match(T__3);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
						{
						{
						setState(220);
						metodo(0);
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(226);
					match(T__15);
					setState(227);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(230);
				match(T__3);
				setState(231);
				metodo(0);
				setState(232);
				match(T__15);
				}
				break;
			case 4:
				{
				setState(234);
				match(T__16);
				setState(235);
				metodo(0);
				setState(236);
				match(T__18);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(237);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(240);
				match(T__22);
				setState(241);
				match(ID);
				setState(242);
				match(T__13);
				setState(243);
				tipoVariable();
				setState(244);
				match(T__23);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(245);
							metodo(0);
							}
							} 
						}
						setState(250);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				case 2:
					{
					setState(251);
					match(T__3);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
						{
						{
						setState(252);
						metodo(0);
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(258);
					match(T__15);
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(261);
				nombreAtributo();
				setState(262);
				asignacion();
				setState(263);
				metodo(20);
				}
				break;
			case 7:
				{
				setState(265);
				nombreAtributo();
				setState(266);
				operacion();
				setState(267);
				metodo(0);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(268);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 8:
				{
				setState(271);
				match(T__26);
				setState(272);
				metodo(0);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(273);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 9:
				{
				setState(276);
				match(T__27);
				setState(277);
				metodo(0);
				setState(278);
				match(T__28);
				setState(279);
				metodo(0);
				setState(280);
				match(T__29);
				setState(281);
				metodo(0);
				setState(282);
				match(T__30);
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
			case 10:
				{
				setState(286);
				match(T__31);
				setState(287);
				metodo(0);
				setState(288);
				match(T__32);
				setState(289);
				metodo(0);
				setState(290);
				match(T__33);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(291);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 11:
				{
				setState(294);
				nombreAtributo();
				setState(295);
				operacion();
				setState(296);
				nombreAtributo();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(297);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(300);
				nombreAtributo();
				setState(301);
				match(T__12);
				}
				break;
			case 13:
				{
				setState(303);
				nombreMetodo();
				setState(304);
				match(T__16);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(305);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(306);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(307);
						match(ID);
						}
						break;
					case 4:
						{
						setState(308);
						inicializar();
						}
						break;
					case 5:
						{
						setState(309);
						metodo(0);
						}
						break;
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(315);
					match(T__17);
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(316);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(317);
						match(NUM);
						}
						break;
					case 3:
						{
						setState(318);
						match(ID);
						}
						break;
					case 4:
						{
						setState(319);
						inicializar();
						}
						break;
					case 5:
						{
						setState(320);
						metodo(0);
						}
						break;
					}
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(T__18);
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(329);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 14:
				{
				setState(332);
				nombreMetodo();
				setState(333);
				match(T__16);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(334);
					match(ID);
					setState(335);
					match(T__13);
					setState(336);
					tipoVariable();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(342);
					match(T__17);
					setState(343);
					match(ID);
					setState(344);
					match(T__13);
					setState(345);
					tipoVariable();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(T__18);
				setState(352);
				match(T__13);
				setState(353);
				tipoVariable();
				setState(354);
				match(T__3);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
					{
					{
					setState(355);
					metodo(0);
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361);
				match(T__15);
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(362);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 15:
				{
				setState(365);
				nombreMetodo();
				setState(366);
				match(T__16);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(367);
					match(ID);
					setState(368);
					match(T__13);
					setState(369);
					tipoVariable();
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(375);
					match(T__17);
					setState(376);
					match(ID);
					setState(377);
					match(T__13);
					setState(378);
					tipoVariable();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				match(T__18);
				setState(385);
				match(T__13);
				setState(386);
				tipoVariable();
				setState(387);
				match(T__3);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID))) != 0)) {
					{
					{
					setState(388);
					metodo(0);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(T__4);
				}
				break;
			case 16:
				{
				setState(396);
				match(T__16);
				setState(397);
				inicializar();
				setState(398);
				match(T__18);
				}
				break;
			case 17:
				{
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(400);
					nombreMetodo();
					}
					break;
				case 2:
					{
					setState(401);
					tipoVariable();
					}
					break;
				}
				setState(404);
				match(T__21);
				setState(405);
				nombreMetodo();
				setState(406);
				match(T__16);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
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
				while (_la==T__17) {
					{
					{
					setState(417);
					match(T__17);
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
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
				match(T__18);
				setState(432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(431);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 18:
				{
				setState(434);
				match(T__16);
				setState(435);
				inicializar();
				setState(436);
				match(T__18);
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(437);
						match(T__21);
						setState(438);
						metodo(0);
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case 19:
				{
				setState(444);
				match(T__16);
				setState(445);
				inicializar();
				setState(446);
				match(T__18);
				setState(447);
				match(T__21);
				setState(448);
				nombreMetodo();
				setState(449);
				match(T__16);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(454);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(450);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(451);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(452);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(453);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(459);
					match(T__17);
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING:
						{
						setState(460);
						match(STRING);
						}
						break;
					case NUM:
						{
						setState(461);
						match(NUM);
						}
						break;
					case ID:
						{
						setState(462);
						match(ID);
						}
						break;
					case T__19:
					case T__20:
						{
						setState(463);
						inicializar();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471);
				match(T__18);
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(472);
					match(T__12);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(477);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(478);
						asignacion();
						setState(479);
						metodo(22);
						}
						break;
					case 2:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(481);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(482);
						operacion();
						setState(483);
						metodo(19);
						}
						break;
					case 3:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(485);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(486);
						match(T__34);
						setState(487);
						metodo(5);
						}
						break;
					case 4:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(488);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(489);
						match(T__24);
						setState(490);
						metodo(0);
						setState(492);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
						case 1:
							{
							setState(491);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 5:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(494);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(495);
						match(T__25);
						setState(496);
						metodo(0);
						setState(498);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(497);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 6:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(500);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(501);
						match(T__6);
						setState(502);
						metodo(0);
						setState(504);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(503);
							match(T__12);
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new MetodoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_metodo);
						setState(506);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(507);
						operacion();
						setState(511);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(508);
							nombreAtributo();
							}
							break;
						case STRING:
							{
							setState(509);
							match(STRING);
							}
							break;
						case NUM:
							{
							setState(510);
							match(NUM);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(514);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
						case 1:
							{
							setState(513);
							match(T__12);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u020a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u001c\b\u0001\n\u0001\f\u0001"+
		"\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"%\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\b<\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tJ\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tS\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\te\b\t\n\t\f\th\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\to"+
		"\b\t\n\t\f\tr\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tz\b\t\n\t\f\t}\t\t\u0001\t\u0001\t\u0003\t\u0081\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0093\b\t\n\t\f\t\u0096\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009e\b\t\n\t"+
		"\f\t\u00a1\t\t\u0001\t\u0001\t\u0003\t\u00a5\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b4\b\u000b\n"+
		"\u000b\f\u000b\u00b7\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c1"+
		"\b\u000b\n\u000b\f\u000b\u00c4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00cb\b\u000b\n\u000b\f\u000b\u00ce"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00d5\b\u000b\n\u000b\f\u000b\u00d8\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ef\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f7\b\u000b\n\u000b"+
		"\f\u000b\u00fa\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00fe\b\u000b"+
		"\n\u000b\f\u000b\u0101\t\u000b\u0001\u000b\u0003\u000b\u0104\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u010e\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0113\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u011d"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0125\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u012b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0137\b\u000b\n\u000b\f\u000b\u013a\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0142\b\u000b\u0005\u000b\u0144\b\u000b\n\u000b\f\u000b\u0147\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u014b\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0152\b\u000b\n\u000b"+
		"\f\u000b\u0155\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u015b\b\u000b\n\u000b\f\u000b\u015e\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0165\b\u000b\n"+
		"\u000b\f\u000b\u0168\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u016c"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0173\b\u000b\n\u000b\f\u000b\u0176\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u017c\b\u000b\n\u000b\f\u000b\u017f"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0186\b\u000b\n\u000b\f\u000b\u0189\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0193\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u019d\b\u000b"+
		"\n\u000b\f\u000b\u01a0\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01a8\b\u000b\u0005\u000b\u01aa"+
		"\b\u000b\n\u000b\f\u000b\u01ad\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u01b1\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u01b8\b\u000b\n\u000b\f\u000b\u01bb\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u01c7\b\u000b\n\u000b\f\u000b"+
		"\u01ca\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u01d1\b\u000b\u0005\u000b\u01d3\b\u000b\n\u000b\f\u000b\u01d6"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01da\b\u000b\u0003\u000b"+
		"\u01dc\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01ed\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01f3\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01f9\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0200\b\u000b\u0001\u000b\u0003\u000b\u0203\b\u000b\u0005\u000b\u0205"+
		"\b\u000b\n\u000b\f\u000b\u0208\t\u000b\u0001\u000b\u0000\u0001\u0016\f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0003"+
		"\u0002\u0000\u0001\u0001$$\u0001\u0000\u0006\u0007\u0001\u0000\b\u000b"+
		"\u026b\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004 \u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000\f5\u0001\u0000\u0000"+
		"\u0000\u000e7\u0001\u0000\u0000\u0000\u00109\u0001\u0000\u0000\u0000\u0012"+
		"\u00a4\u0001\u0000\u0000\u0000\u0014\u00aa\u0001\u0000\u0000\u0000\u0016"+
		"\u01db\u0001\u0000\u0000\u0000\u0018\u0019\u0007\u0000\u0000\u0000\u0019"+
		"\u0001\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0004\u0002\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u0003\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005"+
		"\u0002\u0000\u0000!$\u0005$\u0000\u0000\"#\u0005\u0003\u0000\u0000#%\u0005"+
		"$\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0003\u0006\u0003\u0000"+
		"()\u0005\u0005\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*-\u0003\u0012"+
		"\t\u0000+-\u0003\u0016\u000b\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/\u0007\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000012\u0005$\u0000\u00002\t\u0001\u0000\u0000\u000034\u0005$\u0000"+
		"\u00004\u000b\u0001\u0000\u0000\u000056\u0007\u0001\u0000\u00006\r\u0001"+
		"\u0000\u0000\u000078\u0007\u0002\u0000\u00008\u000f\u0001\u0000\u0000"+
		"\u00009;\u0005\f\u0000\u0000:<\u0005\r\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\u0011\u0001\u0000\u0000\u0000=>\u0003"+
		"\b\u0004\u0000>?\u0005\u000e\u0000\u0000?@\u0003\u0000\u0000\u0000@A\u0005"+
		"\r\u0000\u0000A\u00a5\u0001\u0000\u0000\u0000BC\u0003\b\u0004\u0000CD"+
		"\u0005\u000f\u0000\u0000DE\u0003\u0000\u0000\u0000EF\u0005\r\u0000\u0000"+
		"F\u00a5\u0001\u0000\u0000\u0000GI\u0003\u0010\b\u0000HJ\u0005\r\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u00a5\u0001"+
		"\u0000\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\u000e\u0000\u0000MN\u0003"+
		"\u0000\u0000\u0000NR\u0003\f\u0006\u0000OS\u0003\b\u0004\u0000PS\u0005"+
		"(\u0000\u0000QS\u0005\'\u0000\u0000RO\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0005\r\u0000\u0000U\u00a5\u0001\u0000\u0000\u0000VW\u0003\b\u0004"+
		"\u0000WX\u0005\u000e\u0000\u0000XY\u0003\u0000\u0000\u0000YZ\u0005\u0004"+
		"\u0000\u0000Z[\u0003\b\u0004\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005"+
		"\r\u0000\u0000]\u00a5\u0001\u0000\u0000\u0000^_\u0003\b\u0004\u0000_f"+
		"\u0005\u0011\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005\u000e\u0000\u0000"+
		"bc\u0003\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000"+
		"\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gp\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0012\u0000\u0000jk\u0003\b\u0004\u0000kl\u0005\u000e\u0000\u0000lm\u0003"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0013"+
		"\u0000\u0000tu\u0005\u000e\u0000\u0000uv\u0003\u0000\u0000\u0000v{\u0005"+
		"\u0004\u0000\u0000wz\u0003\u0012\t\u0000xz\u0003\u0016\u000b\u0000yw\u0001"+
		"\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0005\u0010\u0000\u0000\u007f"+
		"\u0081\u0005\r\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u00a5\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0003\b\u0004\u0000\u0083\u008a\u0005\u0011\u0000\u0000\u0084\u0085\u0003"+
		"\b\u0004\u0000\u0085\u0086\u0005\u000e\u0000\u0000\u0086\u0087\u0003\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0094\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0012"+
		"\u0000\u0000\u008e\u008f\u0003\b\u0004\u0000\u008f\u0090\u0005\u000e\u0000"+
		"\u0000\u0090\u0091\u0003\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0013\u0000\u0000\u0098\u0099\u0005\u000e\u0000"+
		"\u0000\u0099\u009a\u0003\u0000\u0000\u0000\u009a\u009f\u0005\u0004\u0000"+
		"\u0000\u009b\u009e\u0003\u0012\t\u0000\u009c\u009e\u0003\u0016\u000b\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4=\u0001\u0000\u0000\u0000\u00a4"+
		"B\u0001\u0000\u0000\u0000\u00a4G\u0001\u0000\u0000\u0000\u00a4K\u0001"+
		"\u0000\u0000\u0000\u00a4V\u0001\u0000\u0000\u0000\u00a4^\u0001\u0000\u0000"+
		"\u0000\u00a4\u0082\u0001\u0000\u0000\u0000\u00a5\u0013\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0014\u0000\u0000\u00a7\u00ab\u0003\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0015\u0000\u0000\u00a9\u00ab\u0003\u0010\b\u0000"+
		"\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u000b\uffff\uffff"+
		"\u0000\u00ad\u00ae\u0003\n\u0005\u0000\u00ae\u00af\u0005\u0011\u0000\u0000"+
		"\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0\u00b5\u0005\u0013\u0000\u0000"+
		"\u00b1\u00b2\u0005\u0016\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u01dc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003\n\u0005\u0000\u00bb\u00c2\u0005\u0011\u0000\u0000\u00bc\u00bd"+
		"\u0003\b\u0004\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be\u00bf\u0003"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00cc\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u0012\u0000\u0000\u00c6\u00c7\u0003\b\u0004\u0000\u00c7\u00c8\u0005\u000e"+
		"\u0000\u0000\u00c8\u00c9\u0003\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0013\u0000\u0000\u00d0\u00d1\u0005\u000e"+
		"\u0000\u0000\u00d1\u00e4\u0003\u0000\u0000\u0000\u00d2\u00d6\u0005\u0004"+
		"\u0000\u0000\u00d3\u00d5\u0003\u0016\u000b\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00e5\u0005\u0005"+
		"\u0000\u0000\u00da\u00db\u0005\u0004\u0000\u0000\u00db\u00df\u0005\u0004"+
		"\u0000\u0000\u00dc\u00de\u0003\u0016\u000b\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0010"+
		"\u0000\u0000\u00e3\u00e5\u0005\u0005\u0000\u0000\u00e4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00da\u0001\u0000\u0000\u0000\u00e5\u01dc\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0004\u0000\u0000\u00e7\u00e8\u0003\u0016"+
		"\u000b\u0000\u00e8\u00e9\u0005\u0010\u0000\u0000\u00e9\u01dc\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0011\u0000\u0000\u00eb\u00ec\u0003\u0016"+
		"\u000b\u0000\u00ec\u00ee\u0005\u0013\u0000\u0000\u00ed\u00ef\u0005\r\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u01dc\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0017\u0000"+
		"\u0000\u00f1\u00f2\u0005$\u0000\u0000\u00f2\u00f3\u0005\u000e\u0000\u0000"+
		"\u00f3\u00f4\u0003\u0000\u0000\u0000\u00f4\u0103\u0005\u0018\u0000\u0000"+
		"\u00f5\u00f7\u0003\u0016\u000b\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0104\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\u0004\u0000\u0000"+
		"\u00fc\u00fe\u0003\u0016\u000b\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u0010\u0000\u0000"+
		"\u0103\u00f8\u0001\u0000\u0000\u0000\u0103\u00fb\u0001\u0000\u0000\u0000"+
		"\u0104\u01dc\u0001\u0000\u0000\u0000\u0105\u0106\u0003\b\u0004\u0000\u0106"+
		"\u0107\u0003\f\u0006\u0000\u0107\u0108\u0003\u0016\u000b\u0014\u0108\u01dc"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0003\b\u0004\u0000\u010a\u010b\u0003"+
		"\u000e\u0007\u0000\u010b\u010d\u0003\u0016\u000b\u0000\u010c\u010e\u0005"+
		"\r\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u01dc\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001b"+
		"\u0000\u0000\u0110\u0112\u0003\u0016\u000b\u0000\u0111\u0113\u0005\r\u0000"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u01dc\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u001c\u0000"+
		"\u0000\u0115\u0116\u0003\u0016\u000b\u0000\u0116\u0117\u0005\u001d\u0000"+
		"\u0000\u0117\u0118\u0003\u0016\u000b\u0000\u0118\u0119\u0005\u001e\u0000"+
		"\u0000\u0119\u011a\u0003\u0016\u000b\u0000\u011a\u011c\u0005\u001f\u0000"+
		"\u0000\u011b\u011d\u0005\r\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u01dc\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005 \u0000\u0000\u011f\u0120\u0003\u0016\u000b\u0000\u0120"+
		"\u0121\u0005!\u0000\u0000\u0121\u0122\u0003\u0016\u000b\u0000\u0122\u0124"+
		"\u0005\"\u0000\u0000\u0123\u0125\u0005\r\u0000\u0000\u0124\u0123\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u01dc\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0003\b\u0004\u0000\u0127\u0128\u0003\u000e"+
		"\u0007\u0000\u0128\u012a\u0003\b\u0004\u0000\u0129\u012b\u0005\r\u0000"+
		"\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u01dc\u0001\u0000\u0000\u0000\u012c\u012d\u0003\b\u0004\u0000"+
		"\u012d\u012e\u0005\r\u0000\u0000\u012e\u01dc\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0003\n\u0005\u0000\u0130\u0138\u0005\u0011\u0000\u0000\u0131\u0137"+
		"\u0005(\u0000\u0000\u0132\u0137\u0005\'\u0000\u0000\u0133\u0137\u0005"+
		"$\u0000\u0000\u0134\u0137\u0003\u0014\n\u0000\u0135\u0137\u0003\u0016"+
		"\u000b\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000"+
		"\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u0145\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013b\u0141\u0005\u0012\u0000\u0000\u013c\u0142\u0005(\u0000"+
		"\u0000\u013d\u0142\u0005\'\u0000\u0000\u013e\u0142\u0005$\u0000\u0000"+
		"\u013f\u0142\u0003\u0014\n\u0000\u0140\u0142\u0003\u0016\u000b\u0000\u0141"+
		"\u013c\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u013b\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146"+
		"\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u014a\u0005\u0013\u0000\u0000\u0149\u014b\u0005\r\u0000\u0000\u014a\u0149"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u01dc"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0003\n\u0005\u0000\u014d\u0153\u0005"+
		"\u0011\u0000\u0000\u014e\u014f\u0005$\u0000\u0000\u014f\u0150\u0005\u000e"+
		"\u0000\u0000\u0150\u0152\u0003\u0000\u0000\u0000\u0151\u014e\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u015c\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0012"+
		"\u0000\u0000\u0157\u0158\u0005$\u0000\u0000\u0158\u0159\u0005\u000e\u0000"+
		"\u0000\u0159\u015b\u0003\u0000\u0000\u0000\u015a\u0156\u0001\u0000\u0000"+
		"\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000"+
		"\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0013\u0000"+
		"\u0000\u0160\u0161\u0005\u000e\u0000\u0000\u0161\u0162\u0003\u0000\u0000"+
		"\u0000\u0162\u0166\u0005\u0004\u0000\u0000\u0163\u0165\u0003\u0016\u000b"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000"+
		"\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0005\u0010\u0000\u0000\u016a\u016c\u0005\r\u0000\u0000"+
		"\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u01dc\u0001\u0000\u0000\u0000\u016d\u016e\u0003\n\u0005\u0000\u016e"+
		"\u0174\u0005\u0011\u0000\u0000\u016f\u0170\u0005$\u0000\u0000\u0170\u0171"+
		"\u0005\u000e\u0000\u0000\u0171\u0173\u0003\u0000\u0000\u0000\u0172\u016f"+
		"\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u017d"+
		"\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0005\u0012\u0000\u0000\u0178\u0179\u0005$\u0000\u0000\u0179\u017a\u0005"+
		"\u000e\u0000\u0000\u017a\u017c\u0003\u0000\u0000\u0000\u017b\u0177\u0001"+
		"\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001"+
		"\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005"+
		"\u0013\u0000\u0000\u0181\u0182\u0005\u000e\u0000\u0000\u0182\u0183\u0003"+
		"\u0000\u0000\u0000\u0183\u0187\u0005\u0004\u0000\u0000\u0184\u0186\u0003"+
		"\u0016\u000b\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0005\u0005\u0000\u0000\u018b\u01dc\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005\u0011\u0000\u0000\u018d\u018e\u0003"+
		"\u0014\n\u0000\u018e\u018f\u0005\u0013\u0000\u0000\u018f\u01dc\u0001\u0000"+
		"\u0000\u0000\u0190\u0193\u0003\n\u0005\u0000\u0191\u0193\u0003\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0016\u0000"+
		"\u0000\u0195\u0196\u0003\n\u0005\u0000\u0196\u019e\u0005\u0011\u0000\u0000"+
		"\u0197\u019d\u0005(\u0000\u0000\u0198\u019d\u0005\'\u0000\u0000\u0199"+
		"\u019d\u0005$\u0000\u0000\u019a\u019d\u0003\u0014\n\u0000\u019b\u019d"+
		"\u0003\u0016\u000b\u0000\u019c\u0197\u0001\u0000\u0000\u0000\u019c\u0198"+
		"\u0001\u0000\u0000\u0000\u019c\u0199\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0"+
		"\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01ab\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a7\u0005\u0012\u0000\u0000\u01a2\u01a8"+
		"\u0005(\u0000\u0000\u01a3\u01a8\u0005\'\u0000\u0000\u01a4\u01a8\u0005"+
		"$\u0000\u0000\u01a5\u01a8\u0003\u0014\n\u0000\u01a6\u01a8\u0003\u0016"+
		"\u000b\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000\u01a7\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a1\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b0\u0005\u0013\u0000\u0000\u01af\u01b1\u0005\r\u0000"+
		"\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01dc\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\u0011\u0000"+
		"\u0000\u01b3\u01b4\u0003\u0014\n\u0000\u01b4\u01b9\u0005\u0013\u0000\u0000"+
		"\u01b5\u01b6\u0005\u0016\u0000\u0000\u01b6\u01b8\u0003\u0016\u000b\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ba\u01dc\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0011\u0000\u0000\u01bd\u01be\u0003\u0014\n\u0000\u01be"+
		"\u01bf\u0005\u0013\u0000\u0000\u01bf\u01c0\u0005\u0016\u0000\u0000\u01c0"+
		"\u01c1\u0003\n\u0005\u0000\u01c1\u01c8\u0005\u0011\u0000\u0000\u01c2\u01c7"+
		"\u0005(\u0000\u0000\u01c3\u01c7\u0005\'\u0000\u0000\u01c4\u01c7\u0005"+
		"$\u0000\u0000\u01c5\u01c7\u0003\u0014\n\u0000\u01c6\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01d4\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000"+
		"\u0000\u0000\u01cb\u01d0\u0005\u0012\u0000\u0000\u01cc\u01d1\u0005(\u0000"+
		"\u0000\u01cd\u01d1\u0005\'\u0000\u0000\u01ce\u01d1\u0005$\u0000\u0000"+
		"\u01cf\u01d1\u0003\u0014\n\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d0"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2"+
		"\u01cb\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d9\u0005\u0013\u0000\u0000\u01d8\u01da\u0005\r\u0000\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01dc"+
		"\u0001\u0000\u0000\u0000\u01db\u00ac\u0001\u0000\u0000\u0000\u01db\u00ba"+
		"\u0001\u0000\u0000\u0000\u01db\u00e6\u0001\u0000\u0000\u0000\u01db\u00ea"+
		"\u0001\u0000\u0000\u0000\u01db\u00f0\u0001\u0000\u0000\u0000\u01db\u0105"+
		"\u0001\u0000\u0000\u0000\u01db\u0109\u0001\u0000\u0000\u0000\u01db\u010f"+
		"\u0001\u0000\u0000\u0000\u01db\u0114\u0001\u0000\u0000\u0000\u01db\u011e"+
		"\u0001\u0000\u0000\u0000\u01db\u0126\u0001\u0000\u0000\u0000\u01db\u012c"+
		"\u0001\u0000\u0000\u0000\u01db\u012f\u0001\u0000\u0000\u0000\u01db\u014c"+
		"\u0001\u0000\u0000\u0000\u01db\u016d\u0001\u0000\u0000\u0000\u01db\u018c"+
		"\u0001\u0000\u0000\u0000\u01db\u0192\u0001\u0000\u0000\u0000\u01db\u01b2"+
		"\u0001\u0000\u0000\u0000\u01db\u01bc\u0001\u0000\u0000\u0000\u01dc\u0206"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\n\u0015\u0000\u0000\u01de\u01df\u0003"+
		"\f\u0006\u0000\u01df\u01e0\u0003\u0016\u000b\u0016\u01e0\u0205\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\n\u0012\u0000\u0000\u01e2\u01e3\u0003\u000e\u0007"+
		"\u0000\u01e3\u01e4\u0003\u0016\u000b\u0013\u01e4\u0205\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\n\u0004\u0000\u0000\u01e6\u01e7\u0005#\u0000\u0000"+
		"\u01e7\u0205\u0003\u0016\u000b\u0005\u01e8\u01e9\n\u0011\u0000\u0000\u01e9"+
		"\u01ea\u0005\u0019\u0000\u0000\u01ea\u01ec\u0003\u0016\u000b\u0000\u01eb"+
		"\u01ed\u0005\r\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ed\u0205\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\n\u0010\u0000\u0000\u01ef\u01f0\u0005\u001a\u0000\u0000\u01f0\u01f2\u0003"+
		"\u0016\u000b\u0000\u01f1\u01f3\u0005\r\u0000\u0000\u01f2\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u0205\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\n\u000f\u0000\u0000\u01f5\u01f6\u0005\u0007\u0000"+
		"\u0000\u01f6\u01f8\u0003\u0016\u000b\u0000\u01f7\u01f9\u0005\r\u0000\u0000"+
		"\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u0205\u0001\u0000\u0000\u0000\u01fa\u01fb\n\u000b\u0000\u0000\u01fb"+
		"\u01ff\u0003\u000e\u0007\u0000\u01fc\u0200\u0003\b\u0004\u0000\u01fd\u0200"+
		"\u0005(\u0000\u0000\u01fe\u0200\u0005\'\u0000\u0000\u01ff\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u0203\u0005"+
		"\r\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000"+
		"\u0000\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01dd\u0001\u0000"+
		"\u0000\u0000\u0204\u01e1\u0001\u0000\u0000\u0000\u0204\u01e5\u0001\u0000"+
		"\u0000\u0000\u0204\u01e8\u0001\u0000\u0000\u0000\u0204\u01ee\u0001\u0000"+
		"\u0000\u0000\u0204\u01f4\u0001\u0000\u0000\u0000\u0204\u01fa\u0001\u0000"+
		"\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0017\u0001\u0000"+
		"\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000A\u001d$,.;IRfpy{\u0080"+
		"\u008a\u0094\u009d\u009f\u00a4\u00aa\u00b5\u00c2\u00cc\u00d6\u00df\u00e4"+
		"\u00ee\u00f8\u00ff\u0103\u010d\u0112\u011c\u0124\u012a\u0136\u0138\u0141"+
		"\u0145\u014a\u0153\u015c\u0166\u016b\u0174\u017d\u0187\u0192\u019c\u019e"+
		"\u01a7\u01ab\u01b0\u01b9\u01c6\u01c8\u01d0\u01d4\u01d9\u01db\u01ec\u01f2"+
		"\u01f8\u01ff\u0202\u0204\u0206";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}