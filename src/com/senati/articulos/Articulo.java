package com.senati.articulos;

public class Articulo {
	//Attribute
	int codigo;
	String descripcion;
	String marca;
	float precio;

	//Constructor
	public Articulo() {}
	
	public Articulo(int codigo, String descripcion, String marca, float precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;	
	}
	
	//Getters y Setters
	public int getCodigo() {
	    return codigo;
	}

	public void setCodigo(int codigo) {
	    this.codigo = codigo;
	}

	public String getDescripcion() {
	    return descripcion;
	}

	public void setDescripcion(String descripcion) {
	    this.descripcion = descripcion;
	}

	public String getMarca() {
	    return marca;
	}

	public void setMarca(String marca) {
	    this.marca = marca;
	}

	public float getPrecio() {
	    return precio;
	}

	public void setPrecio(float precio) {
	    this.precio = precio;
	}
	
	public String toString1() {
		return Integer.toString(this.codigo) + " " + this.descripcion + " " + this.marca + " " + Float.toString(this.precio);
	}
	
	public String toString2() {
		return this.descripcion + " " + this.marca;
	}

	public String toString3() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precio=" + precio
				+ "]";
	}
	
	
	
	
	
	
}
