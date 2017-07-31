package com.contaazul.marsexplorer.rules;

public class Terrain {
	private Boundary widthBoundary;
	private Boundary heightBoundary;
	
	public Terrain(Integer width, Integer height) {
		this(new Boundary(0, width), new Boundary(0, height));
	}
	
	public Terrain(Boundary widthBoundary, Boundary heightBoundary) {
		this.widthBoundary = widthBoundary;
		this.heightBoundary = heightBoundary;
	}
}
