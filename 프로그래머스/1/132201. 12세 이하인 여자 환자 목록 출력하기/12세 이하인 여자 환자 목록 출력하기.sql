SELECT PT_NAME, PT_NO, GEND_CD, AGE, 
case when TLNO is null then 'NONE'
when TLNO is not null then TLNO end as TLNO
from PATIENT
where AGE <= 12 and GEND_CD='W'
order by AGE desc, PT_NAME