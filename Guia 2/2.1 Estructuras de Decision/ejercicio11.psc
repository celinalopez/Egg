Algoritmo Calculadora
	Definir valor1,valor2 Como Entero
	Definir input Como Caracter
	
	Escribir "Ingrese 2 numeros a operar entre si"
	Leer valor1,valor2
	Escribir "Ingrese |S| para Sumar, |R| para restar, |M| para multiplicar o |D| para dividir"
	Leer input
	
	Segun input Hacer
		"s","S":
			Escribir "Suma: ", valor1+valor2
		"r","R":
			Escribir "Resta: ", valor1-valor2
		"m","M":
			Escribir "Multiplicacion: ", valor1*valor2
		"d","D":
			Si valor2 = 0 Entonces
				Escribir "Error, no se puede dividir por 0. Vuelva a intentar"
			Sino
				Escribir "Division: ", valor1/valor2
			FinSi
			
	FinSegun
FinAlgoritmo
