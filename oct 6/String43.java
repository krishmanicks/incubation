import java.util.*;

class Palin {
	
	public static boolean isPalin(int num) {
		int r,sum=0,temp;     
  
		temp = num;    
		while(um>0) {    
		   r = num%10; 
		   sum = (sum*10) + r;    
		   num = num/10;    
		}    
		if(temp ==sum )    
		   return true;  
		else    
		   return false;   
	} 

	
	public static void pal(String Str) {
		int temp = Integer.parseInt(str);
		
		while(true) {
			temp = Integer.toString(temp);
			if(isPalin(temp)) {
				System.out.println(temp)
				return;
			}
			temp++;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextInt();
		
		pal(n);		
	}
}