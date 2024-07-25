package com.example.library.catalog.service.service;

import com.example.library.catalog.service.DTO.BookRequestDto;
import com.example.library.catalog.service.DTO.BookResponseDto;
import com.example.library.catalog.service.entity.Book;
import com.example.library.catalog.service.exception.BookNotFoundException;
import com.example.library.catalog.service.exception.BookNotSaveException;

import java.util.List;

public interface BookService {

    Book createBook(BookRequestDto bookRequestDto) throws BookNotSaveException;

    List<Book> getAllBooks();

    String deleteBook(Integer id) throws BookNotFoundException;

    BookResponseDto fetchBookByID(Integer id) throws BookNotFoundException;

    Book updateBook(Integer id, BookRequestDto bookRequestDto);

//    Page<Book> getAllBooks_pagination(String title, String author, Double priceMin, Double priceMax, Integer yearMin, Integer yearMax, Boolean isDeleted, int page, int size);







//    Page<Book> getAllBooks_Pegination(String title,String author, Double minPrice, Double maxPrice, Integer minYear, Integer maxYear,
//                                      String sortBy, int page, int size);

//    List<Book> fetchBookByName(String author);
//
//    List<Book> getBooksByPrice(double price);
//
//    List<Book> getBooksByTitle(String title);
//
//    Page<Book> getAllBooks(int page, int size);
}
