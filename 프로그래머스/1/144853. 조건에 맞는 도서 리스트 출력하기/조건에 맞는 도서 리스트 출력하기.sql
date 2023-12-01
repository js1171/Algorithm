-- 코드를 입력하세요
SELECT BOOK_ID, date_format(PUBLISHED_DATE,'%Y-%m-%d') from BOOK
where substring(PUBLISHED_DATE,1,4)='2021' and CATEGORY='인문'
order by PUBLISHED_DATE