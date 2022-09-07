import java.util.*;

class CreateAccount {
	
	int id;
	int acc_no;
	String name;
	char type;
	double balance;
	
	public void setData(int ids, String name, int acc_no, char type, double balance) {
		this.id = ids;
		this.name = name;
		this.acc_no = acc_no;
		this.type = type;
		this.balance = balance;
		
		System.out.println("created");
	}
	public void display()
	{
		System.out.println("person id is: " + id + " " + "and person's balance is: " + balance);
	}
	
	public void deposit(double amt)
	{
		balance = balance + amt;
		if(type == 'C') {
			balance =  (double)(balance - 0.10);
	}
	}
	
	public void withdraw(double amt)
	{
		if(amt > balance) {
			System.out.println("Insufficient balance");
		}
		else {
			balance = balance - amt;
			
			if(type == 'R') {
				if(balance < 500) {
				balance =  balance - 10.0;
			}
			}
			else if(type == 'C') {
				if(balance < 100) {
				balance =  balance - (10.0 + 0.10);
			}
			}
			else if(type == 'D') {
				balance =  balance - ((20*balance)/100);
			}
		}
	}	
	
}

class Bank {
	
	public static int ids = 1;
	public static int i = 0;
	
	public static void main(String args[]) throws NullPointerException {
		
		boolean istrue = true;
		CreateAccount []ca = new CreateAccount[10];
		Scanner sc = new Scanner(System.in);
		
		while(istrue) {
			System.out.println("1. Create Account");
			System.out.println("2. Check Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. monthly");
			System.out.println("6. Exit");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: {
					 System.out.println("Enter name, acc_no and type(R,I,C,D) and Deposit amount");
					 String n = sc.next();
					 int acc = sc.nextInt();
					 char type = sc.next().charAt(0);	
					 double bal = sc.nextDouble();
					 ca[i] = new CreateAccount();
					 ca[i].setData(ids,n,acc,type,bal);
					 i++;
					 ids++;			 
				}
				 break;
				
				case 2: 
				{
					System.out.println("Enter id number: ");
					int num = sc.nextInt();
					if(ca[num]!=null){
					ca[num].display();	
					}
					else 
						System.out.println("id not available");
				}
				break;
				
				case 3: 
				{
					System.out.println("Enter id number to deposit: ");
					int num = sc.nextInt();
					System.out.println("Enter the amount to deposit");
					double with = sc.nextDouble();
					ca[num].deposit(with);
				}
				break;
				
				case 4:
				{
					System.out.println("Enter id number to withdraw: ");
					int num = sc.nextInt();
					System.out.println("Enter the amount to withdraw");
					double with = sc.nextDouble();
					ca[num].withdraw(with);
				}
				break;
				
				case 5:
				{
					for(int j=0;j<i;j++) {
						if(ca[j].type == 'R') {
							ca[j].balance = ca[j].balance = ((10*ca[j].balance)/100);
						}
						else if(ca[j].type == 'I') {
							ca[j].balance = ca[j].balance - ((10*ca[j].balance)/100);
							ca[j].balance = ca[j].balance + ((7*ca[j].balance)/100);	
						}
						else if(ca[j].type == 'C') {
							ca[j].balance = ca[j].balance - ((10*ca[j].balance)/100);
							ca[j].balance = ca[j].balance + ((7*ca[j].balance)/100);	
						}
					else if(ca[j].type == 'D') {
							ca[j].balance = ca[j].balance - ((10*ca[j].balance)/100);
							ca[j].balance = ca[j].balance + ((15*ca[j].balance)/100);
						}
				}
				}
					break;
				case 6:
					istrue = false;
					break;
			}
		}
		
	}
}




