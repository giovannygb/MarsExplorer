package com.contaazul.marsexplorer.rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.contaazul.marsexplorer.model.Robot;

public class TerrainTest {
	private Terrain terrain;
	private Robot robot;
	
	@Before
	public void setupTerrain() throws Exception {
		terrain = new Terrain(5, 5);
		robot = new Robot();
	}
	
	@Test
	public void robotAt00ShouldBeWithinBounds() throws Exception {
		assertThat(terrain.within(robot), is(true));
	}
}
