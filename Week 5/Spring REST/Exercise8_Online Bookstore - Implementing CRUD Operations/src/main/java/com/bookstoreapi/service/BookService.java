package com.example.bookstore.service;

import com.example.bookstore.dto.BookDTO;

import java.util.List;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);

    BookDTO getBookById(Long id);

    List<BookDTO> getAllBooks();

    BookDTO updateBook(Long id, BookDTO bookDTO);

    void deleteBook(Long id);
}
