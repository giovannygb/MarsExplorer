package com.contaazul.marsexplorer.rules;

import org.junit.Before;

public class TerrainTest {
	private Terrain terrain;
	
	@Before
	public void setupTerrain() throws Exception {
		terrain = new Terrain(5, 5);
	}
}
