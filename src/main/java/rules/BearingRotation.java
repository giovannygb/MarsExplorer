package rules;

import enums.Bearing;

public class BearingRotation {
	
	public Bearing leftOf(Bearing bearing) {
		Bearing[] values = Bearing.values();
		Integer index = (bearing.ordinal() + values.length - 1) % values.length;

		return values[index];
	}
	
	public Bearing rightOf(Bearing bearing) {
		if (bearing == Bearing.EAST) return Bearing.SOUTH;
		if (bearing == Bearing.SOUTH) return Bearing.WEST;
		return Bearing.EAST;
	}

}
