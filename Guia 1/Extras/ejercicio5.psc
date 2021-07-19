Algoritmo ComparadorPrecios
	
	Definir precioInicial, precioFinal, porcentaje  Como Real
	
	Escribir "Ingresa el precio del producto a principio de año"
	Leer precioInicial
	Escribir "Ingresa el precio del producto a fin de año"
	Leer precioFinal
	
	porcentaje = ((precioFinal - precioInicial) * 100) / precioInicial
	
	Escribir "El producto aumentó un ", porcentaje, "%"
	
	
FinAlgoritmo
