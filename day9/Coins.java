import java.util.*;


class Stocks {
	
	static void calculateSpan(int arr[], int n) {
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = sc.nextInt();
		
		int[] price = new int[n];

		System.out.println("Enter array elements ");
		for(int i=0;i<n;i++)
			price[i] = sc.nextInt();
		
		calculateSpan(price,n);
	}
}