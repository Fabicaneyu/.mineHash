create database teste_oshi;
use teste_oshi;

create table Computador (
id_pc int primary key auto_increment,
fabricante varchar(40),
modelo varchar(40),
processador varchar(60),
memoriaTotal varchar(70),
memoriaDisp varchar(70)
);


select * from Computador;




