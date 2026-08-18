-- Write your query below
SELECT customers.name FROM customers 
    LEFT JOIN orders
            ON orders.customer_id = customers.id
    WHERE orders.ID IS NULL;