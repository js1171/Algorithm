with filter as
(SELECT HOST_ID from PLACES
group by HOST_ID
having count(HOST_ID) > 1)

select p.ID, p.NAME, p.HOST_ID from PLACES p
inner join filter f
on p.HOST_ID = f.HOST_ID
order by p.ID