package com.codizer.pruebas;

public class Carro {
	
	private String marca;
	private String color;
	private int model;
	private double peso;
		
	public Carro(){
	}
	
	public Carro(String color){
		this.color = color;
	}

	public Carro(String marca, String color, int model, double peso) {
		this.marca = marca;
		this.color = color;
		this.model = model;
		this.peso = peso;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", color=" + color + ", model=" + model + ", peso=" + peso + "]";
	}
	
}
