SELECT ri.FOOD_TYPE, ri.REST_ID, ri.REST_NAME, ri.FAVORITES
from REST_INFO ri
inner join (select FOOD_TYPE, max(FAVORITES) as FAVORITES from REST_INFO
group by FOOD_TYPE) n
on ri.FAVORITES = n.FAVORITES
group by ri.FOOD_TYPE
order by ri.FOOD_TYPE desc



