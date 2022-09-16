import java.util.*;

class GetIndex {
	
	public static void main(String args[]) {
		
		String str = "The quick brown cat";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ')
				System.out.println(str.charAt(i) + " - " + str.indexOf(str.charAt(i),i));
		}
	}
}