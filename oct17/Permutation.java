import java.util.*;

class Permutation {
	
	
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		String str = new String(charArray);
		return str;
	}
	
	
	public static void permute(String str, int l, int r, boolean vis[])
	{
		if (l == r) {
			System.out.println(str);
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r, vis);
				//str = swap(str,l,i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int n = str.length();
		boolean vis[] = new boolean[26];
		Arrays.fill(vis, false);
		
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i));
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i!=j) {
					System.out.println(str.charAt(i) + "" + str.charAt(j) );	
				}
			}
		}
		permute(str, 0, n-1, vis);
	}

}

