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
		RULE_start = 0, RULE_definiciones = 1, RULE_defVariable = 2, RULE_defStruct = 3, 
		RULE_cuerpoStruct = 4, RULE_tipo = 5, RULE_tipoArray = 6, RULE_defFuncion = 7, 
		RULE_listaParametros = 8, RULE_paramFuncion = 9, RULE_cuerpoFuncion = 10, 
		RULE_variables = 11, RULE_sentencias = 12, RULE_sentencia = 13, RULE_parametrosInvocacion = 14, 
		RULE_expresion = 15, RULE_bucleWhile = 16, RULE_bucleIf = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "defVariable", "defStruct", "cuerpoStruct", 
			"tipo", "tipoArray", "defFuncion", "listaParametros", "paramFuncion", 
			"cuerpoFuncion", "variables", "sentencias", "sentencia", "parametrosInvocacion", 
			"expresion", "bucleWhile", "bucleIf"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'int'", "'float'", 
			"'char'", "'['", "']'", "'('", "')'", "','", "'return'", "'='", "'printsp'", 
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
		public DefVariableContext defVariable;
		public DefStructContext defStruct;
		public DefFuncionContext defFuncion;
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
		public List<DefFuncionContext> defFuncion() {
			return getRuleContexts(DefFuncionContext.class);
		}
		public DefFuncionContext defFuncion(int i) {
			return getRuleContext(DefFuncionContext.class,i);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(40);
					((DefinicionesContext)_localctx).defVariable = defVariable();
					 _localctx.list.add(((DefinicionesContext)_localctx).defVariable.ast); 
					}
					break;
				case T__3:
					{
					setState(43);
					((DefinicionesContext)_localctx).defStruct = defStruct();
					 _localctx.list.add(((DefinicionesContext)_localctx).defStruct.ast); 
					}
					break;
				case IDENT:
					{
					setState(46);
					((DefinicionesContext)_localctx).defFuncion = defFuncion();
					 _localctx.list.add(((DefinicionesContext)_localctx).defFuncion.ast); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
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
		enterRule(_localctx, 4, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			((DefVariableContext)_localctx).IDENT = match(IDENT);
			setState(56);
			match(T__1);
			setState(57);
			((DefVariableContext)_localctx).tipo = tipo();
			setState(58);
			match(T__2);
			 ((DefVariableContext)_localctx).ast =  new DefVariable((((DefVariableContext)_localctx).IDENT!=null?((DefVariableContext)_localctx).IDENT.getText():null), ((DefVariableContext)_localctx).tipo.ast); 
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
		enterRule(_localctx, 6, RULE_defStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(63);
			match(T__4);
			setState(64);
			((DefStructContext)_localctx).cuerpoStruct = cuerpoStruct();
			setState(65);
			match(T__5);
			setState(66);
			match(T__2);
			 ((DefStructContext)_localctx).ast =  new DefStruct((((DefStructContext)_localctx).IDENT!=null?((DefStructContext)_localctx).IDENT.getText():null), ((DefStructContext)_localctx).cuerpoStruct.list); 
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
		enterRule(_localctx, 8, RULE_cuerpoStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(69);
				((CuerpoStructContext)_localctx).IDENT = match(IDENT);
				setState(70);
				match(T__1);
				setState(71);
				((CuerpoStructContext)_localctx).tipo = tipo();
				setState(72);
				match(T__2);
				 _localctx.list.add(new CuerpoStruct((((CuerpoStructContext)_localctx).IDENT!=null?((CuerpoStructContext)_localctx).IDENT.getText():null), ((CuerpoStructContext)_localctx).tipo.ast)); 
				}
				}
				setState(79);
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
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__6);
				  ((TipoContext)_localctx).ast =  new TipoEntero(); 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__7);
				  ((TipoContext)_localctx).ast =  new TipoReal(); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__8);
				  ((TipoContext)_localctx).ast =  new TipoChar(); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				((TipoContext)_localctx).IDENT = match(IDENT);
				  ((TipoContext)_localctx).ast =  new TipoStruct((((TipoContext)_localctx).IDENT!=null?((TipoContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				((TipoContext)_localctx).tipoArray = tipoArray();
				  ((TipoContext)_localctx).ast =  ((TipoContext)_localctx).tipoArray.ast; 
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
		public TipoArray ast;
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
		enterRule(_localctx, 12, RULE_tipoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__9);
			setState(94);
			((TipoArrayContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(95);
			match(T__10);
			setState(96);
			((TipoArrayContext)_localctx).tipo = tipo();
			  ((TipoArrayContext)_localctx).ast =  new TipoArray((((TipoArrayContext)_localctx).INT_CONSTANT!=null?((TipoArrayContext)_localctx).INT_CONSTANT.getText():null), ((TipoArrayContext)_localctx).tipo.ast); 
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
		public CuerpoFuncionContext cuerpoFuncion;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public CuerpoFuncionContext cuerpoFuncion() {
			return getRuleContext(CuerpoFuncionContext.class,0);
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
			setState(99);
			((DefFuncionContext)_localctx).IDENT = match(IDENT);
			setState(100);
			match(T__11);
			setState(101);
			((DefFuncionContext)_localctx).listaParametros = listaParametros();
			setState(102);
			match(T__12);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(103);
				match(T__1);
				setState(104);
				((DefFuncionContext)_localctx).tipo = tipo();
				}
			}

			setState(107);
			match(T__4);
			setState(108);
			((DefFuncionContext)_localctx).cuerpoFuncion = cuerpoFuncion();
			setState(109);
			match(T__5);
			  ((DefFuncionContext)_localctx).ast =  new DefFuncion((((DefFuncionContext)_localctx).IDENT!=null?((DefFuncionContext)_localctx).IDENT.getText():null), ((DefFuncionContext)_localctx).listaParametros.list, ((DefFuncionContext)_localctx).tipo.ast, ((DefFuncionContext)_localctx).cuerpoFuncion.ast); 
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
		enterRule(_localctx, 16, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(112);
				paramFuncion();
				_localctx.list.add(_localctx.paramFuncion(0).ast);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(114);
					match(T__13);
					setState(115);
					paramFuncion();
					_localctx.list.add(_localctx.paramFuncion(1).ast);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		enterRule(_localctx, 18, RULE_paramFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ParamFuncionContext)_localctx).IDENT = match(IDENT);
			setState(126);
			match(T__1);
			setState(127);
			((ParamFuncionContext)_localctx).tipo = tipo();
			  ((ParamFuncionContext)_localctx).ast =  new Param((((ParamFuncionContext)_localctx).IDENT!=null?((ParamFuncionContext)_localctx).IDENT.getText():null), ((ParamFuncionContext)_localctx).tipo.ast); 
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
		public CuerpoFuncion ast;
		public VariablesContext variables;
		public SentenciasContext sentencias;
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public CuerpoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoFuncion; }
	}

	public final CuerpoFuncionContext cuerpoFuncion() throws RecognitionException {
		CuerpoFuncionContext _localctx = new CuerpoFuncionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cuerpoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((CuerpoFuncionContext)_localctx).variables = variables();
			setState(131);
			((CuerpoFuncionContext)_localctx).sentencias = sentencias();
			((CuerpoFuncionContext)_localctx).ast =  new CuerpoFuncion(((CuerpoFuncionContext)_localctx).variables.list, ((CuerpoFuncionContext)_localctx).sentencias.list);
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
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(134);
				((VariablesContext)_localctx).defVariable = defVariable();
				 _localctx.list.add(((VariablesContext)_localctx).defVariable.ast); 
				}
				}
				setState(141);
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
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__35) | (1L << T__36) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(142);
				((SentenciasContext)_localctx).sentencia = sentencia();
				 _localctx.list.add(((SentenciasContext)_localctx).sentencia.ast); 
				}
				}
				setState(149);
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
		public BucleIfContext bucleIf;
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
		public BucleIfContext bucleIf() {
			return getRuleContext(BucleIfContext.class,0);
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
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__14);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(151);
					((SentenciaContext)_localctx).expresion = expresion(0);
					}
				}

				setState(154);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				expresion(0);
				setState(157);
				match(T__15);
				setState(158);
				expresion(0);
				setState(159);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Asignacion(_localctx.expresion(0).ast, _localctx.expresion(1).ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__16);
				setState(163);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(164);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(T__17);
				setState(168);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(169);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(T__18);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(173);
					((SentenciaContext)_localctx).expresion = expresion(0);
					}
				}

				setState(176);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(T__19);
				setState(179);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(180);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				((SentenciaContext)_localctx).bucleWhile = bucleWhile();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).bucleWhile.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				((SentenciaContext)_localctx).bucleIf = bucleIf();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).bucleIf.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(190);
				match(T__11);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(191);
					((SentenciaContext)_localctx).parametrosInvocacion = parametrosInvocacion();
					}
				}

				setState(194);
				match(T__12);
				setState(195);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new InvocacionFuncion((((SentenciaContext)_localctx).IDENT!=null?((SentenciaContext)_localctx).IDENT.getText():null), ((SentenciaContext)_localctx).parametrosInvocacion.list); 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
			_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(201);
				match(T__13);
				setState(202);
				((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
				_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
				}
				}
				setState(209);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion ast;
		public Token IDENT;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public ExpresionContext expresion;
		public TipoContext tipo;
		public ParametrosInvocacionContext parametrosInvocacion;
		public Token op;
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(211);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				 ((ExpresionContext)_localctx).ast =  new Variable((((ExpresionContext)_localctx).IDENT!=null?((ExpresionContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				{
				setState(213);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralInt((((ExpresionContext)_localctx).INT_CONSTANT!=null?((ExpresionContext)_localctx).INT_CONSTANT.getText():null));
				}
				break;
			case 3:
				{
				setState(215);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralReal((((ExpresionContext)_localctx).REAL_CONSTANT!=null?((ExpresionContext)_localctx).REAL_CONSTANT.getText():null));
				}
				break;
			case 4:
				{
				setState(217);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralChar((((ExpresionContext)_localctx).CHAR_CONSTANT!=null?((ExpresionContext)_localctx).CHAR_CONSTANT.getText():null));
				}
				break;
			case 5:
				{
				setState(219);
				match(T__11);
				setState(220);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(221);
				match(T__12);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).expresion.ast;
				}
				break;
			case 6:
				{
				setState(224);
				match(T__21);
				setState(225);
				match(T__22);
				setState(226);
				((ExpresionContext)_localctx).tipo = tipo();
				setState(227);
				match(T__23);
				setState(228);
				match(T__11);
				setState(229);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(230);
				match(T__12);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo.ast, ((ExpresionContext)_localctx).expresion.ast);
				}
				break;
			case 7:
				{
				setState(233);
				match(T__24);
				setState(234);
				((ExpresionContext)_localctx).expresion = expresion(8);
				 ((ExpresionContext)_localctx).ast =  new Negacion(((ExpresionContext)_localctx).expresion.ast);
				}
				break;
			case 8:
				{
				setState(237);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				setState(238);
				match(T__11);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__21) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(239);
					((ExpresionContext)_localctx).parametrosInvocacion = parametrosInvocacion();
					}
				}

				setState(242);
				match(T__12);
				 ((ExpresionContext)_localctx).ast =  new InvocacionFuncion((((ExpresionContext)_localctx).IDENT!=null?((ExpresionContext)_localctx).IDENT.getText():null), ((ExpresionContext)_localctx).parametrosInvocacion.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(246);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(247);
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
						setState(248);
						((ExpresionContext)_localctx).expresion = expresion(8);
						 ((ExpresionContext)_localctx).ast =  new ExpresionAritmetica(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
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
						setState(253);
						((ExpresionContext)_localctx).expresion = expresion(7);
						 ((ExpresionContext)_localctx).ast =  new ExpresionAritmetica(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(256);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(257);
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
						setState(258);
						((ExpresionContext)_localctx).expresion = expresion(6);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
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
						setState(263);
						((ExpresionContext)_localctx).expresion = expresion(5);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						((ExpresionContext)_localctx).op = match(T__33);
						setState(268);
						((ExpresionContext)_localctx).expresion = expresion(4);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						((ExpresionContext)_localctx).op = match(T__34);
						setState(273);
						((ExpresionContext)_localctx).expresion = expresion(3);
						 ((ExpresionContext)_localctx).ast =  new ExpresionBinaria(_localctx.expresion(0).ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null), _localctx.expresion(1).ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(276);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(277);
						match(T__9);
						setState(278);
						((ExpresionContext)_localctx).expresion = expresion(0);
						setState(279);
						match(T__10);
						 ((ExpresionContext)_localctx).ast =  new AccesoArray(_localctx.expresion(0).ast, _localctx.expresion(1).ast);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(282);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(283);
						match(T__20);
						setState(284);
						((ExpresionContext)_localctx).IDENT = match(IDENT);
						 ((ExpresionContext)_localctx).ast =  new AccesoStruct(((ExpresionContext)_localctx).expresion.ast, (((ExpresionContext)_localctx).IDENT!=null?((ExpresionContext)_localctx).IDENT.getText():null));
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public BucleWhile ast;
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
			setState(291);
			match(T__35);
			setState(292);
			match(T__11);
			setState(293);
			((BucleWhileContext)_localctx).expresion = expresion(0);
			setState(294);
			match(T__12);
			setState(295);
			match(T__4);
			setState(296);
			((BucleWhileContext)_localctx).sentencias = sentencias();
			setState(297);
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

	public static class BucleIfContext extends ParserRuleContext {
		public BucleIf ast;
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
		public BucleIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucleIf; }
	}

	public final BucleIfContext bucleIf() throws RecognitionException {
		BucleIfContext _localctx = new BucleIfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bucleIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__36);
			setState(301);
			match(T__11);
			setState(302);
			((BucleIfContext)_localctx).expresion = expresion(0);
			setState(303);
			match(T__12);
			setState(304);
			match(T__4);
			setState(305);
			sentencias();
			setState(306);
			match(T__5);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(307);
				match(T__37);
				setState(308);
				match(T__4);
				setState(309);
				sentencias();
				setState(310);
				match(T__5);
				}
			}

			 ((BucleIfContext)_localctx).ast =  new BucleIf(((BucleIfContext)_localctx).expresion.ast, _localctx.sentencias(0).list, _localctx.sentencias(1).list);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\ny\n\n\f\n\16\n|\13\n\5\n~\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r\3\16\3\16\3\16"+
		"\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\17\3\17\5\17\u009b\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\17"+
		"\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d0\n"+
		"\20\f\20\16\20\u00d3\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f3\n\21\3\21\3\21\5\21\u00f7"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0121\n\21\f\21\16\21\u0124\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u013b\n\23\3\23\3\23\3\23\2\3 \24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\6\3\2\34\35\3\2\36\37\4\2\31\32 !\3\2\"#\2\u0156\2&\3"+
		"\2\2\2\4\65\3\2\2\2\68\3\2\2\2\b?\3\2\2\2\nO\3\2\2\2\f]\3\2\2\2\16_\3"+
		"\2\2\2\20e\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0084\3\2\2\2\30\u008d"+
		"\3\2\2\2\32\u0095\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3\2\2\2 \u00f6\3\2"+
		"\2\2\"\u0125\3\2\2\2$\u012e\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3()\b\2\1\2)\3"+
		"\3\2\2\2*+\5\6\4\2+,\b\3\1\2,\64\3\2\2\2-.\5\b\5\2./\b\3\1\2/\64\3\2\2"+
		"\2\60\61\5\20\t\2\61\62\b\3\1\2\62\64\3\2\2\2\63*\3\2\2\2\63-\3\2\2\2"+
		"\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2"+
		"\67\65\3\2\2\289\7\3\2\29:\7,\2\2:;\7\4\2\2;<\5\f\7\2<=\7\5\2\2=>\b\4"+
		"\1\2>\7\3\2\2\2?@\7\6\2\2@A\7,\2\2AB\7\7\2\2BC\5\n\6\2CD\7\b\2\2DE\7\5"+
		"\2\2EF\b\5\1\2F\t\3\2\2\2GH\7,\2\2HI\7\4\2\2IJ\5\f\7\2JK\7\5\2\2KL\b\6"+
		"\1\2LN\3\2\2\2MG\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QO\3"+
		"\2\2\2RS\7\t\2\2S^\b\7\1\2TU\7\n\2\2U^\b\7\1\2VW\7\13\2\2W^\b\7\1\2XY"+
		"\7,\2\2Y^\b\7\1\2Z[\5\16\b\2[\\\b\7\1\2\\^\3\2\2\2]R\3\2\2\2]T\3\2\2\2"+
		"]V\3\2\2\2]X\3\2\2\2]Z\3\2\2\2^\r\3\2\2\2_`\7\f\2\2`a\7)\2\2ab\7\r\2\2"+
		"bc\5\f\7\2cd\b\b\1\2d\17\3\2\2\2ef\7,\2\2fg\7\16\2\2gh\5\22\n\2hk\7\17"+
		"\2\2ij\7\4\2\2jl\5\f\7\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\7\2\2no\5\26"+
		"\f\2op\7\b\2\2pq\b\t\1\2q\21\3\2\2\2rs\5\24\13\2sz\b\n\1\2tu\7\20\2\2"+
		"uv\5\24\13\2vw\b\n\1\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2}r\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177\u0080\7,\2"+
		"\2\u0080\u0081\7\4\2\2\u0081\u0082\5\f\7\2\u0082\u0083\b\13\1\2\u0083"+
		"\25\3\2\2\2\u0084\u0085\5\30\r\2\u0085\u0086\5\32\16\2\u0086\u0087\b\f"+
		"\1\2\u0087\27\3\2\2\2\u0088\u0089\5\6\4\2\u0089\u008a\b\r\1\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\34\17"+
		"\2\u0091\u0092\b\16\1\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\u009a\7\21\2\2\u0099\u009b\5 \21\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\5"+
		"\2\2\u009d\u00c8\b\17\1\2\u009e\u009f\5 \21\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\u00a1\5 \21\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\b\17\1\2\u00a3\u00c8\3"+
		"\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5 \21\2\u00a6\u00a7\7\5\2\2\u00a7"+
		"\u00a8\b\17\1\2\u00a8\u00c8\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5"+
		" \21\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\b\17\1\2\u00ad\u00c8\3\2\2\2\u00ae"+
		"\u00b0\7\25\2\2\u00af\u00b1\5 \21\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00c8\b\17\1\2\u00b4"+
		"\u00b5\7\26\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\b"+
		"\17\1\2\u00b8\u00c8\3\2\2\2\u00b9\u00ba\5\"\22\2\u00ba\u00bb\b\17\1\2"+
		"\u00bb\u00c8\3\2\2\2\u00bc\u00bd\5$\23\2\u00bd\u00be\b\17\1\2\u00be\u00c8"+
		"\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c2\7\16\2\2\u00c1\u00c3\5\36\20\2"+
		"\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\7\17\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00c8\b\17\1\2\u00c7\u0098\3\2\2\2"+
		"\u00c7\u009e\3\2\2\2\u00c7\u00a4\3\2\2\2\u00c7\u00a9\3\2\2\2\u00c7\u00ae"+
		"\3\2\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\5 \21\2\u00ca\u00d1\b\20\1"+
		"\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\b\20\1\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5"+
		"\b\21\1\2\u00d5\u00d6\7,\2\2\u00d6\u00f7\b\21\1\2\u00d7\u00d8\7)\2\2\u00d8"+
		"\u00f7\b\21\1\2\u00d9\u00da\7*\2\2\u00da\u00f7\b\21\1\2\u00db\u00dc\7"+
		"+\2\2\u00dc\u00f7\b\21\1\2\u00dd\u00de\7\16\2\2\u00de\u00df\5 \21\2\u00df"+
		"\u00e0\7\17\2\2\u00e0\u00e1\b\21\1\2\u00e1\u00f7\3\2\2\2\u00e2\u00e3\7"+
		"\30\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7\32\2\2"+
		"\u00e6\u00e7\7\16\2\2\u00e7\u00e8\5 \21\2\u00e8\u00e9\7\17\2\2\u00e9\u00ea"+
		"\b\21\1\2\u00ea\u00f7\3\2\2\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5 \21\n"+
		"\u00ed\u00ee\b\21\1\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f2"+
		"\7\16\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f7\b\21\1\2\u00f6"+
		"\u00d4\3\2\2\2\u00f6\u00d7\3\2\2\2\u00f6\u00d9\3\2\2\2\u00f6\u00db\3\2"+
		"\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f7\u0122\3\2\2\2\u00f8\u00f9\f\t\2\2\u00f9\u00fa\t\2"+
		"\2\2\u00fa\u00fb\5 \21\n\u00fb\u00fc\b\21\1\2\u00fc\u0121\3\2\2\2\u00fd"+
		"\u00fe\f\b\2\2\u00fe\u00ff\t\3\2\2\u00ff\u0100\5 \21\t\u0100\u0101\b\21"+
		"\1\2\u0101\u0121\3\2\2\2\u0102\u0103\f\7\2\2\u0103\u0104\t\4\2\2\u0104"+
		"\u0105\5 \21\b\u0105\u0106\b\21\1\2\u0106\u0121\3\2\2\2\u0107\u0108\f"+
		"\6\2\2\u0108\u0109\t\5\2\2\u0109\u010a\5 \21\7\u010a\u010b\b\21\1\2\u010b"+
		"\u0121\3\2\2\2\u010c\u010d\f\5\2\2\u010d\u010e\7$\2\2\u010e\u010f\5 \21"+
		"\6\u010f\u0110\b\21\1\2\u0110\u0121\3\2\2\2\u0111\u0112\f\4\2\2\u0112"+
		"\u0113\7%\2\2\u0113\u0114\5 \21\5\u0114\u0115\b\21\1\2\u0115\u0121\3\2"+
		"\2\2\u0116\u0117\f\r\2\2\u0117\u0118\7\f\2\2\u0118\u0119\5 \21\2\u0119"+
		"\u011a\7\r\2\2\u011a\u011b\b\21\1\2\u011b\u0121\3\2\2\2\u011c\u011d\f"+
		"\f\2\2\u011d\u011e\7\27\2\2\u011e\u011f\7,\2\2\u011f\u0121\b\21\1\2\u0120"+
		"\u00f8\3\2\2\2\u0120\u00fd\3\2\2\2\u0120\u0102\3\2\2\2\u0120\u0107\3\2"+
		"\2\2\u0120\u010c\3\2\2\2\u0120\u0111\3\2\2\2\u0120\u0116\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123!\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7&\2\2\u0126\u0127"+
		"\7\16\2\2\u0127\u0128\5 \21\2\u0128\u0129\7\17\2\2\u0129\u012a\7\7\2\2"+
		"\u012a\u012b\5\32\16\2\u012b\u012c\7\b\2\2\u012c\u012d\b\22\1\2\u012d"+
		"#\3\2\2\2\u012e\u012f\7\'\2\2\u012f\u0130\7\16\2\2\u0130\u0131\5 \21\2"+
		"\u0131\u0132\7\17\2\2\u0132\u0133\7\7\2\2\u0133\u0134\5\32\16\2\u0134"+
		"\u013a\7\b\2\2\u0135\u0136\7(\2\2\u0136\u0137\7\7\2\2\u0137\u0138\5\32"+
		"\16\2\u0138\u0139\7\b\2\2\u0139\u013b\3\2\2\2\u013a\u0135\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\23\1\2\u013d%\3\2\2\2"+
		"\25\63\65O]kz}\u008d\u0095\u009a\u00b0\u00c2\u00c7\u00d1\u00f2\u00f6\u0120"+
		"\u0122\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}