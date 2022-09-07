class sample {
	int count = 0;
	int a = 5;
}

class Singleton {
	
	public static void main(String args[]) {
		
		sample s1 = new sample();
		System.out.println("a = " + s1.a);
	}
}