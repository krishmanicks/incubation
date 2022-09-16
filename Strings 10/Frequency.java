import java.util.*;

class Frequency {
	
	public static void main(String args[]) {
	
		String str1 = "helloeveryone";
		int hash[] = new int[26];
		char str[] = str1.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			
			hash[str[i] - 'a'] = (int)hash[str[i] - 'a'] + 1;
		}
		
		System.out.println("Printing the Frequency of the characters");
		for(int i=0;i<26;i++) {
			if(hash[i] != 0) {
				System.out.println((char)(i + 'a') + " - " + hash[i] );
			}			
		}
		
		System.out.println("\n Printing the duplicate chars");
		
		for(int i=0;i<26;i++) {
			if(hash[i] > 1) {
				System.out.println((char)(i + 'a') + " - " + hash[i] );
			}			
		}
	}	
}