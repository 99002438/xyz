package com.bookapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDAO;
import com.bookapp.dao.BookDAOImpl;
import com.bookapp.model.Book;
import com.example.exception.BookNotFoundException;


@Service
public class BookServiceImpl implements BookService {
	
	BookDAO bookDAO = new BookDAOImpl();

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookDAO.getByAuthor(author);
	}

	@Override
	public Book getById(int id) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookDAO.getById(id);
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException{
		// TODO Auto-generated method stub
		return bookDAO.getByCategory(category);
	}
	
	

}
