class Member {
	String name,address;
	int age, number;
	double salary;
	
	Member(String name, String address, int age, int number, double salary) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.age = age;
		this.salary = salary;
	}	
	
	public void printSalary() {
		System.out.println("salary is " + salary);
	}
}

class Emp extends Member {
	String specialization = "core";
	Emp(String name, String address, int age, int number, double salary) {
		super( name,  address,  age,  number,  salary);
	}
	public void spec() {
		
		System.out.println("Spe in emp = " + specialization);
	}
	
}

class Manager extends Member {
	String department = "HR";
	Manager(String name, String address, int age, int number, double salary) {
		super( name,  address,  age,  number,  salary);
		System.out.println("department = " + department);
	}
	
}

class Employee {
	public static void main(String args[]) {
		Emp e = new Emp("krish", "gfhdjc sd" , 23,1234567,60000);
		Manager m = new Manager("manicks", "hello sd" , 43,9876543,120000);
		e.printSalary();
		m.printSalary();
		e.spec();
	}
}

