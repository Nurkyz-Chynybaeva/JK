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
 */








//forth lesson    Удаление данных из БД
/*
DELETE FROM users;
DELETE FROM users WHERE id = 2;
TRUNCATE 'users';  очищает таблицу
DROP TABLE users;
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

 */


















