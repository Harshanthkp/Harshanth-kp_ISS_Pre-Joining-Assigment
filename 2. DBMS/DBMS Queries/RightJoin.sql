mysql> select id,name,age,salary from interns right join employee on interns.id = employee.empid;
+------+-----------+------+----------+
| id   | name      | age  | salary   |
+------+-----------+------+----------+
|    1 | Harshanth |   21 | 30000.00 |
|    2 | Praharsha |   21 | 29000.00 |
|    3 | Abishek   |   21 | 29000.00 |
|    4 | khushi    |   21 | 30000.00 |
|    5 | janani    |   21 | 20000.00 |
+------+-----------+------+----------+
5 rows in set (0.00 sec)