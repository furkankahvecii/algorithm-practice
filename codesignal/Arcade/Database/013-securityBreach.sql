CREATE PROCEDURE securityBreach()
BEGIN
    SELECT u.first_name, u.second_name, u.attribute 
    FROM users AS u 
    WHERE REGEXP_LIKE(u.attribute, concat('^[A-Za-z0-9]+[%]',u.first_name,'_',u.second_name,'[%][A-Za-z0-9]*'),'c');
END