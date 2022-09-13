import java.util.*;

class Chocolates {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the no. of students:");
		int m = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		int j = m-1,i=0;
		
		while(j<n) {
			if((arr[j] - arr[i]) < min) {
				min = arr[j] - arr[i];
			}
			j++;
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("\n" + min);
	}
}