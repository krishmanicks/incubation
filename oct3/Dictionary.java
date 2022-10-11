import java.util.*;

class Dictionary {
	
	public static boolean find(String arr[], String n) {
		
		System.out.println(n);
		for(int i=0;i<arr.length;i++) {
			if(n.equals(arr[i]))
				return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream","man", "go","mango"};
		int v = 0;
		String str = sc.next();
		String n = "";

		char temp[] = str.toCharArray();
		if(find(arr,str))  {
			System.out.println("Yes");
		}
		else {
				n+=temp[0];
			for(int i=0;i<temp.length;i++) {
				
				if(find(arr,n)){
					if(i == temp.length-1) {
						System.out.println("yes");
						v = 1;
						break;
					}
					n = "";
					i--;
				}
				else {
					n+=temp[i];
				}
			}
			if(find(arr,n)){
				System.out.println("yes");
				v = 1;
			}
		}
		if(v == 0)
			System.out.println("No");
	}
}