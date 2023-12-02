SELECT distinct(c.CAR_ID) from CAR_RENTAL_COMPANY_CAR c
inner join CAR_RENTAL_COMPANY_RENTAL_HISTORY r
on c.CAR_ID = r.CAR_ID
where c.CAR_TYPE='세단' and START_DATE like '%-10-%'
order by CAR_ID desc
