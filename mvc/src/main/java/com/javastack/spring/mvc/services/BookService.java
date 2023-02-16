package com.javastack.spring.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javastack.spring.mvc.models.Book;
import com.javastack.spring.mvc.repositorites.BookRepository;

@Service
public class BookService {
		private final BookRepository bookRepository;
		
		public BookService(BookRepository bookRepository) {
			this.bookRepository = bookRepository;
	}
		// returns all the books
	    public List<Book> returnAllBooks() {
	        return bookRepository.findAll();
	    }
	    // creates a book
	    public Book createBook(Book book) {
	        return bookRepository.save(book);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    // updates a book
	    public Book updateBook(Book b) {
	        return bookRepository.save(b);
	    }
	    // deletes a book
	    public void deleteBook(Long id) {
	    	bookRepository.deleteById(id);
	    }
	    
	    public void deleteById(Long id) {
	    	bookRepository.deleteById(id);
	    }
	    //finds books with language containing in search string
	    public List<Book> returnBookByLanguageContaining(String searchTerm){
	    	return bookRepository.findByLanguageContaining(searchTerm);
	    }
	    //find top 2 by # pages
	    public List<Book> returnTopThreeBooksByOrder(){
	    return bookRepository.findTop2ByOrderByNumberOfPagesDesc();
	    }
}
