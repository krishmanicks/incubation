interface demo {
	int a = 5;
	public void display();
}

abstract class Dup {
	static int n1 = 10;
	Dup() {
		System.out.println("inside duplicate abstract class");
	}
	
	public void dis() {
		System.out.println("printing function directly using class");
	}
}

class Main1 extends Dup{
	
	public static void main(String args[]) {
		System.out.println(demo.a);
		new Main1().dis();
		System.out.println(Dup.n1);
		
	}
}