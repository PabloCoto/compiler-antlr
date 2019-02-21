// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, IDENT=43, 
		LINE_COMMENT=44, MULTILINE_COMMENT=45, WHITESPACE=46;
	public static final int
		RULE_start = 0, RULE_definicion = 1, RULE_defVariable = 2, RULE_defStruct = 3, 
		RULE_cuerpoStruct = 4, RULE_tipo = 5, RULE_tipoArray = 6, RULE_defFuncion = 7, 
		RULE_paramFuncion = 8, RULE_cuerpoFuncion = 9, RULE_sentencia = 10, RULE_expresion = 11, 
		RULE_bucleWhile = 12, RULE_bucleIf = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definicion", "defVariable", "defStruct", "cuerpoStruct", "tipo", 
			"tipoArray", "defFuncion", "paramFuncion", "cuerpoFuncion", "sentencia", 
			"expresion", "bucleWhile", "bucleIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", 
			"'char'", "'['", "']'", "'('", "','", "')'", "'return'", "'='", "'printsp'", 
			"'print'", "'println'", "'read'", "'.'", "'cast'", "'<'", "'>'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				{
				setState(28);
				definicion();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
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

	public static class DefinicionContext extends ParserRuleContext {
		public DefVariableContext defVariable() {
			return getRuleContext(DefVariableContext.class,0);
		}
		public DefStructContext defStruct() {
			return getRuleContext(DefStructContext.class,0);
		}
		public DefFuncionContext defFuncion() {
			return getRuleContext(DefFuncionContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				defVariable();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				defStruct();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				defFuncion();
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

	public static class DefVariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVariable; }
	}

	public final DefVariableContext defVariable() throws RecognitionException {
		DefVariableContext _localctx = new DefVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(IDENT);
			setState(43);
			match(T__1);
			setState(44);
			tipo();
			setState(45);
			match(T__2);
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

	public static class DefStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<CuerpoStructContext> cuerpoStruct() {
			return getRuleContexts(CuerpoStructContext.class);
		}
		public CuerpoStructContext cuerpoStruct(int i) {
			return getRuleContext(CuerpoStructContext.class,i);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			match(IDENT);
			setState(49);
			match(T__4);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(50);
				cuerpoStruct();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__5);
			setState(57);
			match(T__2);
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

	public static class CuerpoStructContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CuerpoStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoStruct; }
	}

	public final CuerpoStructContext cuerpoStruct() throws RecognitionException {
		CuerpoStructContext _localctx = new CuerpoStructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cuerpoStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			match(IDENT);
			setState(60);
			match(T__1);
			setState(61);
			tipo();
			setState(62);
			match(T__2);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoArrayContext tipoArray() {
			return getRuleContext(TipoArrayContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__8);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(IDENT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				tipoArray();
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

	public static class TipoArrayContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoArray; }
	}

	public final TipoArrayContext tipoArray() throws RecognitionException {
		TipoArrayContext _localctx = new TipoArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__9);
			setState(72);
			match(INT_CONSTANT);
			setState(73);
			match(T__10);
			setState(74);
			tipo();
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

	public static class DefFuncionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CuerpoFuncionContext cuerpoFuncion() {
			return getRuleContext(CuerpoFuncionContext.class,0);
		}
		public List<ParamFuncionContext> paramFuncion() {
			return getRuleContexts(ParamFuncionContext.class);
		}
		public ParamFuncionContext paramFuncion(int i) {
			return getRuleContext(ParamFuncionContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFuncion; }
	}

	public final DefFuncionContext defFuncion() throws RecognitionException {
		DefFuncionContext _localctx = new DefFuncionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENT);
			setState(77);
			match(T__11);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(78);
				paramFuncion();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(79);
					match(T__12);
					setState(80);
					paramFuncion();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(88);
			match(T__13);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(89);
				match(T__1);
				setState(90);
				tipo();
				}
			}

			setState(93);
			match(T__4);
			setState(94);
			cuerpoFuncion();
			setState(95);
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

	public static class ParamFuncionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParamFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramFuncion; }
	}

	public final ParamFuncionContext paramFuncion() throws RecognitionException {
		ParamFuncionContext _localctx = new ParamFuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENT);
			setState(98);
			match(T__1);
			setState(99);
			tipo();
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

	public static class CuerpoFuncionContext extends ParserRuleContext {
		public List<DefVariableContext> defVariable() {
			return getRuleContexts(DefVariableContext.class);
		}
		public DefVariableContext defVariable(int i) {
			return getRuleContext(DefVariableContext.class,i);
		}
		public List<DefStructContext> defStruct() {
			return getRuleContexts(DefStructContext.class);
		}
		public DefStructContext defStruct(int i) {
			return getRuleContext(DefStructContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public CuerpoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoFuncion; }
	}

	public final CuerpoFuncionContext cuerpoFuncion() throws RecognitionException {
		CuerpoFuncionContext _localctx = new CuerpoFuncionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cuerpoFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__3) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(101);
					defVariable();
					}
					break;
				case T__3:
					{
					setState(102);
					defStruct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__36) | (1L << T__37) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(108);
				sentencia();
				}
				}
				setState(113);
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

	public static class SentenciaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public BucleWhileContext bucleWhile() {
			return getRuleContext(BucleWhileContext.class,0);
		}
		public BucleIfContext bucleIf() {
			return getRuleContext(BucleIfContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentencia);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__14);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(115);
					expresion(0);
					}
				}

				setState(118);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				expresion(0);
				setState(120);
				match(T__15);
				setState(121);
				expresion(0);
				setState(122);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(T__16);
				setState(125);
				expresion(0);
				setState(126);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(T__17);
				setState(129);
				expresion(0);
				setState(130);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(T__18);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(133);
					expresion(0);
					}
				}

				setState(136);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(137);
				match(T__19);
				setState(138);
				expresion(0);
				setState(139);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				bucleWhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				bucleIf();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				match(IDENT);
				setState(144);
				match(T__11);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(145);
					expresion(0);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(146);
						match(T__12);
						setState(147);
						expresion(0);
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(155);
				match(T__13);
				setState(156);
				match(T__2);
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(160);
				match(IDENT);
				}
				break;
			case 2:
				{
				setState(161);
				match(INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(162);
				match(REAL_CONSTANT);
				}
				break;
			case 4:
				{
				setState(163);
				match(CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(164);
				match(T__11);
				setState(165);
				expresion(0);
				setState(166);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(168);
				match(T__21);
				setState(169);
				match(T__22);
				setState(170);
				tipo();
				setState(171);
				match(T__23);
				setState(172);
				match(T__11);
				setState(173);
				expresion(0);
				setState(174);
				match(T__13);
				}
				break;
			case 7:
				{
				setState(176);
				match(T__24);
				setState(177);
				expresion(15);
				}
				break;
			case 8:
				{
				setState(178);
				match(IDENT);
				setState(179);
				match(T__11);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(180);
					expresion(0);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(181);
						match(T__12);
						setState(182);
						expresion(0);
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(T__13);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(193);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(194);
						match(T__20);
						setState(195);
						expresion(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(196);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(197);
						match(T__25);
						setState(198);
						expresion(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(199);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(200);
						match(T__26);
						setState(201);
						expresion(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(202);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(203);
						match(T__27);
						setState(204);
						expresion(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(205);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(206);
						match(T__28);
						setState(207);
						expresion(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(209);
						match(T__29);
						setState(210);
						expresion(11);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(212);
						match(T__23);
						setState(213);
						expresion(10);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(215);
						match(T__30);
						setState(216);
						expresion(9);
						}
						break;
					case 9:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(218);
						match(T__22);
						setState(219);
						expresion(8);
						}
						break;
					case 10:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(221);
						match(T__31);
						setState(222);
						expresion(7);
						}
						break;
					case 11:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(224);
						match(T__32);
						setState(225);
						expresion(6);
						}
						break;
					case 12:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						match(T__33);
						setState(228);
						expresion(5);
						}
						break;
					case 13:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230);
						match(T__34);
						setState(231);
						expresion(4);
						}
						break;
					case 14:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(233);
						match(T__35);
						setState(234);
						expresion(3);
						}
						break;
					case 15:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(235);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(236);
						match(T__9);
						setState(237);
						expresion(0);
						setState(238);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class BucleWhileContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BucleWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleWhile; }
	}

	public final BucleWhileContext bucleWhile() throws RecognitionException {
		BucleWhileContext _localctx = new BucleWhileContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bucleWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__36);
			setState(246);
			match(T__11);
			setState(247);
			expresion(0);
			setState(248);
			match(T__13);
			setState(249);
			match(T__4);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__36) | (1L << T__37) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(250);
				sentencia();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
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

	public static class BucleIfContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BucleIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleIf; }
	}

	public final BucleIfContext bucleIf() throws RecognitionException {
		BucleIfContext _localctx = new BucleIfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucleIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__37);
			setState(259);
			match(T__11);
			setState(260);
			expresion(0);
			setState(261);
			match(T__13);
			setState(262);
			match(T__4);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__36) | (1L << T__37) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(263);
				sentencia();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__5);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(270);
				match(T__38);
				setState(271);
				match(T__4);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__36) | (1L << T__37) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					{
					setState(272);
					sentencia();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(T__5);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tT\n\t\f\t"+
		"\16\tW\13\t\5\tY\n\t\3\t\3\t\3\t\5\t^\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\7\13j\n\13\f\13\16\13m\13\13\3\13\7\13p\n\13\f\13\16\13"+
		"s\13\13\3\f\3\f\5\fw\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\5\f\u009c\n\f\3\f\3\f\5\f"+
		"\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r"+
		"\5\r\u00bf\n\r\3\r\5\r\u00c2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f3\n\r\f\r\16\r\u00f6\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00fe\n\16\f\16\16\16\u0101\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u010b\n\17\f\17\16\17\u010e\13\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0114\n\17\f\17\16\17\u0117\13\17\3\17\5\17\u011a\n\17\3\17"+
		"\2\3\30\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u0143\2!\3\2\2\2"+
		"\4)\3\2\2\2\6+\3\2\2\2\b\61\3\2\2\2\n=\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2"+
		"\20N\3\2\2\2\22c\3\2\2\2\24k\3\2\2\2\26\u009f\3\2\2\2\30\u00c1\3\2\2\2"+
		"\32\u00f7\3\2\2\2\34\u0104\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&*\5"+
		"\6\4\2\'*\5\b\5\2(*\5\20\t\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2"+
		"+,\7\3\2\2,-\7-\2\2-.\7\4\2\2./\5\f\7\2/\60\7\5\2\2\60\7\3\2\2\2\61\62"+
		"\7\6\2\2\62\63\7-\2\2\63\67\7\7\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\b\2\2;<\7\5"+
		"\2\2<\t\3\2\2\2=>\7-\2\2>?\7\4\2\2?@\5\f\7\2@A\7\5\2\2A\13\3\2\2\2BH\7"+
		"\t\2\2CH\7\n\2\2DH\7\13\2\2EH\7-\2\2FH\5\16\b\2GB\3\2\2\2GC\3\2\2\2GD"+
		"\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\r\3\2\2\2IJ\7\f\2\2JK\7*\2\2KL\7\r\2\2L"+
		"M\5\f\7\2M\17\3\2\2\2NO\7-\2\2OX\7\16\2\2PU\5\22\n\2QR\7\17\2\2RT\5\22"+
		"\n\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2XP\3\2"+
		"\2\2XY\3\2\2\2YZ\3\2\2\2Z]\7\20\2\2[\\\7\4\2\2\\^\5\f\7\2][\3\2\2\2]^"+
		"\3\2\2\2^_\3\2\2\2_`\7\7\2\2`a\5\24\13\2ab\7\b\2\2b\21\3\2\2\2cd\7-\2"+
		"\2de\7\4\2\2ef\5\f\7\2f\23\3\2\2\2gj\5\6\4\2hj\5\b\5\2ig\3\2\2\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2mk\3\2\2\2np\5\26\f\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\25\3\2\2\2sq\3\2\2\2tv\7\21\2\2"+
		"uw\5\30\r\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u00a0\7\5\2\2yz\5\30\r\2z{"+
		"\7\22\2\2{|\5\30\r\2|}\7\5\2\2}\u00a0\3\2\2\2~\177\7\23\2\2\177\u0080"+
		"\5\30\r\2\u0080\u0081\7\5\2\2\u0081\u00a0\3\2\2\2\u0082\u0083\7\24\2\2"+
		"\u0083\u0084\5\30\r\2\u0084\u0085\7\5\2\2\u0085\u00a0\3\2\2\2\u0086\u0088"+
		"\7\25\2\2\u0087\u0089\5\30\r\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\u00a0\7\5\2\2\u008b\u008c\7\26\2\2\u008c\u008d"+
		"\5\30\r\2\u008d\u008e\7\5\2\2\u008e\u00a0\3\2\2\2\u008f\u00a0\5\32\16"+
		"\2\u0090\u00a0\5\34\17\2\u0091\u0092\7-\2\2\u0092\u009b\7\16\2\2\u0093"+
		"\u0098\5\30\r\2\u0094\u0095\7\17\2\2\u0095\u0097\5\30\r\2\u0096\u0094"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u00a0\7\5\2\2\u009f"+
		"t\3\2\2\2\u009fy\3\2\2\2\u009f~\3\2\2\2\u009f\u0082\3\2\2\2\u009f\u0086"+
		"\3\2\2\2\u009f\u008b\3\2\2\2\u009f\u008f\3\2\2\2\u009f\u0090\3\2\2\2\u009f"+
		"\u0091\3\2\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\b\r\1\2\u00a2\u00c2\7-\2\2"+
		"\u00a3\u00c2\7*\2\2\u00a4\u00c2\7+\2\2\u00a5\u00c2\7,\2\2\u00a6\u00a7"+
		"\7\16\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\20\2\2\u00a9\u00c2\3\2\2"+
		"\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\7\31\2\2\u00ac\u00ad\5\f\7\2\u00ad"+
		"\u00ae\7\32\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1"+
		"\7\20\2\2\u00b1\u00c2\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00c2\5\30\r"+
		"\21\u00b4\u00b5\7-\2\2\u00b5\u00be\7\16\2\2\u00b6\u00bb\5\30\r\2\u00b7"+
		"\u00b8\7\17\2\2\u00b8\u00ba\5\30\r\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\7\20\2\2\u00c1\u00a1\3\2\2\2\u00c1\u00a3\3\2\2\2\u00c1"+
		"\u00a4\3\2\2\2\u00c1\u00a5\3\2\2\2\u00c1\u00a6\3\2\2\2\u00c1\u00aa\3\2"+
		"\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c2\u00f4\3\2\2\2\u00c3"+
		"\u00c4\f\23\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00f3\5\30\r\24\u00c6\u00c7"+
		"\f\20\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00f3\5\30\r\21\u00c9\u00ca\f\17"+
		"\2\2\u00ca\u00cb\7\35\2\2\u00cb\u00f3\5\30\r\20\u00cc\u00cd\f\16\2\2\u00cd"+
		"\u00ce\7\36\2\2\u00ce\u00f3\5\30\r\17\u00cf\u00d0\f\r\2\2\u00d0\u00d1"+
		"\7\37\2\2\u00d1\u00f3\5\30\r\16\u00d2\u00d3\f\f\2\2\u00d3\u00d4\7 \2\2"+
		"\u00d4\u00f3\5\30\r\r\u00d5\u00d6\f\13\2\2\u00d6\u00d7\7\32\2\2\u00d7"+
		"\u00f3\5\30\r\f\u00d8\u00d9\f\n\2\2\u00d9\u00da\7!\2\2\u00da\u00f3\5\30"+
		"\r\13\u00db\u00dc\f\t\2\2\u00dc\u00dd\7\31\2\2\u00dd\u00f3\5\30\r\n\u00de"+
		"\u00df\f\b\2\2\u00df\u00e0\7\"\2\2\u00e0\u00f3\5\30\r\t\u00e1\u00e2\f"+
		"\7\2\2\u00e2\u00e3\7#\2\2\u00e3\u00f3\5\30\r\b\u00e4\u00e5\f\6\2\2\u00e5"+
		"\u00e6\7$\2\2\u00e6\u00f3\5\30\r\7\u00e7\u00e8\f\5\2\2\u00e8\u00e9\7%"+
		"\2\2\u00e9\u00f3\5\30\r\6\u00ea\u00eb\f\4\2\2\u00eb\u00ec\7&\2\2\u00ec"+
		"\u00f3\5\30\r\5\u00ed\u00ee\f\24\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\5"+
		"\30\r\2\u00f0\u00f1\7\r\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00c3\3\2\2\2\u00f2"+
		"\u00c6\3\2\2\2\u00f2\u00c9\3\2\2\2\u00f2\u00cc\3\2\2\2\u00f2\u00cf\3\2"+
		"\2\2\u00f2\u00d2\3\2\2\2\u00f2\u00d5\3\2\2\2\u00f2\u00d8\3\2\2\2\u00f2"+
		"\u00db\3\2\2\2\u00f2\u00de\3\2\2\2\u00f2\u00e1\3\2\2\2\u00f2\u00e4\3\2"+
		"\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\31\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7\16\2\2\u00f9"+
		"\u00fa\5\30\r\2\u00fa\u00fb\7\20\2\2\u00fb\u00ff\7\7\2\2\u00fc\u00fe\5"+
		"\26\f\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\b"+
		"\2\2\u0103\33\3\2\2\2\u0104\u0105\7(\2\2\u0105\u0106\7\16\2\2\u0106\u0107"+
		"\5\30\r\2\u0107\u0108\7\20\2\2\u0108\u010c\7\7\2\2\u0109\u010b\5\26\f"+
		"\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0119\7\b\2\2\u0110"+
		"\u0111\7)\2\2\u0111\u0115\7\7\2\2\u0112\u0114\5\26\f\2\u0113\u0112\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\b\2\2\u0119\u0110\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\35\3\2\2\2\32!)\67GUX]ikqv\u0088\u0098"+
		"\u009b\u009f\u00bb\u00be\u00c1\u00f2\u00f4\u00ff\u010c\u0115\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}