import java.util.*;

class Youtube {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int len = str.length()-1;
		//String temp[] = new String[;
		String temp = "";
		
		for(int i=len;i>=0;i--) {
			if(str.charAt(i) == '/' || str.charAt(i) == '=' )
				break;
			temp = str.charAt(i) + temp;
		}
		System.out.println(temp);
	}
 }