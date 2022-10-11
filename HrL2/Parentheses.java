import java.util.*;
class Parantheses {
	
		public static String rev(String s) {
		
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			
			if(s.charAt(i)==')') {
				t += '(';
			}
			else {
				t += ')';
			}
		}
		return t;
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		String str = "";
		String last = "";
		
		for(int i=0;i<n*2;i++) {
			if(i<n){
				str += '(';
			}
			else{
				str += ')';
			}
			if(i%2==0){
				last+='(';
			}
			else{
				last += ')';
			}
		}

		int j=1;
		HashSet<String> set = new HashSet<>();
		
		set.add(str);
		for(int i=n;i<(n*2)-1;i++){
			String temp = str.substring(0,i)+str.substring(i+1);

			String ans = temp.substring(0,j)+')'+temp.substring(j);

			set.add(ans);
			set.add(rev(ans));
			j++;
		}
		set.add(last);
		
		for(String s:set){
			System.out.println(s);
		}
	}
}