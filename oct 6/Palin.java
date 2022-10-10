import java.util.*;

class Palin {
	
	public static boolean isPalin(int num) {
		int sum=0;     
		int temp = num;    
		while(num>0) {    
		  int r = num%10;
		   sum = (sum*10) + r;    
		   num = num/10;    
		}    
		if(temp ==sum )    
		   return true;  
		else    
		   return false;   
	} 

	
	public static void pal(String str) {
		
		int temp = Integer.parseInt(str);
		
		while(true) {
			if(isPalin(temp)) {
				System.out.println(temp);
				return;
			}
			temp++;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		pal(n);		
	}
}