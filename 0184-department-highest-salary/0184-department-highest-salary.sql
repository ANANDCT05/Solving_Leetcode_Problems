# Write your MySQL query statement below
select d.name as Department,e.name as "Employee",e.salary as "Salary" from employee e left join department d on e.departmentId=d.Id where e.salary =(select max(salary) from employee e1 where e1.departmentId=e.departmentId);