import java.util.*;

class Random {
	
public static void main(String args[])
{
int guess;
Scanner sc = new Scanner(System.in);
Random rands = new Random();
int ans = rands.nextInt(11);
boolean istrue = true;
while (istrue) {
System.out.println("Guess a number between 1 and 10: ");
guess = sc.nextInt();
if (guess > ans) {
System.out.println("Too high, try again");
}
else if (guess < ans) {
System.out.println("Too low, try again");
}
else {
System.out.println("Yes, you guessed correctly!!");
istrue = false;
}
}
}
}
