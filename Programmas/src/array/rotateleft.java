package array;

public class rotateleft {
	public static void main(String[] args) {
		int arr[]=new int[] {10,20,540,5,1,4,23};
		
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
			arr[i]=arr[i+1];
		arr[n-1]=temp;
		for(int i:arr)
			System.out.println(i);
		}
}
