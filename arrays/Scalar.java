import java.util.*;

public class Scalar {

 public static void main(String args[])
   {
      int m, n, c, d, temp=0;
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Input number of rows and columns of the matrix");
      m = sc.nextInt();
      n  = m;
 
      int array1[][] = new int[m][n];
	  
	  int a = array1[0][0];
 
      System.out.println("Input elements of first matrix:");
 
      for (c=0;c<m;c++) {
         for (d=0;d<n;d++)
		 {
            array1[c][d] = sc.nextInt();
		 }
	  }
 
		for(int i=0;i<m;i++) {
			if(temp == 1)
				break;
			for(int j=0;j<n;j++) {
				if(j == i && array1[i][j] != a) {
					System.out.println("Not Scalar");
					temp = 1;
					break;
				}
			}
		}
		if(temp == 0) 
			System.out.println("Scalar");
   }
}
