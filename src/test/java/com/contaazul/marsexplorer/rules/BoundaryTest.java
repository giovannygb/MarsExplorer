package com.contaazul.marsexplorer.rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoundaryTest {
	private Boundary boundary;
	
	@Before
	public void setupBoundary() throws Exception {
		boundary = new Boundary(0, 5);
	}
	
	@Test
	public void boundarySetMinValue() throws Exception {
		boundary.setMin(1);
		
		assertThat(boundary.getMin(), is(1));
	}
	
	@Test
	public void boundarySetMaxValue() throws Exception {
		boundary.setMax(1);
		
		assertThat(boundary.getMax(), is(1));
	}
}
