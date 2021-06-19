package com.example.vudinhhieu.controller;

import com.example.vudinhhieu.entity.BookEntity;
import com.example.vudinhhieu.entity.PublisherEntity;
import com.example.vudinhhieu.service.BookService;
import com.example.vudinhhieu.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    PublisherService publisherService;

    @GetMapping({"/","/index"})
    public String Index(Model model){
        List<BookEntity> bookEntityLis = bookService.getAllBook();
        model.addAttribute("book",bookEntityLis);
        return "index";
    }

    @GetMapping({"/create"})
    public String Add(Model model){
        model.addAttribute("book", new BookEntity());
        List<PublisherEntity> publishers = publisherService.getAllPublisher();
        model.addAttribute("publishers",publishers);
        return "create";
    }


    @PostMapping(value = "/add")
    public String AddBook(@ModelAttribute BookEntity bookEntity, Model model){
        bookService.create(bookEntity);
        return "redirect:/index";
    }

}
