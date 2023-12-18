with ai as (SELECT ANIMAL_ID, ANIMAL_TYPE, NAME from ANIMAL_INS
        where SEX_UPON_INTAKE like "Intact%"),
ao as (SELECT ANIMAL_ID, ANIMAL_TYPE, NAME from ANIMAL_OUTS
        where SEX_UPON_OUTCOME like "Spayed%" or SEX_UPON_OUTCOME like "Neutered%")
        
select ai.ANIMAL_ID, ai.ANIMAL_TYPE, ai.NAME from ai
inner join ao
on ai.ANIMAL_ID= ao.ANIMAL_ID
order by ai.ANIMAL_ID