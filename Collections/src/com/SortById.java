package com;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
	public int compare(Employee X,Employee Y) {
		return X.id-Y.id;
	}
}
