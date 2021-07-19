Algoritmo ConvertorDeMedidas
	
	Definir metros, centimetros, milimetros, pulgadas Como Real
	
	Escribir "Ingrese la cantidad de metros a convertir"
	Leer metros 
	
	centimetros = metros * 100
	milimetros = metros * 1000
	pulgadas = centimetros / 2.54
	
	Escribir "| centimetros: ", centimetros, " | milimetros: ", milimetros, " | pulgadas: ", pulgadas, " |"
FinAlgoritmo
