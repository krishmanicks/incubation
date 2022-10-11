import java.util.*;

class Paran {
	
	static Collection arry = new ArrayList();
	static int count = 0;
	
	public static void find(int n, String curr, int open, int close, int max) {
		
		if(curr.length() == max) {
			arry.add(curr);
			//System.out.println(curr);
		}
		
		if(open < n) {
			find(n,curr+"(", open+1, close,max);
		}
		if(open > close) {
			find(n, curr+")", open, close+1,max);
		}
	}
	
	public static void main(String args[]) {
		int n = 3;
		//int max = n*2;
		find(n,"",0,0, n*2);
		
		for(Object i: arry)
			System.out.println(i);
	}
}