package com.example.library.catalog.service.Controller;

import com.example.library.catalog.service.DTO.PublisherRequest;
import com.example.library.catalog.service.DTO.PublisherResponse;
import com.example.library.catalog.service.entity.Publisher;
import com.example.library.catalog.service.service.PublisherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publish")
public class PublisherController {
    Logger logger = LoggerFactory.getLogger(PublisherController.class);

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/allPublisher")
    public List<Publisher> getAllPublisher() {
        return publisherService.getAllPublisher();
    }

    @GetMapping("/fetchPublisher/{id}")
    public PublisherResponse getPublisherByID(@PathVariable Integer id) {
        return publisherService.getPublisherByID(id);
    }

    @PostMapping("/savePublisher")
    public Publisher createPublisher(@RequestBody PublisherRequest publisherRequest) {
        return publisherService.createPublisher(publisherRequest);
    }

    @PutMapping("/updatePublisher/{id}")
    public Publisher updatePublisher(@PathVariable Integer id, @RequestBody PublisherRequest publisherRequest) {
        return publisherService.updatePublisher(id, publisherRequest);
    }

    @DeleteMapping("/deletePublisher/{id}")
    public void deletePublisher(@PathVariable Integer id) {
        publisherService.deletePublisher(id);
    }

}
