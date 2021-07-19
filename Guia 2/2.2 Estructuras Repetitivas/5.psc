Algoritmo Ejercicio5
	Definir num,contador,i,mayor,menor Como Entero
	Escribir "ingresa numeros enteros. Para finalizar ingresa el numero 0"
	contador = -1
	i=0
	mayor =0 
	menor = 0
	Hacer
		leer num
		contador= contador + 1
		i = num + i
		si num > mayor Entonces
			mayor = num
			si menor = 0 Entonces
				menor = num
			FinSi
		FinSi
		
		si num < menor y num <> 0 Entonces
			menor = num
		FinSi
	Mientras Que num <> 0
	
	Escribir "El mayor numero ingresado es: ",mayor
	Escribir "el menor numero ingresado es: ",menor
	Escribir "el promedio entre los numeros ingresados es de: ", i/contador
FinAlgoritmo
