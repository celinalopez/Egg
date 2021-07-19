Algoritmo Ejercicio3
	Definir num, i, n Como Entero
	Escribir "Ingrese los numeros que seran sumados. Para finalizar inserte -1"
	num = 0
	i=+1
	n=-1
	
	Mientras num <> -1 Hacer
		Leer num
		i = i + num
		n = n + 1
	FinMientras
	Escribir "EL promedio de los numeros es de: ", i/n
	
FinAlgoritmo
