# Write your MySQL query statement below

UPDATE salary
SET sex = (CASE WHEN sex = 'm' THEN 'f' 
                WHEN sex = 'f' THEN 'm' ELSE
                'a'
           END);