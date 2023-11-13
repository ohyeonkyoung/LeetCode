/* Write your PL/SQL query statement below */

SELECT sub.ID
FROM Weather RIGHT OUTER JOIN (SELECT id, recordDate, temperature, TO_CHAR((recordDate-1), 'YYYY-MM-DD') AS yesterday
                FROM Weather) sub
ON Weather.recordDate = sub.yesterday
WHERE sub.TEMPERATURE > Weather.TEMPERATURE