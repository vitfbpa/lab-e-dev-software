CREATE DATABASE bdaula01;
USE BDAula01;

CREATE TABLE veiculo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(30),
    placa VARCHAR(7),
    id_pessoa SMALLINT NOT NULL, -- Tipo de dado ajustado para SMALLINT
    FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);
CREATE TABLE pessoa (
    id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    idioma VARCHAR(10) NOT NULL
);

INSERT INTO pessoa (nome, sexo, idioma)
VALUES
('Gerald', 'M', 'Inglês'),
('William', 'M', 'Inglês'),
('Umberto', 'M', 'Espanhol'),
('Jostein', 'M', 'Alemão'),
('Stephen', 'M', 'Holândes');

-- MERCADO

CREATE DATABASE mercado;
USE mercado;

CREATE TABLE categorias (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(50) NOT NULL
  );

CREATE TABLE produtos (
  id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES Categorias(id)
);
