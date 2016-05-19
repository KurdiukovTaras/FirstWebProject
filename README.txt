
Для добавления таблицы и данных выполнить запрос:


CREATE TABLE employee
(
    id INT(8) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(25) NOT NULL,
    age INT(11) DEFAULT '0' NOT NULL,
    isAdmin BIT(1) DEFAULT b'0' NOT NULL,
    createdDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
insert into employee (name,age,isAdmin,createdDate) values ('Alex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex2',11,0,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex3',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex4',23,0,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex5',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex6',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex7',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex8',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex21',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Al2ex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex',11,0,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Ale3x',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Al3ex',23,0,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Al5ex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Al67ex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Al6ex',23,1,'2000-10-10 00:00:00');
insert into employee (name,age,isAdmin,createdDate) values ('Alex',23,1,'2000-10-10 00:00:00');