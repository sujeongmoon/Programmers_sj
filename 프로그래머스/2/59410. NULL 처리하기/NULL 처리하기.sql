SELECT      ANIMAL_TYPE, if(name is null,"No name",name), SEX_UPON_INTAKE
FROM        ANIMAL_INS
ORDER BY    ANIMAL_ID