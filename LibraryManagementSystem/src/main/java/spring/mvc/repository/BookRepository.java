package spring.mvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import spring.mvc.entities.Book;

@Repository
public class BookRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public Book getBook(int bookId) {
		return this.hibernateTemplate.get(Book.class, bookId );
	}
	
	public List<Book> getAllBooks(){
		return this.hibernateTemplate.loadAll(Book.class);
	}
	
	@Transactional
	public int insertBook(Book book) {
		if(book.getNumberOfCopies()==0) {
			book.setAvailability("N");
		}
		else {
			book.setAvailability("A");
		}
		return (Integer)this.hibernateTemplate.save(book);
	}
	
	@Transactional
	public void deleteBook(int bookId) {
		Book book = this.hibernateTemplate.get(Book.class, bookId);
		book.setNumberOfCopies(0);
		book.setAvailability("N");
		this.hibernateTemplate.update(book);
	}
	
	@Transactional
	public void updateBook(Book book) {
		if(book.getNumberOfCopies()==0) {
			book.setAvailability("N");
		}
		else {
			book.setAvailability("A");
		}
		this.hibernateTemplate.update(book);
	}
	
	
	

}
