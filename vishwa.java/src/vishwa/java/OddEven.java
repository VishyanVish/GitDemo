package vishwa.java;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scan.nextInt();
		
		{
		if (a%2==0)
		{
			System.out.println("Given number is Even and next 100 consicatives are");
			for (int a1=a+2;a1<=a+100;a1=a1+2)
			{
				System.out.println(a1);
			
			}
		}
		else
		{ System.out.println("Given number is Odd next 100 consicatives are");
		for (int a1=a+2;a1<=a+100;a1=a1+2)
		{
			System.out.println(a1);
		}
		scan.close();
	}
		}
	
	}
}

