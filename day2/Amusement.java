import java.util.*;

class Amusement {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
float base_price = (float)30.00;
boolean istrue = true;
String country;
String count = "warren";
while(istrue) {
	
System.out.println("\n\nEnter a choice : ");
System.out.println("1. Book");
System.out.println("2. Exit");
int ch = sc.nextInt();

switch(ch) {
	case 1:
	{
		System.out.println("Enter country, age  and the ticket price: ");
		country = sc.next();
		int age = sc.nextInt();
		float price = sc.nextFloat();
		if(age < 5) {
			price = 0;
			System.out.println(price);
		}
		else if(age >= 65) {
			if(country == count) {
				price = (float)30.0;
			}
			else {
				price = (float)40.0;
			}
			System.out.println("$" + (float) (0.5)*price);
		}
		else {
			if(country == count) {
				price = (float)30.0;
			}
			else {
				price = (float)40.0;
			}
			System.out.println("$" + (float) price);
		}
	}
			break;
		
	case 2:
		istrue = false;
		break;		
}

}
}
}