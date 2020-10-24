package com.bookapp.dao;

 

import java.util.List;

 


import com.bookapp.model.Book;
import com.example.exception.BookNotFoundException;

 

public interface BookDAO {
    
    List<Book> getAllBooks();
    List<Book> getByAuthor(String author) throws BookNotFoundException;
    Book getById(int id) throws BookNotFoundException;
    List<Book> getByCategory(String category) throws BookNotFoundException;

 

}