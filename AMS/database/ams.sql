DROP DATABASE IF EXISTS ams;

CREATE DATABASE ams;

USE ams;


SELECT * FROM tb_user;

DELETE FROM tb_user;

CREATE TABLE tb_user
(
	User_id INT PRIMARY KEY,
    name varchar(55),
    username varchar(55),
    email varchar(55),
    password varchar(55),
    type varchar(55)
);

INSERT INTO tb_user VALUES
(1, 'Aian Louise A. Alfaro', 'admin', 'aianlouisealfaro03@gmail.com', 'admin123', '1');