grammar Expr;

// Reglas léxicas para palabras clave en SQL (insensibles a mayúsculas y minúsculas)
CREATE : [Cc] [Rr] [Ee] [Aa] [Tt] [Ee];
TABLE : [Tt] [Aa] [Bb] [Ll] [Ee];
PRIMARY : [Pp] [Rr] [Ii] [Mm] [Aa] [Rr] [Yy];
KEY : [Kk] [Ee] [Yy];
NOT : [Nn] [Oo] [Tt];
NULL : [Nn] [Uu] [Ll] [Ll];
UNIQUE : [Uu] [Nn] [Ii] [Qq] [Uu] [Ee];

INSERT : [Ii] [Nn] [Ss] [Ee] [Rr] [Tt];
INTO : [Ii] [Nn] [Tt] [Oo];
VALUES : [Vv] [Aa] [Ll] [Uu] [Ee] [Ss];

SELECT : [Ss] [Ee] [Ll] [Ee] [Cc] [Tt];
FROM : [Ff] [Rr] [Oo] [Mm];
WHERE : [Ww] [Hh] [Ee] [Rr] [Ee];
ORDER : [Oo] [Rr] [Dd] [Ee] [Rr];
BY : [Bb] [Yy];
ASC : [Aa] [Ss] [Cc];
DESC : [Dd] [Ee] [Ss] [Cc];

UPDATE : [Uu] [Pp] [Dd] [Aa] [Tt] [Ee];
SET : [Ss] [Ee] [Tt];
IS : [Ii] [Ss];
DELETE : [Dd] [Ee] [Ll] [Ee] [Tt] [Ee];

// Reglas léxicas para tipos de datos en SQL
INT : 'INT';
VARCHAR : 'VARCHAR';
DECIMAL : 'DECIMAL';
CHAR : 'CHAR';
DATE : 'DATE';
TIME : 'TIME';
DATETIME : 'DATETIME';

// Reglas léxicas para identificadores en SQL
ID : [a-zA-Z_] [a-zA-Z0-9_]*;

// Reglas léxicas para ignorar espacios, tabulaciones, retornos de carro y saltos de línea
WS : [ \t\r\n]+ -> skip;

// Reglas léxicas para comentarios en SQL
COMENTARIO_SIMPLE : '--' ~[\r\n]* -> skip;
COMENTARIO_MULTILINEA : '/*' .*? '*/' -> skip;

// Reglas léxicas para literales en SQL
INT_LITERAL : [0-9]+;
FLOAT_LITERAL : [0-9]+ '.' [0-9]+;
CHAR_LITERAL : '\'' .*? '\'';
DATE_LITERAL : '\'' [0-9] [0-9] [0-9] [0-9] '-' [0-9] [0-9] '-' [0-9] [0-9] '\'';
TIME_LITERAL : '\'' [0-9] [0-9] ':' [0-9] [0-9] ':' [0-9] [0-9] '\'';
DATETIME_LITERAL : '\'' [0-9] [0-9] [0-9] [0-9] '-' [0-9] [0-9] '-' [0-9] [0-9] [0-9] [0-9] ':' [0-9] [0-9] ':' [0-9] [0-9] '\'';

// Reglas léxicas para delimitadores en SQL
PARENTESIS_IZQ : '(';
PARENTESIS_DER : ')';
COMA : ',';
PUNTO_Y_COMA : ';';

// Reglas léxicas para operadores de comparación en SQL
IGUAL : '=';
DIFERENTE : '!=' | '<>';
MAYOR : '>';
MENOR : '<';
MAYOR_O_IGUAL : '>=';
MENOR_O_IGUAL : '<=';

// Reglas léxicas para operadores matemáticos en SQL
MAS : '+';
MENOS : '-';
PRODUCTO : '*';
DIVISION : '/';
//////////////////////////////////////////////////////////////////////////////////////////777777
// Regla de la gramática para el símbolo inicial programa
programa : (sentencia PUNTO_Y_COMA)*;

// Regla de la gramática para sentencia
sentencia : creacion_tabla
          | insercion
          | seleccion
          | actualizacion
          | eliminacion;

//Reglas de la gramática para CREATE TABLE
creacion_tabla : CREATE TABLE ID PARENTESIS_IZQ definiciones_columna PARENTESIS_DER;

definiciones_columna : definicion_columna (COMA definicion_columna)*;

definicion_columna : ID tipo_dato atributos_columna;

