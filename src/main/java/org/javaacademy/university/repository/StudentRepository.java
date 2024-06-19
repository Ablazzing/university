package org.javaacademy.university.repository;

import org.javaacademy.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "select * from student where first_name = :firstName and last_name = :lastName",
            nativeQuery = true)
    List<Student> findAllByFirstNameNotAndLastNameNot(String firstName, String lastName);
}
