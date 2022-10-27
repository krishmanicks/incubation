import java.util.*;

class Sherlock {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	 	HashMap<Character,Integer> hash= new HashMap<Character,Integer>();

		String str = sc.next();
		
		int count=0;
		int len = str.length();
		for(int i=0;i<len;i++)
		{
			if(hash.containsKey(str.charAt(i)))
			{
				hash.put(str.charAt(i),hash.get(str.charAt(i)) + 1);
			}
			else
			{
				hash.put(str.charAt(i),1);
				count++;
			}
		}
		if(len % count <= 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}