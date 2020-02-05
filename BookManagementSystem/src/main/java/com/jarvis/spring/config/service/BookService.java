package com.jarvis.spring.config.service;

import java.util.List;

import com.jarvis.spring.config.model.Book;

public interface BookService {
		
	// Save the record
	long save(Book book);
		
	// Get a single record
	Book get(long id);
	
	// Get all book
	List<Book> list();
	
	// Update Book
	void update(long id, Book book);
	
	// delete book
	void delete(long id);
}
