class Shark {
	int len;
	String greet= "hello everyone";
	String color;
	
	
	Shark(int len, String greet, String color) {
		this.color = color;
		this.greet = greet;
		this.len = len;
		
	}
	
	public void greetings() {
		System.out.println(this.greet + " " );
	}
}

class Fish extends Shark {
	
	Fish(int len,String greet, String color) {
		super(len,greet,color);
	}
	public static void main(String args[]) {
		Fish f = new Fish(4,"jhfj gjd", "blue");
		f.greetings();
	}
}