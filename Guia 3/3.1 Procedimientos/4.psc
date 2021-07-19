Algoritmo Ejercicio4
	definir frase Como Caracter
	
	Hacer
		Escribir "Ingrese una oracion terminada en un punto(.)"
		Leer frase
	Mientras Que Subcadena(frase,Longitud(frase)-1, Longitud(frase)-1) <> "."
	codificador(frase)
	Escribir "Frase codificada: ", frase
	
FinAlgoritmo

SubProceso codificador(frase Por Referencia)
	Definir i Como Entero
	Definir letra, aux Como Caracter
	aux = ""
	para i=0 hasta Longitud(frase)-1 Hacer
		letra = Subcadena(frase,i,i)
		segun letra Hacer
			"a": 
				letra = "@"
			"e":
				letra = "#"
			"i":
				letra = "$"
			"o":
				letra = "%"
			"u":
				letra = "*"
		FinSegun
		aux = Concatenar(aux,letra)
	FinPara
	frase = aux
FinSubProceso
	