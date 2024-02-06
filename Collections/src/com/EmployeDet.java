package com;

import java.util.TreeSet;

public class EmployeDet {
public static void main(String[] args) {
	Employee E1=new Employee(2,"Vishwa",354.77);
	Employee E2=new Employee(1,"Rishwa",356.10);
	Employee E3=new Employee(3,"Aishwa",354.30);
SortById S=new SortById();
SortBySalary SS=new SortBySalary();
	TreeSet<Employee> T=new TreeSet<>(S);
			T.add(E1);
	T.add(E2);
	T.add(E3);
	for(Employee obj:T) {
		System.out.println(obj);
	}
}
}
