SELECT produtos.* FROM produtos INNER JOIN categorias ON produtos.categoria_id = categorias.id ORDER BY produtos.nome ASC;