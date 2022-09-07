abstract class com {
	abstract public void sum(double r1, double r2, double i1, double i2);
	abstract public void diff(double r1, double r2, double i1, double i2);
	abstract public void prod(double r1, double r2, double i1, double i2);
}

class Calculate extends com {
	public void sum(double r1, double r2, double i1, double i2) {
		System.out.println("sum is :" + (r1 + r2) + " " + (i1+i2) + "i");
	}
	
	public void diff(double r1, double r2, double i1, double i2) {
		System.out.println("difference is :" + (r1 - r2) + " " + (i1-i2) + "i");
	}
	
	public void prod(double r1, double r2, double i1, double i2) {
		System.out.println("Product is :" + ((r1 * r2) - (i1*i2)) + " " + (r1*i2) + (r2*i1));
	}
}

class Complex {
	
	public static void main(String args[]) {
		
			Calculate cal = new Calculate();
			cal.sum(2,3,2,-2);
			cal.diff(2,3,2,-2);
			cal.prod(2,3,2,-2);
	}
}