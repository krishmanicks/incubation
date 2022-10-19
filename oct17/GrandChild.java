import java.util.*;

class GrandChild {
	
	public static int check(String relative[][], String child, String str) {
		
		int count = 0;
		 for (int k=0;k<relative.length;k++)
			 {
				 
				 if (relative[k][1].equals(child))
				 {
					 count++;				 
				 }
				 
			 }
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String relative[][] = new String[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				relative[i][j] = sc.next();
			}
		}
	    String child = "";
	    int count = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = in.next();
	    
		
		 for (int i=0;i<relative.length;i++)
		 {
			 if (relative[i][1].equals(str))
				 {
						 child = relative[i][0];
						  count = count + check(relative,child, str);						 
				 }			
		 }
		 System.out.println(count);

  }
}