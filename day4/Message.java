abstract class Parent {
		abstract public void message();
}

class Subclass1 extends Parent {
	
	public void message() {
		System.out.println("This is first sub class");
	}
}

class Subclass2 extends Parent {
	
	public void message() {
		System.out.println("This is second sub class");
	}
}

class Message {
	
	public static void main(String args[]) {
		
		Subclass1 s1 = new Subclass1();
		Subclass2 s2 = new Subclass2();
		s1.message();
		s2.message();
	}
}