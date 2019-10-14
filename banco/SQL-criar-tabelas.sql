CREATE TABLE tb_minerador (
  id_minerador INT IDENTITY(1,1) PRIMARY KEY,
  nm_minerador VARCHAR(255) NOT NULL,
  data_nasci DATE NOT NULL,
  nm_telefone NVARCHAR(2) NOT NULL,
  -- Endereço
  endereco_numero INT NOT NULL,
  endereco_cep CHAR(8),
  endereco_logradouro VARCHAR(16) NOT NULL,
  endereco_nome VARCHAR(255) NOT NULL,
  endereco_cidade VARCHAR(65) NOT NULL,
  endereco_bairro VARCHAR(65) NOT NULL,
  endereco as (
    endereco_logradouro + ' ' + endereco_nome + ', ' + endereco_numero + ', '
    + endereco_bairro + ', ' + endereco_cidade + ' - ' + endereco_cep
  ) -- Ex: Rua Edimar Fagundes Filho, 5023, São Paulo - 05232-792
);

CREATE TABLE tb_computador (
  id_computador INT PRIMARY KEY IDENTITY(1000, 1),
  fk_minerador INT NOT NULL,
  nm_disco VARCHAR(255) NOT NULL,
  nm_ram VARCHAR(255) NOT NULL,
  nm_so VARCHAR(255) NOT NULL,
  nm_gpu VARCHAR(255),
  nm_hostname VARCHAR(255) NOT NULL,
  nm_cpu VARCHAR(255) NOT NULL,
  nm_modelo VARCHAR(255),
  nm_processador VARCHAR(255) NOT NULL,
  nm_fabricante VARCHAR(255),
  FOREIGN KEY (fk_minerador) REFERENCES tb_minerador (id_minerador)
);

CREATE TABLE tb_processo (
  id_processo INT PRIMARY KEY IDENTITY(100000, 1),
  nu_pid INT NOT NULL,
  nm_processo VARCHAR(255)
);

CREATE TABLE tb_desempenho (
  id_desempenho INT PRIMARY KEY IDENTITY(50000, 1),
  fk_computador INT NOT NULL,
  fk_processo INT NOT NULL, --Questionar dps...
  nu_cpu NUMERIC NOT NULL,
  nu_ram NUMERIC NOT NULL,
  nu_disco NUMERIC NOT NULL,
  nu_gpu NUMERIC NOT NULL,
  nu_temperatura NUMERIC NOT NULL,
  FOREIGN KEY (fk_computador) REFERENCES tb_computador (id_computador),
  FOREIGN KEY (fk_processo) REFERENCES tb_processo (id_processo)
);
