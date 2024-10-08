SELECT ID, CASE WHEN PARENT_ID_COUNT is null THEN 0 ELSE PARENT_ID_COUNT END CHILD_COUNT
FROM ECOLI_DATA
LEFT JOIN
    (SELECT PARENT_ID, COUNT(PARENT_ID) PARENT_ID_COUNT
    FROM ECOLI_DATA
    GROUP BY PARENT_ID) COUNT_INFO
ON ECOLI_DATA.ID = COUNT_INFO.PARENT_ID