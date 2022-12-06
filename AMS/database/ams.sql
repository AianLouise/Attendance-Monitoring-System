DROP DATABASE IF EXISTS ams;

CREATE DATABASE ams;

USE ams;


SELECT * FROM tb_student;

DELETE FROM tb_student where Stud_Id = 'a';

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

UPDATE tb_user SET status = 'Active' WHERE email = 'aianlouisealfaro03@gmail.com';

INSERT INTO tb_user VALUES
(1, 'Aian Louise A. Alfaro', 'admin1', 'aianlouisealfaro03@gmail.com', 'admin123', '1', '00000', 'Active');

INSERT INTO tb_attendance(name, yearsection, date, time) VALUES ('Aian Louise A. Alfaro','BSCS2A','10-12-2022','1');

SELECT * FROM tb_smtp;

INSERT INTO tb_smtp(id, email, password) VALUES(1, 'sampleonly712@gmail.com', 'mkqyxuuepaxhaafn');

UPDATE tb_smtp SET email = 'aian' AND password = '123' WHERE id = '1';