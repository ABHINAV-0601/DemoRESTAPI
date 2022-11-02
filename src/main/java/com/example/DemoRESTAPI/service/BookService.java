package com.example.DemoRESTAPI.service;

import com.example.DemoRESTAPI.domain.Book;

import java.util.List;

public interface BookService {

    Book addBook(Book book);

    List<Book> getAllBooks();
}
