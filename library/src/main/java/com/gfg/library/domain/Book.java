package com.gfg.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String id;

    private String title;

    private String author;

    private String genre;

    private Double rating;

    private Double cost;

    private List<Review> reviewList;

    private Integer year;

}
