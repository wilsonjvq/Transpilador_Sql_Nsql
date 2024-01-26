// Generated from Expr.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ExprParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ExprParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#creacion_tabla}.
	 * @param ctx the parse tree
	 */
	void enterCreacion_tabla(ExprParser.Creacion_tablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#creacion_tabla}.
	 * @param ctx the parse tree
	 */
	void exitCreacion_tabla(ExprParser.Creacion_tablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#definiciones_columna}.
	 * @param ctx the parse tree
	 */
	void enterDefiniciones_columna(ExprParser.Definiciones_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#definiciones_columna}.
	 * @param ctx the parse tree
	 */
	void exitDefiniciones_columna(ExprParser.Definiciones_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#definicion_columna}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_columna(ExprParser.Definicion_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#definicion_columna}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_columna(ExprParser.Definicion_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atributos_columna}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_columna(ExprParser.Atributos_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atributos_columna}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_columna(ExprParser.Atributos_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#atrib_columna}.
	 * @param ctx the parse tree
	 */
	void enterAtrib_columna(ExprParser.Atrib_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#atrib_columna}.
	 * @param ctx the parse tree
	 */
	void exitAtrib_columna(ExprParser.Atrib_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(ExprParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(ExprParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#insercion}.
	 * @param ctx the parse tree
	 */
	void enterInsercion(ExprParser.InsercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#insercion}.
	 * @param ctx the parse tree
	 */
	void exitInsercion(ExprParser.InsercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columna_insercion}.
	 * @param ctx the parse tree
	 */
	void enterColumna_insercion(ExprParser.Columna_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columna_insercion}.
	 * @param ctx the parse tree
	 */
	void exitColumna_insercion(ExprParser.Columna_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#fila_insercion}.
	 * @param ctx the parse tree
	 */
	void enterFila_insercion(ExprParser.Fila_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#fila_insercion}.
	 * @param ctx the parse tree
	 */
	void exitFila_insercion(ExprParser.Fila_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#final_insercion}.
	 * @param ctx the parse tree
	 */
	void enterFinal_insercion(ExprParser.Final_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#final_insercion}.
	 * @param ctx the parse tree
	 */
	void exitFinal_insercion(ExprParser.Final_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#sfinal_insercion}.
	 * @param ctx the parse tree
	 */
	void enterSfinal_insercion(ExprParser.Sfinal_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#sfinal_insercion}.
	 * @param ctx the parse tree
	 */
	void exitSfinal_insercion(ExprParser.Sfinal_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valores_insercion}.
	 * @param ctx the parse tree
	 */
	void enterValores_insercion(ExprParser.Valores_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valores_insercion}.
	 * @param ctx the parse tree
	 */
	void exitValores_insercion(ExprParser.Valores_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valor_insercion}.
	 * @param ctx the parse tree
	 */
	void enterValor_insercion(ExprParser.Valor_insercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valor_insercion}.
	 * @param ctx the parse tree
	 */
	void exitValor_insercion(ExprParser.Valor_insercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(ExprParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(ExprParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#seleccion_lista}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion_lista(ExprParser.Seleccion_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#seleccion_lista}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion_lista(ExprParser.Seleccion_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#seleccionar_parte}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar_parte(ExprParser.Seleccionar_parteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#seleccionar_parte}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar_parte(ExprParser.Seleccionar_parteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#seleccionar_todo}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar_todo(ExprParser.Seleccionar_todoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#seleccionar_todo}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar_todo(ExprParser.Seleccionar_todoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion_seleccion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_seleccion(ExprParser.Condicion_seleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion_seleccion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_seleccion(ExprParser.Condicion_seleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion_vacia}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_vacia(ExprParser.Condicion_vaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion_vacia}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_vacia(ExprParser.Condicion_vaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion_where}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_where(ExprParser.Condicion_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion_where}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_where(ExprParser.Condicion_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion_order}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_order(ExprParser.Condicion_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion_order}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_order(ExprParser.Condicion_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(ExprParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(ExprParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(ExprParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(ExprParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ordenamiento}.
	 * @param ctx the parse tree
	 */
	void enterOrdenamiento(ExprParser.OrdenamientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ordenamiento}.
	 * @param ctx the parse tree
	 */
	void exitOrdenamiento(ExprParser.OrdenamientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(ExprParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(ExprParser.ActualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condicion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion_actualizacion(ExprParser.Condicion_actualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condicion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion_actualizacion(ExprParser.Condicion_actualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#actualizacion_where}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion_where(ExprParser.Actualizacion_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#actualizacion_where}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion_where(ExprParser.Actualizacion_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#actualizacion_vacia}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion_vacia(ExprParser.Actualizacion_vaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#actualizacion_vacia}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion_vacia(ExprParser.Actualizacion_vaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#actualizaciones}.
	 * @param ctx the parse tree
	 */
	void enterActualizaciones(ExprParser.ActualizacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#actualizaciones}.
	 * @param ctx the parse tree
	 */
	void exitActualizaciones(ExprParser.ActualizacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valor_actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterValor_actualizacion(ExprParser.Valor_actualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valor_actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitValor_actualizacion(ExprParser.Valor_actualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(ExprParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(ExprParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expresion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_actualizacion(ExprParser.Expresion_actualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expresion_actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_actualizacion(ExprParser.Expresion_actualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#eliminacion}.
	 * @param ctx the parse tree
	 */
	void enterEliminacion(ExprParser.EliminacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#eliminacion}.
	 * @param ctx the parse tree
	 */
	void exitEliminacion(ExprParser.EliminacionContext ctx);
}