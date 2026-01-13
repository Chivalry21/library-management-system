package com.chioma.librarymanagementsystem.service;

import com.chioma.librarymanagementsystem.entity.Book;
import com.chioma.librarymanagementsystem.exception.BookNotFoundException;
import com.chioma.librarymanagementsystem.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostMapping
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Long id, Book book) {
        Book existing = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        existing.setTitle(book.getTitle());
        existing.setAuthor(book.getAuthor());
        existing.setIsbn(book.getIsbn());
        existing.setPublishedDate(book.getPublishedDate());
        return bookRepository.save(existing);
    }

//    public void deleteBook(Long id) {
//        bookRepository.deleteById(id);
//    }
public void deleteBook(Long id) {
    if (!bookRepository.existsById(id)) {
        throw new BookNotFoundException(id);
    }
    bookRepository.deleteById(id);
}
}
