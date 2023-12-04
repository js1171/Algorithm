SELECT u.USER_ID, u.NICKNAME, concat(u.CITY, ' ', u.STREET_ADDRESS1, ' ' , u.STREET_ADDRESS2) as 전체주소, 
concat(substring(u.TLNO,1,3), '-', substring(u.TLNO,4,4), '-', substring(u.TLNO,8,4)) as 전화번호
from (select WRITER_ID, count(*) as count from USED_GOODS_BOARD
group by WRITER_ID
having count >=3) ub
inner join USED_GOODS_USER u
on ub.WRITER_ID= u.USER_ID
order by USER_ID desc



