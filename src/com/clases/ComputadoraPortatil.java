package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	
	String marca;
	int ram;
	int numSerie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int ram, int numSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.ram = ram;
		this.numSerie = numSerie;	
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre Producto: " + this.nombre);
		System.out.println("Precio Producto: " + this.precio);
		System.out.println("Cantidad Disponible: " + this.cantidadDisponible);
		System.out.println("Marca Producto: " + this.marca);
		System.out.println("Memoria RAM: " + this.ram + "GB");
		System.out.println("Numero de Serie: " + this.numSerie);
		System.out.println("----------------------");
	}
}
