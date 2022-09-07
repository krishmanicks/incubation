class acc {
	int no;
	double bal;
	String name;
	double aadhar;
	
	acc(int no, double bal, String name, double aadhar) {
		this.no = no;
		this.bal = bal;
		this.name = name;
		this.aadhar = aadhar;
	}
	
	public void show() {
		System.out.print("no- " + no + " ");
		System.out.print("bal- " + bal + " ");
		System.out.print("name- " + name + " ");
		System.out.println("aadhar- " + aadhar + " ");
		System.out.println();
	}
}

class Person extends acc {
	
	Person(int no, double bal, String name, double aadhar) {
		super(no, bal,name,aadhar);
	}
}

class Account {
	public static void main(String args[]) {
		Person p = new Person(12,1234,"krish",9876543);
		Person p1 = new Person(32,543,"jkn",456434);
		p.show();
		p1.show();
	}
}