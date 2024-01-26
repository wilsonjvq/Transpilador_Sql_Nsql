CREATE TABLE Clientes (
    ClienteID INT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Apellido VARCHAR(100) NOT NULL,
    Edad INT,
    MontoCompra DECIMAL(10, 2),
    Genero CHAR(1),
    FechaRegistro DATE NOT NULL,
    HoraUltimaCompra TIME,
    Email VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO Clientes (ClienteID, Nombre, Apellido, Edad, MontoCompra, Genero, FechaRegistro, HoraUltimaCompra, Email)
VALUES
    (1, 'Ana', 'Martinez', 30, 500.50, 'F', '2000-10-15', '08:45:30', 'ana.martinez@example.com'),
    (2, 'Carlos', 'Gonzalez', 45, 1200.75, 'M', '1995-05-20', '14:30:00', 'carlos.gonzalez@example.com'),
    (3, 'Elena', 'Sánchez', 28, 800.25, 'F', '2005-12-22', '10:15:45', 'elena.sanchez@example.com');

SELECT * FROM Clientes;

SELECT ClienteID, Nombre, Edad, HoraUltimaCompra FROM Clientes;

SELECT Nombre, Edad FROM Clientes WHERE Edad > 30;

SELECT * FROM Clientes ORDER BY MontoCompra DESC;

SELECT * FROM Clientes WHERE MontoCompra > 1000;

SELECT ClienteID, Nombre FROM Clientes WHERE MontoCompra > 800;

UPDATE Clientes SET Edad = Edad + 1;

UPDATE Clientes SET MontoCompra = 1500.00 WHERE ClienteID = 1;

UPDATE Clientes SET Nombre = 'Luis' WHERE ClienteID = 3;

UPDATE Clientes SET MontoCompra = MontoCompra - 200.00 WHERE Edad > 35;

DELETE FROM Clientes WHERE ClienteID = 2;

DELETE FROM Clientes WHERE Edad = 28;