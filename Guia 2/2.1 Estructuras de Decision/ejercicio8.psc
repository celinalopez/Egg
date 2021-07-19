Algoritmo ValidadNotas
	Definir nota1,nota2,nota3 Como Entero
	Definir variable Como Logico
	
	Escribir "Ingrese 3 notas"
	Leer nota1,nota2,nota3
	variable = Falso
	
	Si nota1 >= 1 Y nota1 <= 10 Entonces
		Si nota2 >= 1 Y nota2 <= 10 Entonces
			Si nota3 >= 1 Y nota3 <= 10 Entonces
				variable = Verdadero
			FinSi
		FinSi
	FinSi
	Si variable = Verdadero
		Escribir "Las 3 notas son correctas"
	FinSi
	
FinAlgoritmo
