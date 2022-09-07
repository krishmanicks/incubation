import java.util.*;

class Gradeavg {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
int e = sc.nextInt();

int total = (a + b + c + d + e);
float per = total/5;
System.out.println("Total is : " + total + " and average is : " + per);

if(per > 80) {
	System.out.println("Grade is: A+");
	}
else if(per >= 65 && per <= 80) {
	System.out.println("Grade is: A");
	}
else if(per >= 50 && per <= 65) {
	System.out.println("Grade is: B");
	}
else if(per >= 42 && per <= 50) {
	System.out.println("Grade is: C");
	}
else 
{
	System.out.println("Grade is: FAIL");
}
	
}
}