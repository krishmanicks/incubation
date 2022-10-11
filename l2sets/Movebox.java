import java.util.*;

class Movebox {
	
	static int count = 0;
	
	static void move(String grid[][]) {
		int rows = grid[0].length;
		int columns = grid.length;
		
		int dp[][] = new int[rows][columns];
		
		boolean isS = false;
		boolean isB = false;
		boolean isBoth = false;
		int start = 0;
		int end = 0;
		int st = 0;
		int en = 0;
		int ts =0;
		int te = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				
				if(grid[i][j] == "B") {
					start = i;
					end = j;
				}
				if(grid[i][j] == "S") {
					st = i;
					en = j;
				}
				if(grid[i][j] == "T") {
					ts = i;
					te = j;
				}
				if(grid[i][j] == "#") 
					dp[i][j] = -2;
				else if(grid[i][j] != ".") 
					dp[i][j] = -1;
				else 
					dp[i][j] = 0;
			}
		}
		
			
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(dp[i][j] == -2)
					continue;
				
				if(dp[start][end-1] != -1 || dp[start+1][end] != -1 || dp[start-1][end] != -1 || dp[start][end+1] != -1) {
					isB = true; 
				}
				if(dp[st][en-1] != -1 || dp[st+1][en] != -1 || dp[st-1][en] != -1 || dp[st][en+1] != -1) {
					isS = true; 
				}
				if(dp[i][j] == 0) {
					
					if(dp[i][j-1] < 0 && dp[i-1][j] < 0) {
						dp[i][j] = 1;
					}
					else if(dp[i][j-1] == -1)
						dp[i][j] = dp[i][j-1] + 1;
					else 
						dp[i][j] = dp[i-1][j] + 1;
				}				
				
			}
		}
			if(isB && isS) {
				if(ts < start) {
					if(te < end) {
						count = dp[start][end-1] + 1;
					}
				}
				if(ts == start) {
					if(te < end) {
						count = dp[start][end-1] +1;
						System.out.println("ts");
					}
					else 
						count = dp[start][end+1] +1;
				}
				System.out.println(count);
			}
			else {
				System.out.println("-1");
				return;
			}
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++){
					System.out.print(dp[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String grid[][] = {{"#","#","#","#","#","#"},
						{"#","T","#","#","#","#"},
						{"#",".",".","B",".","#"},
						{"#",".","#","#",".","#"},
						{"#",".",".",".","S","#"},
						{"#","#","#","#","#","#"}};
						
		// String grid[][] = {{"#","#","#","#","#","#"},
						// {"#","T","#","#","#","#"},
						// {"#",".",".","B",".","#"},
						// {"#","#","#","#",".","#"},
						// {"#",".",".",".","S","#"},
						// {"#","#","#","#","#","#"}};
						
			move(grid);
	}
}