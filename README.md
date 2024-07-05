Futbolistas API - Backend

Tecnologías Utilizadas

- Java 22.0.1
  
- Spring Boot 3.3.1
  
- Maven
  
- MySQL 8.0


Configura la base de datos MySQL:

Mysql Script:

CREACIÓN DE TABLAS:
CREATE TABLE futbolista (

    id INT AUTO_INCREMENT PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    caracteristicas TEXT,
    posicion_id INT,
    FOREIGN KEY (posicion_id) REFERENCES posicion(id)
);

CREATE TABLE posicion (

    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);



DATOS INSERTADOS

INSERT INTO posicion (nombre) VALUES ('Arquero'), ('Defensa'), ('Volante'), ('Delantero');

INSERT INTO futbolista (nombres, apellidos, fecha_nacimiento, caracteristicas, posicion_id) VALUES 
('Pedro', 'Gallese', '1990-02-23', 'Portero con buenos reflejos', 1),
('Carlos', 'Cáceda', '1991-09-27', 'Portero suplente', 1),
('José', 'Carvallo', '1986-03-01', 'Portero experimentado', 1),
('Luis', 'Abram', '1996-02-27', 'Defensa central sólido', 2),
('Miguel', 'Araujo', '1994-10-24', 'Defensa central rápido', 2),
('Renato', 'Tapia', '1995-07-28', 'Volante de contención', 3),
('Pedro', 'Aquino', '1995-04-13', 'Volante defensivo', 3),
('Yoshimar', 'Yotún', '1990-04-07', 'Volante creativo', 3),
('Christian', 'Cueva', '1991-11-23', 'Volante ofensivo', 3),
('André', 'Carrillo', '1991-06-14', 'Extremo derecho', 4),
('Edison', 'Flores', '1994-05-14', 'Extremo izquierdo', 4),
('Raúl', 'Ruidíaz', '1990-07-25', 'Delantero rápido', 4),
('Paolo', 'Guerrero', '1984-01-01', 'Delantero con experiencia', 4),
('Aldo', 'Corzo', '1989-05-20', 'Defensa lateral derecho', 2),
('Luis', 'Advíncula', '1990-03-02', 'Defensa lateral derecho rápido', 2),
('Miguel', 'Trauco', '1992-08-25', 'Defensa lateral izquierdo', 2),
('Alexander', 'Callens', '1992-05-04', 'Defensa central fuerte', 2),
('Sergio', 'Peña', '1995-09-28', 'Volante mixto', 3),
('Gianluca', 'Lapadula', '1990-02-07', 'Delantero con buen juego aéreo', 4),
('Christofer', 'Gonzales', '1992-10-12', 'Volante polivalente', 3),
('Raúl', 'Fernández', '1985-10-06', 'Portero experimentado', 1),
('Jefferson', 'Farfán', '1984-10-26', 'Delantero con experiencia', 4),
('Wilder', 'Cartagena', '1994-09-23', 'Volante de contención', 3),
('Marcos', 'López', '1999-11-20', 'Defensa lateral izquierdo', 2),
('Rafael', 'Guarderas', '1993-09-12', 'Volante mixto', 3),
('Andy', 'Polo', '1994-09-29', 'Extremo derecho', 4),
('Gabriel', 'Costa', '1990-04-02', 'Volante ofensivo', 3),
('Alexander', 'Succar', '1995-08-12', 'Delantero centro', 4),
('Jhilmar', 'Lora', '2000-10-24', 'Defensa lateral derecho', 2),
('Horacio', 'Calcaterra', '1989-02-22', 'Volante mixto', 3);

