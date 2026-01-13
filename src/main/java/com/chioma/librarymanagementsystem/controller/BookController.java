package com.chioma.librarymanagementsystem.controller;


import com.chioma.librarymanagementsystem.entity.Book;
import com.chioma.librarymanagementsystem.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@CrossOrigin
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
@PostMapping
    public Book createBook(@RequestBody Book book) {
    return bookService.createBook(book);
}
@PutMapping("/{id}")
public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
    return bookService.updateBook(id, book);
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteBook(@PathVariable Long id) {
    bookService.deleteBook(id);
    return ResponseEntity.ok("Book deleted successfully");
}

@GetMapping
public List<Book> findAllBooks() {
    return bookService.getAllBooks();
}

}
