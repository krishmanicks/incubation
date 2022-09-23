import java.util.*;

class TrapingWater {
	
	static int trap(int arr[], int n) {
		
		int i=1,j=n-2;
		int sum = 0;
		int maxleft = arr[0];
		int maxright = arr[n-1];
		
		while(i<=j) {
			if(maxleft < maxright) {
				if(arr[i] >= maxleft) {
					maxleft = arr[i];
				}
				else {
					sum+= maxleft - arr[i];
				}
				i++;
			}
			else {
				if(arr[j] > maxright) {
					maxright = arr[j];
				}
				else {
					sum+= maxright - arr[j];
				}
				j--;
			}
		}
		return sum;
	} 
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(trap(arr,n));
	}
}