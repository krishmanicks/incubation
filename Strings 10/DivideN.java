import java.util.*;

class DivideN {
	
	static void divide(String str, int n ) {
		
		int size = str.length();
		
		if(size % n == 0) {
			  System.out.println("Invalid Input: String size is not divisible by n");
            return;
		}
	}
	
	public static void main(String aargs[]) {
		
		String str = "Ravi has been fired from incubation";
		divide(str,3);
	}
}