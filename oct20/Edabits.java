import java.util.*;

class Edabits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.replaceAll("\\s", "");
		
		int len = str.length();
		
		int row = 0;
		int col = 0;
		
		for(int i=2;i<len;i++) {
			if(i*i >= len) {
				row = i;
				col = i;
				break;
			}
			if(i*i < len && (i+1)*(i+1) >= len) {
				row = i;
				col = i+1;
				break;
			}
		}

		int i = 0;
		int j = 0;
		int temp = col;
		while(temp > 0) {
			System.out.print(str.charAt(i));
			if(i + col < len)
				i+=col;
			else 
			{
				j++;
				temp--;
				i = j;
				System.out.print(" ");
			}
		}
	}
}