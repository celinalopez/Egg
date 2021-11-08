select * from fabricante;
select * from producto;

select f.nombre, p.nombre, p.precio
from fabricante f, producto p
where f.codigo = p.codigo_fabricante;

select f.nombre, p.nombre, p.precio
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
and f.codigo = 7;

select f.nombre, f.codigo
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante 
and f.codigo = 7;

select p.codigo, p.nombre, p.precio
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
and f.codigo = 7;

select p.codigo, p.nombre, p.precio
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
and f.nombre = "Lenovo";

select p.codigo, p.nombre, p.precio
from fabricante f, producto p 
where f.codigo = p.codigo_fabricante
and f.nombre = "Lenovo"
and p.precio > 450;