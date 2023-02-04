package satya;
class Author{
	private String name;
	private String emailid;
	private char gender;
	public Author(String name, String emailid, char gender) {
		this.name = name;
		this.emailid = emailid;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
class Book{
	private String nam;
	private Author author;
	private double price;
	private int quantity;
	public Book(String nam, Author author, double price, int quantity) {
		this.nam = nam;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void displaydetails() {
		System.out.println("Displaying author details");
		System.out.println("Author name :"+author.getName());
		System.out.println("Author email :"+author.getEmailid());
		System.out.println("Author gender :"+author.getGender());
	}
	
	
}
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1=new Author("Joshua Bloch","joshua@email.com",'M');
		Book b1=new Book("Effective java",a1,45,15);
		b1.displaydetails();

	}

}
