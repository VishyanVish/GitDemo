package pattern;

public class five {
	public static void main(String[] args) {
		int n=4;
		
		for(int j=0;j<n;j++)
		{
	    for(int i=0;i<n;i++) 
		
	    if(i+j==n-1||j==n-1||j==0) {
	    	System.out.print("* ");
	       
	    }
	    else {
	    	System.out.print("  ");
	    }
	    System.out.println();
		}	

	}
}
