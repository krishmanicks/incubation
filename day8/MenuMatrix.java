import java.util.*;

public class MenuMatrix {
	
	 public static void sums(int[][] matrix) {
		int sum = 0;
        for(int[] row : matrix) {
            for (int column : row) {
				sum += column;
            }
        }
		System.out.println("sum is " + sum + "\n\n");
    }
	
	 public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
	
	public static void transposed(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
	public static void row(int[][] matrix, int m, int n) {

		for(int i=0;i<m;i++) {
			System.out.println("row " + i + "   ");
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
    }
	
	public static void column(int[][] matrix, int m, int n) {

		for(int i=0;i<m;i++) {
			System.out.println("column " + i + "   ");
			for(int j=0;j<n;j++) {
				System.out.print(matrix[j][i] + "   ");
			}
			System.out.println();
		}
    }

    public static void main(String[] args) {
		
		boolean istrue = true;
		Scanner sc = new Scanner(System.in);
		int m = 0;;
		int n = 0;
		int[][] matrix = new int[m][n];
		
		while(istrue) {
			System.out.println("1. input");
			System.out.println("2. display");
			System.out.println("3. sum");
			System.out.println("4. rowwise");
			System.out.println("5. columnwise");
			System.out.println("6. transpose");
			System.out.println("7. exit");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: {
					System.out.println("Enter the Size of m and n");		
					m = sc.nextInt();
					n = sc.nextInt();
					matrix = new int[m][n];
					System.out.println("Input elements of the matrix:");
					  for (int i=0;i<m;i++)
						 for (int j=0;j<n;j++)
							matrix[i][j] = sc.nextInt();
				}
				break;
				
				case 2:
					display(matrix);
					break;
				case 3: 
					sums(matrix);
					break;
				case 4:
					row(matrix,m,n);
					break;
				case 5:
					column(matrix,m,n);
					break;
				case 6:
					 int[][] transpose = new int[m][n];
						for(int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							transpose[j][i] = matrix[i][j];
						}
						transposed(transpose);
					}
					break;
				
				case 7:
					istrue = false;
					break;
			}
		}

    }
}