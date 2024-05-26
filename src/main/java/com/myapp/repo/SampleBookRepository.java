package com.myapp.repo;


import com.myapp.models.SampleBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SampleBookRepository extends JpaRepository<SampleBook, Long>, JpaSpecificationExecutor<SampleBook> {

}
