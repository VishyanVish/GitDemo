package array;

public class two {
public static void main(String[] args) {
	int size=5;
	
	int a[]= {10,20,30,40,50};
	int b[]=new int[a.length];
	
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
		System.out.println(b[i]);
	}
}
}
