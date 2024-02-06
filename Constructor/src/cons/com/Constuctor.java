package cons.com;

public class Constuctor {
	int cost;
  Constuctor(int a) {
		//System.out.println(cost);
		cost=a;
	}
public static void main(String[] args) {
	System.out.println("Start");
	//Scanner scan=new Scanner(System.in);

	Constuctor d1=new Constuctor(23);
	Constuctor d2=new Constuctor(34);
	System.out.println(d1.cost);
	System.out.println(d2.cost);
}
}
