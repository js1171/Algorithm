with review as 
(select REST_ID, round(avg(REVIEW_SCORE),2) as SCORE from REST_REVIEW
group by REST_ID)

select info.REST_ID, info.REST_NAME, info.FOOD_TYPE, sum(info.FAVORITES) as FAVORITES, info.ADDRESS, review.SCORE
from REST_INFO as info
inner join review
on review.REST_ID=info.REST_ID
where info.ADDRESS like '서울%'
group by info.REST_ID
order by review.SCORE desc, FAVORITES desc