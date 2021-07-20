
select concat(directors.director_first_name,director_last_name) as director_name,movies.movie_title
from movies join movies_directors on movies.movie_id=movies_directors.movie_id
join movies_cast on movies_cast.movie_id=movies.movie_id
join directors on movies_directors.director_id=directors.director_id
where movies_cast.role="SeanMaguire";