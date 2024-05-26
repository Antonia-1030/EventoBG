package com.myapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Category")
public class Category extends AbstractEntity{
    @Column(nullable = false, length = 256)
    private String name;
}
