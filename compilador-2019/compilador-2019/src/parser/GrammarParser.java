// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;

    import ast.*;

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
		INT_CONSTANT=39, REAL_CONSTANT=40, CHAR_CONSTANT=41, IDENT=42, LINE_COMMENT=43, 
		MULTILINE_COMMENT=44, WHITESPACE=45;
	public static final int
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_defVariable = 3, 
		RULE_defStruct = 4, RULE_defFuncion = 5, RULE_tipo = 6, RULE_cuerpoStruct = 7, 
		RULE_tipoArray = 8, RULE_listaParametros = 9, RULE_paramFuncion = 10, 
		RULE_variables = 11, RULE_sentencias = 12, RULE_sentencia = 13, RULE_parametrosInvocacion = 14, 
		RULE_expresion = 15, RULE_bucleWhile = 16, RULE_sentenciaCondicional = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "defVariable", "defStruct", "defFuncion", 
			"tipo", "cuerpoStruct", "tipoArray", "listaParametros", "paramFuncion", 
			"variables", "sentencias", "sentencia", "parametrosInvocacion", "expresion", 
			"bucleWhile", "sentenciaCondicional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", 
			"'char'", "'['", "']'", "'('", "','", "')'", "'return'", "'='", "'printsp'", 
			"'print'", "'println'", "'read'", "'.'", "'cast'", "'<'", "'>'", "'!'", 
			"'*'", "'/'", "'+'", "'-'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", 
			"'while'", "'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
		public Programa ast;
		public DefinicionesContext definiciones;
		public DefinicionesContext definiciones() {
			return getRuleContext(DefinicionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((StartContext)_localctx).definiciones = definiciones();
			setState(37);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Programa(((StartContext)_localctx).definiciones.list); 
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

	public static class DefinicionesContext extends ParserRuleContext {
		public List<Definicion> list = new ArrayList<Definicion>();
		public DefinicionContext definicion;
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				{
				setState(40);
				((DefinicionesContext)_localctx).definicion = definicion();
				_localctx.list.add(((DefinicionesContext)_localctx).definicion.ast);
				}
				}
				setState(47);
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

	public static class DefinicionContext extends ParserRuleContext {
		public Definicion ast;
		public DefVariableContext defVariable;
		public DefStructContext defStruct;
		public DefFuncionContext defFuncion;
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
		enterRule(_localctx, 4, RULE_definicion);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				((DefinicionContext)_localctx).defVariable = defVariable();
				((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defVariable.ast;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				((DefinicionContext)_localctx).defStruct = defStruct();
				((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defStruct.ast;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				((DefinicionContext)_localctx).defFuncion = defFuncion();
				((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defFuncion.ast;
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
		public DefVariable ast;
		public Token IDENT;
		public TipoContext tipo;
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
		enterRule(_localctx, 6, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			((DefVariableContext)_localctx).IDENT = match(IDENT);
			setState(61);
			match(T__1);
			setState(62);
			((DefVariableContext)_localctx).tipo = tipo();
			setState(63);
			match(T__2);
			 ((DefVariableContext)_localctx).ast =  new DefVariable(((DefVariableContext)_localctx).IDENT, ((DefVariableContext)_localctx).tipo.ast); 
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
		public DefStruct ast;
		public Token IDENT;
		public CuerpoStructContext cuerpoStruct;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public CuerpoStructContext cuerpoStruct() {
			return getRuleContext(CuerpoStructContext.class,0);
		}
		public DefStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStruct; }
	}

	public final DefStructContext defStruct() throws RecognitionException {
		DefStructContext _localctx = new DefStructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(67);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(68);
			match(T__4);
			setState(69);
			((DefStructContext)_localctx).cuerpoStruct = cuerpoStruct();
			setState(70);
			match(T__5);
			setState(71);
			match(T__2);
			 ((DefStructContext)_localctx).ast =  new DefStruct(((DefStructContext)_localctx).IDENT, ((DefStructContext)_localctx).cuerpoStruct.list); 
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
		public DefFuncion ast;
		public Token IDENT;
		public ListaParametrosContext listaParametros;
		public TipoContext tipo;
		public VariablesContext variables;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public DefFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFuncion; }
	}

	public final DefFuncionContext defFuncion() throws RecognitionException {
		DefFuncionContext _localctx = new DefFuncionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((DefFuncionContext)_localctx).IDENT = match(IDENT);
			setState(75);
			((DefFuncionContext)_localctx).listaParametros = listaParametros();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(76);
				match(T__1);
				}
			}

			setState(79);
			((DefFuncionContext)_localctx).tipo = tipo();
			setState(80);
			match(T__4);
			setState(81);
			((DefFuncionContext)_localctx).variables = variables();
			setState(82);
			((DefFuncionContext)_localctx).sentencias = sentencias();
			setState(83);
			match(T__5);
			  ((DefFuncionContext)_localctx).ast =  new DefFuncion(((DefFuncionContext)_localctx).IDENT, ((DefFuncionContext)_localctx).listaParametros.list, ((DefFuncionContext)_localctx).tipo.ast, ((DefFuncionContext)_localctx).variables.list, ((DefFuncionContext)_localctx).sentencias.list); 
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
		public Tipo ast;
		public Token IDENT;
		public TipoArrayContext tipoArray;
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
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__6);
				  ((TipoContext)_localctx).ast =  new TipoEntero(); 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__7);
				  ((TipoContext)_localctx).ast =  new TipoReal(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__8);
				  ((TipoContext)_localctx).ast =  new TipoChar(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				((TipoContext)_localctx).IDENT = match(IDENT);
				  ((TipoContext)_localctx).ast =  new TipoStruct(((TipoContext)_localctx).IDENT); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				((TipoContext)_localctx).tipoArray = tipoArray();
				  ((TipoContext)_localctx).ast =  ((TipoContext)_localctx).tipoArray.ast; 
				}
				break;
			case T__2:
			case T__4:
			case T__12:
			case T__13:
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				  ((TipoContext)_localctx).ast =  new TipoVoid(); 
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

	public static class CuerpoStructContext extends ParserRuleContext {
		public List<CuerpoStruct> list = new ArrayList<CuerpoStruct>();
		public Token IDENT;
		public TipoContext tipo;
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public CuerpoStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoStruct; }
	}

	public final CuerpoStructContext cuerpoStruct() throws RecognitionException {
		CuerpoStructContext _localctx = new CuerpoStructContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cuerpoStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(100);
				((CuerpoStructContext)_localctx).IDENT = match(IDENT);
				setState(101);
				match(T__1);
				setState(102);
				((CuerpoStructContext)_localctx).tipo = tipo();
				setState(103);
				match(T__2);
				 _localctx.list.add(new CuerpoStruct(((CuerpoStructContext)_localctx).IDENT, ((CuerpoStructContext)_localctx).tipo.ast)); 
				}
				}
				setState(110);
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

	public static class TipoArrayContext extends ParserRuleContext {
		public Tipo ast;
		public Token INT_CONSTANT;
		public TipoContext tipo;
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
		enterRule(_localctx, 16, RULE_tipoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__9);
			setState(112);
			((TipoArrayContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(113);
			match(T__10);
			setState(114);
			((TipoArrayContext)_localctx).tipo = tipo();
			  ((TipoArrayContext)_localctx).ast =  new TipoArray(((TipoArrayContext)_localctx).INT_CONSTANT, ((TipoArrayContext)_localctx).tipo.ast); 
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public List<Param> list = new ArrayList<Param>();;
		public ParamFuncionContext paramFuncion;
		public List<ParamFuncionContext> paramFuncion() {
			return getRuleContexts(ParamFuncionContext.class);
		}
		public ParamFuncionContext paramFuncion(int i) {
			return getRuleContext(ParamFuncionContext.class,i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaParametros);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__11);
				{
				setState(118);
				((ListaParametrosContext)_localctx).paramFuncion = paramFuncion();
				_localctx.list.add(((ListaParametrosContext)_localctx).paramFuncion.ast);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(120);
					match(T__12);
					setState(121);
					((ListaParametrosContext)_localctx).paramFuncion = paramFuncion();
					_localctx.list.add(((ListaParametrosContext)_localctx).paramFuncion.ast);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(129);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__11);
				setState(132);
				match(T__13);
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

	public static class ParamFuncionContext extends ParserRuleContext {
		public Param ast;
		public Token IDENT;
		public TipoContext tipo;
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
		enterRule(_localctx, 20, RULE_paramFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((ParamFuncionContext)_localctx).IDENT = match(IDENT);
			setState(136);
			match(T__1);
			setState(137);
			((ParamFuncionContext)_localctx).tipo = tipo();
			  ((ParamFuncionContext)_localctx).ast =  new Param(((ParamFuncionContext)_localctx).IDENT, ((ParamFuncionContext)_localctx).tipo.ast); 
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

	public static class VariablesContext extends ParserRuleContext {
		public List<DefVariable> list = new ArrayList<DefVariable>();;
		public DefVariableContext defVariable;
		public List<DefVariableContext> defVariable() {
			return getRuleContexts(DefVariableContext.class);
		}
		public DefVariableContext defVariable(int i) {
			return getRuleContext(DefVariableContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(140);
				((VariablesContext)_localctx).defVariable = defVariable();
				 _localctx.list.add(((VariablesContext)_localctx).defVariable.ast); 
				}
				}
				setState(147);
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

	public static class SentenciasContext extends ParserRuleContext {
		public List<Sentencia> list = new ArrayList<Sentencia>();;
		public SentenciaContext sentencia;
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__35) | (1L << T__36) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(148);
				((SentenciasContext)_localctx).sentencia = sentencia();
				 _localctx.list.add(((SentenciasContext)_localctx).sentencia.ast); 
				}
				}
				setState(155);
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
		public Sentencia ast;
		public ExpresionContext expresion;
		public BucleWhileContext bucleWhile;
		public SentenciaCondicionalContext sentenciaCondicional;
		public Token IDENT;
		public ParametrosInvocacionContext parametrosInvocacion;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public BucleWhileContext bucleWhile() {
			return getRuleContext(BucleWhileContext.class,0);
		}
		public SentenciaCondicionalContext sentenciaCondicional() {
			return getRuleContext(SentenciaCondicionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ParametrosInvocacionContext parametrosInvocacion() {
			return getRuleContext(ParametrosInvocacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencia);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__14);
				setState(157);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(158);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__14);
				setState(162);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Return(null); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				expresion(0);
				setState(165);
				match(T__15);
				setState(166);
				expresion(0);
				setState(167);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Asignacion(_localctx.expresion(0).ast, _localctx.expresion(1).ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(T__16);
				setState(171);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(172);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(T__17);
				setState(176);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(177);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(T__18);
				setState(181);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(182);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(185);
				match(T__18);
				setState(186);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(T__19);
				setState(189);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(190);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				((SentenciaContext)_localctx).bucleWhile = bucleWhile();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).bucleWhile.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(196);
				((SentenciaContext)_localctx).sentenciaCondicional = sentenciaCondicional();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).sentenciaCondicional.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(199);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(200);
				((SentenciaContext)_localctx).parametrosInvocacion = parametrosInvocacion();
				setState(201);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new InvocacionFuncion(((SentenciaContext)_localctx).IDENT, ((SentenciaContext)_localctx).parametrosInvocacion.list); 
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

	public static class ParametrosInvocacionContext extends ParserRuleContext {
		public List<Expresion> list = new ArrayList<Expresion>();
		public ExpresionContext expresion;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametrosInvocacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosInvocacion; }
	}

	public final ParametrosInvocacionContext parametrosInvocacion() throws RecognitionException {
		ParametrosInvocacionContext _localctx = new ParametrosInvocacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametrosInvocacion);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__11);
				setState(207);
				((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
				_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(209);
					match(T__12);
					setState(210);
					((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
					_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__11);
				setState(221);
				match(T__13);
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
		public Expresion ast;
		public ExpresionContext ex1;
		public ExpresionContext ex;
		public Token IDENT;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public TipoContext tipo;
		public ParametrosInvocacionContext parametrosInvocacion;
		public Token op;
		public ExpresionContext ex2;
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
		public ParametrosInvocacionContext parametrosInvocacion() {
			return getRuleContext(ParametrosInvocacionContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(225);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENT);
				}
				break;
			case 2:
				{
				setState(227);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralInt(((ExpresionContext)_localctx).INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(229);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralReal(((ExpresionContext)_localctx).REAL_CONSTANT);
				}
				break;
			case 4:
				{
				setState(231);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralChar(((ExpresionContext)_localctx).CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(233);
				match(T__11);
				setState(234);
				((ExpresionContext)_localctx).ex = expresion(0);
				setState(235);
				match(T__13);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).ex.ast;
				}
				break;
			case 6:
				{
				setState(238);
				match(T__21);
				setState(239);
				match(T__22);
				setState(240);
				((ExpresionContext)_localctx).tipo = tipo();
				setState(241);
				match(T__23);
				setState(242);
				match(T__11);
				setState(243);
				((ExpresionContext)_localctx).ex = expresion(0);
				setState(244);
				match(T__13);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo.ast, ((ExpresionContext)_localctx).ex.ast);
				}
				break;
			case 7:
				{
				setState(247);
				match(T__24);
				setState(248);
				((ExpresionContext)_localctx).ex = expresion(8);
				 ((ExpresionContext)_localctx).ast =  new Negacion(((ExpresionContext)_localctx).ex.ast);
				}
				break;
			case 8:
				{
				setState(251);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				setState(252);
				((ExpresionContext)_localctx).parametrosInvocacion = parametrosInvocacion();
				 ((ExpresionContext)_localctx).ast =  new InvocacionFuncion(((ExpresionContext)_localctx).IDENT, ((ExpresionContext)_localctx).parametrosInvocacion.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						((ExpresionContext)_localctx).ex2 = expresion(8);
						 ((ExpresionContext)_localctx).ast =  new ExpresionAritmetica(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(262);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(263);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						((ExpresionContext)_localctx).ex2 = expresion(7);
						 ((ExpresionContext)_localctx).ast =  new ExpresionAritmetica(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(267);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(268);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((ExpresionContext)_localctx).ex2 = expresion(6);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(272);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(273);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						((ExpresionContext)_localctx).ex2 = expresion(5);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
						((ExpresionContext)_localctx).op = match(T__33);
						setState(279);
						((ExpresionContext)_localctx).ex2 = expresion(4);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						((ExpresionContext)_localctx).op = match(T__34);
						setState(284);
						((ExpresionContext)_localctx).ex2 = expresion(3);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).op, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(287);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(288);
						match(T__9);
						setState(289);
						((ExpresionContext)_localctx).ex2 = expresion(0);
						setState(290);
						match(T__10);
						 ((ExpresionContext)_localctx).ast =  new AccesoArray(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(293);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(294);
						match(T__20);
						setState(295);
						((ExpresionContext)_localctx).IDENT = match(IDENT);
						 ((ExpresionContext)_localctx).ast =  new AccesoStruct(((ExpresionContext)_localctx).ex.ast, ((ExpresionContext)_localctx).IDENT);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public Sentencia ast;
		public ExpresionContext expresion;
		public SentenciasContext sentencias;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public BucleWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleWhile; }
	}

	public final BucleWhileContext bucleWhile() throws RecognitionException {
		BucleWhileContext _localctx = new BucleWhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bucleWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__35);
			setState(303);
			match(T__11);
			setState(304);
			((BucleWhileContext)_localctx).expresion = expresion(0);
			setState(305);
			match(T__13);
			setState(306);
			match(T__4);
			setState(307);
			((BucleWhileContext)_localctx).sentencias = sentencias();
			setState(308);
			match(T__5);
			 ((BucleWhileContext)_localctx).ast =  new BucleWhile(((BucleWhileContext)_localctx).expresion.ast, ((BucleWhileContext)_localctx).sentencias.list);
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

	public static class SentenciaCondicionalContext extends ParserRuleContext {
		public Sentencia ast;
		public ExpresionContext expresion;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public SentenciaCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaCondicional; }
	}

	public final SentenciaCondicionalContext sentenciaCondicional() throws RecognitionException {
		SentenciaCondicionalContext _localctx = new SentenciaCondicionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentenciaCondicional);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(T__36);
				setState(312);
				match(T__11);
				setState(313);
				((SentenciaCondicionalContext)_localctx).expresion = expresion(0);
				setState(314);
				match(T__13);
				setState(315);
				match(T__4);
				setState(316);
				sentencias();
				setState(317);
				match(T__5);
				{
				setState(318);
				match(T__37);
				setState(319);
				match(T__4);
				setState(320);
				sentencias();
				setState(321);
				match(T__5);
				}
				 ((SentenciaCondicionalContext)_localctx).ast =  new SentenciaCondicional(((SentenciaCondicionalContext)_localctx).expresion.ast, _localctx.sentencias(0).list, _localctx.sentencias(1).list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(T__36);
				setState(326);
				match(T__11);
				setState(327);
				((SentenciaCondicionalContext)_localctx).expresion = expresion(0);
				setState(328);
				match(T__13);
				setState(329);
				match(T__4);
				setState(330);
				sentencias();
				setState(331);
				match(T__5);
				 ((SentenciaCondicionalContext)_localctx).ast =  new SentenciaCondicional(((SentenciaCondicionalContext)_localctx).expresion.ast, _localctx.sentencias(0).list, null);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082\13"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\16\3\16\3\16\7\16\u009a\n\16\f"+
		"\16\16\16\u009d\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0102\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u012c\n\21"+
		"\f\21\16\21\u012f\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0151\n\23\3\23\2\3 "+
		"\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\6\3\2\34\35\3\2\36\37"+
		"\4\2\31\32 !\3\2\"#\2\u016a\2&\3\2\2\2\4/\3\2\2\2\6;\3\2\2\2\b=\3\2\2"+
		"\2\nD\3\2\2\2\fL\3\2\2\2\16d\3\2\2\2\20n\3\2\2\2\22q\3\2\2\2\24\u0087"+
		"\3\2\2\2\26\u0089\3\2\2\2\30\u0093\3\2\2\2\32\u009b\3\2\2\2\34\u00ce\3"+
		"\2\2\2\36\u00e0\3\2\2\2 \u0101\3\2\2\2\"\u0130\3\2\2\2$\u0150\3\2\2\2"+
		"&\'\5\4\3\2\'(\7\2\2\3()\b\2\1\2)\3\3\2\2\2*+\5\6\4\2+,\b\3\1\2,.\3\2"+
		"\2\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2"+
		"\2\2\62\63\5\b\5\2\63\64\b\4\1\2\64<\3\2\2\2\65\66\5\n\6\2\66\67\b\4\1"+
		"\2\67<\3\2\2\289\5\f\7\29:\b\4\1\2:<\3\2\2\2;\62\3\2\2\2;\65\3\2\2\2;"+
		"8\3\2\2\2<\7\3\2\2\2=>\7\3\2\2>?\7,\2\2?@\7\4\2\2@A\5\16\b\2AB\7\5\2\2"+
		"BC\b\5\1\2C\t\3\2\2\2DE\7\6\2\2EF\7,\2\2FG\7\7\2\2GH\5\20\t\2HI\7\b\2"+
		"\2IJ\7\5\2\2JK\b\6\1\2K\13\3\2\2\2LM\7,\2\2MO\5\24\13\2NP\7\4\2\2ON\3"+
		"\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\16\b\2RS\7\7\2\2ST\5\30\r\2TU\5\32\16\2"+
		"UV\7\b\2\2VW\b\7\1\2W\r\3\2\2\2XY\7\t\2\2Ye\b\b\1\2Z[\7\n\2\2[e\b\b\1"+
		"\2\\]\7\13\2\2]e\b\b\1\2^_\7,\2\2_e\b\b\1\2`a\5\22\n\2ab\b\b\1\2be\3\2"+
		"\2\2ce\b\b\1\2dX\3\2\2\2dZ\3\2\2\2d\\\3\2\2\2d^\3\2\2\2d`\3\2\2\2dc\3"+
		"\2\2\2e\17\3\2\2\2fg\7,\2\2gh\7\4\2\2hi\5\16\b\2ij\7\5\2\2jk\b\t\1\2k"+
		"m\3\2\2\2lf\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2pn\3\2\2"+
		"\2qr\7\f\2\2rs\7)\2\2st\7\r\2\2tu\5\16\b\2uv\b\n\1\2v\23\3\2\2\2wx\7\16"+
		"\2\2xy\5\26\f\2y\u0080\b\13\1\2z{\7\17\2\2{|\5\26\f\2|}\b\13\1\2}\177"+
		"\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0086\7\16\2\2\u0086\u0088\7\20\2\2\u0087w\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b"+
		"\7\4\2\2\u008b\u008c\5\16\b\2\u008c\u008d\b\f\1\2\u008d\27\3\2\2\2\u008e"+
		"\u008f\5\b\5\2\u008f\u0090\b\r\1\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\34\17\2\u0097\u0098\b\16"+
		"\1\2\u0098\u009a\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\33\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u009f\7\21\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\5\2\2\u00a1"+
		"\u00a2\b\17\1\2\u00a2\u00cf\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\7"+
		"\5\2\2\u00a5\u00cf\b\17\1\2\u00a6\u00a7\5 \21\2\u00a7\u00a8\7\22\2\2\u00a8"+
		"\u00a9\5 \21\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\b\17\1\2\u00ab\u00cf\3"+
		"\2\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7\5\2\2\u00af"+
		"\u00b0\b\17\1\2\u00b0\u00cf\3\2\2\2\u00b1\u00b2\7\24\2\2\u00b2\u00b3\5"+
		" \21\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\b\17\1\2\u00b5\u00cf\3\2\2\2\u00b6"+
		"\u00b7\7\25\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\b"+
		"\17\1\2\u00ba\u00cf\3\2\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\7\5\2\2\u00bd"+
		"\u00cf\b\17\1\2\u00be\u00bf\7\26\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c1\7"+
		"\5\2\2\u00c1\u00c2\b\17\1\2\u00c2\u00cf\3\2\2\2\u00c3\u00c4\5\"\22\2\u00c4"+
		"\u00c5\b\17\1\2\u00c5\u00cf\3\2\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\b"+
		"\17\1\2\u00c8\u00cf\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cb\5\36\20\2\u00cb"+
		"\u00cc\7\5\2\2\u00cc\u00cd\b\17\1\2\u00cd\u00cf\3\2\2\2\u00ce\u009e\3"+
		"\2\2\2\u00ce\u00a3\3\2\2\2\u00ce\u00a6\3\2\2\2\u00ce\u00ac\3\2\2\2\u00ce"+
		"\u00b1\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00bb\3\2\2\2\u00ce\u00be\3\2"+
		"\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c9\3\2\2\2\u00cf"+
		"\35\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d9\b\20"+
		"\1\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\b\20\1\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7\20\2\2\u00dd\u00e1\3\2\2\2\u00de\u00df\7\16\2\2\u00df\u00e1\7"+
		"\20\2\2\u00e0\u00d0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\37\3\2\2\2\u00e2"+
		"\u00e3\b\21\1\2\u00e3\u00e4\7,\2\2\u00e4\u0102\b\21\1\2\u00e5\u00e6\7"+
		")\2\2\u00e6\u0102\b\21\1\2\u00e7\u00e8\7*\2\2\u00e8\u0102\b\21\1\2\u00e9"+
		"\u00ea\7+\2\2\u00ea\u0102\b\21\1\2\u00eb\u00ec\7\16\2\2\u00ec\u00ed\5"+
		" \21\2\u00ed\u00ee\7\20\2\2\u00ee\u00ef\b\21\1\2\u00ef\u0102\3\2\2\2\u00f0"+
		"\u00f1\7\30\2\2\u00f1\u00f2\7\31\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4"+
		"\7\32\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7\20\2"+
		"\2\u00f7\u00f8\b\21\1\2\u00f8\u0102\3\2\2\2\u00f9\u00fa\7\33\2\2\u00fa"+
		"\u00fb\5 \21\n\u00fb\u00fc\b\21\1\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\7"+
		",\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\b\21\1\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00e2\3\2\2\2\u0101\u00e5\3\2\2\2\u0101\u00e7\3\2\2\2\u0101\u00e9\3\2"+
		"\2\2\u0101\u00eb\3\2\2\2\u0101\u00f0\3\2\2\2\u0101\u00f9\3\2\2\2\u0101"+
		"\u00fd\3\2\2\2\u0102\u012d\3\2\2\2\u0103\u0104\f\t\2\2\u0104\u0105\t\2"+
		"\2\2\u0105\u0106\5 \21\n\u0106\u0107\b\21\1\2\u0107\u012c\3\2\2\2\u0108"+
		"\u0109\f\b\2\2\u0109\u010a\t\3\2\2\u010a\u010b\5 \21\t\u010b\u010c\b\21"+
		"\1\2\u010c\u012c\3\2\2\2\u010d\u010e\f\7\2\2\u010e\u010f\t\4\2\2\u010f"+
		"\u0110\5 \21\b\u0110\u0111\b\21\1\2\u0111\u012c\3\2\2\2\u0112\u0113\f"+
		"\6\2\2\u0113\u0114\t\5\2\2\u0114\u0115\5 \21\7\u0115\u0116\b\21\1\2\u0116"+
		"\u012c\3\2\2\2\u0117\u0118\f\5\2\2\u0118\u0119\7$\2\2\u0119\u011a\5 \21"+
		"\6\u011a\u011b\b\21\1\2\u011b\u012c\3\2\2\2\u011c\u011d\f\4\2\2\u011d"+
		"\u011e\7%\2\2\u011e\u011f\5 \21\5\u011f\u0120\b\21\1\2\u0120\u012c\3\2"+
		"\2\2\u0121\u0122\f\r\2\2\u0122\u0123\7\f\2\2\u0123\u0124\5 \21\2\u0124"+
		"\u0125\7\r\2\2\u0125\u0126\b\21\1\2\u0126\u012c\3\2\2\2\u0127\u0128\f"+
		"\f\2\2\u0128\u0129\7\27\2\2\u0129\u012a\7,\2\2\u012a\u012c\b\21\1\2\u012b"+
		"\u0103\3\2\2\2\u012b\u0108\3\2\2\2\u012b\u010d\3\2\2\2\u012b\u0112\3\2"+
		"\2\2\u012b\u0117\3\2\2\2\u012b\u011c\3\2\2\2\u012b\u0121\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e!\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7&\2\2\u0131\u0132"+
		"\7\16\2\2\u0132\u0133\5 \21\2\u0133\u0134\7\20\2\2\u0134\u0135\7\7\2\2"+
		"\u0135\u0136\5\32\16\2\u0136\u0137\7\b\2\2\u0137\u0138\b\22\1\2\u0138"+
		"#\3\2\2\2\u0139\u013a\7\'\2\2\u013a\u013b\7\16\2\2\u013b\u013c\5 \21\2"+
		"\u013c\u013d\7\20\2\2\u013d\u013e\7\7\2\2\u013e\u013f\5\32\16\2\u013f"+
		"\u0140\7\b\2\2\u0140\u0141\7(\2\2\u0141\u0142\7\7\2\2\u0142\u0143\5\32"+
		"\16\2\u0143\u0144\7\b\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\23\1\2\u0146"+
		"\u0151\3\2\2\2\u0147\u0148\7\'\2\2\u0148\u0149\7\16\2\2\u0149\u014a\5"+
		" \21\2\u014a\u014b\7\20\2\2\u014b\u014c\7\7\2\2\u014c\u014d\5\32\16\2"+
		"\u014d\u014e\7\b\2\2\u014e\u014f\b\23\1\2\u014f\u0151\3\2\2\2\u0150\u0139"+
		"\3\2\2\2\u0150\u0147\3\2\2\2\u0151%\3\2\2\2\22/;Odn\u0080\u0087\u0093"+
		"\u009b\u00ce\u00d9\u00e0\u0101\u012b\u012d\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}