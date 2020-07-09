CREATE PROCEDURE contestLeaderboard()
BEGIN
    SELECT name 
    FROM leaderboard 
    ORDER by score DESC 
    LIMIT 3,5;
END