package com.senati.articulos;

public class App {

	public static void main(String[] args) {
		//Instanciar
		Articulo art1 = new Articulo(1, "Televisor", "Samsung", (float) 1250.0);
		Articulo art2 = new Articulo(2, "Licuadora", "Oster", (float) 300.0);
		Articulo art3 = new Articulo(3, "Radio", "Sonny", (float) 80.0);
		
		//Imprimir
		System.out.println("(1)-" + art1.toString1());
		System.out.println("(2)- " + art2.toString2());
		System.out.println("(3)-" + art3.toString3());

	}

}
