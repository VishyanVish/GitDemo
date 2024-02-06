package com;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("C:\\\\Users\\\\ADMIN\\\\Desktop\\\\vi.txt");
		try {
			f.write("java Programing");
		}
			finally {
				f.close();
			}
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	
}
}
