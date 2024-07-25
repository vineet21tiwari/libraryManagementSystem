package com.example.library.catalog.service.serviceImpl;

import com.example.library.catalog.service.DTO.PublisherRequest;
import com.example.library.catalog.service.DTO.PublisherResponse;
import com.example.library.catalog.service.entity.Publisher;
import com.example.library.catalog.service.exception.PublisherNotFoundException;
import com.example.library.catalog.service.repository.PublisherRepository;
import com.example.library.catalog.service.service.PublisherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublisherServiceImpl implements PublisherService {

    Logger logger = LoggerFactory.getLogger(PublisherServiceImpl.class);

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public List<Publisher> getAllPublisher() {
        List<Publisher> publisherList = publisherRepository.findAll();
        return publisherList.stream().collect(Collectors.toList());
    }

    @Override
    public PublisherResponse getPublisherByID(Integer id) {

        PublisherResponse publisherResponse = new PublisherResponse();
        Publisher publisher = publisherRepository.findById(id).orElseThrow();
        if (publisher == null) {
            throw new PublisherNotFoundException("publisher not found : " + id);
        } else {
            publisherResponse.setId(publisher.getId());
            publisherResponse.setName(publisher.getAddress());
            publisherResponse.setEmail(publisher.getEmail());
            publisherResponse.setAddress(publisher.getAddress());
        }
        return publisherResponse;

    }

    @Override
    public Publisher createPublisher(PublisherRequest publisherRequest) {
        Publisher publisher = new Publisher();
        publisher.setAddress(publisherRequest.getAddress());
        publisher.setName(publisherRequest.getAddress());
        publisher.setEmail(publisherRequest.getEmail());
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher updatePublisher(Integer id, PublisherRequest publisherRequest) {
        publisherRepository.findById(id).orElseThrow();
        Publisher publisher = new Publisher();
        publisher.setId(publisher.getId());
        publisher.setName(publisherRequest.getName());
        publisher.setAddress(publisherRequest.getAddress());
        publisher.setEmail(publisherRequest.getEmail());
        return publisherRepository.save(publisher);
    }

    @Override
    public void deletePublisher(Integer id) {
        try {
            publisherRepository.deleteById(id);
        } catch (Exception exception) {
            exception.getMessage();
        }

    }
}
