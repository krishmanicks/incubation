import java.util.*;

class rec {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m =4;
		int n = 4;
		int mat[][] = {{1, 2, 3, 4, 6},
					   {5, 3, 8, 1, 2},
					   {4, 6, 7, 5, 5}, 
					   {2, 4, 8, 9, 4}};
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		int index3 = sc.nextInt();
		int index4 = sc.nextInt();
		int sum = 0;
		
		for(int i=index1;i<=index3;i++) {
			for(int j=index2;j<=index4;j++) {
				System.out.print(mat[i][j] + " ");
				sum += mat[i][j];
			}
			System.out.println();
		}
		System.out.println("sum - " + sum);
		
	}
}