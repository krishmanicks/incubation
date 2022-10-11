import java.util.*;

class NextIndex {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k=0,count0 = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] == arr[i+1]) {
				arr[i] = arr[i] + arr[i+1];
				arr[i+1] = 0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[k] = arr[i];
				k++;
			}
			else if(arr[i] == 0) {
				count0++;			
			}
		}
		while(count0 > 0) {
			arr[k] = 0;
			k++;
			count0--;
		}
		
		for(int i: arr) 
			System.out.print(i + " ");
	}
}