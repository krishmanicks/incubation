import java.util.*;

class Lifts {
	
	static Scanner sc = new Scanner(System.in);
	
	// public static int check(int start, int end, int temp) {
		
		// if(start >=0 && start <=5 && end <= 5 && end >= 0 && temp > 2) {
			// return 4;
		// }
		// else if(start <=10 && start >=6 && end <= 10 && end >= 6 && temp < 2 ) {
			// return 4;
		// }
		// return 0;
	// }
	
	public static void assign(String lift[], int floor[], int n) {
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		int temp=-1;
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int min3 = 0;
		int k=0,j =0;
		
		if(end>=0 && end<=5) {
			k = 0;
			j = 2;
		}
		else if(end >=6 && end <= 10) {
			k = 2;
			j = 4;
		}
		else
			j = -1;
		
 		for(int i=k;i<j;i++) {
			
			if(Math.abs(floor[i] - start) < min) {
				min = Math.abs(floor[i] - start);
				min2 = i;

			}
			else if(Math.abs(floor[i] - start) == min) {
				min3 = i;
			}
		}
		System.out.println(min2 + "  " + min3 + " " + temp);
		if(Math.abs(floor[min2] - start) ==  Math.abs(floor[min3] - start)) {
			
			if((start - end) > 0) {
				if(start <= floor[min2])
					temp = min2;
				else 
					temp = min3;
				
			} 
			else {
				if(start > floor[min2])
					temp = min2;
				else 
					temp = min3;
			}
		}
		else if(temp == -1 ) {
			temp = 4;
		}
		else {
			temp = min2;
		}

		floor[temp] = end;
		System.out.println(lift[temp] + " is assigned");
		display(lift,floor,n);
	}
	
	public static void display(String lift[], int floor[], int n) {
		
		System.out.print("Lift:  ");
		for(String i: lift) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nFloor:  ");
		for(int i: floor) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		
		int n = 5;
		String lift[] = new String[n];
		int floor[] = new int[n];
		
		for(int i=0;i<n;i++) {
			String str = "L";
			lift[i] = str + String.valueOf(i+1);
		}
		System.out.println("Enter the lift floor starting point");
		
		for(int i=0;i<n;i++) {
			floor[i] = sc.nextInt();
		}
		
		while(true)
			assign(lift, floor,n);
	}
}