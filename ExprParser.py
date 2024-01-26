# Generated from Expr.g4 by ANTLR 4.13.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,52,286,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,1,0,1,0,1,0,5,0,74,8,0,10,0,12,0,77,9,0,1,1,1,1,1,
        1,1,1,1,1,3,1,84,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,5,3,
        96,8,3,10,3,12,3,99,9,3,1,4,1,4,1,4,1,4,1,5,1,5,1,5,5,5,108,8,5,
        10,5,12,5,111,9,5,1,6,1,6,1,6,1,6,1,6,3,6,118,8,6,1,7,1,7,1,7,1,
        7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,138,
        8,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,5,9,152,8,9,
        10,9,12,9,155,9,9,1,9,3,9,158,8,9,1,10,1,10,1,10,1,10,1,10,5,10,
        165,8,10,10,10,12,10,168,9,10,1,10,1,10,1,10,1,10,1,11,1,11,1,12,
        1,12,1,13,1,13,1,13,5,13,181,8,13,10,13,12,13,184,9,13,1,14,1,14,
        1,14,1,14,1,14,1,14,1,14,3,14,193,8,14,1,15,1,15,1,15,1,15,1,15,
        1,15,1,16,1,16,3,16,203,8,16,1,17,1,17,1,17,5,17,208,8,17,10,17,
        12,17,211,9,17,1,18,1,18,1,19,1,19,1,19,3,19,218,8,19,1,20,1,20,
        1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,23,1,23,1,24,
        1,24,1,25,1,25,1,26,1,26,1,26,1,26,1,26,1,26,1,27,1,27,3,27,246,
        8,27,1,28,1,28,1,28,1,28,1,28,1,29,1,29,1,30,1,30,1,30,1,30,1,30,
        1,30,1,30,5,30,262,8,30,10,30,12,30,265,9,30,1,31,1,31,1,31,1,31,
        1,31,3,31,272,8,31,1,32,1,32,1,33,1,33,1,34,1,34,1,34,1,34,1,34,
        1,34,1,34,1,34,1,34,0,1,10,35,0,2,4,6,8,10,12,14,16,18,20,22,24,
        26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,
        0,5,1,0,43,48,1,0,33,38,1,0,16,17,1,0,49,52,2,0,29,29,33,38,282,
        0,75,1,0,0,0,2,83,1,0,0,0,4,85,1,0,0,0,6,92,1,0,0,0,8,100,1,0,0,
        0,10,104,1,0,0,0,12,117,1,0,0,0,14,137,1,0,0,0,16,139,1,0,0,0,18,
        157,1,0,0,0,20,166,1,0,0,0,22,173,1,0,0,0,24,175,1,0,0,0,26,177,
        1,0,0,0,28,192,1,0,0,0,30,194,1,0,0,0,32,202,1,0,0,0,34,204,1,0,
        0,0,36,212,1,0,0,0,38,217,1,0,0,0,40,219,1,0,0,0,42,221,1,0,0,0,
        44,226,1,0,0,0,46,231,1,0,0,0,48,233,1,0,0,0,50,235,1,0,0,0,52,237,
        1,0,0,0,54,245,1,0,0,0,56,247,1,0,0,0,58,252,1,0,0,0,60,254,1,0,
        0,0,62,271,1,0,0,0,64,273,1,0,0,0,66,275,1,0,0,0,68,277,1,0,0,0,
        70,71,3,2,1,0,71,72,5,42,0,0,72,74,1,0,0,0,73,70,1,0,0,0,74,77,1,
        0,0,0,75,73,1,0,0,0,75,76,1,0,0,0,76,1,1,0,0,0,77,75,1,0,0,0,78,
        84,3,4,2,0,79,84,3,16,8,0,80,84,3,30,15,0,81,84,3,52,26,0,82,84,
        3,68,34,0,83,78,1,0,0,0,83,79,1,0,0,0,83,80,1,0,0,0,83,81,1,0,0,
        0,83,82,1,0,0,0,84,3,1,0,0,0,85,86,5,1,0,0,86,87,5,2,0,0,87,88,5,
        29,0,0,88,89,5,39,0,0,89,90,3,6,3,0,90,91,5,40,0,0,91,5,1,0,0,0,
        92,97,3,8,4,0,93,94,5,41,0,0,94,96,3,8,4,0,95,93,1,0,0,0,96,99,1,
        0,0,0,97,95,1,0,0,0,97,98,1,0,0,0,98,7,1,0,0,0,99,97,1,0,0,0,100,
        101,5,29,0,0,101,102,3,14,7,0,102,103,3,10,5,0,103,9,1,0,0,0,104,
        109,6,5,-1,0,105,106,10,1,0,0,106,108,3,12,6,0,107,105,1,0,0,0,108,
        111,1,0,0,0,109,107,1,0,0,0,109,110,1,0,0,0,110,11,1,0,0,0,111,109,
        1,0,0,0,112,113,5,3,0,0,113,118,5,4,0,0,114,115,5,5,0,0,115,118,
        5,6,0,0,116,118,5,7,0,0,117,112,1,0,0,0,117,114,1,0,0,0,117,116,
        1,0,0,0,118,13,1,0,0,0,119,138,5,22,0,0,120,121,5,24,0,0,121,122,
        5,39,0,0,122,123,5,33,0,0,123,124,5,41,0,0,124,125,5,33,0,0,125,
        138,5,40,0,0,126,127,5,23,0,0,127,128,5,39,0,0,128,129,5,33,0,0,
        129,138,5,40,0,0,130,131,5,25,0,0,131,132,5,39,0,0,132,133,5,33,
        0,0,133,138,5,40,0,0,134,138,5,26,0,0,135,138,5,27,0,0,136,138,5,
        28,0,0,137,119,1,0,0,0,137,120,1,0,0,0,137,126,1,0,0,0,137,130,1,
        0,0,0,137,134,1,0,0,0,137,135,1,0,0,0,137,136,1,0,0,0,138,15,1,0,
        0,0,139,140,5,8,0,0,140,141,5,9,0,0,141,142,5,29,0,0,142,143,3,18,
        9,0,143,144,5,10,0,0,144,145,3,20,10,0,145,17,1,0,0,0,146,158,1,
        0,0,0,147,148,5,39,0,0,148,153,5,29,0,0,149,150,5,41,0,0,150,152,
        5,29,0,0,151,149,1,0,0,0,152,155,1,0,0,0,153,151,1,0,0,0,153,154,
        1,0,0,0,154,156,1,0,0,0,155,153,1,0,0,0,156,158,5,40,0,0,157,146,
        1,0,0,0,157,147,1,0,0,0,158,19,1,0,0,0,159,160,5,39,0,0,160,161,
        3,26,13,0,161,162,3,24,12,0,162,163,5,41,0,0,163,165,1,0,0,0,164,
        159,1,0,0,0,165,168,1,0,0,0,166,164,1,0,0,0,166,167,1,0,0,0,167,
        169,1,0,0,0,168,166,1,0,0,0,169,170,5,39,0,0,170,171,3,26,13,0,171,
        172,3,22,11,0,172,21,1,0,0,0,173,174,5,40,0,0,174,23,1,0,0,0,175,
        176,5,40,0,0,176,25,1,0,0,0,177,182,3,28,14,0,178,179,5,41,0,0,179,
        181,3,28,14,0,180,178,1,0,0,0,181,184,1,0,0,0,182,180,1,0,0,0,182,
        183,1,0,0,0,183,27,1,0,0,0,184,182,1,0,0,0,185,193,1,0,0,0,186,193,
        5,33,0,0,187,193,5,34,0,0,188,193,5,35,0,0,189,193,5,36,0,0,190,
        193,5,37,0,0,191,193,5,38,0,0,192,185,1,0,0,0,192,186,1,0,0,0,192,
        187,1,0,0,0,192,188,1,0,0,0,192,189,1,0,0,0,192,190,1,0,0,0,192,
        191,1,0,0,0,193,29,1,0,0,0,194,195,5,11,0,0,195,196,3,32,16,0,196,
        197,5,12,0,0,197,198,5,29,0,0,198,199,3,38,19,0,199,31,1,0,0,0,200,
        203,3,36,18,0,201,203,3,34,17,0,202,200,1,0,0,0,202,201,1,0,0,0,
        203,33,1,0,0,0,204,209,5,29,0,0,205,206,5,41,0,0,206,208,5,29,0,
        0,207,205,1,0,0,0,208,211,1,0,0,0,209,207,1,0,0,0,209,210,1,0,0,
        0,210,35,1,0,0,0,211,209,1,0,0,0,212,213,5,51,0,0,213,37,1,0,0,0,
        214,218,3,40,20,0,215,218,3,42,21,0,216,218,3,44,22,0,217,214,1,
        0,0,0,217,215,1,0,0,0,217,216,1,0,0,0,218,39,1,0,0,0,219,220,1,0,
        0,0,220,41,1,0,0,0,221,222,5,13,0,0,222,223,5,29,0,0,223,224,3,46,
        23,0,224,225,3,48,24,0,225,43,1,0,0,0,226,227,5,14,0,0,227,228,5,
        15,0,0,228,229,5,29,0,0,229,230,3,50,25,0,230,45,1,0,0,0,231,232,
        7,0,0,0,232,47,1,0,0,0,233,234,7,1,0,0,234,49,1,0,0,0,235,236,7,
        2,0,0,236,51,1,0,0,0,237,238,5,18,0,0,238,239,5,29,0,0,239,240,5,
        19,0,0,240,241,3,60,30,0,241,242,3,54,27,0,242,53,1,0,0,0,243,246,
        3,56,28,0,244,246,3,58,29,0,245,243,1,0,0,0,245,244,1,0,0,0,246,
        55,1,0,0,0,247,248,5,13,0,0,248,249,5,29,0,0,249,250,3,46,23,0,250,
        251,3,48,24,0,251,57,1,0,0,0,252,253,1,0,0,0,253,59,1,0,0,0,254,
        255,5,29,0,0,255,256,5,43,0,0,256,263,3,62,31,0,257,258,5,41,0,0,
        258,259,5,29,0,0,259,260,5,43,0,0,260,262,3,62,31,0,261,257,1,0,
        0,0,262,265,1,0,0,0,263,261,1,0,0,0,263,264,1,0,0,0,264,61,1,0,0,
        0,265,263,1,0,0,0,266,272,3,66,33,0,267,268,3,66,33,0,268,269,3,
        64,32,0,269,270,3,66,33,0,270,272,1,0,0,0,271,266,1,0,0,0,271,267,
        1,0,0,0,272,63,1,0,0,0,273,274,7,3,0,0,274,65,1,0,0,0,275,276,7,
        4,0,0,276,67,1,0,0,0,277,278,5,21,0,0,278,279,5,12,0,0,279,280,5,
        29,0,0,280,281,5,13,0,0,281,282,5,29,0,0,282,283,3,46,23,0,283,284,
        3,48,24,0,284,69,1,0,0,0,17,75,83,97,109,117,137,153,157,166,182,
        192,202,209,217,245,263,271
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'INT'", "'VARCHAR'", "'DECIMAL'", 
                     "'CHAR'", "'DATE'", "'TIME'", "'DATETIME'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'('", "')'", "','", "';'", "'='", "<INVALID>", 
                     "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", 
                     "'/'" ]

    symbolicNames = [ "<INVALID>", "CREATE", "TABLE", "PRIMARY", "KEY", 
                      "NOT", "NULL", "UNIQUE", "INSERT", "INTO", "VALUES", 
                      "SELECT", "FROM", "WHERE", "ORDER", "BY", "ASC", "DESC", 
                      "UPDATE", "SET", "IS", "DELETE", "INT", "VARCHAR", 
                      "DECIMAL", "CHAR", "DATE", "TIME", "DATETIME", "ID", 
                      "WS", "COMENTARIO_SIMPLE", "COMENTARIO_MULTILINEA", 
                      "INT_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", "DATE_LITERAL", 
                      "TIME_LITERAL", "DATETIME_LITERAL", "PARENTESIS_IZQ", 
                      "PARENTESIS_DER", "COMA", "PUNTO_Y_COMA", "IGUAL", 
                      "DIFERENTE", "MAYOR", "MENOR", "MAYOR_O_IGUAL", "MENOR_O_IGUAL", 
                      "MAS", "MENOS", "PRODUCTO", "DIVISION" ]

    RULE_programa = 0
    RULE_sentencia = 1
    RULE_creacion_tabla = 2
    RULE_definiciones_columna = 3
    RULE_definicion_columna = 4
    RULE_atributos_columna = 5
    RULE_atrib_columna = 6
    RULE_tipo_dato = 7
    RULE_insercion = 8
    RULE_columna_insercion = 9
    RULE_fila_insercion = 10
    RULE_final_insercion = 11
    RULE_sfinal_insercion = 12
    RULE_valores_insercion = 13
    RULE_valor_insercion = 14
    RULE_seleccion = 15
    RULE_seleccion_lista = 16
    RULE_seleccionar_parte = 17
    RULE_seleccionar_todo = 18
    RULE_condicion_seleccion = 19
    RULE_condicion_vacia = 20
    RULE_condicion_where = 21
    RULE_condicion_order = 22
    RULE_operador_logico = 23
    RULE_expresion_logica = 24
    RULE_ordenamiento = 25
    RULE_actualizacion = 26
    RULE_condicion_actualizacion = 27
    RULE_actualizacion_where = 28
    RULE_actualizacion_vacia = 29
    RULE_actualizaciones = 30
    RULE_valor_actualizacion = 31
    RULE_operador_aritmetico = 32
    RULE_expresion_actualizacion = 33
    RULE_eliminacion = 34

    ruleNames =  [ "programa", "sentencia", "creacion_tabla", "definiciones_columna", 
                   "definicion_columna", "atributos_columna", "atrib_columna", 
                   "tipo_dato", "insercion", "columna_insercion", "fila_insercion", 
                   "final_insercion", "sfinal_insercion", "valores_insercion", 
                   "valor_insercion", "seleccion", "seleccion_lista", "seleccionar_parte", 
                   "seleccionar_todo", "condicion_seleccion", "condicion_vacia", 
                   "condicion_where", "condicion_order", "operador_logico", 
                   "expresion_logica", "ordenamiento", "actualizacion", 
                   "condicion_actualizacion", "actualizacion_where", "actualizacion_vacia", 
                   "actualizaciones", "valor_actualizacion", "operador_aritmetico", 
                   "expresion_actualizacion", "eliminacion" ]

    EOF = Token.EOF
    CREATE=1
    TABLE=2
    PRIMARY=3
    KEY=4
    NOT=5
    NULL=6
    UNIQUE=7
    INSERT=8
    INTO=9
    VALUES=10
    SELECT=11
    FROM=12
    WHERE=13
    ORDER=14
    BY=15
    ASC=16
    DESC=17
    UPDATE=18
    SET=19
    IS=20
    DELETE=21
    INT=22
    VARCHAR=23
    DECIMAL=24
    CHAR=25
    DATE=26
    TIME=27
    DATETIME=28
    ID=29
    WS=30
    COMENTARIO_SIMPLE=31
    COMENTARIO_MULTILINEA=32
    INT_LITERAL=33
    FLOAT_LITERAL=34
    CHAR_LITERAL=35
    DATE_LITERAL=36
    TIME_LITERAL=37
    DATETIME_LITERAL=38
    PARENTESIS_IZQ=39
    PARENTESIS_DER=40
    COMA=41
    PUNTO_Y_COMA=42
    IGUAL=43
    DIFERENTE=44
    MAYOR=45
    MENOR=46
    MAYOR_O_IGUAL=47
    MENOR_O_IGUAL=48
    MAS=49
    MENOS=50
    PRODUCTO=51
    DIVISION=52

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def sentencia(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.SentenciaContext)
            else:
                return self.getTypedRuleContext(ExprParser.SentenciaContext,i)


        def PUNTO_Y_COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO_Y_COMA)
            else:
                return self.getToken(ExprParser.PUNTO_Y_COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = ExprParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 2361602) != 0):
                self.state = 70
                self.sentencia()
                self.state = 71
                self.match(ExprParser.PUNTO_Y_COMA)
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SentenciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def creacion_tabla(self):
            return self.getTypedRuleContext(ExprParser.Creacion_tablaContext,0)


        def insercion(self):
            return self.getTypedRuleContext(ExprParser.InsercionContext,0)


        def seleccion(self):
            return self.getTypedRuleContext(ExprParser.SeleccionContext,0)


        def actualizacion(self):
            return self.getTypedRuleContext(ExprParser.ActualizacionContext,0)


        def eliminacion(self):
            return self.getTypedRuleContext(ExprParser.EliminacionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_sentencia

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSentencia" ):
                listener.enterSentencia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSentencia" ):
                listener.exitSentencia(self)




    def sentencia(self):

        localctx = ExprParser.SentenciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_sentencia)
        try:
            self.state = 83
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 78
                self.creacion_tabla()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 79
                self.insercion()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 3)
                self.state = 80
                self.seleccion()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 4)
                self.state = 81
                self.actualizacion()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 5)
                self.state = 82
                self.eliminacion()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Creacion_tablaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CREATE(self):
            return self.getToken(ExprParser.CREATE, 0)

        def TABLE(self):
            return self.getToken(ExprParser.TABLE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def PARENTESIS_IZQ(self):
            return self.getToken(ExprParser.PARENTESIS_IZQ, 0)

        def definiciones_columna(self):
            return self.getTypedRuleContext(ExprParser.Definiciones_columnaContext,0)


        def PARENTESIS_DER(self):
            return self.getToken(ExprParser.PARENTESIS_DER, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_creacion_tabla

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCreacion_tabla" ):
                listener.enterCreacion_tabla(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCreacion_tabla" ):
                listener.exitCreacion_tabla(self)




    def creacion_tabla(self):

        localctx = ExprParser.Creacion_tablaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_creacion_tabla)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 85
            self.match(ExprParser.CREATE)
            self.state = 86
            self.match(ExprParser.TABLE)
            self.state = 87
            self.match(ExprParser.ID)
            self.state = 88
            self.match(ExprParser.PARENTESIS_IZQ)
            self.state = 89
            self.definiciones_columna()
            self.state = 90
            self.match(ExprParser.PARENTESIS_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Definiciones_columnaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def definicion_columna(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Definicion_columnaContext)
            else:
                return self.getTypedRuleContext(ExprParser.Definicion_columnaContext,i)


        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_definiciones_columna

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefiniciones_columna" ):
                listener.enterDefiniciones_columna(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefiniciones_columna" ):
                listener.exitDefiniciones_columna(self)




    def definiciones_columna(self):

        localctx = ExprParser.Definiciones_columnaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_definiciones_columna)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.definicion_columna()
            self.state = 97
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==41:
                self.state = 93
                self.match(ExprParser.COMA)
                self.state = 94
                self.definicion_columna()
                self.state = 99
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Definicion_columnaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def tipo_dato(self):
            return self.getTypedRuleContext(ExprParser.Tipo_datoContext,0)


        def atributos_columna(self):
            return self.getTypedRuleContext(ExprParser.Atributos_columnaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_definicion_columna

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefinicion_columna" ):
                listener.enterDefinicion_columna(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefinicion_columna" ):
                listener.exitDefinicion_columna(self)




    def definicion_columna(self):

        localctx = ExprParser.Definicion_columnaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_definicion_columna)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(ExprParser.ID)
            self.state = 101
            self.tipo_dato()
            self.state = 102
            self.atributos_columna(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Atributos_columnaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def atributos_columna(self):
            return self.getTypedRuleContext(ExprParser.Atributos_columnaContext,0)


        def atrib_columna(self):
            return self.getTypedRuleContext(ExprParser.Atrib_columnaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_atributos_columna

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtributos_columna" ):
                listener.enterAtributos_columna(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtributos_columna" ):
                listener.exitAtributos_columna(self)



    def atributos_columna(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ExprParser.Atributos_columnaContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 10
        self.enterRecursionRule(localctx, 10, self.RULE_atributos_columna, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self._ctx.stop = self._input.LT(-1)
            self.state = 109
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = ExprParser.Atributos_columnaContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_atributos_columna)
                    self.state = 105
                    if not self.precpred(self._ctx, 1):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 1)")
                    self.state = 106
                    self.atrib_columna() 
                self.state = 111
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class Atrib_columnaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRIMARY(self):
            return self.getToken(ExprParser.PRIMARY, 0)

        def KEY(self):
            return self.getToken(ExprParser.KEY, 0)

        def NOT(self):
            return self.getToken(ExprParser.NOT, 0)

        def NULL(self):
            return self.getToken(ExprParser.NULL, 0)

        def UNIQUE(self):
            return self.getToken(ExprParser.UNIQUE, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_atrib_columna

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtrib_columna" ):
                listener.enterAtrib_columna(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtrib_columna" ):
                listener.exitAtrib_columna(self)




    def atrib_columna(self):

        localctx = ExprParser.Atrib_columnaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_atrib_columna)
        try:
            self.state = 117
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 112
                self.match(ExprParser.PRIMARY)
                self.state = 113
                self.match(ExprParser.KEY)
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 114
                self.match(ExprParser.NOT)
                self.state = 115
                self.match(ExprParser.NULL)
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 3)
                self.state = 116
                self.match(ExprParser.UNIQUE)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Tipo_datoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def DECIMAL(self):
            return self.getToken(ExprParser.DECIMAL, 0)

        def PARENTESIS_IZQ(self):
            return self.getToken(ExprParser.PARENTESIS_IZQ, 0)

        def INT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INT_LITERAL)
            else:
                return self.getToken(ExprParser.INT_LITERAL, i)

        def COMA(self):
            return self.getToken(ExprParser.COMA, 0)

        def PARENTESIS_DER(self):
            return self.getToken(ExprParser.PARENTESIS_DER, 0)

        def VARCHAR(self):
            return self.getToken(ExprParser.VARCHAR, 0)

        def CHAR(self):
            return self.getToken(ExprParser.CHAR, 0)

        def DATE(self):
            return self.getToken(ExprParser.DATE, 0)

        def TIME(self):
            return self.getToken(ExprParser.TIME, 0)

        def DATETIME(self):
            return self.getToken(ExprParser.DATETIME, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_tipo_dato

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipo_dato" ):
                listener.enterTipo_dato(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipo_dato" ):
                listener.exitTipo_dato(self)




    def tipo_dato(self):

        localctx = ExprParser.Tipo_datoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_tipo_dato)
        try:
            self.state = 137
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                self.enterOuterAlt(localctx, 1)
                self.state = 119
                self.match(ExprParser.INT)
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 2)
                self.state = 120
                self.match(ExprParser.DECIMAL)
                self.state = 121
                self.match(ExprParser.PARENTESIS_IZQ)
                self.state = 122
                self.match(ExprParser.INT_LITERAL)
                self.state = 123
                self.match(ExprParser.COMA)
                self.state = 124
                self.match(ExprParser.INT_LITERAL)
                self.state = 125
                self.match(ExprParser.PARENTESIS_DER)
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 3)
                self.state = 126
                self.match(ExprParser.VARCHAR)
                self.state = 127
                self.match(ExprParser.PARENTESIS_IZQ)
                self.state = 128
                self.match(ExprParser.INT_LITERAL)
                self.state = 129
                self.match(ExprParser.PARENTESIS_DER)
                pass
            elif token in [25]:
                self.enterOuterAlt(localctx, 4)
                self.state = 130
                self.match(ExprParser.CHAR)
                self.state = 131
                self.match(ExprParser.PARENTESIS_IZQ)
                self.state = 132
                self.match(ExprParser.INT_LITERAL)
                self.state = 133
                self.match(ExprParser.PARENTESIS_DER)
                pass
            elif token in [26]:
                self.enterOuterAlt(localctx, 5)
                self.state = 134
                self.match(ExprParser.DATE)
                pass
            elif token in [27]:
                self.enterOuterAlt(localctx, 6)
                self.state = 135
                self.match(ExprParser.TIME)
                pass
            elif token in [28]:
                self.enterOuterAlt(localctx, 7)
                self.state = 136
                self.match(ExprParser.DATETIME)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InsercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INSERT(self):
            return self.getToken(ExprParser.INSERT, 0)

        def INTO(self):
            return self.getToken(ExprParser.INTO, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def columna_insercion(self):
            return self.getTypedRuleContext(ExprParser.Columna_insercionContext,0)


        def VALUES(self):
            return self.getToken(ExprParser.VALUES, 0)

        def fila_insercion(self):
            return self.getTypedRuleContext(ExprParser.Fila_insercionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInsercion" ):
                listener.enterInsercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInsercion" ):
                listener.exitInsercion(self)




    def insercion(self):

        localctx = ExprParser.InsercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_insercion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 139
            self.match(ExprParser.INSERT)
            self.state = 140
            self.match(ExprParser.INTO)
            self.state = 141
            self.match(ExprParser.ID)
            self.state = 142
            self.columna_insercion()
            self.state = 143
            self.match(ExprParser.VALUES)
            self.state = 144
            self.fila_insercion()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Columna_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PARENTESIS_IZQ(self):
            return self.getToken(ExprParser.PARENTESIS_IZQ, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def PARENTESIS_DER(self):
            return self.getToken(ExprParser.PARENTESIS_DER, 0)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_columna_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColumna_insercion" ):
                listener.enterColumna_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColumna_insercion" ):
                listener.exitColumna_insercion(self)




    def columna_insercion(self):

        localctx = ExprParser.Columna_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_columna_insercion)
        self._la = 0 # Token type
        try:
            self.state = 157
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [10]:
                self.enterOuterAlt(localctx, 1)

                pass
            elif token in [39]:
                self.enterOuterAlt(localctx, 2)
                self.state = 147
                self.match(ExprParser.PARENTESIS_IZQ)
                self.state = 148
                self.match(ExprParser.ID)
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==41:
                    self.state = 149
                    self.match(ExprParser.COMA)
                    self.state = 150
                    self.match(ExprParser.ID)
                    self.state = 155
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 156
                self.match(ExprParser.PARENTESIS_DER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Fila_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PARENTESIS_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PARENTESIS_IZQ)
            else:
                return self.getToken(ExprParser.PARENTESIS_IZQ, i)

        def valores_insercion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Valores_insercionContext)
            else:
                return self.getTypedRuleContext(ExprParser.Valores_insercionContext,i)


        def final_insercion(self):
            return self.getTypedRuleContext(ExprParser.Final_insercionContext,0)


        def sfinal_insercion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Sfinal_insercionContext)
            else:
                return self.getTypedRuleContext(ExprParser.Sfinal_insercionContext,i)


        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_fila_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFila_insercion" ):
                listener.enterFila_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFila_insercion" ):
                listener.exitFila_insercion(self)




    def fila_insercion(self):

        localctx = ExprParser.Fila_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_fila_insercion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 166
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 159
                    self.match(ExprParser.PARENTESIS_IZQ)
                    self.state = 160
                    self.valores_insercion()
                    self.state = 161
                    self.sfinal_insercion()
                    self.state = 162
                    self.match(ExprParser.COMA) 
                self.state = 168
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

            self.state = 169
            self.match(ExprParser.PARENTESIS_IZQ)
            self.state = 170
            self.valores_insercion()
            self.state = 171
            self.final_insercion()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Final_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PARENTESIS_DER(self):
            return self.getToken(ExprParser.PARENTESIS_DER, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_final_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFinal_insercion" ):
                listener.enterFinal_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFinal_insercion" ):
                listener.exitFinal_insercion(self)




    def final_insercion(self):

        localctx = ExprParser.Final_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_final_insercion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 173
            self.match(ExprParser.PARENTESIS_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Sfinal_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PARENTESIS_DER(self):
            return self.getToken(ExprParser.PARENTESIS_DER, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_sfinal_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSfinal_insercion" ):
                listener.enterSfinal_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSfinal_insercion" ):
                listener.exitSfinal_insercion(self)




    def sfinal_insercion(self):

        localctx = ExprParser.Sfinal_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_sfinal_insercion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 175
            self.match(ExprParser.PARENTESIS_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Valores_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def valor_insercion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Valor_insercionContext)
            else:
                return self.getTypedRuleContext(ExprParser.Valor_insercionContext,i)


        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_valores_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValores_insercion" ):
                listener.enterValores_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValores_insercion" ):
                listener.exitValores_insercion(self)




    def valores_insercion(self):

        localctx = ExprParser.Valores_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_valores_insercion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.valor_insercion()
            self.state = 182
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==41:
                self.state = 178
                self.match(ExprParser.COMA)
                self.state = 179
                self.valor_insercion()
                self.state = 184
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Valor_insercionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT_LITERAL(self):
            return self.getToken(ExprParser.INT_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(ExprParser.FLOAT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(ExprParser.CHAR_LITERAL, 0)

        def DATE_LITERAL(self):
            return self.getToken(ExprParser.DATE_LITERAL, 0)

        def TIME_LITERAL(self):
            return self.getToken(ExprParser.TIME_LITERAL, 0)

        def DATETIME_LITERAL(self):
            return self.getToken(ExprParser.DATETIME_LITERAL, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_valor_insercion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValor_insercion" ):
                listener.enterValor_insercion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValor_insercion" ):
                listener.exitValor_insercion(self)




    def valor_insercion(self):

        localctx = ExprParser.Valor_insercionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_valor_insercion)
        try:
            self.state = 192
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [40, 41]:
                self.enterOuterAlt(localctx, 1)

                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 186
                self.match(ExprParser.INT_LITERAL)
                pass
            elif token in [34]:
                self.enterOuterAlt(localctx, 3)
                self.state = 187
                self.match(ExprParser.FLOAT_LITERAL)
                pass
            elif token in [35]:
                self.enterOuterAlt(localctx, 4)
                self.state = 188
                self.match(ExprParser.CHAR_LITERAL)
                pass
            elif token in [36]:
                self.enterOuterAlt(localctx, 5)
                self.state = 189
                self.match(ExprParser.DATE_LITERAL)
                pass
            elif token in [37]:
                self.enterOuterAlt(localctx, 6)
                self.state = 190
                self.match(ExprParser.TIME_LITERAL)
                pass
            elif token in [38]:
                self.enterOuterAlt(localctx, 7)
                self.state = 191
                self.match(ExprParser.DATETIME_LITERAL)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SeleccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SELECT(self):
            return self.getToken(ExprParser.SELECT, 0)

        def seleccion_lista(self):
            return self.getTypedRuleContext(ExprParser.Seleccion_listaContext,0)


        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def condicion_seleccion(self):
            return self.getTypedRuleContext(ExprParser.Condicion_seleccionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_seleccion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeleccion" ):
                listener.enterSeleccion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeleccion" ):
                listener.exitSeleccion(self)




    def seleccion(self):

        localctx = ExprParser.SeleccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_seleccion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 194
            self.match(ExprParser.SELECT)
            self.state = 195
            self.seleccion_lista()
            self.state = 196
            self.match(ExprParser.FROM)
            self.state = 197
            self.match(ExprParser.ID)
            self.state = 198
            self.condicion_seleccion()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Seleccion_listaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def seleccionar_todo(self):
            return self.getTypedRuleContext(ExprParser.Seleccionar_todoContext,0)


        def seleccionar_parte(self):
            return self.getTypedRuleContext(ExprParser.Seleccionar_parteContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_seleccion_lista

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeleccion_lista" ):
                listener.enterSeleccion_lista(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeleccion_lista" ):
                listener.exitSeleccion_lista(self)




    def seleccion_lista(self):

        localctx = ExprParser.Seleccion_listaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_seleccion_lista)
        try:
            self.state = 202
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [51]:
                self.enterOuterAlt(localctx, 1)
                self.state = 200
                self.seleccionar_todo()
                pass
            elif token in [29]:
                self.enterOuterAlt(localctx, 2)
                self.state = 201
                self.seleccionar_parte()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Seleccionar_parteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_seleccionar_parte

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeleccionar_parte" ):
                listener.enterSeleccionar_parte(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeleccionar_parte" ):
                listener.exitSeleccionar_parte(self)




    def seleccionar_parte(self):

        localctx = ExprParser.Seleccionar_parteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_seleccionar_parte)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 204
            self.match(ExprParser.ID)
            self.state = 209
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==41:
                self.state = 205
                self.match(ExprParser.COMA)
                self.state = 206
                self.match(ExprParser.ID)
                self.state = 211
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Seleccionar_todoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRODUCTO(self):
            return self.getToken(ExprParser.PRODUCTO, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_seleccionar_todo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSeleccionar_todo" ):
                listener.enterSeleccionar_todo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSeleccionar_todo" ):
                listener.exitSeleccionar_todo(self)




    def seleccionar_todo(self):

        localctx = ExprParser.Seleccionar_todoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_seleccionar_todo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 212
            self.match(ExprParser.PRODUCTO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condicion_seleccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def condicion_vacia(self):
            return self.getTypedRuleContext(ExprParser.Condicion_vaciaContext,0)


        def condicion_where(self):
            return self.getTypedRuleContext(ExprParser.Condicion_whereContext,0)


        def condicion_order(self):
            return self.getTypedRuleContext(ExprParser.Condicion_orderContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_condicion_seleccion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion_seleccion" ):
                listener.enterCondicion_seleccion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion_seleccion" ):
                listener.exitCondicion_seleccion(self)




    def condicion_seleccion(self):

        localctx = ExprParser.Condicion_seleccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_condicion_seleccion)
        try:
            self.state = 217
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [42]:
                self.enterOuterAlt(localctx, 1)
                self.state = 214
                self.condicion_vacia()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 2)
                self.state = 215
                self.condicion_where()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 3)
                self.state = 216
                self.condicion_order()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condicion_vaciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_condicion_vacia

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion_vacia" ):
                listener.enterCondicion_vacia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion_vacia" ):
                listener.exitCondicion_vacia(self)




    def condicion_vacia(self):

        localctx = ExprParser.Condicion_vaciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_condicion_vacia)
        try:
            self.enterOuterAlt(localctx, 1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condicion_whereContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def operador_logico(self):
            return self.getTypedRuleContext(ExprParser.Operador_logicoContext,0)


        def expresion_logica(self):
            return self.getTypedRuleContext(ExprParser.Expresion_logicaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_condicion_where

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion_where" ):
                listener.enterCondicion_where(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion_where" ):
                listener.exitCondicion_where(self)




    def condicion_where(self):

        localctx = ExprParser.Condicion_whereContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_condicion_where)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 221
            self.match(ExprParser.WHERE)
            self.state = 222
            self.match(ExprParser.ID)
            self.state = 223
            self.operador_logico()
            self.state = 224
            self.expresion_logica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condicion_orderContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ORDER(self):
            return self.getToken(ExprParser.ORDER, 0)

        def BY(self):
            return self.getToken(ExprParser.BY, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def ordenamiento(self):
            return self.getTypedRuleContext(ExprParser.OrdenamientoContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_condicion_order

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion_order" ):
                listener.enterCondicion_order(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion_order" ):
                listener.exitCondicion_order(self)




    def condicion_order(self):

        localctx = ExprParser.Condicion_orderContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_condicion_order)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 226
            self.match(ExprParser.ORDER)
            self.state = 227
            self.match(ExprParser.BY)
            self.state = 228
            self.match(ExprParser.ID)
            self.state = 229
            self.ordenamiento()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Operador_logicoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IGUAL(self):
            return self.getToken(ExprParser.IGUAL, 0)

        def DIFERENTE(self):
            return self.getToken(ExprParser.DIFERENTE, 0)

        def MAYOR(self):
            return self.getToken(ExprParser.MAYOR, 0)

        def MENOR(self):
            return self.getToken(ExprParser.MENOR, 0)

        def MAYOR_O_IGUAL(self):
            return self.getToken(ExprParser.MAYOR_O_IGUAL, 0)

        def MENOR_O_IGUAL(self):
            return self.getToken(ExprParser.MENOR_O_IGUAL, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_operador_logico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperador_logico" ):
                listener.enterOperador_logico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperador_logico" ):
                listener.exitOperador_logico(self)




    def operador_logico(self):

        localctx = ExprParser.Operador_logicoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_operador_logico)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 231
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 554153860399104) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expresion_logicaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT_LITERAL(self):
            return self.getToken(ExprParser.INT_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(ExprParser.FLOAT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(ExprParser.CHAR_LITERAL, 0)

        def DATE_LITERAL(self):
            return self.getToken(ExprParser.DATE_LITERAL, 0)

        def TIME_LITERAL(self):
            return self.getToken(ExprParser.TIME_LITERAL, 0)

        def DATETIME_LITERAL(self):
            return self.getToken(ExprParser.DATETIME_LITERAL, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expresion_logica

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion_logica" ):
                listener.enterExpresion_logica(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion_logica" ):
                listener.exitExpresion_logica(self)




    def expresion_logica(self):

        localctx = ExprParser.Expresion_logicaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_expresion_logica)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 233
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 541165879296) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OrdenamientoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ASC(self):
            return self.getToken(ExprParser.ASC, 0)

        def DESC(self):
            return self.getToken(ExprParser.DESC, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_ordenamiento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOrdenamiento" ):
                listener.enterOrdenamiento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOrdenamiento" ):
                listener.exitOrdenamiento(self)




    def ordenamiento(self):

        localctx = ExprParser.OrdenamientoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_ordenamiento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 235
            _la = self._input.LA(1)
            if not(_la==16 or _la==17):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ActualizacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def UPDATE(self):
            return self.getToken(ExprParser.UPDATE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def SET(self):
            return self.getToken(ExprParser.SET, 0)

        def actualizaciones(self):
            return self.getTypedRuleContext(ExprParser.ActualizacionesContext,0)


        def condicion_actualizacion(self):
            return self.getTypedRuleContext(ExprParser.Condicion_actualizacionContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_actualizacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterActualizacion" ):
                listener.enterActualizacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitActualizacion" ):
                listener.exitActualizacion(self)




    def actualizacion(self):

        localctx = ExprParser.ActualizacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_actualizacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 237
            self.match(ExprParser.UPDATE)
            self.state = 238
            self.match(ExprParser.ID)
            self.state = 239
            self.match(ExprParser.SET)
            self.state = 240
            self.actualizaciones()
            self.state = 241
            self.condicion_actualizacion()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Condicion_actualizacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def actualizacion_where(self):
            return self.getTypedRuleContext(ExprParser.Actualizacion_whereContext,0)


        def actualizacion_vacia(self):
            return self.getTypedRuleContext(ExprParser.Actualizacion_vaciaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_condicion_actualizacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicion_actualizacion" ):
                listener.enterCondicion_actualizacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicion_actualizacion" ):
                listener.exitCondicion_actualizacion(self)




    def condicion_actualizacion(self):

        localctx = ExprParser.Condicion_actualizacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_condicion_actualizacion)
        try:
            self.state = 245
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13]:
                self.enterOuterAlt(localctx, 1)
                self.state = 243
                self.actualizacion_where()
                pass
            elif token in [42]:
                self.enterOuterAlt(localctx, 2)
                self.state = 244
                self.actualizacion_vacia()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Actualizacion_whereContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def operador_logico(self):
            return self.getTypedRuleContext(ExprParser.Operador_logicoContext,0)


        def expresion_logica(self):
            return self.getTypedRuleContext(ExprParser.Expresion_logicaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_actualizacion_where

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterActualizacion_where" ):
                listener.enterActualizacion_where(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitActualizacion_where" ):
                listener.exitActualizacion_where(self)




    def actualizacion_where(self):

        localctx = ExprParser.Actualizacion_whereContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_actualizacion_where)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 247
            self.match(ExprParser.WHERE)
            self.state = 248
            self.match(ExprParser.ID)
            self.state = 249
            self.operador_logico()
            self.state = 250
            self.expresion_logica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Actualizacion_vaciaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_actualizacion_vacia

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterActualizacion_vacia" ):
                listener.enterActualizacion_vacia(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitActualizacion_vacia" ):
                listener.exitActualizacion_vacia(self)




    def actualizacion_vacia(self):

        localctx = ExprParser.Actualizacion_vaciaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_actualizacion_vacia)
        try:
            self.enterOuterAlt(localctx, 1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ActualizacionesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def IGUAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IGUAL)
            else:
                return self.getToken(ExprParser.IGUAL, i)

        def valor_actualizacion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Valor_actualizacionContext)
            else:
                return self.getTypedRuleContext(ExprParser.Valor_actualizacionContext,i)


        def COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.COMA)
            else:
                return self.getToken(ExprParser.COMA, i)

        def getRuleIndex(self):
            return ExprParser.RULE_actualizaciones

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterActualizaciones" ):
                listener.enterActualizaciones(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitActualizaciones" ):
                listener.exitActualizaciones(self)




    def actualizaciones(self):

        localctx = ExprParser.ActualizacionesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_actualizaciones)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 254
            self.match(ExprParser.ID)
            self.state = 255
            self.match(ExprParser.IGUAL)
            self.state = 256
            self.valor_actualizacion()
            self.state = 263
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==41:
                self.state = 257
                self.match(ExprParser.COMA)
                self.state = 258
                self.match(ExprParser.ID)
                self.state = 259
                self.match(ExprParser.IGUAL)
                self.state = 260
                self.valor_actualizacion()
                self.state = 265
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Valor_actualizacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion_actualizacion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.Expresion_actualizacionContext)
            else:
                return self.getTypedRuleContext(ExprParser.Expresion_actualizacionContext,i)


        def operador_aritmetico(self):
            return self.getTypedRuleContext(ExprParser.Operador_aritmeticoContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_valor_actualizacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValor_actualizacion" ):
                listener.enterValor_actualizacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValor_actualizacion" ):
                listener.exitValor_actualizacion(self)




    def valor_actualizacion(self):

        localctx = ExprParser.Valor_actualizacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_valor_actualizacion)
        try:
            self.state = 271
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,16,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 266
                self.expresion_actualizacion()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 267
                self.expresion_actualizacion()
                self.state = 268
                self.operador_aritmetico()
                self.state = 269
                self.expresion_actualizacion()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Operador_aritmeticoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MAS(self):
            return self.getToken(ExprParser.MAS, 0)

        def MENOS(self):
            return self.getToken(ExprParser.MENOS, 0)

        def PRODUCTO(self):
            return self.getToken(ExprParser.PRODUCTO, 0)

        def DIVISION(self):
            return self.getToken(ExprParser.DIVISION, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_operador_aritmetico

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOperador_aritmetico" ):
                listener.enterOperador_aritmetico(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOperador_aritmetico" ):
                listener.exitOperador_aritmetico(self)




    def operador_aritmetico(self):

        localctx = ExprParser.Operador_aritmeticoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_operador_aritmetico)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 8444249301319680) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expresion_actualizacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def INT_LITERAL(self):
            return self.getToken(ExprParser.INT_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(ExprParser.FLOAT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(ExprParser.CHAR_LITERAL, 0)

        def DATE_LITERAL(self):
            return self.getToken(ExprParser.DATE_LITERAL, 0)

        def TIME_LITERAL(self):
            return self.getToken(ExprParser.TIME_LITERAL, 0)

        def DATETIME_LITERAL(self):
            return self.getToken(ExprParser.DATETIME_LITERAL, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expresion_actualizacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion_actualizacion" ):
                listener.enterExpresion_actualizacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion_actualizacion" ):
                listener.exitExpresion_actualizacion(self)




    def expresion_actualizacion(self):

        localctx = ExprParser.Expresion_actualizacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_expresion_actualizacion)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 275
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 541702750208) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EliminacionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DELETE(self):
            return self.getToken(ExprParser.DELETE, 0)

        def FROM(self):
            return self.getToken(ExprParser.FROM, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def WHERE(self):
            return self.getToken(ExprParser.WHERE, 0)

        def operador_logico(self):
            return self.getTypedRuleContext(ExprParser.Operador_logicoContext,0)


        def expresion_logica(self):
            return self.getTypedRuleContext(ExprParser.Expresion_logicaContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_eliminacion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEliminacion" ):
                listener.enterEliminacion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEliminacion" ):
                listener.exitEliminacion(self)




    def eliminacion(self):

        localctx = ExprParser.EliminacionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_eliminacion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 277
            self.match(ExprParser.DELETE)
            self.state = 278
            self.match(ExprParser.FROM)
            self.state = 279
            self.match(ExprParser.ID)
            self.state = 280
            self.match(ExprParser.WHERE)
            self.state = 281
            self.match(ExprParser.ID)
            self.state = 282
            self.operador_logico()
            self.state = 283
            self.expresion_logica()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[5] = self.atributos_columna_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def atributos_columna_sempred(self, localctx:Atributos_columnaContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 1)
         




