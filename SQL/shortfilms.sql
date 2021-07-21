
-- SCHEMA - https://www.interviewbit.com/problems/short-films/

 select m.movie_title , m.movie_year , concat(d.director_first_name,d.director_last_name) as
 director_name , concat(a.actor_first_name,a.actor_last_name) as
 actor_name , mc.role
from
movies m inner join movies_cast mc on m.movie_id = mc.movie_id
inner join actors a on a.actor_id = mc.actor_id
inner join movies_directors md on md.movie_id = m.movie_id
 inner join directors d on md.director_id = d.director_id
 where m.movie_time = (
select min(m.movie_time)
from movies m
 );
