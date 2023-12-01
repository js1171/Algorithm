SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
case when FREEZER_YN is null then 'N' 
when FREEZER_YN='Y' then 'Y'
when FREEZER_YN='N' then 'N'
end as FREEZER_YN from FOOD_WAREHOUSE
where substring(ADDRESS,1,3)='경기도'
order by WAREHOUSE_ID