import java.util.*;

class Locker {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int a = 26;
		int n = s.length();
		int sum = 1;
		
		if(n == 1) {
			//System.out.println((s.charAt(0) - 'A') + 1);
			sum = (s.charAt(0) - 'A') + 1;
		}
		else  {
			int i=0;
			while(n > 1) {
				int t = (s.charAt(i) - 'A' + 1) * a;
				sum = sum + t;
				i++;
				n--;
			}
			sum = sum + s.charAt(i) - 'A';

		}
		System.out.println(sum);
	}
}