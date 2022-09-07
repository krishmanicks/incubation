import java.util.*;

public class PrimeRecursive {

static int CheckPrime(int i,int num)
{
if(num == i)
return 0;
else
if(num%i == 0)
return 1;
else{
return CheckPrime(i+1,num);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Number:");
int num = sc.nextInt();

if(CheckPrime(2,num) == 0)
System.out.print("It is a Prime Number.");
else
System.out.print("It is not a Prime Number.");
}
}
