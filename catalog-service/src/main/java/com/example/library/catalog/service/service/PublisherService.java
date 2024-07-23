package com.example.library.catalog.service.service;

import com.example.library.catalog.service.DTO.PublisherRequest;
import com.example.library.catalog.service.DTO.PublisherResponse;
import com.example.library.catalog.service.entity.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAllPublisher();

    PublisherResponse getPublisherByID(Integer id);

    Publisher createPublisher(PublisherRequest publisherRequest);

    Publisher updatePublisher(Integer id, PublisherRequest publisherRequest);

    void deletePublisher(Integer id);
}
