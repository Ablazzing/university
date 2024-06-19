package org.javaacademy.university.mapper;

import org.javaacademy.university.dto.StudentBookDto;
import org.javaacademy.university.entity.StudentBook;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentBookMapper {

    StudentBookDto convertToDto(StudentBook entity);
}
