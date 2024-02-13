with review_count as
    (SELECT MEMBER_ID, count(MEMBER_ID) as COUNT from REST_REVIEW
    group by MEMBER_ID
    order by COUNT desc)
    , max_count as
    (select max(COUNT) as COUNT from review_count)
    , filter as
    (SELECT MEMBER_ID from review_count r
     inner join max_count m
     on m.COUNT = r.COUNT)


select m.MEMBER_NAME, r.REVIEW_TEXT, date_format(r.REVIEW_DATE,"%Y-%m-%d") as REVIEW_DATE from REST_REVIEW r
inner join filter f on r.MEMBER_ID = f.MEMBER_ID
inner join MEMBER_PROFILE m on r.MEMBER_ID = m.MEMBER_ID
order by REVIEW_DATE, REVIEW_TEXT



