Algoritmo ejercicio4
	Definir i,n,vector Como Entero
	
	Escribir "Defina el tamaño del vector"
	Leer n
	Dimension vector(n)
	Escribir "Ingrese los valores del vector"
	para i=0 hasta n-1 Hacer
		Leer vector(i)
	FinPara
	
	Escribir "El mayor valor ingresado es: ", MaximoValor(vector,n)
	
FinAlgoritmo

Funcion max <- MaximoValor(vector,n)
	Definir i,max Como Entero
	max = 0
	para i=0 hasta n-1 Hacer
		Si vector(i) > max Entonces
			max= vector(i)
		FinSi
	FinPara
FinFuncion
	