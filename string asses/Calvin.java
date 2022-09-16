import java.util.*;

class Calvin {
	
	static int maxi(int arr[],int n, int k) {
		int sum = 0;
		int i = 0;
		k--;
		for(i=k;i<n-2;) {
			if(arr[i+1] > 0) {
				sum += arr[i+1];
				i = i+1;
			}
			else if(arr[i+1] > arr[i+2]) {
				sum += arr[i+1];
				i = i+1;
			}
			else {
				sum += arr[i+2];
				i+=2;
			}
			if(i<n-1) {
				sum += arr[n-1];
				i++;
			}
		}
		
		for(int m=i;m>=2;) {
			if(arr[m-1] > 0) {
				sum+= arr[m-1];
				m = m-1;
			}
			else if(arr[m-1] > arr[m-2]) {
				sum += arr[m-1];
				m = m-1;
			}
			else {
				sum += arr[m-2];
				m-=2;
			}
			if(m == 1) {
				sum += arr[0];
			}
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N and k");
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println("Enter the arr elements");
		int arr[] = new int[n];
		for(int j=0;j<n;j++) {
			arr[j] = sc.nextInt();
		}
		
		System.out.println("the sum is: " + maxi(arr,n,k));
}

}