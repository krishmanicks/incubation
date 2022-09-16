import java.util.*;

import java.util.*;

class Flight {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of cities");
		int city = sc.nextInt();
		int arr[] = new int[city+1];
		
		System.out.println("Enter the number of flights ");
		int fli = sc.nextInt();
		
			System.out.println("enter from, to and cost");
		for(int i=0;i<fli;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			
			if(from == 1 && arr[to] == 0) {
				arr[to] = cost;
			}
			else if(arr[to] != 0 && arr[from] != 0) {
				arr[to] = Math.min(arr[to], arr[from]+cost);
			}	
			else if(arr[from] != 0 && arr[to] == 0) {
				arr[to] = arr[from] + cost;
			}
		}
		System.out.println(arr[city]);
	}
}