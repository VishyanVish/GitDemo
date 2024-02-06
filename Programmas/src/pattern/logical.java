package pattern;

public class logical {
public static void main(String[] args) {
	int a=40;
	int b=30;
	/* int temp=0;
 temp=a;
a=b;
b=temp;*/
	
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
	
}
}
