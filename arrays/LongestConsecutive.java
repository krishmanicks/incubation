import java.util.*;

class LongestConsecutive
{

	static int findLongest(int arr[], int n)
	{
		Arrays.sort(arr);
		int count = 0;
		int max = 0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] + 1 == arr[i+1]) {
				count++;
				if(count > max ) {
					max = count;
				}
			}
			else
			{
				count = 0;
			}
		}
		return max+1;
	}
	
	public static void main (String[] args)
	{
		int arr[] = {49,1,3,200,199,198,194,195,196,197,2,4,70,5};
		int n = arr.length;
		
		System.out.println(findLongest(arr,n));
	
	}		
}
