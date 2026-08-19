-- Write your query below
SELECT seller.seller_name
    FROM seller
        LEFT Join orders
            ON orders.seller_id = seller.seller_id
            AND EXTRACT(YEAR FROM orders.sale_date) = 2020
    GROUP BY seller.seller_name, seller.seller_id
    HAVING COUNT(orders.order_id) = 0
    ORDER BY seller.seller_name;