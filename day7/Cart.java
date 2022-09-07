import java.util.*;

abstract class ShoppingCart {
	String description;
	double price;
	double total;
	static int count=0;
	abstract public void add(String des, double price);
	abstract public void calculatePrice(ShoppingCart s[]);
	abstract public void toString(ShoppingCart s[]);	
}

class ShoppingCartTest extends ShoppingCart {
	
	public void add(String des, double pr) {
		if(count < 4) {
			description = des;
			price = pr;
			count++;
		}
		else {
			System.out.println("cannot add. Reached maximum");
		}
	}
	
	public void calculatePrice(ShoppingCart	 st[]) {
		for(int i=0;i<st.length;i++) {
			total = total + st[i].price;
		}
		System.out.println("Total calc = " + total);
	}
	
	public void toString(ShoppingCart st[]) {
		for(int i=0;i<st.length;i++) {	
		if(st[i].description == null) {
			continue;
		}
			System.out.println("Str " + (i+1) + " = " + st[i].description);
		}
	}
}

class Cart {
	public static void main(String args[]) {
		ShoppingCartTest st[] = new ShoppingCartTest[5];
		ShoppingCartTest s = new ShoppingCartTest();
		
		st[0] = new ShoppingCartTest();
		st[1] = new ShoppingCartTest();
		st[2] = new ShoppingCartTest();
		st[3] = new ShoppingCartTest();
		st[4] = new ShoppingCartTest();
		st[0].add("toys are good", 23.0);
		st[1].add("toys are bad", 57.8);
		st[2].add("dolls are beautiful", 93.0);
		st[3].add("racing car is good", 79.0);
		st[4].add("racing car is bad", 10.0);
		s.calculatePrice(st);
		System.out.println(s.count);
		s.toString(st);
	}
}