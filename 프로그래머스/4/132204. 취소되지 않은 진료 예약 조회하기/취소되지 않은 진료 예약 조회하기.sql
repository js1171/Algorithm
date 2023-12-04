SELECT n.APNT_NO, n.PT_NAME, n.PT_NO, n.MCDP_CD, d.DR_NAME, n.APNT_YMD
from
(SELECT a.APNT_NO, p.PT_NAME, p.PT_NO, a.MCDP_CD, a.APNT_YMD, a.MDDR_ID
from 
(select * from APPOINTMENT
where year(APNT_YMD)=2022 and month(APNT_YMD)=4 and day(APNT_YMD)=13 and MCDP_CD="CS" and APNT_CNCL_YMD is null) a
inner join PATIENT p
on a.PT_NO = p.PT_NO) n
inner join DOCTOR d
on d.DR_ID = n.MDDR_ID
order by n.APNT_YMD

