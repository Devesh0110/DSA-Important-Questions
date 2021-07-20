


select reviewer_name from reviewers inner join ratings on reviewers.reviewer_id=ratings.reviewer_id where reviewer_stars is NULL;
