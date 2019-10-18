create database MineLogin;
use MineLogin;

create table Acesso(
idAcesso int primary key auto_increment,
login varchar(60),
senha varchar(8)
);

select * from Acesso;

insert into Acesso values
(null, 'natalia.medina@gmail.com', '1234');



