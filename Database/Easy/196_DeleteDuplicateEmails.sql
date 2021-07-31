DELETE a
FROM Person a, Person b
WHERE a.Email = b.Email AND
      a.Id > b.Id;
