class Add {
	public void addition(int a , int b) {
		System.out.println(a + b);
	}
	
	public void addition(int a , int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void addition(double a , double b) {
		System.out.println(a + b);
	}
}


class Overload {
	public static void main(String args[]) {
		Add a = new Add();
		a.addition(3,5);
		a.addition(4,5,6);
		a.addition(4.5,6.0);
	}
}