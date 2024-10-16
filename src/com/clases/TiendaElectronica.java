package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	
	public void nuevoProducto(String nombre, double precio, int cantidadDisponible) {
		listaDeProductos.add(new ProductoElectrodomestico(nombre, precio, cantidadDisponible));
	}
	public void nuevoProducto(String nombre, double precio, int cantidadDisponible, double pulgadas, int resolucion) {
		listaDeProductos.add(new Televisor(nombre, precio, cantidadDisponible, pulgadas, resolucion));
	}
	public void nuevoProducto(String nombre, double precio, int cantidadDisponible, String marca, int ram, int numSerie) {
		listaDeProductos.add(new ComputadoraPortatil(nombre, precio, cantidadDisponible, marca, ram, numSerie));
	}
	
	public void enlistarProductos() {
		for (int i = 0; i < listaDeProductos.size(); i++) {
			listaDeProductos.get(i).mostrarInformacion();
		}
		System.out.println();
	}
	
	public void buscarProducto(String nombre) {
		for (int i = 0; i < listaDeProductos.size(); i++) {
			if(listaDeProductos.get(i).getNombre().equals(nombre)) {
				System.out.println("Nombre buscado: '"+ nombre+ "' Coincidencia: ");
				listaDeProductos.get(i).mostrarInformacion();
			}
		}
	}
	
	public void venta(String nombre, int cantidadDisponible){
		for (int i = 0; i < listaDeProductos.size(); i++) {
			if(listaDeProductos.get(i).getNombre().equals(nombre)) {
				int cantidad = listaDeProductos.get(i).getCantidadDisponible();
				if(cantidad-cantidadDisponible >=0) {
					
				System.out.println("Se ha vendido: '"+ nombre+ "' Stock actual: "+ cantidad);
				
				listaDeProductos.get(i).setCantidadDisponible(cantidad-cantidadDisponible);
				System.out.println("Nuevo Stock: "+ listaDeProductos.get(i).getCantidadDisponible());
				}else {
					System.out.println("No hay Stock suficiente");
				}
			}
		}
	}
}
