package com;

public class display {
void exc() throws Exception {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		Thread.sleep(2000);
	}
}
public static void main(String[] args) {
	display s=new display();
	try {
			s.exc();
	}
	catch (Exception e) {
		System.out.println();
	}
}
}
