import java.util.*;

class Difference {
	
	public static void diff(int arr[], int n) {
		
		if(n <= 2) {
				System.out.println("0");
				return;
			}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			System.out.println("Enter the arr size");
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			diff(arr,n);
			
		}
	}
}