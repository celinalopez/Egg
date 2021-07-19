Algoritmo PorcentajeDeNines
	Definir ninos, ninas, total Como Entero
	Definir porcentajeNinos, porcentajeNinas Como Real
	
	Escribir "Ingrese la cantidad total de niños en el curso"
	Leer ninos
	Escribir "Ingrese la cantidad total de niñas en el curso"
	Leer ninas
	
	total = ninos + ninas
	porcentajeNinos = (ninos * 100) / total
	porcentajeNinas = 100 - porcentajeNinos 
	
	Escribir "El porcentaje de niños en el curso es de ", porcentajeNinos, "%"
	Escribir "El porcentaje de niñas en el curso es de ", porcentajeNinas, "%"
FinAlgoritmo
