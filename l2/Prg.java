import java.util.*;

class Prg {
	
	public static boolean traps(int a, int b) {
		
		int sum = a;
		int t = 3;
		while(t>0) {
			if(b%a == 0 || a%b == 0 || a == b) {
				return true;
			}
			else {
				int temp = 0;
				while(sum > 0) {
					temp = temp + sum%10;
					sum = sum/10;
				}
				sum = temp;
			}
			if(sum < 10) 
				t--;
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lists = new ArrayList<Integer>();
		
		System.out.println("Enter N1,N2 and y");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=n1;i<=n2;i++) {
			lists.add(i);
		}
		
		for(int i: lists) {
			if(traps(i,y) == true) {
				y = y+2;
				System.out.println(i + " ");
			}
			else {
				y = y-1;
			}
			
			if(y<=2)
				y = 3;
		}
	}
}