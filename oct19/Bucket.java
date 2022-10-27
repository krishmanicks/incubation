import java.util.*;

class Bucket {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> ar = new ArrayList<>();
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		String temp[] = str.split(" ");
						
		int spaces = temp.length-1;
		String space = " ";
		
		for(int i=0;i<temp.length;) {
			String adds = "";
			String s = temp[i];
			int len = s.length();
			if(len > n) {
				System.out.println("cannot do the operation");
				return;
			}
			if(len + 1 <= n+1 && i!= temp.length-1) {
				i++;
				adds = s + space;
				while(true) {
					if(i!= temp.length && (adds.length() + temp[i].length() + 1) <= n+1) {
							adds = adds + temp[i] + space;
							i++;
					}
					else 
						break;
				}
				ar.add(adds);
				//System.out.println(s);
			}
			else if(i == temp.length-1) {
				ar.add(s);
				i++;
			}
		}
		for(String strin: ar)
			System.out.println(strin);
	}
}