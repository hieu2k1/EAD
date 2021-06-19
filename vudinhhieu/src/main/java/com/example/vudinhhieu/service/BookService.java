package com.example.vudinhhieu.service;

import com.example.vudinhhieu.entity.BookEntity;

import java.util.List;

public interface BookService {
    List<BookEntity> getAllBook();
    List<BookEntity> find(String name);
    BookEntity createBookEntity(BookEntity bookEntity);

    BookEntity create(BookEntity bookEntity);
}
