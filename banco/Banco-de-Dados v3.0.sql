create database minehash2;
use minehash2;

create table Endereco(
idEndereco int primary key auto_increment not null,
Numero int,
Rua varchar(45),
Cidade varchar(45),
Bairro varchar(45)
)auto_increment = 10000;

select * from Endereco; 

create table Minerador (
idMinerador int primary key auto_increment not null,
Nome varchar(60),
dataNascimento date,
Telefone varchar(17),
fkEndereco int, foreign key (fkEndereco) references Endereco(idEndereco),
CPF varchar(11),
CNPJ varchar(14),
Email varchar(60),
Senha varchar(20)
) auto_increment = 0001;

select * from Minerador; 

create table Computador(
idComp int primary key auto_increment not null,
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador),
GPU varchar(45),
DISCO varchar(45),
RAM varchar(45),
Processador varchar(45),
SO varchar(45),
Hostname varchar(60),
Modelo varchar(60),
Fabricante varchar(60)
)auto_increment = 1000;

select * from Computador;

create table Processo (
idProcesso int primary key auto_increment not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
PID int ,
NomeProcesso varchar(45),
DataHora datetime 
)auto_increment = 1000000;

select * from Processo;

create table Desempenho (
idDesempenho int primary key auto_increment not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
CPUatual decimal(5,2),
RAMatual decimal(5,2),
DISCO decimal(5,2),
GPUatual decimal(5,2),
Temperatura decimal(5,2)
)auto_increment = 100000;

select * from Desempenho;
