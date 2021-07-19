Algoritmo ConversorDeTiempo
	
	Definir dias, horas, minutos, segundos Como Real

	
	Escribir "Ingrese la cantidad de dias a convertir"
	Leer dias 
	
	horas = dias * 24
	minutos = dias * 1440
	segundos = dias * 86400
	
	Escribir "| horas: ", horas, " | minutos: ", minutos, " | segundos: ", segundos, " |"
	
	
FinAlgoritmo
