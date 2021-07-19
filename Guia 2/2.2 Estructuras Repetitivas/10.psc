Algoritmo Ejercicio9
	Definir vendedores,i,j,v,n Como Entero
	Definir sueldo, ventas, comi Como Real
	
	Escribir "Ingrese la cantidad de vendedores"
	Leer vendedores
	comi = 0
	n = 0
	Para i Desde 1 hasta vendedores Hacer
		n = n+1
		Escribir"Ingrese el sueldo base del vendedor"
		Leer sueldo 
		Escribir "Ingrese las ventas realizadas por el vendedor"
		Leer v
		Para j desde 1 hasta v Hacer
			Escribir "Ingrese lo cobrado por la venta"
			Leer ventas
			comi = comi + ventas 
		FinPara
		Escribir "________________________________________"
		Escribir "Al vendedor ", n," se le paga por comision: $", (comi * 0.1)
		Escribir "Sueldo total del vendedor ", n ": $", sueldo + (comi*0.1)
		Escribir "________________________________________"
	FinPara
FinAlgoritmo
