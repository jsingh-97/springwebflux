package com.example.springwebflux.Model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;

@Table("rating")
@Getter
@Setter
public class Rating {
    @Id
    private int id;
    @Column("count")
    private int count;

}