import java.util.*;

class Dupli {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int hash[] = new int[100];
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			hash[arr[i]]++;
			if(hash[arr[i]] > 1) 
				count++;
		}
		
		for(int i=0;i<n;i++) {
			if(hash[arr[i]] > 0) {
				System.out.print(arr[i] + " ");
				hash[arr[i]] = 0;
			}
		}
		while(count > 0) {
			System.out.print("- ");
			count--;
		}
	}
}