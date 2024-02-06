package Storing;

public class Singleton {
	private static Singleton S=null;
 private Singleton() {
	 System.out.println("object got created");
 }
 public  static void creatObject() {
	if(S==null) {
		S=new Singleton();
	}
	else {
		System.out.println("cannot creat object");
	}
	 
 }
}
