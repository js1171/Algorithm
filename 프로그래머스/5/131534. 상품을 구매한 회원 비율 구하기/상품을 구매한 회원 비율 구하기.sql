with un as 
(SELECT USER_ID, JOINED from USER_INFO
where JOINED between '2021-01-01' and '2021-12-31'
), c as (select count(*) as C from un),
o as (select year(SALES_DATE) as YEAR, month(SALES_DATE) as MONTH, USER_ID from ONLINE_SALE
     group by year, month, USER_ID)

select YEAR, MONTH, count(un.USER_ID) as PUCHASED_USERS, round((count(un.USER_ID)/ c.C),1) as PUCHASED_RATIO from o
inner join un
on o.USER_ID = un.USER_ID
inner join c
group by YEAR, MONTH
order by YEAR, MONTH
