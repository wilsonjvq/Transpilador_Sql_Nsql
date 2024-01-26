from ExprListener import ExprListener
from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprCodeGenListener(ExprListener):

    def __init__(self, output):
        self.output = output
        self.column_names = []
        self.seleccion_names = []
        self.insertion_count = 0
        self.seleccion_asterisco = 0
        self.actualizacion_names = []
        self.actualizacion_valor = []


    # Enter a parse tree produced by ExprParser#creacion_tabla.
    def enterCreacion_tabla(self, ctx:ExprParser.Creacion_tablaContext):
        self.output.write("db.createCollection(\"%s\");\n\n" % ctx.ID().getText())


    # Enter a parse tree produced by ExprParser#insercion.
    def enterInsercion(self, ctx:ExprParser.InsercionContext):
        self.output.write("db.%s.insertMany([\n" % ctx.ID().getText())

    # Exit a parse tree produced by ExprParser#insercion.
    def exitInsercion(self, ctx:ExprParser.InsercionContext):
        self.output.write("]);\n\n")


    # Enter a parse tree produced by ExprParser#sfinal_insercion.
    def enterSfinal_insercion(self, ctx:ExprParser.Sfinal_insercionContext):
        self.output.write(" },\n")


    # Enter a parse tree produced by ExprParser#final_insercion.
    def enterFinal_insercion(self, ctx:ExprParser.Final_insercionContext):
        self.output.write(" }\n")


    # Enter a parse tree produced by ExprParser#columna_insercion.
    def enterColumna_insercion(self, ctx:ExprParser.Columna_insercionContext):
        self.column_names = [id.getText() for id in ctx.ID()]


    # Enter a parse tree produced by ExprParser#valores_insercion.
    def enterValores_insercion(self, ctx:ExprParser.Valores_insercionContext):
        values = [valor_insercion.getText() for valor_insercion in ctx.valor_insercion()]
        combined_values = zip(self.column_names, values)
        total_columns = len(values)

        values = [valor_insercion.getText() for valor_insercion in ctx.valor_insercion()]
        combined_values = zip(self.column_names, values)
        total_columns = len(values)

        self.output.write("\t{ ")
        for i, (column, value) in enumerate(combined_values, 1):
            if column == 'FechaNacimiento':

                iso_date_value = f"ISODate({value})"
                self.output.write(f"{column}: {iso_date_value}")
            else:
                self.output.write(f"{column}: {value}")

            if i < total_columns:
                self.output.write(", ")
            


    # Enter a parse tree produced by ExprParser#seleccion.
    def enterSeleccion(self, ctx:ExprParser.SeleccionContext):
        self.output.write("db.%s.find(" % ctx.ID().getText())

    # Exit a parse tree produced by ExprParser#seleccion.
    def exitSeleccion(self, ctx:ExprParser.SeleccionContext):
        self.output.write("\n")


    # Enter a parse tree produced by ExprParser#seleccionar_parte.
    def enterSeleccionar_parte(self, ctx:ExprParser.Seleccionar_parteContext):
        self.seleccion_names = [id.getText() for id in ctx.ID()]
        self.seleccion_asterisco = 0


    # Enter a parse tree produced by ExprParser#seleccionar_todo.
    def enterSeleccionar_todo(self, ctx:ExprParser.Seleccionar_todoContext):
        self.seleccion_asterisco = 1


    # Enter a parse tree produced by ExprParser#condicion_vacia.
    def enterCondicion_vacia(self, ctx:ExprParser.Condicion_vaciaContext):
        if self.seleccion_asterisco == 0:
            self.output.write("{}, ")
            total_columns = len(self.column_names)

            if total_columns > 0:
                columns_str = ', '.join(f"{name}: 1" for name in self.seleccion_names)
                self.output.write(f"{{ {columns_str} }});\n")
            else:
                self.output.write(");\n")
        else:
            self.output.write("{});\n")


    # Enter a parse tree produced by ExprParser#condicion_where.
    def enterCondicion_where(self, ctx:ExprParser.Condicion_whereContext):
        id_columna = ctx.ID().getText()
        operador = ''
        valor = ctx.expresion_logica().getText()

        if ctx.operador_logico().MAYOR():
            operador = 'gt'
        elif ctx.operador_logico().MENOR():
            operador = 'lt'
        elif ctx.operador_logico().MAYOR_O_IGUAL():
            operador = 'gte'
        elif ctx.operador_logico().MENOR_O_IGUAL():
            operador = 'lte'
        elif ctx.operador_logico().IGUAL():
            operador = 'eq'

        self.output.write(f"{{ {id_columna}: {{ ${operador}: {valor} }}}}")

        if self.seleccion_asterisco == 0:
            total_columns = len(self.column_names)

            if total_columns > 0:
                columns_str = ', '.join(f"{name}: 1" for name in self.seleccion_names)
                self.output.write(f", {{ {columns_str} }});\n")
            else:
                self.output.write(");\n")
        else:
            self.output.write(");\n")


    # Enter a parse tree produced by ExprParser#condicion_order.
    def enterCondicion_order(self, ctx:ExprParser.Condicion_orderContext):
        id_columna = ctx.ID().getText()
        operador = ''

        if ctx.ordenamiento().ASC():
            operador = '1'
        elif ctx.ordenamiento().DESC():
            operador = '-1'

        self.output.write(f").sort({{ {id_columna}: {operador} }});\n")


    # Enter a parse tree produced by ExprParser#actualizacion.
    def enterActualizacion(self, ctx:ExprParser.ActualizacionContext):
        self.output.write("db.%s.updateMany(" % ctx.ID().getText())

    # Exit a parse tree produced by ExprParser#actualizacion.
    def exitActualizacion(self, ctx:ExprParser.ActualizacionContext):
        self.output.write(" });\n\n")


    # Enter a parse tree produced by ExprParser#actualizaciones.
    def enterActualizaciones(self, ctx:ExprParser.ActualizacionesContext):
        self.actualizacion_names = [id.getText() for id in ctx.ID()]
        self.actualizacion_valor = []


    # Enter a parse tree produced by ExprParser#valor_actualizacion.
    def enterValor_actualizacion(self, ctx:ExprParser.Valor_actualizacionContext):
        valor = ctx.getText()
        self.actualizacion_valor.append(valor)


    # Enter a parse tree produced by ExprParser#actualizacion_where.
    def enterActualizacion_where(self, ctx:ExprParser.Actualizacion_whereContext):
        id_columna = ctx.ID().getText()
        operador = ''
        valor = ctx.expresion_logica().getText()

        if ctx.operador_logico().MAYOR():
            operador = 'gt'
        elif ctx.operador_logico().MENOR():
            operador = 'lt'
        elif ctx.operador_logico().MAYOR_O_IGUAL():
            operador = 'gte'
        elif ctx.operador_logico().MENOR_O_IGUAL():
            operador = 'lte'
        elif ctx.operador_logico().IGUAL():
            operador = 'eq'

        self.output.write(f"{{ {id_columna}: {{ ${operador}: {valor} }}}}")
        
        combined_values = zip(self.actualizacion_names, self.actualizacion_valor)
        total_columns = len(self.actualizacion_names)

        self.output.write(", { ")

        for i, (column, value) in enumerate(combined_values, 1):
            # Verifica si el valor es una expresión aritmética
            is_arithmetic_expression = '-' in value or '+' in value

            if is_arithmetic_expression:
                signo = '-' if '-' in value else ''
                number_part = value.split('-')[-1] if '-' in value else value.split('+')[-1]
                self.output.write(f"$inc: {{ {column}: {signo}{number_part} }}")
            else:
                self.output.write(f"$set: {{ {column}: {value} }}")

            # Verifica si es la última iteración antes de imprimir la coma
            if i < total_columns:
                self.output.write(", ")


    # Enter a parse tree produced by ExprParser#actualizacion_vacia.
    def enterActualizacion_vacia(self, ctx:ExprParser.Actualizacion_vaciaContext):
        self.output.write("{}, ")
        
        combined_values = zip(self.actualizacion_names, self.actualizacion_valor)
        total_columns = len(self.actualizacion_names)

        self.output.write("{ ")
        for i, (column, value) in enumerate(combined_values, 1):
            # Verifica si el valor es una expresión aritmética
            is_arithmetic_expression = '-' in value or '+' in value

            if is_arithmetic_expression:
                signo = '-' if '-' in value else ''
                number_part = value.split('-')[-1] if '-' in value else value.split('+')[-1]
                self.output.write(f"$inc: {{ {column}: {signo}{number_part} }}")
            else:
                self.output.write(f"$set: {{ {column}: {value} }}")

            # Verifica si es la última iteración antes de imprimir la coma
            if i < total_columns:
                self.output.write(", ")


    # Enter a parse tree produced by ExprParser#eliminacion.
    def enterEliminacion(self, ctx:ExprParser.EliminacionContext):
        operator = self.get_text_from_children(ctx.operador_logico())
        value = self.get_text_from_children(ctx.expresion_logica())
        collection_name = ctx.ID()[0].getText()
        collection_name2 = ctx.ID()[1].getText()
        self.output.write(f"db.{collection_name}.deleteMany({{ {collection_name2}: {value} }}")

    # Función auxiliar para obtener el texto completo de los hijos de un contexto
    def get_text_from_children(self, ctx):
        return ' '.join(child.getText() for child in ctx.getChildren())

    # Exit a parse tree produced by ExprParser#eliminacion.
    def exitEliminacion(self, ctx:ExprParser.EliminacionContext):
        self.output.write(");\n\n")