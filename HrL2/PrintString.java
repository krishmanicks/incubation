import java.util.*;

class PrintString{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		int s = sc.nextInt();
		System.out.print("1 ");
		int prevNum = 1;
		String numNew = "1";
		
		while(s-- > 0){
			
			prevNum = Integer.parseInt(numNew);
			numNew = "";
			int prev = -1;
			int count = 0;
			while(prevNum != 0){
				
				if(prev == -1){
					prev =  prevNum%10;
					count = 1;
				}
				else{
					if(prev == prevNum%10){
						count++;
					}
					else{
						numNew = prev + numNew;
						numNew=count + numNew;
						prev = prevNum%10;
						count = 1;
					}
				}
				prevNum /= 10;
			}
			numNew = prev + numNew;	
			numNew = count + numNew;
			prev = prevNum%10;
			System.out.print(numNew+" ");
		}
	}
}