package com.example.springstarter.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudenst(){
        return List.of(
                new Student(
                        "Sroeurn",
                        "Suon",
                        LocalDate.now(),
                        "Sroeurn@hotmail.com",
                        53
                ),
                new Student(
                        "Sroeurn 2",
                        "Suon",
                        LocalDate.now(),
                        "Sroeurn@hotmail.com",
                        52
                )
        );
    }
}
