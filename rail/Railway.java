import java.util.*;

class BookTicket {
	
	static int lowerBerth = 1;
	static int upperBerth = 1;
	static int middleBerth = 1;
	static int racTikcets = 1;
	static int waitingTickets = 1;
	static int total = 5;
	
	// static Integer General[] = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
	// static Integer rac[] = new Integer[] {82,83,84,85,86,87,88,90,91,92,93,94,95,96,97,98,99,100};
	// static Integer wait[] = new Integer[] {1,2,3,4,5,6,7,8,9,10};
	
	static Queue<Integer> racList = new LinkedList<>();
	static Queue<Integer> waitingList = new LinkedList<>();
	static List<Integer> bookedTickets = new ArrayList<>();
	
	static HashMap<Integer, Passenger> hash = new HashMap<>();
	
	static List<Integer> lowerSeat = new ArrayList<>(Arrays.asList(1));
	static List<Integer> upperSeat = new ArrayList<>(Arrays.asList(1));
	static List<Integer> middleSeat = new ArrayList<>(Arrays.asList(1));
	static List<Integer> racSeat = new ArrayList<>(Arrays.asList(1));
	static List<Integer> waitingSeat = new ArrayList<>(Arrays.asList(1));
	
	public void book(Passenger p, int seat, String berthType) {
		p.seat = seat;
		p.allotted = berthType;
		
		hash.put(p.passid, p);
		bookedTickets.add(p.passid);
		System.out.println("Booked Successfully");
	}
	
	public void belowage(Passenger p) {
		hash.put(p.passid,p);
		bookedTickets.add(p.passid);
	}
	
	public void bookRac(Passenger p, int seat, String berthType) {
		p.seat = seat;
		p.allotted = berthType;
		
		hash.put(p.passid, p);
		racList.add(p.passid);
		System.out.println("added to RAC Successfully");
	}
	
	public void bookWaiting(Passenger p, int seat, String berthType) {
		p.seat = seat;
		p.allotted = berthType;
	
		hash.put(p.passid, p);
		waitingList.add(p.passid);
		System.out.println("Added to WaitingList Successfully");
	}
	
	public void cancelTicket(int cancelid) {
		
		Passenger p = hash.get(cancelid);
		hash.remove(cancelid);
		
		//bookedTickets.remove(cancelid);
		Iterator itr = bookedTickets.iterator();   
        while (itr.hasNext())   
        {   
            int data = (Integer)itr.next();   
            if (data == cancelid)   
                itr.remove();   
        } 
		int seatNum = p.seat;
		
		if(p.allotted.equals("L") && p.age > 5) {
			lowerBerth++;
			lowerSeat.add(seatNum);
		}
		else if(p.allotted.equals("M") && p.age > 5) {
			middleBerth++;
			middleSeat.add(seatNum);
		}
		else if(p.allotted.equals("U") && p.age > 5) {
			upperBerth++;
			upperSeat.add(seatNum);
		}
		
		if(racList.size() > 0 && p.age > 5) {
			
			Passenger RacPas = hash.get(racList.poll());
			int seats = RacPas.seat;
			racSeat.add(seats);
			racList.remove(RacPas.passid);
			racTikcets++;	
			//bookedTickets.add(RacPas.passid);
			System.out.println("cancelled successfully");
			
			if(waitingList.size() > 0) {
				
				Passenger waitPas = hash.get(waitingList.poll());
				int seating = waitPas.seat;
				waitingSeat.add(seating);
				waitingList.remove(waitPas.passid);
				
				waitPas.seat = racSeat.get(0);
				waitPas.allotted = "RAC";
				racSeat.remove(0);
				racList.add(waitPas.passid);
				
				waitingTickets++;
				racTikcets--;
				
				System.out.println("Waiting List moved to Rac");
			}
				Railway.booking(RacPas);
		}
	}
	
	public void printBooked() {
		System.out.println("\n------------------");
		if(bookedTickets.size() == 0) {
			System.out.println("No data Available in BookTickets. Please book and try again later");
			return;
		}
		for(int i: bookedTickets) {
			Passenger p = hash.get(i);
			System.out.println("Name - " + p.name);
			System.out.println("age - " + p.age);
			System.out.println("gender - " + p.gender);
			System.out.println("seat - " + p.seat + p.allotted);
			System.out.println("\n------------------");
		}
		System.out.println("Total Occupied seats - " + (Railway.count));
	}
	
	public void printAvailable() {
		System.out.println("\n------------------");
		System.out.println("Available LowerBerth - " + lowerBerth);
		System.out.println("Available UpperBerth - " + middleBerth);
		System.out.println("Available MiddleBerth - " + upperBerth);
		System.out.println("Available RacTickets - " + racTikcets);
		System.out.println("Available waitingTickets - " + waitingTickets);
		System.out.println("Total Unoccupied seats - " + (total - Railway.count));
		System.out.println("\n------------------");
	}
	
	public void printWaiting() {
		System.out.println("\n------------------");
		if(waitingList.size() == 0) {
			System.out.println("No data Available in waitingList");
			return;
		}
		for(int i: waitingList) {
			Passenger p = hash.get(i);
			System.out.println("Name - " + p.name);
			System.out.println("age - " + p.age);
			System.out.println("gender - " + p.gender);
			System.out.println("seat - " + p.seat + p.allotted);
			System.out.println("\n------------------");
		}
	}
	
	public void printRac() {
		System.out.println("\n------------------");
		if(racList.size() == 0) {
			System.out.println("No data Available in Rac");
			return;
		}
		for(int i: racList) {
			Passenger p = hash.get(i);
			System.out.println("Name - " + p.name);
			System.out.println("age - " + p.age);
			System.out.println("gender - " + p.gender);
			System.out.println("seat - " + p.seat + p.allotted);
			System.out.println("\n------------------");
		}
	}
}

