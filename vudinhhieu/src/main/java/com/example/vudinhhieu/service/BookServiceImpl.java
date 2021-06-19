package com.example.vudinhhieu.service;


import com.example.vudinhhieu.entity.BookEntity;
import com.example.vudinhhieu.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;


    @Override
    public List<BookEntity> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public List<BookEntity> find(String name) {
        return bookRepo.finAllByName(name);
    }
    @Override
    public BookEntity createBookEntity(BookEntity bookEntity)
    {
        return bookRepo.save(bookEntity);
    }

    @Override
    public BookEntity create(BookEntity bookEntity) {
        return bookEntity;
    }

}
