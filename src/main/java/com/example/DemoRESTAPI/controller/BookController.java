package com.example.DemoRESTAPI.controller;

import com.example.DemoRESTAPI.domain.Book;
import com.example.DemoRESTAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookData/v1/")
public class BookController {
    BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "/book")
    public ResponseEntity<?> addBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }
    @GetMapping(value = "/books")
    public ResponseEntity<?> getBooks(){
        return new ResponseEntity<>(bookService.getAllBooks(),HttpStatus.OK);
    }
}
