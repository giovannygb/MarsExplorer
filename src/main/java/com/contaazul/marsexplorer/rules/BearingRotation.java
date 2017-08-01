package com.contaazul.marsexplorer.rules;

import com.contaazul.marsexplorer.enums.Bearing;

public class BearingRotation {
	
	public Bearing leftOf(Bearing bearing) {
		return rotate(bearing, -1);
	}
	
	public Bearing rightOf(Bearing bearing) {
		return rotate(bearing, 1);
	}
	
	public Bearing rotate(Bearing bearing, Integer offset) {
		Bearing[] values = Bearing.values();
		Integer index = (bearing.ordinal() + values.length + offset) % values.length;

		return values[index];
	}

}