atributos_columna : 
                  | atributos_columna atrib_columna;

atrib_columna : PRIMARY KEY
              | NOT NULL
              | UNIQUE;

tipo_dato : INT
          | DECIMAL PARENTESIS_IZQ INT_LITERAL COMA INT_LITERAL PARENTESIS_DER
          | VARCHAR PARENTESIS_IZQ INT_LITERAL PARENTESIS_DER
          | CHAR PARENTESIS_IZQ INT_LITERAL PARENTESIS_DER
          | DATE
          | TIME
          | DATETIME;

// Regla de la gramática para INSERT
insercion : INSERT INTO ID columna_insercion VALUES fila_insercion;

columna_insercion : 
                   | PARENTESIS_IZQ ID (COMA ID)* PARENTESIS_DER;

fila_insercion : (PARENTESIS_IZQ valores_insercion sfinal_insercion COMA)* PARENTESIS_IZQ valores_insercion final_insercion;

final_insercion : PARENTESIS_DER;
sfinal_insercion : PARENTESIS_DER;
valores_insercion : valor_insercion (COMA valor_insercion)*;

valor_insercion :
                | INT_LITERAL
                | FLOAT_LITERAL
                | CHAR_LITERAL
                | DATE_LITERAL
                | TIME_LITERAL
                | DATETIME_LITERAL;

// Regla de la gramática para SELECT
seleccion : SELECT seleccion_lista FROM ID condicion_seleccion;

seleccion_lista : seleccionar_todo | seleccionar_parte;

seleccionar_parte : ID (COMA ID)*;

seleccionar_todo : PRODUCTO;

condicion_seleccion : condicion_vacia
                    | condicion_where
                    | condicion_order;

condicion_vacia :;

condicion_where : WHERE ID operador_logico expresion_logica;

condicion_order : ORDER BY ID ordenamiento;

operador_logico : IGUAL
                | DIFERENTE
                | MAYOR
                | MENOR
                | MAYOR_O_IGUAL
                | MENOR_O_IGUAL;

expresion_logica : INT_LITERAL
                 | FLOAT_LITERAL
                 | CHAR_LITERAL
                 | DATE_LITERAL
                 | TIME_LITERAL
                 | DATETIME_LITERAL;

ordenamiento : ASC
             | DESC;

// Regla de la gramática para UPDATE
actualizacion : UPDATE ID SET actualizaciones condicion_actualizacion;

condicion_actualizacion : actualizacion_where
                        | actualizacion_vacia;
                        
actualizacion_where : WHERE ID operador_logico expresion_logica;

actualizacion_vacia :;

actualizaciones : ID IGUAL valor_actualizacion (COMA ID IGUAL valor_actualizacion)*;

valor_actualizacion : expresion_actualizacion
                    | expresion_actualizacion operador_aritmetico expresion_actualizacion;

operador_aritmetico : MAS
                    | MENOS
                    | PRODUCTO
                    | DIVISION;

expresion_actualizacion : ID
                        | INT_LITERAL
                        | FLOAT_LITERAL
                        | CHAR_LITERAL
                        | DATE_LITERAL
                        | TIME_LITERAL
                        | DATETIME_LITERAL;

//Reglas de la gramática para DELETE
eliminacion : DELETE FROM ID WHERE ID operador_logico expresion_logica;

///////////////////////////////////////////////////////////////////

//Ejecutar en (cmd - Comand Prompt:
//java -jar antlr-4.13.0-complete.jar -Dlanguage=Python3 Expr.g4

//Siempre para empezar el uso, en la terminal de comandos (CMD), realice un set del PATH antlr:

//doskey antlr4=java org.antlr.v4.Tool $*
//doskey grun =java org.antlr.v4.gui.TestRig $*
//>>> SET CLASSPATH=.;C:\Users\ACER\Documents\2 compiladores\TranspiladorSqlNosql;%CLASSPATH%
//>>> antlr4

//Visitors:
//antlr4 -Dlanguage=Python3 -visitor Expr.g4
//Listener:
//antlr4 -Dlanguage=Python3 -listener Expr.g4

//Prueba:
//antlr4 Expr.g4
//javac Expr*.java

//grun Expr programa -tree
//15*3-10/5+7*2**3-1
//Control+Z
//Enter

//grun Expr programa -gui
//15*3-10/5+7*2**3-1
//Control+Z
//Enter

//antlr4 -Dlanguage=Python3 Bazilio.g