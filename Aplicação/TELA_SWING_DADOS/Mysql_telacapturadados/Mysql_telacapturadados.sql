use CapturaDados;

 create table TesteOshi (
 idCaptura int primary key auto_increment,
 PROCESSADOR VARCHAR(60),
 RAM VARCHAR(40),
 FABRICANTE VARCHAR(60)
 )auto_increment = 001;
 
 select * from TesteOshi;
 
 drop table TesteOshi;