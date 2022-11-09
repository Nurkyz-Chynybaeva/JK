package com.example.jk

//first lesson
/*
CREATE TABLE users(
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(30),
email VARCHAR(40),
bio TEXT,
birth DATA,
PRIMARY KEY(id)
);

ALTER TABLE user ADD pass VARCHAR(32); добавляет значение к существующему таблицу
ALTER TABLE user DROP COLUMN pass;
NOT NULL не может быть пустым
AUTO_INCREMENT автоматически увеличивает на единицу
PRIMARY KEY(id) это значит что поле id не будет повторятся
DATATIME дата и время
DROP TABLE users;
--------------------------------------------------------------------------------------------------------------------------------------------------
 */


//third lesson    Добавление и обновление записей в БД
/*
INSERT INTO users(name, bio, birth, email) VALUES('Alex', 'Programmer', '2025-05-29', 'user@gmail.com')

INSERT INTO users(name, bio, birth, email)
VALUES
('Alex', 'Programmer', '2025-05-29', 'user@gmail.com'),
('Bob', 'Programmer', '2025-07-29', 'user@gmail.com'),
('John', 'Programmer', '2025-01-29', 'user@gmail.com')

ALTER TABLE users CHANGE birth birth2 DATE NOT NULL  меняет поле birth на birth2 и birth2 не может быть null

UPDATE 'people' SET 'name' = 'Max' WHERE id = 5;
UPDATE 'people' SET 'name' = 'Max' 'email' = 'test5@gmail.com' WHERE id > 5; д всех записей у которых id будет больше чем 5 будет работать этот код
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */



//forth lesson    Удаление данных из БД
/*
DELETE FROM users;
DELETE FROM users WHERE id = 2;
TRUNCATE 'users';  очищает таблицу
DROP TABLE users;
---------------------------------------------------------------------------------------------------------------------------------------------------
 */



//fifth lesson      Выборка данных из БД
/*
SELECT * FROM 'users'; выбрать все из таблички user
SELECT 'name', 'bio' FROM 'users';
SELECT 'name', 'bio' FROM users WHERE id>=2 AND id<5;
SELECT 'name' FROM users WHERE id <> 2;  выбирает все записи у которых id не ровно к 2
оператор OR
SELECT DISTINCT name FROM 'users';
SELECT * FROM people LIMIT 2; выбирает только 2 записи
SELECT * FROM people LIMIT 2, 3;   2 элемента пропустили а 3 следующих выв
SELECT * FROM people ORDER BY id DESC LIMIT 2, 3      DESC переворачивает
SELECT * FROM people WHERE 2 AND 6 AND id <> 4 ORDER BY id DESC LIMIT 10
SELECT * FROM people WHERE id IN(1,2,3)
SELECT * FROM people WHERE name LIKE 'M%'    выбираем все записи у которых поля name начинается с М
SELECT * FROM people WHERE name LIKE '%Min%'
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */



//sixth lesson        Создание индексов и работы с ними
/*
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */



//seventh lesson         Объединение данных
/*
INSERT INTO 'shop' ('title', 'price') VALUES('iPhone', 300), ('samsung', 250),('mac', 300),

SELECT orders.orderNumber, users.name, users.email FROM users
INNER JOIN orders ON users.id = orders.personId
ORDER BY orders.orderNumber DESC;

SELECT users.name, orders.orderNumber FROM users
LEFT JOIN orders ON users.id = orders.personId
ORDER BY users.name DESC;

SELECT orders.date_time, users.name FROM orders
RIGHT JOIN users ON orders.personId = users.id;

OUTER JOIN
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */




//eighth lesson       Псевдонимы, функции и Group By
/*
SELECT name AS 'Имя', birth AS 'День рождения' FROM users;

SELECT CONCAT(name, birth) AS "information:" FROM users;

SELECT u.id, u.name, s.title, s.price FROM users AS u, shop AS s;

SELECT COUNT(id) FROM shop;

SELECT MIN(price) FROM shop;
SELECT AVG(price) FROM shop;     Среднее значение
SELECT SUM(price) FROM shop;
SELECT UCASE/LCASE(title) FROM shop;  вверхний/нижный регистр

SELECT price, COUNT(price) FROM shop GROUP BY price
HAVING COUNT(price) > 1;
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */




























