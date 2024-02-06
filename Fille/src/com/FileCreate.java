package com;
import java.io.*;
public class FileCreate {
public static void main(String[] args) {
	File f=new File("C:\\Users\\ADMIN\\Desktop\\Si.txt");
	try {
		if (f.createNewFile()) {
			System.out.println("file created ");
		}
		else {
			System.out.println("file already exist");
		}
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}
}
