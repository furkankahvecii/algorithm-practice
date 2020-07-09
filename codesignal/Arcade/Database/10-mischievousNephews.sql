CREATE PROCEDURE mischievousNephews()
BEGIN
    SELECT WEEKDAY(m.mischief_date) as weekday, m.* 
    FROM mischief AS m  
    WHERE (author = "Huey") OR (author = "Dewey") OR (author = "Louie")  
    ORDER BY weekday,Field(m.author, 'Huey', 'Dewey' ,'Louie'), m.mischief_date, m.title;
END