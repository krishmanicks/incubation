import java.util.*;

class Balloon {
	
	static Scanner sc = new Scanner(System.in);
	static int counting = 0;
	static boolean isfilled = true;
	static int points = 0;
	
	public static void clear(char matrix[][], int m, int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = '-';
			}
		}
	}
	
	public static void isDiagonal(char matrix[][], int n, int m) {
		char temp = matrix[0][0];
		int counts = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i == j) {
					if(matrix[i][j] == temp) {
						counts++;
					}
				}
			}
		}
		counts = 0;
		char temp = matrix[m-1][0];
		if(counts == n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i == j) {
						matrix[i][j] == '-') 
					}
				}
			}
			return;
		}
		
		// for(int i=0;i<m;i++) {
			// for(int j=0;j<n;j++) {
				// if(i+j == n-1) {
					// if(matrix[i][j] == temp) {
						// counts++;
					// }
				// }
			// }
		// }

	}
	
	public static boolean isAllFilled(char matrix[][], int m, int n) {
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(matrix[i][j] == '-')
					return false;
			}
		}
		return true;
	}
	
	public static boolean isRowFilled(char matrix[][], int n, int m) {
		
		for(int i=0;i<m;i++) {
			int counts = 0;
			for(int j=0;j<n;j++) {
				if(matrix[i][j] != '-') {
					counts++;
				}
			}
			if((counts == m || counts == n)) {
				isfilled = false;
				return true;
			}
		}
		return false;
	}
	
	public static boolean isRow(char matrix[][], int n, int m) {
		
		for(int i=0;i<m;i++) {
			int counts = 1;
			char temp = matrix[i][0];
			for(int j=1;j<n;j++) {
				if(matrix[i][j] == temp) 
					counts++;
			}
			
			if(counts == m) {
				for(int k=0;k<m;k++) {
					matrix[i][k] = '-';
				}
				points++;
			} 
		}
		return true;
	}
	
	public static boolean isColumn(char matrix[][], int n, int m) {
		int j;
		for(int i=0;i<m;i++) {
			int counts = 1;
			
			char temp = matrix[0][i];
			
			for(j=1;j<n;j++) {
				if(matrix[j][i] != '-') {
					if(matrix[j][i] == temp) 
						counts++;
				}
				else 
					break;
					
			}
			System.out.println(counts);
			if(counts == m) {
				for(int k=0;k<m;k++) {
					matrix[k][i] = '-';
				}
				points++;
			} 
		}
		return true;
	}

	
	public static void adding(char matrix[][],int n, int m,char balo, int col) {
		col--;
		for(int i=n-1;i>=0;i--) {
			
			if(matrix[i][col] == '-') {
				counting++;
				matrix[i][col] = balo;
				return;
			}
			else if(matrix[i][col] != '-') {
				if(matrix[i][col-1] == '-') {
					matrix[i][col-1] = balo;
					return;
				}
				else if((matrix[i][col+1]) == '-') {
					matrix[i][col+1] = balo;
					return;
				}
			}
		}
	}
	
	public static void printing(char matrix[][], int m, int n) {

		System.out.println("\n\n Contents of the matrix ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void add(char matrix[][], int n, int m) {
		
		char temp;
		Scanner sc = new Scanner(System.in);
		boolean isrows = false;
		do {
						
			if(isAllFilled(matrix,m,n)) {
				//System.out.println("Column filled completely. program finished");
				//break;
				System.out.println("All cleared\n");
				clear(matrix,m,n);
				printing(matrix, m, n);
			}
			
			System.out.print("Enter the column number :");
			int col = sc.nextInt();
			System.out.print("\nEnter the color of the balloon: ");
			char balo = sc.next().charAt(0);
		
			adding(matrix,n,m,balo,col);

			isRow(matrix,n,m);
			isColumn(matrix,n,m);
			isDiagonal(matrix,n,m);
			printing(matrix, m, n);
			
			// System.out.print("\nDo you wish to continue(Y/N):");
			// temp = sc.next().charAt(0);
			
		}while(points != 5);
	}
	
	public static void main(String args[]) {
		
		System.out.println("Enter the matrix size(m,n)");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		char matrix[][] = new char[m][n];
		
		clear(matrix,m,n);
		
		add(matrix,m,n);
	}
}