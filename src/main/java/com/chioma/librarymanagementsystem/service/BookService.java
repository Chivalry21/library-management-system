package com.chioma.librarymanagementsystem.service;

import com.chioma.librarymanagementsystem.entity.Book;

import java.util.List;

public interface BookService {
        Book createBook(Book book);
        List<Book> getAllBooks();
        Book updateBook(Long id, Book book);
        void deleteBook(Long id);

}
