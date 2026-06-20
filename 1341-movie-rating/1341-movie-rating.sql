# Write your MySQL query statement below
(select name as results
from Users u join MovieRating mr on u.user_id = mr.user_id
group by u.user_id order by count(*) desc , name
limit 1)
union all
(select title as results
from Movies m join MovieRating mr on m.movie_id = mr.movie_id
where date_format(created_at, '%Y-%m') = '2020-02'
group by m.movie_id order by avg(rating) desc, title limit 1);