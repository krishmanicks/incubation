import java.util.*;

class Mono {
	
	public static void digit(String str) {
		int mainHash[] = new int[20];
		
		int j = 1;
		int i = 0;
		int len = str.length();
		int count = 0;
		if(len%2 == 0) {
			count = len/2;
			while(j < len) {
				int temp1 = Integer.valueOf(str.charAt(i)) - 48;
				if(mainHash[temp1] == 0)
					mainHash[temp1]++;
				
				int tem = Integer.valueOf(str.charAt(j)) - 48;
				int add = temp1 + tem;
				int minus = Math.abs(temp1 - tem);
				mainHash[add]++;
				mainHash[minus]++;			
				i+=2;
				j+=2;
			}
		}
		else {
			mainHash[Integer.valueOf(str.charAt(i)) - 48]++;
			i++;
			j++;
			count = len/2 + 1;
			while(j < len) {
				
				int temp1 = (Integer.valueOf(str.charAt(i)) - 48);
				if(mainHash[temp1] == 0)
					mainHash[temp1]++;
				
				int tem = (Integer.valueOf(str.charAt(j)) - 48);
				int add = temp1 + tem;
				int minus = Math.abs(temp1 - tem);
				mainHash[add]++;
				mainHash[minus]++;

				i+=2;
				j+=2;
			}
		}
		int flag = 0;
		for(int k=0;k<10;k++) {
			if(count == mainHash[k])
				while(mainHash[k] > 0) {
					System.out.print(k+"");
					mainHash[k]--; 
					flag = 1;
				}
				if(flag == 1)
					break;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		digit(str);
	}
}