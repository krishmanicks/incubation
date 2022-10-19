import java.util.*;

class Agent {
	
	static int zids = 1;
	static double totalZcoins = 0;
	static double total_commissions = 0;
	static Scanner sc = new Scanner(System.in);
	String email = "krish@zoho.com";
	String pass = "12345";
	static double rate = 2;
	
	static HashMap<Integer, Account> allUsers = new HashMap<Integer, Account>();
	static HashMap<Integer, Account> pending = new HashMap<Integer, Account>();
	static ArrayList<Integer> ids = new ArrayList<Integer>();
	
	public void setDetails(int num, Account acc) {
		ids.add(num);
		pending.put(num,acc);
	}
	
	public void acceptReject() {
		
		if(ids.size() == 0) {
			System.out.println("no pending requests ");
			return;
		}
		
		System.out.println("Enter the id number to accept or reject ");	
		int idnum = sc.nextInt();
		System.out.println("Enter 1 to accept and 0 to reject ");
		int ch = sc.nextInt();
		
		boolean flag = false;
		if(ch == 1) {
			Account ac = pending.get(idnum);
			Users u = new Users();
			ac.zid = zids;
			zids++;
			allUsers.put(idnum,ac);
			u.setUsers(idnum,ac);
		}
		ids.remove((Integer)idnum);
		pending.remove(idnum);
		System.out.println("operation done successfully");
	}
	
	public static void AgentLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		Agent ag =  new Agent();
		String email = "";
		String password = "";
		while(true) {
			System.out.println("enter emailID and password ");
			email = sc.next();
			password = sc.next();
			if(!(ag.email.equals(email) && ag.pass.equals(password))) {
				System.out.println("email or password wrong \n");
				email = "";
				password = "";
			}
			else {
				break;
			}
		}
		System.out.println("\nWelcome " + email + "  Agent\n ");
		
		boolean istrue = true;
		while(istrue) {
			System.out.println("1. see pending requests ");
			System.out.println("2. accept or reject ");
			System.out.println("3. view total commissions received ");
			System.out.println("4. view total zcoins present in the universe ");
			System.out.println("5. view all transactions in the universe ");
			System.out.println("6. back ");
			int ch = sc.nextInt();
			
			if(ch == 1)
				ag.pendreq();
			else if(ch == 2)
				ag.acceptReject();
			else if(ch == 6)
				istrue = false;
			else if(ch == 4) {
				System.out.println("total totalZcoins present is - " + totalZcoins);
			}
			else if(ch == 3) {
				System.out.println("total commissions received is - " + total_commissions);
			}
			else if(ch == 5) {
				System.out.println(" ALl transactions are ");
				Users u = new Users();
				
				for(String st:u.transactions)
					System.out.println(st);
				
			}
		}
		
	}
	
	public void pendreq() {

		if(pending.size() == 0) {
			System.out.println("\nno pending requests \n");
			return;
		}
		System.out.println("\nThe pending reqs are ");
		for(int i: ids) {
			System.out.println();
			Account a = pending.get(i);
			System.out.println(a.h_id);
			System.out.println(a.fullname);
			System.out.println(a.emailId);
			System.out.println(a.mobile_num);
			System.out.println(a.rcDeposit);
			System.out.println("----------------------");
		}
	}
}

class Account {
	
	static int id = 1;
	String fullname;
	String emailId;
	String mobile_num;
	int h_id;
	String password;
	double rcDeposit;
	double zcoins;
	int zid = 0;
	double commissions;
	ArrayList<String> transact = new ArrayList<String>(); 
	
	public Account(String fullname, String emailId, String mobile_num, String password, double rcDeposit) {
		this.fullname = fullname;
		this.emailId = emailId;
		this.mobile_num = mobile_num;
		this.password = password;
		this.rcDeposit = rcDeposit;
		h_id = id++;
		zcoins = 0;
		this.transact = new ArrayList<String>();
	}	
}

class Users {
	
	static HashMap<Integer, Account> userDetails = new HashMap<Integer, Account>();
	static ArrayList<Integer> userid = new ArrayList<Integer>();
	static ArrayList<String> transactions = new ArrayList<String>();
	
	public void setUsers(int num, Account acc) {
		userDetails.put(num,acc);
		userid.add(num);
	}
	
			
		public static void deposit(double amount, Account ad) {
			String str = "Deposited " + amount + " from zid - " + ad.zid;
			ad.rcDeposit += amount;
			ad.transact.add(str);
			System.out.println("deposited successfully ");
			transactions.add(str);
		}
		
		public static void withdraw(double amount, Account ad) {
			if(amount <= ad.rcDeposit) {
				String str = "withdrawn " + amount + " from zid - " + ad.zid;
				ad.rcDeposit -= amount;
				System.out.println("deposited successfully ");
				transactions.add(str);
				ad.transact.add(str);
			}
			else {
				System.out.println("not enough money ");
			}
		}
		
		public static void convert(Account a, int amt) {
			if(a.rcDeposit == 0) {
				System.out.println("not enough money ");
			}
			else {
				String str = "converted " + amt  + " to Zcoins from zid - " + a.zid;
				a.zcoins = amt / Agent.rate;
				a.rcDeposit -= amt;
				a.transact.add(str);
				Agent.totalZcoins += a.zcoins;
			}
		}
		
