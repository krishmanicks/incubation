import  java.util.*;

class Diamond {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter number :");
int j;
int n = sc.nextInt();

for(int i=1;i<=n;i++) {
int white = n - i;
	for(j =0;j<white;j++) {
		System.out.print(" ");
	}
	for(j =1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
for(int i=n;i>=1;i--) {
int white = n - i;
for(int j =white;j>0;j--) {
		System.out.print(" ");
	}
	for(int j =1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
}
}