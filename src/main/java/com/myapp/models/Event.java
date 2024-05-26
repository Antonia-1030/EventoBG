package com.myapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Event")
public class Event extends AbstractEntity{
    @Lob
    @Column(length = 1000000)
    private byte[] image;
    @Column(nullable = false,length = 256)
    private String name;
    @Column(nullable = false,length = 256)
    private String author;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Category_ID")
    @NotNull(message = "Choose category")
    private Category categoryList;
    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;
    @Column(nullable = false,length = 30)
    private String isbn;

    private Double price;
}
