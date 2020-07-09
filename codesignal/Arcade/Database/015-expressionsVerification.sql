CREATE PROCEDURE expressionsVerification()
BEGIN
    SELECT e.* 
    FROM expressions AS e 
    WHERE IF(e.operation = '+' AND e.a + e.b = e.c,1,
            IF(e.operation = '-' AND e.a - e.b = e.c,1,
                IF(e.operation = '/' AND e.a / e.b = e.c,1,
                    IF(e.operation = '*' AND e.a * e.b = e.c , 1,0)
                    )
                )
            ) = 1;
END