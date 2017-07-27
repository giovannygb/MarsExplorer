package com.contaazul.marsexplorer.model;

public class Robot {
	private Integer x;
	private Integer y;
	private String bearing;
	
	public Robot() {
		this(0, 0, "N");
	}
	
	public Robot(Integer x, Integer y, String bearing) {
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
	
	public String getBearing() {
		return bearing;
	}
	
	public void setBearing(String bearing) {
		this.bearing = bearing;
	}
}
