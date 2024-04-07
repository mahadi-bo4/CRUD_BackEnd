package com.example.studentcrud.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private String email;
    private Integer roll;
    private String collegeName;
}
