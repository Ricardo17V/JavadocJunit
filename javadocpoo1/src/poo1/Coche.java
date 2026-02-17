package poo1;

public class Coche {
 // Atributos
 private String marca;
 private String modelo;
 private double precioBase;
 // Constante para el IVA (21%)
 private static final double IVA = 0.21;
 // Constructor 1: Constructor por defecto (sin argumentos)
 public Coche() {
 this.marca = "Desconocida";
 this.modelo = "Desconocido";
 this.precioBase = 0.0;
 }
 // Constructor 2: Constructor con todos los argumentos
 public Coche(String marca, String modelo, double precioBase) {
 this.marca = marca;
 this.modelo = modelo;
 this.precioBase = precioBase;
 }
 // Getters
 public String getMarca() {
 return marca;
 }
 public String getModelo() {
 return modelo;
 }
 public double getPrecioBase() {
 return precioBase;
 }
 // Setters 
 public void setMarca(String marca) {
	 this.marca = marca;
	 }
	 public void setModelo(String modelo) {
	 this.modelo = modelo;
	 }
	 public void setPrecioBase(double precioBase) {
	 this.precioBase = precioBase;
	 }
	 // Método para calcular el precio de venta final con IVA
	 public double calcularPrecioVentaFinal() {
	 // Fórmula: precioBase + (precioBase * IVA)
	 return this.precioBase * (1 + IVA);
	 }
	 public String toString() {
	 return "Coche [Marca=" + marca + ", Modelo=" + modelo + ", Precio Base=" +
	precioBase + "€]";
	 }
	} 
