package controladorpoo1;

import poo1.Coche;

public class Main {
	 public static void main(String[] args) {
	 // Crear un coche usando el constructor con argumentos
	 Coche miCoche = new Coche("Toyota", "Corolla", 18500.00);
	 System.out.println("Información del Coche:");
	 System.out.println(miCoche.toString());

	 // Calcular y mostrar el precio final
	 double precioFinal = miCoche.calcularPrecioVentaFinal();
	 System.out.printf("Precio de Venta Final (con IVA del 21%%): %.2f€%n",
	precioFinal);

	 System.out.println("-------------------------");
	 // Crear otro coche usando el constructor por defecto y luego setters
	 Coche cocheNuevo = new Coche();
	 cocheNuevo.setMarca("Ford");
	 cocheNuevo.setModelo("Focus"); 
	 cocheNuevo.setPrecioBase(15000.00);
	 System.out.println("Información del Coche Nuevo:");
	 System.out.println(cocheNuevo.toString());

	 // Calcular y mostrar el precio final
	 double precioFinalNuevo = cocheNuevo.calcularPrecioVentaFinal();
	 System.out.printf("Precio de Venta Final (con IVA del 21%%): %.2f€%n",
	precioFinalNuevo);
	 }
	} 

