import java.util.*;

class Palin {

int num;

public void getNum(int x) {
num = x;
}

public int checkPalindrome() {
	int sum = 0;
	int n = num;
	while(n > 0) {
		int rem = n%10;
		sum = sum*10 + rem;
		n/=10;
	}
	if(sum == num) {
		return 1;
	}
	return 0;
}
}

class Palindrome {

public static void main(String[] s) {

Palin pal = new Palin();
int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a positive integer number: ");
n = sc.nextInt();

pal.getNum(n);
if(pal.checkPalindrome() == 1)
System.out.println("It is  palindrome ");
else 
	System.out.println("It is not a palindrome ");
}
}
