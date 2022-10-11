import java.util.*;

class Pascals {

	public static void main(String[] args)
	{
		int c=1,i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input ");	
		int row = sc.nextInt();
		
		for(i=0;i<row;i++)
		{
			for(int k=1;k<=row-i;k++)
				System.out.print(" ");
			
			for(j=0;j<=i;j++)
			{
				if (j==0 || i==0)
					c = 1;
				else
				   c = c * (i-j+1)/j;
			   
				System.out.print(" "+c);
			}
			System.out.println();
		}
	}
}
