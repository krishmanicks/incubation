import java.util.*;

class Prime {
	
	static boolean check(int num) {
		for (int i = 2; i <= num / 2; i++) {

		  if (num % i == 0) {
			return false;
		  }
		}
		return true;
	}
	
	static void checkPrime(int num) {

		int i=2, j = num-2;
		boolean istrue = false;
		while(i<=j) {
			
			if(!istrue) {
				if(check(i) == true) {
					istrue = true;		
					
				}
				else  {
					i++;
				}
			}
			
			if(istrue == true) {
				if(check(j) == true) {
					if(i+j == num) {
						System.out.println(i + "\t" + j);
						istrue = false;
						return;
					}
					else{
						istrue = false;
						i++;
					}
				}
					else {
						j--;
					}
				}
			}
		}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases ");
		int t = sc.nextInt();
		int z = t;
		int arr[] = new int[t];
		int i=0;
		while(t > 0) {
			System.out.println("Enter input ");
			arr[i] = sc.nextInt();
			i++;
			t--;
		}
		for(int k=0;k<z;k++) {
			checkPrime(arr[k]);
		}
	}
}