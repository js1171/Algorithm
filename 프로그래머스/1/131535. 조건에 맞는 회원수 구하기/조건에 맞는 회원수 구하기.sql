SELECT count(*) as USERS from USER_INFO
where substring(JOINED,1,4)='2021' and AGE between 20 and 29
