import java.util.*;

class Middle {
	
	public static void main(String args[]) {
		 int row = 4, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4}, {9,5,1}, {8,5,7}};
		int middlerow = row/2;
		int middlecol = column/2;
		
		System.out.print("Printing the middle row: ");
		
		for(int i=middlerow; ;) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			break;
		}
		
		System.out.print("\n\nPrinting the middle column: ");
		
		for(int i=middlecol; ;) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[j][i] + " ");
			}
			break;
		}
	}
}