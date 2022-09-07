import java.util.*;

class Arm {

int num;

public void getNum(int x) {
num = x;
}

public int checkArmstrong() {
	int sum = 0;
	int n = num;
	while(n > 0) {
		int rem = n%10;
		sum = sum + (rem * rem * rem);
		n/=10;
	}
	if(sum == num) {
		return 1;
	}
	return 0;
}
}

class Armstrong {

public static void main(String[] s) {

Arm arms = new Arm();
int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive integer number: ");
n = sc.nextInt();

arms.getNum(n);
if(arms.checkArmstrong() == 1)
System.out.println("It is Armstrong number ");
else 
	System.out.println("It is not a Armstrong number ");
}
}
