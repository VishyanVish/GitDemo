package pattern;

public class seven {

	public static void main(String[] args) {
		int n=4;
		
		for(int j=0;j<n;j++)
		{
	    for(int i=0;i<n;i++) 
		
	    if(i==j||i+j==n-1) {
	    	System.out.print("  ");
	       
	    }
	    else {
	    	System.out.print("* ");
	    }
	    System.out.println();
		}	

	}
}
