Algoritmo Ejercicio2
	Definir min,max,media Como Real
	Definir n,i Como Entero
	Escribir "Cuantos dias desea analizar?"
	Leer n
	Para i desde 1 Hasta n Hacer
		Escribir "Ingrese la temperatura minima del dia"
		Leer min
		Escribir "Ingrese la temperatura maxima del dia"
		Leer max
		temperaturas(min,max,media)
		Escribir "La media es de: ", media
	FinPara
FinAlgoritmo	
SubProceso temperaturas (min por valor, max por valor, media por referencia)
	
	media = (min+max)/2
FinSubProceso

