package rules;

import enums.Bearing;

public class BearingRotation {
	
	public Bearing leftOf(Bearing bearing) {
		if (bearing == Bearing.WEST) return Bearing.SOUTH;
		return Bearing.WEST;
	}

}
