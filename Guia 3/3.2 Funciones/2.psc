Algoritmo Ejercicio2
	Definir num Como Entero

	Hacer
		Escribir "Ingrese un numero para saber si es par o impar"
		Leer num
	Mientras Que num < 0
	
	Si num == 0 Entonces
		Escribir "0 no es par ni impar"
	SiNo
		Si paroimpar(num) == 0 Entonces
			Escribir "Es par"
		SiNo
			Escribir "Es impar"
		FinSi
	FinSi
	
FinAlgoritmo

Funcion modulo <- paroimpar(num)
	Definir modulo Como Entero
	modulo = num MOD 2 
FinFuncion
