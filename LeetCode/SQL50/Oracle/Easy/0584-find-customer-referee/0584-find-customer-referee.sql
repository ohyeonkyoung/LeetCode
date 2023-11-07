/* Write your PL/SQL query statement below */
SELECT name
FROM ((SELECT *
        FROM Customer)
        MINUS
        (SELECT *
        FROM Customer
        WHERE referee_id = 2));