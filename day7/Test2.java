import java.util.Scanner;


class PhoneBook {
	long phNo;
	String idVariable;
	long[] specialContacts;
	long[] contacts;
	
	PhoneBook(long number,String id){
		phNo = number;
		idVariable = id;	
	}
	
	void printDetails(){
		System.out.println("PHONE NUMBER: "+ phNo);
		System.out.println("PHONE ID: "+ idVariable);
		//return idVariable;	
	}
	
	void SpecialAndContacts() {
		
		long[] contact = new long[contacts.length + specialContacts.length];
		//contact= contacts;
		for(int i=0;i<contacts.length;i++){
			contact[i]=contacts[i];
		}
		for(int i=0;i<specialContacts.length;i++){
			contact[contacts.length+i]=specialContacts[i];
		}
		System.err.println("----------------All COntacts--------------------------");
		for(int i=0;i<contact.length;i++){
			System.out.println(contact[i]);
			
		}
	}
}

class Contacts extends PhoneBook{
	
	Contacts(long number,String id){
		super(number,id);
	}
	
	void setContacts(long[] l,int count){
		contacts = new long[count];
		contacts = l;
	}
	
	void printDetails(){
		super.printDetails();
		toString(0);
	}
	
	public String toString(int j){//since obj belongs to subclass we cannot call it even with this
		System.out.println("Your contacts are:");
		for(int i=0;i<contacts.length;i++){
			System.out.println(contacts[i]);		
		}
		return idVariable;
	}
}

class SpecialContacts extends Contacts{
	
	SpecialContacts(long number,String id){
		super(number,id);
	}
	
	void setSpecialContacts(long[] l,int count){
		specialContacts = new long[count];
		specialContacts = l;
	}
	
	public String toString(){
		System.out.println("Your Special contacts are:");
		for(int i=0;i<specialContacts.length;i++){
			System.out.println(specialContacts[i]);
		}
		return idVariable;	
	}
	
	void printDetails(){
		super.printDetails();
		toString();
	}	
}


class Test2 {
	
	public static void main(String[] args){
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter your phone number");
		long mobile = input.nextLong();
	
		System.out.println("enter your phone Id");
		String id = input.next();
		SpecialContacts obj= new SpecialContacts(mobile,id);
		
		System.out.println("set contacts");
		System.out.println("Number of contacts");
		int c = input.nextInt();
		long[] cont = new long[c];
		for(int i=0;i<c;i++){
			System.out.println("enter contact");
			cont[i]=input.nextLong();
		}
		obj.setContacts(cont,c);
		
		System.out.println("set Special contacts");
		System.out.println("Number of Special Contacts");
		c= input.nextInt();
		long[] splcont = new long[c];
		for(int i=0;i<c;i++){
			System.out.println("enter contact");
			splcont[i]=input.nextLong();
		}
		obj.setSpecialContacts(splcont,c);
		System.out.println("-----Display---------------");
		obj.printDetails();
		obj.SpecialAndContacts();	
	}
}
