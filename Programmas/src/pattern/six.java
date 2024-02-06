package pattern;

public class six {

	public static void main(String[] args) {
		int n=5;
		
		for(int j=0;j<n;j++)
		{
	    for(int i=0;i<n;i++) 
		
	    if(i==j||i==0||j==0||i+j==n-1) {
	    	System.out.print("* ");
	       
	    }
	    else {
	    	System.out.print("  ");
	    }
	    System.out.println();
		}	

	}
}
