create database MineHash;
use MineHash;

create table Minerador(
idMinerador int primary key auto_increment,
Nome varchar(45),
Data_nasc date,
Telefone varchar (11),
Endereco int ,
CPF varchar(11),
CNPJ varchar(14),
Email varchar (60),
Senha varchar(45)
) auto_increment = 001;


create table Endereco(
idEndereço int primary key auto_increment,
Rua varchar(45),
Num int(45),
Complemento int,
cep varchar(7),
Cidade varchar(45),
Estado varchar(45)
)auto_increment=100;

create table Computador(
idComputador int primary key auto_increment,
Disco varchar(45),
Ram varchar(45),
SO varchar(45),
GPU varchar(45),
Hostname varchar(45),
Processador varchar(45),
Modelo varchar(45),
Fabrcante varchar(45)
)auto_increment=1000;




create table Monitoramento(
idComputador int primary key auto_increment,
CpuAtual decimal(5,2),
RamAtual decimal(5,2),
DiscoAtual decimal(5,2),
GpuAtual decimal(5,2),
temperatura decimal(5,2)
)auto_increment = 5000;

create table Processo(
idProcesso int primary key auto_increment,
PID int,
NomeProcesso varchar(45)
)auto_increment = 10000;