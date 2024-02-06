package com;

public class Myntra {
 void  Purchase(String Name)
  {
	  System.out.println(Name);
  }
 void Purchase(int id) {
	 System.out.println(id);
 }
 public static void main(String[] args) {
	Myntra m= new Myntra();
	m.Purchase(123);
	m.Purchase("vishwa");
}
}
