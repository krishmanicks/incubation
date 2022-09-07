class Copyconst {
	int i;
	int j;
	
	public Copyconst(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Copyconst(Copyconst c) {
		System.out.println("Copy Constructor");
		this.i = c.i;
		this.j = c.j;
	}
	
	public static void main(String args[]) {
		Copyconst c1 = new Copyconst(5,6);
		Copyconst c2 = new Copyconst(c1);
		Copyconst c3 = c2;
		c2.i = 10;
		c2.j = 20;
		System.out.println(c1.i + " " + c1.j);
		System.out.println(c2.i + " " + c2.j);
		System.out.println(c3.i + " " + c3.j);
	}
}