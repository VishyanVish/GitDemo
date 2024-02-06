package com;

import java.util.TreeSet;

public class SortStu {
public static void main(String[] args) {
	student s1=new student(1,"Vishwa");
	student s2=new student(2,"RIGH");
TreeSet<student> t=new TreeSet<>();
t.add(s1);
t.add(s2);
for(student obj:t) {
System.out.println(obj);
}
}
}