package runtime;

public class Bike extends Vehicle {
	void start() {
		System.out.println("Bike started");
	}
	public static void main(String[] args) {
		
	Vehicle v= new car();
	v.start();
	Vehicle v2=new Bike()
			;
	v2.start();
}
}
