package spring.mvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=40,nullable=false)
	private String bookName;
	@Column(length=35,nullable=false)
	private String authorName;
	@Column(length=100,nullable=false)
	private String description;
	@Column(nullable=false)
	private double cost;
	@Column(nullable=false)
	private int numberOfCopies;
	@Column(length=35,nullable=false)
	private String availability;
	
	public Book() {
		super();
	}

	public Book(int id, String bookName, String authorName, String description, double cost, int numberOfCopies,
			String availability) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
		this.cost = cost;
		this.numberOfCopies = numberOfCopies;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", authorName=" + authorName + ", description="
				+ description + ", cost=" + cost + ", numberOfCopies=" + numberOfCopies + ", availability="
				+ availability + "]";
	}
	
	
	
	
	
	
	

}
