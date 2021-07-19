Algoritmo sin_titulo
	Definir num1,num2 Como Entero
	Escribir "Ingrese un numero y a continuacion un multiplo del el"
	Leer num1, num2
	Escribir EsMultiplo(num1,num2)
	
FinAlgoritmo
Funcion value <- EsMultiplo(num1,num2)
	Definir value Como Logico
	Si num2 MOD num1 == 0 Entonces
		value = Verdadero
	SiNo
		value = Falso
	FinSi
FinFuncion
	