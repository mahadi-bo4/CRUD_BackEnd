package com.example.studentcrud.Service;

import com.example.studentcrud.DTO.StudentDTO;
import com.example.studentcrud.Model.Student;
import com.example.studentcrud.Repository.StudentRepo;
import com.example.studentcrud.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    public void save(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setRoll(studentDTO.getRoll());
        student.setCollegeName(studentDTO.getCollegeName());
        studentRepo.save(student);

    }

    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    public Student findById(Integer id){
        Optional <Student> existById= studentRepo.findById(id);
        if(existById.isPresent()){
            return existById.get();
        }
        throw new NotFoundException("Student with id " + id + " not found");
    }

    public String deleteStudent(Integer id){
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "Student details deleted successfully";
        }
        throw new NotFoundException("Student with id " + id + " not found");
    }

    public String updateStudent(Integer id,
                                StudentDTO studentDTO){

        Optional <Student> studentExist = studentRepo.findById(id);
        if(studentExist.isPresent()) {
            Student student = studentExist.get();
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
            student.setRoll(studentDTO.getRoll());
            student.setCollegeName(studentDTO.getCollegeName());
            studentRepo.save(student);
            return "Student updated successfully";
        }

        throw new NotFoundException("Student with id " + id + " not found");
    }
}
