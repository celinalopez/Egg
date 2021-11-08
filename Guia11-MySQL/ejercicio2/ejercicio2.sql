select * from empleados;
select * from departamentos;
select nombre_depto from departamentos;
select nombre, sal_emp from empleados;
select comision_emp from empleados;
select * from empleados where cargo_emp = 'Secretaria';
select * from empleados where cargo_emp = 'Vendedor' order by nombre;
select nombre, cargo_emp from empleados order by sal_emp;
select nombre as "Nombre", cargo_emp as "Cargo" from empleados;
select sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp;
select sal_emp, comision_emp, (sal_emp + comision_emp + 500) as "Total a pagar" from empleados where id_depto = 3000;
select * from empleados where nombre like "J%";
SELECT nombre, sal_emp, comision_emp, (sal_emp + comision_emp) AS "Total a pagar" FROM empleados WHERE comision_emp > 1000;
SELECT nombre, sal_emp, comision_emp, (sal_emp + comision_emp) AS "Total a pagar" FROM empleados WHERE comision_emp = 0;
SELECT * FROM empleados WHERE sal_emp < comision_emp;
SELECT * FROM empleados WHERE sal_emp * 0.3 >= comision_emp;
SELECT * FROM empleados WHERE NOT nombre like "%MA%";
SELECT * FROM departamentos WHERE nombre_depto = "Ventas" OR nombre_depto = "Investigacion" OR nombre_depto = "Mantenimiento";
SELECT * FROM departamentos WHERE nombre_depto != "Ventas" AND nombre_depto != "Investigacion" AND nombre_depto != "Mantenimiento";
SELECT *, MAX(sal_emp) AS "Salario mas alto" FROM empleados;
SELECT * FROM empleados ORDER BY nombre DESC LIMIT 1; 
SELECT MAX(sal_emp) as "Salario mas alto", MIN(sal_emp) as "salario mas bajo" , (MAX(sal_emp) - MIN(sal_emp)) FROM empleados;
-- 23 : salario promedio por dpto
SELECT nombre_depto, AVG(sal_emp) FROM empleados INNER JOIN departamentos ON empleados.id_depto = departamentos.id_depto GROUP BY nombre_depto;
SELECT * FROM empleados INNER JOIN departamentos ON empleados.id_depto = departamentos.id_depto ORDER BY nombre_depto;
-- 24 : dptos con mas de 3 empleados, mostrar cantidad
SELECT nombre, cod_jefe, COUNT(id_emp) FROM empleados GROUP BY cod_jefe HAVING COUNT(id_emp) >= 2;
-- 25 Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).
SELECT GROUP_CONCAT(nombre) AS "Empleados", COUNT(*) AS "Empleados por departamento", nombre_depto FROM empleados INNER JOIN departamentos ON empleados.id_depto = departamentos.id_depto GROUP BY nombre_depto; 
-- 26 Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
SELECT nombre, sal_emp FROM empleados WHERE sal_emp >= (SELECT AVG(sal_emp) FROM empleados);