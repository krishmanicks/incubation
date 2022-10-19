import java.util.*;

class Palindrome {
	
	public static boolean ischeck(int start, int end, String str) {
		
		while(start <= end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
 	
	public static void find(String str) {
		int start = 0;
		for(int i=0;i<str.length();i++) {
			if(ischeck(start, i, str)) {
				if(ischeck(i+1, str.length()-1, str) && i!=str.length()-1) {
					System.out.println("can be split into palindrome substrings");
					return;
				}
			}
		}
		System.out.println("Can't be split into palindrome substrings");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		find(str);
		
	}
}