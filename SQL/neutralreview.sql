-- Write a SQL Query to find the name of all reviewers who have rated their ratings with a NULL value.

-- Output Schema:

-- reviewer_name
-- NOTE: Output column name has to match the given output schema.

-- Example Output:

-- reviewer_name
-- MaxPlank
-- NeilsBohr
-- Schrodinger

-- Schema - https://www.interviewbit.com/problems/neutral-reviewers/


select reviewer_name from reviewers inner join ratings on reviewers.reviewer_id=ratings.reviewer_id where reviewer_stars is NULL;
