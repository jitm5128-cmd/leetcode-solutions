-- # Write your MySQL query statement below
-- select num from MyNumbers where num > any(select distinct num from Mynumbers);

select max(num) as num from (select num from MyNumbers group by num having count(*)= 1) as m;