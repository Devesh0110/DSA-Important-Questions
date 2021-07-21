--SCHEMA - https://www.interviewbit.com/problems/actors-and-their-movies/


select movies.movie_title from movies inner join movies_cast on movies.movie_id=movies_cast.movie_id
inner join actors on actors.actor_id=movies_cast.actor_id 
WHERE movies_cast.actor_id IN (SELECT actor_id FROM movies_cast GROUP BY actor_id HAVING COUNT(actor_id) > 1);
