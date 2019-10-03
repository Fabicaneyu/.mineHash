create database mineHash;
use mineHash;

drop table Cad_Minerador;

create table Cad_Minerador (
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

select * from Cad_Minerador;

create table Endereco(
idEndereco int primary key auto_increment not null,
Numero int,
Rua varchar(45),
Cidade varchar(45),
Bairro varchar(45)
)auto_increment = 10000;

select * from Endereco;

create table Computador(
idComp int primary key auto_increment not null,
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

drop table Desempenho;

create table Desempenho (
idDesempenho int primary key auto_increment not null,
CPUatual decimal(5,2),
RAMatual decimal(5,2),
DISCO decimal(5,2),
GPUatual decimal(5,2),
Temperatura decimal(5,2)
)auto_increment = 100000;

select * from Desempenho;

create table Processo(
idProcesso int primary key auto_increment not null,
PID int,
NomeProcesso varchar(45)
)auto_increment = 1000000;

select * from Processo;

create table Monitoramento(
idMonitoramento int primary key auto_increment not null,
RAMcritico decimal(5,2),
RAMestavel decimal(5,2),
DISCOcritico decimal(5,2),
DISCOestavel decimal(5,2),
GPUcritico decimal(5,2),
GPUestavel decimal(5,2),
CPUcritico decimal(5,2),
CPUestavel decimal(5,2)
)auto_increment = 20000000;

select * from Monitoramento;

