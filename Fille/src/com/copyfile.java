package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfile {
public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\vi.txt");
	FileOutputStream r=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\si.txt");
	int n;
	while((n=f.read())!=-1) {
		r.write((char)n);
		
	}
}
}