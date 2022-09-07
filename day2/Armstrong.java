import java.util.*;

public class Armstrong {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input an integer: ");
int number = sc.nextInt(); 
int temp = number;
int sum=0;
while(number > 0) {
	int rem = number%10;
	sum = sum + (rem *rem *rem);
	number = number/10;
	}
	if(sum == temp) {
	System.out.println("Armstrong Number");
	}
	else {
	System.out.println("Not an Armstrong Number");
	}
}
}