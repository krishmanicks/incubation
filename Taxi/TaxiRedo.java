import java.util.*;
import java.lang.*;

class TaxiRedo{

	static int taxiCount = 0;
		
		
	public static void main(String[] args){
		
		ArrayList<Taxi> driver = new ArrayList<>();
		ArrayList<Taxi> availableList = new ArrayList<>();
		
		Scanner input= new Scanner(System.in);
		String[] places = {"A","B","C","D","E","F"};
	
	//to create taxis
		System.out.println("Number of Taxis to be added");
		int count = input.nextInt();
		for(int i=0;i<count;i++) {
			driver.add(new Taxi(++taxiCount));
		}
		//places.indexOf("A");
	//to allot taxi for customers	
		System.out.println("Number of customers");
		int cusCount = input.nextInt();
		for(int q=0;q<cusCount;q++){
		
		System.out.println();
		System.out.println("TAXI BOOKING");
		
		System.out.println("Enter Customer ID");
		int custID = input.nextInt();
		
		System.out.println("Enter Pickup point");
		String pickup= input.next();
		
		System.out.println("Enter Drop Point");
		String drop= input.next();
		
		System.out.println("Enter pickup time");
		int time= input.nextInt();
		
		int allot=0;
		Taxi a=driver.get(0);
		
		
		
		for(Taxi x: driver){
			float min=0.0f;
			//changing availability for already alloted taxi
			System.out.println("check>>>>>>>>>>>>" + x.earnings);
					
			if(x.temp<time){
				x.availability=true;
			}
			
			if(pickup.equals(x.location) && x.availability){
				if(allot==0){
					min=x.earnings;
					allot++;
					a=x;
				}
				else if(min > x.earnings){
					System.out.println("check>>>>>>>>>>>>" + x.earnings);
					min=x.earnings;
					a=x;
					}
				//break;
			}
		}
		
		
		if(allot ==0){
			int k=0;
			for(String y: places){
				
				if(y.equals(pickup))
					break;
				k++;
			}
			//System.out.println(k);
			for(Taxi x: driver){
				if(k+1<places.length && places[k+1].equals(x.location) && x.availability){
				allot++;
				a=x;
				break;
			}
				if(k-1>=0 && places[k-1].equals(x.location) && x.availability){
				allot++;
				a=x;
				break;
			}
		}
		}
		
		
		//alloting
		if(allot==1){
			System.out.println("Taxi can be Alloted");
			System.out.println(a.name +" is Alloted");
			a.alloted(custID,pickup,drop,time);
			
		}else{
			//System.out.println(allot);
			System.out.println("Taxi is not Available");
		
		}
		
		
		}
		for(Taxi x: driver){
			System.out.println();
			System.out.println(x.name + " Total Earnings: Rs. " + x.earnings);
			System.out.println("Customers Details: \n" + x.customerDetail);
			
		}
		
		
		
		
		
		
}
}
class Taxi{
	float earnings=0.0f;
	boolean availability =true;
	String name;
	String location="A";
	ArrayList<String> customerDetail= new ArrayList<>();
	int temp=0;
	
	Taxi(int i){
		name= "Taxi "+i;
	}
	float price(int from,int to){
		float km= (Math.abs(from-to))*15;
		float charge= 100 + (km-5)*10;
		return charge;
	}
	int time(int from,int to,int pick){
		int droptime= (Math.abs(from-to))+pick;
		return droptime;
		
	}
	void alloted(int cusId, String start,String drop,int picktime){
		location=drop;
		availability= false;
		int from= 65- start.charAt(0);
		int to=65- drop.charAt(0);
		customerDetail.add(" "+cusId + " " +start+ " "+drop+" "+ picktime + " "+ time(from,to,picktime)+ " "+price(from,to));
		temp=time(from,to,picktime);
		earnings += price(from,to);
		//System.out.println(earnings);
		//System.out.println(customerDetail);
	}
	
}