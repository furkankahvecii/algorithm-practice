CREATE PROCEDURE volleyballResults()
BEGIN
    SELECT r.* 
    FROM results AS r 
    ORDER BY r.wins ASC;
END