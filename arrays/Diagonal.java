import java.util.*;

public class Diagonal {

 public static void main(String args[])
   {
      int m, n, c, d, temp=0;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Input number of rows and columns of the matrix");
      m = sc.nextInt();
      n  = m;
 
      int array1[][] = new int[m][n];
 
      System.out.println("Input elements of first matrix:");
 
      for (c=0;c<m;c++)
         for (d=0;d<n;d++)
            array1[c][d] = sc.nextInt();
 
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(j+temp == i){
					System.out.println(array1[i][j]);
				}
			}
		}
   }
}
