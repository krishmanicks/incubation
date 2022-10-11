import java.util.*;

class Egg {
	
	public static int find(int k) {
		int count = 0;
		
		if(k == 2 || k== 1) {
			return k;
		}
		
		for(int i=1;i<k;i++) {
			
			if((i*(i+1))/2 == k) 
				return i;
			
			if((i*(i+1) / 2) > k) 
				return i;
		}
		return 0;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		System.out.println(find(k));
	}
}


