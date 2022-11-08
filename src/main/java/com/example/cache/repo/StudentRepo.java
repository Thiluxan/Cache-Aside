package com.example.cache.repo;

import com.example.cache.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
