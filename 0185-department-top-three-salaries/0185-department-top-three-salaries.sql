# Write your MySQL query statement below
select d.name as department,
e.name as employee,
e.salary as salary from (
    select * , dense_rank() over(
        partition by departmentId order by salary desc
    ) as rnk
    from employee
)e join department d on e.departmentId = d.id where e.rnk <= 3;