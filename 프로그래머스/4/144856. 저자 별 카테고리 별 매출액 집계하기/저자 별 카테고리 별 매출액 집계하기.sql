with n as 
(SELECT bs.BOOK_ID, bs.SALES_DATE, bs.SALES, b.CATEGORY, b.AUTHOR_ID, b.PRICE from BOOK_SALES bs
inner join BOOK b
on b.BOOK_ID = bs.BOOK_ID
where bs.SALES_DATE between '2022-01-01' and '2022-01-31')

select a.AUTHOR_ID, a.AUTHOR_NAME, n.CATEGORY, sum(n.SALES*n.PRICE) as TOTAL_SALES from AUTHOR a
inner join n
on a.AUTHOR_ID = n.AUTHOR_ID
group by a.AUTHOR_NAME, n.CATEGORY
order by a.AUTHOR_ID, n.CATEGORY desc