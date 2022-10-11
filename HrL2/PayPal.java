import java.util.*;

class PayPal{

	public static int count1 = 0;
	
	public static void print(String s, int i, int n, int row) {
		
		int x1 = n*2-2, y1 = count1;
		int z = i;
		int x2 = x1, y2 = y1;
		
		System.out.print(s.charAt(z-1));

		while(x1<s.length() && y1<s.length() && z<=s.length()){
			if(i<row && z<=s.length()){
				z+=x1;
			}
			if(i<row && z<=s.length()){

				System.out.print(s.charAt(z-1));

			}
			if(y1>0 && z<s.length()){
				z+=y1;
			}
			if(y1>0 && z<=s.length()){
				
				System.out.print(s.charAt(z-1));
			}

		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int row = sc.nextInt();
		int n = row, count = 1;
		System.out.println();
		for(int i=1;i<=row;i++){
			print(s,i,n--,row);
			count1 += 2;
		}
		System.out.println();
	}
}