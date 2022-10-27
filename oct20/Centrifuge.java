import java.util.*;

class Centrifuge {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1 || n == 1) {
			System.out.println("false");
			return;
		}
		else {
			if((n%k == 0) || (n % (n-k) == 0 && (n-k) != 1) || n%2 == 0 && k%2==0) {
				System.out.println("true");
			}
			else if( k % (n%k)  == 0 && n%k != 1 || k % Math.sqrt(n) == 0) {
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
	}
}