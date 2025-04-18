package com.cource.repository;

import com.cource.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourceRepository extends JpaRepository<Course, Long> {
}
