with new as (SELECT CAR_ID, case 
when START_DATE <= '2022-10-16' and END_DATE >= '2022-10-16' then '대여중'
else '대여 가능' end as AVAILABILITY
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
order by CAR_ID, AVAILABILITY desc)

select new.CAR_ID, if(rent.AVAILABILITY is null, "대여 가능", "대여중") as AVAILABILITY from new
left join (select CAR_ID, AVAILABILITY from new
where AVAILABILITY = '대여중') rent
on new.CAR_ID = rent.CAR_ID
group by new.CAR_ID
order by CAR_ID desc


