package vishwa.java;
import java.util.Scanner;
public class add {

	void solution(int a )
	{
		System.out.println("sum of a and b = "+ a);
	}
	
	public static void main(String[] args) {
		
		add r= new add();
		Scanner scan=new Scanner(System.in);
	for (int i=1;i<=3;i++)
	{
		System.out.println("enter value a");
		int a =scan.nextInt();
		r.solution(a);
	}
}
}