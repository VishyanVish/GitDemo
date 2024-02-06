package array;

public class unique {
public static void main(String[] args) {
	int arr[]=new int[] {10,2,5,5,1,4,4};
	
	int n=arr.length;
	for(int i=0;i<n;i++) 
	{
		int count=0;
		for(int j=i+1;j<n;j++)
		{
			
	if(arr[i]==arr[j]) {
				arr[j]='\n';//(char)145
	          count++;
		}

}
	if(count==0 && arr[i]!='\n') //(char)145
	{
		System.out.println(arr[i]);
	}
	
		
	
}
}}