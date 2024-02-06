package String;

public class three {
public static void main(String[] args) {
	String s="Bangalore";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
			System.out.println(c);
		}
		
	}
}
}
