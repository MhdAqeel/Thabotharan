public class Book{
	private String title;
	private String author;
	private String publisher;
	private String city;
	private String dateOfPublication;
	private double price;
	private ISBN isbnNum;
	
	public Book(String title, String author, String publisher, String city,String dateOfPublication, double price, ISBN isbnNum){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.city = city;
		this.dateOfPublication = dateOfPublication;
		this.price = price;
		this.isbnNum = isbnNum;
	}
	
	public void setBookISBN(ISBN isbnNum){
		this.isbnNum = isbnNum;
	}
	
	public String getBookISBN(){
		return this.isbnNum.getISBN();
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public String toString(){
		return "Book Title: "+this.title+
		"\nBook Author: "+this.author+
		"\nPublisher: "+ this.publisher +
		"\nISBN: "+ this.getBookISBN();
	}
} 