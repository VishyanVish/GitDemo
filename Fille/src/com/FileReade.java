package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReade {
	public static void main(String[] args) throws IOException {
		
	
FileReader f=new FileReader("C:\\Users\\ADMIN\\Desktop\\\\vi.txt");
int i;
while((i=f.read())!=-1) {
System.out.print((char)i);
}
}
}