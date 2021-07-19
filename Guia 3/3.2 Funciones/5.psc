Algoritmo Ejercicio5
	Definir num Como Entero
	Escribir "Ingrese un numero para averiguar si es primo o no"
	Leer num
	Escribir "El numero ", num, " es ", Primate(num)
	
FinAlgoritmo
Funcion value<- Primate (num)
	Definir value Como Caracter
	Definir i,c Como Entero
	c = 0
	Segun num hacer
		1,2: value = "Primo"
		De Otro Modo:
			para i=1 Hasta num Hacer
				si num MOD i = 0 Entonces
					c = c + 1
				FinSi
			si c = 2
				value = "primo"
			Sino 
				value = "no primo"
			FinSi
			FinPara
	FinSegun
	
FinFuncion
	
	