import java.util.*;

class MinAndMax {
	
	public static void main(String args[]) {
		
		String str1 = "grass is greener on the other side";
		
		int hash[] = new int[26];
		int min = Integer.MAX_VALUE,max = 0;
		str1 = str1.replaceAll(" ", "");  
		char str[] = str1.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i] >= 'a' && str[i] <= 'z') {
				
			hash[str[i] - 'a'] = (int)hash[str[i] - 'a'] + 1;
				if(max < hash[str[i] - 'a'])
					max = i;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(hash[i] != 0) {
				if(min > hash[i]) {
					min = i;
				}
			}
			
		}
		System.out.println(Arrays.toString(hash));
		System.out.println("min = " + (char) (min +'a'));
		System.out.println("max = " + str[max]);
	}
}