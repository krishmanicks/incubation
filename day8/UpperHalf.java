import java.util.*;

public class UpperHalf {

 public static void main(String args[])
   {
      int m, n, c, d;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Input number of rows and columns of the matrix");
      m = sc.nextInt();
 
      int array1[][] = new int[m][m];
 
      System.out.println("Input elements of first matrix:");
 
      for (c=0;c<m;c++)
         for (d=0;d<m;d++)
            array1[c][d] = sc.nextInt();
		
		System.out.println("The upper half is ");
		
		for(int i=0;i<m;i++) {
			// for(int k=i;k>0;k--) {
				// System.out.print("  ");
			// }
				
			for(int j=0;j<m;j++) {
				if(i<=j)
					System.out.print(array1[i][j] + " ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}

   }
}
