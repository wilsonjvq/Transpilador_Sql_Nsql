// Generated from Expr.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, PRIMARY=3, KEY=4, NOT=5, NULL=6, UNIQUE=7, INSERT=8, 
		INTO=9, VALUES=10, SELECT=11, FROM=12, WHERE=13, ORDER=14, BY=15, ASC=16, 
		DESC=17, UPDATE=18, SET=19, IS=20, DELETE=21, INT=22, VARCHAR=23, DECIMAL=24, 
		CHAR=25, DATE=26, TIME=27, DATETIME=28, ID=29, WS=30, COMENTARIO_SIMPLE=31, 
		COMENTARIO_MULTILINEA=32, INT_LITERAL=33, FLOAT_LITERAL=34, CHAR_LITERAL=35, 
		DATE_LITERAL=36, TIME_LITERAL=37, DATETIME_LITERAL=38, PARENTESIS_IZQ=39, 
		PARENTESIS_DER=40, COMA=41, PUNTO_Y_COMA=42, IGUAL=43, DIFERENTE=44, MAYOR=45, 
		MENOR=46, MAYOR_O_IGUAL=47, MENOR_O_IGUAL=48, MAS=49, MENOS=50, PRODUCTO=51, 
		DIVISION=52;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_creacion_tabla = 2, RULE_definiciones_columna = 3, 
		RULE_definicion_columna = 4, RULE_atributos_columna = 5, RULE_atrib_columna = 6, 
		RULE_tipo_dato = 7, RULE_insercion = 8, RULE_columna_insercion = 9, RULE_fila_insercion = 10, 
		RULE_final_insercion = 11, RULE_sfinal_insercion = 12, RULE_valores_insercion = 13, 
		RULE_valor_insercion = 14, RULE_seleccion = 15, RULE_seleccion_lista = 16, 
		RULE_seleccionar_parte = 17, RULE_seleccionar_todo = 18, RULE_condicion_seleccion = 19, 
		RULE_condicion_vacia = 20, RULE_condicion_where = 21, RULE_condicion_order = 22, 
		RULE_operador_logico = 23, RULE_expresion_logica = 24, RULE_ordenamiento = 25, 
		RULE_actualizacion = 26, RULE_condicion_actualizacion = 27, RULE_actualizacion_where = 28, 
		RULE_actualizacion_vacia = 29, RULE_actualizaciones = 30, RULE_valor_actualizacion = 31, 
		RULE_operador_aritmetico = 32, RULE_expresion_actualizacion = 33, RULE_eliminacion = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "creacion_tabla", "definiciones_columna", "definicion_columna", 
			"atributos_columna", "atrib_columna", "tipo_dato", "insercion", "columna_insercion", 
			"fila_insercion", "final_insercion", "sfinal_insercion", "valores_insercion", 
			"valor_insercion", "seleccion", "seleccion_lista", "seleccionar_parte", 
			"seleccionar_todo", "condicion_seleccion", "condicion_vacia", "condicion_where", 
			"condicion_order", "operador_logico", "expresion_logica", "ordenamiento", 
			"actualizacion", "condicion_actualizacion", "actualizacion_where", "actualizacion_vacia", 
			"actualizaciones", "valor_actualizacion", "operador_aritmetico", "expresion_actualizacion", 
			"eliminacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'INT'", 
			"'VARCHAR'", "'DECIMAL'", "'CHAR'", "'DATE'", "'TIME'", "'DATETIME'", 
			null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
			"','", "';'", "'='", null, "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "PRIMARY", "KEY", "NOT", "NULL", "UNIQUE", "INSERT", 
			"INTO", "VALUES", "SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", 
			"UPDATE", "SET", "IS", "DELETE", "INT", "VARCHAR", "DECIMAL", "CHAR", 
			"DATE", "TIME", "DATETIME", "ID", "WS", "COMENTARIO_SIMPLE", "COMENTARIO_MULTILINEA", 
			"INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "DATE_LITERAL", "TIME_LITERAL", 
			"DATETIME_LITERAL", "PARENTESIS_IZQ", "PARENTESIS_DER", "COMA", "PUNTO_Y_COMA", 
			"IGUAL", "DIFERENTE", "MAYOR", "MENOR", "MAYOR_O_IGUAL", "MENOR_O_IGUAL", 
			"MAS", "MENOS", "PRODUCTO", "DIVISION"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(ExprParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(ExprParser.PUNTO_Y_COMA, i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2361602L) != 0)) {
				{
				{
				setState(70);
				sentencia();
				setState(71);
				match(PUNTO_Y_COMA);
				}
				}
				setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public Creacion_tablaContext creacion_tabla() {
			return getRuleContext(Creacion_tablaContext.class,0);
		}
		public InsercionContext insercion() {
			return getRuleContext(InsercionContext.class,0);
		}
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public ActualizacionContext actualizacion() {
			return getRuleContext(ActualizacionContext.class,0);
		}
		public EliminacionContext eliminacion() {
			return getRuleContext(EliminacionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				creacion_tabla();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				insercion();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				seleccion();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				actualizacion();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				eliminacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Creacion_tablaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(ExprParser.PARENTESIS_IZQ, 0); }
		public Definiciones_columnaContext definiciones_columna() {
			return getRuleContext(Definiciones_columnaContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(ExprParser.PARENTESIS_DER, 0); }
		public Creacion_tablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creacion_tabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCreacion_tabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCreacion_tabla(this);
		}
	}

	public final Creacion_tablaContext creacion_tabla() throws RecognitionException {
		Creacion_tablaContext _localctx = new Creacion_tablaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_creacion_tabla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(CREATE);
			setState(86);
			match(TABLE);
			setState(87);
			match(ID);
			setState(88);
			match(PARENTESIS_IZQ);
			setState(89);
			definiciones_columna();
			setState(90);
			match(PARENTESIS_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Definiciones_columnaContext extends ParserRuleContext {
		public List<Definicion_columnaContext> definicion_columna() {
			return getRuleContexts(Definicion_columnaContext.class);
		}
		public Definicion_columnaContext definicion_columna(int i) {
			return getRuleContext(Definicion_columnaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Definiciones_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDefiniciones_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDefiniciones_columna(this);
		}
	}

	public final Definiciones_columnaContext definiciones_columna() throws RecognitionException {
		Definiciones_columnaContext _localctx = new Definiciones_columnaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definiciones_columna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			definicion_columna();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(93);
				match(COMA);
				setState(94);
				definicion_columna();
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Definicion_columnaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Atributos_columnaContext atributos_columna() {
			return getRuleContext(Atributos_columnaContext.class,0);
		}
		public Definicion_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDefinicion_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDefinicion_columna(this);
		}
	}

	public final Definicion_columnaContext definicion_columna() throws RecognitionException {
		Definicion_columnaContext _localctx = new Definicion_columnaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicion_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			tipo_dato();
			setState(102);
			atributos_columna(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Atributos_columnaContext extends ParserRuleContext {
		public Atributos_columnaContext atributos_columna() {
			return getRuleContext(Atributos_columnaContext.class,0);
		}
		public Atrib_columnaContext atrib_columna() {
			return getRuleContext(Atrib_columnaContext.class,0);
		}
		public Atributos_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAtributos_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAtributos_columna(this);
		}
	}

	public final Atributos_columnaContext atributos_columna() throws RecognitionException {
		return atributos_columna(0);
	}

	private Atributos_columnaContext atributos_columna(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Atributos_columnaContext _localctx = new Atributos_columnaContext(_ctx, _parentState);
		Atributos_columnaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_atributos_columna, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Atributos_columnaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_atributos_columna);
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106);
					atrib_columna();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Atrib_columnaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public Atrib_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterAtrib_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitAtrib_columna(this);
		}
	}

	public final Atrib_columnaContext atrib_columna() throws RecognitionException {
		Atrib_columnaContext _localctx = new Atrib_columnaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atrib_columna);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(PRIMARY);
				setState(113);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(NOT);
				setState(115);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(UNIQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(ExprParser.PARENTESIS_IZQ, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(ExprParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(ExprParser.INT_LITERAL, i);
		}
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(ExprParser.PARENTESIS_DER, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(ExprParser.TIME, 0); }
		public TerminalNode DATETIME() { return getToken(ExprParser.DATETIME, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTipo_dato(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_dato);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(DECIMAL);
				setState(121);
				match(PARENTESIS_IZQ);
				setState(122);
				match(INT_LITERAL);
				setState(123);
				match(COMA);
				setState(124);
				match(INT_LITERAL);
				setState(125);
				match(PARENTESIS_DER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(VARCHAR);
				setState(127);
				match(PARENTESIS_IZQ);
				setState(128);
				match(INT_LITERAL);
				setState(129);
				match(PARENTESIS_DER);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(CHAR);
				setState(131);
				match(PARENTESIS_IZQ);
				setState(132);
				match(INT_LITERAL);
				setState(133);
				match(PARENTESIS_DER);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(TIME);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(DATETIME);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsercionContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public Columna_insercionContext columna_insercion() {
			return getRuleContext(Columna_insercionContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public Fila_insercionContext fila_insercion() {
			return getRuleContext(Fila_insercionContext.class,0);
		}
		public InsercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterInsercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitInsercion(this);
		}
	}

	public final InsercionContext insercion() throws RecognitionException {
		InsercionContext _localctx = new InsercionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insercion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INSERT);
			setState(140);
			match(INTO);
			setState(141);
			match(ID);
			setState(142);
			columna_insercion();
			setState(143);
			match(VALUES);
			setState(144);
			fila_insercion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Columna_insercionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQ() { return getToken(ExprParser.PARENTESIS_IZQ, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(ExprParser.PARENTESIS_DER, 0); }
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Columna_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterColumna_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitColumna_insercion(this);
		}
	}

	public final Columna_insercionContext columna_insercion() throws RecognitionException {
		Columna_insercionContext _localctx = new Columna_insercionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columna_insercion);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(PARENTESIS_IZQ);
				setState(148);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(149);
					match(COMA);
					setState(150);
					match(ID);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(PARENTESIS_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fila_insercionContext extends ParserRuleContext {
		public List<TerminalNode> PARENTESIS_IZQ() { return getTokens(ExprParser.PARENTESIS_IZQ); }
		public TerminalNode PARENTESIS_IZQ(int i) {
			return getToken(ExprParser.PARENTESIS_IZQ, i);
		}
		public List<Valores_insercionContext> valores_insercion() {
			return getRuleContexts(Valores_insercionContext.class);
		}
		public Valores_insercionContext valores_insercion(int i) {
			return getRuleContext(Valores_insercionContext.class,i);
		}
		public Final_insercionContext final_insercion() {
			return getRuleContext(Final_insercionContext.class,0);
		}
		public List<Sfinal_insercionContext> sfinal_insercion() {
			return getRuleContexts(Sfinal_insercionContext.class);
		}
		public Sfinal_insercionContext sfinal_insercion(int i) {
			return getRuleContext(Sfinal_insercionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Fila_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFila_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFila_insercion(this);
		}
	}

	public final Fila_insercionContext fila_insercion() throws RecognitionException {
		Fila_insercionContext _localctx = new Fila_insercionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fila_insercion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(PARENTESIS_IZQ);
					setState(160);
					valores_insercion();
					setState(161);
					sfinal_insercion();
					setState(162);
					match(COMA);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(169);
			match(PARENTESIS_IZQ);
			setState(170);
			valores_insercion();
			setState(171);
			final_insercion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Final_insercionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_DER() { return getToken(ExprParser.PARENTESIS_DER, 0); }
		public Final_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFinal_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFinal_insercion(this);
		}
	}

	public final Final_insercionContext final_insercion() throws RecognitionException {
		Final_insercionContext _localctx = new Final_insercionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_final_insercion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(PARENTESIS_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sfinal_insercionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_DER() { return getToken(ExprParser.PARENTESIS_DER, 0); }
		public Sfinal_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sfinal_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSfinal_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSfinal_insercion(this);
		}
	}

	public final Sfinal_insercionContext sfinal_insercion() throws RecognitionException {
		Sfinal_insercionContext _localctx = new Sfinal_insercionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sfinal_insercion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(PARENTESIS_DER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valores_insercionContext extends ParserRuleContext {
		public List<Valor_insercionContext> valor_insercion() {
			return getRuleContexts(Valor_insercionContext.class);
		}
		public Valor_insercionContext valor_insercion(int i) {
			return getRuleContext(Valor_insercionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Valores_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValores_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValores_insercion(this);
		}
	}

	public final Valores_insercionContext valores_insercion() throws RecognitionException {
		Valores_insercionContext _localctx = new Valores_insercionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valores_insercion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			valor_insercion();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(178);
				match(COMA);
				setState(179);
				valor_insercion();
				}
				}
				setState(184);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_insercionContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(ExprParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ExprParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ExprParser.CHAR_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(ExprParser.DATE_LITERAL, 0); }
		public TerminalNode TIME_LITERAL() { return getToken(ExprParser.TIME_LITERAL, 0); }
		public TerminalNode DATETIME_LITERAL() { return getToken(ExprParser.DATETIME_LITERAL, 0); }
		public Valor_insercionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_insercion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValor_insercion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValor_insercion(this);
		}
	}

	public final Valor_insercionContext valor_insercion() throws RecognitionException {
		Valor_insercionContext _localctx = new Valor_insercionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_insercion);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_DER:
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(INT_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(FLOAT_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				match(CHAR_LITERAL);
				}
				break;
			case DATE_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(DATE_LITERAL);
				}
				break;
			case TIME_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(TIME_LITERAL);
				}
				break;
			case DATETIME_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(DATETIME_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeleccionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public Seleccion_listaContext seleccion_lista() {
			return getRuleContext(Seleccion_listaContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public Condicion_seleccionContext condicion_seleccion() {
			return getRuleContext(Condicion_seleccionContext.class,0);
		}
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSeleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSeleccion(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_seleccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SELECT);
			setState(195);
			seleccion_lista();
			setState(196);
			match(FROM);
			setState(197);
			match(ID);
			setState(198);
			condicion_seleccion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Seleccion_listaContext extends ParserRuleContext {
		public Seleccionar_todoContext seleccionar_todo() {
			return getRuleContext(Seleccionar_todoContext.class,0);
		}
		public Seleccionar_parteContext seleccionar_parte() {
			return getRuleContext(Seleccionar_parteContext.class,0);
		}
		public Seleccion_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSeleccion_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSeleccion_lista(this);
		}
	}

	public final Seleccion_listaContext seleccion_lista() throws RecognitionException {
		Seleccion_listaContext _localctx = new Seleccion_listaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seleccion_lista);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRODUCTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				seleccionar_todo();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				seleccionar_parte();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Seleccionar_parteContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Seleccionar_parteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_parte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSeleccionar_parte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSeleccionar_parte(this);
		}
	}

	public final Seleccionar_parteContext seleccionar_parte() throws RecognitionException {
		Seleccionar_parteContext _localctx = new Seleccionar_parteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_seleccionar_parte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(205);
				match(COMA);
				setState(206);
				match(ID);
				}
				}
				setState(211);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Seleccionar_todoContext extends ParserRuleContext {
		public TerminalNode PRODUCTO() { return getToken(ExprParser.PRODUCTO, 0); }
		public Seleccionar_todoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar_todo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSeleccionar_todo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSeleccionar_todo(this);
		}
	}

	public final Seleccionar_todoContext seleccionar_todo() throws RecognitionException {
		Seleccionar_todoContext _localctx = new Seleccionar_todoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_seleccionar_todo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PRODUCTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_seleccionContext extends ParserRuleContext {
		public Condicion_vaciaContext condicion_vacia() {
			return getRuleContext(Condicion_vaciaContext.class,0);
		}
		public Condicion_whereContext condicion_where() {
			return getRuleContext(Condicion_whereContext.class,0);
		}
		public Condicion_orderContext condicion_order() {
			return getRuleContext(Condicion_orderContext.class,0);
		}
		public Condicion_seleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondicion_seleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondicion_seleccion(this);
		}
	}

	public final Condicion_seleccionContext condicion_seleccion() throws RecognitionException {
		Condicion_seleccionContext _localctx = new Condicion_seleccionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicion_seleccion);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				condicion_vacia();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				condicion_where();
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				condicion_order();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_vaciaContext extends ParserRuleContext {
		public Condicion_vaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_vacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondicion_vacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondicion_vacia(this);
		}
	}

	public final Condicion_vaciaContext condicion_vacia() throws RecognitionException {
		Condicion_vaciaContext _localctx = new Condicion_vaciaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condicion_vacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Condicion_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondicion_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondicion_where(this);
		}
	}

	public final Condicion_whereContext condicion_where() throws RecognitionException {
		Condicion_whereContext _localctx = new Condicion_whereContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condicion_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WHERE);
			setState(222);
			match(ID);
			setState(223);
			operador_logico();
			setState(224);
			expresion_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_orderContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ExprParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public OrdenamientoContext ordenamiento() {
			return getRuleContext(OrdenamientoContext.class,0);
		}
		public Condicion_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondicion_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondicion_order(this);
		}
	}

	public final Condicion_orderContext condicion_order() throws RecognitionException {
		Condicion_orderContext _localctx = new Condicion_orderContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condicion_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ORDER);
			setState(227);
			match(BY);
			setState(228);
			match(ID);
			setState(229);
			ordenamiento();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_logicoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(ExprParser.DIFERENTE, 0); }
		public TerminalNode MAYOR() { return getToken(ExprParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(ExprParser.MENOR, 0); }
		public TerminalNode MAYOR_O_IGUAL() { return getToken(ExprParser.MAYOR_O_IGUAL, 0); }
		public TerminalNode MENOR_O_IGUAL() { return getToken(ExprParser.MENOR_O_IGUAL, 0); }
		public Operador_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperador_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperador_logico(this);
		}
	}

	public final Operador_logicoContext operador_logico() throws RecognitionException {
		Operador_logicoContext _localctx = new Operador_logicoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 554153860399104L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_logicaContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(ExprParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ExprParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ExprParser.CHAR_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(ExprParser.DATE_LITERAL, 0); }
		public TerminalNode TIME_LITERAL() { return getToken(ExprParser.TIME_LITERAL, 0); }
		public TerminalNode DATETIME_LITERAL() { return getToken(ExprParser.DATETIME_LITERAL, 0); }
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpresion_logica(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expresion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenamientoContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(ExprParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExprParser.DESC, 0); }
		public OrdenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenamiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOrdenamiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOrdenamiento(this);
		}
	}

	public final OrdenamientoContext ordenamiento() throws RecognitionException {
		OrdenamientoContext _localctx = new OrdenamientoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public ActualizacionesContext actualizaciones() {
			return getRuleContext(ActualizacionesContext.class,0);
		}
		public Condicion_actualizacionContext condicion_actualizacion() {
			return getRuleContext(Condicion_actualizacionContext.class,0);
		}
		public ActualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActualizacion(this);
		}
	}

	public final ActualizacionContext actualizacion() throws RecognitionException {
		ActualizacionContext _localctx = new ActualizacionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_actualizacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(UPDATE);
			setState(238);
			match(ID);
			setState(239);
			match(SET);
			setState(240);
			actualizaciones();
			setState(241);
			condicion_actualizacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condicion_actualizacionContext extends ParserRuleContext {
		public Actualizacion_whereContext actualizacion_where() {
			return getRuleContext(Actualizacion_whereContext.class,0);
		}
		public Actualizacion_vaciaContext actualizacion_vacia() {
			return getRuleContext(Actualizacion_vaciaContext.class,0);
		}
		public Condicion_actualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCondicion_actualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCondicion_actualizacion(this);
		}
	}

	public final Condicion_actualizacionContext condicion_actualizacion() throws RecognitionException {
		Condicion_actualizacionContext _localctx = new Condicion_actualizacionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicion_actualizacion);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				actualizacion_where();
				}
				break;
			case PUNTO_Y_COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				actualizacion_vacia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Actualizacion_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public Actualizacion_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActualizacion_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActualizacion_where(this);
		}
	}

	public final Actualizacion_whereContext actualizacion_where() throws RecognitionException {
		Actualizacion_whereContext _localctx = new Actualizacion_whereContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_actualizacion_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(WHERE);
			setState(248);
			match(ID);
			setState(249);
			operador_logico();
			setState(250);
			expresion_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Actualizacion_vaciaContext extends ParserRuleContext {
		public Actualizacion_vaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacion_vacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActualizacion_vacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActualizacion_vacia(this);
		}
	}

	public final Actualizacion_vaciaContext actualizacion_vacia() throws RecognitionException {
		Actualizacion_vaciaContext _localctx = new Actualizacion_vaciaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_actualizacion_vacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(ExprParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(ExprParser.IGUAL, i);
		}
		public List<Valor_actualizacionContext> valor_actualizacion() {
			return getRuleContexts(Valor_actualizacionContext.class);
		}
		public Valor_actualizacionContext valor_actualizacion(int i) {
			return getRuleContext(Valor_actualizacionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ActualizacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterActualizaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitActualizaciones(this);
		}
	}

	public final ActualizacionesContext actualizaciones() throws RecognitionException {
		ActualizacionesContext _localctx = new ActualizacionesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_actualizaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(IGUAL);
			setState(256);
			valor_actualizacion();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(257);
				match(COMA);
				setState(258);
				match(ID);
				setState(259);
				match(IGUAL);
				setState(260);
				valor_actualizacion();
				}
				}
				setState(265);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_actualizacionContext extends ParserRuleContext {
		public List<Expresion_actualizacionContext> expresion_actualizacion() {
			return getRuleContexts(Expresion_actualizacionContext.class);
		}
		public Expresion_actualizacionContext expresion_actualizacion(int i) {
			return getRuleContext(Expresion_actualizacionContext.class,i);
		}
		public Operador_aritmeticoContext operador_aritmetico() {
			return getRuleContext(Operador_aritmeticoContext.class,0);
		}
		public Valor_actualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterValor_actualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitValor_actualizacion(this);
		}
	}

	public final Valor_actualizacionContext valor_actualizacion() throws RecognitionException {
		Valor_actualizacionContext _localctx = new Valor_actualizacionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valor_actualizacion);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expresion_actualizacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				expresion_actualizacion();
				setState(268);
				operador_aritmetico();
				setState(269);
				expresion_actualizacion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_aritmeticoContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(ExprParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(ExprParser.MENOS, 0); }
		public TerminalNode PRODUCTO() { return getToken(ExprParser.PRODUCTO, 0); }
		public TerminalNode DIVISION() { return getToken(ExprParser.DIVISION, 0); }
		public Operador_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperador_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperador_aritmetico(this);
		}
	}

	public final Operador_aritmeticoContext operador_aritmetico() throws RecognitionException {
		Operador_aritmeticoContext _localctx = new Operador_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operador_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_actualizacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(ExprParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(ExprParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ExprParser.CHAR_LITERAL, 0); }
		public TerminalNode DATE_LITERAL() { return getToken(ExprParser.DATE_LITERAL, 0); }
		public TerminalNode TIME_LITERAL() { return getToken(ExprParser.TIME_LITERAL, 0); }
		public TerminalNode DATETIME_LITERAL() { return getToken(ExprParser.DATETIME_LITERAL, 0); }
		public Expresion_actualizacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_actualizacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpresion_actualizacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpresion_actualizacion(this);
		}
	}

	public final Expresion_actualizacionContext expresion_actualizacion() throws RecognitionException {
		Expresion_actualizacionContext _localctx = new Expresion_actualizacionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expresion_actualizacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541702750208L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EliminacionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public Operador_logicoContext operador_logico() {
			return getRuleContext(Operador_logicoContext.class,0);
		}
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public EliminacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eliminacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterEliminacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitEliminacion(this);
		}
	}

	public final EliminacionContext eliminacion() throws RecognitionException {
		EliminacionContext _localctx = new EliminacionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eliminacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(DELETE);
			setState(278);
			match(FROM);
			setState(279);
			match(ID);
			setState(280);
			match(WHERE);
			setState(281);
			match(ID);
			setState(282);
			operador_logico();
			setState(283);
			expresion_logica();
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
		case 5:
			return atributos_columna_sempred((Atributos_columnaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean atributos_columna_sempred(Atributos_columnaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001T\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003`\b\u0003\n\u0003\f\u0003c\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005l\b"+
		"\u0005\n\u0005\f\u0005o\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0098\b\t\n\t\f\t\u009b\t\t\u0001\t\u0003\t"+
		"\u009e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a5\b\n\n"+
		"\n\f\n\u00a8\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b5\b\r\n\r\f\r\u00b8"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c1\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00cb\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d0"+
		"\b\u0011\n\u0011\f\u0011\u00d3\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00da\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u00f6\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0106\b\u001e"+
		"\n\u001e\f\u001e\u0109\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0110\b\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0000\u0001\n#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0005\u0001\u0000"+
		"+0\u0001\u0000!&\u0001\u0000\u0010\u0011\u0001\u000014\u0002\u0000\u001d"+
		"\u001d!&\u011a\u0000K\u0001\u0000\u0000\u0000\u0002S\u0001\u0000\u0000"+
		"\u0000\u0004U\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000"+
		"\bd\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000\u0000\fu\u0001\u0000"+
		"\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000"+
		"\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000"+
		"\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000"+
		"\u0000\u0000\u001e\u00c2\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000"+
		"\u0000\"\u00cc\u0001\u0000\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000"+
		"&\u00d9\u0001\u0000\u0000\u0000(\u00db\u0001\u0000\u0000\u0000*\u00dd"+
		"\u0001\u0000\u0000\u0000,\u00e2\u0001\u0000\u0000\u0000.\u00e7\u0001\u0000"+
		"\u0000\u00000\u00e9\u0001\u0000\u0000\u00002\u00eb\u0001\u0000\u0000\u0000"+
		"4\u00ed\u0001\u0000\u0000\u00006\u00f5\u0001\u0000\u0000\u00008\u00f7"+
		"\u0001\u0000\u0000\u0000:\u00fc\u0001\u0000\u0000\u0000<\u00fe\u0001\u0000"+
		"\u0000\u0000>\u010f\u0001\u0000\u0000\u0000@\u0111\u0001\u0000\u0000\u0000"+
		"B\u0113\u0001\u0000\u0000\u0000D\u0115\u0001\u0000\u0000\u0000FG\u0003"+
		"\u0002\u0001\u0000GH\u0005*\u0000\u0000HJ\u0001\u0000\u0000\u0000IF\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0001\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NT\u0003\u0004\u0002\u0000OT\u0003\u0010\b\u0000PT\u0003\u001e"+
		"\u000f\u0000QT\u00034\u001a\u0000RT\u0003D\"\u0000SN\u0001\u0000\u0000"+
		"\u0000SO\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000T\u0003\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0001\u0000\u0000VW\u0005\u0002\u0000\u0000WX\u0005\u001d\u0000"+
		"\u0000XY\u0005\'\u0000\u0000YZ\u0003\u0006\u0003\u0000Z[\u0005(\u0000"+
		"\u0000[\u0005\u0001\u0000\u0000\u0000\\a\u0003\b\u0004\u0000]^\u0005)"+
		"\u0000\u0000^`\u0003\b\u0004\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0007"+
		"\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u001d\u0000"+
		"\u0000ef\u0003\u000e\u0007\u0000fg\u0003\n\u0005\u0000g\t\u0001\u0000"+
		"\u0000\u0000hm\u0006\u0005\uffff\uffff\u0000ij\n\u0001\u0000\u0000jl\u0003"+
		"\f\u0006\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u000b\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0003\u0000\u0000qv\u0005\u0004"+
		"\u0000\u0000rs\u0005\u0005\u0000\u0000sv\u0005\u0006\u0000\u0000tv\u0005"+
		"\u0007\u0000\u0000up\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000w\u008a\u0005\u0016"+
		"\u0000\u0000xy\u0005\u0018\u0000\u0000yz\u0005\'\u0000\u0000z{\u0005!"+
		"\u0000\u0000{|\u0005)\u0000\u0000|}\u0005!\u0000\u0000}\u008a\u0005(\u0000"+
		"\u0000~\u007f\u0005\u0017\u0000\u0000\u007f\u0080\u0005\'\u0000\u0000"+
		"\u0080\u0081\u0005!\u0000\u0000\u0081\u008a\u0005(\u0000\u0000\u0082\u0083"+
		"\u0005\u0019\u0000\u0000\u0083\u0084\u0005\'\u0000\u0000\u0084\u0085\u0005"+
		"!\u0000\u0000\u0085\u008a\u0005(\u0000\u0000\u0086\u008a\u0005\u001a\u0000"+
		"\u0000\u0087\u008a\u0005\u001b\u0000\u0000\u0088\u008a\u0005\u001c\u0000"+
		"\u0000\u0089w\u0001\u0000\u0000\u0000\u0089x\u0001\u0000\u0000\u0000\u0089"+
		"~\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000\u0089\u0086"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\b\u0000\u0000\u008c\u008d\u0005\t\u0000\u0000\u008d\u008e\u0005"+
		"\u001d\u0000\u0000\u008e\u008f\u0003\u0012\t\u0000\u008f\u0090\u0005\n"+
		"\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0011\u0001\u0000\u0000"+
		"\u0000\u0092\u009e\u0001\u0000\u0000\u0000\u0093\u0094\u0005\'\u0000\u0000"+
		"\u0094\u0099\u0005\u001d\u0000\u0000\u0095\u0096\u0005)\u0000\u0000\u0096"+
		"\u0098\u0005\u001d\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009e\u0005(\u0000\u0000\u009d\u0092"+
		"\u0001\u0000\u0000\u0000\u009d\u0093\u0001\u0000\u0000\u0000\u009e\u0013"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0\u00a1\u0003"+
		"\u001a\r\u0000\u00a1\u00a2\u0003\u0018\f\u0000\u00a2\u00a3\u0005)\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\'\u0000\u0000"+
		"\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac\u0003\u0016\u000b\u0000\u00ac"+
		"\u0015\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005(\u0000\u0000\u00ae\u0017"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005(\u0000\u0000\u00b0\u0019\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b6\u0003\u001c\u000e\u0000\u00b2\u00b3\u0005"+
		")\u0000\u0000\u00b3\u00b5\u0003\u001c\u000e\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00c1\u0001\u0000"+
		"\u0000\u0000\u00ba\u00c1\u0005!\u0000\u0000\u00bb\u00c1\u0005\"\u0000"+
		"\u0000\u00bc\u00c1\u0005#\u0000\u0000\u00bd\u00c1\u0005$\u0000\u0000\u00be"+
		"\u00c1\u0005%\u0000\u0000\u00bf\u00c1\u0005&\u0000\u0000\u00c0\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u000b\u0000\u0000\u00c3\u00c4\u0003 \u0010\u0000\u00c4\u00c5\u0005\f"+
		"\u0000\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000\u00c6\u00c7\u0003&\u0013"+
		"\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003$\u0012\u0000"+
		"\u00c9\u00cb\u0003\"\u0011\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00d1"+
		"\u0005\u001d\u0000\u0000\u00cd\u00ce\u0005)\u0000\u0000\u00ce\u00d0\u0005"+
		"\u001d\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u00053\u0000\u0000\u00d5%\u0001\u0000\u0000\u0000"+
		"\u00d6\u00da\u0003(\u0014\u0000\u00d7\u00da\u0003*\u0015\u0000\u00d8\u00da"+
		"\u0003,\u0016\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\'\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc)\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\r\u0000\u0000\u00de\u00df\u0005\u001d\u0000\u0000"+
		"\u00df\u00e0\u0003.\u0017\u0000\u00e0\u00e1\u00030\u0018\u0000\u00e1+"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u000e\u0000\u0000\u00e3\u00e4"+
		"\u0005\u000f\u0000\u0000\u00e4\u00e5\u0005\u001d\u0000\u0000\u00e5\u00e6"+
		"\u00032\u0019\u0000\u00e6-\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0000"+
		"\u0000\u0000\u00e8/\u0001\u0000\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000"+
		"\u0000\u00ea1\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0002\u0000\u0000"+
		"\u00ec3\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0012\u0000\u0000\u00ee"+
		"\u00ef\u0005\u001d\u0000\u0000\u00ef\u00f0\u0005\u0013\u0000\u0000\u00f0"+
		"\u00f1\u0003<\u001e\u0000\u00f1\u00f2\u00036\u001b\u0000\u00f25\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f6\u00038\u001c\u0000\u00f4\u00f6\u0003:\u001d"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f67\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\r\u0000\u0000"+
		"\u00f8\u00f9\u0005\u001d\u0000\u0000\u00f9\u00fa\u0003.\u0017\u0000\u00fa"+
		"\u00fb\u00030\u0018\u0000\u00fb9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd;\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u001d"+
		"\u0000\u0000\u00ff\u0100\u0005+\u0000\u0000\u0100\u0107\u0003>\u001f\u0000"+
		"\u0101\u0102\u0005)\u0000\u0000\u0102\u0103\u0005\u001d\u0000\u0000\u0103"+
		"\u0104\u0005+\u0000\u0000\u0104\u0106\u0003>\u001f\u0000\u0105\u0101\u0001"+
		"\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108=\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0110\u0003B!\u0000"+
		"\u010b\u010c\u0003B!\u0000\u010c\u010d\u0003@ \u0000\u010d\u010e\u0003"+
		"B!\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010a\u0001\u0000\u0000"+
		"\u0000\u010f\u010b\u0001\u0000\u0000\u0000\u0110?\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0007\u0003\u0000\u0000\u0112A\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0007\u0004\u0000\u0000\u0114C\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005\u0015\u0000\u0000\u0116\u0117\u0005\f\u0000\u0000\u0117\u0118\u0005"+
		"\u001d\u0000\u0000\u0118\u0119\u0005\r\u0000\u0000\u0119\u011a\u0005\u001d"+
		"\u0000\u0000\u011a\u011b\u0003.\u0017\u0000\u011b\u011c\u00030\u0018\u0000"+
		"\u011cE\u0001\u0000\u0000\u0000\u0011KSamu\u0089\u0099\u009d\u00a6\u00b6"+
		"\u00c0\u00ca\u00d1\u00d9\u00f5\u0107\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}