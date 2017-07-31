package com.contaazul.marsexplorer.rules;

import com.contaazul.marsexplorer.model.Robot;

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
	
	public boolean within(Robot robot) {
		return widthBoundary.within(robot.getX()) && heightBoundary.within(robot.getY());
	}
}
