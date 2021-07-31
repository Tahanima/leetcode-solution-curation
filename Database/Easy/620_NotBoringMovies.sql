SELECT id, movie, description, rating
FROM cinema
WHERE (id LIKE '%1' OR id LIKE '%3' OR id LIKE '%5' OR id LIKE '%7' OR id LIKE '%9') AND description NOT IN ('boring')
ORDER BY rating DESC;
