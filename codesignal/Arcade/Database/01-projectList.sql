CREATE PROCEDURE projectList()
BEGIN
	SELECT p.project_name, p.team_lead, p.income 
    FROM Projects AS p 
    ORDER BY p.internal_id ASC;
END