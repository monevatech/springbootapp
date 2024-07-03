package com.example.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        return List.of(new Student("Crispus", "Munene", 23, "mwangikriss356@gmail.com"),
                new Student("Shanaya","Wairimu",1,"shanayawairimu@gmail.com"));
    }
}
