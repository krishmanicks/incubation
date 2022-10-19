import java.util.*;

class Pairs {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int hash[] = new int[100];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int sum = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int temp = sum - arr[i];
			if(hash[temp] == 0)
				hash[temp]++;
			else 
				System.out.println(arr[i] + "  " + hash[temp]);
		}
	}
}