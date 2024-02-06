package logicaltwo;

public class palindrome {
public static void main(String[] args) {
	int n=3113,rev=0,m=n;
	while(n!=0) {
		  int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev==m?"palindrome":"not palindrom");
	
}
}
