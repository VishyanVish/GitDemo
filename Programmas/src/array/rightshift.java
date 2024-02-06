package array;

public class rightshift {
public static void main(String[] args) {
	int arr[]=new int[] {10,20,540,5,1,4,23};
	
	int n=arr.length;
	int temp=arr[n-1];
	
	for(int i=n-1;i>=1;i--) 
		
		arr[i]=arr[i-1];
		arr[0]=temp;
	for(int i:arr)
		System.out.println(i);
	}
	

	

}
