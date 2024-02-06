package vishwa.java;
import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		try {
		System.out.println("Enter values of a");
		long  a=obj.nextLong();
		System.out.println("Enter values of b");
		long  b=obj.nextLong();
		System.out.println("Sum of a and b = "+"\n"+(a+b));
		System.out.println("Mulptiplication of a and b = "+"\n"+(a*b));
		System.out.println("Substration of a and b = "+"\n"+(a-b));
		System.out.println("Division of a and b = "+"\n"+(a/b)
				);
		}
		catch (Exception e) {
			System.out.println(" Enter valid input");
			System.err.println(e);
		}
		
		obj.close();
	}

}
