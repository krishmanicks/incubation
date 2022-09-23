import java.util.*;


 abstract class Passenger {
	
	Scanner sc = new Scanner(System.in);
	
	static double sum;
	int id;
	int cabs;
	char pick;
	char drop;
	int pickTime;
	double amount;
	char current = 'A';
	int freeTime = 6;
	
	Passenger(int id, char pick, char drop, int pickTime, double amount, int cabs, int freeTime) {
		this.id = id;
		this.pick = pick;
		this.drop = drop;
		this.pickTime = pickTime;
		this.amount = amount;
		this.cabs = cabs;
		this.freeTime = freeTime;
		sum = sum + amount;
	}

}

class Booking extends Passenger {

	Booking(int id, char pick, char drop, int pickTime, float amount,int available,int freeTime) {
		super(id,pick,drop,pickTime,amount,available,freeTime);
	}
	
	public void display(Booking b[]) {
		for(int j=1;j<=4;j++) {
			System.out.println("Taxi No: " + j + "\t Total Earnings " + sum);
			System.out.println("Id   cus Id  from  To   PickTime   DropTime ");
			for(int i=0;i<=b.length;i++) {
				if(j == b[i].cabs)
				System.out.println(b[i].id + " " + b[i].id + " " + b[i].pick + " " + b[i].drop + " " + b[i].pickTime + "  " + b[i].freeTime );
			}
		}
		
	}
	
	
}

class TotalCabs {

	int arr[] = new int[11];
	
	public void createTaxi() {
	
		int freetime;
		int cabId;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of cabs ");
			int cab = sc.nextInt();
					
			for(int i=1;i<=cab;i++) {
				arr[i] = 6;		
			}
	}
	
		
	public int availability(int pickTime, Booking b[]) { 
		
		int shortest = 6;
		for(int i=1;i<=arr.length;i++) {
			if(arr[i] < pickTime) {
				int j = 0;
				return i;
				// while(j < b.length) {
					// if(i == b[j].cabs) {
						// if(Math.abs(b[j].current - b[j].pick) < shortest)
							// return i;
					// }
					// j++;
					// shortest = Math.abs(b[j].pick - b[j].drop);
				// }
			}
		}
			return 0;
	}
}

class Taxi  {
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<TotalCabs> cabs = new ArrayList<TotalCabs>();
		
		boolean istrue = true;
		
		TotalCabs tc = new TotalCabs();
		Booking b[] = new Booking[10];
		int k=0;
		
		new TotalCabs().createTaxi();
		
		System.out.println("\t\tWelcome to Taxi booking\n");
		
		while(istrue) {
			System.out.println("1. Book");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				
				case 1: {
					System.out.print("Customer id: ");
					 int id = sc.nextInt();
					System.out.print("Pick Point: ");
					 char pick = sc.next().charAt(0);
					 System.out.print("Drop Point: ");
					 char drop = sc.next().charAt(0);
					 System.out.print("Pick Time: ");
					 int pickTime = sc.nextInt();
					 
					 int available = tc.availability(pickTime,b);
					 if(available > 0) {
						 int freeTime = pickTime + Math.abs(pick - drop);
						int amount = (((Math.abs(drop - pick)*15)-5)*10) + 100; 
						 b[k] = new Booking(id,pick,drop,pickTime,amount,available,freeTime);
						 k++;
						 tc.arr[available] = freeTime;
						 System.out.println("\n Taxi can be alloted");
						 System.out.println("Taxi- " + available + " is alloted\n\n");
						}				 
				}
				break;
				
				case 2: {
					new Booking().display(b);
				}
				break;
				
				case 3: {
					istrue = false;
					break;
				}
			}
		}
	}
}