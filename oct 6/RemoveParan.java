import java.util.*;

class RemoveParan {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int open=0,close=0,count;
		char temp[] = str.toCharArray();
		
		int i =0,j = str.length()-1;
		
		while(i!=str.length() && j>=0) {
			if(temp[i] == '(') {
				open++;
			}
			else if(temp[i] == ')') {
				open--;
			}
			if(temp[j] == ')') {
				close++;
			}
			else if(temp[j] == '(') {
				close--;
			}
			
			if(open == -1) {
				temp[i] = '0';
				open = 0;
			}
			if(close == -1) {
				temp[j] = '0';
				close = 0;
			}
			i++;
			j--;
		}
		
		for(char k: temp) {
			if(k != '0') {
				System.out.print(k);
			}
		}
	}
}