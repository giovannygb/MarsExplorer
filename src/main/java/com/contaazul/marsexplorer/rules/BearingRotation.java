package com.contaazul.marsexplorer.rules;

import com.contaazul.marsexplorer.enums.Bearing;

public class BearingRotation {
	
	public Bearing leftOf(Bearing bearing) {
		Bearing[] values = Bearing.values();
		Integer index = (bearing.ordinal() + values.length - 1) % values.length;

		return values[index];
	}
	
	public Bearing rightOf(Bearing bearing) {
		Bearing[] values = Bearing.values();
		Integer index = (bearing.ordinal() + 1) % values.length;

		return values[index];
	}

}
