package com.example.library.catalog.service.service;

import com.example.library.catalog.service.DTO.AuthorRequest;
import com.example.library.catalog.service.DTO.AuthorResponse;
import com.example.library.catalog.service.entity.Author;

import java.util.List;

public interface AuthorService {

    void deleteById(Integer id);

    Author updateAuthor(Integer id, AuthorRequest authorRequest);

    AuthorResponse getAuthorById(Integer id);

    List<Author> getAllAuthors();

    Author createAuthor(AuthorRequest authorRequest);
}
