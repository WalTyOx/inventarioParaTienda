package com.clases;

public class Televisor extends ProductoElectrodomestico {
	
	double pulgadas;
	int resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, double pulgadas, int resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre Producto: " + this.nombre);
		System.out.println("Precio Producto: " + this.precio);
		System.out.println("Cantidad Disponible: " + this.cantidadDisponible);
		System.out.println("Tamaño Pantalla: " + this.pulgadas);
		System.out.println("Resolución: "+this.resolucion);
		System.out.println("----------------------");
	}
}
