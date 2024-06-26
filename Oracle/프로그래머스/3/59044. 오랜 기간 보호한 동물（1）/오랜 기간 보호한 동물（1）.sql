-- 코드를 입력하세요
SELECT B.NAME, B.DATETIME
FROM (
    SELECT A.NAME, A.DATETIME,
           ROWNUM AS RN
    FROM (
        SELECT NAME, DATETIME
        FROM ANIMAL_INS
        MINUS
        SELECT I.NAME, I.DATETIME 
        FROM ANIMAL_INS I
        JOIN ANIMAL_OUTS O 
        ON I.ANIMAL_ID = O.ANIMAL_ID
        ORDER BY DATETIME
    ) A
) B
WHERE B.RN IN(1, 2, 3);



