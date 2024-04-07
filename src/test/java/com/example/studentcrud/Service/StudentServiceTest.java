package com.example.studentcrud.Service;

import com.example.studentcrud.DTO.StudentDTO;
import com.example.studentcrud.Model.Student;
import com.example.studentcrud.Repository.StudentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @InjectMocks
    private StudentService underTest;

    @Mock
    private StudentRepo studentRepo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_successfully_save_a_student() {
        //given
        StudentDTO studentDTO = new StudentDTO(
                "Mahadi",
                "mahadi@mail.com",
                1,
                "MH college"
        );

        //when
        underTest.save(studentDTO);
        //then
        verify(studentRepo, times(1)).save(any(Student.class));
    }



    @Test
    @Disabled
    void updateStudent() {
    }
}