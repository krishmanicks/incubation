import java.util.*;

class Power {
	
	public static void findPow(double base, int power) {
		
		double sum = 1;
		int temp = power;
		if(power > 0) {
			while(power > 0) {
				sum = (sum * base);
				power--;
			}
		}
		else {
			while(power < 0) {
				sum = (sum * base);
				power++;
			}
				sum = 1/sum;
		}
			
		System.out.println(sum);
	}
	
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base ");
		double base = sc.nextDouble();
		
		System.out.println("enter the power ");
		int power = sc.nextInt();
		
		findPow(base,power);
	}
}