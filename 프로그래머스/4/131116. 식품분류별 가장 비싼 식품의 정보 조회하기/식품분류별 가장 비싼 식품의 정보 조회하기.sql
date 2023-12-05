select f.CATEGORY, f.PRICE as MAX_PRICE, f.PRODUCT_NAME from FOOD_PRODUCT f
inner join (
select CATEGORY, max(PRICE) as MPRICE from FOOD_PRODUCT
group by CATEGORY) nf
where f.CATEGORY in ('과자', '국','김치','식용유') and f.CATEGORY=nf.CATEGORY and f.PRICE = nf.MPRICE
order by MAX_PRICE desc
