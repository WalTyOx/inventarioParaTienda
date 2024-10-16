package com.clases;

public class ProductoElectrodomestico {
	public String nombre;
	public double precio;
	public int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.cantidadDisponible = cantidadDisponible;
		this.precio = precio;
	}
	
	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre Producto: " + this.nombre);
		System.out.println("Precio Producto: " + this.precio);
		System.out.println("Cantidad Disponible: " + this.cantidadDisponible);
		System.out.println("----------------------");
	}

}
