-- 코드를 입력하세요
SELECT      NAME
FROM        ANIMAL_INS
WHERE       DATETIME = (SELECT MIN(DATETIME) from ANIMAL_INS)

# SELECT NAME FROM ANIMAL_INS ORDER BYH DATETIME LIMIT 1