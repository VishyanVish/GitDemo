package com;

import java.util.TreeSet;

public class sort {
public static void main(String[] args) {
	SET S1=new SET(22,"VISHWA");
	SET S2=new SET(21,"RAJ");
	SET S3=new SET(23,"RAM");
	EXE E=new EXE();
	SortByName name=new SortByName();
	TreeSet<SET> T=new TreeSet<SET>(name);
	T.add(S1);
	T.add(S2);
	T.add(S3);
	for(SET obj:T) {
		System.out.println(obj);
	}
}
}
