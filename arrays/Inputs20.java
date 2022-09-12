import java.util.*;

class Inputs20 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[20];
		int odd = 0;
		int even = 0;
		int pos = 0 ;
		int neg = 0;
		
		System.out.println("Enter 20 numbers ");
		
		for(int i=0;i<20;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0)
				even++;
			else 
				odd++;
			
			if(arr[i] > 0)
				pos++;
			else
				neg++;
		}
			
			System.out.println("positive " + pos);
			System.out.println("negative " + neg);
			System.out.println("even " + even);
			System.out.println("odd " + odd);		
	}
}
