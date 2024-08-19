package com.example.springwebflux;


import com.example.springwebflux.Service.BookResponse;
import com.example.springwebflux.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BooksController {
    @Autowired
    BooksService booksService;
    @GetMapping(value = "/book")
    private Mono<BookResponse> getBookById(@RequestParam Integer id){
        return booksService.getBookResponse(id);
    }
}
