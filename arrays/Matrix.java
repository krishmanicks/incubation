import java.util.*;

public class Matrix {

 public static void main(String args[])
   {
      int m, n, c, d;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Input number of rows and columns of the matrix");
      m = sc.nextInt();
      n  = m;
 
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Input elements of first matrix:");
 
      for (c=0;c<m;c++)
         for (d=0;d<n;d++)
            array1[c][d] = sc.nextInt();
 
      System.out.println("Input the elements of second matrix:");
 
      for (c=0;c<m;c++)
         for (d=0;d<n;d++)
            array2[c][d] = sc.nextInt();
 
      for (c=0;c<m;c++)
         for (d=0;d<n;d++)
             sum[c][d] = array1[c][d] + array2[c][d]; 
 
      System.out.println("Sum of the matrices:-");
 
      for (c=0;c<m;c++)
      {
         for (d=0;d<n;d++)
            System.out.print(sum[c][d]+"\t");
         System.out.println();
      }
   }
}
