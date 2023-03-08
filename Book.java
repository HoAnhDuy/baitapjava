package Compose;
import Compose.Author;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String authorString = "";
		for (Author author : authors) {
			authorString += author.toString();
		}
		return String.format("Book[name=%s, authors={%s}, price=%f, qty=%d, ]", name, authorString, price, qty);
	}

	public String getAuthorNames() {
		String rs = "";
		for (Author author : authors) {
			rs += author.getName() + ", ";
		}
		if (!rs.isEmpty()) {
			rs = rs.substring(0, rs.length() - 1);
		}
		return rs;
	}
	
}
