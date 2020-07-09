CREATE PROCEDURE countriesSelection()
BEGIN
	SELECT c.name, c.continent, c.population FROM countries AS c 
    WHERE c.continent = 'Africa' 
    ORDER BY c.name ASC;
END