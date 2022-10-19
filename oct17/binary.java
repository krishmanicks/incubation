import java.util.*;

public class binary {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter base: ");
		int n = sc.nextInt();
		int sum=0, ra, rb;
		int ten = 1, ans =0, carry = 0;
		while(!(a==0 && b==0)) {
			ra = a%10;
			rb = b%10;
			a /= 10;
			b /= 10;
			sum = ra + rb + carry;
			if(sum >= n){
				carry = 1;
				ans += (sum%n) * ten;
			}
			else{
				carry = 0;
				ans += sum*ten;
			}
			ten *= 10;
		}
		System.out.println(ans);
		int temp = 1010;
		int te= 11001;
		System.out.println(Integer.toBinaryString(temp | te));
	}
}