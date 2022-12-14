DROP DATABASE IF EXISTS ams;

CREATE DATABASE ams;

USE ams;


SELECT * FROM tb_student;

DELETE FROM tb_account;

DELETE FROM tb_attendance;

CREATE TABLE tb_account
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

CREATE TABLE tb_student
(
	Stud_id VARCHAR(55) PRIMARY KEY,
    fname VARCHAR(55),
    lname VARCHAR(55),
    course VARCHAR(55),
    yearsection VARCHAR(55)
);

CREATE TABLE tb_attendance
(
	attend_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(55),
    course VARCHAR(55),
    yearsection VARCHAR(55),
    date VARCHAR(55),
    time VARCHAR(55)
);

CREATE TABLE tb_smtp(
	id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(55),
    password VARCHAR(55)
);

CREATE TABLE tb_logs(
	log_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    username VARCHAR(55),
    date VARCHAR(55),
    status VARCHAR(55)
);

INSERT INTO tb_smtp(id, email, password) VALUES(1, 'sampleonly712@gmail.com', 'mkqyxuuepaxhaafn');

INSERT INTO tb_account VALUES
(1, 'admin', 'admin1', 'aianlouisealfaro03@gmail.com', 'admin123', '1', '00000', 'Active');
INSERT INTO tb_account VALUES
(2, 'user', 'user1', 'aianlouisealfaro.iskolar@gmail.com', 'user123', '2', '00000', 'Active');


INSERT INTO tb_attendance(name, yearsection, date, time) VALUES ('Aian Louise A. Alfaro','BSCS2A','10-12-2022','1');

UPDATE tb_user SET status = 'Active' WHERE email = 'aianlouisealfaro03@gmail.com';

SELECT * FROM tb_smtp;

UPDATE tb_smtp SET email = 'aian' AND password = '123' WHERE id = '1';