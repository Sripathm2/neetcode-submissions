-- Write your query below
SELECT users.name, SUM(COALESCE(rides.distance, 0)) AS travelled_distance
    FROM users
    LEFT JOIN rides
        ON users.id = rides.user_id
    GROUP BY users.name, users.id
    ORDER BY travelled_distance DESC, users.name ASC;