-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM (
    SELECT *
    FROM ANIMAL_INS
    WHERE UPPER(NAME) LIKE '%EL%'
) a
WHERE a.ANIMAL_TYPE = 'Dog'
ORDER BY NAME ASC;