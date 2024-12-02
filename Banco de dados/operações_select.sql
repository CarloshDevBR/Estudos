SELECT * FROM teste.users;

SELECT * FROM teste.persons;

SELECT * FROM users WHERE id <> 1;

SELECT * FROM users WHERE id BETWEEN 12 AND 15 ORDER BY id DESC;

SELECT * FROM users WHERE id NOT IN(12, 13, 14, 15) LIMIT 10;

SELECT users WHERE name LIKE "Joao%";

SELECT name AS n, job AS j FROM users;

SELECT MIN(id) FROM users;

SELECT MAX(id) FROM users;