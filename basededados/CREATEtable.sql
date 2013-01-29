CREATE DATABASE relac;
CREATE TABLE categorias(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(70) NOT NULL,
PRIMARY KEY(ID)
);
CREATE TABLE produtos(
id INT NOT NULL AUTO_INCREMENT,
categoria_id INT NOT NULL,
nome VARCHAR(255) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
PRIMARY KEY(ID)
);
INSERT INTO categorias VALUES(1, 'Camisetas');
INSERT INTO categorias VALUES(2, 'Canecas');
INSERT INTO produtos VALUES(1, 1, 'Camiseta Social', 15.00);
INSERT INTO produtos VALUES(2, 1, 'Camiseta Regata', 11.99);
INSERT INTO produtos VALUES(3, 2, 'Caneca Grande', 12.00);