import java.util.*;

class LeapYearDecider
{
	 boolean isLeapYear(int yr)
	 {
	 if (yr%400 !=0)
	 {
	 if((yr%4==0) && (yr%100 !=0))
	 {
	 return true;
	 }
	 else
	 return false;
	 }
	 return true;
	 }
}
public class LeapYear {
	 public static void main(String args[])
	 {

	 System.out.print("Enter an year\n\n ");
	 Scanner sc = new Scanner( System.in);
	 int input = sc.nextInt();

	 LeapYearDecider ob = new LeapYearDecider();
	 System.out.print( input +" is a leap year ? " + ob.isLeapYear(input));
	 }
}