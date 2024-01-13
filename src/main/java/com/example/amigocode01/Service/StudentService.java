package com.example.amigocode01.Service;

import com.example.amigocode01.DTO.StudentDTO;
import com.example.amigocode01.Model.Student;
import com.example.amigocode01.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return studentRepo.findById(id).get();
    }

    public String deleteStudent(Integer id){
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "Student details deleted successfully";
        }
        return "No student found";
    }

    public String updateStudent(Integer id,
                                StudentDTO studentDTO){

        Student student = studentRepo.findById(id).get();
        if(studentRepo.existsById(id)) {
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
            student.setRoll(studentDTO.getRoll());
            student.setCollegeName(studentDTO.getCollegeName());
            studentRepo.save(student);
            return "Student updated successfully";
        }

        return "Student not found";
    }
}
