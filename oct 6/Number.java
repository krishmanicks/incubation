import java.util.*;

class Number {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String arr[] = new String[n];
		
		arr[0] = "3";
		arr[1] = "4";
		//	String s = arr[0];
		String three = "3";
		String four = "4";
		
		int i =0;
		int k = 2;
		for(i=0;k<n;i++) {
			String s = arr[i];
			arr[k++] = (s+three);
			if(k < n)
				arr[k++] = (s+four);
		}
		for(String j: arr) 
			System.out.print(j + " ");
	}
}