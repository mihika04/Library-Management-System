package spring.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.entities.Book;
import spring.mvc.repository.BookRepository;

@Controller
public class HomeController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(value = { "", "/", "index" })
	public String openHomePage(Model model) {
		List<Book> bookList=this.bookRepository.getAllBooks();
		System.out.println(bookList);
        model.addAttribute("listOfBooks",bookList);
		return "index";
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable(value="id") int id)
	{
		this.bookRepository.deleteBook(id);
		return "redirect:/";		
		
	}
	
	@GetMapping("/showUpdateBookForm/{id}")
	public String showUpdateBookForm(@PathVariable(value="id") int id, Model model) {
		Book book = this.bookRepository.getBook(id);
		model.addAttribute("book",book);
		return "update-book";
		
	}
	
	@GetMapping("/updateBook")
	public String updateBookData(@ModelAttribute Book book) {
		this.bookRepository.updateBook(book);
		return "redirect:/";
		
	}
	
	@RequestMapping("/showAddBookForm")
	public String showAddBookForm() {
		return "add-new-book";
	}
	
	@RequestMapping("/register")
	public String registerBook(@ModelAttribute Book book){
		this.bookRepository.insertBook(book);
		return "redirect:/";
	}

}
