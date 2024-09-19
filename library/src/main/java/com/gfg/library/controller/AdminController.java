package com.gfg.library.controller;

import com.gfg.library.domain.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @PostMapping("/admin/book")
    public void createBook(@RequestBody Book book) {

    }

    @PutMapping("/admin/book")
    public Book updateBook(@RequestBody Book book) {
        return null;
    }

    @DeleteMapping("/admin/book")
    public void deleteBook(@RequestParam String id) {
        //ex: /admin/book/?id=1
    }
}
