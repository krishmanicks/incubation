import java.util.*;

abstract class BankAccount {
	Scanner sc = new Scanner(System.in);
	int acc_no;
	String name;
	double balance = 0.0;
	BankAccount(String name, int acc_no,  double balance) {
		this.name = name;
		this.acc_no = acc_no;
		this.balance = balance;
	}
	BankAccount(String name, int acc_no) {
		this.name = name;
		this.acc_no = acc_no;
	}
	
	public void getBalance() {
		System.out.println("Balance is " + balance);
	}
	public void deposit(double amt) {
		balance = balance + amt; 
	}
	public void withdraw(double amt) {
		if(amt > balance) {
			System.out.println("Insufficient balance");
			return;
		}
		balance = balance - amt; 
	}
}

class CheckingAccount extends BankAccount {
	CheckingAccount(String name, int acc_no,  double balance) {
		super(name, acc_no, balance);
	}
	CheckingAccount(String name,int acc_no) {
		super(name, acc_no);
	}
}
class SavingsAccount extends BankAccount {
	double interestrate;
	
	SavingsAccount(String name, int acc_no, double balance) {
		super(name, acc_no, balance);
	}
	SavingsAccount(String name,int acc_no) {
		super(name, acc_no);
	}
	
	public void addCompoundInterest() {
		balance =  balance + (balance * 0.3 / 100.0 );
	}
}

class Banking1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;
		int num1 = 1;
		int num2 = 1;
		double amt;
		int id;
		int count = 1;
		char types;
		SavingsAccount sa[] = new SavingsAccount[10];
		CheckingAccount ca[] = new CheckingAccount[10];
		while(istrue) {
			if(count >2 ) {
				ca[num2-1].balance = ca[num2-1].balance - 3.0;
			}
			System.out.println("-------- Welcome to Banking ------");
			System.out.println("Enter the choice: ");
			System.out.println("1. create ");
			System.out.println("2. withdraw ");
			System.out.println("3. deposit");
			System.out.println("4. transaction" );
			System.out.println("5. monthly" );
			System.out.println("6. exit" );
			
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: {
					String name;
					int acc_no;
					double balance;
					System.out.println("Enter the type: ");
					System.out.println("1. SavingsAccount");
					System.out.println("2. CheckingAccount");
					int type = sc.nextInt();
					System.out.println("enter 1 for with balance and 0 for no balance");
					int isbal = sc.nextInt();
					if(type == 1 ) {
						if(isbal == 1) {
							System.out.println("enter name, acc_no and balance");
							name = sc.next();
							acc_no = sc.nextInt();
							balance = sc.nextDouble();
							sa[num1] = new SavingsAccount(name,acc_no,balance);
							num1++;
						}		
						else {
							System.out.println("enter name, acc_no");
							name = sc.next();
							acc_no = sc.nextInt();
							sa[num1] = new SavingsAccount(name,acc_no);
							num1++;
						}	
					}
					else {
						if(isbal == 1) {
							System.out.println("enter name, acc_no and balance");
							name = sc.next();
							acc_no = sc.nextInt();
							balance = sc.nextDouble();
							ca[num2] = new CheckingAccount(name,acc_no,balance);
							num2++;
						}		
						else {
							System.out.println("enter name, acc_no");
							name = sc.next();
							acc_no = sc.nextInt();
							ca[num2] = new CheckingAccount(name,acc_no);
							num2++;
						}	
					}
				}
				break;
				case 2: 
					System.out.println("enter the withdraw amount");
					amt = sc.nextInt();
					System.out.println("Enter the type(C, S) and the id number");
					types = sc.next().charAt(0);
					id = sc.nextInt();
					if(types == 'c') {
						count++;
						ca[id].withdraw(amt);
						ca[id].getBalance();
					}
					else
					{
						sa[id].withdraw(amt);
						sa[id].getBalance();
					}
					break;
				
				case 3: 
					System.out.println("enter the deposit amount");
					amt = sc.nextInt();
					System.out.println("Enter the type(C, S) and the id number");
					types = sc.next().charAt(0);
					id = sc.nextInt();
					if(types == 'c') {
						ca[id].deposit(amt);
					count++;
					ca[id].getBalance();
					}
					else
					{
						sa[id].deposit(amt);
						sa[id].getBalance();
					}
					
					break;
				case 5:
					sa[num1-1].addCompoundInterest();
					break;
				case 4: 
					System.out.println("enter the from account(s or C)and to account and the amount");
					char from = sc.next().charAt(0);
					char to = sc.next().charAt(0);
					amt = sc.nextDouble();
					if(from == 'c') {
						ca[num2-1].balance = ca[num2-1].balance - amt;
						sa[num1-1].balance = sa[num1-1].balance + amt;	
					}
					else{
						ca[num2-1].balance = ca[num2-1].balance + amt;
						sa[num1-1].balance = sa[num1-1].balance - amt;	
					}
					break;
					
				case 6:
					istrue = false;
					break;
			}
		}
	}
}