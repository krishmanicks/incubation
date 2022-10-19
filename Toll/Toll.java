import java.util.*;
import java.io.*;


class Details {
	
	static int id = 1;
	int number;
	List<String> Tolldetails;
	
	Details() {
		number = id++;
		Tolldetails = new ArrayList<String>();; 
	}	
	
	public void addDetails(String details) {
		Tolldetails.add(details);
	}
	
	public void display() {
		System.out.println("Toll number - " + number);
        for(String detail : Tolldetails)
            System.out.println(detail);
		
		System.out.println("\n-----------------------\n");
	}
}


class Toll {
	
	public static float discount(float amount) {
		float val = (20 * amount) / 100;
		return amount - val;
	}
	
	static HashMap<Integer, String> hash = new HashMap<Integer, String>();
	
	public static void set(Details start, Details end, int vehicleNumber, String type, boolean vip, int st, int en, List<Details> tolls,
			int n, FileWriter ftoll, FileWriter fpass) throws IOException {
		
		
		float car = 50;
		float bike = 0;
		float bus = 100;
		float lorry = 120;
		float auto = 30;
		
		float amount = 0;
		
		if(type.equals("car"))
			amount = car;
		else if(type.equals("bike"))
			amount = bike;
		else if(type.equals("bus"))
			amount = bus;
		else if(type.equals("lorry"))
			amount = lorry;
		else if(type.equals("auto"))
			amount = auto;
		
		if(vip)
			amount = (float) discount(amount);
		
		String details = "Vehicle Number " + vehicleNumber + " " + " VehicleType " 
                            + type + "  " + " amount " + amount + "  " + " Vip " 
							+ vip;
		
		int count = 1;
		
		int total = Math.abs(st-en) + 1;

		String tollsPass = "";
		
		StringBuffer tollsPassed = new StringBuffer();
		
		if(Math.abs(st - en) > Math.abs(n - st) + en) {
			for(Details i: tolls) {
				if(count >= st || count <= en) {
					i.addDetails(details);
					tollsPass += i.number + " ";
				}
				count++;
			}
			tollsPassed = new StringBuffer(tollsPass);
			tollsPassed.reverse();
		} 
		else {
			for(Details i: tolls) {		
					if(count >= st && count <= en || count <= st && count >= en) {
						i.addDetails(details);
						tollsPass += i.number + " ";
					}
					count++;
				}
				tollsPassed = new StringBuffer(tollsPass);
		}
		
		
				
		amount = amount * total;
		// String tollsPassed = "";
		
		// for(int i=st;i<=en;i++) {
			// tollsPassed += i + " ";
		// }
		String passDetails = "VehicleNumber - " + vehicleNumber + " " + " VehicleType - " 
                            + type + "  " + " amount - " + amount + "  " + " Vip - " 
							+ vip + "  " + " start - " + st + "  " + " Destination - " + en
							+ "  " + " tollsCrossed - " + tollsPassed;
							
		hash.put(vehicleNumber,passDetails);
		fpass.write(passDetails + "\n");
		ftoll.write(details + "\n");
		
		fpass.flush();
		ftoll.flush();
	}
	
	public static void print(Details d)
    {
        d.display();
    }
	
	
	public static void main(String args[]) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		List<Details> tolls = new ArrayList<Details>();
		
		int vehicleNumber = 1;
		
		for(int i=1;i<=n;i++) {
			tolls.add(new Details());
		}
		
		File pass = new File("passenger.txt");
		if(!pass.exists()){
			pass.createNewFile();
		}
		File toll = new File("tolls.txt");
		if(!toll.exists()){
			toll.createNewFile();
		}
		FileWriter fpass = new FileWriter(pass,true);
		FileWriter ftoll = new FileWriter(toll,true);
		
		boolean istrue = true;
		
		while(istrue) {
			
			System.out.println("1. start ");
			System.out.println("2. Display Toll details");
			System.out.println("3. Display Passenger details");
			System.out.println("4. Exit ");
			
			int ch = sc.nextInt();
			
			switch(ch) {
				
				case 1: {
					
					System.out.println("Enter Vehicle Type ");
					String type = sc.next();
					System.out.println("Enter start ");
					int st = sc.nextInt();
					System.out.println("Enter Destination ");
					int dest = sc.nextInt();
					System.out.println("Is Vip ? (0 for no /1 for yes) ");
					int vip = sc.nextInt();
					
					boolean isvip = false;
					if(vip == 1)
						isvip = true;
					else
						isvip = false;
					
					Details start = null;
					Details end = null;
					
					for(Details i: tolls) {
						if(i.number == st)
							start = i;
						if(i.number == dest)
							end = i;
						
						if(start != null && end != null)
							break;
					}
					set(start, end, vehicleNumber,type,isvip,st,dest,tolls,n, ftoll, fpass);
					vehicleNumber++;
					break;
				}
				
				case 2:
					System.out.println();
					for( Details d : tolls)
					{
                         d.display();
					}
						break;
				
				case 3:
					System.out.println();
					for(int i=1;i<=hash.size();i++)
					{	
						String temp = hash.get(i);
                        System.out.println(temp);
					}
					System.out.println();
						break;
						
				case 4: 
					istrue = false;
					break;
			}
		}
	}
}