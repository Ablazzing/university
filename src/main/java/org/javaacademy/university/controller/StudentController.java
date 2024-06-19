package org.javaacademy.university.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.university.dto.StudentDto;
import org.javaacademy.university.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/findByName")
    public List<StudentDto> findByName(@RequestParam String firstName, @RequestParam String lastName) {
        return studentService.findByFirstName(firstName, lastName);
    }
}
