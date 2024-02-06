package logicaltwo;

public class highdigit {
public static void main(String[] args) {
	int n=34575;
	int max=n%10;
	while(n!=0) {
		 int rem=n%10;
		 if(rem>max)
			 max=n%10;
		 n=n/10;
		
	}
	System.out.println(max);
}
}
