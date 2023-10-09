create database escritorio;

use escritorio;

create table cliente (
	idcliente integer primary key auto_increment,
	 nome varchar (60) not null,
     telefone varchar (14) not null);
       
       insert into cliente(nome,telefone) 
       values ('Dandara', '(21)98384208'),
			('Gabriela', '(21)986498708');

select * from cliente;