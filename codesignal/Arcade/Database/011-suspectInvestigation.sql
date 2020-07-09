CREATE PROCEDURE suspectsInvestigation()
BEGIN
    SELECT s.id, s.name, s.surname 
    FROM Suspect AS s 
    WHERE s.height <= 170 AND LEFT(s.name,1) = 'B' AND LEFT(s.surname,3) = 'Gre' AND RIGHT(s.surname,1) = 'n' AND LENGTH(s.surname) = 5;

    /* or */

    SELECT s.id, s.name, s.surname 
    FROM Suspect AS s 
    WHERE s.height <= 170 AND s.name LIKE 'b%' AND s.surname LIKE 'gre_n';
END
