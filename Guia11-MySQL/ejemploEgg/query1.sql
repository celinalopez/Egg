SELECT * from fabricante;

insert into fabricante (codigo, nombre) values (10, "HP");

update fabricante
	set nombre = "HP2"
    where codigo = 10;

select * from fabricante;
select * from fabricante where codigo = 3;
select nombre from fabricante where codigo = 5;
select codigo, nombre from fabricante where codigo = 5;
select * from fabricante where codigo > 4;
select * from fabricante where nombre = "Lenovo";
select * from fabricante where codigo = 2 AND codigo = 3;
select count(*) from fabricante;
select count(*) from fabricante where nombre = "Lenovo";
select max(codigo) from fabricante;
select min(codigo) from fabricante;
select * from fabricante where codigo in (3, 5);
select * from fabricante where nombre like '%su%'; 
select * from fabricante where nombre like 'su%';
select * from fabricante where nombre like '%sus';
select ¨from fabricate where codigo between 2 and 7; 

