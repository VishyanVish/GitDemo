package com;

import java.util.Comparator;

public class EXE implements Comparator<SET> {
	public int compare(SET X,SET Y) {
		return X.age-Y.age;
	}

}
