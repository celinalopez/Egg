Algoritmo EncuentroCine
	
	Definir opinion Como Entero
	Escribir "Clasifique la peli de 1 a 5 estrellas"
	Leer opinion
	
	Segun opinion Hacer
		1,2:
			Escribir "que pena que no hayas disfrutado la peli"
		3:
			Escribir "has calificado la peli como buena"
		4:
			Escribir "has clasificado la peli como muy buena"
		5: 
			Escribir "has clasificado la peli como excelente"
		De Otro Modo:
			Escribir "el valor ", opinion,"no es valido"
	FinSegun
	
	Escribir "hasta la proxima"

	FinSegun
	
	
FinAlgoritmo
