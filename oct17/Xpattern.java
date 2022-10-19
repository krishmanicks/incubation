import java.util.*;

class Xpattern {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter column and row size");
		int column = sc.nextInt();
		int row = sc.nextInt();
		
		char arr[][] = new char[row][column];
		char print = ' ';
		int top=0,down=row-1,left=0,right=column-1,count=0;
		
		while(top<=down && left<=right)
		{
			if(count%2 == 0)
				print='X';
			else
				print = '0';
			for(int i=top;i<=right;i++)
				arr[top][i] = print;
			
			for(int i=left+1;i<=down;i++)
				arr[i][right] = print;
			
			if(top<down&&left<right) {
				
				for(int i=right-1;i>top;i--)
					arr[down][i] = print;
				
				for(int i=down;i>left;i--)
					arr[i][left] = print;
			}
			
			top++;
			down--;
			left++;
			right--;
			count++;
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}