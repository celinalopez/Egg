Algoritmo Ejercicio3
	Definir n,i,c,num,vector Como Entero
	c=0
	
	Escribir "Defina el tamaño del vector"
	Leer n
	Dimension vector(n)
	
	Escribir "Ingrese los valores del vector"
	para i=0 hasta n-1 Hacer
		Leer vector(i)
	FinPara
	
	Escribir "Ingrese el numero a buscar"
	Leer num
	
	para i = 0 hasta n-1 Hacer
		si vector(i) = num Entonces
			Escribir "La posicion del numero es ", i
			c = c + 1
		FinSi
	FinPara
	Si c > 1 Entonces
		Escribir "El valor se repite ", c," veces"
	FinSi
	Si c = 0 Entonces
		Escribir "El valor no se encuentra"
	FinSi

	
FinAlgoritmo

	

	