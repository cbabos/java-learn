CREATE TABLE todos (
   id INT AUTO_INCREMENT PRIMARY KEY,
   description VARCHAR(255),
   created DATETIME default current_timestamp(),
   completed NUMBER(1) default 0
);