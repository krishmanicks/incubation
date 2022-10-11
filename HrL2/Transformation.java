import java.util.*;

class Transformation {
	
	public static void trans(String str) {
		
		char s[] = str.toCharArray();
		int z = 'Z';
		
		for(int i=0;i<s.length;i++) {
			int temp = s[i] - 'A';
			System.out.print((char)(z - temp));
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
		trans(str);
	}
}