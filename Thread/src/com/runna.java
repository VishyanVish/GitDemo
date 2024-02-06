package com;

public class runna implements Runnable {
public void run() {
	System.out.println("  Start");
}
public static void main(String[] args) {
	runna r=new runna();
	Thread t=new Thread(r);
	t.start();

}
}
