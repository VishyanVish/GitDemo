package array;

public class sort {
public static void main(String[] args) {
	int arr[]=new int[] {10,20,540,5,1,4,23};
	int n=arr.length;
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1;j++)
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr [j]=arr[j+1];
				arr[j+1]=temp;
			
			}
			
		for( int obj:arr)
			System.out.println(obj);

}
}
