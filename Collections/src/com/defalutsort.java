package com;

import java.util.TreeSet;

public class defalutsort implements Comparable<defalutsort>{
int cost;
public defalutsort(int cost) {
	this.cost=cost;
}
public String toString() {
	return "cost"+ cost;
}
public int compareTo(defalutsort f) {
	return this.cost-f.cost;
}

public static void main(String[] args) {
	defalutsort d=new defalutsort(200);
	defalutsort d1=new defalutsort(100);
	TreeSet<defalutsort> t=new TreeSet<>();
	t.add(d);
	t.add(d1);
	System.out.println(t);
}
}
