package com.example.library.catalog.service.Controller;

import com.example.library.catalog.service.DTO.AuthorRequest;
import com.example.library.catalog.service.DTO.AuthorResponse;
import com.example.library.catalog.service.entity.Author;
import com.example.library.catalog.service.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-author")
public class AuthorController {

    private AuthorService authorService;

    Logger logger = LoggerFactory.getLogger(AuthorController.class);


    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorResponse getAuthorById(@PathVariable Integer id) {
        return authorService.getAuthorById(id);

    }

    @PostMapping
    public Author createAuthor(@RequestBody AuthorRequest authorRequest) {
        return authorService.createAuthor(authorRequest);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable Integer id, @RequestBody AuthorRequest authorRequest) {
        return authorService.updateAuthor(id, authorRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        authorService.deleteById(id);

    }

}
