package pattern;

import java.util.Scanner;

public class one {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int n=sc.nextInt();
	int row=4;
	int col=4;
	for(int j=0;j<row;j++) {
    for(int i=0;i<col;i++) 
	
    if(i==0||j==0||i==row-1||j==col-1) {
    	System.out.print("* ");
       
    }
    else {
    	System.out.print("  ");
    }
    System.out.println();
	}	
}
}
