import java.util.*;

class Subs {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		
		String str2 = sc.next();
		int temp = -1;
		int i=0,j=0;
		int n = 0;
		char memo[] = str1.toCharArray();
		
		while(i<memo.length) {
			if(memo[i] == str2.charAt(j)) {
				j++;
				i++;
				if(n == 0) {
					temp = i;
					n = 1;
				}
				while(j!= str2.length()) {
					if(memo[i] == str2.charAt(j)) {
						i++;
						j++;
					}
					else {
						n=0;
						temp = -1;
					}
					
					if(j == str2.length()) {
						System.out.println(temp-1);
						break;
					}
					
				}
			}
			else 
				i++;
		}
	}
}