--sELECT * FROM restaurante limit 1 offset 1

-- SELECT restaurante.*, categoria_estabelecimento.nome AS categoria_nome
-- FROM restaurante
-- INNER JOIN categoria_estabelecimento
-- ON restaurante.categoria_estabelecimeto_ID = categoria_estabelecimento.ID
-- WHERE categoria_estabelecimento.nome = 'churrascaria';


-- SELECT restaurante.*, categoria_estabelecimento.nome AS categoria_nome
-- FROM restaurante
-- LEFT JOIN categoria_estabelecimento
-- ON restaurante.categoria_estabelecimeto_ID = categoria_estabelecimento.ID;

-- SELECT restaurante.*, categoria_estabelecimento.nome
-- FROM restaurante
-- RIGHT JOIN categoria_estabelecimento
-- ON restaurante.categoria_estabelecimeto_ID = categoria_estabelecimento.ID
-- WHERE restaurante.categoria_estabelecimeto_ID IS NULL;

-- SELECT
--     restaurante.*,
--     categoria_estabelecimento.nome AS categoria_nome,
--     produto.*
-- FROM restaurante
-- INNER JOIN categoria_estabelecimento
-- ON restaurante.categoria_estabelecimeto_ID = categoria_estabelecimento.ID
-- INNER JOIN produto
-- ON restaurante.ID = produto.ID_restaurante
-- WHERE categoria_estabelecimento.nome = 'churrascaria';


