mysql> select * from interns ORDER BY cgpa DESC;
+----+-----------+-----+---------+------------+------+
| id | name      | age | college | address    | cgpa |
+----+-----------+-----+---------+------------+------+
|  1 | Harshanth |  21 | vit     | coimbatore |    9 |
|  2 | Praharsha |  21 | vit     | Andhra     |    9 |
|  3 | Abishek   |  21 | vit     | Chennai    |    9 |
|  4 | khushi    |  21 | vit     | UP         |    9 |
|  5 | janani    |  21 | vit     | bangalore  |    9 |
|  6 | Arun      |  20 | svit    | bihar      |    8 |
|  7 | Amal      |  20 | svit    | goa        |    8 |
|  8 | Aron      |  21 | svit    | mumbai     |    8 |
|  9 | Rahul     |  20 | vit     | Chennai    |    8 |
+----+-----------+-----+---------+------------+------+
9 rows in set (0.00 sec)

mysql> select * from interns ORDER BY cgpa;
+----+-----------+-----+---------+------------+------+
| id | name      | age | college | address    | cgpa |
+----+-----------+-----+---------+------------+------+
|  6 | Arun      |  20 | svit    | bihar      |    8 |
|  7 | Amal      |  20 | svit    | goa        |    8 |
|  8 | Aron      |  21 | svit    | mumbai     |    8 |
|  9 | Rahul     |  20 | vit     | Chennai    |    8 |
|  1 | Harshanth |  21 | vit     | coimbatore |    9 |
|  2 | Praharsha |  21 | vit     | Andhra     |    9 |
|  3 | Abishek   |  21 | vit     | Chennai    |    9 |
|  4 | khushi    |  21 | vit     | UP         |    9 |
|  5 | janani    |  21 | vit     | bangalore  |    9 |
+----+-----------+-----+---------+------------+------+
9 rows in set (0.00 sec)