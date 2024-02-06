package com;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
	public int compare(Employee X,Employee Y) {
		return (int) (X.salary-Y.salary);
}
}