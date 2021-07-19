Algoritmo Ejercicio3
	Definir divisor, dividendo, residuo, cociente Como Entero
	Escribir "Ingrese primero el numero a dividir y despues el divisor"
	Leer dividendo, divisor
	cociente = 0
	residuo = 0
	division(dividendo, divisor,residuo,cociente)
	Escribir "El resultado de la divison es: ", cociente
	Escribir "El resto es: ", residuo
	
FinAlgoritmo

SubProceso division (dividendo por valor, divisor Por Referencia, residuo Por referencia, cociente Por Referencia)
	residuo = dividendo - divisor
	cociente = cociente + 1
	Hacer
		residuo = residuo - divisor
		cociente = cociente + 1
	Mientras Que residuo > divisor
FinSubProceso
	