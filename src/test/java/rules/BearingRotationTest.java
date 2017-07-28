package rules;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

import enums.Bearing;

public class BearingRotationTest {
	private BearingRotation bearingRotation;
	@Before
	public void setupBearingRotation() throws Exception {
		bearingRotation = new BearingRotation();
	}
	
	@Test
	public void leftOfNorthIsWest() throws Exception {
		assertThat(bearingRotation.leftOf(Bearing.NORTH), is(Bearing.WEST));
	}
	
	@Test
	public void leftOfWestIsSouth() throws Exception {
		assertThat(bearingRotation.leftOf(Bearing.WEST), is(Bearing.SOUTH));
	}
	
	@Test
	public void leftOfSouthIsEast() throws Exception {
		assertThat(bearingRotation.leftOf(Bearing.SOUTH), is(Bearing.EAST));
	}
	
	@Test
	public void leftOfEastIsNorth() throws Exception {
		assertThat(bearingRotation.leftOf(Bearing.EAST), is(Bearing.NORTH));
	}
	
	@Test
	public void rightOfNorthIsEast() throws Exception {
		assertThat(bearingRotation.rightOf(Bearing.NORTH), is(Bearing.EAST));
	}
}
