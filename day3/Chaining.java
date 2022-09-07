class Chaining {
	
	Chaining() {
		this("manicks");
		System.out.println("default ");
	}
	Chaining(String n) {
		System.out.println(n);
	}

	public static void main(String args[]) {
		Chaining ch = new Chaining();
	}
}