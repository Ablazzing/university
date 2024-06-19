package org.javaacademy.university.dto;

import lombok.Data;

@Data
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private StudentBookDto studentBookDto;
}
