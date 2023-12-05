WITH RECURSIVE TIME as (
    select 0 as hour
    union all
    select hour +1
    from time
    where hour <23
)

select t.hour as HOUR, count(ANIMAL_ID) from TIME t
left join ANIMAL_OUTS a
on t.hour = hour(a.DATETIME)
group by HOUR
order by HOUR



