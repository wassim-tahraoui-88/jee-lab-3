package com.horizon.lab_3.model;

public enum Theme {
	DARK("dark"), LIGHT("light");

	private final String name;

	Theme(String name) { this.name = name; }

	public String getName() { return name; }
}
