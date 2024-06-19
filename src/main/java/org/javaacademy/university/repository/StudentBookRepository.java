package org.javaacademy.university.repository;

import org.javaacademy.university.entity.StudentBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentBookRepository extends JpaRepository<StudentBook, Long> {
}
