Algoritmo Extra5
	Definir num,i Como real
	i = 0
	num = -1
	Mientras num < 0 Hacer
		Escribir "Ingrese un numero entero positivo"
		Leer num
	FinMientras
	Mientras trunc(num) <> 0 Hacer
		num = num / 10
		i = i+1
	FinMientras
	Escribir "El numero ingresado tiene ", i, " digitos"
FinAlgoritmo
