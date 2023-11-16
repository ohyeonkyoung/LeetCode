SELECT product_id AS product_id, ROUND(NVL(sum_price/units, 0), 2) AS average_price
FROM (SELECT sub.product_id AS product_id, SUM(sub.sum_price) AS sum_price, SUM(sub.units) AS units
    FROM (SELECT Prices.product_id AS product_id, UnitsSold.units*Prices.price AS sum_price, UnitsSold.units AS units
        FROM Prices LEFT OUTER JOIN UnitsSold
        ON Prices.product_id = UnitsSold.product_id
        AND UnitsSold.purchase_date between Prices.start_date AND Prices.end_date) sub
    GROUP BY sub.product_id);