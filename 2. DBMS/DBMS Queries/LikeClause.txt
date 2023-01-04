mysql> select * from interns where name LIKE '%harsha%';
+----+-----------+-----+---------+------------+------+
| id | name      | age | college | address    | cgpa |
+----+-----------+-----+---------+------------+------+
|  1 | Harshanth |  21 | vit     | coimbatore |    9 |
|  2 | Praharsha |  21 | vit     | Andhra     |    9 |
+----+-----------+-----+---------+------------+------+
2 rows in set (0.01 sec)

mysql> select * from interns where name LIKE 'harsha%';
+----+-----------+-----+---------+------------+------+
| id | name      | age | college | address    | cgpa |
+----+-----------+-----+---------+------------+------+
|  1 | Harshanth |  21 | vit     | coimbatore |    9 |
+----+-----------+-----+---------+------------+------+
1 row in set (0.00 sec)