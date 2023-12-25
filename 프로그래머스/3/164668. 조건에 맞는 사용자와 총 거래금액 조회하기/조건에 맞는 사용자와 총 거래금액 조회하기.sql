with sale as
(SELECT WRITER_ID, sum(PRICE) as TOTAL_SALES, STATUS
from USED_GOODS_BOARD
where STATUS='DONE'
group by WRITER_ID
having TOTAL_SALES >= 700000)

select user.USER_ID, NICKNAME, sale.TOTAL_SALES  from USED_GOODS_USER user
inner join sale
on user.USER_ID=sale.WRITER_ID
order by TOTAL_SALES asc