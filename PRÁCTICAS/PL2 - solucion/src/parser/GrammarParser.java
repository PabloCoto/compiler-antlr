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
		T__17=18, T__18=19, INT_CONSTANT=20, REAL_CONSTANT=21, IDENT=22, COMMENT=23, 
		WHITESPACE=24;
	public static final int
		RULE_start = 0, RULE_definicion = 1, RULE_tipo = 2, RULE_sentencia = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definicion", "tipo", "sentencia", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "'CODE'", "';'", "'int'", "'real'", "'print'", "'read'", 
			"'='", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", "'+'", 
			"'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", 
			"IDENT", "COMMENT", "WHITESPACE"
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
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
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
			setState(10);
			match(T__0);
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				definicion();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==T__4 );
			setState(16);
			match(T__1);
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				sentencia();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << IDENT))) != 0) );
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			tipo();
			setState(23);
			match(IDENT);
			setState(24);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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

	public static class SentenciaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__5);
				setState(29);
				expr(0);
				setState(30);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__6);
				setState(33);
				match(IDENT);
				setState(34);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(IDENT);
				setState(36);
				match(T__7);
				setState(37);
				expr(0);
				setState(38);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(T__8);
				setState(41);
				match(T__9);
				setState(42);
				expr(0);
				setState(43);
				match(T__10);
				setState(44);
				match(T__11);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					sentencia();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << IDENT))) != 0) );
				setState(50);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__8);
				setState(53);
				match(T__9);
				setState(54);
				expr(0);
				setState(55);
				match(T__10);
				setState(56);
				match(T__11);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					sentencia();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << IDENT))) != 0) );
				setState(62);
				match(T__12);
				setState(63);
				match(T__13);
				setState(64);
				match(T__11);
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					sentencia();
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << IDENT))) != 0) );
				setState(70);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(T__14);
				setState(73);
				match(T__9);
				setState(74);
				expr(0);
				setState(75);
				match(T__10);
				setState(76);
				match(T__11);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					sentencia();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << IDENT))) != 0) );
				setState(82);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(87);
				match(INT_CONSTANT);
				}
				break;
			case REAL_CONSTANT:
				{
				setState(88);
				match(REAL_CONSTANT);
				}
				break;
			case IDENT:
				{
				setState(89);
				match(IDENT);
				}
				break;
			case T__9:
				{
				setState(90);
				match(T__9);
				setState(91);
				expr(0);
				setState(92);
				match(T__10);
				}
				break;
			case T__17:
				{
				setState(94);
				match(T__17);
				setState(95);
				tipo();
				setState(96);
				match(T__18);
				setState(97);
				match(T__9);
				setState(98);
				expr(0);
				setState(99);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						match(T__15);
						setState(105);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						match(T__16);
						setState(108);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\61\n\5\r\5\16\5\62"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\5\3\5\6"+
		"\5E\n\5\r\5\16\5F\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5Q\n\5\r\5\16\5R\3"+
		"\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16\6s\13\6\3\6\2"+
		"\3\n\7\2\4\6\b\n\2\3\3\2\6\7\2\u0080\2\f\3\2\2\2\4\30\3\2\2\2\6\34\3\2"+
		"\2\2\bV\3\2\2\2\ng\3\2\2\2\f\16\7\3\2\2\r\17\5\4\3\2\16\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\24\7\4\2\2\23\25"+
		"\5\b\5\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3"+
		"\3\2\2\2\30\31\5\6\4\2\31\32\7\30\2\2\32\33\7\5\2\2\33\5\3\2\2\2\34\35"+
		"\t\2\2\2\35\7\3\2\2\2\36\37\7\b\2\2\37 \5\n\6\2 !\7\5\2\2!W\3\2\2\2\""+
		"#\7\t\2\2#$\7\30\2\2$W\7\5\2\2%&\7\30\2\2&\'\7\n\2\2\'(\5\n\6\2()\7\5"+
		"\2\2)W\3\2\2\2*+\7\13\2\2+,\7\f\2\2,-\5\n\6\2-.\7\r\2\2.\60\7\16\2\2/"+
		"\61\5\b\5\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64"+
		"\3\2\2\2\64\65\7\17\2\2\65W\3\2\2\2\66\67\7\13\2\2\678\7\f\2\289\5\n\6"+
		"\29:\7\r\2\2:<\7\16\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?@\3\2\2\2@A\7\17\2\2AB\7\20\2\2BD\7\16\2\2CE\5\b\5\2DC\3\2\2\2EF"+
		"\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\17\2\2IW\3\2\2\2JK\7\21\2\2"+
		"KL\7\f\2\2LM\5\n\6\2MN\7\r\2\2NP\7\16\2\2OQ\5\b\5\2PO\3\2\2\2QR\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\17\2\2UW\3\2\2\2V\36\3\2\2\2V\"\3"+
		"\2\2\2V%\3\2\2\2V*\3\2\2\2V\66\3\2\2\2VJ\3\2\2\2W\t\3\2\2\2XY\b\6\1\2"+
		"Yh\7\26\2\2Zh\7\27\2\2[h\7\30\2\2\\]\7\f\2\2]^\5\n\6\2^_\7\r\2\2_h\3\2"+
		"\2\2`a\7\24\2\2ab\5\6\4\2bc\7\25\2\2cd\7\f\2\2de\5\n\6\2ef\7\r\2\2fh\3"+
		"\2\2\2gX\3\2\2\2gZ\3\2\2\2g[\3\2\2\2g\\\3\2\2\2g`\3\2\2\2hq\3\2\2\2ij"+
		"\f\6\2\2jk\7\22\2\2kp\5\n\6\7lm\f\5\2\2mn\7\23\2\2np\5\n\6\6oi\3\2\2\2"+
		"ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2\f\20\26"+
		"\62>FRVgoq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}