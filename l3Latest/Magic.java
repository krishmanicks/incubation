import java.util.*;

class Magic {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test cases");
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int arr[][] = new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int dp[][] = new int[n][n];
			
			for(int i=1;i<n;i++) {
				dp[i][0] +=  arr[i][0]+dp[i-1][0];
			}
			for(int i=1;i<n;i++) {
				dp[0][i] +=  arr[0][i] + dp[0][i-1];
			}
			
			for(int i=1;i<n;i++) {
				for(int j=1;j<n;j++) {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+ arr[i][j];
				}
			}
			float avg = (float)dp[n-1][n-1]/(2*n - 3);
			System.out.println(dp[n-1][n-1]);
			System.out.println(avg > 0? avg : "BAD Judges");
		}
	}
}

