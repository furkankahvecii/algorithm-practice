
/*
 * https://leetcode.com/problems/duplicate-emails/
 */


select Email from Person as p group by Email having COUNT(email)>1
