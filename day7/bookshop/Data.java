package bookshop;

public abstract class Data {
	
	String type,title,author,genre;
	int price;
	
	public Data(String type, String title, String author, String genre, int price) {
		this.type = type;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}
	public String toString() {
		 return " " + type + " " + title + " by " + author + ", " + genre + ", " +  price + "$" ;
		 }
}