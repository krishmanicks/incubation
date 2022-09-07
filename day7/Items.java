import bookshop.*;

class AllData extends Data {
	AllData(String type, String title, String author, String genre, int price) {
		super(type, title, author, genre, price);
	}
}

public class Items {
	
	public static void main(String args[]) {
		
		AllData dat[] = new AllData[5];
		dat[0] = new AllData("Book: (2345)", "\"The Pillars\"", "ken forest", "romance", 18);
		dat[1] = new AllData("Album: (1234)", "\"The world\"", "Ravi Varma", "pop", 76);
		dat[2] = new AllData("Book: (8765)", "\"the losing game\"", "manicks", "romance/thriller", 54);
		System.out.println(dat[0].toString());
		System.out.println(dat[1].toString());
		System.out.println(dat[2].toString());
	}
}