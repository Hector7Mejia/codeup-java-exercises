package study_hall.HackerRank;

public class intermediateMysql {
    //SELECT CONCAT(Name,'(', SUBSTRING(Occupation,1,1) ,')') as Output
    //FROM OCCUPATIONS
    //ORDER BY Name;
    //
    //SELECT
    //CONCAT('There are a total of ', num,' ' ,lower(Occupation),'s','.') as Output
    //FROM (
    //SELECT Occupation,count(*) as num
    //FROM OCCUPATIONS
    //GROUP BY Occupation) AS table1
    //ORDER BY num, Occupation;

    ///*
    //    Enter your query here and follow these instructions:
    //    1. Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
    //    2. The AS keyword causes errors, so follow this convention: "Select t.Field From table1 t" instead of "select t.Field From table1 AS t"
    //    3. Type your code immediately after comment. Don't leave any blank line.
    //
    //  WITH root AS  (SELECT N FROM BST WHERE P IS NULL),
    //inr AS  (SELECT DISTINCT P    FROM BST WHERE P NOT IN (SELECT * FROM root)  ),
    //leaf as (SELECT DISTINCT N   FROM BST WHERE N NOT IN (SELECT * FROM inr UNION SELECT * FROM root))
    //
    // SELECT * , 'Root' FROM root UNION
    // SELECT *, 'Leaf' FROM leaf UNION
    // SELECT *, 'Inner' FROM inr
    // order by 1*/
}
