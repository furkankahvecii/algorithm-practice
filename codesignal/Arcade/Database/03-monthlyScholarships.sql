CREATE PROCEDURE monthlyScholarships()
BEGIN
    SELECT s.id, (s.scholarship) / 12 AS scholarship 
    FROM scholarships AS s;
END