/*
 * https://leetcode.com/problems/classes-more-than-5-students/
 */



/* Write your T-SQL query statement below */


SELECT class
FROM courses
GROUP BY class
HAVING COUNT(distinct student) > 4