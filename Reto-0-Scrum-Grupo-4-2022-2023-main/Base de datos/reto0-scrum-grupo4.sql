
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";



-- Base de datos: `reto0-scrum-grupo4`
--
CREATE DATABASE IF NOT EXISTS `reto0-scrum-grupo4` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `reto0-scrum-grupo4`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE Usuario (
  Id_Usuario int PRIMARY KEY AUTO_INCREMENT,
  Nombre varchar(50)  NOT NULL,
  Apellido varchar(50)  NOT NULL,
  rol Enum("Profesor","Bedel","Seguridad","Alumno")NOT NULL,
  Email varchar(200)  NOT NULL,
  Contrasena varchar(50) NOT NULL
) ;

CREATE TABLE Alarma_de_Incendios(
Id_Alarma int primary key auto_increment,
Encendido boolean not null default false
);

CREATE TABLE Calefaccion(
Id_Calefaccion int primary key auto_increment,
Encendido boolean not null default false
);

CREATE TABLE Aula(
Id_Aula int  primary key auto_increment ,
Alarma_de_Incendios int,
Calefaccion int,
constraint fk_Alarma_de_Incendios foreign key (Alarma_de_Incendios) references Alarma_de_Incendios(Id_Alarma),
constraint fk_Calefaccion foreign key (Calefaccion) references Calefaccion(Id_Calefaccion)
);

CREATE TABLE Monitoriza(
Usuario int,
Aula int, 
constraint pk_Usuario_Aula primary key (Usuario,Aula),
constraint fk_Usuario foreign key (Usuario) references Usuario(Id_Usuario),
constraint fk_Aula foreign key (Aula) references Aula(Id_Aula)
);
SET SQL_SAFE_UPDATES =0;

USE `reto0-scrum-grupo4`;
insert into calefaccion values(1,0),(2,0),(3,1),(4,0),(5,0),(6,1),(7,0),(8,0),(9,1),(10,0),(11,0),(12,1),(13,0),(14,0),(15,1),(16,0),(17,0),(18,1),(19,0),(20,0),(21,1),(22,0),(23,0);
insert into alarma_de_incendios values(1,0),(2,0),(3,1),(4,0),(5,0),(6,1),(7,0),(8,0),(9,1),(10,0),(11,0),(12,1),(13,0),(14,0),(15,1),(16,0),(17,0),(18,1),(19,0),(20,0),(21,1),(22,0),(23,0);
insert into usuario values(1,"admin","a","Profesor","admin@admin.com","a");
create user admindam identified by 'elorrieta';
grant all privileges on *.* to admindam with grant option; 

