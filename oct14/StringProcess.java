import java.util.*;

class StringProcess {
	
	public static void hashing(String str) {
		int hash[] = new int[120];
		
		for(int i=0;i<str.length();i++) {
			int temp = str.charAt(i) - 'A';
			hash[temp]++;
		}

		
		for(int i=0;i<str.length();i++) {
			int temp = str.charAt(i) - 'A';
			if(hash[temp] > 0){
				System.out.print(str.charAt(i));
				System.out.print(hash[temp]);
				hash[temp] = 0;
			}
		}
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		hashing(str);
	}
}