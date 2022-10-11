import java.util.*;

class Cycle {
	
	public static void predict(int arr[][], int rows, int col, int b[]) {

		int i=0,j=1;
				
		int hash[] = new int[500];
		
		while(j<=b.length-1) {
			hash[b[i]] = b[j];
			i++;
			j++;
		}
		boolean istrue = false;
		int st = 1;
		int temp = 1;
		for(int k=1;k<hash.length;k++) {
			if(hash[temp] == 0) {
				System.out.println("No" + k);
				return;
			}
			temp = hash[temp];
			if(temp == st) {
				istrue = true;
			}
		}
		if(istrue)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int rows = 2;
		System.out.println("Enter no. of columns");
		int col = sc.nextInt();
		int b[] = new int[rows*col];
		int k=0;
		int arr[][] = new int[rows][col];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
				b[k] = arr[i][j];
				k++;
				}
			}
		
		predict(arr,rows,col, b);
	}
}