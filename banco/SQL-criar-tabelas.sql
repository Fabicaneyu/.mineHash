CREATE TABLE tb_minerador (
  id_minerador INT PRIMARY KEY IDENTITY(1,1),
  nm_minerador VARCHAR(255) NOT NULL,
  nu_cpf CHAR(11) UNIQUE NOT NULL,
  data_nasci DATETIME NOT NULL,
  nu_telefone VARCHAR(13) NOT NULL,
  -- Endereço
  endereco_numero INT NOT NULL,
  endereco_cep CHAR(8) NOT NULL,
  endereco_logradouro VARCHAR(16) NOT NULL,
  endereco_nome VARCHAR(255) NOT NULL,
  endereco_cidade VARCHAR(65) NOT NULL,
  endereco_bairro VARCHAR(65) NOT NULL,
  endereco_apelido VARCHAR(255)
  -- endereco as (
  --   endereco_logradouro + ' ' + endereco_nome + ', ' + endereco_numero + ', '
  --   + endereco_bairro + ', ' + endereco_cidade + ' - ' + endereco_cep
  -- ) -- Ex: Rua Edimar Fagundes Filho, 5023, São Paulo - 05232-792
);

CREATE TABLE tb_computador (
  id_computador INT PRIMARY KEY IDENTITY(1000, 1),
  fk_minerador INT NOT NULL,
  nm_hostname VARCHAR(255) NOT NULL,
  nm_processador VARCHAR(255) NOT NULL,
  nm_ram VARCHAR(255) NOT NULL,
  nm_disco VARCHAR(255) NOT NULL,
  nm_so VARCHAR(255) NOT NULL,
  nm_gpu VARCHAR(255),
  nm_modelo VARCHAR(255) NOT NULL,
  -- nm_fabricante VARCHAR(255),
  FOREIGN KEY (fk_minerador) REFERENCES tb_minerador (id_minerador)
);

CREATE TABLE tb_desempenho (
  id_desempenho INT PRIMARY KEY IDENTITY(50000, 1),
  fk_computador INT NOT NULL,
  nu_processador NUMERIC NOT NULL,
  nu_ram NUMERIC NOT NULL,
  nu_disco NUMERIC NOT NULL,
  nu_gpu NUMERIC,
  nu_temp NUMERIC,
  FOREIGN KEY (fk_computador) REFERENCES tb_computador (id_computador)
);

CREATE TABLE tb_processo (
  id_processo INT PRIMARY KEY IDENTITY(500000, 1),
  fk_desempenho INT NOT NULL,
  nu_pid INT NOT NULL,
  nm_processo VARCHAR(255) NOT NULL,
  FOREIGN KEY (fk_desempenho) REFERENCES tb_processo (id_processo)
);

-- Insert dados fictícios

INSERT INTO tb_minerador (nm_minerador, nu_cpf, data_nasci, nu_telefone, endereco_numero,
  endereco_cep, endereco_logradouro, endereco_nome, endereco_cidade,
  endereco_bairro) VALUES
  ('Fulano', '11151718874', '2001-10-12', '11912345678', '321', '74829602', 'Avenida',
    'Alberto Benedito da Fonseca', 'São Paulo','Medina'),
  ('Deltrano', '17734263895','2002-05-07', '10987654321', '7523', '20629602',
    'Praça', 'Cardoso da Silva Filho', 'São José dos Campos', 'Lincoln'),
  ('Siclano', '64881050869', '1997-07-12', '11956781234', '1', '42078729', 'Rua',
    'Pedro Leocádio Weber', 'São Paulo', 'Sutto');

INSERT INTO tb_computador (fk_minerador, nm_disco, nm_ram, nm_so, nm_gpu,
  nm_hostname, nm_modelo, nm_processador) VALUES
  (1, 'SEAGATE 500GB', 'HYPERX 8GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 2070 TI', 'JOAOZINHOGAMEPLAYS', '7000 Series',
    'Intel Core i9-8850K'), -- ID: 1001
  (1, 'SEAGATE 5000GB', 'HYPERX 16GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 1070 TI', 'FULANOGAMEPLAYS', '5000 Series',
    'Intel Core i7-8850K'), -- ID: 1002
  (2, 'SEAGATE 250GB', 'HYPERX 32GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 1080 TI', 'GUILHERMINHOGAMEPLAYS', '7000 Series',
    'Intel Core i5-8850K'), -- ID: 1003
  (2, 'SEAGATE BARRACUDA 3000GB', 'HYPERX 16GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 1050 TI', 'DELTRANOGAMEPLAYS', '5000 Series',
    'Intel Core i7-8850K'), -- ID: 1004
  (3, 'SEAGATE BARRACUDA 4000GB', 'HYPERX 16GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 2080 TI', 'SICLANOGAMEPLAYS', '7000 Series',
    'Intel Core i9-8850K'), -- ID: 1005
  (3, 'SEAGATE BARRACUDA 10000GB', 'HYPERX 32GB 2440MHz', 'LINUX 19.04',
    'NVIDIA GTX 2080 TI', 'SICLANO', '7000 Series',
    'Intel Core i9-8850K'); -- ID: 1006
