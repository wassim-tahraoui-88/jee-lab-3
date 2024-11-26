package com.horizon.lab_1.model;

public enum Engine {
	GOOGLE("https://www.google.com/search?q="),
	BING("https://www.bing.com/search?q="),
	ASK("https://fr.ask.com/web?q=");

	private final String url;

	Engine(String url) { this.url = url; }

	public String getUrl() { return url; }
}
