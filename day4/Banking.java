import java.util.*;

abstract class Bank {
	int balance;
	abstract public int getBalance();
}

class A extends Bank {
	
	public int getBalance() {
		balance = 1000;
		return balance;
	}
}

class B extends Bank {

	public int getBalance() {
		balance = 1500;
		return balance;
	}
}

class C extends Bank {
	
	public int getBalance() {
		balance = 2000;
		return balance;
	}
}

class Banking {
	
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println("A - " + a.getBalance());
		System.out.println("B - " + b.getBalance());
		System.out.println("C - " + c.getBalance());
	}
	
}

