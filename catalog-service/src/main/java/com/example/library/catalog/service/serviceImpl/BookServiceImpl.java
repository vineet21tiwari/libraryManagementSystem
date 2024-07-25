package com.example.library.catalog.service.serviceImpl;

import com.example.library.catalog.service.DTO.BookRequestDto;
import com.example.library.catalog.service.DTO.BookResponseDto;
import com.example.library.catalog.service.entity.Book;
import com.example.library.catalog.service.exception.BookNotFoundException;
import com.example.library.catalog.service.exception.BookNotSaveException;
import com.example.library.catalog.service.repository.BookRepository;
import com.example.library.catalog.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(BookRequestDto bookRequestDto) throws BookNotSaveException {
        Book book = null;
        try {
            book = new Book();
            book.setDeleted(false);
//            book.setAuthor(bookRequestDto.getAuthor());
            book.setTitle(bookRequestDto.getTitle());
            book.setPrice(bookRequestDto.getPrice());
            book.setYearPublished(bookRequestDto.getYearPublished());
            return bookRepository.save(book);
        } catch (Exception e) {
            throw new BookNotSaveException("Book not saved");
        }
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = bookRepository.findByIsDeleted(false);
        return bookList.stream().collect(Collectors.toList());
    }

    @Override
    public String deleteBook(Integer id) throws BookNotFoundException {
        String message = "Delete Book Successfully";
        try {
            Book book = bookRepository.findById(id).orElseThrow();
            book.setDeleted(true);
            bookRepository.save(book);

        } catch (Exception exception) {
            throw new BookNotFoundException("Book Not found !!" + id);
        }
        return message;
    }

    @Override
    public BookResponseDto fetchBookByID(Integer id) throws BookNotFoundException {
        BookResponseDto bookResponseDto = new BookResponseDto();


        Book book = bookRepository.findByIdAndIsDeleted(id, false);

        if (book == null) {
            throw new BookNotFoundException("book not found with id : " + id);
        } else {
            bookResponseDto.setId(book.getId());
            bookResponseDto.setTitle(book.getTitle());
            bookResponseDto.setPrice(book.getPrice());
//            bookResponseDto.setAuthor(book.getAuthor());
            bookResponseDto.setYearPublished(book.getYearPublished());

        }
        return bookResponseDto;
    }

    @Override
    public Book updateBook(Integer id, BookRequestDto bookRequestDto) {

        Book book = bookRepository.findById(id).orElseThrow();

        if (bookRequestDto.getYearPublished() != null) {
            book.setYearPublished(bookRequestDto.getYearPublished());
        }
        if (bookRequestDto.getPrice() != null) {
            book.setPrice(bookRequestDto.getPrice());
        }
        if (bookRequestDto.getTitle() != null) {
            book.setTitle(bookRequestDto.getTitle());
        }


        bookRepository.save(book);
        return book;
    }

//    @Override
//    public Page<Book> getAllBooks_pagination(String title, String author, Double priceMin, Double priceMax, Integer yearMin, Integer yearMax, Boolean isDeleted, int page, int size) {
//        // Adjust page number for zero-indexed pagination
//        Pageable pageable = PageRequest.of(page - 1, size);
//
//        // If isDeleted is null, default to false
//        if (isDeleted == null) {
//            isDeleted = false;
//        }
//
//        return bookRepository.findAllWithFilters(title, author, priceMin, priceMax,
//                yearMin, yearMax, isDeleted, pageable);
//    }

}
