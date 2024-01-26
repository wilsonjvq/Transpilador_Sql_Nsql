# Generated from Expr.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#programa.
    def enterPrograma(self, ctx:ExprParser.ProgramaContext):
        pass

    # Exit a parse tree produced by ExprParser#programa.
    def exitPrograma(self, ctx:ExprParser.ProgramaContext):
        pass


    # Enter a parse tree produced by ExprParser#sentencia.
    def enterSentencia(self, ctx:ExprParser.SentenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#sentencia.
    def exitSentencia(self, ctx:ExprParser.SentenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#creacion_tabla.
    def enterCreacion_tabla(self, ctx:ExprParser.Creacion_tablaContext):
        pass

    # Exit a parse tree produced by ExprParser#creacion_tabla.
    def exitCreacion_tabla(self, ctx:ExprParser.Creacion_tablaContext):
        pass


    # Enter a parse tree produced by ExprParser#definiciones_columna.
    def enterDefiniciones_columna(self, ctx:ExprParser.Definiciones_columnaContext):
        pass

    # Exit a parse tree produced by ExprParser#definiciones_columna.
    def exitDefiniciones_columna(self, ctx:ExprParser.Definiciones_columnaContext):
        pass


    # Enter a parse tree produced by ExprParser#definicion_columna.
    def enterDefinicion_columna(self, ctx:ExprParser.Definicion_columnaContext):
        pass

    # Exit a parse tree produced by ExprParser#definicion_columna.
    def exitDefinicion_columna(self, ctx:ExprParser.Definicion_columnaContext):
        pass


    # Enter a parse tree produced by ExprParser#atributos_columna.
    def enterAtributos_columna(self, ctx:ExprParser.Atributos_columnaContext):
        pass

    # Exit a parse tree produced by ExprParser#atributos_columna.
    def exitAtributos_columna(self, ctx:ExprParser.Atributos_columnaContext):
        pass


    # Enter a parse tree produced by ExprParser#atrib_columna.
    def enterAtrib_columna(self, ctx:ExprParser.Atrib_columnaContext):
        pass

    # Exit a parse tree produced by ExprParser#atrib_columna.
    def exitAtrib_columna(self, ctx:ExprParser.Atrib_columnaContext):
        pass


    # Enter a parse tree produced by ExprParser#tipo_dato.
    def enterTipo_dato(self, ctx:ExprParser.Tipo_datoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipo_dato.
    def exitTipo_dato(self, ctx:ExprParser.Tipo_datoContext):
        pass


    # Enter a parse tree produced by ExprParser#insercion.
    def enterInsercion(self, ctx:ExprParser.InsercionContext):
        pass

    # Exit a parse tree produced by ExprParser#insercion.
    def exitInsercion(self, ctx:ExprParser.InsercionContext):
        pass


    # Enter a parse tree produced by ExprParser#columna_insercion.
    def enterColumna_insercion(self, ctx:ExprParser.Columna_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#columna_insercion.
    def exitColumna_insercion(self, ctx:ExprParser.Columna_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#fila_insercion.
    def enterFila_insercion(self, ctx:ExprParser.Fila_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#fila_insercion.
    def exitFila_insercion(self, ctx:ExprParser.Fila_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#final_insercion.
    def enterFinal_insercion(self, ctx:ExprParser.Final_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#final_insercion.
    def exitFinal_insercion(self, ctx:ExprParser.Final_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#sfinal_insercion.
    def enterSfinal_insercion(self, ctx:ExprParser.Sfinal_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#sfinal_insercion.
    def exitSfinal_insercion(self, ctx:ExprParser.Sfinal_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#valores_insercion.
    def enterValores_insercion(self, ctx:ExprParser.Valores_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#valores_insercion.
    def exitValores_insercion(self, ctx:ExprParser.Valores_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#valor_insercion.
    def enterValor_insercion(self, ctx:ExprParser.Valor_insercionContext):
        pass

    # Exit a parse tree produced by ExprParser#valor_insercion.
    def exitValor_insercion(self, ctx:ExprParser.Valor_insercionContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccion.
    def enterSeleccion(self, ctx:ExprParser.SeleccionContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccion.
    def exitSeleccion(self, ctx:ExprParser.SeleccionContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccion_lista.
    def enterSeleccion_lista(self, ctx:ExprParser.Seleccion_listaContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccion_lista.
    def exitSeleccion_lista(self, ctx:ExprParser.Seleccion_listaContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccionar_parte.
    def enterSeleccionar_parte(self, ctx:ExprParser.Seleccionar_parteContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccionar_parte.
    def exitSeleccionar_parte(self, ctx:ExprParser.Seleccionar_parteContext):
        pass


    # Enter a parse tree produced by ExprParser#seleccionar_todo.
    def enterSeleccionar_todo(self, ctx:ExprParser.Seleccionar_todoContext):
        pass

    # Exit a parse tree produced by ExprParser#seleccionar_todo.
    def exitSeleccionar_todo(self, ctx:ExprParser.Seleccionar_todoContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion_seleccion.
    def enterCondicion_seleccion(self, ctx:ExprParser.Condicion_seleccionContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion_seleccion.
    def exitCondicion_seleccion(self, ctx:ExprParser.Condicion_seleccionContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion_vacia.
    def enterCondicion_vacia(self, ctx:ExprParser.Condicion_vaciaContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion_vacia.
    def exitCondicion_vacia(self, ctx:ExprParser.Condicion_vaciaContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion_where.
    def enterCondicion_where(self, ctx:ExprParser.Condicion_whereContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion_where.
    def exitCondicion_where(self, ctx:ExprParser.Condicion_whereContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion_order.
    def enterCondicion_order(self, ctx:ExprParser.Condicion_orderContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion_order.
    def exitCondicion_order(self, ctx:ExprParser.Condicion_orderContext):
        pass


    # Enter a parse tree produced by ExprParser#operador_logico.
    def enterOperador_logico(self, ctx:ExprParser.Operador_logicoContext):
        pass

    # Exit a parse tree produced by ExprParser#operador_logico.
    def exitOperador_logico(self, ctx:ExprParser.Operador_logicoContext):
        pass


    # Enter a parse tree produced by ExprParser#expresion_logica.
    def enterExpresion_logica(self, ctx:ExprParser.Expresion_logicaContext):
        pass

    # Exit a parse tree produced by ExprParser#expresion_logica.
    def exitExpresion_logica(self, ctx:ExprParser.Expresion_logicaContext):
        pass


    # Enter a parse tree produced by ExprParser#ordenamiento.
    def enterOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass

    # Exit a parse tree produced by ExprParser#ordenamiento.
    def exitOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizacion.
    def enterActualizacion(self, ctx:ExprParser.ActualizacionContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizacion.
    def exitActualizacion(self, ctx:ExprParser.ActualizacionContext):
        pass


    # Enter a parse tree produced by ExprParser#condicion_actualizacion.
    def enterCondicion_actualizacion(self, ctx:ExprParser.Condicion_actualizacionContext):
        pass

    # Exit a parse tree produced by ExprParser#condicion_actualizacion.
    def exitCondicion_actualizacion(self, ctx:ExprParser.Condicion_actualizacionContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizacion_where.
    def enterActualizacion_where(self, ctx:ExprParser.Actualizacion_whereContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizacion_where.
    def exitActualizacion_where(self, ctx:ExprParser.Actualizacion_whereContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizacion_vacia.
    def enterActualizacion_vacia(self, ctx:ExprParser.Actualizacion_vaciaContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizacion_vacia.
    def exitActualizacion_vacia(self, ctx:ExprParser.Actualizacion_vaciaContext):
        pass


    # Enter a parse tree produced by ExprParser#actualizaciones.
    def enterActualizaciones(self, ctx:ExprParser.ActualizacionesContext):
        pass

    # Exit a parse tree produced by ExprParser#actualizaciones.
    def exitActualizaciones(self, ctx:ExprParser.ActualizacionesContext):
        pass


    # Enter a parse tree produced by ExprParser#valor_actualizacion.
    def enterValor_actualizacion(self, ctx:ExprParser.Valor_actualizacionContext):
        pass

    # Exit a parse tree produced by ExprParser#valor_actualizacion.
    def exitValor_actualizacion(self, ctx:ExprParser.Valor_actualizacionContext):
        pass


    # Enter a parse tree produced by ExprParser#operador_aritmetico.
    def enterOperador_aritmetico(self, ctx:ExprParser.Operador_aritmeticoContext):
        pass

    # Exit a parse tree produced by ExprParser#operador_aritmetico.
    def exitOperador_aritmetico(self, ctx:ExprParser.Operador_aritmeticoContext):
        pass


    # Enter a parse tree produced by ExprParser#expresion_actualizacion.
    def enterExpresion_actualizacion(self, ctx:ExprParser.Expresion_actualizacionContext):
        pass

    # Exit a parse tree produced by ExprParser#expresion_actualizacion.
    def exitExpresion_actualizacion(self, ctx:ExprParser.Expresion_actualizacionContext):
        pass


    # Enter a parse tree produced by ExprParser#eliminacion.
    def enterEliminacion(self, ctx:ExprParser.EliminacionContext):
        pass

    # Exit a parse tree produced by ExprParser#eliminacion.
    def exitEliminacion(self, ctx:ExprParser.EliminacionContext):
        pass



del ExprParser