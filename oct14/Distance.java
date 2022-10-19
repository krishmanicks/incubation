import java.util.*;

class Distance {
	
	public static void apply(String str, String word0, String word1) {
		
		int min = 999;
		int len = str.length();
		int j = 0;
		String dup[] = new String[len];
		String temp = "";
		
		for(int i=0;i<len;i++) {
			
			if(i == str.length()-1 && (str.charAt(i) >= 'a' && str.charAt(i)<= 'z')) {
				temp = temp + str.charAt(i);
				dup[j] = temp;
				break;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				temp = temp + str.charAt(i);
			}
			else if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' )) {
				if(!temp.equals("")) {
					dup[j] = temp;
					j++;
					temp = "";
				}
			}
		}
		
		for(int i=0;i<j;i++) {
			String d = dup[i];
			if(d.equals(word0)) {
				for(int k=0;k<j;k++) {
					String v = dup[k];
					if(v.equals(word1) && i!=k) {
						int s = Math.abs(i-k);
						if(s < min) 
							min = s;
					}	
				}
			}
		}
		if(min != 999)
			System.out.println(min-1);
		else
			System.out.println("-1");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String word0 = sc.next();
		String word1 = sc.next();
		
		apply(str,word0,word1);
	}
}