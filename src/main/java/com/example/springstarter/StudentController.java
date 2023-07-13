package com.example.springstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @RequestMapping
    public List<String> findAllStudenst(){
        return List.of(
                "Sroerun",
                "Hello World from Sprint Boot Starter"
        );
    }
}
