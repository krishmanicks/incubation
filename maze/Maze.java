import java.util.*;

class Maze {
	static double count = 0;
	static double rowcount = 0;
	static double total = 0;
	
	public static void red(char maths[][], int i, int j, int row, int col) {
		
		if(j >= col || i >= row || i == -1 || j == -1 || maths[i][j] == '#') {
			return;
		}
		rowcount++;
		if(i == row-1 && j == col-1 && maths[i][j] == '0') {
			count++;
		}
		if(maths[i][j] == '0')
			maths[i][j] = '#';
		

		red(maths,i+1,j,row,col);
		red(maths,i,j+1,row,col);
		red(maths,i-1,j,row,col);
		red(maths,i,j-1,row,col);
	}
	
	public static void findsol(char mat[][], int rows, int col, int zeros) {
		
		if(mat[rows-1][col-1] == '#') {
			System.out.println("cannot reach");
			return;
		}
		
		if(rows*col == zeros) {
			System.out.println((double) 1);
			return;
		}
		double sum = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(mat[i][j] == '0') {
					red(mat,i,j,rows,col);
					total++;
					sum += ((rowcount/zeros)) * total;
					rowcount = 0;
				}
			}
		}
		if(count == 0) {
			System.out.println("cannot be reached");
			return;
		}
		System.out.println((double) sum);
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int col = sc.nextInt();
		char mat[][] = new char[rows][col];
		int zeros = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j] = sc.next().charAt(0);
				if(mat[i][j] == '0') {
					zeros++;
				}
			}
		}

		findsol(mat,rows,col,zeros);

	}
}