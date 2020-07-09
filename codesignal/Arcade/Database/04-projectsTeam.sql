CREATE PROCEDURE projectsTeam()
BEGIN
    SELECT p.name 
    FROM projectLog AS p 
    GROUP BY p.name 
    ORDER BY p.name;
END