Algoritmo Extra4
	Definir nombre Como Caracter
	Definir prac, prob,teor Como Real
	prac= 0
	prob=0
	teor = 0
	nombre = "nombre"
	
	Mientras nombre <> " " Hacer
		
		Escribir "Nombre: "
		Leer nombre
		Escribir "Nota de la Practica: "
		Leer prac
		Escribir "Nota de los problemas: "
		Leer prob
		Escribir "Nota de la teoria: "
		Leer teor
		Si 0 >= prac o 10 <= prac o 0 >= prob o 10 <= prob o teor >= 10 y teor <= 0 Entonces
			Escribir "Error, una o varias notas estan fuera del rango 0-10"
		SiNo
			Escribir "La nota obtenida es de: ", (prac*0.1)+(prob * 0.5)+(teor*0.4)	
		FinSi
		
	FinMientras
FinAlgoritmo
