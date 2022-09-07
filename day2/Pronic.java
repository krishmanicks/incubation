import java.util.*;

public class Pronic {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input a range: ");
int lower = sc.nextInt(); 
int upper = sc.nextInt(); 
System.out.print("Pronic numbers between " + lower + " and " + upper + " are: ");

for(int i=lower;i<=upper;i++) {
	if(i * (i+1) > upper) {
			break;
	}
	System.out.print(i * (i+1) + " ");
}
}
}