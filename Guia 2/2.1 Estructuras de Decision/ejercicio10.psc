Algoritmo Igualdad
	Definir palabra Como Caracter
	Escribir "Ingresa una palabra que tenga la primera letra igual a la ultima"
	Leer palabra
	
	Si Subcadena(palabra,0,0) = Subcadena(palabra, Longitud(palabra)-1, Longitud(palabra)) Entonces
		Escribir "Correcto"
	Sino 
		Escribir "Incorrecto"
	FinSi
FinAlgoritmo
