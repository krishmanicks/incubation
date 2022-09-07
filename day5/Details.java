class Vehicle {
	
	int no_of_seats;
	int no_of_wheels;
	
	Vehicle(int seats, int wheels) {
		no_of_seats = seats;
		no_of_wheels = wheels;
	}
}

class Car extends Vehicle {
	Car(int seats, int wheels) {
		super(seats,wheels);
	System.out.println("The car details is " + no_of_seats + "seats " + no_of_wheels + " wheels");
		}
}

class MotorCycle extends Vehicle {
	MotorCycle(int seats, int wheels) {
		super(seats,wheels);
	System.out.println("The MotorCycle details is " + no_of_seats + " seats " + no_of_wheels + " wheels");
		}
}

class Details {
	public static void main(String args[]) {
	new Car(5,4);
	new MotorCycle(2,2);
	}
}