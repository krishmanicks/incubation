import java.util.*;

class Remove {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = "";
		
		for(int i=0;i<str1.length();i++) {
			char temp = str1.charAt(i);
			int j;
			for(j=0;j<str2.length();j++) {
				if(temp == str2.charAt(j)) {
					break;
				}
			}
			if(j == str2.length()) 
					str3 = str3 + temp;
		}
		System.out.println(str3);
	}
}