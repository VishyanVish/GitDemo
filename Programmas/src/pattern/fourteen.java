package pattern;

public class fourteen {
	public static void main(String[] args) {

		int n=4;
			
			for(int j=n;j>=-n;j--)
			{
		    for(int i=n;i>=Math.abs(j);i--) 
		    	System.out.print("*  ");
		    System.out.println();
		}
			
}
}
