import java.util.*;

class Reverse {
	
	public static void main(String args[]) {
		
		String str = "Hello everyone";
		char s[] = str.toCharArray();
		
		int i=0,j=s.length-1;
		
		while(i<=j) {
			char temp  = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		
		System.out.println((s));
	}
}