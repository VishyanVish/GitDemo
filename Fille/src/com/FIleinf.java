package com;

import java.io.File;

public class FIleinf {
public static void main(String[] args) {
	File f=new File("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\vi.txt");
	if(f.exists()) {
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.length());
		System.out.println(f.delete());
	}
	else {
		System.out.println("file not exsist");
	}
}
}
