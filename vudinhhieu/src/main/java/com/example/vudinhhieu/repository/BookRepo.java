package com.example.vudinhhieu.repository;

import com.example.vudinhhieu.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<BookEntity,Integer> {
    List<BookEntity> finAllByName(String Name);
}
