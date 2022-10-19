import java.util.*;

class printPattern {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = Integer.toString(n);
		
		String number = "1";
		System.out.println(number);
		
		while(n > 1) {
		
			String numtemp = "";
			for(int i=0;i<number.length();) {
				int count = 1;
				char temp = number.charAt(i);
				int j = i+1;
				
				while(j<number.length() && temp == number.charAt(j)) {
					count++;
					j++;
				}

				i=j;
				String con = Integer.toString(count);

				String sum = Character.toString(temp);
				
				numtemp = numtemp + (con + sum);
			}
			number = numtemp;
			System.out.println(numtemp);
			n--;
		}
	}
}