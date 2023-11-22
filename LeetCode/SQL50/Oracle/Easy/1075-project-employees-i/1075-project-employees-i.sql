SELECT Project.project_id AS project_id, ROUND(SUM(Employee.experience_years)/COUNT(Project.employee_id), 2) AS average_years
FROM Project, Employee
WHERE Project.employee_id = Employee.employee_id
GROUP BY Project.project_id;