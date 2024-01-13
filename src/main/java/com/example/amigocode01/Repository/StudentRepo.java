package com.example.amigocode01.Repository;

import com.example.amigocode01.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
