import java.util.*;

class Flight
{
    static int id = 0;
    int flightID;
    int tickets;
    int price;
    ArrayList<String> passengerDetails;
    ArrayList<Integer> passengerIDs;
    ArrayList<Integer> bookedTicketsPerPassenger;
    ArrayList<Integer> passengerCost;

    public Flight()
    {
        tickets = 50;
        price = 5000;
        id = id + 1;
        flightID = id;
        passengerDetails = new ArrayList<String>();
        passengerIDs = new ArrayList<Integer>();
        bookedTicketsPerPassenger = new ArrayList<Integer>();
        passengerCost = new ArrayList<Integer>();
    }

    public void addPassengerDetails(String passengerDetail,int numberOfTickets,int passengerID)
    {
        passengerDetails.add(passengerDetail);
        passengerIDs.add(passengerID);
        passengerCost.add(price * numberOfTickets);

        price+=200 * numberOfTickets;

        tickets-= numberOfTickets;
        bookedTicketsPerPassenger.add(numberOfTickets);
        System.out.println("Booked Successfully!");

    }

    public void cancelTicket(int passengerID)
    {
       int indexToRemove = passengerIDs.indexOf(passengerID);
       if(indexToRemove < 0)
       {
           System.out.println("Passenger ID not found!");
           return;
       }
       int ticketsToCancel = bookedTicketsPerPassenger.get(indexToRemove);

       tickets+=ticketsToCancel;
       price-= 200 * ticketsToCancel;

       System.out.println("Refund Amount after cancel : " + passengerCost.get(indexToRemove));

       bookedTicketsPerPassenger.remove(indexToRemove);
       passengerIDs.remove(Integer.valueOf(passengerID));
       passengerDetails.remove(indexToRemove);
       passengerCost.remove(indexToRemove);

       System.out.println("Cancelled Booked Tickets Successfully!");

    }

    public void flightSummary()
    {
        System.out.println("Flight ID " + flightID + " --" + "Remaining Tickets " + tickets + " --" + 
        "Current Ticket Price " + price);
    }
    public void printDetails()
    {
       System.out.println("Flight ID " + flightID + "->");
        for(String detail : passengerDetails)
            System.out.println(detail);
    }


}

public class BookTicket
{
    public static void book(Flight currentFlight, int tickets,int passengerID)
    {
       String passengerDetail = "";
       passengerDetail = "Passenger ID " + passengerID + " -- " + " Number of Tickets Booked " 
                            + tickets + " -- " + "Total cost " + currentFlight.price * tickets;
       currentFlight.addPassengerDetails(passengerDetail,tickets,passengerID);

       currentFlight.flightSummary();
       currentFlight.printDetails();

    }
    public static void cancel(Flight currentFlight, int passengerID)
    {
        currentFlight.cancelTicket(passengerID);
        currentFlight.flightSummary();
        currentFlight.printDetails();
    }

    public static void print(Flight f)
    {
        f.printDetails();
    }
	
    public static void main(String[] args)
    {
        ArrayList<Flight> flights = new ArrayList<Flight>();
        for(int i=0;i<2;i++)
            flights.add(new Flight());

        int passengerID = 1;

        while(true)
        {
        System.out.println("1. Book 2. Cancel 3. Print");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        

        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter Flight ID");
                int fid = sc.nextInt();

                if(fid > flights.size())
                {
                    System.out.println("Invalid flight ID");
                    break;
                }
                Flight currentFlight = null;
                for(Flight f : flights)
                {
                    if(f.flightID == fid)
                    {
                        currentFlight = f;
                        f.flightSummary();
                        break;
                    }
                }

                System.out.println("Enter number of tickets");
                int t = sc.nextInt();

                if(t > currentFlight.tickets)
                {
                    System.out.println("Not Enough Tckets");
                    break;
                }
                book(currentFlight,t,passengerID);

                passengerID = passengerID + 1;
                break;
            }
            case 2:
            {
                System.out.println("Enter flight ID and passenger ID to cancel booking");
                int fid = sc.nextInt();

                if(fid > flights.size())
                {
                    System.out.println("Invalid flight ID");
                    break;
                }
                Flight currentFlight = null;
                for(Flight f : flights)
                {
                    if(f.flightID == fid)
                    {
                        currentFlight = f;
                        break;
                    }
                }
                int id = sc.nextInt();

                cancel(currentFlight,id);
                break;
            }
            case 3:
            {
                for(Flight f : flights)
                {
                        if(f.passengerDetails.size() == 0)
                        {
                            System.out.println("No passenger Details for  - Flight " + f.flightID);
                         
                        }
                        else
                         print(f);
                }
                   
                break;
            }
            default:
            {
                break;
            }
        }
        }

    }
}