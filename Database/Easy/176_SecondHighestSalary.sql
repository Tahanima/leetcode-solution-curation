SELECT MAX(Salary) as 'SecondHighestSalary'
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee);
