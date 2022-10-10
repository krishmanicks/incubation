import java.util.*;

class Anagram {
	
	public static boolean isEqual(int freq1[], int freq2[]) {
		
		for(int i=0;i<26;i++) {
			if(freq1[i] != freq2[i])
				return false;
		}
		return true;
	}
	
	
	
	public static void freq(String arr[], String s, int n) {
		
		int freq[] = new int[26];
		//int freq2[] = new int[26];

		for(int i=0;i<s.length();i++) {
			//s.charAt(i) = s.charAt(i).toLowerCase();
			int temp = (int) (s.charAt(i) - 'a');
			freq[temp]++;
		}
		
		
		for(int i=0;i<n;i++) {
			String temp = arr[i];
			int freq2[] = new int[26];
			for(int j=0;j<temp.length();j++) {
				int temp1 = (int)(temp.charAt(j) - 'a');
				freq2[temp1]++;
			}
			if(isEqual(freq,freq2))
				System.out.println(temp + " ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String arr[] = new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		String s = sc.next();
		
		freq(arr,s,n);
	}
}