SET SQL_SAFE_UPDATES = 1;

CREATE DATABASE teste;

USE teste;

DESCRIBE usuarios;

DROP DATABASE teste;

DROP TABLE usuarios;

DROP TABLE pessoas;

TRUNCATE TABLE pessoas;

DELETE FROM users WHERE name = "Joao";

DELETE FROM usuarios WHERE id = 1;

UPDATE users SET name = "Carlos Henrique", job = "tester" WHERE id = 1;