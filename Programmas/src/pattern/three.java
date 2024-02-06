package pattern;

public class three {
	public static void main(String[] args) {
		int row=4;
		int col=4;
		for(int j=0;j<row;j++) {
	    for(int i=0;i<col;i++) 
		
	    if(i==j||i+j==row-1) {
	    	System.out.print("* ");
	       
	    }
	    else {
	    	System.out.print("  ");
	    }
	    System.out.println();
		}	

	}
}
