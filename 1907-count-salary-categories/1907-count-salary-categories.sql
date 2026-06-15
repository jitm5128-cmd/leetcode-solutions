# Write your MySQL query statement below
select 'Low Salary' AS category,
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income < 20000
union all
select 'Average Salary' AS category,
    count(*) as accounts_count
from Accounts
where income between 20000 and 50000
union all
select 'High Salary' AS category,
    count(*) as accounts_count
from Accounts
where income > 50000;