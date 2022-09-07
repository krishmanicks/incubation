import  java.util.*;

class UserNumber {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

int positive=0, negative = 0, zeroes = 0;

while(true) {
	System.out.println("Enter -1 to quit\n");
	System.out.print("Enter number : ");
	
	int n = sc.nextInt();

	if(n == -0) {
		break;
	}
	else if(n > 0) {
		positive = positive + 1;
	}
	else if(n < 0) {
		negative = negative +1;
	}
	else {
		zeroes = zeroes + 1;
	}
}
	System.out.println("Number of positive Numbers entered: " + positive);
	System.out.println("Number of negative Numbers entered: " + negative);
	System.out.println("Number of zeroes Numbers entered: " + zeroes);
}
}