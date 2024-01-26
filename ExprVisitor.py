# Generated from Expr.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#programa.
    def visitPrograma(self, ctx:ExprParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#sentencia.
    def visitSentencia(self, ctx:ExprParser.SentenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#creacion_tabla.
    def visitCreacion_tabla(self, ctx:ExprParser.Creacion_tablaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#definiciones_columna.
    def visitDefiniciones_columna(self, ctx:ExprParser.Definiciones_columnaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#definicion_columna.
    def visitDefinicion_columna(self, ctx:ExprParser.Definicion_columnaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#atributos_columna.
    def visitAtributos_columna(self, ctx:ExprParser.Atributos_columnaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#atrib_columna.
    def visitAtrib_columna(self, ctx:ExprParser.Atrib_columnaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#tipo_dato.
    def visitTipo_dato(self, ctx:ExprParser.Tipo_datoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#insercion.
    def visitInsercion(self, ctx:ExprParser.InsercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#columna_insercion.
    def visitColumna_insercion(self, ctx:ExprParser.Columna_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#fila_insercion.
    def visitFila_insercion(self, ctx:ExprParser.Fila_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#final_insercion.
    def visitFinal_insercion(self, ctx:ExprParser.Final_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#sfinal_insercion.
    def visitSfinal_insercion(self, ctx:ExprParser.Sfinal_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#valores_insercion.
    def visitValores_insercion(self, ctx:ExprParser.Valores_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#valor_insercion.
    def visitValor_insercion(self, ctx:ExprParser.Valor_insercionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#seleccion.
    def visitSeleccion(self, ctx:ExprParser.SeleccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#seleccion_lista.
    def visitSeleccion_lista(self, ctx:ExprParser.Seleccion_listaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#seleccionar_parte.
    def visitSeleccionar_parte(self, ctx:ExprParser.Seleccionar_parteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#seleccionar_todo.
    def visitSeleccionar_todo(self, ctx:ExprParser.Seleccionar_todoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condicion_seleccion.
    def visitCondicion_seleccion(self, ctx:ExprParser.Condicion_seleccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condicion_vacia.
    def visitCondicion_vacia(self, ctx:ExprParser.Condicion_vaciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condicion_where.
    def visitCondicion_where(self, ctx:ExprParser.Condicion_whereContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condicion_order.
    def visitCondicion_order(self, ctx:ExprParser.Condicion_orderContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#operador_logico.
    def visitOperador_logico(self, ctx:ExprParser.Operador_logicoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expresion_logica.
    def visitExpresion_logica(self, ctx:ExprParser.Expresion_logicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#ordenamiento.
    def visitOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#actualizacion.
    def visitActualizacion(self, ctx:ExprParser.ActualizacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condicion_actualizacion.
    def visitCondicion_actualizacion(self, ctx:ExprParser.Condicion_actualizacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#actualizacion_where.
    def visitActualizacion_where(self, ctx:ExprParser.Actualizacion_whereContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#actualizacion_vacia.
    def visitActualizacion_vacia(self, ctx:ExprParser.Actualizacion_vaciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#actualizaciones.
    def visitActualizaciones(self, ctx:ExprParser.ActualizacionesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#valor_actualizacion.
    def visitValor_actualizacion(self, ctx:ExprParser.Valor_actualizacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#operador_aritmetico.
    def visitOperador_aritmetico(self, ctx:ExprParser.Operador_aritmeticoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expresion_actualizacion.
    def visitExpresion_actualizacion(self, ctx:ExprParser.Expresion_actualizacionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#eliminacion.
    def visitEliminacion(self, ctx:ExprParser.EliminacionContext):
        return self.visitChildren(ctx)



del ExprParser