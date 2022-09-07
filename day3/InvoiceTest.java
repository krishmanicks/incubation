import java.util.*;

class Invoice {

String partNumber;
String partDesc;
int quantity;
double price;

  public Invoice(String num, String desc, int qty, double prc) {
	
	partDesc = desc;
	partNumber = num;
	if(qty < 0 ) {
		this.quantity = 0;
	}
	else {
		this.quantity = qty;
	}
	if(prc < 0) {
		this.price = 0.0;
	}
	else {
		this.price = prc;
	}
	
  }
  
  public void display() {
	  System.out.println("Invoice :" + partNumber + " " + partDesc + " " + quantity + " " + price);
  }

public String getPartNum() {
	return partNumber;
}
public String getPartDesc() {
	return partDesc;
}

public int getQuantity() {
	return quantity;
}

public double getPrice() {
	return price;
}

public void setPartNum(String num) {
		partNumber = num;
}

public void setPartDesc(String desc) {
	partDesc = desc;
}

public void setQuantity(int qty) {
	if(qty > 0) {
		quantity = qty;
		}
	else {
		quantity = 0;
		}
}

public void setPrice(double prc) {
	
	if(prc > 0) { 
	price = prc;
	}
	else {
		price = 0.0;
	}
}

public double getInvoiceAmount() {
	
	return (double)(quantity * price);
}
}

public class InvoiceTest {

public static void main (String args[]) {
	
	String pNumber;
	String des;
	int qty;
	double price;
	Scanner sc = new Scanner(System.in);
	int num = 0;
	Invoice In[] = new Invoice[3];
	
	System.out.println("Enter no. of invoices: ");
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		System.out.println("Enter Pnumber, description, qty and price");
		pNumber = sc.next();
		des = sc.next();
		qty = sc.nextInt();
		price = sc.nextDouble();
		
		In[num] = new Invoice(pNumber,des,qty,price);
		num++;
	}

In[0].setPrice(20.0);

In[0].display();
System.out.println("Invoice total: " + In[1].getInvoiceAmount());
}
}
