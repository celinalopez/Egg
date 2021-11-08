select * from fabricante;
select * from producto;

/* interseccion entre las dos tablas */
select *
	from producto p 
inner join fabricante f 
	on p.codigo_fabricante = f.codigo;

/* tabla + la interseccion de la tabla con la otra tabla */
select *
	from producto p 
left outer join fabricante f 
	on p.codigo_fabricante = f.codigo;

/* */
select *
	from producto p 
right outer join fabricante f 
	on p.codigo_fabricante = f.codigo;

/* */
select *
	from producto p 
where exists (select f.codigo
				from fabricante f
				where f.codigo = p.codigo_fabricante);

select *
	from producto p 
where not exists (select f.codigo
					from fabricante f
                    where f.codigo = p.codigo_fabricante);

/* devuelve los fabricantes que no tienen productos relacionados*/
select *
	from fabricante f 
where not exists (select p.codigo_fabricante
					from fabricante f
                    where p.codigo_fabricante = f.codigo);

/* hace un producto cartesiano, cada producto por cada fabricante*/
select *
from producto p
cross join fabricante f;