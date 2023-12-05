with RC as (
    select CAR_ID, count(*) as COUNT from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where START_DATE between "2022-08-01" and "2022-10-31"
    group by CAR_ID
)


select month(START_DATE) as MONTH, h.CAR_ID, count(*) RECORDS from CAR_RENTAL_COMPANY_RENTAL_HISTORY h
inner join RC on RC.CAR_ID = h.CAR_ID
where START_DATE between "2022-08-01" and "2022-10-31" and RC.COUNT >=5
group by MONTH, h.CAR_ID
order by MONTH, h.CAR_ID desc






