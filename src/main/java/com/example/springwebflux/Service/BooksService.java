package com.example.springwebflux.Service;

import com.example.springwebflux.Model.Book;
import com.example.springwebflux.Model.Rating;
import com.example.springwebflux.Repository.RatingRepository;
import com.example.springwebflux.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;
    @Autowired
    RatingRepository ratingRepository;
    public Mono<BookResponse> getBookResponse(int id){
        Mono<Book> bookMono = booksRepository.findById(id);
        Mono<Rating> ratingMono = ratingRepository.findById(id);
        return Mono.zip(bookMono, ratingMono)
                .map(tuple -> {
                   Book book = tuple.getT1();
                   Rating rating = tuple.getT2();
                   BookResponse bookResponse = new BookResponse(book.getId(),
                           book.getName(), book.getPageCount(), book.getAuthorId(),
                           rating.getCount());
                   return bookResponse;
                });

    }
}
