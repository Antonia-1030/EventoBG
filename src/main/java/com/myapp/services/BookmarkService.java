package com.myapp.services;


import com.myapp.models.Bookmark;
import com.myapp.models.SampleBook;
import com.myapp.repo.BookmarkRepo;
import com.myapp.repo.SampleBookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookmarkService {
    private final BookmarkRepo repository;
    private final SampleBookRepository eventRepo;

    public BookmarkService(BookmarkRepo repository, SampleBookRepository eventRepo) {
        this.repository = repository;
        this.eventRepo = eventRepo;
    }

    public Optional<Bookmark> get(Long id) {
        return repository.findById(id);
    }
    public Optional<SampleBook> getEvent(Long id){return eventRepo.findById(id);}

    public Bookmark update(Bookmark entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Bookmark> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Bookmark> list(Pageable pageable, Specification<Bookmark> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }
}
