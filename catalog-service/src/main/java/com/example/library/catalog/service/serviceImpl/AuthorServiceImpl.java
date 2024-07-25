package com.example.library.catalog.service.serviceImpl;

import com.example.library.catalog.service.DTO.AuthorRequest;
import com.example.library.catalog.service.DTO.AuthorResponse;
import com.example.library.catalog.service.entity.Author;
import com.example.library.catalog.service.exception.AuthorDeleted;
import com.example.library.catalog.service.exception.AuthorNotFoundException;
import com.example.library.catalog.service.repository.AuthorRepository;
import com.example.library.catalog.service.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);
    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void deleteById(Integer id) {
        try {
            authorRepository.deleteById(id);
        } catch (Exception ex) {
            throw new AuthorDeleted("author deleted successfully : " + id);
        }

    }

    @Override
    public Author updateAuthor(Integer id, AuthorRequest authorRequest) {
        Author author = authorRepository.findById(id).orElseThrow();
        author.setFirstName(authorRequest.getFirstName());
        author.setLastName(authorRequest.getLastName());
        return author;
    }

    @Override
    public AuthorResponse getAuthorById(Integer id) {
        AuthorResponse authorResponse = new AuthorResponse();

        Author author = authorRepository.findById(id).orElseThrow();

        if (author == null) {
            throw new AuthorNotFoundException("author not found with id :  " + id);
        } else {
            authorResponse.setId(author.getId());
            authorResponse.setFirstName(author.getFirstName());
            authorResponse.setLastName(author.getLastName());
        }
        return authorResponse;
    }

    @Override
    public List<Author> getAllAuthors() {
        List<Author> authorList = authorRepository.findAll();
        return authorList.stream().toList();
    }

    @Override
    public Author createAuthor(AuthorRequest authorRequest) {
        Author author = new Author();
        author.setFirstName(authorRequest.getFirstName());
        author.setLastName(authorRequest.getLastName());
        return authorRepository.save(author);
    }
}
