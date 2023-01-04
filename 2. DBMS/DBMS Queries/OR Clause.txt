mysql> select id,name,cgpa from interns where age=20 OR address='Chennai';
+----+---------+------+
| id | name    | cgpa |
+----+---------+------+
|  3 | Abishek |    9 |
|  6 | Arun    |    8 |
|  7 | Amal    |    8 |
|  9 | Rahul   |    8 |
+----+---------+------+
4 rows in set (0.00 sec)