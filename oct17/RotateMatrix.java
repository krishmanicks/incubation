import java.util.*;

class RotateMatrix {
	
	static int row1,column;
	static Scanner sc = new Scanner(System.in);
	
	public static void rotatematrix(int m,int n, int mat[][])
	{
		int row = 0, col = 0;
		int prev, curr;
		while (row < m && col < n)
		{
	
			if (row + 1 == m || col + 1 == n)
				break;
			prev = mat[row + 1][col];
			for (int i = col; i < n; i++)
			{
				curr = mat[row][i];
				mat[row][i] = prev;
				prev = curr;
			}
			row++;
			for (int i = row; i < m; i++)
			{
				curr = mat[i][n-1];
				mat[i][n-1] = prev;
				prev = curr;
			}
			n--;
			if (row < m)
			{
				for (int i = n-1; i >= col; i--)
				{
					curr = mat[m-1][i];
					mat[m-1][i] = prev;
					prev = curr;
				}
			}
			m--;
			if (col < n)
			{
				for (int i = m-1; i >= row; i--)
				{
					curr = mat[i][col];
					mat[i][col] = prev;
					prev = curr;
				}
			}
			col++;
		}

			
		for (int i = 0; i < row1; i++)
		{
			for (int j = 0; j < column; j++)
			{
				System.out.print( mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {

		row1 = sc.nextInt();
		column = sc.nextInt();
		int arr[][] = new int[row1][column];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		rotatematrix(row1,column,arr);		
	}
}

