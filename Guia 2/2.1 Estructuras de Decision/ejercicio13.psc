Algoritmo GradoDeEficiencia
	Definir tornillos_d Como Entero
	Definir tornillos_sd Como Entero
	
	Escribir "Ingrese la cantidad de tornillos defectuosos fabricados"
	Leer tornillos_d
	Escribir "Ingrese la cantidad de tornillos NO defectuosos fabricados"
	Leer tornillos_sd
	
	Si tornillos_d <= 200 Y tornillos_sd >= 10000 Entonces
		Escribir "Grado de eficiciencia 8"
	SiNo
		Si tornillos_d >= 200 Y tornillos_sd >= 10000 Entonces
			Escribir "Grado de eficiencia 7"
		SiNo
			Si tornillos_d <= 200 Y tornillos_sd <= 10000 Entonces
				Escribir "Grado de eficiciencia 6"
			SiNo
				Escribir "Grado de eficiencia 5"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
