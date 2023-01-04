mysql> select id,college,age,salary from interns inner join employee where interns.id = employee.empid;
+----+---------+-----+----------+
| id | college | age | salary   |
+----+---------+-----+----------+
|  1 | vit     |  21 | 30000.00 |
|  2 | vit     |  21 | 29000.00 |
|  3 | vit     |  21 | 29000.00 |
|  4 | vit     |  21 | 30000.00 |
|  5 | vit     |  21 | 20000.00 |
+----+---------+-----+----------+
5 rows in set (0.00 sec)