CREATE PROCEDURE gradeDistribution()
BEGIN
    SELECT g.Name, g.ID 
    FROM Grades AS g 
    WHERE (g.Midterm1 + g.Midterm2) / 2 < g.Final 
    ORDER BY LEFT(g.Name,3);
END