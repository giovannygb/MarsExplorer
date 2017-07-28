package rules;

import enums.Bearing;

public class BearingRotation {
	
	public Bearing leftOf(Bearing bearing) {
		if (bearing == Bearing.WEST) return Bearing.SOUTH;
		if (bearing == Bearing.SOUTH) return Bearing.EAST;
		if (bearing == Bearing.EAST) return Bearing.NORTH;
		return Bearing.WEST;
	}

}
