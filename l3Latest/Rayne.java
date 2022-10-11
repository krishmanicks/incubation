import java.util.*;

class Rayne {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of test cases"); 
			int t = sc.nextInt();
			while(t-- > 0) {
				int n = sc.nextInt();
				int arr[] = new int[n];
				int max = 0;
				int sum = 0;
				int min = Integer.MAX_VALUE;
				
				for(int i=0;i<n;i++) {
					arr[i] = sc.nextInt();
				}
				
				for(int i=n-1;i>=1;i--) {
					if(arr[i] > arr[i-1]) {
						max = arr[i] - arr[i-1];
						
						if(max > sum)
							sum = max;
					}
				}	
				if(sum == 0) {
					System.out.println("UNFIT");
				}
				else
					System.out.println(sum);
			}
		}
	}