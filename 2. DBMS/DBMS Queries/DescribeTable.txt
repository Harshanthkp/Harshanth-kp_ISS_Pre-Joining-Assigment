mysql> desc employee;
+------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| empid      | int           | NO   | PRI | NULL    |       |
| name       | varchar(25)   | NO   |     | NULL    |       |
| experience | int           | YES  |     | NULL    |       |
| salary     | decimal(18,2) | YES  |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+
4 rows in set (0.04 sec)