mysql> create table interns(id int not null, name varchar(25) not null, age int not null, college varchar(25) not null, address char(25), cgpa int not null, primary key(id));

mysql> create table employee(empid int NOT NULL, name varchar(25) NOT NULL, experience int, salary decimal(18,2),primary key(empid));
Query OK, 0 rows affected (0.30 sec)