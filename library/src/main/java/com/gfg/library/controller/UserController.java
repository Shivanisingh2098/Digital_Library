package com.gfg.library.controller;

import com.gfg.library.domain.Book;
import com.gfg.library.domain.Review;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/book")
    public List<Book> getAllBook(){

        return null;
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") String bookid){

        return null;
    }

    @PostMapping("{bookId}/review")
    public void addReview(@PathVariable("bookId") String bookId, @RequestBody Review review){

    }
}
