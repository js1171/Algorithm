with fo as (SELECT PRODUCT_ID, AMOUNT from FOOD_ORDER
where PRODUCE_DATE between '2022-05-01' and '2022-05-31')

select fp.PRODUCT_ID, fp.PRODUCT_NAME, sum(fo.AMOUNT)* fp.PRICE as TOTAL_SALES from FOOD_PRODUCT fp
inner join fo
on fp.PRODUCT_ID = fo.PRODUCT_ID
group by PRODUCT_ID
order by TOTAL_SALES desc, fp.PRODUCT_ID


