import java.util.*;

class CheckRotation {
	
	static int row1,column;
	static int arr[][],arr1[][];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter row and column size");
		row1 = sc.nextInt();
		column = sc.nextInt();
		arr = new int[row1][column];
		arr1 = new int[row1][column];
		System.out.println("Enter first array values");
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second array values");
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the degree to rotate");
		int degree = s.nextInt();
		
		if(degree == 90)
			rotatearrrix(row1,column);	
		else if(degree == 180)
		{
			rotatearrrix(row1,column);	
			rotatearrrix(row1,column);	
		}
		else if(degree == 270)
		{
			rotatearrrix(row1,column);	
			rotatearrrix(row1,column);	
			rotatearrrix(row1,column);	
		}	
		System.out.println("Array A");
		for (int i = 0; i < row1; i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nArray B");
		for (int i = 0; i < row1; i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		checkSame();
	}
	
	public static void checkSame()
	{
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(arr[i][j]==arr1[i][j]&&i==row1-1&&j==column-1)
					System.out.println(true);
				else if(arr[i][j]==arr1[i][j])
				{
					continue;
				}
				else
				{
					System.out.println(false);
					return;
				}
			}
		}
	}
	public static void rotatearrrix(int m,int n)
	{
		int row = 0, col = 0;
		int prev, curr;
		while (row < m && col < n)
		{
	
			if (row + 1 == m || col + 1 == n)
				break;
			prev =arr[row + 1][col];
			for (int i = col; i < n; i++)
			{
				curr =arr[row][i];
				arr[row][i] = prev;
				prev = curr;
			}
			row++;
			for (int i = row; i < m; i++)
			{
				curr =arr[i][n-1];
				arr[i][n-1] = prev;
				prev = curr;
			}
			n--;
			if (row < m)
			{
				for (int i = n-1; i >= col; i--)
				{
					curr =arr[m-1][i];
					arr[m-1][i] = prev;
					prev = curr;
				}
			}
			m--;
			if (col < n)
			{
				for (int i = m-1; i >= row; i--)
				{
					curr =arr[i][col];
					arr[i][col] = prev;
					prev = curr;
				}
			}
			col++;
		}
	}

}

