CREATE TABLE Empleados (
    EmpleadoID INT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Edad INT,
    Salario DECIMAL(10, 2),
    Genero CHAR(1),
    FechaNacimiento DATE NOT NULL,
    HoraContratacion TIME,
    Email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO Empleados (EmpleadoID, Nombre, Apellido, Edad, Salario, Genero, FechaNacimiento,  HoraContratacion, Email)
VALUES
    (1, 'Juan', 'Perez', 20, 1200.50, 'M', '2002-05-15', '00:18:40', 'juan.perez@example.com'),
    (2, 'Maria', 'Gomez', 22, 800.75, 'F', '2000-08-20', '14:15:00', 'maria.gomez@example.com'),
    (3, 'Mario', 'Sanchez', 23, 1600.25, 'M', '1999-08-22', '10:45:00', 'mario.sanchez@example.com'),
    (4, 'Lucía', 'Fernández', 21, 1200.75, 'F', '2000-11-15', '15:30:00', 'lucia.fernandez@example.com');

INSERT INTO Empleados (EmpleadoID, Nombre, Edad, Email)
VALUES
    (5, 'Carlos', 25, 'carlos.nuevo@example.com'),
    (6, 'Laura', 22, 'laura.nueva@example.com');

SELECT * FROM Empleados;

SELECT EmpleadoID, Nombre, Edad, HoraContratacion FROM Empleados;

SELECT Nombre, Edad FROM Empleados WHERE Edad > 22;

SELECT * FROM Empleados ORDER BY Salario DESC;-- ASC

SELECT * FROM Empleados WHERE Salario > 1000;

SELECT EmpleadoID, Nombre FROM Empleados WHERE Salario > 1300;


UPDATE Empleados SET Edad = Edad + 1;

UPDATE Empleados SET Salario = 1400.00 WHERE EmpleadoID = 1;

UPDATE Empleados SET Nombre = 'Luisa' WHERE EmpleadoID = 6;

UPDATE Empleados SET Salario = Salario - 200.00 WHERE Edad > 22;


DELETE FROM Empleados WHERE EmpleadoID = 1;

DELETE FROM Empleados WHERE Edad = 21;