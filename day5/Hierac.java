
class Vehicle {
	public void show() {
		System.out.println("inside vehicle");
	}
}

class Car extends Vehicle {
	public void show() {
		System.out.println("inside car");
	}
}

class Moto extends Vehicle {
	public void show() {
		System.out.println("inside Moto");
	}
}

class Hierac {
	public static void main(String args[]) {
		Car c = new Car();
		c.show();
		Moto m = new Moto();
		m.show();
	}
}