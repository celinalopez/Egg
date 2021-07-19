Algoritmo Ejercicio1
	Definir num1, num2, n Como Entero
	Escribir "Ingrese dos numeros"
	n=0
	Leer num1,num2
	Numeros(n,num1,num2)
	Escribir "num1: ",num1, " num2: ", num2
FinAlgoritmo
SubProceso Numeros (n Por Referencia, num1 por referencia, num2 por referencia)
	n= num1
	num1 = num2
	num2 = n
	
FinSubProceso
	