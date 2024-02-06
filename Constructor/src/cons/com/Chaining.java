package cons.com;

public class Chaining {
	Chaining ()
   {
	   this(10);
		System.out.println(1);
   }
	
	Chaining(int a){
		System.out.println(2);
	}
	public static void main(String[] args) {
		System.out.println("start");
		new Chaining();
		System.out.println("END");
	}
	
}


