package com.horizon.lab_1.model;

import java.util.ArrayList;

public class ProductList {

	private final ArrayList<Product> products;

	public ProductList() {
		this.products = new ArrayList<>();
		products.add(new Product("Banana", 1.0, 0.17));
		products.add(new Product("Apple", 1.5, 0.15));
		products.add(new Product("Orange", 1.2, 0.12));
		products.add(new Product("Pineapple", 2.0, 0.21));
		products.add(new Product("Mango", 2.5, 0.2));
		products.add(new Product("Peach", 1.8, 0.25));
	}

	public Product findByName(String name) {
		for (Product product : products) {
			if (product.getName().equals(name)) return product;
		}
		return null;
	}

	public ArrayList<Product> getProducts() { return products; }
}
