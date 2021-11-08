select * from fabricante;
select * from producto;

/* por defecto es ascendente*/
select *
from fabricante 
order by nombre;

select * 
from fabricante
order by nombre asc;

select * 
from fabricante
order by nombre desc;

select *
from fabricante
order by nombre, codigo;

select f.nombre, p.nombre, p.precio
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
order by f.nombre, p.nombre;

select f.nombre, p.nombre, p.precio
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
order by p.nombre, f.nombre;


select f.nombre
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
group by f.nombre;

select f.nacionalidad, f.nombre
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
group by f.nacionalidad, f.nombre;

select f.nombre, count(*)
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
group by f.nombre;

select f.nacionalidad, count(*)
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
group by f.nacionalidad;


select f.nombre, count(*)
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
group by f.nombre
having count(*) > 1;

select f.nombre, count(*)
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
group by f.nombre
having count(*) > 1 and f.nombre <> "LENOVO";

/* devuelve los fabricantes en que la suma del precio de sus producto es mayor a 300*/
select f.nombre, count(*), SUM(p.precio)
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
group by f.nombre
having SUM(p.precio) > 300;



