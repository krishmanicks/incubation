import java.util.Scanner;

public class ii2 {
	
	static int s;
	static Scanner sc = new Scanner(System.in);
	
	public static String method() {
		
		int n, count=0, mid;
		String ret="YES";
		System.out.print("Enter no. of heights: ");
		n = sc.nextInt();
		
		int [] a = new int[n];
		mid = n/2;
		
		for(int i=0; i<n; i++){
			count = (i<=mid) ? count+1 : count-1;
			a[i] = sc.nextInt();
			if(count!=a[i])
				ret = "NO";
			//System.out.println("---" + count);
		}
		if(n%2==0) ret = "NO";
		
		return ret;
	}
	
	public static void main(String args[]) {		
		
		System.out.print("Enter no. of strips: ");
		s = sc.nextInt();
		String arr[] = new String [s];
		
		for(int i=0; i<s; i++) 
			arr[i] = method();
		
		for(String i: arr)
			System.out.println(i);
		
	}
}