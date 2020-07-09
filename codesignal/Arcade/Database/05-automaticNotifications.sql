CREATE PROCEDURE automaticNotifications()
    SELECT email
    FROM users
    WHERE users.role NOT IN ("admin", "premium")
    ORDER BY email;
