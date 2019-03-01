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
		T__31=32, T__32=33, T__33=34, T__34=35, INT=36, FLOAT=37, CHAR=38, INT_CONSTANT=39, 
		REAL_CONSTANT=40, CHAR_CONSTANT=41, IDENT=42, LINE_COMMENT=43, MULTILINE_COMMENT=44, 
		WHITESPACE=45;
	public static final int
		RULE_start = 0, RULE_definiciones = 1, RULE_definicion = 2, RULE_defVariable = 3, 
		RULE_defStruct = 4, RULE_defFuncion = 5, RULE_tipo = 6, RULE_tipoRetorno = 7, 
		RULE_cuerpoStruct = 8, RULE_tipoArray = 9, RULE_listaParametros = 10, 
		RULE_paramFuncion = 11, RULE_variables = 12, RULE_sentencias = 13, RULE_sentencia = 14, 
		RULE_parametrosInvocacion = 15, RULE_expresion = 16, RULE_bucleWhile = 17, 
		RULE_sentenciaCondicional = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definiciones", "definicion", "defVariable", "defStruct", "defFuncion", 
			"tipo", "tipoRetorno", "cuerpoStruct", "tipoArray", "listaParametros", 
			"paramFuncion", "variables", "sentencias", "sentencia", "parametrosInvocacion", 
			"expresion", "bucleWhile", "sentenciaCondicional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "':'", "';'", "'struct'", "'{'", "'}'", "'['", "']'", 
			"'('", "','", "')'", "'return'", "'='", "'printsp'", "'print'", "'println'", 
			"'read'", "'.'", "'cast'", "'<'", "'>'", "'!'", "'*'", "'/'", "'+'", 
			"'-'", "'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'while'", "'if'", 
			"'else'", "'int'", "'float'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "FLOAT", "CHAR", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
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
			setState(38);
			((StartContext)_localctx).definiciones = definiciones();
			setState(39);
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << IDENT))) != 0)) {
				{
				{
				setState(42);
				((DefinicionesContext)_localctx).definicion = definicion();
				_localctx.list.add(((DefinicionesContext)_localctx).definicion.ast);
				}
				}
				setState(49);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((DefinicionContext)_localctx).defVariable = defVariable();
				((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defVariable.ast;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((DefinicionContext)_localctx).defStruct = defStruct();
				((DefinicionContext)_localctx).ast =  ((DefinicionContext)_localctx).defStruct.ast;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(61);
			match(T__0);
			setState(62);
			((DefVariableContext)_localctx).IDENT = match(IDENT);
			setState(63);
			match(T__1);
			setState(64);
			((DefVariableContext)_localctx).tipo = tipo();
			setState(65);
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
			setState(68);
			match(T__3);
			setState(69);
			((DefStructContext)_localctx).IDENT = match(IDENT);
			setState(70);
			match(T__4);
			setState(71);
			((DefStructContext)_localctx).cuerpoStruct = cuerpoStruct();
			setState(72);
			match(T__5);
			setState(73);
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
		public TipoRetornoContext tipoRetorno;
		public VariablesContext variables;
		public SentenciasContext sentencias;
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
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
			setState(76);
			((DefFuncionContext)_localctx).IDENT = match(IDENT);
			setState(77);
			((DefFuncionContext)_localctx).listaParametros = listaParametros();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(78);
				match(T__1);
				}
			}

			setState(81);
			((DefFuncionContext)_localctx).tipoRetorno = tipoRetorno();
			setState(82);
			match(T__4);
			setState(83);
			((DefFuncionContext)_localctx).variables = variables();
			setState(84);
			((DefFuncionContext)_localctx).sentencias = sentencias();
			setState(85);
			match(T__5);
			  ((DefFuncionContext)_localctx).ast =  new DefFuncion(((DefFuncionContext)_localctx).IDENT, ((DefFuncionContext)_localctx).listaParametros.list, ((DefFuncionContext)_localctx).tipoRetorno.ast, ((DefFuncionContext)_localctx).variables.list, ((DefFuncionContext)_localctx).sentencias.list); 
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
		public Token INT;
		public Token FLOAT;
		public Token CHAR;
		public Token IDENT;
		public TipoArrayContext tipoArray;
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GrammarParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((TipoContext)_localctx).INT = match(INT);
				  ((TipoContext)_localctx).ast =  new TipoEntero(); _localctx.ast.setPositions(((TipoContext)_localctx).INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((TipoContext)_localctx).FLOAT = match(FLOAT);
				  ((TipoContext)_localctx).ast =  new TipoReal(); _localctx.ast.setPositions(((TipoContext)_localctx).FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((TipoContext)_localctx).CHAR = match(CHAR);
				  ((TipoContext)_localctx).ast =  new TipoChar(); _localctx.ast.setPositions(((TipoContext)_localctx).CHAR);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				((TipoContext)_localctx).IDENT = match(IDENT);
				  ((TipoContext)_localctx).ast =  new TipoStruct(((TipoContext)_localctx).IDENT); 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
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

	public static class TipoRetornoContext extends ParserRuleContext {
		public Tipo ast;
		public TipoContext tipo;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipoRetorno);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case INT:
			case FLOAT:
			case CHAR:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((TipoRetornoContext)_localctx).tipo = tipo();
				 ((TipoRetornoContext)_localctx).ast =  ((TipoRetornoContext)_localctx).tipo.ast;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				  ((TipoRetornoContext)_localctx).ast =  new TipoVoid(); _localctx.ast.setPositions();
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
		enterRule(_localctx, 16, RULE_cuerpoStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(107);
				((CuerpoStructContext)_localctx).IDENT = match(IDENT);
				setState(108);
				match(T__1);
				setState(109);
				((CuerpoStructContext)_localctx).tipo = tipo();
				setState(110);
				match(T__2);
				 _localctx.list.add(new CuerpoStruct(((CuerpoStructContext)_localctx).IDENT, ((CuerpoStructContext)_localctx).tipo.ast)); 
				}
				}
				setState(117);
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
		enterRule(_localctx, 18, RULE_tipoArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__6);
			setState(119);
			((TipoArrayContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(120);
			match(T__7);
			setState(121);
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
		enterRule(_localctx, 20, RULE_listaParametros);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__8);
				{
				setState(125);
				((ListaParametrosContext)_localctx).paramFuncion = paramFuncion();
				_localctx.list.add(((ListaParametrosContext)_localctx).paramFuncion.ast);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(127);
					match(T__9);
					setState(128);
					((ListaParametrosContext)_localctx).paramFuncion = paramFuncion();
					_localctx.list.add(((ListaParametrosContext)_localctx).paramFuncion.ast);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(136);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__8);
				setState(139);
				match(T__10);
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
		enterRule(_localctx, 22, RULE_paramFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((ParamFuncionContext)_localctx).IDENT = match(IDENT);
			setState(143);
			match(T__1);
			setState(144);
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
		enterRule(_localctx, 24, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(147);
				((VariablesContext)_localctx).defVariable = defVariable();
				 _localctx.list.add(((VariablesContext)_localctx).defVariable.ast); 
				}
				}
				setState(154);
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
		enterRule(_localctx, 26, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__21) | (1L << T__32) | (1L << T__33) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(155);
				((SentenciasContext)_localctx).sentencia = sentencia();
				 _localctx.list.add(((SentenciasContext)_localctx).sentencia.ast); 
				}
				}
				setState(162);
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
		public Token et;
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
		enterRule(_localctx, 28, RULE_sentencia);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__11);
				setState(164);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(165);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Return(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				((SentenciaContext)_localctx).et = match(T__11);
				setState(169);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Return(null); _localctx.ast.setPositions(((SentenciaContext)_localctx).et); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				expresion(0);
				setState(172);
				match(T__12);
				setState(173);
				expresion(0);
				setState(174);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Asignacion(_localctx.expresion(0).ast, _localctx.expresion(1).ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__13);
				setState(178);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(179);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(T__14);
				setState(183);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(184);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				match(T__15);
				setState(188);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(189);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				match(T__15);
				setState(193);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Print(null); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				match(T__16);
				setState(196);
				((SentenciaContext)_localctx).expresion = expresion(0);
				setState(197);
				match(T__2);
				 ((SentenciaContext)_localctx).ast =  new Read(((SentenciaContext)_localctx).expresion.ast); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(200);
				((SentenciaContext)_localctx).bucleWhile = bucleWhile();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).bucleWhile.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(203);
				((SentenciaContext)_localctx).sentenciaCondicional = sentenciaCondicional();
				 ((SentenciaContext)_localctx).ast =  ((SentenciaContext)_localctx).sentenciaCondicional.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				((SentenciaContext)_localctx).IDENT = match(IDENT);
				setState(207);
				((SentenciaContext)_localctx).parametrosInvocacion = parametrosInvocacion();
				setState(208);
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
		enterRule(_localctx, 30, RULE_parametrosInvocacion);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__8);
				setState(214);
				((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
				_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(216);
					match(T__9);
					setState(217);
					((ParametrosInvocacionContext)_localctx).expresion = expresion(0);
					_localctx.list.add(((ParametrosInvocacionContext)_localctx).expresion.ast);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__8);
				setState(228);
				match(T__10);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(232);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENT);
				}
				break;
			case 2:
				{
				setState(234);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralInt(((ExpresionContext)_localctx).INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(236);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralReal(((ExpresionContext)_localctx).REAL_CONSTANT);
				}
				break;
			case 4:
				{
				setState(238);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new LiteralChar(((ExpresionContext)_localctx).CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(240);
				match(T__8);
				setState(241);
				((ExpresionContext)_localctx).ex = expresion(0);
				setState(242);
				match(T__10);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).ex.ast;
				}
				break;
			case 6:
				{
				setState(245);
				match(T__18);
				setState(246);
				match(T__19);
				setState(247);
				((ExpresionContext)_localctx).tipo = tipo();
				setState(248);
				match(T__20);
				setState(249);
				match(T__8);
				setState(250);
				((ExpresionContext)_localctx).ex = expresion(0);
				setState(251);
				match(T__10);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo.ast, ((ExpresionContext)_localctx).ex.ast);
				}
				break;
			case 7:
				{
				setState(254);
				match(T__21);
				setState(255);
				((ExpresionContext)_localctx).ex = expresion(8);
				 ((ExpresionContext)_localctx).ast =  new Negacion(((ExpresionContext)_localctx).ex.ast);
				}
				break;
			case 8:
				{
				setState(258);
				((ExpresionContext)_localctx).IDENT = match(IDENT);
				setState(259);
				((ExpresionContext)_localctx).parametrosInvocacion = parametrosInvocacion();
				 ((ExpresionContext)_localctx).ast =  new InvocacionFuncion(((ExpresionContext)_localctx).IDENT, ((ExpresionContext)_localctx).parametrosInvocacion.list);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(264);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(265);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(266);
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
						setState(269);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(270);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
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
						setState(274);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(275);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
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
						setState(279);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(280);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
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
						setState(284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(285);
						((ExpresionContext)_localctx).op = match(T__30);
						setState(286);
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
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						((ExpresionContext)_localctx).op = match(T__31);
						setState(291);
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
						setState(294);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(295);
						match(T__6);
						setState(296);
						((ExpresionContext)_localctx).ex2 = expresion(0);
						setState(297);
						match(T__7);
						 ((ExpresionContext)_localctx).ast =  new AccesoArray(((ExpresionContext)_localctx).ex1.ast, ((ExpresionContext)_localctx).ex2.ast);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(300);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(301);
						match(T__17);
						setState(302);
						((ExpresionContext)_localctx).IDENT = match(IDENT);
						 ((ExpresionContext)_localctx).ast =  new AccesoStruct(((ExpresionContext)_localctx).ex.ast, ((ExpresionContext)_localctx).IDENT);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 34, RULE_bucleWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__32);
			setState(310);
			match(T__8);
			setState(311);
			((BucleWhileContext)_localctx).expresion = expresion(0);
			setState(312);
			match(T__10);
			setState(313);
			match(T__4);
			setState(314);
			((BucleWhileContext)_localctx).sentencias = sentencias();
			setState(315);
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
		enterRule(_localctx, 36, RULE_sentenciaCondicional);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__33);
				setState(319);
				match(T__8);
				setState(320);
				((SentenciaCondicionalContext)_localctx).expresion = expresion(0);
				setState(321);
				match(T__10);
				setState(322);
				match(T__4);
				setState(323);
				sentencias();
				setState(324);
				match(T__5);
				{
				setState(325);
				match(T__34);
				setState(326);
				match(T__4);
				setState(327);
				sentencias();
				setState(328);
				match(T__5);
				}
				 ((SentenciaCondicionalContext)_localctx).ast =  new SentenciaCondicional(((SentenciaCondicionalContext)_localctx).expresion.ast, _localctx.sentencias(0).list, _localctx.sentencias(1).list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(T__33);
				setState(333);
				match(T__8);
				setState(334);
				((SentenciaCondicionalContext)_localctx).expresion = expresion(0);
				setState(335);
				match(T__10);
				setState(336);
				match(T__4);
				setState(337);
				sentencias();
				setState(338);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7R\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf"+
		"\n\b\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nt\n\n\f\n\16"+
		"\nw\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0086\n\f\f\f\16\f\u0089\13\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\17"+
		"\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00df"+
		"\n\21\f\21\16\21\u00e2\13\21\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0109\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0133\n\22\f\22\16\22\u0136\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0158\n\24\3\24\2\3\"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\6\3\2\31\32\3\2\33\34\4\2\26\27\35\36\3\2\37 \2\u0170\2(\3"+
		"\2\2\2\4\61\3\2\2\2\6=\3\2\2\2\b?\3\2\2\2\nF\3\2\2\2\fN\3\2\2\2\16e\3"+
		"\2\2\2\20k\3\2\2\2\22u\3\2\2\2\24x\3\2\2\2\26\u008e\3\2\2\2\30\u0090\3"+
		"\2\2\2\32\u009a\3\2\2\2\34\u00a2\3\2\2\2\36\u00d5\3\2\2\2 \u00e7\3\2\2"+
		"\2\"\u0108\3\2\2\2$\u0137\3\2\2\2&\u0157\3\2\2\2()\5\4\3\2)*\7\2\2\3*"+
		"+\b\2\1\2+\3\3\2\2\2,-\5\6\4\2-.\b\3\1\2.\60\3\2\2\2/,\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\5\b"+
		"\5\2\65\66\b\4\1\2\66>\3\2\2\2\678\5\n\6\289\b\4\1\29>\3\2\2\2:;\5\f\7"+
		"\2;<\b\4\1\2<>\3\2\2\2=\64\3\2\2\2=\67\3\2\2\2=:\3\2\2\2>\7\3\2\2\2?@"+
		"\7\3\2\2@A\7,\2\2AB\7\4\2\2BC\5\16\b\2CD\7\5\2\2DE\b\5\1\2E\t\3\2\2\2"+
		"FG\7\6\2\2GH\7,\2\2HI\7\7\2\2IJ\5\22\n\2JK\7\b\2\2KL\7\5\2\2LM\b\6\1\2"+
		"M\13\3\2\2\2NO\7,\2\2OQ\5\26\f\2PR\7\4\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2ST\5\20\t\2TU\7\7\2\2UV\5\32\16\2VW\5\34\17\2WX\7\b\2\2XY\b\7\1\2Y\r"+
		"\3\2\2\2Z[\7&\2\2[f\b\b\1\2\\]\7\'\2\2]f\b\b\1\2^_\7(\2\2_f\b\b\1\2`a"+
		"\7,\2\2af\b\b\1\2bc\5\24\13\2cd\b\b\1\2df\3\2\2\2eZ\3\2\2\2e\\\3\2\2\2"+
		"e^\3\2\2\2e`\3\2\2\2eb\3\2\2\2f\17\3\2\2\2gh\5\16\b\2hi\b\t\1\2il\3\2"+
		"\2\2jl\b\t\1\2kg\3\2\2\2kj\3\2\2\2l\21\3\2\2\2mn\7,\2\2no\7\4\2\2op\5"+
		"\16\b\2pq\7\5\2\2qr\b\n\1\2rt\3\2\2\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\23\3\2\2\2wu\3\2\2\2xy\7\t\2\2yz\7)\2\2z{\7\n\2\2{|\5\16\b\2"+
		"|}\b\13\1\2}\25\3\2\2\2~\177\7\13\2\2\177\u0080\5\30\r\2\u0080\u0087\b"+
		"\f\1\2\u0081\u0082\7\f\2\2\u0082\u0083\5\30\r\2\u0083\u0084\b\f\1\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\r\2\2\u008b\u008f\3\2\2\2\u008c\u008d\7\13\2\2\u008d\u008f\7"+
		"\r\2\2\u008e~\3\2\2\2\u008e\u008c\3\2\2\2\u008f\27\3\2\2\2\u0090\u0091"+
		"\7,\2\2\u0091\u0092\7\4\2\2\u0092\u0093\5\16\b\2\u0093\u0094\b\r\1\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\5\b\5\2\u0096\u0097\b\16\1\2\u0097\u0099\3\2\2"+
		"\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\33\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\36\20\2\u009e"+
		"\u009f\b\17\1\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7"+
		"\5\2\2\u00a8\u00a9\b\20\1\2\u00a9\u00d6\3\2\2\2\u00aa\u00ab\7\16\2\2\u00ab"+
		"\u00ac\7\5\2\2\u00ac\u00d6\b\20\1\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7"+
		"\17\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\5\2\2\u00b1\u00b2\b\20\1\2"+
		"\u00b2\u00d6\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\5\"\22\2\u00b5\u00b6"+
		"\7\5\2\2\u00b6\u00b7\b\20\1\2\u00b7\u00d6\3\2\2\2\u00b8\u00b9\7\21\2\2"+
		"\u00b9\u00ba\5\"\22\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\b\20\1\2\u00bc\u00d6"+
		"\3\2\2\2\u00bd\u00be\7\22\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\5\2\2"+
		"\u00c0\u00c1\b\20\1\2\u00c1\u00d6\3\2\2\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4"+
		"\7\5\2\2\u00c4\u00d6\b\20\1\2\u00c5\u00c6\7\23\2\2\u00c6\u00c7\5\"\22"+
		"\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\b\20\1\2\u00c9\u00d6\3\2\2\2\u00ca"+
		"\u00cb\5$\23\2\u00cb\u00cc\b\20\1\2\u00cc\u00d6\3\2\2\2\u00cd\u00ce\5"+
		"&\24\2\u00ce\u00cf\b\20\1\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1"+
		"\u00d2\5 \21\2\u00d2\u00d3\7\5\2\2\u00d3\u00d4\b\20\1\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00a5\3\2\2\2\u00d5\u00aa\3\2\2\2\u00d5\u00ad\3\2\2\2\u00d5"+
		"\u00b3\3\2\2\2\u00d5\u00b8\3\2\2\2\u00d5\u00bd\3\2\2\2\u00d5\u00c2\3\2"+
		"\2\2\u00d5\u00c5\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cd\3\2\2\2\u00d5"+
		"\u00d0\3\2\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5\"\22"+
		"\2\u00d9\u00e0\b\21\1\2\u00da\u00db\7\f\2\2\u00db\u00dc\5\"\22\2\u00dc"+
		"\u00dd\b\21\1\2\u00dd\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\7\r\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e6\7\13"+
		"\2\2\u00e6\u00e8\7\r\2\2\u00e7\u00d7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"!\3\2\2\2\u00e9\u00ea\b\22\1\2\u00ea\u00eb\7,\2\2\u00eb\u0109\b\22\1\2"+
		"\u00ec\u00ed\7)\2\2\u00ed\u0109\b\22\1\2\u00ee\u00ef\7*\2\2\u00ef\u0109"+
		"\b\22\1\2\u00f0\u00f1\7+\2\2\u00f1\u0109\b\22\1\2\u00f2\u00f3\7\13\2\2"+
		"\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\r\2\2\u00f5\u00f6\b\22\1\2\u00f6\u0109"+
		"\3\2\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\7\26\2\2\u00f9\u00fa\5\16\b"+
		"\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd\5\"\22\2\u00fd"+
		"\u00fe\7\r\2\2\u00fe\u00ff\b\22\1\2\u00ff\u0109\3\2\2\2\u0100\u0101\7"+
		"\30\2\2\u0101\u0102\5\"\22\n\u0102\u0103\b\22\1\2\u0103\u0109\3\2\2\2"+
		"\u0104\u0105\7,\2\2\u0105\u0106\5 \21\2\u0106\u0107\b\22\1\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00e9\3\2\2\2\u0108\u00ec\3\2\2\2\u0108\u00ee\3\2\2\2\u0108"+
		"\u00f0\3\2\2\2\u0108\u00f2\3\2\2\2\u0108\u00f7\3\2\2\2\u0108\u0100\3\2"+
		"\2\2\u0108\u0104\3\2\2\2\u0109\u0134\3\2\2\2\u010a\u010b\f\t\2\2\u010b"+
		"\u010c\t\2\2\2\u010c\u010d\5\"\22\n\u010d\u010e\b\22\1\2\u010e\u0133\3"+
		"\2\2\2\u010f\u0110\f\b\2\2\u0110\u0111\t\3\2\2\u0111\u0112\5\"\22\t\u0112"+
		"\u0113\b\22\1\2\u0113\u0133\3\2\2\2\u0114\u0115\f\7\2\2\u0115\u0116\t"+
		"\4\2\2\u0116\u0117\5\"\22\b\u0117\u0118\b\22\1\2\u0118\u0133\3\2\2\2\u0119"+
		"\u011a\f\6\2\2\u011a\u011b\t\5\2\2\u011b\u011c\5\"\22\7\u011c\u011d\b"+
		"\22\1\2\u011d\u0133\3\2\2\2\u011e\u011f\f\5\2\2\u011f\u0120\7!\2\2\u0120"+
		"\u0121\5\"\22\6\u0121\u0122\b\22\1\2\u0122\u0133\3\2\2\2\u0123\u0124\f"+
		"\4\2\2\u0124\u0125\7\"\2\2\u0125\u0126\5\"\22\5\u0126\u0127\b\22\1\2\u0127"+
		"\u0133\3\2\2\2\u0128\u0129\f\r\2\2\u0129\u012a\7\t\2\2\u012a\u012b\5\""+
		"\22\2\u012b\u012c\7\n\2\2\u012c\u012d\b\22\1\2\u012d\u0133\3\2\2\2\u012e"+
		"\u012f\f\f\2\2\u012f\u0130\7\24\2\2\u0130\u0131\7,\2\2\u0131\u0133\b\22"+
		"\1\2\u0132\u010a\3\2\2\2\u0132\u010f\3\2\2\2\u0132\u0114\3\2\2\2\u0132"+
		"\u0119\3\2\2\2\u0132\u011e\3\2\2\2\u0132\u0123\3\2\2\2\u0132\u0128\3\2"+
		"\2\2\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135#\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7#\2\2\u0138"+
		"\u0139\7\13\2\2\u0139\u013a\5\"\22\2\u013a\u013b\7\r\2\2\u013b\u013c\7"+
		"\7\2\2\u013c\u013d\5\34\17\2\u013d\u013e\7\b\2\2\u013e\u013f\b\23\1\2"+
		"\u013f%\3\2\2\2\u0140\u0141\7$\2\2\u0141\u0142\7\13\2\2\u0142\u0143\5"+
		"\"\22\2\u0143\u0144\7\r\2\2\u0144\u0145\7\7\2\2\u0145\u0146\5\34\17\2"+
		"\u0146\u0147\7\b\2\2\u0147\u0148\7%\2\2\u0148\u0149\7\7\2\2\u0149\u014a"+
		"\5\34\17\2\u014a\u014b\7\b\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\24\1"+
		"\2\u014d\u0158\3\2\2\2\u014e\u014f\7$\2\2\u014f\u0150\7\13\2\2\u0150\u0151"+
		"\5\"\22\2\u0151\u0152\7\r\2\2\u0152\u0153\7\7\2\2\u0153\u0154\5\34\17"+
		"\2\u0154\u0155\7\b\2\2\u0155\u0156\b\24\1\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0140\3\2\2\2\u0157\u014e\3\2\2\2\u0158\'\3\2\2\2\23\61=Qeku\u0087\u008e"+
		"\u009a\u00a2\u00d5\u00e0\u00e7\u0108\u0132\u0134\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}