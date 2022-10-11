import java.util.*;

class Infected {
	
	public static void copy(int m[][], int dp[][], int row,int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m[i][j] = dp[i][j];
			}
		}
	}
	
	public static void mini(int m[][], int row, int col, int count) {
		
		int dp[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				dp[i][j] = m[i][j];
			}
		}
		int days = 0;
		
		while(true) {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(count == row*col) {
						System.out.println(days);
						return; 	
					}
					if(m[i][j] == 1) {
						if(i == 0 ) {					
							if(j<col-2) {
								if(dp[i][j+1] == 0) {
									dp[i][j+1] = 1;
									count++;
								}
								if(dp[i+1][j] == 0) {
									dp[i+1][j] = 1;
									count++;
								}
							}
							else {
								if(dp[i][j+1] == 0) {
									dp[i][j+1] = 1;
									count++;
								}
							}							
						}
						else if(i==row-1 && j== col-1) {
							if(dp[i-1][j] == 0) {
								dp[i-1][j] = 1;
								count++;
							}
							if(dp[i][j+1] == 0) {
								dp[i+1][j] = 1;
								count++;
							}
						}
						else if(i == row-1 && j == 0) {
								if(dp[i][j+1] == 0) {
									dp[i][j+1] = 1;
									count++;
								}
								if(dp[i-1][j] == 0) {
									dp[i-1][j] = 1;
									count++;
								}					
						}
						else if(i==0 && j == col-1) {
							if(dp[i+1][j] == 0) {
								dp[i+1][j] = 1;
								count++;
							}
							if(dp[i][j-1] == 0) {
								dp[i][j-1] = 1;
								count++;
							}
						}
						else {
							if(dp[i+1][j] == 0) {
								dp[i+1][j] = 1;
								count++;
							}
							if(dp[i][j-1] == 0) {
								dp[i][j-1] = 1;
								count++;
							}
							if(dp[i][j+1] == 0) {
									dp[i][j+1] = 1;
									count++;
								}
								if(dp[i-1][j] == 0) {
									dp[i-1][j] = 1;
									count++;
								}
								if(dp[i][j+1] == 0) {
									dp[i][j+1] = 1;
									count++;
								}
								if(dp[i+1][j] == 0) {
									dp[i+1][j] = 1;
									count++;
								}
						}
						days++;				
					}
					copy(m,dp,row,col);
				}
			}
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int matrix[][] = new int[row][col];
		int count = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
				if(matrix[i][j] == 1)
					count++;
			}
		}
		
		mini(matrix,row,col,count);
	}
}