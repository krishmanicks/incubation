import java.util.*;

class Sum {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the arr length");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("enter arr ele");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int sum = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i] % 2 == 1) {
				if(arr[i-1] % 2 == 0) 
					continue;
			}
			sum += arr[i];
		}
		System.out.println("sum is " + sum);
	}
}