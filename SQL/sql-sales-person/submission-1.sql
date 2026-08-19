-- Write your query below
SELECT sales_person.name FROM sales_person
    LEFT JOIN orders
        ON sales_person.sales_id = orders.sales_id
        AND orders.com_id = (SELECT com_id FROM company WHERE company.name = 'CRIMSON')
    GROUP BY sales_person.name, sales_person.sales_id
    HAVING COUNT(orders.order_id) = 0;