import java.util.*;

class ReverseWords {
	
	public static void rev(String dups[], String st, int index) {
		String temp = "";
		
		for(int i=st.length()-1;i>=0;i--) {
			temp = temp+ st.charAt(i);
		}
		dups[index] = temp;
	}
	
	public static void reverse(String str, int check) {
			
		int len = str.length();
		int j = 0;
		String dup[] = new String[len];
		String temp = "";
		boolean istrue = false;
		for(int i=0;i<len;i++) {
			
			if(i == str.length()-1) {
				temp = temp + str.charAt(i);
				dup[j] = temp;
				break;
			}
			if(str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
			}
			else  {
				dup[j] = temp;
				j++;
				temp = "";
			}
		}
		
		for(int i=0;i<=j;i++) {
			if(i%2 != check) {
				rev(dup, dup[i], i);
			}
			System.out.print(dup[i] + " ");
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String st = sc.next();
		int check = -1;
		if(st.equals("odd")) {
			check = 1;
		}
		else 
			check = 0;
		
		reverse(str,check);
	}
}