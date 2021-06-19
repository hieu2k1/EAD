package com.example.vudinhhieu.service;

import com.example.vudinhhieu.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService{

    @Autowired
    PublisherRepo publisherRepo;

    @Override
    public List<PublisherRepo> getAllPublisher() {
        return publisherRepo.findAll();
    }
}
