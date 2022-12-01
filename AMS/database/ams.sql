DROP DATABASE IF EXISTS ams;

CREATE DATABASE ams;

USE ams;


SELECT * FROM tb_user;

DELETE FROM tb_user;

CREATE TABLE tb_user
(
	User_Id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(55),
    username VARCHAR(55),
    email VARCHAR(55),
    password VARCHAR(55),
    type VARCHAR(55),
    token VARCHAR(55),
    status ENUM('Active','Inactive')
);

UPDATE tb_user SET status = 'Active' WHERE email = 'aianlouisealfaro03@gmail.com';

INSERT INTO tb_user VALUES
(1, 'Aian Louise A. Alfaro', 'admin', 'aianlouisealfaro03@gmail.com', 'admin123', '1', '00000', 'Inactive');