import java.util.*;

class UpperLower {
	
	public static void main(String args[]) {
		
		String s1 = "Poda Andha AAndavane Namma Pakkam";
		StringBuffer str = new StringBuffer(s1);
		
		for(int i=0;i<s1.length();i++) {
			if(Character.isLowerCase(s1.charAt(i))) {
				str.setCharAt(i,Character.toUpperCase(s1.charAt(i)));
			}
			else if(Character.isUpperCase(s1.charAt(i))) {
				str.setCharAt(i,Character.toLowerCase(s1.charAt(i)));
			}
		}
		System.out.println(str);
	}
}