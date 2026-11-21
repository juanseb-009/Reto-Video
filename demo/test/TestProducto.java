package com.krakedev.demo.test;
import com.krakedev.demo.*;

public class TestProducto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Producto fue asignado");
		Producto p1 = new Producto(193294,"Albion Online");
		
		System.out.println("Código: " + p1.getCodigo());
		System.out.println("Nombre: " + p1.getNombre());
		System.out.println("Descripción: " + p1.getDescripcion());
		p1.setPeso(2.5);
		System.out.println("Peso: " + p1.getPeso() + "GB");
		

	}

}