class Passenger {
		
	static int id = 1;
	String name;
	int age;
	String gender;
	String berth;
	int passid;
	String allotted;
	int seat;
	
	Passenger(String name, int age, String gender, String berth) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.berth = berth;
		this.passid = id++;
		allotted = "";
		seat = -1;
	}
}

class Railway {
	
	static int count = 0;
	static boolean ischild = false;
	public static void booking(Passenger p) {
		
		BookTicket obj = new BookTicket();
				
		if(BookTicket.waitingTickets == 0 && p.age > 5) {
			System.out.println("Sorry all tickets are finished ");
			return;
		}

		count++;

		if(p.age < 5) {
			obj.belowage(p);
			return;
		}
		else if(p.age > 60 || ischild == true) {
			p.berth = "L";
			ischild = false;
		}
		
		if(p.berth.equals("L") && BookTicket.lowerBerth > 0 || 
		   p.berth.equals("M") && BookTicket.middleBerth > 0 || 
		   p.berth.equals("U") && BookTicket.upperBerth > 0) 
		{
			   if(p.berth.equals("L")) {
				   System.out.println("Lower Berth Available");
				   obj.book(p,BookTicket.lowerSeat.get(0), "L");
				   BookTicket.lowerSeat.remove(0);
				   BookTicket.lowerBerth--;
			   }
			   else if(p.berth.equals("M")) {
				   System.out.println("Middle Berth Available");
				   obj.book(p,BookTicket.middleSeat.get(0), "M");
				   BookTicket.middleSeat.remove(0);
				   BookTicket.middleBerth--;
			   }
			   else if(p.berth.equals("U")) {
				   System.out.println("Upper Berth Available");
				   obj.book(p,BookTicket.upperSeat.get(0), "U");
				   BookTicket.upperSeat.remove(0);
				   BookTicket.upperBerth--;
			   }
		   }
		   else if(BookTicket.lowerBerth > 0) {
			   System.out.println("Preferred berth not available. So LowerBerth given");
			   obj.book(p,BookTicket.lowerSeat.get(0),"L");
			   BookTicket.lowerSeat.remove(0);
				BookTicket.lowerBerth--;
		   }
		   else if(BookTicket.middleBerth > 0) {
			   System.out.println("Preferred berth not available. So MiddleBerth given");
			   obj.book(p,BookTicket.middleSeat.get(0),"M");
			   BookTicket.middleSeat.remove(0);
				BookTicket.middleBerth--;
		   }
		   else if(BookTicket.upperBerth > 0) {
			   System.out.println("Preferred berth not available. So upperBerthgiven");
			   obj.book(p,BookTicket.upperSeat.get(0),"U");
			   BookTicket.upperSeat.remove(0);
			   BookTicket.upperBerth--;
		   }
		   else if(BookTicket.racTikcets > 0) {
			   System.out.println("Rac Given ");
			   obj.bookRac(p,BookTicket.racSeat.get(0),"RAC");
			   BookTicket.racSeat.remove(0);
			   BookTicket.racTikcets--;
		   }
		   else if(BookTicket.waitingTickets > 0) {
			   System.out.println("Added to Waiting List ");
			   obj.bookWaiting(p,BookTicket.waitingSeat.get(0),"WL");
			   BookTicket.waitingSeat.remove(0);
			   BookTicket.waitingTickets--;
		   }		   	   
	}
	
	public static void cancelling(int cancelid) {
		
		BookTicket obj = new BookTicket();
		obj.cancelTicket(cancelid);
		count--;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		BookTicket obj = new BookTicket();
		boolean istrue = true;
		System.out.println("\t---Welcome to Railway Booking---\n");
		
		while(istrue) {
			
			System.out.println("1. Book");
			System.out.println("2. Cancel");
			System.out.println("3. Print Booked tickets");
			System.out.println("4. Print Available tickets");
			System.out.println("5. Print Rac tickets");
			System.out.println("6. Print Waiting tickets");
			System.out.println("7. Exit");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				
				case 1:
					System.out.println("Enter the no. of tickets");
					int n1 = sc.nextInt();
					
					for(int i=0;i<n1;i++) {
						System.out.println("Enter name, age, gender(male/female) and preferedBerth(L,M,U)");
						String name = sc.next();
						int age = sc.nextInt();
						String gender = sc.next();
						String berthType = sc.next();
						if(gender.equals("female") && age > 5) {
							System.out.println("Do you have children(y/n)");
							char che = sc.next().charAt(0);
							if(che == 'y') {
								ischild = true;
								System.out.println("Enter name, age, gender and preferedBerth of child(L,M,U)");
								String n = sc.next();
								int ag = sc.nextInt();
								String gend = sc.next();
								String berth = sc.next();
								Passenger p = new Passenger(n,ag,gend,berth);
								booking(p); 
							}
						}
							Passenger p = new Passenger(name,age,gender,berthType);
							booking(p);
					}
					break;
					
				case 2:
					System.out.print("The available id's are: ");
					for(int i: obj.bookedTickets) {
						System.out.print(i + " ");
					}
					System.out.println();
					System.out.println("Enter the id to cancel");
					int cancelid = sc.nextInt();
					cancelling(cancelid);
					break;
					
				case 3: 
					obj.printBooked();
					break;
					
				case 4:
					obj.printAvailable();
					break;

				case 5:
					obj.printRac();
					break;
				
				case 6:
					obj.printWaiting();
					break;
					
				case 7:
					istrue = false;
					break;
			}
			
		}
	}
}