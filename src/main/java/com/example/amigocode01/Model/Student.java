package com.example.amigocode01.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_email")
    private String email;

    @Column(name = "student_roll")
    private Integer roll;

    @Column(name = "college_name")
    private String collegeName;
}
