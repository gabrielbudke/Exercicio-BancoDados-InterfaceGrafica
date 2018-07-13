DROP DATABASE IF EXISTS alunos;
CREATE DATABASE alunos;
USE alunos;

CREATE TABLE alunos(
    id                  INT AUTO_INCREMENT PRIMARY KEY,
    nome                VARCHAR(50),
    codigo_matricula    VARCHAR(10),
    nota_1              FLOAT,
    nota_2              FLOAT,
    nota_3              FLOAT,
    frequencia          TINYINT);