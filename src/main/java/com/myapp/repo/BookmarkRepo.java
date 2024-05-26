package com.myapp.repo;

import com.myapp.models.Bookmark;
import com.myapp.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface BookmarkRepo extends JpaRepository<Bookmark, Long>, JpaSpecificationExecutor<Bookmark> {
    List<Bookmark> findById(Bookmark value);
}