		public static void transfer(int zid, Account a, double amt) {
			Account temp = null;
			boolean flag = false;
			for(int i: userid) {
				temp = userDetails.get(i);
				if(temp.zid == zid) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println("Wrong zid ");
				return;
			}
			if(a.zcoins < amt) {
				System.out.println("no coins ");
				return;
			}
			temp.zcoins += amt;
			a.zcoins = a.zcoins - amt;
			String st = "Received " + amt + " Zcoins  from zid " + a.zid;
			String str = "transferred " + amt + " zcoins from zid " + a.zid + " to zid " + zid;
			transactions.add(str);
			temp.transact.add(st);
			a.transact.add(str);
			System.out.println("transferred successfully ");
		}
	
	public static void loginUser() {
	
		if(userid.size() == 0) {
			System.out.println("no users to login ");
			return;
		}
		Scanner sc = new Scanner(System.in);
		String email = "";
		String password = "";
		Account a = null;
		while(true) {
			System.out.println("enter emailID and password ");
			email = sc.next();
			password = sc.next();
			boolean flag = false;
			for(int i: userid) {
				a = userDetails.get(i);
				if(a.emailId.equals(email) && a.password.equals(password)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				a = null;
				System.out.println("email or password incorrect ");
			}
			else 
				break;
		}
		System.out.println("\nWelcome " + a.fullname + "    User\n ");
		
		boolean istrue = true;
		while(istrue) {
			System.out.println("1. see account Details ");
			System.out.println("2. see transaction history ");
			System.out.println("3. change password");
			System.out.println("4. rc transactions");
			System.out.println("5. zcoin transactions");
			System.out.println("6. back");
			
			int ch = sc.nextInt();
			boolean ispass = false;
			switch(ch) {
				case 1:
					System.out.println("Account Id - " + a.h_id);
					System.out.println("ZId - " + a.zid);
					System.out.println("Rc - " + a.rcDeposit);
					System.out.println("Zcoins - " + a.zcoins);
					break;
				case 2:
					System.out.println(" the transaction history is ");
					for(String st: a.transact) {
						System.out.println(st);
					}
					break;
				case 3:
					while(true) {
						System.out.println("enter password to change ");
						String s = sc.next();
						if(!(s.matches(Zcoins.regex))) {
							System.out.println("enter strong password. please enter again");
						}
						else {
							a.password = s;
							ispass = true;
							return;
						}
					}
					//break;
					
				case 4:
					{
						System.out.println("1. deposit");
						System.out.println("2. withdraw");
						System.out.println("3. convert");
						int trans = sc.nextInt();
						
						if(trans == 1) {
							System.out.println("enter amount ");
							int amount  = sc.nextInt();
							deposit(amount,a);
						}
						else if(trans == 2) {
							System.out.println("enter amount ");
							int amount  = sc.nextInt();
							withdraw(amount,a);
						}
						else if(trans == 3) {
							System.out.println("enter amount ");
							int amount  = sc.nextInt();
							convert(a,amount);
						}
					}
					break;
					
				case 5: 
					{	
						System.out.println("1. transfer zcoins ");
						System.out.println("2. convert zcoins to Rc ");
						
						int temp = sc.nextInt();
						if(temp == 1) {
							System.out.println("enter the zid to transfer zcoins ");
							int zid = sc.nextInt();
							System.out.println("Enter the amount ");
							double amt = sc.nextDouble();
							transfer(zid,a, amt);
						}
						else if(temp == 2) {
							System.out.println("Enter the amount ");
							double amt = sc.nextDouble();
							double commi = ((0.15) * amt)/100;	
							if(commi + amt > a.zcoins) {
								System.out.println("cannot tranfer less balance ");
								continue;
							}
							a.zcoins -= commi;
							a.zcoins = (a.zcoins/Agent.rate);
							Agent.total_commissions += commi;
						}
					}
					
				case 6:
					istrue = false;
					break;
			}
		}
	}
}

class Zcoins {
	
	static String regex = "^(?=.*[0-9])" 
						 + "(?=.*[a-z])(?=.*[A-Z])" 
						 + "(?=.*[@#$%^&+=])" 
						 + "(?=\\S+$).{8,20}$"; 
						 
	public static void create() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter fullname ");
		String name = sc.nextLine();
		System.out.println("enter email ");
		String email = sc.next();
		System.out.println("enter mobile ");
		String mobile = sc.next();
		String password = "";
						 
		Agent ag = new Agent();
		
		while(true) {
			System.out.println("enter password ");
			password = sc.next();
			if(!(password.matches(regex))) {
				System.out.println("enter strong password. please enter again");
				password = "";
			}
			else 
				break;
		}
		System.out.println("Enter the rc Amount ");
		double deposit = sc.nextDouble();
		Account A = new Account(name,email,mobile,password,deposit);
		ag.setDetails(A.h_id, A);
		System.out.println("Account created. Waiting for confirmation ");
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Agent ag = new Agent();
		Users us = new Users();
		
		System.out.println("\n\t\t------------Welcome to Z- Verse---------------\n");
		boolean istrue = true;
		
		while(istrue) {
			System.out.println("1 create account ");
			System.out.println("2 login as user ");
			System.out.println("3 login as Agent ");
			System.out.println("4 create account ");
			System.out.println("5 Exit ");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1: 
					{
						create();
					}
					break;
					
				case 2:
					{
						us.loginUser();
					}
					break;
				
				case 3:
					{
						ag.AgentLogin();
					}
					break;
					
				case 4:
					break;
				
				case 5: 
					istrue = false;
					break;
			}
			
		} 
	}
}