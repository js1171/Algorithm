with US as (
    select * from USER_INFO 
    where GENDER is not null), 
SA as (select * from ONLINE_SALE 
      group by month(SALES_DATE), USER_ID)

select year(sa.SALES_DATE) as YEAR, month(sa.SALES_DATE) as MONTH, GENDER, count(*) as USERS
from SA sa
inner join US u on u.USER_ID=sa.USER_ID
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER


