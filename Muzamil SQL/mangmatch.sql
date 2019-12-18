create table B (id int primary key, name varchar(30), ManID int)

insrt into B values (1, 'A', Null)
insrt into B values (2, 'B', 1)
insrt into B values (3, 'C', 2)
insrt into B values (4, 'D', 3)
insrt into B values (5, 'E', 4)


SELECT  a.ID, b.NAME, a.ManID
   FROM B a, B b
   WHERE a.name = b.id;









