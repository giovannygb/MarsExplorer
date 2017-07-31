package com.contaazul.marsexplorer.rules;

public class Boundary {
	private Integer min;
	private Integer max;
	
	public Boundary(Integer min, Integer max) {
		super();
		this.min = min;
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}
}
