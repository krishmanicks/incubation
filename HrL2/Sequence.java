import java.util.*;

class Sequence {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = Integer.toString(n);
		String number = "";
		
		for(int i=0;i<str.length();) {
			int count = 1;
			char temp = str.charAt(i);
			int j = i+1;
			while(j<str.length() && temp == str.charAt(j)) {
				count++;
				j++;
			}
			//System.out.print(count + "" +temp);
			i=j;
			String con = Integer.toString(count);

			String sum = Character.toString(temp);

			number = number + (con+ sum);
		}
		System.out.print(number);
	}
}