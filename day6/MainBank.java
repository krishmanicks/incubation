class Bank {
	 int bCode() {
		 return 0;
	 }
}

class Hdfc extends Bank{
	public int bCode() {
		return 987;
	}
}

class Icici extends Bank{
	public int  bCode() {
		return 234;
	}
}

class Sbi extends Bank {
	public int bCode() {
		return 123;
	}
}


class MainBank {
	
	public static void main(String args[]) {
		Hdfc hd = new Hdfc();
		Icici ic = new Icici();
		Sbi sb = new Sbi();
		System.out.println("HDFC " + hd.bCode());
		System.out.println("ICICI " + ic.bCode());
		System.out.println("SBI " + sb.bCode());
	}
}