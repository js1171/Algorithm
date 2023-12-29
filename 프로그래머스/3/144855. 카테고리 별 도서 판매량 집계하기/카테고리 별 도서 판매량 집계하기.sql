with n as
(SELECT bs.BOOK_ID, bs.SALES_DATE, bs.SALES, b.CATEGORY from BOOK_SALES bs
inner join BOOK b
on bs.BOOK_ID = b.BOOK_ID
where bs.SALES_DATE between '2022-01-01' and '2022-01-31')

select CATEGORY, sum(SALES) as TOTAL_SALES from n
group by CATEGORY
order by CATEGORY
