package com;

import java.util.Comparator;

public class SortByName implements Comparator<SET> {
	public int compare(SET X,SET Y){
		return X.name.compareTo(Y.name);
	}

}
