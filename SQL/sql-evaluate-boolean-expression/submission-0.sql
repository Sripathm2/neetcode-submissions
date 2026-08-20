-- Write your query below
SELECT
    e.left_operand,
    e.operator,
    e.right_operand,
    CASE
        WHEN e.operator = '<' THEN v1.value < v2.value
        WHEN e.operator = '>' THEN v1.value > v2.value
        WHEN e.operator = '=' THEN v1.value = v2.value
    END AS value
FROM expressions e
JOIN variables v1
    ON v1.name = e.left_operand
Join variables v2
    ON v2.name = e.right_operand;