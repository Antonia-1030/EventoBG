package com.myapp.services;

import com.myapp.models.Event;
import com.myapp.models.SampleBook;
import com.myapp.repo.EventRepo;
import com.myapp.repo.SampleBookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {
    private final EventRepo repository;

    public EventService(EventRepo repository) {
        this.repository = repository;
    }

    public Optional<Event> get(Long id) {
        return repository.findById(id);
    }

    public Event update(Event entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Event> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Event> list(Pageable pageable, Specification<Event> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }
}
