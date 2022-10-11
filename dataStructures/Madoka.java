import java.util.*;

class Madoka {
	
	public static void family(int arr[], int n) {
		Arrays.sort(arr);
		
		int sum=0;
		int per=0;

		for(int i=0;i<n;i++) {
			
			if(arr[i] != i+1) {
				if(i%2 == 0)
					System.out.println("first");
				else
					System.out.println("second");
				return;
			}
			sum += arr[i];
			per+=i+1;
		}
		if((per-sum) % 2 != 0)
			System.out.println("First\n");
		else
			System.out.println("Second\n");
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
			
			family(arr,n);
		}
	}
}