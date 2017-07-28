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
}
