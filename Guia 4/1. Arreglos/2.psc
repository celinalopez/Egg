Algoritmo Ejercicio2
	Dimension valores(10)
	Definir i,valores Como Entero
	
	Escribir "Ingrese 10 valores enteros"
	Para i=0 hasta 9 Hacer
		Leer valores(i)
	FinPara
	Escribir "La suma de todos los valores es: ", Suma(valores)
	Escribir "La resta de todos los valores es: ", Resta(valores)
FinAlgoritmo

Funcion resultado_suma <- Suma(valores)
	Definir resultado_suma,i Como Entero
	resultado_suma = 0
	para cada i de valores Hacer
		resultado_suma = resultado_suma + i
	FinPara
FinFuncion
Funcion resultado_resta <- Resta(valores)
	Definir resultado_resta,i Como Entero
	resultado_resta = 0
	para cada i de valores Hacer
		resultado_resta = resultado_resta - i
	FinPara
FinFuncion
	