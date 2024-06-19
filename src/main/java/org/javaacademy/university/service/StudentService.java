package org.javaacademy.university.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.javaacademy.university.dto.StudentDto;
import org.javaacademy.university.entity.Student;
import org.javaacademy.university.entity.StudentBook;
import org.javaacademy.university.mapper.StudentMapper;
import org.javaacademy.university.repository.StudentBookRepository;
import org.javaacademy.university.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentBookRepository studentBookRepository;
    private final StudentMapper studentMapper;

    @PostConstruct
    public void init() {
        Student molodyko = Student.builder()
                .firstName("Yuri")
                .lastName("Molodyko")
                .build();

        Student ivanov = Student.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .build();

        StudentBook studentBook = new StudentBook("12345", molodyko);

        studentRepository.saveAll(List.of(molodyko, ivanov));
        studentBookRepository.save(studentBook);
    }

    public List<StudentDto> findAll() {
         return studentMapper.convertToDto(studentRepository.findAll());
    }

    public List<StudentDto> findByFirstName(String firstName, String lastName) {
        return studentMapper.convertToDto(studentRepository.findAllByFirstNameNotAndLastNameNot(firstName, lastName));
    }
}
