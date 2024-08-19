package com.example.springwebflux.Model;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("books")
@Getter
public class Book  {
    @Id
    private int id;
    @Column("name")
    private String name;
    @Column("pagecount")
    private int pageCount;
    @Column("author_id")
    private int authorId;

    public Book() {
    }
}