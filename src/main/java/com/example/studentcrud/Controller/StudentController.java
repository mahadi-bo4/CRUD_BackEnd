package com.example.studentcrud.Controller;

import com.example.studentcrud.DTO.StudentDTO;
import com.example.studentcrud.Model.Student;
import com.example.studentcrud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

//    @Autowired
//    private StudentDTO studentDTO;

    @Autowired
    private StudentService studentService;

    @PostMapping
    public String saveStudent(@RequestBody StudentDTO studentDTO){
        studentService.save(studentDTO);
        return "Student saved successfully";
    }

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAllStudent();
    }

    @GetMapping("{id}")
    public Student getSingleStu(@PathVariable Integer id){
        return studentService.findById(id);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("{id}")
    public String update(@PathVariable Integer id,
                         @RequestBody StudentDTO studentDTO){

        return studentService.updateStudent(id,studentDTO);
    }
}
