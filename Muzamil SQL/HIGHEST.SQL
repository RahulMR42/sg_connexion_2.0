Create table A(id int, salary int, month varchar(10));

insert into A values (1, 10, 'jan');
insert into A values (2, 20, 'jan');
insert into A values (3, 30, 'jan');
-- CREATE TALE A
----------------------------

insert into A values (4, 40, 'jan');
insert into A values (1, 50, 'feb');
insert into A values (5, 60, 'feb');
insert into A values (3, 20, 'feb');
insert into A values (4, 40, 'mar');
insert into A values (8, 10, 'mar');
insert into A values (8, 20, 'mar');



SELECT ID,TOP 1 salary 
FROM 
    (SELECT TOP 3 salary 
     FROM A 
     ORDER BY salary DESC) AS thirdH 
 where month = 'jan' ORDER BY salary ASC;


SELECT ID,TOP 1 salary 
FROM 
    (SELECT TOP 3 salary 
     FROM A 
     ORDER BY salary DESC) AS thirdH1
  where month = 'feb' ORDER BY salary ASC;


SELECT ID, TOP 1 salary 
FROM 
    (SELECT TOP 3 salary 
     FROM A 
     ORDER BY salary DESC) AS thirdH2
 where month = 'mar' ORDER BY salary ASC;





