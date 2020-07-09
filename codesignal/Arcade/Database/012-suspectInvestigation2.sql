CREATE PROCEDURE suspectsInvestigation2()
BEGIN
    SELECT s.id, s.name, s.surname FROM Suspect AS s 
    WHERE s.height <= 170 OR (s.name NOT LIKE 'B%' OR s.surname NOT LIKE 'gre_n');
END