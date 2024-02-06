package com;

import java.util.HashMap;

public class Map {
public static void main(String[] args) {
	HashMap m=new HashMap<>();
	m.put(1, 100);
	m.put(2, "VIshwa");
	m.put(5, 100);
	System.out.println(m);
	System.out.println("------------------------------------------");

System.out.println(m.get(5));
System.out.println(m.containsKey(3));
System.out.println(m.keySet());
}

}
