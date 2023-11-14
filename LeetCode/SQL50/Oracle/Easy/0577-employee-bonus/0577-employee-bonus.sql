SELECT Employee.name, Bonus.bonus
FROM Employee LEFT OUTER JOIN Bonus
ON Employee.empId = Bonus.empId
WHERE Bonus.bonus < 1000 OR Bonus.bonus is null;

-- 중복된 값도 모두 출력되어야한다.