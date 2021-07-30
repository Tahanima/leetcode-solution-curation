# Write your MySQL query statement below

SELECT MAX(Salary) as 'SecondHighestSalary'
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee);