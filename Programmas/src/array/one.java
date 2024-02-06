package array;

import java.util.Scanner;

public class one {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter elements");
	int size=s.nextInt();
	int arr[]=new int[size];
	System.out.println("enter no of elemts");

	for(int i=0;i<=size;i++) {
		arr[i]=s.nextInt();
		System.out.println(arr[i]);
	}
	
			}
}
