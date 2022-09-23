import java.util.*;

class NQueen {
	
	public static void prints(int queens[][], int n) {
		for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) 
					if(queens[i][j] == 1)
						System.out.print(queens[i][j] + " ");
					else 
						System.out.print("0 ");
				System.out.println();
			}
			System.out.println("\n\n");
	}
	
	public static boolean isvalid(int q[][], int i, int j, int n) {
			
		int k,l;
		for(k=0;k<j;k++) {
            if(q[i][k] == 1)
                return false;
		}
  
        for(k=i,l=j;k>=0 && l>=0;k--,l--) {
            if(q[k][l] == 1)
                return false;
		}

        for(k=i,l=j;l>=0 && k<n;k++,l--) {
            if(q[k][l] == 1)
                return false;
		}
  
        return true;

	}
	static int count = 0;
	public static void findsol(int queen[][], int n,int y) {
		
		 //int count = 0;
		
		if(y == n) {
			prints(queen,n);
			count++;
			return;
		}
		
		for( int i=0;i<n;i++) {
			if(isvalid(queen,i,y,n) == true) {
				queen[i][y] = 1;

				findsol(queen,n,y+1);

				queen[i][y] = 0;
			}		
		}
		return;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int queens[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) 
				queens[i][j] = 0;
		}
		
		findsol(queens,n,0);
		if(NQueen.count == 0)
			System.out.println("No solution ");
		}
}