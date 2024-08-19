package com.example.springwebflux.Repository;

import com.example.springwebflux.Model.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends R2dbcRepository<Book, Integer> {
}
