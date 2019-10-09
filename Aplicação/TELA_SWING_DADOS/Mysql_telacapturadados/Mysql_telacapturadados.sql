use CapturaDados;

select * from TesteOshi;
drop table TesteOshi;
select * from  TesteOshi; 
create table TesteOshi (
 idCaptura int primary key auto_increment,
 CPU decimal(5,2),
 RAM decimal (5,2),
 DISCO decimal(5,2)
 )auto_increment = 1;
 
 select * from TesteOshi;
 