import java.util.*;

class Dungeon {
	
	public static void find(int arr[][], int n, int m) {
		int dp[][] = new int[n][m];
		
		if(n ==1 && m==1) {
			System.out.println((Math.abs(arr[0][0])) + 1);
			return;
		}
		
		dp[n-1][m-1] = arr[n-1][m-1];
		
		for(int i=n-2;i>=0;i--) {
			dp[i][m-1] = arr[i][m-1] + dp[i+1][m-1];
			if(dp[i][m-1] > 0) {
				dp[i][m-1] = 0;
			}
		}
		
		for(int i=m-2;i>=0;i--) {
			dp[n-1][i] = arr[n-1][i] + dp[n-1][i+1];
			if(dp[n-1][i] > 0)
				dp[n-1][i] = 0;			
		}
					
		for(int i=n-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
				dp[i][j] = (Math.max(dp[i+1][j],dp[i][j+1])) + arr[i][j];
				
				if(dp[i][j] > 0) 
					dp[i][j] = 0;
			}
		}
		
		System.out.println();
		System.out.println();
		
		int val = Math.abs(dp[0][0]);
		System.out.println(val+1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		find(arr,n,m);
	}
}