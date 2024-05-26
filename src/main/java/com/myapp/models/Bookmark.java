package com.myapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Bookmark")
public class Bookmark extends AbstractEntity{
    @Lob
    @Column(length = 1000000)
    private byte[] image;
    @Column(nullable = false,length = 256)
    private String name;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Event_ID")
    @NotNull(message = "Choose event")
    private Event event;
    private LocalDate startDate;
    private LocalDate endDate;
}
