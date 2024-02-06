package pattern;

public class four {
	public static void main(String[] args) {
		int row=4;
		int col=4;
		for(int j=0;j<row;j++) {
	    for(int i=0;i<col;i++) 
		
	    if(i+j==row-1||i==row-1||j==col-1) {
	    	System.out.print("* ");
	       
	    }
	    else {
	    	System.out.print("  ");
	    }
	    System.out.println();
		}	

	}
}
