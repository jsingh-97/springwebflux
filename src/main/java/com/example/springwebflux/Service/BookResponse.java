package com.example.springwebflux.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
public class BookResponse {
    private int id;
    private String name;
    private int pageCount;
    public int authorId;
    private int count;

}
