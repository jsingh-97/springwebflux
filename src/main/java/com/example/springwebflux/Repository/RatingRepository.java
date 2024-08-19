package com.example.springwebflux.Repository;

import com.example.springwebflux.Model.Rating;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends R2dbcRepository<Rating, Integer> {
}
