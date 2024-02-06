package com;

public class student implements Comparable<student>{
int id;
String name;
student(int id,String name){
	this.name=name;
	this.id=id;
}
public String toString() {
	return id+" "+name ;
}
public int compareTo(student S) {
	//return this.name.compareTo(S.name);
	return this.id-S.id;
}
}
  