Algoritmo Ejercicio4
	Definir frase,letra Como Caracter
	Escribir "Ingrese una frase y a continuacion la letra a buscar en ella"
	Leer frase, letra
	Escribir "Cantidad de ", letra, " en ", frase ":", Buscador(frase,letra)
FinAlgoritmo

Funcion cantidad <- Buscador(frase,letra)
	Definir cantidad,i Como Entero
	Definir l Como Caracter
	cantidad = 0
	Para i=0 Hasta Longitud(frase) Hacer
		l = Subcadena(frase,i,i)
		Segun l Hacer
			letra: 
				cantidad = cantidad + 1
		FinSegun
	FinPara
FinFuncion
