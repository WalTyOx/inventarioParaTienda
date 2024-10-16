package com;

import com.clases.TiendaElectronica;

public class Aplicacion {
	public static void main(String [] args) {
		TiendaElectronica tienda = new TiendaElectronica();
		
		tienda.nuevoProducto("Producto 1", 1500.0, 10);
		tienda.nuevoProducto("Televisor 1", 3000.0, 3, 40.0, 1080);
		tienda.nuevoProducto("Computadora 1", 5000.0, 5, "Asus", 16, 12345);
		tienda.enlistarProductos();
		tienda.buscarProducto("Producto 1");
		tienda.buscarProducto("Computadora 1");
		tienda.venta("Producto 1", 5);
		tienda.venta("Televisor 1", 7);
	}
}