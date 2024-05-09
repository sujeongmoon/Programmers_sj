SELECT      ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS '날짜'
FROM        ANIMAL_INS 
ORDER BY    ANIMAL_ID

-- DATE_FORMAT으로 원하는 형식으로 지정해서 출력할 수 있구나 ... 알았는데 또까먹은 것 ㅠ
-- DATE_FORMAT은 SELECT절에서 이루어짐.>!  