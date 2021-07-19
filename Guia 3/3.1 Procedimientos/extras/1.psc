Algoritmo Extra1
	Definir texto Como Caracter
	
	Escribir "Ingrese un texto para espaciar"
	Leer texto
	convertirEspaciado(texto)
FinAlgoritmo

SubProceso convertirEspaciado(texto Por Referencia)
	Definir i Como Entero
	Para i=0 hasta Longitud(texto)-1 Hacer
		Escribir Sin Saltar Subcadena(texto,i,i), " "
	FinPara
FinSubProceso
	