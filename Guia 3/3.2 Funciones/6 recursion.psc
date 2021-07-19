Algoritmo Ejercicio6
	Definir num Como Entero
	Escribir "Ingrese el num para calcular la suma de todos los numeros anteriores"
	leer num
	Escribir "Resultado: ", Sumatoria(num)
FinAlgoritmo

Funcion resultado <- Sumatoria(num)
	Definir resultado Como Entero
	Si num = 0 o num = 1 Entonces
		resultado = 1
	SiNo
		resultado = num + Sumatoria(num-1)
	FinSi
FinFuncion
	