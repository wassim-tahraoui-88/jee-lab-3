package com.horizon.lab_1.model;

public class Product {
	private String name;
	private double priceHT;
	private double tva;

	public Product(String name, double priceHT, double tva) {
		this.name = name;
		this.priceHT = priceHT;
		this.tva = tva;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public double getPriceHT() { return priceHT; }
	public void setPriceHT(double priceHT) { this.priceHT = priceHT; }

	public double getTva() { return tva; }
	public void setTva(double tva) { this.tva = tva; }
}
