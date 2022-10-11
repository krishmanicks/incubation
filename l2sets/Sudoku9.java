import java.util.*;

public class Sudoku9 {

	 static int N = 9;

	public static void solveSudoku(int grid[][])
	 {

	  for(int i=0;i<N;i++) {
		  for(int j=0;j<N;j++) {
			  int temp = grid[i][j];
			  grid[i][j] = 0;
			  if(isSafe(grid,i,j,temp) == false) {		  
				  System.out.println("Not Valid");
				  return;
			  }
			  grid[i][j] = temp;
		  }
	  }

	  System.out.println("Given sudoku is valid");
		return;
	}

	 public static void print(int queens[][]) {
		for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) 
						System.out.print(queens[i][j] + " ");
				System.out.println();
			}
			System.out.println("\n\n");
	}

	 static boolean isSafe(int[][] grid, int row, int col,int num)
	 {

	  for (int x = 0; x <= 8; x++)
	   if (grid[row][x] == num)
		return false;

	  for (int x = 0; x <= 8; x++)
	   if (grid[x][col] == num)
		return false;

	  int startRow = row - row % 3, startCol = col - col % 3;
	  for (int i = 0; i < 3; i++)
	   for (int j = 0; j < 3; j++)
		if (grid[i + startRow][j + startCol] == num)
		 return false;

	  return true;
	 }
			

 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
		int grid[][] = { {7, 9, 2, 1, 5, 4, 3, 8, 6}, 
						 {6, 4, 3, 8, 2, 7, 1, 5, 9},
						 {8, 5, 1, 3, 9, 6, 7, 2, 4},
						 {2, 6, 5, 9, 7, 3, 8, 4, 1},
						 {4, 8, 9, 5, 6, 1, 2, 7, 3},
						 {3, 1, 7, 4, 8, 2, 9, 6, 5},
						 {1, 3, 6, 7, 4, 8, 5, 9, 2},
						 {9, 7, 4, 2, 1, 5, 6, 3, 8},
						 {5, 2, 8, 6, 3, 9, 4, 1, 7}};
					 
		
	  solveSudoku(grid);
 }

}
