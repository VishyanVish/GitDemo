package String;

public class six {
	public static void main(String[] args) {
		String s="ABC";
		String rev="";
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i-- ) {
			rev=rev+ch[i];
		
		}
		if(rev.equals(s))
		System.out.println(s);
		else
			System.out.println("not pali");

	}
	
}
