class Factorial
{
	 int fact;
	 int recursively(int i)
	 {
		 fact = 1;
		 if( i == 1 || i == 0)
			return 1;
		else
		{
			fact = i * recursively(i-1);
			return fact;
		}
	 }
	 int iteratively(int i)
	 {
	 if( i== 1 || i == 0)
	 {
		return 1;
	 }
	 else
	 {
		fact=1;
		 for(int j=1;j<=i; j++)
		 {
			fact=fact*j;
		 }
		return fact;
	 }
	 }
}
public class FactorialEx {
 public static void main(String args[])
 {
 Factorial factOb = new Factorial();
 System.out.println("Factorial of 7 is :"+ factOb.recursively(7));
 
 System.out.println("Factorial of 6 is :"+ factOb.iteratively(6));
 }

 }