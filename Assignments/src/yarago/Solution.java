package yarago;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	AssignTwo t= new Calsi();
	Scanner s =new Scanner(System.in);
	while(true) {
		System.out.println("1:Add\\n2:Sub\\n3:Mutliplication\\n4:Division ");
		
		System.out.println("enter Choise");
		int choise=s.nextInt();
	
	switch (choise) {
	case 1:
		System.out.println("Enter values of a");
		double  a=s.nextLong();
		System.out.println("Enter values of b");
		double  b=s.nextLong();
		t.Add(a, b);
	break;
	case 2:
		System.out.println("Enter values of a");
		double  c=s.nextLong();
		System.out.println("Enter values of b");
		double  d=s.nextLong();
		t.sub(c, d);
	break;
	case 3:
		System.out.println("Enter values of a");
		double  e=s.nextLong();
		System.out.println("Enter values of b");
		double  f=s.nextLong();
		t.multi(e, f);
	break;
	case 4:
		System.out.println("Enter values of a");
		double  g=s.nextLong();
		System.out.println("Enter values of b");
		double  h=s.nextLong();
		t.div(g, h);
	break;

	default:
		System.out.println("enter valid choise");
	break;
	}
}
}
}