import java.util.Scanner;

public class ii1 {
	
	static int t;
	static Scanner sc = new Scanner(System.in);
	
	public static String method() {
		
		int n, c, sum=0;
		System.out.print("Enter no. of elephants: ");
		n = sc.nextInt();
		System.out.print("Enter no. of candies: ");
		c = sc.nextInt();
		int [] a = new int[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		return (sum<=c) ? "YES" : "NO";
	}
	
	public static void main(String args[]) {
		
		
		System.out.print("Enter no. of testcase value: ");
		t = sc.nextInt();
		String arr[] = new String [t];
		
		for(int i=0; i<t; i++) 
			arr[i] = method();
		
		for(String i: arr) 
			System.out.println(i);
		
	}
}