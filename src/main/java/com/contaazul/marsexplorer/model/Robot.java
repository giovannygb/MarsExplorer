package com.contaazul.marsexplorer.model;

import com.contaazul.marsexplorer.enums.Bearing;

public class Robot {
	private Integer x;
	private Integer y;
	private Bearing bearing;
	
	public Robot() {
		this(0, 0, Bearing.NORTH);
	}
	
	public Robot(Integer x, Integer y, Bearing bearing) {
		super();
		
		this.x = x;
		this.y = y;
		this.bearing = bearing;
	}

	public Integer getX() {
		return x;
	}
	
	public void setX(Integer x) {
		this.x = x;
	}
	
	public Integer getY() {
		return y;
	}
	
	public void setY(Integer y) {
		this.y = y;
	}
	
	public Bearing getBearing() {
		return bearing;
	}
	
	public void setBearing(Bearing bearing) {
		this.bearing = bearing;
	}
}
