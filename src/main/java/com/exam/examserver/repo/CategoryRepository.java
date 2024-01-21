package com.exam.examserver.repo;

import com.exam.examserver.model.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
