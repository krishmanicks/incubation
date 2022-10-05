import java.util.*;

class adjacent {
	
	public static boolean isPalindrome(int start, int end, char s[]) {
		int i=start,j= end;
		
		while(i<=j) {
			if(s[i] != s[j]) {
				return false;
			}
			i++;
			j++;
		}
		return true;
	}
	
	public static void printing(char s[], int start, int end) {
		
		for(int i=start;i<end;i++) {
			System.out.print(s[i]);
		}
		System.out.print(" ");
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char s[] = str.toCharArray();
		
		int start = 0;
		int end = 0;
		for(int i=0;i<s.length;i++) {
			if(s[i] == ' ' || s[i] == s.length-1) {
				end = i;
				//System.out.println(s[start] + " " + s[end]);
				boolean val = isPalindrome(start,end,s);
				if(!val) {
					printing(s,start,end);
				}
				start = i+1;
			}
		}
		
	}
}