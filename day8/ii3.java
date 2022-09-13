import java.util.Scanner;

public class ii3 {
	
	static int t;
	static Scanner sc = new Scanner(System.in);
	
	public static int method() {
		int n, temp, sum=0;
		System.out.print("Enter no. of Students: ");
		n = sc.nextInt();
		
		int [] a = new int[n];
		int [] b = new int[n];
		
		for(int i=0; i<n; i++) 
			a[i] = sc.nextInt();
		
		for(int i=0; i<n; i++) 
			b[i] = sc.nextInt();
		temp = 0;
		
		for(int i=0; i<n; i++){
			if(a[i]-temp >= b[i])
				sum++;
			temp = a[i];
		}
		
		return sum;
	}
	
	public static void main(String args[]) {
		
		
		System.out.print("Enter no. of testcase value: ");
		t = sc.nextInt();
		//int arr[] = new int [t];
		
		for(int i=0; i<t; i++) 
			System.out.println(method() + " ");
		
		// for(int i: arr) 
			// System.out.println(i);
		
	}
}