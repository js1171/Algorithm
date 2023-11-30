-- 코드를 입력하세요
SELECT p.PRODUCT_CODE as PRODUCT_CODE, sum(p.PRICE * o.SALES_AMOUNT) as SALES
from PRODUCT p
inner join OFFLINE_SALE o
on o.PRODUCT_ID = p.PRODUCT_ID
group by p.PRODUCT_CODE
order by sum(p.PRICE * o.SALES_AMOUNT) desc, p.PRODUCT_CODE asc


