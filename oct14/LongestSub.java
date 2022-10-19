import java.util.*;

class LongestSub {
	
	public static void clear(int vis[]) {
		for(int i=0;i<26;i++)
			vis[i] = 0;
	}
	
	public static void longe(String str) {
			
		int start = 0;
		int vis[] = new int[26];
		int max = 0;
		for(int i=0;i<str.length();i++) {
			int count = 0;
			for(int j=i;j<str.length();j++) {
				int temp = str.charAt(j) - 'a';
				if(i == j) {
					count++;
				}
				else if((str.charAt(i) != str.charAt(j)) && vis[temp] == 0) {
					count++;
					vis[temp] = 1;
				}
				else {
					clear(vis);
					break;
				}
				if(count > max)
					max = count;
			}
		}
		System.out.println(max);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		longe(str);
	}
}