package com;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Stream;

public class LinkedMap {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> l=new LinkedHashMap<>();
	l.put(1, "visshwa");
	l.put(4, "dfd");
	l.put(3, "dfdf");
	System.out.println(l);
	Set<Integer>s=l.keySet();
	
	for(int key:s) {
	System.out.println(key+"--"+l.get(key));
	
	Stream.of("vis").filter(r->r.length()>3).forEach(f->System.out.println(f));
}
}
}