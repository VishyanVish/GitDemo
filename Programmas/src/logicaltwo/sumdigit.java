package logicaltwo;

public class sumdigit {
public static void main(String[] args) {
	int n=12;
int	sum=0;
while(n!=0)
{
	int rem=n%10;
	sum=sum+rem;
	n=n/10;//to remove last digits after loop
}
System.out.println(sum);
}
}
