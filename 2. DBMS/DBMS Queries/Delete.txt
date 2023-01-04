mysql> delete from interns where id=9;
Query OK, 1 row affected (0.01 sec)

mysql> select * from interns;
+----+-----------+-----+---------+------------+------+
| id | name      | age | college | address    | cgpa |
+----+-----------+-----+---------+------------+------+
|  1 | Harshanth |  21 | vit     | coimbatore |    9 |
|  2 | Praharsha |  21 | vit     | Andhra     |    9 |
|  3 | Abishek   |  21 | vit     | Chennai    |    9 |
|  4 | khushi    |  21 | vit     | UP         |    9 |
|  5 | janani    |  21 | vit     | bangalore  |    9 |
|  6 | Arun      |  20 | svit    | bihar      |    8 |
|  7 | Amal      |  20 | svit    | Kerala     |    8 |
|  8 | Aron      |  21 | svit    | mumbai     |    8 |
+----+-----------+-----+---------+------------+------+
8 rows in set (0.00 sec)