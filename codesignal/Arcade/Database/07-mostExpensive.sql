CREATE PROCEDURE mostExpensive()
BEGIN
    SELECT p.name 
    FROM Products as p 
    ORDER BY (p.price*p.quantity) DESC, p.name ASC 
    LIMIT 0,1;
END