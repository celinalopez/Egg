Algoritmo Ejercicio8
	Definir tpi,expo,parcial, maxexpo, final, finalmal Como Real
	Definir nombre Como Caracter
	Definir total, a, contador, eparcial, reprueba Como Entero
	
	Escribir "Ingrese la cantidad de estudiantes en el curso"
	Leer total
	
	contador = 0
	maxexpo = 0
	eparcial = 0
	reprueba = 0
	finalmal = 0
	
	Para a desde 1 hasta total Hacer
		Escribir "Ingrese el nombre del estudiante"
		Leer nombre
		Escribir "Ingrese la nota del Trabajo Practico Integrador"
		Leer tpi
		Escribir "Ingrese la nota de la exposicion"
		Leer expo
		Escribir "Ingrese la nota del parcial"
		Leer parcial
		
		//nota mayor en el tpi
		Si tpi > 7.5 Entonces
			contador = contador + 1
		FinSi
		//mayor nota en expo
		Si expo > maxexpo Entonces
			maxexpo = expo
		FinSi
		//entre 4 y 7.5 en parcial
		Si parcial >= 4 y parcial <= 7.5 Entonces
			eparcial =+ 1
		FinSi
		// nota promedio de los que reprueban el curso
		final = (tpi * 0.35)+(expo * 0.25)+(parcial * 0.4)
		Escribir final
		Si final < 6.5 Entonces
			reprueba = reprueba + 1
			finalmal = finalmal + final
		FinSi
	FinPara

	Escribir "El porcentaje de estudiantes que tienen una nota mayor a 7.5 en el Trabajo Integrador es de: " (contador*100)/total, "%"
	Escribir "La mayor nota alcanzada en la exposicion fue de: ", maxexpo 
	Escribir "El total de estudiantes que obtuvo entre 4 y 7.5 en el parcial es de: ", eparcial
	Si reprueba <> 0 Entonces
		Escribir "La nota promedio de los estudiantes que reprueban el curso: ", finalmal/reprueba
	SiNo
		Escribir "Ningun alumno reprobó el curso"
	FinSi
	
FinAlgoritmo
