import java.util.*;

class Power {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int sum = a;
int temp = b;
int ans = a;
while(b != 1 ) {
ans = ans * a;
b = b-1;
System.out.println("b = " + b);
}
System.out.println("The value of " + sum + " raised to the power " + temp  + " is : " + ans);
}
}