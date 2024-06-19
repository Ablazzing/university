package org.javaacademy.university.mapper;

import org.javaacademy.university.dto.StudentDto;
import org.javaacademy.university.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {StudentBookMapper.class})
public interface StudentMapper {
    @Mapping(target = "studentBookDto", source = "studentBook")
    StudentDto convertToDto(Student student);

    List<StudentDto> convertToDto(List<Student> students);
}
