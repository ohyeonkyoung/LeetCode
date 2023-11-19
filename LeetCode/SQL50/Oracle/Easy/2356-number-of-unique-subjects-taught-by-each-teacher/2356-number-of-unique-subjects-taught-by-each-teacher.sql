/* Write your PL/SQL query statement below */
SELECT teacher_id, count(DISTINCT subject_id) AS cnt
FROM Teacher
GROUP BY teacher_id;