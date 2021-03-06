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

	@Test
	public void zeroShouldBeWithinBounds() throws Exception {
		assertThat(boundary.within(0), is(true));
	}
	
	@Test
	public void fiveShouldBeWithinBounds() throws Exception {
		assertThat(boundary.within(5), is(true));
	}
	
	@Test
	public void sixShouldBeOutOfBounds() throws Exception {
		assertThat(boundary.within(6), is(false));
	}
	
	@Test
	public void negOneShouldBeOutOfBounds() throws Exception {
		assertThat(boundary.within(-1), is(false));
	}
}
