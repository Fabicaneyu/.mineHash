create database minehash2;
use minehash2;

create table Minerador (
idMinerador int primary key auto_increment not null,
Nome varchar(60),
dataNascimento date,
Telefone varchar(17),
CPF varchar(11),
CNPJ varchar(14),
Email varchar(60),
Senha varchar(20)
) auto_increment = 0001;


create table Endereco(
idEndereco int primary key auto_increment not null,
Numero int,
Rua varchar(45),
Cidade varchar(45),
Bairro varchar(45),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)
)auto_increment = 10000;


create table Computador(
idComp int primary key auto_increment not null,
GPU varchar(45),
DISCO varchar(45),
RAM varchar(45),
Processador varchar(45),
SO varchar(45),
Hostname varchar(60),
Modelo varchar(60),
Fabricante varchar(60),
fkMinerador int, foreign key (fkMinerador) references Minerador(idMinerador)
)auto_increment = 1000;


create table Processo (
idProcesso int primary key auto_increment not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
PID int ,
NomeProcesso varchar(45),
DataHora datetime 
)auto_increment = 1000000;


create table Desempenho (
idDesempenho int primary key auto_increment not null,
fkComputador int, foreign key (fkComputador) references Computador(idComp),
CPUatual decimal(5,2),
RAMatual decimal(5,2),
DISCO decimal(5,2),
GPUatual decimal(5,2),
Temperatura decimal(5,2)
)auto_increment = 100000;


insert into Minerador (Nome,dataNascimento,Telefone,CPF,CNPJ,Email,Senha) values
('Gabriel Sutto Tinquim','1999-02-05','1195437387','48280129820',null,'gabrieltinquim@gmail.com','Titica123'); 

insert into Endereco values
(null,261,"Paulo di favari","São Bernardo","Rudge Ramos",1);

insert into Computador values 
(null,"teste","teste","teste","teste","teste","teste","teste","teste",1);

insert into Processo values
(null,1000,112,"Xalala",null);

insert into Desempenho values
(null,1000,99.0,99.0,99.0,99.0,99.0);

/*select juntando as informações do cliente*/
select * from Minerador as m 
	join Endereco as e on m.idMinerador = e.fkMinerador 
	join Computador as c on c.fkMinerador = m.idMinerador;

/* select juntando as informações do computador do cliente*/
select * from Computador as c
	join Processo as p on c.idComp = p.fkComputador
    join Desempenho as d on c.idComp = d.fkComputador; 







