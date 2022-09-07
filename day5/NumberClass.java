import java.util.Scanner;

class Number
{
    protected int b;
    protected int a;
    
    public void read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = in.nextInt();
        b = in.nextInt();
    }
    
    public void display() {
        System.out.println("Number1 = " + a);
        System.out.println("Number2 = " + b);
    }
}
class NumberClass extends Number
{ 
	
	public void swap() {
		int temp = a;
		a = b;
		b = temp;
	}
	
    public static void main(String args[]) {
        NumberClass obj = new NumberClass();
        obj.read();
        obj.display();
        obj.swap();
        obj.display();
    }
}