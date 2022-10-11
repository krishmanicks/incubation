import java.util.*;

class Threshold {
	
	static int sum = 0;
	public static void find(int ans, int thresh) {
		if(ans%thresh == 0) {
			sum = sum + (ans/thresh);
		}
		else if(ans < thresh) 
			sum = sum + 1;
		else
			sum = sum + ((ans/thresh) + 1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int thresh = sc.nextInt();

		for(int i=0;i<n;i++) {
			find(arr[i], thresh);
		}
		
		System.out.println("output " + sum);
	}
}